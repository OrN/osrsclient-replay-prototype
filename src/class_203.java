import java.io.IOException;

// $FF: renamed from: ds
public class class_203 {

   // $FF: renamed from: c hl
   class_263 field_2370;
   // $FF: renamed from: n ki
   class_323 field_2371;
   // $FF: renamed from: u int
   int field_2372;
   // $FF: renamed from: y nd
   Buffer field_2373;
   // $FF: renamed from: v ls
   class_206 field_2374;
   // $FF: renamed from: j nb
   class_29 field_2375;
   // $FF: renamed from: r hl
   class_263 field_2376;
   // $FF: renamed from: ar int
   static final int field_2377 = 19137016;
   // $FF: renamed from: d boolean
   boolean field_2378;
   // $FF: renamed from: s int
   int field_2379;
   // $FF: renamed from: b int
   int field_2380;
   // $FF: renamed from: l hl
   class_263 field_2381;
   // $FF: renamed from: o hl
   class_263 field_2382;
   // $FF: renamed from: f int
   int field_2383;
   // $FF: renamed from: p oy
   public class_404 field_2384;
   // $FF: renamed from: by int
   public static final int field_2385 = 97;
   // $FF: renamed from: av java.lang.String
   protected static String field_2386;


   // $FF: renamed from: n (int) void
   final void method_4076(int var1) throws IOException {
      try {
         if(this.field_2374 != null) {
            if(var1 != -1875758370) {
               throw new IllegalStateException();
            }

            if(-432974383 * this.field_2383 > 0) {
               if(var1 != -1875758370) {
                  throw new IllegalStateException();
               }

               this.field_2373.offset = 0;

               while(true) {
                  class_40 var2 = (class_40)this.field_2371.method_5700();
                  if(var2 == null) {
                     if(var1 != -1875758370) {
                        throw new IllegalStateException();
                     }
                     break;
                  }

                  if(var2.field_264 * -2120774193 > this.field_2373.data.length - -442398587 * this.field_2373.offset) {
                     if(var1 != -1875758370) {
                        throw new IllegalStateException();
                     }
                     break;
                  }

                  this.field_2373.method_161(var2.field_263.data, 0, -2120774193 * var2.field_264);
                  this.field_2383 -= var2.field_264 * -1686998625;
                  var2.method_108();
                  var2.field_263.method_112((byte)32);
                  var2.method_471((byte)100);
               }

               this.field_2374.method_4132(this.field_2373.data, 0, this.field_2373.offset * -442398587);
               this.field_2372 = 0;
            }
         }

      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: v (int) void
   final void method_4077() {
      try {
         this.field_2371.method_5696();
         this.field_2383 = 0;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: v (jv, byte) void
   public static void method_4078(class_306 var0) {
      try {
         class_84.field_783 = var0;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: f (hq, int) void
   public final void method_4079(class_40 var1) {
      try {
         this.field_2371.method_5697(var1);
         var1.field_264 = var1.field_263.offset * 985550187;
         var1.field_263.offset = 0;
         this.field_2383 += var1.field_264 * -1686998625;
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: y (ls, int) void
   void method_4080(class_206 var1) {
      try {
         this.field_2374 = var1;
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: e () void
   void method_4081() {
      if(this.field_2374 != null) {
         this.field_2374.method_4123(2139532504);
         this.field_2374 = null;
      }

   }

   // $FF: renamed from: j (int) void
   void method_4082() {
      try {
         this.field_2374 = null;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: r (int) ls
   class_206 method_4083() {
      try {
         return this.field_2374;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: b () void
   final void method_4084() {
      this.field_2371.method_5696();
      this.field_2383 = 0;
   }

   // $FF: renamed from: d () void
   final void method_4085() {
      this.field_2371.method_5696();
      this.field_2383 = 0;
   }

   // $FF: renamed from: l (hq) void
   public final void method_4086(class_40 var1) {
      this.field_2371.method_5697(var1);
      var1.field_264 = var1.field_263.offset * 985550187;
      var1.field_263.offset = 0;
      this.field_2383 += var1.field_264 * -1686998625;
   }

   // $FF: renamed from: m () ls
   class_206 method_4087() {
      return this.field_2374;
   }

   // $FF: renamed from: a () void
   void method_4088() {
      this.field_2374 = null;
   }

   // $FF: renamed from: o (ls) void
   void method_4089(class_206 var1) {
      this.field_2374 = var1;
   }

   // $FF: renamed from: c (ls) void
   void method_4090(class_206 var1) {
      this.field_2374 = var1;
   }

   // $FF: renamed from: <init> () void
   class_203() {
      super();
      try {
         class_323 var10001 = new class_323();
         this.field_2371 = var10001;
         this.field_2383 = 0;
         Buffer var2 = new Buffer(5000);
         this.field_2373 = var2;
         class_29 var3 = new class_29('\u9c40');
         this.field_2375 = var3;
         this.field_2376 = null;
         this.field_2380 = 0;
         this.field_2378 = true;
         this.field_2379 = 0;
         this.field_2372 = 0;
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1);
      }
   }

   // $FF: renamed from: g () void
   void method_4092() {
      if(this.field_2374 != null) {
         this.field_2374.method_4123(2093924496);
         this.field_2374 = null;
      }

   }

   // $FF: renamed from: u () void
   final void method_4093() throws IOException {
      if(this.field_2374 != null && -432974383 * this.field_2383 > 0) {
         this.field_2373.offset = 0;

         while(true) {
            class_40 var1 = (class_40)this.field_2371.method_5700();
            if(var1 == null || var1.field_264 * -1952245086 > this.field_2373.data.length - -442398587 * this.field_2373.offset) {
               this.field_2374.method_4132(this.field_2373.data, 0, this.field_2373.offset * -442398587);
               this.field_2372 = 0;
               break;
            }

            this.field_2373.method_161(var1.field_263.data, 0, -2120774193 * var1.field_264);
            this.field_2383 -= var1.field_264 * -1686998625;
            var1.method_108();
            var1.field_263.method_112((byte)114);
            var1.method_471((byte)38);
         }
      }

   }

   // $FF: renamed from: k () void
   void method_4094() {
      this.field_2374 = null;
   }

   // $FF: renamed from: s () void
   final void method_4095() throws IOException {
      if(this.field_2374 != null && -432974383 * this.field_2383 > 0) {
         this.field_2373.offset = 0;

         while(true) {
            class_40 var1 = (class_40)this.field_2371.method_5700();
            if(var1 == null || var1.field_264 * 656199849 > this.field_2373.data.length - -442398587 * this.field_2373.offset) {
               this.field_2374.method_4132(this.field_2373.data, 0, this.field_2373.offset * -442398587);
               this.field_2372 = 0;
               break;
            }

            this.field_2373.method_161(var1.field_263.data, 0, -1427645537 * var1.field_264);
            this.field_2383 -= var1.field_264 * -1736269188;
            var1.method_108();
            var1.field_263.method_112((byte)103);
            var1.method_471((byte)106);
         }
      }

   }

   // $FF: renamed from: x () ls
   class_206 method_4096() {
      return this.field_2374;
   }

   // $FF: renamed from: ky (int, int) void
   static final void method_4097(int var0, int var1) {
      try {
         var0 = Math.min(Math.max(var0, 0), 255);
         if(var0 != class_87.preferences.field_2122 * 1285356667) {
            if(var1 >= 1595817046) {
               throw new IllegalStateException();
            }

            label46: {
               if(0 == 1285356667 * class_87.preferences.field_2122) {
                  if(var1 >= 1595817046) {
                     throw new IllegalStateException();
                  }

                  if(-1 != 2076100495 * client.field_1656) {
                     if(var1 >= 1595817046) {
                        throw new IllegalStateException();
                     }

                     class_162.method_3399(class_194.field_2307, 2076100495 * client.field_1656, 0, var0, false);
                     client.field_1657 = false;
                     break label46;
                  }
               }

               if(0 == var0) {
                  if(var1 >= 1595817046) {
                     throw new IllegalStateException();
                  }

                  class_198.field_2339.method_1962();
                  class_270.field_3180 = 1262412465;
                  class_271.field_3186 = null;
                  client.field_1657 = false;
               } else if(-1481365935 * class_270.field_3180 != 0) {
                  if(var1 >= 1595817046) {
                     return;
                  }

                  class_270.field_3181 = 2118204629 * var0;
               } else {
                  class_198.field_2339.method_1985(var0);
               }
            }

            class_87.preferences.field_2122 = var0 * -813727053;
            class_94.savePreferences(-958210169);
         }

      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: p (byte) void
   void method_4098() {
      try {
         if(this.field_2374 != null) {
            this.field_2374.method_4123(2121257738);
            this.field_2374 = null;
         }

      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: v (cz, byte) void
   public static void method_4099(class_45 var0) {
      try {
         class_149.method_3180(var0, 500000, 475000, 704254621);
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }
}
