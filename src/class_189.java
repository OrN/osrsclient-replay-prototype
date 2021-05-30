
// $FF: renamed from: da
public class class_189 extends class_181 {

   // $FF: renamed from: v boolean
   final boolean field_2273;
   // $FF: renamed from: z java.lang.String
   public static String osName;
   // $FF: renamed from: dm jp
   static class_307 field_2275;
   // $FF: renamed from: iz int
   static int field_2276;
   // $FF: renamed from: s int
   static final int field_2277 = 512;
   // $FF: renamed from: u short[]
   public static short[] field_2278;


   // $FF: renamed from: n (lv, lv) int
   int method_3893(class_339 var1, class_339 var2) {
      if(var1.field_3888 * 1693720149 != 0) {
         if(0 == 1693720149 * var2.field_3888) {
            return this.field_2273?-1:1;
         }
      } else if(0 != var2.field_3888 * 1693720149) {
         return this.field_2273?1:-1;
      }

      return this.method_3830(var1, var2, (byte)0);
   }

   // $FF: renamed from: v (lv, lv, int) int
   int method_3894(class_339 var1, class_339 var2, int var3) {
      try {
         byte var10000;
         if(var1.field_3888 * 1693720149 != 0) {
            if(0 == 1693720149 * var2.field_3888) {
               if(var3 <= -1575444107) {
                  throw new IllegalStateException();
               }

               if(this.field_2273) {
                  if(var3 <= -1575444107) {
                     throw new IllegalStateException();
                  }

                  var10000 = -1;
               } else {
                  var10000 = 1;
               }

               return var10000;
            }
         } else if(0 != var2.field_3888 * 1693720149) {
            if(var3 <= -1575444107) {
               throw new IllegalStateException();
            }

            if(this.field_2273) {
               if(var3 <= -1575444107) {
                  throw new IllegalStateException();
               }

               var10000 = 1;
            } else {
               var10000 = -1;
            }

            return var10000;
         }

         return this.method_3830(var1, var2, (byte)0);
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4, "da.v(" + ')');
      }
   }

   public int compare(Object var1, Object var2) {
      try {
         return this.method_3894((class_339)var1, (class_339)var2, 1211998991);
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3, "da.compare(" + ')');
      }
   }

   // $FF: renamed from: y (java.lang.Object, java.lang.Object) int
   public int method_3895(Object var1, Object var2) {
      return this.method_3894((class_339)var1, (class_339)var2, 775898900);
   }

   // $FF: renamed from: hz (ch, int) void
   static final void method_3896(class_50 var0, int var1) {
      try {
         long var2 = 0L;
         int var4 = -1;
         int var5 = 0;
         int var6 = 0;
         if(0 == var0.field_365 * -1769235093) {
            if(var1 != 14093457) {
               throw new IllegalStateException();
            }

            var2 = class_206.field_2401.method_4749(var0.field_369 * -28991277, 1813016497 * var0.field_364, var0.field_367 * -396145343);
         }

         if(var0.field_365 * -1769235093 == 1) {
            if(var1 != 14093457) {
               throw new IllegalStateException();
            }

            var2 = class_206.field_2401.method_4750(-28991277 * var0.field_369, var0.field_364 * 1813016497, var0.field_367 * -396145343);
         }

         if(-1769235093 * var0.field_365 == 2) {
            if(var1 != 14093457) {
               throw new IllegalStateException();
            }

            var2 = class_206.field_2401.method_4818(var0.field_369 * -28991277, var0.field_364 * 1813016497, var0.field_367 * -396145343);
         }

         if(-1769235093 * var0.field_365 == 3) {
            if(var1 != 14093457) {
               return;
            }

            var2 = class_206.field_2401.method_4752(var0.field_369 * -28991277, var0.field_364 * 1813016497, -396145343 * var0.field_367);
         }

         if(0L != var2) {
            if(var1 != 14093457) {
               throw new IllegalStateException();
            }

            int var7 = class_206.field_2401.method_4753(-28991277 * var0.field_369, var0.field_364 * 1813016497, var0.field_367 * -396145343, var2);
            var4 = class_164.method_3425(var2);
            var5 = var7 & 31;
            var6 = var7 >> 6 & 3;
         }

         var0.field_368 = 574004757 * var4;
         var0.field_370 = var5 * 466860789;
         var0.field_366 = var6 * -1763910109;
      } catch (RuntimeException var8) {
         throw class_223.method_4281(var8, "da.hz(" + ')');
      }
   }

   // $FF: renamed from: <init> (boolean) void
   public class_189(boolean var1) {
      super();
      try {
         this.field_2273 = var1;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "da.<init>(" + ')');
      }
   }

   // $FF: renamed from: v (jv, jv, int) boolean
   public static boolean method_3898(class_306 var0, class_306 var1, int var2) {
      try {
         class_75.field_618 = var1;
         if(!var0.method_5423(2143034068)) {
            if(var2 >= 89896861) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            class_331.field_3858 = var0.method_5393(35, 1197898381) * -1720116175;
            class_75.field_614 = new class_75[-617825071 * class_331.field_3858];

            for(int var3 = 0; var3 < -617825071 * class_331.field_3858; ++var3) {
               if(var2 >= 89896861) {
                  throw new IllegalStateException();
               }

               byte[] var4 = var0.method_5381(35, var3, -26460885);
               class_75[] var10000 = class_75.field_614;
               class_75 var10002 = new class_75(var3);
               var10000[var3] = var10002;
               if(var4 != null) {
                  if(var2 >= 89896861) {
                     throw new IllegalStateException();
                  }

                  class_75 var6 = class_75.field_614[var3];
                  class_28 var10001 = new class_28(var4);
                  var6.method_1138(var10001, -1509060370);
                  class_75.field_614[var3].method_1133(-505496297);
               }
            }

            return true;
         }
      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5, "da.v(" + ')');
      }
   }

   // $FF: renamed from: j (lv, lv) int
   int method_3899(class_339 var1, class_339 var2) {
      if(var1.field_3888 * -2035629280 != 0) {
         if(0 == 1693720149 * var2.field_3888) {
            return this.field_2273?-1:1;
         }
      } else if(0 != var2.field_3888 * 1693720149) {
         return this.field_2273?1:-1;
      }

      return this.method_3830(var1, var2, (byte)0);
   }

   // $FF: renamed from: p (java.lang.Object, java.lang.Object) int
   public int method_3900(Object var1, Object var2) {
      return this.method_3894((class_339)var1, (class_339)var2, 1000205713);
   }

   // $FF: renamed from: f (lv, lv) int
   int method_3901(class_339 var1, class_339 var2) {
      if(var1.field_3888 * 1693720149 != 0) {
         if(0 == 1693720149 * var2.field_3888) {
            return this.field_2273?-1:1;
         }
      } else if(0 != var2.field_3888 * 1693720149) {
         return this.field_2273?1:-1;
      }

      return this.method_3830(var1, var2, (byte)0);
   }
}
