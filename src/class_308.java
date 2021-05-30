import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;

// $FF: renamed from: jq
public class class_308 {

   // $FF: renamed from: n int
   static final int field_3735 = 8;
   // $FF: renamed from: f int
   public static final int field_3736 = 64;
   // $FF: renamed from: v int
   static final int field_3737 = 8;
   // $FF: renamed from: e int
   public static final int field_3738 = 18;


   // $FF: renamed from: v (java.lang.String, java.lang.Throwable, int) void
   public static void method_5523(String var0, Throwable var1, int var2) {
      try {
         try {
            String var3 = "";
            if(null != var1) {
               if(var2 <= 1824375293) {
                  return;
               }

               Throwable var5 = var1;
               String var6;
               if(var1 instanceof class_405) {
                  if(var2 <= 1824375293) {
                     throw new IllegalStateException();
                  }

                  class_405 var7 = (class_405)var1;
                  var6 = var7.field_4293 + " | ";
                  var5 = var7.field_4294;
               } else {
                  var6 = "";
               }

               StringWriter var20 = new StringWriter();
               PrintWriter var8 = new PrintWriter(var20);
               var5.printStackTrace(var8);
               var8.close();
               String var9 = var20.toString();
               BufferedReader var10 = new BufferedReader(new StringReader(var9));
               String var11 = var10.readLine();

               while(true) {
                  String var12 = var10.readLine();
                  if(null == var12) {
                     var6 = var6 + "| " + var11;
                     var3 = var6;
                     break;
                  }

                  int var13 = var12.indexOf(40);
                  int var14 = var12.indexOf(41, 1 + var13);
                  if(var13 >= 0) {
                     if(var2 <= 1824375293) {
                        throw new IllegalStateException();
                     }

                     if(var14 >= 0) {
                        if(var2 <= 1824375293) {
                           throw new IllegalStateException();
                        }

                        String var15 = var12.substring(var13 + 1, var14);
                        int var16 = var15.indexOf(".java:");
                        if(var16 >= 0) {
                           if(var2 <= 1824375293) {
                              throw new IllegalStateException();
                           }

                           var15 = var15.substring(0, var16) + var15.substring(5 + var16);
                           var6 = var6 + var15 + ' ';
                           continue;
                        }

                        var12 = var12.substring(0, var13);
                     }
                  }

                  var12 = var12.trim();
                  var12 = var12.substring(var12.lastIndexOf(32) + 1);
                  var12 = var12.substring(var12.lastIndexOf(9) + 1);
                  var6 = var6 + var12 + ' ';
               }
            }

            if(null != var0) {
               if(var2 <= 1824375293) {
                  throw new IllegalStateException();
               }

               if(null != var1) {
                  if(var2 <= 1824375293) {
                     return;
                  }

                  var3 = var3 + " | ";
               }

               var3 = var3 + var0;
            }

            System.out.println("Error: " + var3);
            var3 = var3.replace(':', '.');
            var3 = var3.replace('@', '_');
            var3 = var3.replace('&', '_');
            var3 = var3.replace('#', '_');
            if(null == class_405.field_4296) {
               if(var2 <= 1824375293) {
                  throw new IllegalStateException();
               }

               return;
            }

            URL var4 = new URL(class_405.field_4296.getCodeBase(), "clienterror.ws?c=" + class_405.field_4295 * -1454650143 + "&u=" + class_405.field_4289 + "&v1=" + class_201.javaVendor + "&v2=" + class_201.javaVersion + "&ct=" + 2094073605 * class_405.field_4292 + "&e=" + var3);
            DataInputStream var19 = new DataInputStream(var4.openStream());
            var19.read();
            var19.close();
         } catch (Exception var17) {
            ;
         }

      } catch (RuntimeException var18) {
         throw class_223.method_4281(var18, "jq.v(" + ')');
      }
   }

   // $FF: renamed from: <clinit> () void
   static {
      int var0 = 0;
      int var1 = 0;
      class_313[] var2 = class_227.method_4349(1606153053);

      for(int var3 = 0; var3 < var2.length; ++var3) {
         class_313 var4 = var2[var3];
         if(310151433 * var4.field_3760 > var0) {
            var0 = 310151433 * var4.field_3760;
         }

         if(-715016481 * var4.field_3763 > var1) {
            var1 = var4.field_3763 * -715016481;
         }
      }

   }

   // $FF: renamed from: <init> () void
   class_308() throws Throwable {
      super();
      try {
         throw new Error();
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1, "jq.<init>(" + ')');
      }
   }
}
