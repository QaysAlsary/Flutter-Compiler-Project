package app;

import Classes.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

    public class Generator {
        String FileName = "";
        String Nav = "";
        String Content = "";
        String Contents = "";

        public Generator(String title){
            this.FileName = title;
        }

        public String navCode(){
            return this.Nav = "        <head>\n" +
                    "            <title>" + FileName + " details</title>\n" +
                    "        </head>\n" +
                    "        <body>\n";
        }

        public String columnCode(Column column){
            String content = "";
            content += "            <div>\n" ;
            content += contentCode(column.children);
            content += "\n      </div>\n";
          //  content += "            <a href=\\\"{$_GET[\"source\"]}\\\">back to list</a>\n           </div>\n";
            return content;
        }

        public String rowCode(Row row){
            String content = "";
            content += "            <div style=\\\"display:flex\\\">\n" ;
            content += contentCode(row.children);
            content += "\n      </div>\n";
            //content += "            <a href=\\\"{$_GET[\"source\"]}\\\">back to list</a>\n           </div>\n";
            return content;
        }

        public String contentCode(ArrayList<Widget> children){
            String code = "";
            for(Widget e :  children){
                if(e instanceof Text){
                    if(((Text) e).identifier != null){
                        code += "            <p style=\\\"font-size: " + ((Text) e).fontSize +"px;color: " + ((Text) e).color +"\\\">{$_GET[\""
                                + ((Text) e).identifier.id + "\"]}</p>\n" ;
                    }else{
                        code += "            <p style=\\\"font-size: " + ((Text) e).fontSize +"px;color: " + ((Text) e).color +"\\\">"
                                + ((Text) e).text + "</p>\n" ;
                    }
                }else if(e instanceof Image){
                    if(((Image) e).identifier != null){
                        code += "            <img src=\\\"{$_GET[\""+ ((Image) e).identifier.id + "\"]}\\\" width=\\\"" +
                                ((((Image) e).width != 0) ? ((Image) e).width + "px" : "100%") + "\\\"" +
                                " height=\\\""+ ((((Image) e).height != 0) ? ((Image) e).height + "px" : "100%")+ "\\\"" +">\n" ;
                    }else{
                        code += "            <img src=\\\""+ ((Image) e).path + "\\\" width=\\\"" + ((((Image) e).width != 0) ? ((Image) e).width + "px" : "100%")
                                + "\\\"" +
                                " height=\\\""+ ((((Image) e).height != 0) ? ((Image) e).height + "px" : "100%")+ "\\\"" +">\n" ;
                    }
                }else if(e instanceof Column){
                    code+=columnCode((Column)e);
                }else if(e instanceof Row){
                    code+=rowCode((Row)e);
                }
            }
            return code;
        }

        public String listViewCode(ListView listView){
            for(Widget w : listView.children){
                if(w instanceof Column){
                    this.Contents += "         <div>\n" ;
                        for(Widget e : ((Column) w).children){
                            if(e instanceof Text){
                                this.Contents += "            <p style=\\\"font-size: " + ((Text) e).fontSize +"px;color: " + ((Text) e).color +"\\\">" + ((Text) e).text + "</p>\n" ;
                            }else if(e instanceof Image){
                                this.Contents += "            <img src=\\\""+ ((Image) e).path + "\\\" width=\\\"" + ((((Image) e).width != 0) ? ((Image) e).width + "px" : "100%") + "\\\"" +
                                        " height=\\\""+ ((((Image) e).height != 0) ? ((Image) e).height + "px" : "100%") + "\\\"" +">\n"  ;
                            }
                            else if(e instanceof Column){
                                Contents+=columnCode((Column)e);
                            }else if(e instanceof Row){
                                Contents+=rowCode((Row)e);
                            }
                        }
                        this.Contents += "        </div>\n";
                }else if(w instanceof Row){
                    this.Contents += "         <div style=\\\"display:flex\\\">\n" ;
                    for(Widget e : ((Row) w).children){
                        if(e instanceof Text){
                            this.Contents += "            <p style=\\\"font-size: " + ((Text) e).fontSize +"px;color: " + ((Text) e).color +"\\\">" + ((Text) e).text + "</p>\n" ;
                        }else if(e instanceof Image){
                            this.Contents += "            <img src=\\\""+ ((Image) e).path + "\\\" width=\\\"" + ((((Image) e).width != 0) ? ((Image) e).width + "px" : "100%") + "\\\"" +
                                    " height=\\\""+ ((((Image) e).height != 0) ? ((Image) e).height + "px" : "100%") + "\\\"" +">\n"  ;
                        }
                        else if(e instanceof Column){
                            Contents+=columnCode((Column)e);
                        }else if(e instanceof Row){
                            Contents+=rowCode((Row)e);
                        }
                    }
                    this.Contents += "        </div>\n";
                }else if(w instanceof InkWell){

                    this.Contents +=  "     <div>\n       <a href=\\\"" + ((InkWell) w).navigator.distClass + ".php?n=" +
                            ((InkWell) w).navigator.title + "&p=" + ((InkWell) w).navigator.image +
                            "&description=" + ((InkWell) w).navigator.description+"&source=" + this.FileName +".php\\\">" + divCode( ((InkWell) w).widget) + "</a>\n" +
                            "        </div>\n";
                }
            }
            return this.Contents;
        }

        public String divCode(Widget widget){
            String contents = "";
            if(widget instanceof Column) {
                contents += "         <div>\n" ;
                for(Widget e :  ((Column) widget).children){
                    if(e instanceof Text){
                        contents += "            <p style=\\\"font-size: " + ((Text) e).fontSize +"px;color: " + ((Text) e).color +"\\\">" + ((Text) e).text + "</p>\n" ;
                    }else if(e instanceof Image){
                        contents += "            <img src=\\\""+ ((Image) e).path + "\\\" width=\\\"" + ((((Image) e).width != 0) ? ((Image) e).width + "px" : "100%") + "\\\"" +
                                " height=\\\""+ ((((Image) e).height != 0) ? ((Image) e).height + "px" : "100%") + "\\\"" +">\n"  ;
                    }
                }
            }
            else if(widget instanceof Row){
                contents += "         <div style=\\\"display:flex\\\">\n" ;
                for(Widget e :  ((Row) widget).children){
                    if(e instanceof Text){
                        contents += "            <p style=\\\"font-size: " + ((Text) e).fontSize +"px;color: " + ((Text) e).color +"\\\">" + ((Text) e).text + "</p>\n" ;
                    }else if(e instanceof Image){
                        contents += "            <img src=\\\""+ ((Image) e).path + "\\\" width=\\\"" + ((((Image) e).width != 0) ? ((Image) e).width + "px" : "100%") + "\\\"" +
                                " height=\\\""+ ((((Image) e).height != 0) ? ((Image) e).height + "px" : "100%") + "\\\"" +">\n"  ;
                    }
                }
            }
          //  contents += "        </div>\n";
            return contents;
        }

        public void generateForWidget(Widget widget){
            PrintWriter writer;
            this.Nav = navCode();

            if(widget instanceof Column)
              this.Content = columnCode((Column)widget);
            else if(widget instanceof Row)
                this.Content = rowCode((Row)widget);
            else if(widget instanceof ListView)
                this.Content = listViewCode((ListView)widget);

            try{
                File file = new File("C:\\xampp\\htdocs\\generatedPHP\\" + this.FileName + ".php");
                writer = new PrintWriter(file);
            }catch (FileNotFoundException e){
                throw new RuntimeException(e);
            }
            writer.println("<?php\n echo \"<!DOCTYPE html>\n" +
                    "   <html>\n" +
                    this.Nav + "\n\n" + this.Content +
                    "       </body>\n   </html>\" ;\n?>"
            );
            writer.close();
        }

//        public void generateForListView(ListView listView){
//            PrintWriter writer;
//            this.Nav = navCode();
//            this.Contents = listViewCode(listView);
//            try{
//                File file = new File("C:\\xampp\\htdocs\\generatedPHP\\" + this.FileName + ".php");
//                writer = new PrintWriter(file);
//            }catch (FileNotFoundException e){
//                throw new RuntimeException(e);
//            }
//            writer.println("<?php\n echo \"<!DOCTYPE html>\n" +
//                    "   <html>\n" +
//                    this.Nav + "\n\n" + this.Contents +
//                    "       </body>\n   </html> \" ; \n?>"
//            );
//            writer.close();
//        }
    }
