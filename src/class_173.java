
// $FF: renamed from: cp
public class class_173 {

   // $FF: renamed from: p java.lang.String
   String field_2160;
   // $FF: renamed from: n int
   int field_2161;
   // $FF: renamed from: v int
   int field_2162;
   // $FF: renamed from: y int
   int field_2163;
   // $FF: renamed from: f int
   int field_2164;
   // $FF: renamed from: cm int
   static final int field_2165 = 100;


   // $FF: renamed from: <init> () void
   class_173() {
      super();
      try {
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1);
      }
   }

   // $FF: renamed from: kg (int, int, int, int, oh, it, int) void
   static final void method_3712(int var0, int var1, int var2, int var3, class_67 var4, class_61 var5, int var6) {
      try {
         int var7 = var2 * var2 + var3 * var3;
         if(var7 > 4225) {
            if(var6 <= 497463459) {
               throw new IllegalStateException();
            }

            if(var7 < 90000) {
               if(var6 <= 497463459) {
                  throw new IllegalStateException();
               }

               int var8 = client.field_1629 * -574530013 & 2047;
               int var9 = class_70.field_548[var8];
               int var10 = class_70.field_559[var8];
               int var11 = var2 * var10 + var9 * var3 >> 16;
               int var12 = var3 * var10 - var9 * var2 >> 16;
               double var13 = Math.atan2((double)var11, (double)var12);
               int var15 = var5.field_479 * 1279799405 / 2 - 25;
               int var16 = (int)(Math.sin(var13) * (double)var15);
               int var17 = (int)(Math.cos(var13) * (double)var15);
               byte var18 = 20;
               class_165.field_2067.method_784(var16 + (var5.field_479 * 1279799405 / 2 + var0 - var18 / 2), var1 + -1973837741 * var5.field_477 / 2 - var18 / 2 - var17 - 10, var18, var18, 15, 15, var13, 256);
               return;
            }
         }

         class_87.method_1535(var0, var1, var2, var3, var4, var5, -1287867325);
      } catch (RuntimeException var19) {
         throw class_223.method_4281(var19);
      }
   }
}
