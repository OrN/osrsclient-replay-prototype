
// $FF: renamed from: ei
public class class_85 extends class_59 {

   // $FF: renamed from: v jv
   static class_306 field_786;
   // $FF: renamed from: n hz
   public static class_272 field_787;
   // $FF: renamed from: f mr
   class_369 field_788;


   // $FF: renamed from: y (nd, int) void
   void method_1431(class_28 var1, int var2) {
      try {
         while(true) {
            int var3 = var1.method_130();
            if(0 == var3) {
               if(var2 >= 540160928) {
                  throw new IllegalStateException();
               }

               return;
            }

            this.method_1444(var1, var3, -1568797940);
         }
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: j (int, int, int) int
   public int method_1433(int var1, int var2) {
      try {
         return class_174.method_3723(this.field_788, var1, var2, -1832389513);
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: r (int, java.lang.String, int) java.lang.String
   public String method_1434(int var1, String var2) {
      try {
         return class_346.method_6180(this.field_788, var1, var2, (byte)63);
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: <clinit> () void
   static {
      class_272 var10000 = new class_272(64);
      field_787 = var10000;
   }

   // $FF: renamed from: <init> () void
   class_85() {
      super();
      try {
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1);
      }
   }

   // $FF: renamed from: lr (io, int) io
   static class_37 method_1441(class_37 var0, int var1) {
      try {
         int var2 = class_119.method_2259(class_112.method_2236(var0, 2146562809));
         if(0 == var2) {
            if(var1 <= 66590305) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            for(int var3 = 0; var3 < var2; ++var3) {
               var0 = class_71.method_1047(var0.field_152 * -1338646279);
               if(null == var0) {
                  return null;
               }
            }

            return var0;
         }
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: v (int, int) ef
   public static class_88 method_1443(int var0, int var1) {
      try {
         class_88 var2 = (class_88)class_88.field_884.method_5065((long)var0);
         if(null != var2) {
            if(var1 <= 1084819797) {
               throw new IllegalStateException();
            } else {
               return var2;
            }
         } else {
            byte[] var3 = class_88.field_890.method_5381(9, var0);
            class_88 var10000 = new class_88();
            var2 = var10000;
            var2.field_857 = var0 * 1893482329;
            if(var3 != null) {
               class_28 var10001 = new class_28(var3);
               var2.method_1566(var10001, 1170104499);
            }

            var2.method_1540();
            class_88.field_884.method_5064(var2, (long)var0);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: p (nd, int, int) void
   void method_1444(class_28 var1, int var2, int var3) {
      try {
         if(var2 == 249) {
            if(var3 >= -1034718900) {
               throw new IllegalStateException();
            }

            this.field_788 = class_325.method_5781(var1, this.field_788, -391561047);
         }

      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: f (int) void
   void method_1450() {
      try {
         ;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: r (int, int) boolean
   public static boolean method_1457(int var0) {
      try {
         return 0 != (var0 >> 31 & 1);
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

}
