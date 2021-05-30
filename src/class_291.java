
// $FF: renamed from: iy
public class class_291 {

   // $FF: renamed from: n int
   public static final int field_3312 = 6;
   // $FF: renamed from: v int
   public static final int field_3313 = 2;
   // $FF: renamed from: f int
   public static final int field_3314 = 15;
   // $FF: renamed from: y int
   public static final int field_3315 = 22;
   // $FF: renamed from: bo int
   static final int field_3316 = 87;
   // $FF: renamed from: r int
   public static final int field_3317 = 32;
   // $FF: renamed from: c int
   public static final int field_3318 = 64;
   // $FF: renamed from: e int
   public static final int field_3319 = 68;
   // $FF: renamed from: m int
   public static final int field_3320 = 35;
   // $FF: renamed from: s int
   public static final int field_3321 = 55;


   // $FF: renamed from: <init> () void
   class_291() throws Throwable {
      super();
      try {
         throw new Error();
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1);
      }
   }

   // $FF: renamed from: y (int) jn[]
   public static class_304[] method_5294() {
      try {
         return new class_304[]{class_304.field_3400, class_304.field_3397, class_304.field_3398, class_304.field_3399};
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1);
      }
   }

   // $FF: renamed from: kl (io, int) void
   static final void method_5295(class_37 var0, int var1) {
      try {
         int var2 = var0.field_207 * -1245218361;
         if(var2 == 324) {
            if(client.field_1684 * 909671199 == -1) {
               if(var1 <= -188588689) {
                  return;
               }

               client.field_1684 = var0.field_179 * -679690841;
               client.field_1528 = var0.field_236 * 315209361;
            }

            if(client.field_1613.field_3208) {
               if(var1 <= -188588689) {
                  throw new IllegalStateException();
               }

               var0.field_179 = client.field_1684 * 607656471;
            } else {
               var0.field_179 = -384996671 * client.field_1528;
            }

         } else if(var2 == 325) {
            if(var1 <= -188588689) {
               throw new IllegalStateException();
            } else {
               if(909671199 * client.field_1684 == -1) {
                  if(var1 <= -188588689) {
                     return;
                  }

                  client.field_1684 = -679690841 * var0.field_179;
                  client.field_1528 = 315209361 * var0.field_236;
               }

               if(client.field_1613.field_3208) {
                  var0.field_179 = client.field_1528 * -384996671;
               } else {
                  var0.field_179 = 607656471 * client.field_1684;
               }

            }
         } else if(var2 == 327) {
            if(var1 <= -188588689) {
               throw new IllegalStateException();
            } else {
               var0.field_142 = -504120262;
               var0.field_153 = ((int)(Math.sin((double)(-1702273423 * client.field_1425) / 40.0D) * 256.0D) & 2047) * -1507467001;
               var0.field_144 = 926292455;
               var0.field_145 = 0;
            }
         } else if(var2 == 328) {
            if(var1 <= -188588689) {
               throw new IllegalStateException();
            } else {
               var0.field_142 = -504120262;
               var0.field_153 = ((int)(Math.sin((double)(-1702273423 * client.field_1425) / 40.0D) * 256.0D) & 2047) * -1507467001;
               var0.field_144 = 926292455;
               var0.field_145 = -252507035;
            }
         }
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: v (long) java.lang.String
   public static String method_5296(long var0) {
      try {
         if(var0 > 0L && var0 < 6582952005840035281L) {
            if(var0 % 37L == 0L) {
               return null;
            } else {
               int var2 = 0;

               for(long var3 = var0; 0L != var3; var3 /= 37L) {
                  ++var2;
               }

               StringBuilder var5;
               char var8;
               for(var5 = new StringBuilder(var2); 0L != var0; var5.append(var8)) {
                  long var6 = var0;
                  var0 /= 37L;
                  var8 = class_332.field_3862[(int)(var6 - 37L * var0)];
                  if(95 == var8) {
                     int var9 = var5.length() - 1;
                     var5.setCharAt(var9, Character.toUpperCase(var5.charAt(var9)));
                     var8 = 160;
                  }
               }

               var5.reverse();
               var5.setCharAt(0, Character.toUpperCase(var5.charAt(0)));
               return var5.toString();
            }
         } else {
            return null;
         }
      } catch (RuntimeException var10) {
         throw class_223.method_4281(var10);
      }
   }
}
