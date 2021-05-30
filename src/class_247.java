
// $FF: renamed from: gn
public final class class_247 {

   // $FF: renamed from: a int
   int field_2727;
   // $FF: renamed from: d int
   int field_2728;
   // $FF: renamed from: f int
   int field_2729;
   // $FF: renamed from: c int
   int field_2730;
   // $FF: renamed from: p int
   int field_2731;
   // $FF: renamed from: j int
   int field_2732;
   // $FF: renamed from: r int
   int field_2733;
   // $FF: renamed from: v int
   int field_2734;
   // $FF: renamed from: n int
   int field_2735;
   // $FF: renamed from: y int
   int field_2736;
   // $FF: renamed from: u int
   int field_2737;
   // $FF: renamed from: l int
   int field_2738;
   // $FF: renamed from: s int
   int field_2739;
   // $FF: renamed from: e int
   int field_2740;
   // $FF: renamed from: b int
   int field_2741;
   // $FF: renamed from: g int
   int field_2742;
   // $FF: renamed from: o int
   int field_2743;
   // $FF: renamed from: k int
   int field_2744;
   // $FF: renamed from: gn int
   static int field_2745;


   // $FF: renamed from: ig (java.lang.String, java.lang.String, int, int, int, int, int) void
   public static final void method_4712(String var0, String var1, int var2, int var3, int var4, int var5) {
      try {
         class_269.method_5041(var0, var1, var2, var3, var4, var5, false, -2076246411);
      } catch (RuntimeException var7) {
         throw class_223.method_4281(var7);
      }
   }

   // $FF: renamed from: <init> () void
   class_247() {
      super();
      try {
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1);
      }
   }

   // $FF: renamed from: l (int, int, byte) int
   static final int method_4714(int var0, int var1) {
      try {
         int var3 = class_311.method_5552(var0 - 1, var1 - 1) + class_311.method_5552(1 + var0, var1 - 1) + class_311.method_5552(var0 - 1, 1 + var1) + class_311.method_5552(1 + var0, 1 + var1);
         int var4 = class_311.method_5552(var0 - 1, var1) + class_311.method_5552(var0 + 1, var1) + class_311.method_5552(var0, var1 - 1) + class_311.method_5552(var0, var1 + 1);
         int var5 = class_311.method_5552(var0, var1);
         return var5 / 4 + var4 / 8 + var3 / 16;
      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6);
      }
   }

   // $FF: renamed from: z (int, cf, boolean, int) int
   static int method_4715(int var0, int var3) {
      try {
         class_37 var4 = class_71.method_1047(class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885]);
         if(var0 == 2800) {
            if(var3 >= -509169958) {
               throw new IllegalStateException();
            } else {
               class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = class_196.method_3989(class_112.method_2236(var4, 2134538939));
               return 1;
            }
         } else if(var0 == 2801) {
            if(var3 >= -509169958) {
               throw new IllegalStateException();
            } else {
               int var5 = class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885];
               --var5;
               if(null != var4.field_129) {
                  if(var3 >= -509169958) {
                     throw new IllegalStateException();
                  }

                  if(var5 < var4.field_129.length) {
                     if(var3 >= -509169958) {
                        throw new IllegalStateException();
                     }

                     if(var4.field_129[var5] != null) {
                        class_165.field_2053[(class_165.field_2054 += 1647125333) * 1824375293 - 1] = var4.field_129[var5];
                        return 1;
                     }
                  }
               }

               class_165.field_2053[(class_165.field_2054 += 1647125333) * 1824375293 - 1] = "";
               return 1;
            }
         } else if(2802 == var0) {
            if(var3 >= -509169958) {
               throw new IllegalStateException();
            } else {
               if(var4.field_91 == null) {
                  class_165.field_2053[(class_165.field_2054 += 1647125333) * 1824375293 - 1] = "";
               } else {
                  class_165.field_2053[(class_165.field_2054 += 1647125333) * 1824375293 - 1] = var4.field_91;
               }

               return 1;
            }
         } else {
            return 2;
         }
      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6);
      }
   }
}
