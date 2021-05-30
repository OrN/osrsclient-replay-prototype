
// $FF: renamed from: ck
public class class_169 {

   // $FF: renamed from: o int
   public static final int field_2104 = 43;
   // $FF: renamed from: n jp
   final class_307 field_2105;
   // $FF: renamed from: f int
   final int field_2106;
   // $FF: renamed from: y int
   int field_2107;
   // $FF: renamed from: bh int
   public static final int field_2108 = 1009;
   // $FF: renamed from: bs int
   public static final int field_2109 = 1010;
   // $FF: renamed from: ae int
   static final int field_2110 = 0;
   // $FF: renamed from: v int
   static final int field_2111 = 10000;
   // $FF: renamed from: ab int
   static final int field_2112 = 34;
   // $FF: renamed from: m y
   static class_44 field_2113;
   // $FF: renamed from: ho oh[]
   static class_67[] field_2114;


   // $FF: renamed from: a (int, int, int, int, int, int, int, int) boolean
   static final boolean method_3614(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      try {
         int var8 = var6 + 1131754581 * class_255.field_2877;
         if(var8 < var0 && var8 < var1) {
            if(var7 != 1961168244) {
               throw new IllegalStateException();
            }

            if(var8 < var2) {
               if(var7 != 1961168244) {
                  throw new IllegalStateException();
               }

               return false;
            }
         }

         var8 = class_255.field_2877 * 1131754581 - var6;
         if(var8 > var0) {
            if(var7 != 1961168244) {
               throw new IllegalStateException();
            }

            if(var8 > var1 && var8 > var2) {
               if(var7 != 1961168244) {
                  throw new IllegalStateException();
               }

               return false;
            }
         }

         var8 = 836373803 * class_255.field_2881 + var6;
         if(var8 < var3 && var8 < var4 && var8 < var5) {
            return false;
         } else {
            var8 = 836373803 * class_255.field_2881 - var6;
            if(var8 > var3) {
               if(var7 != 1961168244) {
                  throw new IllegalStateException();
               }

               if(var8 > var4 && var8 > var5) {
                  return false;
               }
            }

            return true;
         }
      } catch (RuntimeException var9) {
         throw class_223.method_4281(var9, "ck.a(" + ')');
      }
   }

   // $FF: renamed from: v (byte) boolean
   boolean method_3615(byte var1) {
      try {
         this.field_2107 = 0;

         for(int var2 = 0; var2 < 605141689 * this.field_2106; ++var2) {
            if(var1 >= 34) {
               throw new IllegalStateException();
            }

            if(this.field_2105.method_5503(var2, -1677083054)) {
               if(var1 >= 34) {
                  throw new IllegalStateException();
               }

               if(!this.field_2105.method_5500(var2, 510058915)) {
                  continue;
               }

               if(var1 >= 34) {
                  throw new IllegalStateException();
               }
            }

            this.field_2107 += -529113033;
         }

         boolean var10000;
         if(-1897441913 * this.field_2107 >= 605141689 * this.field_2106) {
            if(var1 >= 34) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3, "ck.v(" + ')');
      }
   }

   // $FF: renamed from: <init> (jp, java.lang.String) void
   void method_3616(class_307 var1, String var2) {
      try {
         super();
         this.field_2107 = 0;
         this.field_2105 = var1;
         this.field_2106 = var1.method_5457(585354532) * -296342647;
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3, "ck.<init>(" + ')');
      }
   }

   // $FF: renamed from: f () boolean
   boolean method_3617() {
      this.field_2107 = 0;

      for(int var1 = 0; var1 < -398395974 * this.field_2106; ++var1) {
         if(!this.field_2105.method_5503(var1, -1677083054) || this.field_2105.method_5500(var1, 14775761)) {
            this.field_2107 += -529113033;
         }
      }

      return -518539835 * this.field_2107 >= -1463938086 * this.field_2106;
   }

   // $FF: renamed from: n (int, int) ei
   public static class_85 method_3618(int var0, int var1) {
      try {
         class_85 var2 = (class_85)class_85.field_787.method_5065((long)var0);
         if(var2 != null) {
            return var2;
         } else {
            byte[] var3 = class_85.field_786.method_5381(34, var0, -26460885);
            class_85 var10000 = new class_85;
            var10000.method_105();
            var2 = var10000;
            if(var3 != null) {
               if(var1 == 74066814) {
                  throw new IllegalStateException();
               }

               class_28 var10001 = new class_28;
               var10001.method_178(var3);
               var2.method_1431(var10001, -32029901);
            }

            var2.method_1450(1000000);
            class_85.field_787.method_5064(var2, (long)var0);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4, "ck.n(" + ')');
      }
   }

   // $FF: renamed from: n () boolean
   boolean method_3619() {
      this.field_2107 = 0;

      for(int var1 = 0; var1 < 605141689 * this.field_2106; ++var1) {
         if(!this.field_2105.method_5503(var1, -1677083054) || this.field_2105.method_5500(var1, -1365488340)) {
            this.field_2107 += -529113033;
         }
      }

      return -1897441913 * this.field_2107 >= 605141689 * this.field_2106;
   }
}
