
// $FF: renamed from: fg
public class class_222 {

   // $FF: renamed from: n int
   static final int field_2517 = 2;
   // $FF: renamed from: hj oh[]
   static class_67[] field_2518;
   // $FF: renamed from: b int
   static final int field_2519 = 6;
   // $FF: renamed from: ao int
   static final int field_2520 = 45;


   // $FF: renamed from: n (double, double, double) int
   public static final int method_4273(double var0, double var2, double var4) {
      double var6 = var4;
      double var8 = var4;
      double var10 = var4;
      if(0.0D != var2) {
         double var12;
         if(var4 < 0.5D) {
            var12 = var4 * (1.0D + var2);
         } else {
            var12 = var4 + var2 - var2 * var4;
         }

         double var14 = 2.0D * var4 - var12;
         double var16 = var0 + 0.3333333333333333D;
         if(var16 > 1.0D) {
            --var16;
         }

         double var20 = var0 - 0.3333333333333333D;
         if(var20 < 0.0D) {
            ++var20;
         }

         if(var16 * 6.0D < 1.0D) {
            var6 = (var12 - var14) * 6.0D * var16 + var14;
         } else if(var16 * 2.0D < 1.0D) {
            var6 = var12;
         } else if(var16 * 3.0D < 2.0D) {
            var6 = 6.0D * (var12 - var14) * (0.6666666666666666D - var16) + var14;
         } else {
            var6 = var14;
         }

         if(6.0D * var0 < 1.0D) {
            var8 = 6.0D * (var12 - var14) * var0 + var14;
         } else if(2.0D * var0 < 1.0D) {
            var8 = var12;
         } else if(3.0D * var0 < 2.0D) {
            var8 = var14 + (var12 - var14) * (0.6666666666666666D - var0) * 6.0D;
         } else {
            var8 = var14;
         }

         if(var20 * 6.0D < 1.0D) {
            var10 = var14 + (var12 - var14) * 6.0D * var20;
         } else if(2.0D * var20 < 1.0D) {
            var10 = var12;
         } else if(3.0D * var20 < 2.0D) {
            var10 = (var12 - var14) * (0.6666666666666666D - var20) * 6.0D + var14;
         } else {
            var10 = var14;
         }
      }

      int var22 = (int)(256.0D * var6);
      int var13 = (int)(var8 * 256.0D);
      int var23 = (int)(256.0D * var10);
      int var15 = (var22 << 16) + (var13 << 8) + var23;
      return var15;
   }

   // $FF: renamed from: <init> () void
   class_222() throws Throwable {
      super();
      try {
         throw new Error();
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1, "fg.<init>(" + ')');
      }
   }

   // $FF: renamed from: g (byte) void
   static void method_4275(byte var0) {
      try {
         class_177.field_2194 = -1648450872;
         class_299.method_5348(class_305.field_3638, class_305.field_3644, class_305.field_3640, (byte)-20);
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1, "fg.g(" + ')');
      }
   }

   // $FF: renamed from: y (int, int) boolean
   public static boolean method_4276(int var0, int var1) {
      try {
         boolean var10000;
         if((var0 >> 20 & 1) != 0) {
            if(var1 != 1604021821) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "fg.y(" + ')');
      }
   }

   // $FF: renamed from: f (double, double, double) int
   public static final int method_4277(double var0, double var2, double var4) {
      double var6 = var4;
      double var8 = var4;
      double var10 = var4;
      if(0.0D != var2) {
         double var12;
         if(var4 < 0.5D) {
            var12 = var4 * (1.0D + var2);
         } else {
            var12 = var4 + var2 - var2 * var4;
         }

         double var14 = 2.0D * var4 - var12;
         double var16 = var0 + 0.3333333333333333D;
         if(var16 > 1.0D) {
            --var16;
         }

         double var20 = var0 - 0.3333333333333333D;
         if(var20 < 0.0D) {
            ++var20;
         }

         if(var16 * 6.0D < 1.0D) {
            var6 = (var12 - var14) * 6.0D * var16 + var14;
         } else if(var16 * 2.0D < 1.0D) {
            var6 = var12;
         } else if(var16 * 3.0D < 2.0D) {
            var6 = 6.0D * (var12 - var14) * (0.6666666666666666D - var16) + var14;
         } else {
            var6 = var14;
         }

         if(6.0D * var0 < 1.0D) {
            var8 = 6.0D * (var12 - var14) * var0 + var14;
         } else if(2.0D * var0 < 1.0D) {
            var8 = var12;
         } else if(3.0D * var0 < 2.0D) {
            var8 = var14 + (var12 - var14) * (0.6666666666666666D - var0) * 6.0D;
         } else {
            var8 = var14;
         }

         if(var20 * 6.0D < 1.0D) {
            var10 = var14 + (var12 - var14) * 6.0D * var20;
         } else if(2.0D * var20 < 1.0D) {
            var10 = var12;
         } else if(3.0D * var20 < 2.0D) {
            var10 = (var12 - var14) * (0.6666666666666666D - var20) * 6.0D + var14;
         } else {
            var10 = var14;
         }
      }

      int var22 = (int)(256.0D * var6);
      int var13 = (int)(var8 * 256.0D);
      int var23 = (int)(256.0D * var10);
      int var15 = (var22 << 16) + (var13 << 8) + var23;
      return var15;
   }

   // $FF: renamed from: jj (int) void
   static void method_4278(int var0) {
      try {
         for(class_48 var1 = (class_48)client.field_1578.method_6531(); null != var1; var1 = (class_48)client.field_1578.method_6527()) {
            if(var0 <= 668516800) {
               throw new IllegalStateException();
            }

            int var2 = 897280301 * var1.field_353;
            if(class_191.method_3957(var2, (byte)-122)) {
               if(var0 <= 668516800) {
                  throw new IllegalStateException();
               }

               boolean var3 = true;
               class_37[] var4 = class_37.field_93[var2];

               int var5;
               for(var5 = 0; var5 < var4.length; ++var5) {
                  if(var0 <= 668516800) {
                     return;
                  }

                  if(null != var4[var5]) {
                     var3 = var4[var5].field_100;
                     break;
                  }
               }

               if(!var3) {
                  if(var0 <= 668516800) {
                     return;
                  }

                  var5 = (int)var1.field_9;
                  class_37 var6 = class_71.method_1047(var5, 1379405263);
                  if(null != var6) {
                     if(var0 <= 668516800) {
                        return;
                     }

                     class_254.method_4900(var6, (byte)16);
                  }
               }
            }
         }

      } catch (RuntimeException var7) {
         throw class_223.method_4281(var7, "fg.jj(" + ')');
      }
   }
}
