import java.util.Comparator;

// $FF: renamed from: jt
final class class_311 implements Comparator {

   // $FF: renamed from: dl jp
   static class_307 field_3749;
   // $FF: renamed from: f byte
   public static final byte field_3750 = 2;
   // $FF: renamed from: bq int
   static final int field_3751 = 69;
   // $FF: renamed from: fq long
   static long field_3752;


   // $FF: renamed from: p (java.lang.Object, java.lang.Object) int
   public int method_5544(Object var1, Object var2) {
      return this.method_5545((class_310)var1, (class_310)var2, 1241593675);
   }

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
         throw class_223.method_4281(var4, "jt.v(" + ')');
      }
   }

   public int compare(Object var1, Object var2) {
      try {
         return this.method_5545((class_310)var1, (class_310)var2, 119350129);
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3, "jt.compare(" + ')');
      }
   }

   public boolean equals(Object var1) {
      try {
         return super.equals(var1);
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "jt.equals(" + ')');
      }
   }

   // $FF: renamed from: n (js, js) int
   int method_5546(class_310 var1, class_310 var2) {
      return 6451811657459395973L * var1.field_3743 < 6451811657459395973L * var2.field_3743?-1:(var2.field_3743 * 6451811657459395973L == var1.field_3743 * 6451811657459395973L?0:1);
   }

   // $FF: renamed from: y (java.lang.Object, java.lang.Object) int
   public int method_5547(Object var1, Object var2) {
      return this.method_5545((class_310)var1, (class_310)var2, -743752270);
   }

   // $FF: renamed from: <init> () void
   void method_5548() {
      super();
   }

   // $FF: renamed from: e (int, cf, boolean, int) int
   static int method_5549(int var0, class_90 var1, boolean var2, int var3) {
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
         throw class_223.method_4281(var5, "jt.e(" + ')');
      }
   }

   // $FF: renamed from: fl (java.lang.Object) boolean
   public boolean method_5550(Object var1) {
      return super.equals(var1);
   }

   // $FF: renamed from: eo (java.lang.Object) boolean
   public boolean method_5551(Object var1) {
      return super.equals(var1);
   }

   // $FF: renamed from: o (int, int, int) int
   static final int method_5552(int var0, int var1, int var2) {
      try {
         int var3 = var0 + var1 * 57;
         var3 ^= var3 << 13;
         int var4 = var3 * (15731 * var3 * var3 + 789221) + 1376312589 & Integer.MAX_VALUE;
         return var4 >> 19 & 255;
      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5, "jt.o(" + ')');
      }
   }

   // $FF: renamed from: p (jv, int, byte) void
   static void method_5553(class_306 var0, int var1, byte var2) {
      try {
         if(0 != (var1 & 536870912)) {
            if(var2 <= 4) {
               throw new IllegalStateException();
            }

            class_372.field_4114 = class_79.method_1257(var0, "logo_deadman_mode", "", -1896190200);
         } else if(0 != (var1 & 1073741824)) {
            if(var2 <= 4) {
               throw new IllegalStateException();
            }

            class_372.field_4114 = class_79.method_1257(var0, "logo_seasonal_mode", "", -1971882123);
         } else {
            class_372.field_4114 = class_79.method_1257(var0, "logo", "", -1962376396);
         }

      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3, "jt.p(" + ')');
      }
   }

   // $FF: renamed from: eg (java.lang.Object) boolean
   public boolean method_5554(Object var1) {
      return super.equals(var1);
   }
}
