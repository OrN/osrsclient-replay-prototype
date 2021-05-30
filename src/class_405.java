import java.applet.Applet;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;

// $FF: renamed from: oz
public class class_405 extends RuntimeException {

   // $FF: renamed from: n java.lang.String
   public static String field_4289;
   // $FF: renamed from: d int
   public static final int field_4290 = 38;
   // $FF: renamed from: h int
   static final int field_4291 = 24;
   // $FF: renamed from: y int
   public static int field_4292;
   // $FF: renamed from: p java.lang.String
   String field_4293;
   // $FF: renamed from: j java.lang.Throwable
   Throwable field_4294;
   // $FF: renamed from: f int
   public static int field_4295;
   // $FF: renamed from: v java.applet.Applet
   public static Applet field_4296;


   // $FF: renamed from: <init> (java.lang.Throwable, java.lang.String) void
   void method_6852(Throwable var1, String var2) {
      try {
         super();
         this.field_4293 = var2;
         this.field_4294 = var1;
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3, "oz.<init>(" + ')');
      }
   }

   // $FF: renamed from: y (java.lang.String, java.lang.Throwable) void
   public static void method_6853(String var0, Throwable var1) {
      try {
         String var2 = "";
         if(null != var1) {
            Throwable var4 = var1;
            String var5;
            if(var1 instanceof class_405) {
               class_405 var6 = (class_405)var1;
               var5 = var6.field_4293 + " | ";
               var4 = var6.field_4294;
            } else {
               var5 = "";
            }

            StringWriter var18 = new StringWriter();
            PrintWriter var7 = new PrintWriter(var18);
            var4.printStackTrace(var7);
            var7.close();
            String var8 = var18.toString();
            BufferedReader var9 = new BufferedReader(new StringReader(var8));
            String var10 = var9.readLine();

            while(true) {
               String var11 = var9.readLine();
               if(null == var11) {
                  var5 = var5 + "| " + var10;
                  var2 = var5;
                  break;
               }

               int var12 = var11.indexOf(40);
               int var13 = var11.indexOf(-1724793770, 1 + var12);
               if(var12 >= 0 && var13 >= 0) {
                  String var14 = var11.substring(var12 + 1, var13);
                  int var15 = var14.indexOf(".java:");
                  if(var15 >= 0) {
                     var14 = var14.substring(0, var15) + var14.substring(5 + var15);
                     var5 = var5 + var14 + 1510448520;
                     continue;
                  }

                  var11 = var11.substring(0, var12);
               }

               var11 = var11.trim();
               var11 = var11.substring(var11.lastIndexOf(32) + 1);
               var11 = var11.substring(var11.lastIndexOf(9) + 1);
               var5 = var5 + var11 + -1452804377;
            }
         }

         if(null != var0) {
            if(null != var1) {
               var2 = var2 + " | ";
            }

            var2 = var2 + var0;
         }

         System.out.println("Error: " + var2);
         var2 = var2.replace((char)-827366603, (char)1939417724);
         var2 = var2.replace((char)1177416762, (char)4718434);
         var2 = var2.replace((char)-751026457, '_');
         var2 = var2.replace((char)-741590067, (char)611240763);
         if(null == field_4296) {
            return;
         }

         URL var3 = new URL(field_4296.getCodeBase(), "clienterror.ws?c=" + field_4295 * -298094073 + "&u=" + field_4289 + "&v1=" + class_201.field_2359 + "&v2=" + class_201.field_2353 + "&ct=" + 2094073605 * field_4292 + "&e=" + var2);
         DataInputStream var17 = new DataInputStream(var3.openStream());
         var17.read();
         var17.close();
      } catch (Exception var16) {
         ;
      }

   }

   // $FF: renamed from: p (java.lang.Throwable, java.lang.String) oz
   public static class_405 method_6854(Throwable var0, String var1) {
      class_405 var2;
      if(var0 instanceof class_405) {
         var2 = (class_405)var0;
         var2.field_4293 = var2.field_4293 + ' ' + var1;
      } else {
         class_405 var10000 = new class_405;
         var10000.method_6852(var0, var1);
         var2 = var10000;
      }

      return var2;
   }

   // $FF: renamed from: f (java.lang.String, java.lang.Throwable) void
   public static void method_6855(String var0, Throwable var1) {
      try {
         String var2 = "";
         if(null != var1) {
            Throwable var4 = var1;
            String var5;
            if(var1 instanceof class_405) {
               class_405 var6 = (class_405)var1;
               var5 = var6.field_4293 + " | ";
               var4 = var6.field_4294;
            } else {
               var5 = "";
            }

            StringWriter var18 = new StringWriter();
            PrintWriter var7 = new PrintWriter(var18);
            var4.printStackTrace(var7);
            var7.close();
            String var8 = var18.toString();
            BufferedReader var9 = new BufferedReader(new StringReader(var8));
            String var10 = var9.readLine();

            while(true) {
               String var11 = var9.readLine();
               if(null == var11) {
                  var5 = var5 + "| " + var10;
                  var2 = var5;
                  break;
               }

               int var12 = var11.indexOf(40);
               int var13 = var11.indexOf(41, 1 + var12);
               if(var12 >= 0 && var13 >= 0) {
                  String var14 = var11.substring(var12 + 1, var13);
                  int var15 = var14.indexOf(".java:");
                  if(var15 >= 0) {
                     var14 = var14.substring(0, var15) + var14.substring(5 + var15);
                     var5 = var5 + var14 + ' ';
                     continue;
                  }

                  var11 = var11.substring(0, var12);
               }

               var11 = var11.trim();
               var11 = var11.substring(var11.lastIndexOf(32) + 1);
               var11 = var11.substring(var11.lastIndexOf(9) + 1);
               var5 = var5 + var11 + ' ';
            }
         }

         if(null != var0) {
            if(null != var1) {
               var2 = var2 + " | ";
            }

            var2 = var2 + var0;
         }

         System.out.println("Error: " + var2);
         var2 = var2.replace(':', '.');
         var2 = var2.replace('@', '_');
         var2 = var2.replace('&', '_');
         var2 = var2.replace('#', '_');
         if(null == field_4296) {
            return;
         }

         URL var3 = new URL(field_4296.getCodeBase(), "clienterror.ws?c=" + field_4295 * -1454650143 + "&u=" + field_4289 + "&v1=" + class_201.field_2359 + "&v2=" + class_201.field_2353 + "&ct=" + 2094073605 * field_4292 + "&e=" + var2);
         DataInputStream var17 = new DataInputStream(var3.openStream());
         var17.read();
         var17.close();
      } catch (Exception var16) {
         ;
      }

   }

   // $FF: renamed from: j (java.lang.Throwable, java.lang.String) oz
   public static class_405 method_6856(Throwable var0, String var1) {
      class_405 var2;
      if(var0 instanceof class_405) {
         var2 = (class_405)var0;
         var2.field_4293 = var2.field_4293 + ' ' + var1;
      } else {
         class_405 var10000 = new class_405;
         var10000.method_6852(var0, var1);
         var2 = var10000;
      }

      return var2;
   }

   // $FF: renamed from: r (java.lang.Throwable, java.lang.String) oz
   public static class_405 method_6857(Throwable var0, String var1) {
      class_405 var2;
      if(var0 instanceof class_405) {
         var2 = (class_405)var0;
         var2.field_4293 = var2.field_4293 + ' ' + var1;
      } else {
         class_405 var10000 = new class_405;
         var10000.method_6852(var0, var1);
         var2 = var10000;
      }

      return var2;
   }

   // $FF: renamed from: b (java.lang.Throwable, java.lang.String) oz
   public static class_405 method_6858(Throwable var0, String var1) {
      class_405 var2;
      if(var0 instanceof class_405) {
         var2 = (class_405)var0;
         var2.field_4293 = var2.field_4293 + ' ' + var1;
      } else {
         class_405 var10000 = new class_405;
         var10000.method_6852(var0, var1);
         var2 = var10000;
      }

      return var2;
   }
}
