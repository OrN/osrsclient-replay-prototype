import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

// $FF: renamed from: ec
public class class_210 {

   // $FF: renamed from: n java.io.File
   public static File field_2423;
   // $FF: renamed from: f java.util.Hashtable
   static Hashtable field_2424;
   // $FF: renamed from: v boolean
   public static boolean field_2425;
   // $FF: renamed from: m int
   static final int field_2426 = 262144;
   // $FF: renamed from: cr int
   static final int field_2427 = 17;


   // $FF: renamed from: <init> () void
   void method_4163() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1, "ec.<init>(" + ')');
      }
   }

   // $FF: renamed from: <clinit> () void
   static void method_4164() {
      field_2425 = false;
      field_2424 = new Hashtable(16);
   }

   // $FF: renamed from: n (java.lang.String) java.io.File
   public static File method_4165(String var0) {
      if(!field_2425) {
         throw new RuntimeException("");
      } else {
         File var1 = (File)field_2424.get(var0);
         if(var1 != null) {
            return var1;
         } else {
            File var2 = new File(field_2423, var0);
            RandomAccessFile var3 = null;

            try {
               File var4 = new File(var2.getParent());
               if(!var4.exists()) {
                  throw new RuntimeException("");
               } else {
                  var3 = new RandomAccessFile(var2, "rw");
                  int var5 = var3.read();
                  var3.seek(0L);
                  var3.write(var5);
                  var3.seek(0L);
                  var3.close();
                  field_2424.put(var0, var2);
                  return var2;
               }
            } catch (Exception var7) {
               try {
                  if(null != var3) {
                     var3.close();
                     var3 = null;
                  }
               } catch (Exception var6) {
                  ;
               }

               throw new RuntimeException();
            }
         }
      }
   }

   // $FF: renamed from: f (java.lang.String) java.io.File
   public static File method_4166(String var0) {
      if(!field_2425) {
         throw new RuntimeException("");
      } else {
         File var1 = (File)field_2424.get(var0);
         if(var1 != null) {
            return var1;
         } else {
            File var2 = new File(field_2423, var0);
            RandomAccessFile var3 = null;

            try {
               File var4 = new File(var2.getParent());
               if(!var4.exists()) {
                  throw new RuntimeException("");
               } else {
                  var3 = new RandomAccessFile(var2, "rw");
                  int var5 = var3.read();
                  var3.seek(0L);
                  var3.write(var5);
                  var3.seek(0L);
                  var3.close();
                  field_2424.put(var0, var2);
                  return var2;
               }
            } catch (Exception var7) {
               try {
                  if(null != var3) {
                     var3.close();
                     var3 = null;
                  }
               } catch (Exception var6) {
                  ;
               }

               throw new RuntimeException();
            }
         }
      }
   }

   // $FF: renamed from: g (int) void
   static final void method_4167(int var0) {
      try {
         if(class_255.field_2878) {
            if(var0 != -26460885) {
               throw new IllegalStateException();
            }
         } else {
            int var1 = class_251.field_2808;
            int var2 = class_251.field_2809;
            int var3 = class_251.field_2810;
            int var4 = class_251.field_2811;
            byte var5 = 50;
            short var6 = 3500;
            int var7 = (836373803 * class_255.field_2881 - class_70.field_545) * var5 / class_70.field_544;
            int var8 = (class_255.field_2877 * 1131754581 - class_70.field_538) * var5 / class_70.field_544;
            int var9 = var6 * (class_255.field_2881 * 836373803 - class_70.field_545) / class_70.field_544;
            int var10 = (1131754581 * class_255.field_2877 - class_70.field_538) * var6 / class_70.field_544;
            int var11 = class_70.method_990(var8, var5, var2, var1);
            int var13 = class_70.method_1020(var8, var5, var2, var1);
            var8 = var11;
            var11 = class_70.method_990(var10, var6, var2, var1);
            int var14 = class_70.method_1020(var10, var6, var2, var1);
            var10 = var11;
            var11 = class_70.method_988(var7, var13, var4, var3);
            var13 = class_70.method_989(var7, var13, var4, var3);
            var7 = var11;
            var11 = class_70.method_988(var9, var14, var4, var3);
            var14 = class_70.method_989(var9, var14, var4, var3);
            class_255.field_2875 = (var11 + var7) / 2 * 1284988961;
            class_283.field_3255 = 157876717 * ((var10 + var8) / 2);
            class_255.field_2880 = -2015003721 * ((var14 + var13) / 2);
            class_255.field_2879 = -1797744281 * ((var11 - var7) / 2);
            class_223.field_2525 = (var10 - var8) / 2 * -1579880555;
            class_278.field_3224 = (var14 - var13) / 2 * 221106897;
            class_235.field_2626 = Math.abs(class_255.field_2879 * -1999867305) * 432175981;
            class_122.field_1344 = Math.abs(class_223.field_2525 * -1317870659) * 917620617;
            class_147.field_1864 = Math.abs(-1885485519 * class_278.field_3224) * -368785127;
         }
      } catch (RuntimeException var12) {
         throw class_223.method_4281(var12, "ec.g(" + ')');
      }
   }

   // $FF: renamed from: y (java.lang.String) java.io.File
   public static File method_4168(String var0) {
      if(!field_2425) {
         throw new RuntimeException("");
      } else {
         File var1 = (File)field_2424.get(var0);
         if(var1 != null) {
            return var1;
         } else {
            File var2 = new File(field_2423, var0);
            RandomAccessFile var3 = null;

            try {
               File var4 = new File(var2.getParent());
               if(!var4.exists()) {
                  throw new RuntimeException("");
               } else {
                  var3 = new RandomAccessFile(var2, "rw");
                  int var5 = var3.read();
                  var3.seek(0L);
                  var3.write(var5);
                  var3.seek(0L);
                  var3.close();
                  field_2424.put(var0, var2);
                  return var2;
               }
            } catch (Exception var7) {
               try {
                  if(null != var3) {
                     var3.close();
                     var3 = null;
                  }
               } catch (Exception var6) {
                  ;
               }

               throw new RuntimeException();
            }
         }
      }
   }

   // $FF: renamed from: hv (int, int, int) void
   static final void method_4169(int var0, int var1, int var2) {
      try {
         if(673512273 * client.field_1554 < 2 && 0 == client.field_1570 * -438265211 && !client.field_1572) {
            if(var2 == -1956353066) {
               throw new IllegalStateException();
            }
         } else if(client.field_1565) {
            String var4;
            label68: {
               int var3 = class_192.method_3959(-1594517863);
               if(1 == -438265211 * client.field_1570) {
                  if(var2 == -1956353066) {
                     return;
                  }

                  if(673512273 * client.field_1554 < 2) {
                     if(var2 == -1956353066) {
                        throw new IllegalStateException();
                     }

                     var4 = class_305.field_3556 + class_305.field_3566 + client.field_1571 + " " + class_205.field_2397;
                     break label68;
                  }
               }

               if(client.field_1572) {
                  if(var2 == -1956353066) {
                     throw new IllegalStateException();
                  }

                  if(client.field_1554 * 673512273 < 2) {
                     if(var2 == -1956353066) {
                        throw new IllegalStateException();
                     }

                     var4 = client.field_1575 + class_305.field_3566 + client.field_1545 + " " + class_205.field_2397;
                     break label68;
                  }
               }

               var4 = class_163.method_3421(var3, -1088975575);
            }

            if(client.field_1554 * 673512273 > 2) {
               var4 = var4 + class_136.method_2958(16777215, -1966582053) + " " + '/' + " " + (client.field_1554 * 673512273 - 2) + class_305.field_3444;
            }

            class_37.field_241.method_877(var4, var0 + 4, var1 + 15, 16777215, 0, -1702273423 * client.field_1425 / 1000);
         }
      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5, "ec.hv(" + ')');
      }
   }

   // $FF: renamed from: j (int) void
   public static void method_4170(int var0) {
      try {
         class_86.field_792.method_5074();
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1, "ec.j(" + ')');
      }
   }

   // $FF: renamed from: p (java.lang.String) java.io.File
   public static File method_4171(String var0) {
      if(!field_2425) {
         throw new RuntimeException("");
      } else {
         File var1 = (File)field_2424.get(var0);
         if(var1 != null) {
            return var1;
         } else {
            File var2 = new File(field_2423, var0);
            RandomAccessFile var3 = null;

            try {
               File var4 = new File(var2.getParent());
               if(!var4.exists()) {
                  throw new RuntimeException("");
               } else {
                  var3 = new RandomAccessFile(var2, "rw");
                  int var5 = var3.read();
                  var3.seek(0L);
                  var3.write(var5);
                  var3.seek(0L);
                  var3.close();
                  field_2424.put(var0, var2);
                  return var2;
               }
            } catch (Exception var7) {
               try {
                  if(null != var3) {
                     var3.close();
                     var3 = null;
                  }
               } catch (Exception var6) {
                  ;
               }

               throw new RuntimeException();
            }
         }
      }
   }
}
