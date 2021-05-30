import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

// $FF: renamed from: en
public class class_213 implements class_14 {

   // $FF: renamed from: r int
   public static final int field_2438 = 8;
   // $FF: renamed from: n en
   static final class_213 field_2439;
   // $FF: renamed from: f en
   static final class_213 field_2440;
   // $FF: renamed from: y int
   public final int field_2441;
   // $FF: renamed from: p int
   final int field_2442;
   // $FF: renamed from: bk int
   static final int field_2443 = 6;
   // $FF: renamed from: v en
   static final class_213 field_2444;
   // $FF: renamed from: al int
   static final int field_2445 = 3;


   // $FF: renamed from: r () en[]
   static class_213[] method_4183() {
      return new class_213[]{field_2439, field_2444, field_2440};
   }

   // $FF: renamed from: p () en[]
   static class_213[] method_4184() {
      return new class_213[]{field_2439, field_2444, field_2440};
   }

   // $FF: renamed from: <clinit> () void
   static void method_4185() {
      class_213 var10000 = new class_213;
      var10000.method_4186(1, 0);
      field_2444 = var10000;
      var10000 = new class_213;
      var10000.method_4186(0, 1);
      field_2439 = var10000;
      var10000 = new class_213;
      var10000.method_4186(2, 2);
      field_2440 = var10000;
   }

   // $FF: renamed from: n () int
   public int method_49() {
      return 1344358763 * this.field_2442;
   }

   // $FF: renamed from: f () int
   public int method_51() {
      return 1344358763 * this.field_2442;
   }

   // $FF: renamed from: <init> (int, int) void
   void method_4186(int var1, int var2) {
      try {
         super();
         this.field_2441 = var1 * -484963161;
         this.field_2442 = 654482243 * var2;
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3, "en.<init>(" + ')');
      }
   }

   // $FF: renamed from: j () en[]
   static class_213[] method_4187() {
      return new class_213[]{field_2439, field_2444, field_2440};
   }

   // $FF: renamed from: q (dp, int, int, byte) bd
   public static final class_139 method_4188(class_201 var0, int var1, int var2, byte var3) {
      try {
         if(0 == 1631160541 * class_139.field_1793) {
            if(var3 != 1) {
               throw new IllegalStateException();
            } else {
               throw new IllegalStateException();
            }
         } else {
            if(var1 >= 0) {
               if(var3 != 1) {
                  throw new IllegalStateException();
               }

               if(var1 < 2) {
                  if(var2 < 256) {
                     if(var3 != 1) {
                        throw new IllegalStateException();
                     }

                     var2 = 256;
                  }

                  try {
                     class_139 var4 = class_126.field_1372.method_5(-597712139);
                     var4.field_1785 = new int[256 * (class_139.field_1781?2:1)];
                     var4.field_1790 = 602149037 * var2;
                     var4.method_3006((byte)4);
                     var4.field_1789 = ((var2 & -1024) + 1024) * -1538538253;
                     if(var4.field_1789 * 1181152315 > 16384) {
                        var4.field_1789 = -247676928;
                     }

                     var4.method_2998(1181152315 * var4.field_1789, (short)-24303);
                     if(class_139.field_1783 * -1797165253 > 0) {
                        if(var3 != 1) {
                           throw new IllegalStateException();
                        }

                        if(null == class_101.field_1182) {
                           class_154 var7 = new class_154;
                           var7.method_3244();
                           class_101.field_1182 = var7;
                           class_276.field_3220 = Executors.newScheduledThreadPool(1);
                           class_276.field_3220.scheduleAtFixedRate(class_101.field_1182, 0L, 10L, TimeUnit.MILLISECONDS);
                        }
                     }

                     if(class_101.field_1182 != null) {
                        if(class_101.field_1182.field_1934[var1] != null) {
                           if(var3 != 1) {
                              throw new IllegalStateException();
                           }

                           throw new IllegalArgumentException();
                        }

                        class_101.field_1182.field_1934[var1] = var4;
                     }

                     return var4;
                  } catch (Throwable var5) {
                     class_139 var10000 = new class_139;
                     var10000.method_3017();
                     return var10000;
                  }
               }

               if(var3 != 1) {
                  throw new IllegalStateException();
               }
            }

            throw new IllegalArgumentException();
         }
      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6, "en.q(" + ')');
      }
   }

   // $FF: renamed from: v (int) int
   public int method_50(int var1) {
      try {
         return 1344358763 * this.field_2442;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "en.v(" + ')');
      }
   }
}
