
// $FF: renamed from: oy
public final class class_404 {

   // $FF: renamed from: p int[]
   int[] field_4280;
   // $FF: renamed from: n int
   static final int field_4281 = 256;
   // $FF: renamed from: j int[]
   int[] field_4282;
   // $FF: renamed from: y int
   int field_4283;
   // $FF: renamed from: f int
   static final int field_4284 = 1020;
   // $FF: renamed from: v int
   static final int field_4285 = 8;
   // $FF: renamed from: r int
   int field_4286;
   // $FF: renamed from: b int
   int field_4287;
   // $FF: renamed from: d int
   int field_4288;


   // $FF: renamed from: d () void
   final void method_6840() {
      int var9 = -1640531527;
      int var8 = -1640531527;
      int var7 = -1640531527;
      int var6 = -1640531527;
      int var5 = -1640531527;
      int var4 = -1640531527;
      int var3 = -1640531527;
      int var2 = -1640531527;

      int var1;
      for(var1 = 0; var1 < 4; ++var1) {
         var2 ^= var3 << 11;
         var5 += var2;
         var3 += var4;
         var3 ^= var4 >>> 2;
         var6 += var3;
         var4 += var5;
         var4 ^= var5 << 8;
         var7 += var4;
         var5 += var6;
         var5 ^= var6 >>> 16;
         var8 += var5;
         var6 += var7;
         var6 ^= var7 << 10;
         var9 += var6;
         var7 += var8;
         var7 ^= var8 >>> 4;
         var2 += var7;
         var8 += var9;
         var8 ^= var9 << 8;
         var3 += var8;
         var9 += var2;
         var9 ^= var2 >>> 9;
         var4 += var9;
         var2 += var3;
      }

      for(var1 = 0; var1 < 256; var1 += 8) {
         var2 += this.field_4280[var1];
         var3 += this.field_4280[var1 + 1];
         var4 += this.field_4280[2 + var1];
         var5 += this.field_4280[3 + var1];
         var6 += this.field_4280[var1 + 4];
         var7 += this.field_4280[5 + var1];
         var8 += this.field_4280[6 + var1];
         var9 += this.field_4280[7 + var1];
         var2 ^= var3 << 11;
         var5 += var2;
         var3 += var4;
         var3 ^= var4 >>> 2;
         var6 += var3;
         var4 += var5;
         var4 ^= var5 << 8;
         var7 += var4;
         var5 += var6;
         var5 ^= var6 >>> 16;
         var8 += var5;
         var6 += var7;
         var6 ^= var7 << 10;
         var9 += var6;
         var7 += var8;
         var7 ^= var8 >>> 4;
         var2 += var7;
         var8 += var9;
         var8 ^= var9 << 8;
         var3 += var8;
         var9 += var2;
         var9 ^= var2 >>> 9;
         var4 += var9;
         var2 += var3;
         this.field_4282[var1] = var2;
         this.field_4282[var1 + 1] = var3;
         this.field_4282[var1 + 2] = var4;
         this.field_4282[var1 + 3] = var5;
         this.field_4282[4 + var1] = var6;
         this.field_4282[var1 + 5] = var7;
         this.field_4282[6 + var1] = var8;
         this.field_4282[7 + var1] = var9;
      }

      for(var1 = 0; var1 < 256; var1 += 8) {
         var2 += this.field_4282[var1];
         var3 += this.field_4282[1 + var1];
         var4 += this.field_4282[var1 + 2];
         var5 += this.field_4282[3 + var1];
         var6 += this.field_4282[4 + var1];
         var7 += this.field_4282[var1 + 5];
         var8 += this.field_4282[var1 + 6];
         var9 += this.field_4282[var1 + 7];
         var2 ^= var3 << 11;
         var5 += var2;
         var3 += var4;
         var3 ^= var4 >>> 2;
         var6 += var3;
         var4 += var5;
         var4 ^= var5 << 8;
         var7 += var4;
         var5 += var6;
         var5 ^= var6 >>> 16;
         var8 += var5;
         var6 += var7;
         var6 ^= var7 << 10;
         var9 += var6;
         var7 += var8;
         var7 ^= var8 >>> 4;
         var2 += var7;
         var8 += var9;
         var8 ^= var9 << 8;
         var3 += var8;
         var9 += var2;
         var9 ^= var2 >>> 9;
         var4 += var9;
         var2 += var3;
         this.field_4282[var1] = var2;
         this.field_4282[1 + var1] = var3;
         this.field_4282[var1 + 2] = var4;
         this.field_4282[var1 + 3] = var5;
         this.field_4282[var1 + 4] = var6;
         this.field_4282[5 + var1] = var7;
         this.field_4282[6 + var1] = var8;
         this.field_4282[var1 + 7] = var9;
      }

      this.method_6846(-1541498529);
      this.field_4283 = 1179571456;
   }

   // $FF: renamed from: v (byte) int
   public final int method_6841(byte var1) {
      try {
         if(0 == this.field_4283 * -21857667) {
            if(var1 <= 2) {
               throw new IllegalStateException();
            }

            this.method_6846(-2083438988);
            this.field_4283 = 1179571456;
         }

         return this.field_4280[(this.field_4283 -= -297382187) * -21857667];
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "oy.v(" + ')');
      }
   }

   // $FF: renamed from: n (byte) int
   public final int method_6842(byte var1) {
      try {
         if(0 == this.field_4283 * -21857667) {
            if(var1 >= -1) {
               throw new IllegalStateException();
            }

            this.method_6846(411591901);
            this.field_4283 = 1179571456;
         }

         return this.field_4280[this.field_4283 * -21857667 - 1];
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "oy.n(" + ')');
      }
   }

   // $FF: renamed from: s (io, int, int, int, byte) void
   static final void method_6843(class_37 var0, int var1, int var2, int var3, byte var4) {
      try {
         if(null == var0.field_178) {
            if(var4 >= 1) {
               throw new IllegalStateException();
            } else {
               throw new RuntimeException();
            }
         } else {
            var0.field_178[var1] = var2;
            var0.field_222[var1] = var3;
         }
      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5, "oy.s(" + ')');
      }
   }

   // $FF: renamed from: y (short) void
   final void method_6844(short var1) {
      try {
         int var10 = -1640531527;
         int var9 = -1640531527;
         int var8 = -1640531527;
         int var7 = -1640531527;
         int var6 = -1640531527;
         int var5 = -1640531527;
         int var4 = -1640531527;
         int var3 = -1640531527;

         int var2;
         for(var2 = 0; var2 < 4; ++var2) {
            var3 ^= var4 << 11;
            var6 += var3;
            var4 += var5;
            var4 ^= var5 >>> 2;
            var7 += var4;
            var5 += var6;
            var5 ^= var6 << 8;
            var8 += var5;
            var6 += var7;
            var6 ^= var7 >>> 16;
            var9 += var6;
            var7 += var8;
            var7 ^= var8 << 10;
            var10 += var7;
            var8 += var9;
            var8 ^= var9 >>> 4;
            var3 += var8;
            var9 += var10;
            var9 ^= var10 << 8;
            var4 += var9;
            var10 += var3;
            var10 ^= var3 >>> 9;
            var5 += var10;
            var3 += var4;
         }

         for(var2 = 0; var2 < 256; var2 += 8) {
            if(var1 != 128) {
               throw new IllegalStateException();
            }

            var3 += this.field_4280[var2];
            var4 += this.field_4280[var2 + 1];
            var5 += this.field_4280[2 + var2];
            var6 += this.field_4280[3 + var2];
            var7 += this.field_4280[var2 + 4];
            var8 += this.field_4280[5 + var2];
            var9 += this.field_4280[6 + var2];
            var10 += this.field_4280[7 + var2];
            var3 ^= var4 << 11;
            var6 += var3;
            var4 += var5;
            var4 ^= var5 >>> 2;
            var7 += var4;
            var5 += var6;
            var5 ^= var6 << 8;
            var8 += var5;
            var6 += var7;
            var6 ^= var7 >>> 16;
            var9 += var6;
            var7 += var8;
            var7 ^= var8 << 10;
            var10 += var7;
            var8 += var9;
            var8 ^= var9 >>> 4;
            var3 += var8;
            var9 += var10;
            var9 ^= var10 << 8;
            var4 += var9;
            var10 += var3;
            var10 ^= var3 >>> 9;
            var5 += var10;
            var3 += var4;
            this.field_4282[var2] = var3;
            this.field_4282[var2 + 1] = var4;
            this.field_4282[var2 + 2] = var5;
            this.field_4282[var2 + 3] = var6;
            this.field_4282[4 + var2] = var7;
            this.field_4282[var2 + 5] = var8;
            this.field_4282[6 + var2] = var9;
            this.field_4282[7 + var2] = var10;
         }

         for(var2 = 0; var2 < 256; var2 += 8) {
            if(var1 != 128) {
               throw new IllegalStateException();
            }

            var3 += this.field_4282[var2];
            var4 += this.field_4282[1 + var2];
            var5 += this.field_4282[var2 + 2];
            var6 += this.field_4282[3 + var2];
            var7 += this.field_4282[4 + var2];
            var8 += this.field_4282[var2 + 5];
            var9 += this.field_4282[var2 + 6];
            var10 += this.field_4282[var2 + 7];
            var3 ^= var4 << 11;
            var6 += var3;
            var4 += var5;
            var4 ^= var5 >>> 2;
            var7 += var4;
            var5 += var6;
            var5 ^= var6 << 8;
            var8 += var5;
            var6 += var7;
            var6 ^= var7 >>> 16;
            var9 += var6;
            var7 += var8;
            var7 ^= var8 << 10;
            var10 += var7;
            var8 += var9;
            var8 ^= var9 >>> 4;
            var3 += var8;
            var9 += var10;
            var9 ^= var10 << 8;
            var4 += var9;
            var10 += var3;
            var10 ^= var3 >>> 9;
            var5 += var10;
            var3 += var4;
            this.field_4282[var2] = var3;
            this.field_4282[1 + var2] = var4;
            this.field_4282[var2 + 2] = var5;
            this.field_4282[var2 + 3] = var6;
            this.field_4282[var2 + 4] = var7;
            this.field_4282[5 + var2] = var8;
            this.field_4282[6 + var2] = var9;
            this.field_4282[var2 + 7] = var10;
         }

         this.method_6846(919752243);
         this.field_4283 = 1179571456;
      } catch (RuntimeException var11) {
         throw class_223.method_4281(var11, "oy.y(" + ')');
      }
   }

   // $FF: renamed from: b () void
   final void method_6845() {
      int var9 = -1640531527;
      int var8 = -1640531527;
      int var7 = -1640531527;
      int var6 = -1640531527;
      int var5 = -1640531527;
      int var4 = -1640531527;
      int var3 = -1640531527;
      int var2 = -1640531527;

      int var1;
      for(var1 = 0; var1 < 4; ++var1) {
         var2 ^= var3 << 11;
         var5 += var2;
         var3 += var4;
         var3 ^= var4 >>> 2;
         var6 += var3;
         var4 += var5;
         var4 ^= var5 << 8;
         var7 += var4;
         var5 += var6;
         var5 ^= var6 >>> 16;
         var8 += var5;
         var6 += var7;
         var6 ^= var7 << 10;
         var9 += var6;
         var7 += var8;
         var7 ^= var8 >>> 4;
         var2 += var7;
         var8 += var9;
         var8 ^= var9 << 8;
         var3 += var8;
         var9 += var2;
         var9 ^= var2 >>> 9;
         var4 += var9;
         var2 += var3;
      }

      for(var1 = 0; var1 < 256; var1 += 8) {
         var2 += this.field_4280[var1];
         var3 += this.field_4280[var1 + 1];
         var4 += this.field_4280[2 + var1];
         var5 += this.field_4280[3 + var1];
         var6 += this.field_4280[var1 + 4];
         var7 += this.field_4280[5 + var1];
         var8 += this.field_4280[6 + var1];
         var9 += this.field_4280[7 + var1];
         var2 ^= var3 << 11;
         var5 += var2;
         var3 += var4;
         var3 ^= var4 >>> 2;
         var6 += var3;
         var4 += var5;
         var4 ^= var5 << 8;
         var7 += var4;
         var5 += var6;
         var5 ^= var6 >>> 16;
         var8 += var5;
         var6 += var7;
         var6 ^= var7 << 10;
         var9 += var6;
         var7 += var8;
         var7 ^= var8 >>> 4;
         var2 += var7;
         var8 += var9;
         var8 ^= var9 << 8;
         var3 += var8;
         var9 += var2;
         var9 ^= var2 >>> 9;
         var4 += var9;
         var2 += var3;
         this.field_4282[var1] = var2;
         this.field_4282[var1 + 1] = var3;
         this.field_4282[var1 + 2] = var4;
         this.field_4282[var1 + 3] = var5;
         this.field_4282[4 + var1] = var6;
         this.field_4282[var1 + 5] = var7;
         this.field_4282[6 + var1] = var8;
         this.field_4282[7 + var1] = var9;
      }

      for(var1 = 0; var1 < 256; var1 += 8) {
         var2 += this.field_4282[var1];
         var3 += this.field_4282[1 + var1];
         var4 += this.field_4282[var1 + 2];
         var5 += this.field_4282[3 + var1];
         var6 += this.field_4282[4 + var1];
         var7 += this.field_4282[var1 + 5];
         var8 += this.field_4282[var1 + 6];
         var9 += this.field_4282[var1 + 7];
         var2 ^= var3 << 11;
         var5 += var2;
         var3 += var4;
         var3 ^= var4 >>> 2;
         var6 += var3;
         var4 += var5;
         var4 ^= var5 << 8;
         var7 += var4;
         var5 += var6;
         var5 ^= var6 >>> 16;
         var8 += var5;
         var6 += var7;
         var6 ^= var7 << 10;
         var9 += var6;
         var7 += var8;
         var7 ^= var8 >>> 4;
         var2 += var7;
         var8 += var9;
         var8 ^= var9 << 8;
         var3 += var8;
         var9 += var2;
         var9 ^= var2 >>> 9;
         var4 += var9;
         var2 += var3;
         this.field_4282[var1] = var2;
         this.field_4282[1 + var1] = var3;
         this.field_4282[var1 + 2] = var4;
         this.field_4282[var1 + 3] = var5;
         this.field_4282[var1 + 4] = var6;
         this.field_4282[5 + var1] = var7;
         this.field_4282[6 + var1] = var8;
         this.field_4282[var1 + 7] = var9;
      }

      this.method_6846(-817659997);
      this.field_4283 = 1179571456;
   }

   // $FF: renamed from: f (int) void
   final void method_6846(int var1) {
      try {
         this.field_4287 += (this.field_4288 += -244906501) * -657166955;

         for(int var2 = 0; var2 < 256; ++var2) {
            if(var1 >= 965227206) {
               throw new IllegalStateException();
            }

            int var3 = this.field_4282[var2];
            if(0 == (var2 & 2)) {
               if((var2 & 1) == 0) {
                  if(var1 >= 965227206) {
                     return;
                  }

                  this.field_4286 = 2081310385 * (this.field_4286 * 2044871249 ^ 2044871249 * this.field_4286 << 13);
               } else {
                  this.field_4286 = 2081310385 * (this.field_4286 * 2044871249 ^ 2044871249 * this.field_4286 >>> 6);
               }
            } else if((var2 & 1) == 0) {
               if(var1 >= 965227206) {
                  throw new IllegalStateException();
               }

               this.field_4286 = (this.field_4286 * 2044871249 ^ 2044871249 * this.field_4286 << 2) * 2081310385;
            } else {
               this.field_4286 = 2081310385 * (2044871249 * this.field_4286 ^ 2044871249 * this.field_4286 >>> 16);
            }

            this.field_4286 += 2081310385 * this.field_4282[128 + var2 & 255];
            int var4;
            this.field_4282[var2] = var4 = this.field_4286 * 2044871249 + this.field_4282[(var3 & 1020) >> 2] + this.field_4287 * 1090157991;
            this.field_4280[var2] = (this.field_4287 = (var3 + this.field_4282[(var4 >> 8 & 1020) >> 2]) * 442391063) * 1090157991;
         }

      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5, "oy.f(" + ')');
      }
   }

   // $FF: renamed from: r () int
   public final int method_6847() {
      if(0 == this.field_4283 * -21857667) {
         this.method_6846(660143082);
         this.field_4283 = 1179571456;
      }

      return this.field_4280[this.field_4283 * -21857667 - 1];
   }

   // $FF: renamed from: j () int
   public final int method_6848() {
      if(0 == this.field_4283 * -21857667) {
         this.method_6846(-1799144783);
         this.field_4283 = 1179571456;
      }

      return this.field_4280[(this.field_4283 -= -297382187) * -21857667];
   }

   // $FF: renamed from: p () int
   public final int method_6849() {
      if(0 == this.field_4283 * -21857667) {
         this.method_6846(-1852239029);
         this.field_4283 = 1179571456;
      }

      return this.field_4280[(this.field_4283 -= -297382187) * -21857667];
   }

   // $FF: renamed from: s () void
   final void method_6850() {
      int var9 = -1640531527;
      int var8 = -1640531527;
      int var7 = -1640531527;
      int var6 = -1640531527;
      int var5 = -1640531527;
      int var4 = -1640531527;
      int var3 = -1640531527;
      int var2 = -1640531527;

      int var1;
      for(var1 = 0; var1 < 4; ++var1) {
         var2 ^= var3 << 11;
         var5 += var2;
         var3 += var4;
         var3 ^= var4 >>> 2;
         var6 += var3;
         var4 += var5;
         var4 ^= var5 << 8;
         var7 += var4;
         var5 += var6;
         var5 ^= var6 >>> 16;
         var8 += var5;
         var6 += var7;
         var6 ^= var7 << 10;
         var9 += var6;
         var7 += var8;
         var7 ^= var8 >>> 4;
         var2 += var7;
         var8 += var9;
         var8 ^= var9 << 8;
         var3 += var8;
         var9 += var2;
         var9 ^= var2 >>> 9;
         var4 += var9;
         var2 += var3;
      }

      for(var1 = 0; var1 < 256; var1 += 8) {
         var2 += this.field_4280[var1];
         var3 += this.field_4280[var1 + 1];
         var4 += this.field_4280[2 + var1];
         var5 += this.field_4280[3 + var1];
         var6 += this.field_4280[var1 + 4];
         var7 += this.field_4280[5 + var1];
         var8 += this.field_4280[6 + var1];
         var9 += this.field_4280[7 + var1];
         var2 ^= var3 << 11;
         var5 += var2;
         var3 += var4;
         var3 ^= var4 >>> 2;
         var6 += var3;
         var4 += var5;
         var4 ^= var5 << 8;
         var7 += var4;
         var5 += var6;
         var5 ^= var6 >>> 16;
         var8 += var5;
         var6 += var7;
         var6 ^= var7 << 10;
         var9 += var6;
         var7 += var8;
         var7 ^= var8 >>> 4;
         var2 += var7;
         var8 += var9;
         var8 ^= var9 << 8;
         var3 += var8;
         var9 += var2;
         var9 ^= var2 >>> 9;
         var4 += var9;
         var2 += var3;
         this.field_4282[var1] = var2;
         this.field_4282[var1 + 1] = var3;
         this.field_4282[var1 + 2] = var4;
         this.field_4282[var1 + 3] = var5;
         this.field_4282[4 + var1] = var6;
         this.field_4282[var1 + 5] = var7;
         this.field_4282[6 + var1] = var8;
         this.field_4282[7 + var1] = var9;
      }

      for(var1 = 0; var1 < 256; var1 += 8) {
         var2 += this.field_4282[var1];
         var3 += this.field_4282[1 + var1];
         var4 += this.field_4282[var1 + 2];
         var5 += this.field_4282[3 + var1];
         var6 += this.field_4282[4 + var1];
         var7 += this.field_4282[var1 + 5];
         var8 += this.field_4282[var1 + 6];
         var9 += this.field_4282[var1 + 7];
         var2 ^= var3 << 11;
         var5 += var2;
         var3 += var4;
         var3 ^= var4 >>> 2;
         var6 += var3;
         var4 += var5;
         var4 ^= var5 << 8;
         var7 += var4;
         var5 += var6;
         var5 ^= var6 >>> 16;
         var8 += var5;
         var6 += var7;
         var6 ^= var7 << 10;
         var9 += var6;
         var7 += var8;
         var7 ^= var8 >>> 4;
         var2 += var7;
         var8 += var9;
         var8 ^= var9 << 8;
         var3 += var8;
         var9 += var2;
         var9 ^= var2 >>> 9;
         var4 += var9;
         var2 += var3;
         this.field_4282[var1] = var2;
         this.field_4282[1 + var1] = var3;
         this.field_4282[var1 + 2] = var4;
         this.field_4282[var1 + 3] = var5;
         this.field_4282[var1 + 4] = var6;
         this.field_4282[5 + var1] = var7;
         this.field_4282[6 + var1] = var8;
         this.field_4282[var1 + 7] = var9;
      }

      this.method_6846(908344298);
      this.field_4283 = 1179571456;
   }

   // $FF: renamed from: <init> (int[]) void
   public class_404(int[] var1) {
      super();
      try {
         this.field_4282 = new int[256];
         this.field_4280 = new int[256];

         for(int var2 = 0; var2 < var1.length; ++var2) {
            this.field_4280[var2] = var1[var2];
         }

         this.method_6844((short)128);
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3, "oy.<init>(" + ')');
      }
   }
}
