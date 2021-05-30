import java.util.Iterator;

// $FF: renamed from: mb
public class class_362 implements class_18 {

   // $FF: renamed from: p int
   int field_4013;
   // $FF: renamed from: v int
   static final int field_4014 = 0;
   // $FF: renamed from: f java.lang.String
   static final String field_4015 = "_";
   // $FF: renamed from: n java.lang.String
   static final String field_4016 = "\\.";
   // $FF: renamed from: rm bd
   static class_139 field_4017;
   // $FF: renamed from: j int
   int field_4018;
   // $FF: renamed from: y int
   int field_4019;
   // $FF: renamed from: em int
   static int field_4020;


   // $FF: renamed from: b (java.lang.String) void
   void method_6310(String var1) {
      if(var1.startsWith("1.")) {
         this.method_6312(var1, (byte)112);
      } else {
         this.method_6325(var1, -973414389);
      }

   }

   // $FF: renamed from: v (byte) my
   public class_30 method_59(byte var1) {
      try {
         byte var2;
         if(class_189.osName.startsWith("win")) {
            if(var1 == -1) {
               throw new IllegalStateException();
            }

            var2 = 1;
         } else if(class_189.osName.startsWith("mac")) {
            if(var1 == -1) {
               throw new IllegalStateException();
            }

            var2 = 2;
         } else if(class_189.osName.startsWith("linux")) {
            if(var1 == -1) {
               throw new IllegalStateException();
            }

            var2 = 3;
         } else {
            var2 = 4;
         }

         String var3;
         try {
            var3 = System.getProperty("os.arch").toLowerCase();
         } catch (Exception var27) {
            var3 = "";
         }

         String var4;
         try {
            var4 = System.getProperty("os.version").toLowerCase();
         } catch (Exception var26) {
            var4 = "";
         }

         String var5 = "Unknown";
         String var6 = "1.1";

         try {
            var5 = System.getProperty("java.vendor");
            var6 = System.getProperty("java.version");
         } catch (Exception var25) {
            ;
         }

         boolean var7;
         label244: {
            if(!var3.startsWith("amd64")) {
               if(var1 == -1) {
                  throw new IllegalStateException();
               }

               if(!var3.startsWith("x86_64")) {
                  var7 = false;
                  break label244;
               }

               if(var1 == -1) {
                  throw new IllegalStateException();
               }
            }

            var7 = true;
         }

         byte var8 = 0;
         if(1 == var2) {
            if(var1 == -1) {
               throw new IllegalStateException();
            }

            if(var4.indexOf("4.0") != -1) {
               if(var1 == -1) {
                  throw new IllegalStateException();
               }

               var8 = 1;
            } else if(var4.indexOf("4.1") != -1) {
               if(var1 == -1) {
                  throw new IllegalStateException();
               }

               var8 = 2;
            } else if(var4.indexOf("4.9") != -1) {
               if(var1 == -1) {
                  throw new IllegalStateException();
               }

               var8 = 3;
            } else if(var4.indexOf("5.0") != -1) {
               if(var1 == -1) {
                  throw new IllegalStateException();
               }

               var8 = 4;
            } else if(var4.indexOf("5.1") != -1) {
               if(var1 == -1) {
                  throw new IllegalStateException();
               }

               var8 = 5;
            } else if(var4.indexOf("5.2") != -1) {
               if(var1 == -1) {
                  throw new IllegalStateException();
               }

               var8 = 8;
            } else if(var4.indexOf("6.0") != -1) {
               if(var1 == -1) {
                  throw new IllegalStateException();
               }

               var8 = 6;
            } else if(var4.indexOf("6.1") != -1) {
               var8 = 7;
            } else if(var4.indexOf("6.2") != -1) {
               var8 = 9;
            } else if(var4.indexOf("6.3") != -1) {
               var8 = 10;
            } else if(var4.indexOf("10.0") != -1) {
               if(var1 == -1) {
                  throw new IllegalStateException();
               }

               var8 = 11;
            }
         } else if(var2 == 2) {
            if(var1 == -1) {
               throw new IllegalStateException();
            }

            if(var4.indexOf("10.4") != -1) {
               if(var1 == -1) {
                  throw new IllegalStateException();
               }

               var8 = 20;
            } else if(var4.indexOf("10.5") != -1) {
               if(var1 == -1) {
                  throw new IllegalStateException();
               }

               var8 = 21;
            } else if(var4.indexOf("10.6") != -1) {
               if(var1 == -1) {
                  throw new IllegalStateException();
               }

               var8 = 22;
            } else if(var4.indexOf("10.7") != -1) {
               if(var1 == -1) {
                  throw new IllegalStateException();
               }

               var8 = 23;
            } else if(var4.indexOf("10.8") != -1) {
               var8 = 24;
            } else if(var4.indexOf("10.9") != -1) {
               var8 = 25;
            } else if(var4.indexOf("10.10") != -1) {
               if(var1 == -1) {
                  throw new IllegalStateException();
               }

               var8 = 26;
            } else if(var4.indexOf("10.11") != -1) {
               if(var1 == -1) {
                  throw new IllegalStateException();
               }

               var8 = 27;
            } else if(var4.indexOf("10.12") != -1) {
               if(var1 == -1) {
                  throw new IllegalStateException();
               }

               var8 = 28;
            } else if(var4.indexOf("10.13") != -1) {
               if(var1 == -1) {
                  throw new IllegalStateException();
               }

               var8 = 29;
            }
         }

         byte var9;
         if(var5.toLowerCase().indexOf("sun") != -1) {
            if(var1 == -1) {
               throw new IllegalStateException();
            }

            var9 = 1;
         } else if(var5.toLowerCase().indexOf("microsoft") != -1) {
            if(var1 == -1) {
               throw new IllegalStateException();
            }

            var9 = 2;
         } else if(var5.toLowerCase().indexOf("apple") != -1) {
            if(var1 == -1) {
               throw new IllegalStateException();
            }

            var9 = 3;
         } else if(var5.toLowerCase().indexOf("oracle") != -1) {
            if(var1 == -1) {
               throw new IllegalStateException();
            }

            var9 = 5;
         } else {
            var9 = 4;
         }

         this.method_6311(var6, (byte)-33);
         int var11 = (int)(Runtime.getRuntime().maxMemory() / 1048576L) + 1;
         int var12;
         if(this.field_4019 * -1520925295 > 3) {
            if(var1 == -1) {
               throw new IllegalStateException();
            }

            var12 = Runtime.getRuntime().availableProcessors();
         } else {
            var12 = 0;
         }

         byte var13 = 0;
         String var14 = "";
         String var15 = "";
         String var16 = "";
         String var17 = "";
         String var18 = "";
         String var19 = "";
         int[] var24 = new int[3];
         class_30 var10000 = new class_30(var2, var7, var8, var9, this.field_4019 * -1520925295, this.field_4013 * -1280779565, this.field_4018 * 1746870345, false, var11, var12, var13, 0, var14, var15, var16, var17, 0, 0, 0, 0, var18, var19, var24, 0, "");
         return var10000;
      } catch (RuntimeException var28) {
         throw class_223.method_4281(var28, "mb.v(" + ')');
      }
   }

   // $FF: renamed from: n (java.lang.String, byte) void
   void method_6311(String var1, byte var2) {
      try {
         if(var1.startsWith("1.")) {
            if(var2 >= 2) {
               throw new IllegalStateException();
            }

            this.method_6312(var1, (byte)94);
         } else {
            this.method_6325(var1, -1652585717);
         }

      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3, "mb.n(" + ')');
      }
   }

   // $FF: renamed from: f (java.lang.String, byte) void
   void method_6312(String var1, byte var2) {
      try {
         String[] var3 = var1.split("\\.");

         try {
            this.field_4019 = Integer.parseInt(var3[1]) * -234169487;
            var3 = var3[2].split("_");
            this.field_4013 = Integer.parseInt(var3[0]) * 591170907;
            this.field_4018 = Integer.parseInt(var3[1]) * -378613255;
         } catch (Exception var5) {
            ;
         }

      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6, "mb.f(" + ')');
      }
   }

   // $FF: renamed from: s (java.lang.String) void
   void method_6313(String var1) {
      if(var1.startsWith("1.")) {
         this.method_6312(var1, (byte)93);
      } else {
         this.method_6325(var1, -1499135324);
      }

   }

   // $FF: renamed from: u (java.lang.String) void
   void method_6314(String var1) {
      String[] var2 = var1.split("\\.");

      try {
         this.field_4019 = Integer.parseInt(var2[1]) * -234169487;
         var2 = var2[2].split("_");
         this.field_4013 = Integer.parseInt(var2[0]) * 591170907;
         this.field_4018 = Integer.parseInt(var2[1]) * -378613255;
      } catch (Exception var4) {
         ;
      }

   }

   // $FF: renamed from: <init> () void
   public class_362() {
      super();
   }

   // $FF: renamed from: r (java.lang.String) void
   void method_6316(String var1) {
      if(var1.startsWith("1.")) {
         this.method_6312(var1, (byte)103);
      } else {
         this.method_6325(var1, -1943067595);
      }

   }

   // $FF: renamed from: r (byte) void
   static void method_6317(byte var0) {
      try {
         Iterator var1 = class_197.field_2334.iterator();

         while(var1.hasNext()) {
            if(var0 != 1) {
               throw new IllegalStateException();
            }

            class_101 var2 = (class_101)var1.next();
            var2.method_1890(1764151140);
         }

      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3, "mb.r(" + ')');
      }
   }

   // $FF: renamed from: o (java.lang.String) void
   void method_6318(String var1) {
      String[] var2 = var1.split("\\.");

      try {
         this.field_4019 = Integer.parseInt(var2[1]) * -234169487;
         var2 = var2[2].split("_");
         this.field_4013 = Integer.parseInt(var2[0]) * 591170907;
         this.field_4018 = Integer.parseInt(var2[1]) * -378613255;
      } catch (Exception var4) {
         ;
      }

   }

   // $FF: renamed from: j () my
   public class_30 method_61() {
      byte var1;
      if(class_189.osName.startsWith("win")) {
         var1 = 1;
      } else if(class_189.osName.startsWith("mac")) {
         var1 = 2;
      } else if(class_189.osName.startsWith("linux")) {
         var1 = 3;
      } else {
         var1 = 4;
      }

      String var2;
      try {
         var2 = System.getProperty("os.arch").toLowerCase();
      } catch (Exception var26) {
         var2 = "";
      }

      String var3;
      try {
         var3 = System.getProperty("os.version").toLowerCase();
      } catch (Exception var25) {
         var3 = "";
      }

      String var4 = "Unknown";
      String var5 = "1.1";

      try {
         var4 = System.getProperty("java.vendor");
         var5 = System.getProperty("java.version");
      } catch (Exception var24) {
         ;
      }

      boolean var6;
      if(!var2.startsWith("amd64") && !var2.startsWith("x86_64")) {
         var6 = false;
      } else {
         var6 = true;
      }

      byte var7 = 0;
      if(1 == var1) {
         if(var3.indexOf("4.0") != -1) {
            var7 = 1;
         } else if(var3.indexOf("4.1") != -1) {
            var7 = 2;
         } else if(var3.indexOf("4.9") != -1) {
            var7 = 3;
         } else if(var3.indexOf("5.0") != -1) {
            var7 = 4;
         } else if(var3.indexOf("5.1") != -1) {
            var7 = 5;
         } else if(var3.indexOf("5.2") != -1) {
            var7 = 8;
         } else if(var3.indexOf("6.0") != -1) {
            var7 = 6;
         } else if(var3.indexOf("6.1") != -1) {
            var7 = 7;
         } else if(var3.indexOf("6.2") != -1) {
            var7 = 9;
         } else if(var3.indexOf("6.3") != -1) {
            var7 = 10;
         } else if(var3.indexOf("10.0") != -1) {
            var7 = 11;
         }
      } else if(var1 == 2) {
         if(var3.indexOf("10.4") != -1) {
            var7 = 20;
         } else if(var3.indexOf("10.5") != -1) {
            var7 = 21;
         } else if(var3.indexOf("10.6") != -1) {
            var7 = 22;
         } else if(var3.indexOf("10.7") != -1) {
            var7 = 23;
         } else if(var3.indexOf("10.8") != -1) {
            var7 = 24;
         } else if(var3.indexOf("10.9") != -1) {
            var7 = 25;
         } else if(var3.indexOf("10.10") != -1) {
            var7 = 26;
         } else if(var3.indexOf("10.11") != -1) {
            var7 = 27;
         } else if(var3.indexOf("10.12") != -1) {
            var7 = 28;
         } else if(var3.indexOf("10.13") != -1) {
            var7 = 29;
         }
      }

      byte var8;
      if(var4.toLowerCase().indexOf("sun") != -1) {
         var8 = 1;
      } else if(var4.toLowerCase().indexOf("microsoft") != -1) {
         var8 = 2;
      } else if(var4.toLowerCase().indexOf("apple") != -1) {
         var8 = 3;
      } else if(var4.toLowerCase().indexOf("oracle") != -1) {
         var8 = 5;
      } else {
         var8 = 4;
      }

      this.method_6311(var5, (byte)-115);
      int var10 = (int)(Runtime.getRuntime().maxMemory() / 1048576L) + 1;
      int var11;
      if(this.field_4019 * -1520925295 > 3) {
         var11 = Runtime.getRuntime().availableProcessors();
      } else {
         var11 = 0;
      }

      byte var12 = 0;
      String var13 = "";
      String var14 = "";
      String var15 = "";
      String var16 = "";
      String var17 = "";
      String var18 = "";
      int[] var23 = new int[3];
      class_30 var10000 = new class_30(var1, var6, var7, var8, this.field_4019 * -1520925295, this.field_4013 * 176682914, this.field_4018 * 1746870345, false, var10, var11, var12, 0, var13, var14, var15, var16, 0, 0, 0, 0, var17, var18, var23, 0, "");
      return var10000;
   }

   // $FF: renamed from: d (java.lang.String) void
   void method_6319(String var1) {
      if(var1.startsWith("1.")) {
         this.method_6312(var1, (byte)109);
      } else {
         this.method_6325(var1, -1778320114);
      }

   }

   // $FF: renamed from: l (java.lang.String) void
   void method_6320(String var1) {
      String[] var2 = var1.split("\\.");

      try {
         this.field_4019 = Integer.parseInt(var2[1]) * -234169487;
         var2 = var2[2].split("_");
         this.field_4013 = Integer.parseInt(var2[0]) * 591170907;
         this.field_4018 = Integer.parseInt(var2[1]) * -378613255;
      } catch (Exception var4) {
         ;
      }

   }

   // $FF: renamed from: p () my
   public class_30 method_60() {
      byte var1;
      if(class_189.osName.startsWith("win")) {
         var1 = 1;
      } else if(class_189.osName.startsWith("mac")) {
         var1 = 2;
      } else if(class_189.osName.startsWith("linux")) {
         var1 = 3;
      } else {
         var1 = 4;
      }

      String var2;
      try {
         var2 = System.getProperty("os.arch").toLowerCase();
      } catch (Exception var26) {
         var2 = "";
      }

      String var3;
      try {
         var3 = System.getProperty("os.version").toLowerCase();
      } catch (Exception var25) {
         var3 = "";
      }

      String var4 = "Unknown";
      String var5 = "1.1";

      try {
         var4 = System.getProperty("java.vendor");
         var5 = System.getProperty("java.version");
      } catch (Exception var24) {
         ;
      }

      boolean var6;
      if(!var2.startsWith("amd64") && !var2.startsWith("x86_64")) {
         var6 = false;
      } else {
         var6 = true;
      }

      byte var7 = 0;
      if(1 == var1) {
         if(var3.indexOf("4.0") != -1) {
            var7 = 1;
         } else if(var3.indexOf("4.1") != -1) {
            var7 = 2;
         } else if(var3.indexOf("4.9") != -1) {
            var7 = 3;
         } else if(var3.indexOf("5.0") != -1) {
            var7 = 4;
         } else if(var3.indexOf("5.1") != -1) {
            var7 = 5;
         } else if(var3.indexOf("5.2") != -1) {
            var7 = 8;
         } else if(var3.indexOf("6.0") != -1) {
            var7 = 6;
         } else if(var3.indexOf("6.1") != -1) {
            var7 = 7;
         } else if(var3.indexOf("6.2") != -1) {
            var7 = 9;
         } else if(var3.indexOf("6.3") != -1) {
            var7 = 10;
         } else if(var3.indexOf("10.0") != -1) {
            var7 = 11;
         }
      } else if(var1 == 2) {
         if(var3.indexOf("10.4") != -1) {
            var7 = 20;
         } else if(var3.indexOf("10.5") != -1) {
            var7 = 21;
         } else if(var3.indexOf("10.6") != -1) {
            var7 = 22;
         } else if(var3.indexOf("10.7") != -1) {
            var7 = 23;
         } else if(var3.indexOf("10.8") != -1) {
            var7 = 24;
         } else if(var3.indexOf("10.9") != -1) {
            var7 = 25;
         } else if(var3.indexOf("10.10") != -1) {
            var7 = 26;
         } else if(var3.indexOf("10.11") != -1) {
            var7 = 27;
         } else if(var3.indexOf("10.12") != -1) {
            var7 = 28;
         } else if(var3.indexOf("10.13") != -1) {
            var7 = 29;
         }
      }

      byte var8;
      if(var4.toLowerCase().indexOf("sun") != -1) {
         var8 = 1;
      } else if(var4.toLowerCase().indexOf("microsoft") != -1) {
         var8 = 2;
      } else if(var4.toLowerCase().indexOf("apple") != -1) {
         var8 = 3;
      } else if(var4.toLowerCase().indexOf("oracle") != -1) {
         var8 = 5;
      } else {
         var8 = 4;
      }

      this.method_6311(var5, (byte)-18);
      int var10 = (int)(Runtime.getRuntime().maxMemory() / 1048576L) + 1;
      int var11;
      if(this.field_4019 * -1520925295 > 3) {
         var11 = Runtime.getRuntime().availableProcessors();
      } else {
         var11 = 0;
      }

      byte var12 = 0;
      String var13 = "";
      String var14 = "";
      String var15 = "";
      String var16 = "";
      String var17 = "";
      String var18 = "";
      int[] var23 = new int[3];
      class_30 var10000 = new class_30(var1, var6, var7, var8, this.field_4019 * -1520925295, this.field_4013 * -1280779565, this.field_4018 * 1746870345, false, var10, var11, var12, 0, var13, var14, var15, var16, 0, 0, 0, 0, var17, var18, var23, 0, "");
      return var10000;
   }

   // $FF: renamed from: c (java.lang.String) void
   void method_6321(String var1) {
      String[] var2 = var1.split("\\.");

      try {
         this.field_4019 = Integer.parseInt(var2[0]) * -234169487;
         this.field_4013 = Integer.parseInt(var2[1]) * -413644917;
         this.field_4018 = Integer.parseInt(var2[2]) * 505694284;
      } catch (Exception var4) {
         ;
      }

   }

   // $FF: renamed from: e (java.lang.String) void
   void method_6322(String var1) {
      String[] var2 = var1.split("\\.");

      try {
         this.field_4019 = Integer.parseInt(var2[0]) * -234169487;
         this.field_4013 = Integer.parseInt(var2[1]) * 591170907;
         this.field_4018 = Integer.parseInt(var2[2]) * -378613255;
      } catch (Exception var4) {
         ;
      }

   }

   // $FF: renamed from: g (java.lang.String) void
   void method_6323(String var1) {
      String[] var2 = var1.split("\\.");

      try {
         this.field_4019 = Integer.parseInt(var2[0]) * -234169487;
         this.field_4013 = Integer.parseInt(var2[1]) * -1773151186;
         this.field_4018 = Integer.parseInt(var2[2]) * 2142209752;
      } catch (Exception var4) {
         ;
      }

   }

   // $FF: renamed from: p (int, int, int, boolean, int, boolean, int) void
   static void method_6324(int var0, int var1, int var2, boolean var3, int var4, boolean var5, int var6) {
      try {
         if(var0 < var1) {
            if(var6 != 848721482) {
               return;
            }

            int var7 = (var0 + var1) / 2;
            int var8 = var0;
            class_149 var9 = class_166.field_2083[var7];
            class_166.field_2083[var7] = class_166.field_2083[var1];
            class_166.field_2083[var1] = var9;

            for(int var10 = var0; var10 < var1; ++var10) {
               if(var6 != 848721482) {
                  throw new IllegalStateException();
               }

               class_149 var12 = class_166.field_2083[var10];
               int var13 = class_53.method_577(var12, var9, var2, var3, -333331035);
               int var11;
               if(var13 != 0) {
                  if(var6 != 848721482) {
                     throw new IllegalStateException();
                  }

                  if(var3) {
                     if(var6 != 848721482) {
                        throw new IllegalStateException();
                     }

                     var11 = -var13;
                  } else {
                     var11 = var13;
                  }
               } else if(var4 == -1) {
                  if(var6 != 848721482) {
                     throw new IllegalStateException();
                  }

                  var11 = 0;
               } else {
                  int var14 = class_53.method_577(var12, var9, var4, var5, -1985960487);
                  if(var5) {
                     if(var6 != 848721482) {
                        return;
                     }

                     var11 = -var14;
                  } else {
                     var11 = var14;
                  }
               }

               if(var11 <= 0) {
                  if(var6 != 848721482) {
                     throw new IllegalStateException();
                  }

                  class_149 var16 = class_166.field_2083[var10];
                  class_166.field_2083[var10] = class_166.field_2083[var8];
                  class_166.field_2083[var8++] = var16;
               }
            }

            class_166.field_2083[var1] = class_166.field_2083[var8];
            class_166.field_2083[var8] = var9;
            method_6324(var0, var8 - 1, var2, var3, var4, var5, 848721482);
            method_6324(var8 + 1, var1, var2, var3, var4, var5, 848721482);
         }

      } catch (RuntimeException var15) {
         throw class_223.method_4281(var15, "mb.p(" + ')');
      }
   }

   // $FF: renamed from: y (java.lang.String, int) void
   void method_6325(String var1, int var2) {
      try {
         String[] var3 = var1.split("\\.");

         try {
            this.field_4019 = Integer.parseInt(var3[0]) * -234169487;
            this.field_4013 = Integer.parseInt(var3[1]) * 591170907;
            this.field_4018 = Integer.parseInt(var3[2]) * -378613255;
         } catch (Exception var5) {
            ;
         }

      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6, "mb.y(" + ')');
      }
   }
}
