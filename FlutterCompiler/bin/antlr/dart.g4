grammar dart;

@header{
    package antlr;
}

//PARSER
prog : (widget_class | meth |class )*                                     #Program;


// widget class

widget_class : CLASS ID 'extends' 'StatelessWidget' '{'
   decl*
 '@override'
 'Widget' 'build' '(' 'BuildContext' 'context' ')' '{'
 'return' widget ';'
 '}' '}'        #widgetClass;


    //class rule
class : CLASS  ID '{' (decl | meth)* '}'                   #Classes;

    //method rule
meth : (TYPE | ID)  ID '(' (((TYPE | ID)  ID) (',' (TYPE | ID)  ID)*)? ')' '{' stat* RETURN (expression | widget)? ';' '}'        #Method;

    //statment rule
stat
     : assign                                              # AssignStat
     | decl                                                # DeclareStat
     | 'print' '(' ((expression | functionCall | objectFunctionCall) (',' (expression | functionCall | objectFunctionCall))*)*  ')' ';'   # printOutput
     | if                                                  # IfStat
     | for                                                 # ForStat
     | while                                               # WhileStat
     | functionCall                                        #CallingFunctionStat
     | objectFunctionCall                                  #CallingFuncitonFromObjectStat
     | declareObject                                       #DeclaringObjectStat
     | instanObject                                        #InstantiatingObjectStat
     ;

    //declaration rule
decl : TYPE ID ('=' expression)? ';'                      #Declaration;

    //assignment rule
assign : ID '=' expression ';'                             #Assignment;

    //if rule
if : IF '(' cond ((OR | AND) cond)* ')' ('{' stat* '}' | stat) (ELSE stat | ELSE '{' stat* '}')?    #IfCondition;

    //for rule
for : FOR '(' ID '=' expression ';'  ID ('<' | '<=' | '>' | '>=') expression ';' ID '=' expression ')' '{' stat* '}' #ForLoop;

    //while rule
while : WHILE '(' cond ((OR | AND) cond)* ')' '{' stat* '}'     #WhileLoop;

    //calling function rule
functionCall : ID '(' ((expression | widget)(',' (expression | widget))*)* ')'           #CallingFunction;

    //calling function from object rule
objectFunctionCall : ID '.' functionCall                        #CallingFuncitonFromObject;

    //declare object
declareObject : ID ID ('=' instanObject | ';')                      #DeclaringObject;

    //instantiat object
instanObject : NEW ID '(' ((expression | functionCall | objectFunctionCall) (',' (expression | functionCall | objectFunctionCall))*)* ')' ';'  #InstantiatingObject;

    //condition rule
cond : expression ('==' | '>=' | '<=' | '!=' | '>' | '<') expression     #Condition;

    //expression rules
expression
    : '(' expression ')'                # parenExpression
    | expression '*' expression         # multiplication
    | expression '/' expression         # divide
    | expression '+' expression         # addition
    | expression '-' expression         # subtract
    | STRING                            # string
    | ID                                # identifier
    | INT                               # integer
    | BOOL                              # bool
    | FLOAT                             # float
    ;

//parser rules for flutter

// widget rule
widget
  : //stateless
   material
  | listView
  | column
  | row
  | scaffold
  | appBar
  | body
  | inkWell
  | text
  | image
  ;

// stateless widget rule
//stateless
//  : 'class' ID 'extends' 'StatelessWidget' '{' 'const' ID '({' 'Key' '?' 'key' '})' ':' 'super' '(' 'key' ':' 'key' ')' ';' #statelessWidget
//  ;


// navigator
navigator
  : 'Navigator.push' '(' 'context' ',' 'MaterialPageRoute' '(' 'builder' ':' '(' 'BuildContext' 'context' ')'
  '=>'  ID '(' STRING ',' STRING ',' STRING  ')' ')' ')' ';'    #navigatorWidget
  ;


// scaffold rule
scaffold
  : 'Scaffold' '(' 'appBar' ':' appBar ',' 'body' ':' body ')' #scaffoldWidget
  ;

// app bar rule
appBar
  : 'AppBar' '(' 'title' ':' text ')' #appBarWidget
  ;

// body rule
body
  : row
  | column
  | listView
  ;

// listView rule
listView
  : 'ListView' '(' 'children' ':' '[' widget (',' widget)* ']' ')' #listViewWidget
  ;

// inkwell rule
inkWell
  :'InkWell' '(' 'onTap' ':' '(' ')' '{' navigator '}' ',' 'child' ':' widget ')' #inkWellWidget
  ;



// row rule
row
  : 'Row' '(' 'children' ':' '[' widget (',' widget)* ']' ')' #rowWidget
  ;

// column rule
column
  : 'Column' '(' 'children' ':' '[' widget (',' widget)* ']' ')' #columnWidget
  ;

// text rule
text
  : 'Text' '(' expression (',' 'style' ':' 'TextStyle' '(' (((  'color' ':' 'Colors.' COLOR )|('fontSize' ':' INT) ) (( ',' 'color' ':' 'Colors.' COLOR )|(',' 'fontSize' ':' INT))? )? ')' )? ')' #textWidget
  ;

// image rule
image
  : 'Image' '(' 'image' ':' 'AssetImage' '(' expression ')' ((',' 'width' ':' INT | ',' 'height' ':' INT) (',' 'width' ':' INT | ',' 'height' ':' INT)?)?')' #imageWidget
  ;




// material app rule
material
  : 'MaterialApp' '(' 'home' ':' scaffold ')' #materialWidget
  ;

// LEXER
NEW : 'new';
RETURN : 'return';
IF : 'if';
ELSE : 'else';
FOR : 'for';
WHILE : 'while';
CLASS : 'class';
//OPEN_PRACTICE : '(';
//CLOSE_PRACTICE : ')';
TYPE   : 'int' | 'float' | 'bool' | 'string' | 'var' | 'char' | 'void';
COLOR : 'red' | 'green' | 'blue' | 'white' | 'black' | 'gray' | 'cyan' | 'yellow' | 'orange' ;
ID     : ('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z'| '0'..'9' | '_')*;
//PARAMS : '"' ('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z'| '0'..'9' | '_' | '/' | '\\' )* '"' ;
STRING : '"' (' '..'~')* '"';
BOOL : 'true' | 'false';
INT    : '0'..'9'+;
FLOAT : '0'..'9'+ ('.' '0'..'9'+)?;
SINGLE_LINE_COMMENT : '//' ~[\r\n]* ->skip;
MULTI_LINE_COMMENT  : '/*' ( MULTI_LINE_COMMENT | .)*? '*/' ->skip;
WS     : [ \t\n\r]+ -> skip ;
AND : '&&' ;
OR : '||' ;