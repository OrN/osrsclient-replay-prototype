import java.util.Comparator;

// $FF: renamed from: jt
final class class_311 implements Comparator {

   // $FF: renamed from: dl jp
   static IDXFile idx8;
    // $FF: renamed from: fq long
   static long field_3752;


    // $FF: renamed from: v (js, js, int) int
   int method_5545(class_310 var1, class_310 var2, int var3) {
      try {
         int var10000;
         if(6451811657459395973L * var1.field_3743 < 6451811657459395973L * var2.field_3743) {
            if(var3 == -1744120214) {
               throw new IllegalStateException();
            }

            var10000 = -1;
         } else {
            var10000 = var2.field_3743 * 6451811657459395973L == var1.field_3743 * 6451811657459395973L?0:1;
         }

         return var10000;
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   public int compare(Object var1, Object var2) {
      try {
         return this.method_5545((class_310)var1, (class_310)var2, 119350129);
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   public boolean equals(Object var1) {
      try {
         return super.equals(var1);
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

    // $FF: renamed from: <init> () void
   class_311() {
      super();
   }

   // $FF: renamed from: e (int, cf, boolean, int) int
   static int method_5549(int var0, boolean var2, int var3) {
      try {
         class_37 var4 = var2?class_124.field_1357:class_165.field_2064;
         if(var0 == 1700) {
            if(var3 != 918594995) {
               throw new IllegalStateException();
            } else {
               class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = 539336237 * var4.field_229;
               return 1;
            }
         } else if(1701 == var0) {
            if(var3 != 918594995) {
               throw new IllegalStateException();
            } else {
               if(-1 != 539336237 * var4.field_229) {
                  class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = 1575834679 * var4.field_161;
               } else {
                  class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = 0;
               }

               return 1;
            }
         } else if(var0 == 1702) {
            if(var3 != 918594995) {
               throw new IllegalStateException();
            } else {
               class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = 41180389 * var4.field_102;
               return 1;
            }
         } else {
            return 2;
         }
      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5);
      }
   }

    // $FF: renamed from: o (int, int, int) int
   static final int method_5552(int var0, int var1) {
      try {
         int var3 = var0 + var1 * 57;
         var3 ^= var3 << 13;
         int var4 = var3 * (15731 * var3 * var3 + 789221) + 1376312589 & Integer.MAX_VALUE;
         return var4 >> 19 & 255;
      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5);
      }
   }

   // $FF: renamed from: p (jv, int, byte) void
   static void method_5553(class_306 var0, int var1, byte var2) {
      try {
         if(0 != (var1 & 536870912)) {
            if(var2 <= 4) {
               throw new IllegalStateException();
            }

            IDXMap.runescapeLogo = class_79.method_1257(var0, "logo_deadman_mode", "");
         } else if(0 != (var1 & 1073741824)) {
            if(var2 <= 4) {
               throw new IllegalStateException();
            }

            IDXMap.runescapeLogo = class_79.method_1257(var0, "logo_seasonal_mode", "");
         } else {
            IDXMap.runescapeLogo = class_79.method_1257(var0, "logo", "");
         }

      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

}
