
// $FF: renamed from: oh
public final class class_67 extends class_65 {

   // $FF: renamed from: u int
   static final int field_499 = 12;
   // $FF: renamed from: f int
   public int field_500;
   // $FF: renamed from: j int
   public int field_501;
   // $FF: renamed from: v int[]
   public int[] field_502;
   // $FF: renamed from: p int
   int field_503;
   // $FF: renamed from: y int
   public int field_504;
   // $FF: renamed from: r int
   public int field_505;
   // $FF: renamed from: b int
   static final int field_506 = 4;
   // $FF: renamed from: d int
   static final int field_507 = 15;
   // $FF: renamed from: n int
   public int field_508;
   // $FF: renamed from: s int
   static final int field_509 = 8;
   // $FF: renamed from: l int
   static final int field_510 = 4095;


   // $FF: renamed from: ch (int, int, int, int) void
   public void method_753(int var1, int var2, int var3, int var4) {
      this.method_786(this.field_501 << 3, this.field_505 << 3, var1 << 4, var2 << 4, var3, var4);
   }

   // $FF: renamed from: <init> (int, int) void
   public void method_754(int var1, int var2) {
      this.method_815(new int[var1 * var2], var1, var2);
   }

   // $FF: renamed from: bw (int[], int[], int, int, int, int, int, int, int, int, int, int, int) void
   static void method_755(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
      int var13 = 256 - var12;
      int var14 = var3;

      for(int var15 = -var8; var15 < 0; ++var15) {
         int var16 = (var4 >> 16) * var11;

         for(int var17 = -var7; var17 < 0; ++var17) {
            var2 = var1[(var3 >> 16) + var16];
            if(var2 != 0) {
               int var18 = var0[var5];
               var0[var5++] = ((var2 & 16711935) * var12 + (var18 & 16711935) * var13 & -16711936) + ((var2 & '\uff00') * var12 + (var18 & '\uff00') * var13 & 16711680) >> 8;
            } else {
               ++var5;
            }

            var3 += var9;
         }

         var4 += var10;
         var3 = var14;
         var5 += var6;
      }

   }

   // $FF: renamed from: p (int) void
   public void method_756(int var1) {
      if(this.field_508 != this.field_501 || this.field_500 != this.field_505) {
         int var2 = var1;
         if(var1 > this.field_504) {
            var2 = this.field_504;
         }

         int var3 = var1;
         if(var1 + this.field_504 + this.field_508 > this.field_501) {
            var3 = this.field_501 - this.field_504 - this.field_508;
         }

         int var4 = var1;
         if(var1 > this.field_503) {
            var4 = this.field_503;
         }

         int var5 = var1;
         if(var1 + this.field_503 + this.field_500 > this.field_505) {
            var5 = this.field_505 - this.field_503 - this.field_500;
         }

         int var6 = this.field_508 + var2 + var3;
         int var7 = this.field_500 + var4 + var5;
         int[] var8 = new int[var6 * var7];

         for(int var9 = 0; var9 < this.field_500; ++var9) {
            for(int var10 = 0; var10 < this.field_508; ++var10) {
               var8[(var9 + var4) * var6 + var10 + var2] = this.field_502[var9 * this.field_508 + var10];
            }
         }

         this.field_502 = var8;
         this.field_508 = var6;
         this.field_500 = var7;
         this.field_504 -= var2;
         this.field_503 -= var4;
      }
   }

   // $FF: renamed from: bz (int[], int[], int, int, int, int, int, int, int) void
   static void method_757(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = -(var5 >> 2);
      var5 = -(var5 & 3);

      for(int var10 = -var6; var10 < 0; ++var10) {
         int var11;
         for(var11 = var9; var11 < 0; ++var11) {
            var2 = var1[var3++];
            if(var2 != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            var2 = var1[var3++];
            if(var2 != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            var2 = var1[var3++];
            if(var2 != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            var2 = var1[var3++];
            if(var2 != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }
         }

         for(var11 = var5; var11 < 0; ++var11) {
            var2 = var1[var3++];
            if(var2 != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   // $FF: renamed from: f () void
   public void method_758() {
      method_656(this.field_502, this.field_508, this.field_500);
   }

   // $FF: renamed from: y () void
   public void method_759() {
      if(this.field_508 != this.field_501 || this.field_500 != this.field_505) {
         int[] var1 = new int[this.field_501 * this.field_505];

         for(int var2 = 0; var2 < this.field_500; ++var2) {
            for(int var3 = 0; var3 < this.field_508; ++var3) {
               var1[(var2 + this.field_503) * this.field_501 + var3 + this.field_504] = this.field_502[var2 * this.field_508 + var3];
            }
         }

         this.field_502 = var1;
         this.field_508 = this.field_501;
         this.field_500 = this.field_505;
         this.field_504 = 0;
         this.field_503 = 0;
      }
   }

   // $FF: renamed from: by (int, int, int, int[], int[], int, int, int, int, int, int, int, int) void
   static void method_760(int var0, int var1, int var2, int[] var3, int[] var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
      for(var8 = -var10; var8 < 0; ++var8) {
         for(var6 = -var9; var6 < 0; ++var6) {
            var0 = var4[var5++];
            if(var0 != 0) {
               var1 = var3[var7];
               var2 = var0 + var1;
               var0 = (var0 & 16711935) + (var1 & -378344866);
               var1 = (var0 & 16777472) + (var2 - var0 & 1628265779);
               var3[var7++] = var2 - var1 | var1 - (var1 >>> 8);
            } else {
               ++var7;
            }
         }

         var7 += var11;
         var5 += var12;
      }

   }

   // $FF: renamed from: ak () void
   public void method_761() {
      int[] var1 = new int[this.field_508 * this.field_500];
      int var2 = 0;

      for(int var3 = 0; var3 < this.field_500; ++var3) {
         for(int var4 = this.field_508 - 1; var4 >= 0; --var4) {
            var1[var2++] = this.field_502[var4 + var3 * this.field_508];
         }
      }

      this.field_502 = var1;
      this.field_504 = this.field_501 - this.field_508 - this.field_504;
   }

   // $FF: renamed from: ba (int, int, int) void
   public void method_762(int var1, int var2, int var3) {
      var1 += this.field_504;
      var2 += this.field_503;
      int var4 = var1 + var2 * field_484;
      int var5 = 0;
      int var6 = this.field_500;
      int var7 = this.field_508;
      int var8 = field_484 - var7;
      int var9 = 0;
      int var10;
      if(var2 < field_487) {
         var10 = field_487 - var2;
         var6 -= var10;
         var2 = field_487;
         var5 += var10 * var7;
         var4 += var10 * field_484;
      }

      if(var2 + var6 > field_485) {
         var6 -= var2 + var6 - field_485;
      }

      if(var1 < field_489) {
         var10 = field_489 - var1;
         var7 -= var10;
         var1 = field_489;
         var5 += var10;
         var4 += var10;
         var9 += var10;
         var8 += var10;
      }

      if(var1 + var7 > field_488) {
         var10 = var1 + var7 - field_488;
         var7 -= var10;
         var9 += var10;
         var8 += var10;
      }

      if(var7 > 0 && var6 > 0) {
         method_774(field_490, this.field_502, 0, var5, var4, var7, var6, var8, var9, var3);
      }
   }

   // $FF: renamed from: b (int) void
   public void method_763(int var1) {
      int[] var2 = new int[this.field_508 * this.field_500];
      int var3 = 0;

      for(int var4 = 0; var4 < this.field_500; ++var4) {
         for(int var5 = 0; var5 < this.field_508; ++var5) {
            int var6 = this.field_502[var3];
            if(var6 == 0) {
               if(var5 > 0 && this.field_502[var3 - 1] != 0) {
                  var6 = var1;
               } else if(var4 > 0 && this.field_502[var3 - this.field_508] != 0) {
                  var6 = var1;
               } else if(var5 < this.field_508 - 1 && this.field_502[var3 + 1] != 0) {
                  var6 = var1;
               } else if(var4 < this.field_500 - 1 && this.field_502[var3 + this.field_508] != 0) {
                  var6 = var1;
               }
            }

            var2[var3++] = var6;
         }
      }

      this.field_502 = var2;
   }

   // $FF: renamed from: d (int) void
   public void method_764(int var1) {
      for(int var2 = this.field_500 - 1; var2 > 0; --var2) {
         int var3 = var2 * this.field_508;

         for(int var4 = this.field_508 - 1; var4 > 0; --var4) {
            if(this.field_502[var4 + var3] == 0 && this.field_502[var4 + var3 - 1 - this.field_508] != 0) {
               this.field_502[var4 + var3] = var1;
            }
         }
      }

   }

   // $FF: renamed from: s (int, int) void
   public void method_765(int var1, int var2) {
      var1 += this.field_504;
      var2 += this.field_503;
      int var3 = var1 + var2 * field_484;
      int var4 = 0;
      int var5 = this.field_500;
      int var6 = this.field_508;
      int var7 = field_484 - var6;
      int var8 = 0;
      int var9;
      if(var2 < field_487) {
         var9 = field_487 - var2;
         var5 -= var9;
         var2 = field_487;
         var4 += var9 * var6;
         var3 += var9 * field_484;
      }

      if(var2 + var5 > field_485) {
         var5 -= var2 + var5 - field_485;
      }

      if(var1 < field_489) {
         var9 = field_489 - var1;
         var6 -= var9;
         var1 = field_489;
         var4 += var9;
         var3 += var9;
         var8 += var9;
         var7 += var9;
      }

      if(var1 + var6 > field_488) {
         var9 = var1 + var6 - field_488;
         var6 -= var9;
         var8 += var9;
         var7 += var9;
      }

      if(var6 > 0 && var5 > 0) {
         method_766(field_490, this.field_502, var4, var3, var6, var5, var7, var8);
      }
   }

   // $FF: renamed from: u (int[], int[], int, int, int, int, int, int) void
   static void method_766(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      for(int var8 = -var5; var8 < 0; ++var8) {
         int var9;
         for(var9 = var3 + var4 - 3; var3 < var9; var0[var3++] = var1[var2++]) {
            var0[var3++] = var1[var2++];
            var0[var3++] = var1[var2++];
            var0[var3++] = var1[var2++];
         }

         for(var9 += 3; var3 < var9; var0[var3++] = var1[var2++]) {
            ;
         }

         var3 += var6;
         var2 += var7;
      }

   }

   // $FF: renamed from: l (int, int) void
   public void method_767(int var1, int var2) {
      var1 += this.field_504;
      var2 += this.field_503;
      int var3 = var1 + var2 * field_484;
      int var4 = 0;
      int var5 = this.field_500;
      int var6 = this.field_508;
      int var7 = field_484 - var6;
      int var8 = 0;
      int var9;
      if(var2 < field_487) {
         var9 = field_487 - var2;
         var5 -= var9;
         var2 = field_487;
         var4 += var9 * var6;
         var3 += var9 * field_484;
      }

      if(var2 + var5 > field_485) {
         var5 -= var2 + var5 - field_485;
      }

      if(var1 < field_489) {
         var9 = field_489 - var1;
         var6 -= var9;
         var1 = field_489;
         var4 += var9;
         var3 += var9;
         var8 += var9;
         var7 += var9;
      }

      if(var1 + var6 > field_488) {
         var9 = var1 + var6 - field_488;
         var6 -= var9;
         var8 += var9;
         var7 += var9;
      }

      if(var6 > 0 && var5 > 0) {
         method_830(field_490, this.field_502, 0, var4, var3, var6, var5, var7, var8);
      }
   }

   // $FF: renamed from: bi (int[], int[], int, int, int, int, int, int, int, int, int, int, int) void
   static void method_768(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
      int var13 = -973291376 - var12;
      int var14 = var3;

      for(int var15 = -var8; var15 < 0; ++var15) {
         int var16 = (var4 >> 16) * var11;

         for(int var17 = -var7; var17 < 0; ++var17) {
            var2 = var1[(var3 >> 16) + var16];
            if(var2 != 0) {
               int var18 = var0[var5];
               var0[var5++] = ((var2 & 943269496) * var12 + (var18 & 16711935) * var13 & -1188314884) + ((var2 & 928796441) * var12 + (var18 & '\uff00') * var13 & 16711680) >> 8;
            } else {
               ++var5;
            }

            var3 += var9;
         }

         var4 += var10;
         var3 = var14;
         var5 += var6;
      }

   }

   // $FF: renamed from: c (int, int, int, int) void
   public void method_769(int var1, int var2, int var3, int var4) {
      if(var3 > 0 && var4 > 0) {
         int var5 = this.field_508;
         int var6 = this.field_500;
         int var7 = 0;
         int var8 = 0;
         int var9 = this.field_501;
         int var10 = this.field_505;
         int var11 = (var9 << 16) / var3;
         int var12 = (var10 << 16) / var4;
         int var13;
         if(this.field_504 > 0) {
            var13 = ((this.field_504 << 16) + var11 - 1) / var11;
            var1 += var13;
            var7 += var13 * var11 - (this.field_504 << 16);
         }

         if(this.field_503 > 0) {
            var13 = ((this.field_503 << 16) + var12 - 1) / var12;
            var2 += var13;
            var8 += var13 * var12 - (this.field_503 << 16);
         }

         if(var5 < var9) {
            var3 = ((var5 << 16) - var7 + var11 - 1) / var11;
         }

         if(var6 < var10) {
            var4 = ((var6 << 16) - var8 + var12 - 1) / var12;
         }

         var13 = var1 + var2 * field_484;
         int var14 = field_484 - var3;
         if(var2 + var4 > field_485) {
            var4 -= var2 + var4 - field_485;
         }

         int var15;
         if(var2 < field_487) {
            var15 = field_487 - var2;
            var4 -= var15;
            var13 += var15 * field_484;
            var8 += var12 * var15;
         }

         if(var1 + var3 > field_488) {
            var15 = var1 + var3 - field_488;
            var3 -= var15;
            var14 += var15;
         }

         if(var1 < field_489) {
            var15 = field_489 - var1;
            var3 -= var15;
            var13 += var15;
            var7 += var11 * var15;
            var14 += var15;
         }

         method_801(field_490, this.field_502, 0, var7, var8, var13, var14, var3, var4, var11, var12, var5);
      }
   }

   // $FF: renamed from: cf (int, int, int, int, int[], int[], int, int, int, int, int, int, int, int, int, int, int) void
   static void method_770(int var0, int var1, int var2, int var3, int[] var4, int[] var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16) {
      for(int var17 = var3; var8 < 0; ++var8) {
         var7 = (var9 >> 16) * var15;

         for(var6 = -var12; var6 < 0; ++var6) {
            var0 = var4[(var3 >> 16) + var7];
            if(var0 != 0) {
               var1 = (var0 & 16711935) * var16;
               var0 = (var1 & -16711936) + (var0 * var16 - var1 & 16711680) >>> 8;
               var1 = var5[var10];
               var2 = var0 + var1;
               var0 = (var0 & 16711935) + (var1 & 16711935);
               var1 = (var0 & 16777472) + (var2 - var0 & 65536);
               var5[var10++] = var2 - var1 | var1 - (var1 >>> 8);
            } else {
               ++var10;
            }

            var3 += var13;
         }

         var9 += var14;
         var3 = var17;
         var10 += var11;
      }

   }

   // $FF: renamed from: g (int, int, int, int) void
   public void method_771(int var1, int var2, int var3, int var4) {
      if(var3 == 256) {
         this.method_767(var1, var2);
      } else {
         var1 += this.field_504;
         var2 += this.field_503;
         int var5 = var1 + var2 * field_484;
         int var6 = 0;
         int var7 = this.field_500;
         int var8 = this.field_508;
         int var9 = field_484 - var8;
         int var10 = 0;
         int var11;
         if(var2 < field_487) {
            var11 = field_487 - var2;
            var7 -= var11;
            var2 = field_487;
            var6 += var11 * var8;
            var5 += var11 * field_484;
         }

         if(var2 + var7 > field_485) {
            var7 -= var2 + var7 - field_485;
         }

         if(var1 < field_489) {
            var11 = field_489 - var1;
            var8 -= var11;
            var1 = field_489;
            var6 += var11;
            var5 += var11;
            var10 += var11;
            var9 += var11;
         }

         if(var1 + var8 > field_488) {
            var11 = var1 + var8 - field_488;
            var8 -= var11;
            var10 += var11;
            var9 += var11;
         }

         if(var8 > 0 && var7 > 0) {
            method_772(field_490, this.field_502, 0, var6, var5, var8, var7, var9, var10, var3, var4);
         }
      }
   }

   // $FF: renamed from: a (int[], int[], int, int, int, int, int, int, int, int, int) void
   static void method_772(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      int var11 = 256 - var9;
      int var12 = (var10 & 16711935) * var11 & -16711936;
      int var13 = (var10 & '\uff00') * var11 & 16711680;
      var10 = (var12 | var13) >>> 8;

      for(int var14 = -var6; var14 < 0; ++var14) {
         for(int var15 = -var5; var15 < 0; ++var15) {
            var2 = var1[var3++];
            if(var2 != 0) {
               var12 = (var2 & 16711935) * var9 & -16711936;
               var13 = (var2 & '\uff00') * var9 & 16711680;
               var0[var4++] = ((var12 | var13) >>> 8) + var10;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   // $FF: renamed from: k (int, int, int) void
   public void method_773(int var1, int var2, int var3) {
      var1 += this.field_504;
      var2 += this.field_503;
      int var4 = var1 + var2 * field_484;
      int var5 = 0;
      int var6 = this.field_500;
      int var7 = this.field_508;
      int var8 = field_484 - var7;
      int var9 = 0;
      int var10;
      if(var2 < field_487) {
         var10 = field_487 - var2;
         var6 -= var10;
         var2 = field_487;
         var5 += var10 * var7;
         var4 += var10 * field_484;
      }

      if(var2 + var6 > field_485) {
         var6 -= var2 + var6 - field_485;
      }

      if(var1 < field_489) {
         var10 = field_489 - var1;
         var7 -= var10;
         var1 = field_489;
         var5 += var10;
         var4 += var10;
         var9 += var10;
         var8 += var10;
      }

      if(var1 + var7 > field_488) {
         var10 = var1 + var7 - field_488;
         var7 -= var10;
         var9 += var10;
         var8 += var10;
      }

      if(var7 > 0 && var6 > 0) {
         method_774(field_490, this.field_502, 0, var5, var4, var7, var6, var8, var9, var3);
      }
   }

   // $FF: renamed from: m (int[], int[], int, int, int, int, int, int, int, int) void
   static void method_774(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      int var10 = 256 - var9;

      for(int var11 = -var6; var11 < 0; ++var11) {
         for(int var12 = -var5; var12 < 0; ++var12) {
            var2 = var1[var3++];
            if(var2 != 0) {
               int var13 = var0[var4];
               var0[var4++] = ((var2 & 16711935) * var9 + (var13 & 16711935) * var10 & -16711936) + ((var2 & '\uff00') * var9 + (var13 & '\uff00') * var10 & 16711680) >> 8;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   // $FF: renamed from: x (int, int, int, int, int) void
   public void method_775(int var1, int var2, int var3, int var4, int var5) {
      if(var3 > 0 && var4 > 0) {
         int var6 = this.field_508;
         int var7 = this.field_500;
         int var8 = 0;
         int var9 = 0;
         int var10 = this.field_501;
         int var11 = this.field_505;
         int var12 = (var10 << 16) / var3;
         int var13 = (var11 << 16) / var4;
         int var14;
         if(this.field_504 > 0) {
            var14 = ((this.field_504 << 16) + var12 - 1) / var12;
            var1 += var14;
            var8 += var14 * var12 - (this.field_504 << 16);
         }

         if(this.field_503 > 0) {
            var14 = ((this.field_503 << 16) + var13 - 1) / var13;
            var2 += var14;
            var9 += var14 * var13 - (this.field_503 << 16);
         }

         if(var6 < var10) {
            var3 = ((var6 << 16) - var8 + var12 - 1) / var12;
         }

         if(var7 < var11) {
            var4 = ((var7 << 16) - var9 + var13 - 1) / var13;
         }

         var14 = var1 + var2 * field_484;
         int var15 = field_484 - var3;
         if(var2 + var4 > field_485) {
            var4 -= var2 + var4 - field_485;
         }

         int var16;
         if(var2 < field_487) {
            var16 = field_487 - var2;
            var4 -= var16;
            var14 += var16 * field_484;
            var9 += var13 * var16;
         }

         if(var1 + var3 > field_488) {
            var16 = var1 + var3 - field_488;
            var3 -= var16;
            var15 += var16;
         }

         if(var1 < field_489) {
            var16 = field_489 - var1;
            var3 -= var16;
            var14 += var16;
            var8 += var12 * var16;
            var15 += var16;
         }

         method_776(field_490, this.field_502, 0, var8, var9, var14, var15, var3, var4, var12, var13, var6, var5);
      }
   }

   // $FF: renamed from: z (int[], int[], int, int, int, int, int, int, int, int, int, int, int) void
   static void method_776(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
      int var13 = 256 - var12;
      int var14 = var3;

      for(int var15 = -var8; var15 < 0; ++var15) {
         int var16 = (var4 >> 16) * var11;

         for(int var17 = -var7; var17 < 0; ++var17) {
            var2 = var1[(var3 >> 16) + var16];
            if(var2 != 0) {
               int var18 = var0[var5];
               var0[var5++] = ((var2 & 16711935) * var12 + (var18 & 16711935) * var13 & -16711936) + ((var2 & '\uff00') * var12 + (var18 & '\uff00') * var13 & 16711680) >> 8;
            } else {
               ++var5;
            }

            var3 += var9;
         }

         var4 += var10;
         var3 = var14;
         var5 += var6;
      }

   }

   // $FF: renamed from: ci (int, int, int, int, int[], int[], int, int, int, int, int, int, int, int, int, int) void
   static void method_777(int var0, int var1, int var2, int var3, int[] var4, int[] var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15) {
      for(int var16 = var3; var8 < 0; ++var8) {
         var7 = (var9 >> 16) * var15;

         for(var6 = -var12; var6 < 0; ++var6) {
            var0 = var4[(var3 >> 16) + var7];
            if(var0 != 0) {
               var1 = var5[var10];
               var2 = var0 + var1;
               var0 = (var0 & 16711935) + (var1 & 16711935);
               var1 = (var0 & 16777472) + (var2 - var0 & 65536);
               var5[var10++] = var2 - var1 | var1 - (var1 >>> 8);
            } else {
               ++var10;
            }

            var3 += var13;
         }

         var9 += var14;
         var3 = var16;
         var10 += var11;
      }

   }

   // $FF: renamed from: t (int, int, int, int[], int[], int, int, int, int, int, int, int, int) void
   static void method_778(int var0, int var1, int var2, int[] var3, int[] var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
      for(var8 = -var10; var8 < 0; ++var8) {
         for(var6 = -var9; var6 < 0; ++var6) {
            var0 = var4[var5++];
            if(var0 != 0) {
               var1 = var3[var7];
               var2 = var0 + var1;
               var0 = (var0 & 16711935) + (var1 & 16711935);
               var1 = (var0 & 16777472) + (var2 - var0 & 65536);
               var3[var7++] = var2 - var1 | var1 - (var1 >>> 8);
            } else {
               ++var7;
            }
         }

         var7 += var11;
         var5 += var12;
      }

   }

   // $FF: renamed from: h (int, int, int, int[], int[], int, int, int, int, int, int, int, int, int) void
   static void method_779(int var0, int var1, int var2, int[] var3, int[] var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13) {
      for(var8 = -var10; var8 < 0; ++var8) {
         for(var6 = -var9; var6 < 0; ++var6) {
            var0 = var4[var5++];
            if(var0 != 0) {
               var1 = (var0 & 16711935) * var13;
               var0 = (var1 & -16711936) + (var0 * var13 - var1 & 16711680) >>> 8;
               var1 = var3[var7];
               var2 = var0 + var1;
               var0 = (var0 & 16711935) + (var1 & 16711935);
               var1 = (var0 & 16777472) + (var2 - var0 & 65536);
               var3[var7++] = var2 - var1 | var1 - (var1 >>> 8);
            } else {
               ++var7;
            }
         }

         var7 += var11;
         var5 += var12;
      }

   }

   // $FF: renamed from: q (int, int, int, int, int) void
   public void method_780(int var1, int var2, int var3, int var4, int var5) {
      if(var3 > 0 && var4 > 0) {
         int var6 = this.field_508;
         int var7 = this.field_500;
         int var8 = 0;
         int var9 = 0;
         int var10 = this.field_501;
         int var11 = this.field_505;
         int var12 = (var10 << 16) / var3;
         int var13 = (var11 << 16) / var4;
         int var14;
         if(this.field_504 > 0) {
            var14 = ((this.field_504 << 16) + var12 - 1) / var12;
            var1 += var14;
            var8 += var14 * var12 - (this.field_504 << 16);
         }

         if(this.field_503 > 0) {
            var14 = ((this.field_503 << 16) + var13 - 1) / var13;
            var2 += var14;
            var9 += var14 * var13 - (this.field_503 << 16);
         }

         if(var6 < var10) {
            var3 = ((var6 << 16) - var8 + var12 - 1) / var12;
         }

         if(var7 < var11) {
            var4 = ((var7 << 16) - var9 + var13 - 1) / var13;
         }

         var14 = var1 + var2 * field_484;
         int var15 = field_484 - var3;
         if(var2 + var4 > field_485) {
            var4 -= var2 + var4 - field_485;
         }

         int var16;
         if(var2 < field_487) {
            var16 = field_487 - var2;
            var4 -= var16;
            var14 += var16 * field_484;
            var9 += var13 * var16;
         }

         if(var1 + var3 > field_488) {
            var16 = var1 + var3 - field_488;
            var3 -= var16;
            var15 += var16;
         }

         if(var1 < field_489) {
            var16 = field_489 - var1;
            var3 -= var16;
            var14 += var16;
            var8 += var12 * var16;
            var15 += var16;
         }

         if(var5 == 256) {
            method_819(0, 0, 0, var8, this.field_502, field_490, 0, 0, -var4, var9, var14, var15, var3, var12, var13, var6);
         } else {
            method_782(0, 0, 0, var8, this.field_502, field_490, 0, 0, -var4, var9, var14, var15, var3, var12, var13, var6, var5);
         }

      }
   }

   // $FF: renamed from: bg (int, int, int, int[], int[], int, int, int, int, int, int, int, int) void
   static void method_781(int var0, int var1, int var2, int[] var3, int[] var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
      for(var8 = -var10; var8 < 0; ++var8) {
         for(var6 = -var9; var6 < 0; ++var6) {
            var0 = var4[var5++];
            if(var0 != 0) {
               var1 = var3[var7];
               var2 = var0 + var1;
               var0 = (var0 & 16711935) + (var1 & 16711935);
               var1 = (var0 & 16777472) + (var2 - var0 & 65536);
               var3[var7++] = var2 - var1 | var1 - (var1 >>> 8);
            } else {
               ++var7;
            }
         }

         var7 += var11;
         var5 += var12;
      }

   }

   // $FF: renamed from: ae (int, int, int, int, int[], int[], int, int, int, int, int, int, int, int, int, int, int) void
   static void method_782(int var0, int var1, int var2, int var3, int[] var4, int[] var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16) {
      for(int var17 = var3; var8 < 0; ++var8) {
         var7 = (var9 >> 16) * var15;

         for(var6 = -var12; var6 < 0; ++var6) {
            var0 = var4[(var3 >> 16) + var7];
            if(var0 != 0) {
               var1 = (var0 & 16711935) * var16;
               var0 = (var1 & -16711936) + (var0 * var16 - var1 & 16711680) >>> 8;
               var1 = var5[var10];
               var2 = var0 + var1;
               var0 = (var0 & 16711935) + (var1 & 16711935);
               var1 = (var0 & 16777472) + (var2 - var0 & 65536);
               var5[var10++] = var2 - var1 | var1 - (var1 >>> 8);
            } else {
               ++var10;
            }

            var3 += var13;
         }

         var9 += var14;
         var3 = var17;
         var10 += var11;
      }

   }

   // $FF: renamed from: ap (int, int, int, int, int, int, int[], int[]) void
   public void method_783(int var1, int var2, int var3, int var4, int var5, int var6, int[] var7, int[] var8) {
      int var9 = var2 < 0?-var2:0;
      int var10 = var2 + this.field_500 <= var6?this.field_500:var6 - var2;
      int var11 = var1 < 0?-var1:0;
      int var10000;
      if(var1 + this.field_508 <= var5) {
         var10000 = this.field_508;
      } else {
         var10000 = var5 - var1;
      }

      int var13 = var3 + var1 + var11 + (var4 + var2 + var9) * field_484;
      int var14 = var2 + var9;

      for(int var15 = var9; var15 < var10; ++var15) {
         int var16 = var7[var14];
         int var17 = var8[var14++];
         int var18 = var13;
         int var19;
         if(var1 < var16) {
            var19 = var16 - var1;
            var18 = var13 + (var19 - var11);
         } else {
            var19 = var11;
         }

         int var12;
         if(var1 + this.field_508 <= var16 + var17) {
            var12 = this.field_508;
         } else {
            var12 = var16 + var17 - var1;
         }

         for(int var20 = var19; var20 < var12; ++var20) {
            int var21 = this.field_502[var20 + var15 * this.field_508];
            if(var21 != 0) {
               field_490[var18++] = var21;
            } else {
               ++var18;
            }
         }

         var13 += field_484;
      }

   }

   // $FF: renamed from: <init> () void
   void method_105() {
      super.method_105();
   }

   // $FF: renamed from: al (int, int, int, int, int, int, double, int) void
   public void method_784(int var1, int var2, int var3, int var4, int var5, int var6, double var7, int var9) {
      try {
         int var10 = -var3 / 2;
         int var11 = -var4 / 2;
         int var12 = (int)(Math.sin(var7) * 65536.0D);
         int var13 = (int)(Math.cos(var7) * 65536.0D);
         var12 = var12 * var9 >> 8;
         var13 = var13 * var9 >> 8;
         int var14 = (var5 << 16) + var11 * var12 + var10 * var13;
         int var15 = (var6 << 16) + (var11 * var13 - var10 * var12);
         int var16 = var1 + var2 * field_484;

         for(var2 = 0; var2 < var4; ++var2) {
            int var17 = var16;
            int var18 = var14;
            int var19 = var15;

            for(var1 = -var3; var1 < 0; ++var1) {
               int var20 = this.field_502[(var18 >> 16) + (var19 >> 16) * this.field_508];
               if(var20 != 0) {
                  field_490[var17++] = var20;
               } else {
                  ++var17;
               }

               var18 += var13;
               var19 -= var12;
            }

            var14 += var12;
            var15 += var13;
            var16 += field_484;
         }
      } catch (Exception var21) {
         ;
      }

   }

   // $FF: renamed from: ad (int, int, int, int) void
   public void method_785(int var1, int var2, int var3, int var4) {
      this.method_786(this.field_501 << 3, this.field_505 << 3, var1 << 4, var2 << 4, var3, var4);
   }

   // $FF: renamed from: ai (int, int, int, int, int, int) void
   void method_786(int var1, int var2, int var3, int var4, int var5, int var6) {
      if(var6 != 0) {
         var1 -= this.field_504 << 4;
         var2 -= this.field_503 << 4;
         double var7 = (double)(var5 & '\uffff') * 9.587379924285257E-5D;
         int var9 = (int)Math.floor(Math.sin(var7) * (double)var6 + 0.5D);
         int var10 = (int)Math.floor(Math.cos(var7) * (double)var6 + 0.5D);
         int var11 = -var1 * var10 + -var2 * var9;
         int var12 = -(-var1) * var9 + -var2 * var10;
         int var13 = ((this.field_508 << 4) - var1) * var10 + -var2 * var9;
         int var14 = -((this.field_508 << 4) - var1) * var9 + -var2 * var10;
         int var15 = -var1 * var10 + ((this.field_500 << 4) - var2) * var9;
         int var16 = -(-var1) * var9 + ((this.field_500 << 4) - var2) * var10;
         int var17 = ((this.field_508 << 4) - var1) * var10 + ((this.field_500 << 4) - var2) * var9;
         int var18 = -((this.field_508 << 4) - var1) * var9 + ((this.field_500 << 4) - var2) * var10;
         int var19;
         int var20;
         if(var11 < var13) {
            var19 = var11;
            var20 = var13;
         } else {
            var19 = var13;
            var20 = var11;
         }

         if(var15 < var19) {
            var19 = var15;
         }

         if(var17 < var19) {
            var19 = var17;
         }

         if(var15 > var20) {
            var20 = var15;
         }

         if(var17 > var20) {
            var20 = var17;
         }

         int var21;
         int var22;
         if(var12 < var14) {
            var21 = var12;
            var22 = var14;
         } else {
            var21 = var14;
            var22 = var12;
         }

         if(var16 < var21) {
            var21 = var16;
         }

         if(var18 < var21) {
            var21 = var18;
         }

         if(var16 > var22) {
            var22 = var16;
         }

         if(var18 > var22) {
            var22 = var18;
         }

         var19 >>= 12;
         var20 = var20 + 4095 >> 12;
         var21 >>= 12;
         var22 = var22 + 4095 >> 12;
         var19 += var3;
         var20 += var3;
         var21 += var4;
         var22 += var4;
         var19 >>= 4;
         var20 = var20 + 15 >> 4;
         var21 >>= 4;
         var22 = var22 + 15 >> 4;
         if(var19 < field_489) {
            var19 = field_489;
         }

         if(var20 > field_488) {
            var20 = field_488;
         }

         if(var21 < field_487) {
            var21 = field_487;
         }

         if(var22 > field_485) {
            var22 = field_485;
         }

         var20 = var19 - var20;
         if(var20 < 0) {
            var22 = var21 - var22;
            if(var22 < 0) {
               int var23 = var21 * field_484 + var19;
               double var24 = 1.6777216E7D / (double)var6;
               int var26 = (int)Math.floor(Math.sin(var7) * var24 + 0.5D);
               int var27 = (int)Math.floor(Math.cos(var7) * var24 + 0.5D);
               int var28 = (var19 << 4) + 8 - var3;
               int var29 = (var21 << 4) + 8 - var4;
               int var30 = (var1 << 8) - (var29 * var26 >> 4);
               int var31 = (var2 << 8) + (var29 * var27 >> 4);
               int var32;
               int var33;
               int var34;
               int var35;
               int var36;
               int var37;
               int var38;
               if(var27 == 0) {
                  if(var26 == 0) {
                     for(var33 = var22; var33 < 0; var23 += field_484) {
                        var34 = var23;
                        var35 = var30;
                        var36 = var31;
                        var37 = var20;
                        if(var30 >= 0 && var31 >= 0 && var30 - (this.field_508 << 12) < 0 && var31 - (this.field_500 << 12) < 0) {
                           for(; var37 < 0; ++var37) {
                              var38 = this.field_502[(var36 >> 12) * this.field_508 + (var35 >> 12)];
                              if(var38 != 0) {
                                 field_490[var34++] = var38;
                              } else {
                                 ++var34;
                              }
                           }
                        }

                        ++var33;
                     }
                  } else if(var26 < 0) {
                     for(var33 = var22; var33 < 0; var23 += field_484) {
                        var34 = var23;
                        var35 = var30;
                        var36 = var31 + (var28 * var26 >> 4);
                        var37 = var20;
                        if(var30 >= 0 && var30 - (this.field_508 << 12) < 0) {
                           if((var32 = var36 - (this.field_500 << 12)) >= 0) {
                              var32 = (var26 - var32) / var26;
                              var37 = var20 + var32;
                              var36 += var26 * var32;
                              var34 = var23 + var32;
                           }

                           if((var32 = (var36 - var26) / var26) > var37) {
                              var37 = var32;
                           }

                           while(var37 < 0) {
                              var38 = this.field_502[(var36 >> 12) * this.field_508 + (var35 >> 12)];
                              if(var38 != 0) {
                                 field_490[var34++] = var38;
                              } else {
                                 ++var34;
                              }

                              var36 += var26;
                              ++var37;
                           }
                        }

                        ++var33;
                        var30 -= var26;
                     }
                  } else {
                     for(var33 = var22; var33 < 0; var23 += field_484) {
                        var34 = var23;
                        var35 = var30;
                        var36 = var31 + (var28 * var26 >> 4);
                        var37 = var20;
                        if(var30 >= 0 && var30 - (this.field_508 << 12) < 0) {
                           if(var36 < 0) {
                              var32 = (var26 - 1 - var36) / var26;
                              var37 = var20 + var32;
                              var36 += var26 * var32;
                              var34 = var23 + var32;
                           }

                           if((var32 = (1 + var36 - (this.field_500 << 12) - var26) / var26) > var37) {
                              var37 = var32;
                           }

                           while(var37 < 0) {
                              var38 = this.field_502[(var36 >> 12) * this.field_508 + (var35 >> 12)];
                              if(var38 != 0) {
                                 field_490[var34++] = var38;
                              } else {
                                 ++var34;
                              }

                              var36 += var26;
                              ++var37;
                           }
                        }

                        ++var33;
                        var30 -= var26;
                     }
                  }
               } else if(var27 < 0) {
                  if(var26 == 0) {
                     for(var33 = var22; var33 < 0; var23 += field_484) {
                        var34 = var23;
                        var35 = var30 + (var28 * var27 >> 4);
                        var36 = var31;
                        var37 = var20;
                        if(var31 >= 0 && var31 - (this.field_500 << 12) < 0) {
                           if((var32 = var35 - (this.field_508 << 12)) >= 0) {
                              var32 = (var27 - var32) / var27;
                              var37 = var20 + var32;
                              var35 += var27 * var32;
                              var34 = var23 + var32;
                           }

                           if((var32 = (var35 - var27) / var27) > var37) {
                              var37 = var32;
                           }

                           while(var37 < 0) {
                              var38 = this.field_502[(var36 >> 12) * this.field_508 + (var35 >> 12)];
                              if(var38 != 0) {
                                 field_490[var34++] = var38;
                              } else {
                                 ++var34;
                              }

                              var35 += var27;
                              ++var37;
                           }
                        }

                        ++var33;
                        var31 += var27;
                     }
                  } else if(var26 < 0) {
                     for(var33 = var22; var33 < 0; var23 += field_484) {
                        var34 = var23;
                        var35 = var30 + (var28 * var27 >> 4);
                        var36 = var31 + (var28 * var26 >> 4);
                        var37 = var20;
                        if((var32 = var35 - (this.field_508 << 12)) >= 0) {
                           var32 = (var27 - var32) / var27;
                           var37 = var20 + var32;
                           var35 += var27 * var32;
                           var36 += var26 * var32;
                           var34 = var23 + var32;
                        }

                        if((var32 = (var35 - var27) / var27) > var37) {
                           var37 = var32;
                        }

                        if((var32 = var36 - (this.field_500 << 12)) >= 0) {
                           var32 = (var26 - var32) / var26;
                           var37 += var32;
                           var35 += var27 * var32;
                           var36 += var26 * var32;
                           var34 += var32;
                        }

                        if((var32 = (var36 - var26) / var26) > var37) {
                           var37 = var32;
                        }

                        while(var37 < 0) {
                           var38 = this.field_502[(var36 >> 12) * this.field_508 + (var35 >> 12)];
                           if(var38 != 0) {
                              field_490[var34++] = var38;
                           } else {
                              ++var34;
                           }

                           var35 += var27;
                           var36 += var26;
                           ++var37;
                        }

                        ++var33;
                        var30 -= var26;
                        var31 += var27;
                     }
                  } else {
                     for(var33 = var22; var33 < 0; var23 += field_484) {
                        var34 = var23;
                        var35 = var30 + (var28 * var27 >> 4);
                        var36 = var31 + (var28 * var26 >> 4);
                        var37 = var20;
                        if((var32 = var35 - (this.field_508 << 12)) >= 0) {
                           var32 = (var27 - var32) / var27;
                           var37 = var20 + var32;
                           var35 += var27 * var32;
                           var36 += var26 * var32;
                           var34 = var23 + var32;
                        }

                        if((var32 = (var35 - var27) / var27) > var37) {
                           var37 = var32;
                        }

                        if(var36 < 0) {
                           var32 = (var26 - 1 - var36) / var26;
                           var37 += var32;
                           var35 += var27 * var32;
                           var36 += var26 * var32;
                           var34 += var32;
                        }

                        if((var32 = (1 + var36 - (this.field_500 << 12) - var26) / var26) > var37) {
                           var37 = var32;
                        }

                        while(var37 < 0) {
                           var38 = this.field_502[(var36 >> 12) * this.field_508 + (var35 >> 12)];
                           if(var38 != 0) {
                              field_490[var34++] = var38;
                           } else {
                              ++var34;
                           }

                           var35 += var27;
                           var36 += var26;
                           ++var37;
                        }

                        ++var33;
                        var30 -= var26;
                        var31 += var27;
                     }
                  }
               } else if(var26 == 0) {
                  for(var33 = var22; var33 < 0; var23 += field_484) {
                     var34 = var23;
                     var35 = var30 + (var28 * var27 >> 4);
                     var36 = var31;
                     var37 = var20;
                     if(var31 >= 0 && var31 - (this.field_500 << 12) < 0) {
                        if(var35 < 0) {
                           var32 = (var27 - 1 - var35) / var27;
                           var37 = var20 + var32;
                           var35 += var27 * var32;
                           var34 = var23 + var32;
                        }

                        if((var32 = (1 + var35 - (this.field_508 << 12) - var27) / var27) > var37) {
                           var37 = var32;
                        }

                        while(var37 < 0) {
                           var38 = this.field_502[(var36 >> 12) * this.field_508 + (var35 >> 12)];
                           if(var38 != 0) {
                              field_490[var34++] = var38;
                           } else {
                              ++var34;
                           }

                           var35 += var27;
                           ++var37;
                        }
                     }

                     ++var33;
                     var31 += var27;
                  }
               } else if(var26 < 0) {
                  for(var33 = var22; var33 < 0; var23 += field_484) {
                     var34 = var23;
                     var35 = var30 + (var28 * var27 >> 4);
                     var36 = var31 + (var28 * var26 >> 4);
                     var37 = var20;
                     if(var35 < 0) {
                        var32 = (var27 - 1 - var35) / var27;
                        var37 = var20 + var32;
                        var35 += var27 * var32;
                        var36 += var26 * var32;
                        var34 = var23 + var32;
                     }

                     if((var32 = (1 + var35 - (this.field_508 << 12) - var27) / var27) > var37) {
                        var37 = var32;
                     }

                     if((var32 = var36 - (this.field_500 << 12)) >= 0) {
                        var32 = (var26 - var32) / var26;
                        var37 += var32;
                        var35 += var27 * var32;
                        var36 += var26 * var32;
                        var34 += var32;
                     }

                     if((var32 = (var36 - var26) / var26) > var37) {
                        var37 = var32;
                     }

                     while(var37 < 0) {
                        var38 = this.field_502[(var36 >> 12) * this.field_508 + (var35 >> 12)];
                        if(var38 != 0) {
                           field_490[var34++] = var38;
                        } else {
                           ++var34;
                        }

                        var35 += var27;
                        var36 += var26;
                        ++var37;
                     }

                     ++var33;
                     var30 -= var26;
                     var31 += var27;
                  }
               } else {
                  for(var33 = var22; var33 < 0; var23 += field_484) {
                     var34 = var23;
                     var35 = var30 + (var28 * var27 >> 4);
                     var36 = var31 + (var28 * var26 >> 4);
                     var37 = var20;
                     if(var35 < 0) {
                        var32 = (var27 - 1 - var35) / var27;
                        var37 = var20 + var32;
                        var35 += var27 * var32;
                        var36 += var26 * var32;
                        var34 = var23 + var32;
                     }

                     if((var32 = (1 + var35 - (this.field_508 << 12) - var27) / var27) > var37) {
                        var37 = var32;
                     }

                     if(var36 < 0) {
                        var32 = (var26 - 1 - var36) / var26;
                        var37 += var32;
                        var35 += var27 * var32;
                        var36 += var26 * var32;
                        var34 += var32;
                     }

                     if((var32 = (1 + var36 - (this.field_500 << 12) - var26) / var26) > var37) {
                        var37 = var32;
                     }

                     while(var37 < 0) {
                        var38 = this.field_502[(var36 >> 12) * this.field_508 + (var35 >> 12)];
                        if(var38 != 0) {
                           field_490[var34++] = var38;
                        } else {
                           ++var34;
                        }

                        var35 += var27;
                        var36 += var26;
                        ++var37;
                     }

                     ++var33;
                     var30 -= var26;
                     var31 += var27;
                  }
               }

            }
         }
      }
   }

   // $FF: renamed from: ce (int, int, int, int) void
   public void method_787(int var1, int var2, int var3, int var4) {
      this.method_786(this.field_501 << 3, this.field_505 << 3, var1 << 4, var2 << 4, var3, var4);
   }

   // $FF: renamed from: ag () oh
   public class_67 method_788() {
      class_67 var10000 = new class_67;
      var10000.method_754(this.field_508, this.field_500);
      class_67 var1 = var10000;
      var1.field_501 = this.field_501;
      var1.field_505 = this.field_505;
      var1.field_504 = this.field_501 - this.field_508 - this.field_504;
      var1.field_503 = this.field_503;

      for(int var2 = 0; var2 < this.field_500; ++var2) {
         for(int var3 = 0; var3 < this.field_508; ++var3) {
            var1.field_502[var2 * this.field_508 + var3] = this.field_502[var2 * this.field_508 + this.field_508 - 1 - var3];
         }
      }

      return var1;
   }

   // $FF: renamed from: ax () oh
   public class_67 method_789() {
      class_67 var10000 = new class_67;
      var10000.method_754(this.field_508, this.field_500);
      class_67 var1 = var10000;
      var1.field_501 = this.field_501;
      var1.field_505 = this.field_505;
      var1.field_504 = this.field_501 - this.field_508 - this.field_504;
      var1.field_503 = this.field_503;

      for(int var2 = 0; var2 < this.field_500; ++var2) {
         for(int var3 = 0; var3 < this.field_508; ++var3) {
            var1.field_502[var2 * this.field_508 + var3] = this.field_502[var2 * this.field_508 + this.field_508 - 1 - var3];
         }
      }

      return var1;
   }

   // $FF: renamed from: as () oh
   public class_67 method_790() {
      class_67 var10000 = new class_67;
      var10000.method_754(this.field_508, this.field_500);
      class_67 var1 = var10000;
      var1.field_501 = this.field_501;
      var1.field_505 = this.field_505;
      var1.field_504 = this.field_501 - this.field_508 - this.field_504;
      var1.field_503 = this.field_503;

      for(int var2 = 0; var2 < this.field_500; ++var2) {
         for(int var3 = 0; var3 < this.field_508; ++var3) {
            var1.field_502[var2 * this.field_508 + var3] = this.field_502[var2 * this.field_508 + this.field_508 - 1 - var3];
         }
      }

      return var1;
   }

   // $FF: renamed from: af (int) void
   public void method_791(int var1) {
      if(this.field_508 != this.field_501 || this.field_500 != this.field_505) {
         int var2 = var1;
         if(var1 > this.field_504) {
            var2 = this.field_504;
         }

         int var3 = var1;
         if(var1 + this.field_504 + this.field_508 > this.field_501) {
            var3 = this.field_501 - this.field_504 - this.field_508;
         }

         int var4 = var1;
         if(var1 > this.field_503) {
            var4 = this.field_503;
         }

         int var5 = var1;
         if(var1 + this.field_503 + this.field_500 > this.field_505) {
            var5 = this.field_505 - this.field_503 - this.field_500;
         }

         int var6 = this.field_508 + var2 + var3;
         int var7 = this.field_500 + var4 + var5;
         int[] var8 = new int[var6 * var7];

         for(int var9 = 0; var9 < this.field_500; ++var9) {
            for(int var10 = 0; var10 < this.field_508; ++var10) {
               var8[(var9 + var4) * var6 + var10 + var2] = this.field_502[var9 * this.field_508 + var10];
            }
         }

         this.field_502 = var8;
         this.field_508 = var6;
         this.field_500 = var7;
         this.field_504 -= var2;
         this.field_503 -= var4;
      }
   }

   // $FF: renamed from: am () oh
   public class_67 method_792() {
      class_67 var10000 = new class_67;
      var10000.method_754(this.field_501, this.field_505);
      class_67 var1 = var10000;

      for(int var2 = 0; var2 < this.field_500; ++var2) {
         for(int var3 = 0; var3 < this.field_508; ++var3) {
            var1.field_502[(var2 + this.field_503) * this.field_501 + var3 + this.field_504] = this.field_502[var2 * this.field_508 + var3];
         }
      }

      return var1;
   }

   // $FF: renamed from: az () oh
   public class_67 method_793() {
      class_67 var10000 = new class_67;
      var10000.method_754(this.field_501, this.field_505);
      class_67 var1 = var10000;

      for(int var2 = 0; var2 < this.field_500; ++var2) {
         for(int var3 = 0; var3 < this.field_508; ++var3) {
            var1.field_502[(var2 + this.field_503) * this.field_501 + var3 + this.field_504] = this.field_502[var2 * this.field_508 + var3];
         }
      }

      return var1;
   }

   // $FF: renamed from: av () void
   public void method_794() {
      method_656(this.field_502, this.field_508, this.field_500);
   }

   // $FF: renamed from: ac () void
   public void method_795() {
      if(this.field_508 != this.field_501 || this.field_500 != this.field_505) {
         int[] var1 = new int[this.field_501 * this.field_505];

         for(int var2 = 0; var2 < this.field_500; ++var2) {
            for(int var3 = 0; var3 < this.field_508; ++var3) {
               var1[(var2 + this.field_503) * this.field_501 + var3 + this.field_504] = this.field_502[var2 * this.field_508 + var3];
            }
         }

         this.field_502 = var1;
         this.field_508 = this.field_501;
         this.field_500 = this.field_505;
         this.field_504 = 0;
         this.field_503 = 0;
      }
   }

   // $FF: renamed from: w (int, int, int) void
   public void method_796(int var1, int var2, int var3) {
      var1 += this.field_504;
      var2 += this.field_503;
      int var4 = var1 + var2 * field_484;
      int var5 = 0;
      int var6 = this.field_500;
      int var7 = this.field_508;
      int var8 = field_484 - var7;
      int var9 = 0;
      int var10;
      if(var2 < field_487) {
         var10 = field_487 - var2;
         var6 -= var10;
         var2 = field_487;
         var5 += var10 * var7;
         var4 += var10 * field_484;
      }

      if(var2 + var6 > field_485) {
         var6 -= var2 + var6 - field_485;
      }

      if(var1 < field_489) {
         var10 = field_489 - var1;
         var7 -= var10;
         var1 = field_489;
         var5 += var10;
         var4 += var10;
         var9 += var10;
         var8 += var10;
      }

      if(var1 + var7 > field_488) {
         var10 = var1 + var7 - field_488;
         var7 -= var10;
         var9 += var10;
         var8 += var10;
      }

      if(var7 > 0 && var6 > 0) {
         if(var3 == 256) {
            method_778(0, 0, 0, field_490, this.field_502, var5, 0, var4, 0, var7, var6, var8, var9);
         } else {
            method_779(0, 0, 0, field_490, this.field_502, var5, 0, var4, 0, var7, var6, var8, var9, var3);
         }

      }
   }

   // $FF: renamed from: r () void
   public void method_797() {
      int[] var1 = new int[this.field_508 * this.field_500];
      int var2 = 0;

      for(int var3 = this.field_500 - 1; var3 >= 0; --var3) {
         for(int var4 = 0; var4 < this.field_508; ++var4) {
            var1[var2++] = this.field_502[var4 + var3 * this.field_508];
         }
      }

      this.field_502 = var1;
      this.field_503 = this.field_505 - this.field_500 - this.field_503;
   }

   // $FF: renamed from: ao () void
   public void method_798() {
      if(this.field_508 != this.field_501 || this.field_500 != this.field_505) {
         int[] var1 = new int[this.field_501 * this.field_505];

         for(int var2 = 0; var2 < this.field_500; ++var2) {
            for(int var3 = 0; var3 < this.field_508; ++var3) {
               var1[(var2 + this.field_503) * this.field_501 + var3 + this.field_504] = this.field_502[var2 * this.field_508 + var3];
            }
         }

         this.field_502 = var1;
         this.field_508 = this.field_501;
         this.field_500 = this.field_505;
         this.field_504 = 0;
         this.field_503 = 0;
      }
   }

   // $FF: renamed from: aq (int) void
   public void method_799(int var1) {
      if(this.field_508 != this.field_501 || this.field_500 != this.field_505) {
         int var2 = var1;
         if(var1 > this.field_504) {
            var2 = this.field_504;
         }

         int var3 = var1;
         if(var1 + this.field_504 + this.field_508 > this.field_501) {
            var3 = this.field_501 - this.field_504 - this.field_508;
         }

         int var4 = var1;
         if(var1 > this.field_503) {
            var4 = this.field_503;
         }

         int var5 = var1;
         if(var1 + this.field_503 + this.field_500 > this.field_505) {
            var5 = this.field_505 - this.field_503 - this.field_500;
         }

         int var6 = this.field_508 + var2 + var3;
         int var7 = this.field_500 + var4 + var5;
         int[] var8 = new int[var6 * var7];

         for(int var9 = 0; var9 < this.field_500; ++var9) {
            for(int var10 = 0; var10 < this.field_508; ++var10) {
               var8[(var9 + var4) * var6 + var10 + var2] = this.field_502[var9 * this.field_508 + var10];
            }
         }

         this.field_502 = var8;
         this.field_508 = var6;
         this.field_500 = var7;
         this.field_504 -= var2;
         this.field_503 -= var4;
      }
   }

   // $FF: renamed from: aw (int) void
   public void method_800(int var1) {
      if(this.field_508 != this.field_501 || this.field_500 != this.field_505) {
         int var2 = var1;
         if(var1 > this.field_504) {
            var2 = this.field_504;
         }

         int var3 = var1;
         if(var1 + this.field_504 + this.field_508 > this.field_501) {
            var3 = this.field_501 - this.field_504 - this.field_508;
         }

         int var4 = var1;
         if(var1 > this.field_503) {
            var4 = this.field_503;
         }

         int var5 = var1;
         if(var1 + this.field_503 + this.field_500 > this.field_505) {
            var5 = this.field_505 - this.field_503 - this.field_500;
         }

         int var6 = this.field_508 + var2 + var3;
         int var7 = this.field_500 + var4 + var5;
         int[] var8 = new int[var6 * var7];

         for(int var9 = 0; var9 < this.field_500; ++var9) {
            for(int var10 = 0; var10 < this.field_508; ++var10) {
               var8[(var9 + var4) * var6 + var10 + var2] = this.field_502[var9 * this.field_508 + var10];
            }
         }

         this.field_502 = var8;
         this.field_508 = var6;
         this.field_500 = var7;
         this.field_504 -= var2;
         this.field_503 -= var4;
      }
   }

   // $FF: renamed from: e (int[], int[], int, int, int, int, int, int, int, int, int, int) void
   static void method_801(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      int var12 = var3;

      for(int var13 = -var8; var13 < 0; ++var13) {
         int var14 = (var4 >> 16) * var11;

         for(int var15 = -var7; var15 < 0; ++var15) {
            var2 = var1[(var3 >> 16) + var14];
            if(var2 != 0) {
               var0[var5++] = var2;
            } else {
               ++var5;
            }

            var3 += var9;
         }

         var4 += var10;
         var3 = var12;
         var5 += var6;
      }

   }

   // $FF: renamed from: cd (int, int, int, int, int) void
   public void method_802(int var1, int var2, int var3, int var4, int var5) {
      if(var3 > 0 && var4 > 0) {
         int var6 = this.field_508;
         int var7 = this.field_500;
         int var8 = 0;
         int var9 = 0;
         int var10 = this.field_501;
         int var11 = this.field_505;
         int var12 = (var10 << 16) / var3;
         int var13 = (var11 << 16) / var4;
         int var14;
         if(this.field_504 > 0) {
            var14 = ((this.field_504 << 16) + var12 - 1) / var12;
            var1 += var14;
            var8 += var14 * var12 - (this.field_504 << 16);
         }

         if(this.field_503 > 0) {
            var14 = ((this.field_503 << 16) + var13 - 1) / var13;
            var2 += var14;
            var9 += var14 * var13 - (this.field_503 << 16);
         }

         if(var6 < var10) {
            var3 = ((var6 << 16) - var8 + var12 - 1) / var12;
         }

         if(var7 < var11) {
            var4 = ((var7 << 16) - var9 + var13 - 1) / var13;
         }

         var14 = var1 + var2 * field_484;
         int var15 = field_484 - var3;
         if(var2 + var4 > field_485) {
            var4 -= var2 + var4 - field_485;
         }

         int var16;
         if(var2 < field_487) {
            var16 = field_487 - var2;
            var4 -= var16;
            var14 += var16 * field_484;
            var9 += var13 * var16;
         }

         if(var1 + var3 > field_488) {
            var16 = var1 + var3 - field_488;
            var3 -= var16;
            var15 += var16;
         }

         if(var1 < field_489) {
            var16 = field_489 - var1;
            var3 -= var16;
            var14 += var16;
            var8 += var12 * var16;
            var15 += var16;
         }

         if(var5 == -1884691714) {
            method_819(0, 0, 0, var8, this.field_502, field_490, 0, 0, -var4, var9, var14, var15, var3, var12, var13, var6);
         } else {
            method_782(0, 0, 0, var8, this.field_502, field_490, 0, 0, -var4, var9, var14, var15, var3, var12, var13, var6, var5);
         }

      }
   }

   // $FF: renamed from: ay () void
   public void method_803() {
      int[] var1 = new int[this.field_508 * this.field_500];
      int var2 = 0;

      for(int var3 = this.field_500 - 1; var3 >= 0; --var3) {
         for(int var4 = 0; var4 < this.field_508; ++var4) {
            var1[var2++] = this.field_502[var4 + var3 * this.field_508];
         }
      }

      this.field_502 = var1;
      this.field_503 = this.field_505 - this.field_500 - this.field_503;
   }

   // $FF: renamed from: n () oh
   public class_67 method_804() {
      class_67 var10000 = new class_67;
      var10000.method_754(this.field_501, this.field_505);
      class_67 var1 = var10000;

      for(int var2 = 0; var2 < this.field_500; ++var2) {
         for(int var3 = 0; var3 < this.field_508; ++var3) {
            var1.field_502[(var2 + this.field_503) * this.field_501 + var3 + this.field_504] = this.field_502[var2 * this.field_508 + var3];
         }
      }

      return var1;
   }

   // $FF: renamed from: au (int) void
   public void method_805(int var1) {
      int[] var2 = new int[this.field_508 * this.field_500];
      int var3 = 0;

      for(int var4 = 0; var4 < this.field_500; ++var4) {
         for(int var5 = 0; var5 < this.field_508; ++var5) {
            int var6 = this.field_502[var3];
            if(var6 == 0) {
               if(var5 > 0 && this.field_502[var3 - 1] != 0) {
                  var6 = var1;
               } else if(var4 > 0 && this.field_502[var3 - this.field_508] != 0) {
                  var6 = var1;
               } else if(var5 < this.field_508 - 1 && this.field_502[var3 + 1] != 0) {
                  var6 = var1;
               } else if(var4 < this.field_500 - 1 && this.field_502[var3 + this.field_508] != 0) {
                  var6 = var1;
               }
            }

            var2[var3++] = var6;
         }
      }

      this.field_502 = var2;
   }

   // $FF: renamed from: an (int) void
   public void method_806(int var1) {
      for(int var2 = this.field_500 - 1; var2 > 0; --var2) {
         int var3 = var2 * this.field_508;

         for(int var4 = this.field_508 - 1; var4 > 0; --var4) {
            if(this.field_502[var4 + var3] == 0 && this.field_502[var4 + var3 - 1 - this.field_508] != 0) {
               this.field_502[var4 + var3] = var1;
            }
         }
      }

   }

   // $FF: renamed from: bd (int) void
   public void method_807(int var1) {
      for(int var2 = this.field_500 - 1; var2 > 0; --var2) {
         int var3 = var2 * this.field_508;

         for(int var4 = this.field_508 - 1; var4 > 0; --var4) {
            if(this.field_502[var4 + var3] == 0 && this.field_502[var4 + var3 - 1 - this.field_508] != 0) {
               this.field_502[var4 + var3] = var1;
            }
         }
      }

   }

   // $FF: renamed from: ah () void
   public void method_808() {
      if(this.field_508 != this.field_501 || this.field_500 != this.field_505) {
         int[] var1 = new int[this.field_501 * this.field_505];

         for(int var2 = 0; var2 < this.field_500; ++var2) {
            for(int var3 = 0; var3 < this.field_508; ++var3) {
               var1[(var2 + this.field_503) * this.field_501 + var3 + this.field_504] = this.field_502[var2 * this.field_508 + var3];
            }
         }

         this.field_502 = var1;
         this.field_508 = this.field_501;
         this.field_500 = this.field_505;
         this.field_504 = 0;
         this.field_503 = 0;
      }
   }

   // $FF: renamed from: bq (int[], int[], int, int, int, int, int, int) void
   static void method_809(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      for(int var8 = -var5; var8 < 0; ++var8) {
         int var9;
         for(var9 = var3 + var4 - 3; var3 < var9; var0[var3++] = var1[var2++]) {
            var0[var3++] = var1[var2++];
            var0[var3++] = var1[var2++];
            var0[var3++] = var1[var2++];
         }

         for(var9 += 3; var3 < var9; var0[var3++] = var1[var2++]) {
            ;
         }

         var3 += var6;
         var2 += var7;
      }

   }

   // $FF: renamed from: bu (int, int) void
   public void method_810(int var1, int var2) {
      var1 += this.field_504;
      var2 += this.field_503;
      int var3 = var1 + var2 * field_484;
      int var4 = 0;
      int var5 = this.field_500;
      int var6 = this.field_508;
      int var7 = field_484 - var6;
      int var8 = 0;
      int var9;
      if(var2 < field_487) {
         var9 = field_487 - var2;
         var5 -= var9;
         var2 = field_487;
         var4 += var9 * var6;
         var3 += var9 * field_484;
      }

      if(var2 + var5 > field_485) {
         var5 -= var2 + var5 - field_485;
      }

      if(var1 < field_489) {
         var9 = field_489 - var1;
         var6 -= var9;
         var1 = field_489;
         var4 += var9;
         var3 += var9;
         var8 += var9;
         var7 += var9;
      }

      if(var1 + var6 > field_488) {
         var9 = var1 + var6 - field_488;
         var6 -= var9;
         var8 += var9;
         var7 += var9;
      }

      if(var6 > 0 && var5 > 0) {
         method_830(field_490, this.field_502, 0, var4, var3, var6, var5, var7, var8);
      }
   }

   // $FF: renamed from: bl (int, int) void
   public void method_811(int var1, int var2) {
      var1 += this.field_504;
      var2 += this.field_503;
      int var3 = var1 + var2 * field_484;
      int var4 = 0;
      int var5 = this.field_500;
      int var6 = this.field_508;
      int var7 = field_484 - var6;
      int var8 = 0;
      int var9;
      if(var2 < field_487) {
         var9 = field_487 - var2;
         var5 -= var9;
         var2 = field_487;
         var4 += var9 * var6;
         var3 += var9 * field_484;
      }

      if(var2 + var5 > field_485) {
         var5 -= var2 + var5 - field_485;
      }

      if(var1 < field_489) {
         var9 = field_489 - var1;
         var6 -= var9;
         var1 = field_489;
         var4 += var9;
         var3 += var9;
         var8 += var9;
         var7 += var9;
      }

      if(var1 + var6 > field_488) {
         var9 = var1 + var6 - field_488;
         var6 -= var9;
         var8 += var9;
         var7 += var9;
      }

      if(var6 > 0 && var5 > 0) {
         method_830(field_490, this.field_502, 0, var4, var3, var6, var5, var7, var8);
      }
   }

   // $FF: renamed from: bv (int[], int[], int, int, int, int, int, int, int) void
   static void method_812(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = -(var5 >> 2);
      var5 = -(var5 & 3);

      for(int var10 = -var6; var10 < 0; ++var10) {
         int var11;
         for(var11 = var9; var11 < 0; ++var11) {
            var2 = var1[var3++];
            if(var2 != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            var2 = var1[var3++];
            if(var2 != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            var2 = var1[var3++];
            if(var2 != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            var2 = var1[var3++];
            if(var2 != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }
         }

         for(var11 = var5; var11 < 0; ++var11) {
            var2 = var1[var3++];
            if(var2 != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   // $FF: renamed from: bt (int, int) void
   public void method_813(int var1, int var2) {
      var1 += this.field_504;
      var2 += this.field_503;
      int var3 = var1 + var2 * field_484;
      int var4 = 0;
      int var5 = this.field_500;
      int var6 = this.field_508;
      int var7 = field_484 - var6;
      int var8 = 0;
      int var9;
      if(var2 < field_487) {
         var9 = field_487 - var2;
         var5 -= var9;
         var2 = field_487;
         var4 += var9 * var6;
         var3 += var9 * field_484;
      }

      if(var2 + var5 > field_485) {
         var5 -= var2 + var5 - field_485;
      }

      if(var1 < field_489) {
         var9 = field_489 - var1;
         var6 -= var9;
         var1 = field_489;
         var4 += var9;
         var3 += var9;
         var8 += var9;
         var7 += var9;
      }

      if(var1 + var6 > field_488) {
         var9 = var1 + var6 - field_488;
         var6 -= var9;
         var8 += var9;
         var7 += var9;
      }

      if(var6 > 0 && var5 > 0) {
         method_766(field_490, this.field_502, var4, var3, var6, var5, var7, var8);
      }
   }

   // $FF: renamed from: aj () oh
   public class_67 method_814() {
      class_67 var10000 = new class_67;
      var10000.method_754(this.field_501, this.field_505);
      class_67 var1 = var10000;

      for(int var2 = 0; var2 < this.field_500; ++var2) {
         for(int var3 = 0; var3 < this.field_508; ++var3) {
            var1.field_502[(var2 + this.field_503) * this.field_501 + var3 + this.field_504] = this.field_502[var2 * this.field_508 + var3];
         }
      }

      return var1;
   }

   // $FF: renamed from: <init> (int[], int, int) void
   public void method_815(int[] var1, int var2, int var3) {
      super.method_105();
      this.field_502 = var1;
      this.field_508 = this.field_501 = var2;
      this.field_500 = this.field_505 = var3;
      this.field_503 = 0;
      this.field_504 = 0;
   }

   // $FF: renamed from: bh (int, int, int, int) void
   public void method_816(int var1, int var2, int var3, int var4) {
      if(var3 > 0 && var4 > 0) {
         int var5 = this.field_508;
         int var6 = this.field_500;
         int var7 = 0;
         int var8 = 0;
         int var9 = this.field_501;
         int var10 = this.field_505;
         int var11 = (var9 << 16) / var3;
         int var12 = (var10 << 16) / var4;
         int var13;
         if(this.field_504 > 0) {
            var13 = ((this.field_504 << 16) + var11 - 1) / var11;
            var1 += var13;
            var7 += var13 * var11 - (this.field_504 << 16);
         }

         if(this.field_503 > 0) {
            var13 = ((this.field_503 << 16) + var12 - 1) / var12;
            var2 += var13;
            var8 += var13 * var12 - (this.field_503 << 16);
         }

         if(var5 < var9) {
            var3 = ((var5 << 16) - var7 + var11 - 1) / var11;
         }

         if(var6 < var10) {
            var4 = ((var6 << 16) - var8 + var12 - 1) / var12;
         }

         var13 = var1 + var2 * field_484;
         int var14 = field_484 - var3;
         if(var2 + var4 > field_485) {
            var4 -= var2 + var4 - field_485;
         }

         int var15;
         if(var2 < field_487) {
            var15 = field_487 - var2;
            var4 -= var15;
            var13 += var15 * field_484;
            var8 += var12 * var15;
         }

         if(var1 + var3 > field_488) {
            var15 = var1 + var3 - field_488;
            var3 -= var15;
            var14 += var15;
         }

         if(var1 < field_489) {
            var15 = field_489 - var1;
            var3 -= var15;
            var13 += var15;
            var7 += var11 * var15;
            var14 += var15;
         }

         method_801(field_490, this.field_502, 0, var7, var8, var13, var14, var3, var4, var11, var12, var5);
      }
   }

   // $FF: renamed from: cy (int, int, int, int) void
   public void method_817(int var1, int var2, int var3, int var4) {
      this.method_786(this.field_501 << 3, this.field_505 << 3, var1 << 4, var2 << 4, var3, var4);
   }

   // $FF: renamed from: bf (int[], int[], int, int, int, int, int, int, int, int, int) void
   static void method_818(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      int var11 = 256 - var9;
      int var12 = (var10 & 16711935) * var11 & -16711936;
      int var13 = (var10 & '\uff00') * var11 & 16711680;
      var10 = (var12 | var13) >>> 8;

      for(int var14 = -var6; var14 < 0; ++var14) {
         for(int var15 = -var5; var15 < 0; ++var15) {
            var2 = var1[var3++];
            if(var2 != 0) {
               var12 = (var2 & 16711935) * var9 & -16711936;
               var13 = (var2 & '\uff00') * var9 & 16711680;
               var0[var4++] = ((var12 | var13) >>> 8) + var10;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   // $FF: renamed from: i (int, int, int, int, int[], int[], int, int, int, int, int, int, int, int, int, int) void
   static void method_819(int var0, int var1, int var2, int var3, int[] var4, int[] var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15) {
      for(int var16 = var3; var8 < 0; ++var8) {
         var7 = (var9 >> 16) * var15;

         for(var6 = -var12; var6 < 0; ++var6) {
            var0 = var4[(var3 >> 16) + var7];
            if(var0 != 0) {
               var1 = var5[var10];
               var2 = var0 + var1;
               var0 = (var0 & 16711935) + (var1 & 16711935);
               var1 = (var0 & 16777472) + (var2 - var0 & 65536);
               var5[var10++] = var2 - var1 | var1 - (var1 >>> 8);
            } else {
               ++var10;
            }

            var3 += var13;
         }

         var9 += var14;
         var3 = var16;
         var10 += var11;
      }

   }

   // $FF: renamed from: be (int, int, int) void
   public void method_820(int var1, int var2, int var3) {
      var1 += this.field_504;
      var2 += this.field_503;
      int var4 = var1 + var2 * field_484;
      int var5 = 0;
      int var6 = this.field_500;
      int var7 = this.field_508;
      int var8 = field_484 - var7;
      int var9 = 0;
      int var10;
      if(var2 < field_487) {
         var10 = field_487 - var2;
         var6 -= var10;
         var2 = field_487;
         var5 += var10 * var7;
         var4 += var10 * field_484;
      }

      if(var2 + var6 > field_485) {
         var6 -= var2 + var6 - field_485;
      }

      if(var1 < field_489) {
         var10 = field_489 - var1;
         var7 -= var10;
         var1 = field_489;
         var5 += var10;
         var4 += var10;
         var9 += var10;
         var8 += var10;
      }

      if(var1 + var7 > field_488) {
         var10 = var1 + var7 - field_488;
         var7 -= var10;
         var9 += var10;
         var8 += var10;
      }

      if(var7 > 0 && var6 > 0) {
         method_774(field_490, this.field_502, 0, var5, var4, var7, var6, var8, var9, var3);
      }
   }

   // $FF: renamed from: bj (int[], int[], int, int, int, int, int, int, int, int) void
   static void method_821(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      int var10 = -461466196 - var9;

      for(int var11 = -var6; var11 < 0; ++var11) {
         for(int var12 = -var5; var12 < 0; ++var12) {
            var2 = var1[var3++];
            if(var2 != 0) {
               int var13 = var0[var4];
               var0[var4++] = ((var2 & 16711935) * var9 + (var13 & 16711935) * var10 & 1125423404) + ((var2 & '\uff00') * var9 + (var13 & -805616279) * var10 & -254054497) >> 8;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   // $FF: renamed from: bx (int[], int[], int, int, int, int, int, int, int, int) void
   static void method_822(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      int var10 = -909262550 - var9;

      for(int var11 = -var6; var11 < 0; ++var11) {
         for(int var12 = -var5; var12 < 0; ++var12) {
            var2 = var1[var3++];
            if(var2 != 0) {
               int var13 = var0[var4];
               var0[var4++] = ((var2 & 16711935) * var9 + (var13 & -2103297233) * var10 & -657639731) + ((var2 & -2088005519) * var9 + (var13 & -644859939) * var10 & 16711680) >> 8;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   // $FF: renamed from: bp (int[], int[], int, int, int, int, int, int, int, int) void
   static void method_823(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      int var10 = 256 - var9;

      for(int var11 = -var6; var11 < 0; ++var11) {
         for(int var12 = -var5; var12 < 0; ++var12) {
            var2 = var1[var3++];
            if(var2 != 0) {
               int var13 = var0[var4];
               var0[var4++] = ((var2 & 16711935) * var9 + (var13 & 16711935) * var10 & -16711936) + ((var2 & '\uff00') * var9 + (var13 & '\uff00') * var10 & 16711680) >> 8;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   // $FF: renamed from: br (int, int, int, int) void
   public void method_824(int var1, int var2, int var3, int var4) {
      if(var3 > 0 && var4 > 0) {
         int var5 = this.field_508;
         int var6 = this.field_500;
         int var7 = 0;
         int var8 = 0;
         int var9 = this.field_501;
         int var10 = this.field_505;
         int var11 = (var9 << 16) / var3;
         int var12 = (var10 << 16) / var4;
         int var13;
         if(this.field_504 > 0) {
            var13 = ((this.field_504 << 16) + var11 - 1) / var11;
            var1 += var13;
            var7 += var13 * var11 - (this.field_504 << 16);
         }

         if(this.field_503 > 0) {
            var13 = ((this.field_503 << 16) + var12 - 1) / var12;
            var2 += var13;
            var8 += var13 * var12 - (this.field_503 << 16);
         }

         if(var5 < var9) {
            var3 = ((var5 << 16) - var7 + var11 - 1) / var11;
         }

         if(var6 < var10) {
            var4 = ((var6 << 16) - var8 + var12 - 1) / var12;
         }

         var13 = var1 + var2 * field_484;
         int var14 = field_484 - var3;
         if(var2 + var4 > field_485) {
            var4 -= var2 + var4 - field_485;
         }

         int var15;
         if(var2 < field_487) {
            var15 = field_487 - var2;
            var4 -= var15;
            var13 += var15 * field_484;
            var8 += var12 * var15;
         }

         if(var1 + var3 > field_488) {
            var15 = var1 + var3 - field_488;
            var3 -= var15;
            var14 += var15;
         }

         if(var1 < field_489) {
            var15 = field_489 - var1;
            var3 -= var15;
            var13 += var15;
            var7 += var11 * var15;
            var14 += var15;
         }

         method_801(field_490, this.field_502, 0, var7, var8, var13, var14, var3, var4, var11, var12, var5);
      }
   }

   // $FF: renamed from: bo (int, int, int, int, int) void
   public void method_825(int var1, int var2, int var3, int var4, int var5) {
      if(var3 > 0 && var4 > 0) {
         int var6 = this.field_508;
         int var7 = this.field_500;
         int var8 = 0;
         int var9 = 0;
         int var10 = this.field_501;
         int var11 = this.field_505;
         int var12 = (var10 << 16) / var3;
         int var13 = (var11 << 16) / var4;
         int var14;
         if(this.field_504 > 0) {
            var14 = ((this.field_504 << 16) + var12 - 1) / var12;
            var1 += var14;
            var8 += var14 * var12 - (this.field_504 << 16);
         }

         if(this.field_503 > 0) {
            var14 = ((this.field_503 << 16) + var13 - 1) / var13;
            var2 += var14;
            var9 += var14 * var13 - (this.field_503 << 16);
         }

         if(var6 < var10) {
            var3 = ((var6 << 16) - var8 + var12 - 1) / var12;
         }

         if(var7 < var11) {
            var4 = ((var7 << 16) - var9 + var13 - 1) / var13;
         }

         var14 = var1 + var2 * field_484;
         int var15 = field_484 - var3;
         if(var2 + var4 > field_485) {
            var4 -= var2 + var4 - field_485;
         }

         int var16;
         if(var2 < field_487) {
            var16 = field_487 - var2;
            var4 -= var16;
            var14 += var16 * field_484;
            var9 += var13 * var16;
         }

         if(var1 + var3 > field_488) {
            var16 = var1 + var3 - field_488;
            var3 -= var16;
            var15 += var16;
         }

         if(var1 < field_489) {
            var16 = field_489 - var1;
            var3 -= var16;
            var14 += var16;
            var8 += var12 * var16;
            var15 += var16;
         }

         method_776(field_490, this.field_502, 0, var8, var9, var14, var15, var3, var4, var12, var13, var6, var5);
      }
   }

   // $FF: renamed from: cs (int, int, int, int, int, int, int[], int[]) void
   public void method_826(int var1, int var2, int var3, int var4, int var5, int var6, int[] var7, int[] var8) {
      int var9 = var2 < 0?-var2:0;
      int var10 = var2 + this.field_500 <= var6?this.field_500:var6 - var2;
      int var11 = var1 < 0?-var1:0;
      int var10000;
      if(var1 + this.field_508 <= var5) {
         var10000 = this.field_508;
      } else {
         var10000 = var5 - var1;
      }

      int var13 = var3 + var1 + var11 + (var4 + var2 + var9) * field_484;
      int var14 = var2 + var9;

      for(int var15 = var9; var15 < var10; ++var15) {
         int var16 = var7[var14];
         int var17 = var8[var14++];
         int var18 = var13;
         int var19;
         if(var1 < var16) {
            var19 = var16 - var1;
            var18 = var13 + (var19 - var11);
         } else {
            var19 = var11;
         }

         int var12;
         if(var1 + this.field_508 <= var16 + var17) {
            var12 = this.field_508;
         } else {
            var12 = var16 + var17 - var1;
         }

         for(int var20 = var19; var20 < var12; ++var20) {
            int var21 = this.field_502[var20 + var15 * this.field_508];
            if(var21 != 0) {
               field_490[var18++] = var21;
            } else {
               ++var18;
            }
         }

         var13 += field_484;
      }

   }

   // $FF: renamed from: cq (int, int, int, int, int[], int[], int, int, int, int, int, int, int, int, int, int, int) void
   static void method_827(int var0, int var1, int var2, int var3, int[] var4, int[] var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16) {
      for(int var17 = var3; var8 < 0; ++var8) {
         var7 = (var9 >> 16) * var15;

         for(var6 = -var12; var6 < 0; ++var6) {
            var0 = var4[(var3 >> 16) + var7];
            if(var0 != 0) {
               var1 = (var0 & 16711935) * var16;
               var0 = (var1 & -16711936) + (var0 * var16 - var1 & 307703327) >>> 8;
               var1 = var5[var10];
               var2 = var0 + var1;
               var0 = (var0 & 16711935) + (var1 & 16711935);
               var1 = (var0 & -1093912983) + (var2 - var0 & -1319104079);
               var5[var10++] = var2 - var1 | var1 - (var1 >>> 8);
            } else {
               ++var10;
            }

            var3 += var13;
         }

         var9 += var14;
         var3 = var17;
         var10 += var11;
      }

   }

   // $FF: renamed from: bb (int, int, int) void
   public void method_828(int var1, int var2, int var3) {
      var1 += this.field_504;
      var2 += this.field_503;
      int var4 = var1 + var2 * field_484;
      int var5 = 0;
      int var6 = this.field_500;
      int var7 = this.field_508;
      int var8 = field_484 - var7;
      int var9 = 0;
      int var10;
      if(var2 < field_487) {
         var10 = field_487 - var2;
         var6 -= var10;
         var2 = field_487;
         var5 += var10 * var7;
         var4 += var10 * field_484;
      }

      if(var2 + var6 > field_485) {
         var6 -= var2 + var6 - field_485;
      }

      if(var1 < field_489) {
         var10 = field_489 - var1;
         var7 -= var10;
         var1 = field_489;
         var5 += var10;
         var4 += var10;
         var9 += var10;
         var8 += var10;
      }

      if(var1 + var7 > field_488) {
         var10 = var1 + var7 - field_488;
         var7 -= var10;
         var9 += var10;
         var8 += var10;
      }

      if(var7 > 0 && var6 > 0) {
         if(var3 == 256) {
            method_778(0, 0, 0, field_490, this.field_502, var5, 0, var4, 0, var7, var6, var8, var9);
         } else {
            method_779(0, 0, 0, field_490, this.field_502, var5, 0, var4, 0, var7, var6, var8, var9, var3);
         }

      }
   }

   // $FF: renamed from: bk (int, int, int) void
   public void method_829(int var1, int var2, int var3) {
      var1 += this.field_504;
      var2 += this.field_503;
      int var4 = var1 + var2 * field_484;
      int var5 = 0;
      int var6 = this.field_500;
      int var7 = this.field_508;
      int var8 = field_484 - var7;
      int var9 = 0;
      int var10;
      if(var2 < field_487) {
         var10 = field_487 - var2;
         var6 -= var10;
         var2 = field_487;
         var5 += var10 * var7;
         var4 += var10 * field_484;
      }

      if(var2 + var6 > field_485) {
         var6 -= var2 + var6 - field_485;
      }

      if(var1 < field_489) {
         var10 = field_489 - var1;
         var7 -= var10;
         var1 = field_489;
         var5 += var10;
         var4 += var10;
         var9 += var10;
         var8 += var10;
      }

      if(var1 + var7 > field_488) {
         var10 = var1 + var7 - field_488;
         var7 -= var10;
         var9 += var10;
         var8 += var10;
      }

      if(var7 > 0 && var6 > 0) {
         if(var3 == 256) {
            method_778(0, 0, 0, field_490, this.field_502, var5, 0, var4, 0, var7, var6, var8, var9);
         } else {
            method_779(0, 0, 0, field_490, this.field_502, var5, 0, var4, 0, var7, var6, var8, var9, var3);
         }

      }
   }

   // $FF: renamed from: o (int[], int[], int, int, int, int, int, int, int) void
   static void method_830(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = -(var5 >> 2);
      var5 = -(var5 & 3);

      for(int var10 = -var6; var10 < 0; ++var10) {
         int var11;
         for(var11 = var9; var11 < 0; ++var11) {
            var2 = var1[var3++];
            if(var2 != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            var2 = var1[var3++];
            if(var2 != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            var2 = var1[var3++];
            if(var2 != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            var2 = var1[var3++];
            if(var2 != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }
         }

         for(var11 = var5; var11 < 0; ++var11) {
            var2 = var1[var3++];
            if(var2 != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   // $FF: renamed from: ck (int, int, int, int, int, int, int, int, int[], int[]) void
   public void method_831(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int[] var9, int[] var10) {
      try {
         int var11 = -var3 / 2;
         int var12 = -var4 / 2;
         int var13 = (int)(Math.sin((double)var7 / 326.11D) * 65536.0D);
         int var14 = (int)(Math.cos((double)var7 / 326.11D) * 65536.0D);
         var13 = var13 * var8 >> 8;
         var14 = var14 * var8 >> 8;
         int var15 = (var5 << 16) + var12 * var13 + var11 * var14;
         int var16 = (var6 << 16) + (var12 * var14 - var11 * var13);
         int var17 = var1 + var2 * field_484;

         for(var2 = 0; var2 < var4; ++var2) {
            int var18 = var9[var2];
            int var19 = var17 + var18;
            int var20 = var15 + var14 * var18;
            int var21 = var16 - var13 * var18;

            for(var1 = -var10[var2]; var1 < 0; ++var1) {
               field_490[var19++] = this.field_502[(var20 >> 16) + (var21 >> 16) * this.field_508];
               var20 += var14;
               var21 -= var13;
            }

            var15 += var13;
            var16 += var14;
            var17 += field_484;
         }
      } catch (Exception var22) {
         ;
      }

   }

   // $FF: renamed from: bc (int, int, int, int[], int[], int, int, int, int, int, int, int, int, int) void
   static void method_832(int var0, int var1, int var2, int[] var3, int[] var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13) {
      for(var8 = -var10; var8 < 0; ++var8) {
         for(var6 = -var9; var6 < 0; ++var6) {
            var0 = var4[var5++];
            if(var0 != 0) {
               var1 = (var0 & 569662455) * var13;
               var0 = (var1 & -823207123) + (var0 * var13 - var1 & 838842005) >>> 8;
               var1 = var3[var7];
               var2 = var0 + var1;
               var0 = (var0 & 16711935) + (var1 & 16711935);
               var1 = (var0 & 82076908) + (var2 - var0 & 65536);
               var3[var7++] = var2 - var1 | var1 - (var1 >>> 8);
            } else {
               ++var7;
            }
         }

         var7 += var11;
         var5 += var12;
      }

   }

   // $FF: renamed from: ar (int, int, int, int) void
   public void method_833(int var1, int var2, int var3, int var4) {
      if(var3 <= this.field_501 && var4 <= this.field_505) {
         int var5 = var1 + this.field_504 * var3 / this.field_501;
         int var6 = var1 + ((this.field_504 + this.field_508) * var3 + this.field_501 - 1) / this.field_501;
         int var7 = var2 + this.field_503 * var4 / this.field_505;
         int var8 = var2 + ((this.field_503 + this.field_500) * var4 + this.field_505 - 1) / this.field_505;
         if(var5 < field_489) {
            var5 = field_489;
         }

         if(var6 > field_488) {
            var6 = field_488;
         }

         if(var7 < field_487) {
            var7 = field_487;
         }

         if(var8 > field_485) {
            var8 = field_485;
         }

         if(var5 < var6 && var7 < var8) {
            int var9 = var7 * field_484 + var5;
            int var10 = field_484 - (var6 - var5);
            if(var9 < field_490.length) {
               for(int var11 = var7; var11 < var8; ++var11) {
                  for(int var12 = var5; var12 < var6; ++var12) {
                     int var13 = var12 - var1 << 4;
                     int var14 = var11 - var2 << 4;
                     int var15 = var13 * this.field_501 / var3 - (this.field_504 << 4);
                     int var16 = (var13 + 16) * this.field_501 / var3 - (this.field_504 << 4);
                     int var17 = var14 * this.field_505 / var4 - (this.field_503 << 4);
                     int var18 = (var14 + 16) * this.field_505 / var4 - (this.field_503 << 4);
                     int var19 = (var16 - var15) * (var18 - var17) >> 1;
                     if(var19 != 0) {
                        if(var15 < 0) {
                           var15 = 0;
                        }

                        if(var16 >= this.field_508 << 4) {
                           var16 = this.field_508 << 4;
                        }

                        if(var17 < 0) {
                           var17 = 0;
                        }

                        if(var18 >= this.field_500 << 4) {
                           var18 = this.field_500 << 4;
                        }

                        --var16;
                        --var18;
                        int var20 = 16 - (var15 & 15);
                        int var21 = (var16 & 15) + 1;
                        int var22 = 16 - (var17 & 15);
                        int var23 = (var18 & 15) + 1;
                        var15 >>= 4;
                        var16 >>= 4;
                        var17 >>= 4;
                        var18 >>= 4;
                        int var24 = 0;
                        int var25 = 0;
                        int var26 = 0;
                        int var27 = 0;

                        int var28;
                        for(var28 = var17; var28 <= var18; ++var28) {
                           int var29 = 16;
                           if(var28 == var17) {
                              var29 = var22;
                           }

                           if(var28 == var18) {
                              var29 = var23;
                           }

                           for(int var30 = var15; var30 <= var16; ++var30) {
                              int var31 = this.field_502[var28 * this.field_508 + var30];
                              if(var31 != 0) {
                                 int var32;
                                 if(var30 == var15) {
                                    var32 = var29 * var20;
                                 } else if(var30 == var16) {
                                    var32 = var29 * var21;
                                 } else {
                                    var32 = var29 << 4;
                                 }

                                 var27 += var32;
                                 var24 += (var31 >> 16 & 255) * var32;
                                 var25 += (var31 >> 8 & 255) * var32;
                                 var26 += (var31 & 255) * var32;
                              }
                           }
                        }

                        if(var27 >= var19) {
                           var28 = (var24 / var27 << 16) + (var25 / var27 << 8) + var26 / var27;
                           if(var28 == 0) {
                              var28 = 1;
                           }

                           field_490[var9] = var28;
                        }

                        ++var9;
                     }
                  }

                  var9 += var10;
               }

            }
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   // $FF: renamed from: cm (int, int, int, int, int) void
   public void method_834(int var1, int var2, int var3, int var4, int var5) {
      if(var3 > 0 && var4 > 0) {
         int var6 = this.field_508;
         int var7 = this.field_500;
         int var8 = 0;
         int var9 = 0;
         int var10 = this.field_501;
         int var11 = this.field_505;
         int var12 = (var10 << 16) / var3;
         int var13 = (var11 << 16) / var4;
         int var14;
         if(this.field_504 > 0) {
            var14 = ((this.field_504 << 16) + var12 - 1) / var12;
            var1 += var14;
            var8 += var14 * var12 - (this.field_504 << 16);
         }

         if(this.field_503 > 0) {
            var14 = ((this.field_503 << 16) + var13 - 1) / var13;
            var2 += var14;
            var9 += var14 * var13 - (this.field_503 << 16);
         }

         if(var6 < var10) {
            var3 = ((var6 << 16) - var8 + var12 - 1) / var12;
         }

         if(var7 < var11) {
            var4 = ((var7 << 16) - var9 + var13 - 1) / var13;
         }

         var14 = var1 + var2 * field_484;
         int var15 = field_484 - var3;
         if(var2 + var4 > field_485) {
            var4 -= var2 + var4 - field_485;
         }

         int var16;
         if(var2 < field_487) {
            var16 = field_487 - var2;
            var4 -= var16;
            var14 += var16 * field_484;
            var9 += var13 * var16;
         }

         if(var1 + var3 > field_488) {
            var16 = var1 + var3 - field_488;
            var3 -= var16;
            var15 += var16;
         }

         if(var1 < field_489) {
            var16 = field_489 - var1;
            var3 -= var16;
            var14 += var16;
            var8 += var12 * var16;
            var15 += var16;
         }

         if(var5 == 256) {
            method_819(0, 0, 0, var8, this.field_502, field_490, 0, 0, -var4, var9, var14, var15, var3, var12, var13, var6);
         } else {
            method_782(0, 0, 0, var8, this.field_502, field_490, 0, 0, -var4, var9, var14, var15, var3, var12, var13, var6, var5);
         }

      }
   }

   // $FF: renamed from: cv (int, int, int, int, int) void
   public void method_835(int var1, int var2, int var3, int var4, int var5) {
      if(var3 > 0 && var4 > 0) {
         int var6 = this.field_508;
         int var7 = this.field_500;
         int var8 = 0;
         int var9 = 0;
         int var10 = this.field_501;
         int var11 = this.field_505;
         int var12 = (var10 << 16) / var3;
         int var13 = (var11 << 16) / var4;
         int var14;
         if(this.field_504 > 0) {
            var14 = ((this.field_504 << 16) + var12 - 1) / var12;
            var1 += var14;
            var8 += var14 * var12 - (this.field_504 << 16);
         }

         if(this.field_503 > 0) {
            var14 = ((this.field_503 << 16) + var13 - 1) / var13;
            var2 += var14;
            var9 += var14 * var13 - (this.field_503 << 16);
         }

         if(var6 < var10) {
            var3 = ((var6 << 16) - var8 + var12 - 1) / var12;
         }

         if(var7 < var11) {
            var4 = ((var7 << 16) - var9 + var13 - 1) / var13;
         }

         var14 = var1 + var2 * field_484;
         int var15 = field_484 - var3;
         if(var2 + var4 > field_485) {
            var4 -= var2 + var4 - field_485;
         }

         int var16;
         if(var2 < field_487) {
            var16 = field_487 - var2;
            var4 -= var16;
            var14 += var16 * field_484;
            var9 += var13 * var16;
         }

         if(var1 + var3 > field_488) {
            var16 = var1 + var3 - field_488;
            var3 -= var16;
            var15 += var16;
         }

         if(var1 < field_489) {
            var16 = field_489 - var1;
            var3 -= var16;
            var14 += var16;
            var8 += var12 * var16;
            var15 += var16;
         }

         if(var5 == 256) {
            method_819(0, 0, 0, var8, this.field_502, field_490, 0, 0, -var4, var9, var14, var15, var3, var12, var13, var6);
         } else {
            method_782(0, 0, 0, var8, this.field_502, field_490, 0, 0, -var4, var9, var14, var15, var3, var12, var13, var6, var5);
         }

      }
   }

   // $FF: renamed from: cp (int, int, int, int, int[], int[], int, int, int, int, int, int, int, int, int, int) void
   static void method_836(int var0, int var1, int var2, int var3, int[] var4, int[] var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15) {
      for(int var16 = var3; var8 < 0; ++var8) {
         var7 = (var9 >> 16) * var15;

         for(var6 = -var12; var6 < 0; ++var6) {
            var0 = var4[(var3 >> 16) + var7];
            if(var0 != 0) {
               var1 = var5[var10];
               var2 = var0 + var1;
               var0 = (var0 & 963778719) + (var1 & 59893697);
               var1 = (var0 & -1221847489) + (var2 - var0 & 65536);
               var5[var10++] = var2 - var1 | var1 - (var1 >>> 8);
            } else {
               ++var10;
            }

            var3 += var13;
         }

         var9 += var14;
         var3 = var16;
         var10 += var11;
      }

   }

   // $FF: renamed from: j () void
   public void method_837() {
      int[] var1 = new int[this.field_508 * this.field_500];
      int var2 = 0;

      for(int var3 = 0; var3 < this.field_500; ++var3) {
         for(int var4 = this.field_508 - 1; var4 >= 0; --var4) {
            var1[var2++] = this.field_502[var4 + var3 * this.field_508];
         }
      }

      this.field_502 = var1;
      this.field_504 = this.field_501 - this.field_508 - this.field_504;
   }

   // $FF: renamed from: ct (int, int, int, int, int[], int[], int, int, int, int, int, int, int, int, int, int, int) void
   static void method_838(int var0, int var1, int var2, int var3, int[] var4, int[] var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16) {
      for(int var17 = var3; var8 < 0; ++var8) {
         var7 = (var9 >> 16) * var15;

         for(var6 = -var12; var6 < 0; ++var6) {
            var0 = var4[(var3 >> 16) + var7];
            if(var0 != 0) {
               var1 = (var0 & 2135151682) * var16;
               var0 = (var1 & 281356831) + (var0 * var16 - var1 & 16711680) >>> 8;
               var1 = var5[var10];
               var2 = var0 + var1;
               var0 = (var0 & -441223733) + (var1 & -746877728);
               var1 = (var0 & -452155992) + (var2 - var0 & 65536);
               var5[var10++] = var2 - var1 | var1 - (var1 >>> 8);
            } else {
               ++var10;
            }

            var3 += var13;
         }

         var9 += var14;
         var3 = var17;
         var10 += var11;
      }

   }

   // $FF: renamed from: bn (int, int, int, int, int) void
   public void method_839(int var1, int var2, int var3, int var4, int var5) {
      if(var3 > 0 && var4 > 0) {
         int var6 = this.field_508;
         int var7 = this.field_500;
         int var8 = 0;
         int var9 = 0;
         int var10 = this.field_501;
         int var11 = this.field_505;
         int var12 = (var10 << 16) / var3;
         int var13 = (var11 << 16) / var4;
         int var14;
         if(this.field_504 > 0) {
            var14 = ((this.field_504 << 16) + var12 - 1) / var12;
            var1 += var14;
            var8 += var14 * var12 - (this.field_504 << 16);
         }

         if(this.field_503 > 0) {
            var14 = ((this.field_503 << 16) + var13 - 1) / var13;
            var2 += var14;
            var9 += var14 * var13 - (this.field_503 << 16);
         }

         if(var6 < var10) {
            var3 = ((var6 << 16) - var8 + var12 - 1) / var12;
         }

         if(var7 < var11) {
            var4 = ((var7 << 16) - var9 + var13 - 1) / var13;
         }

         var14 = var1 + var2 * field_484;
         int var15 = field_484 - var3;
         if(var2 + var4 > field_485) {
            var4 -= var2 + var4 - field_485;
         }

         int var16;
         if(var2 < field_487) {
            var16 = field_487 - var2;
            var4 -= var16;
            var14 += var16 * field_484;
            var9 += var13 * var16;
         }

         if(var1 + var3 > field_488) {
            var16 = var1 + var3 - field_488;
            var3 -= var16;
            var15 += var16;
         }

         if(var1 < field_489) {
            var16 = field_489 - var1;
            var3 -= var16;
            var14 += var16;
            var8 += var12 * var16;
            var15 += var16;
         }

         method_776(field_490, this.field_502, 0, var8, var9, var14, var15, var3, var4, var12, var13, var6, var5);
      }
   }

   // $FF: renamed from: cr (int, int, int, int, int[], int[], int, int, int, int, int, int, int, int, int, int, int) void
   static void method_840(int var0, int var1, int var2, int var3, int[] var4, int[] var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16) {
      for(int var17 = var3; var8 < 0; ++var8) {
         var7 = (var9 >> 16) * var15;

         for(var6 = -var12; var6 < 0; ++var6) {
            var0 = var4[(var3 >> 16) + var7];
            if(var0 != 0) {
               var1 = (var0 & -315018788) * var16;
               var0 = (var1 & -1567084395) + (var0 * var16 - var1 & 16711680) >>> 8;
               var1 = var5[var10];
               var2 = var0 + var1;
               var0 = (var0 & 1672352028) + (var1 & 16711935);
               var1 = (var0 & 16777472) + (var2 - var0 & -69460046);
               var5[var10++] = var2 - var1 | var1 - (var1 >>> 8);
            } else {
               ++var10;
            }

            var3 += var13;
         }

         var9 += var14;
         var3 = var17;
         var10 += var11;
      }

   }

   // $FF: renamed from: bm (int[], int[], int, int, int, int, int, int, int) void
   static void method_841(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = -(var5 >> 2);
      var5 = -(var5 & 3);

      for(int var10 = -var6; var10 < 0; ++var10) {
         int var11;
         for(var11 = var9; var11 < 0; ++var11) {
            var2 = var1[var3++];
            if(var2 != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            var2 = var1[var3++];
            if(var2 != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            var2 = var1[var3++];
            if(var2 != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            var2 = var1[var3++];
            if(var2 != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }
         }

         for(var11 = var5; var11 < 0; ++var11) {
            var2 = var1[var3++];
            if(var2 != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   // $FF: renamed from: ab (int, int, int, int, int, int, int, int, int[], int[]) void
   public void method_842(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int[] var9, int[] var10) {
      try {
         int var11 = -var3 / 2;
         int var12 = -var4 / 2;
         int var13 = (int)(Math.sin((double)var7 / 326.11D) * 65536.0D);
         int var14 = (int)(Math.cos((double)var7 / 326.11D) * 65536.0D);
         var13 = var13 * var8 >> 8;
         var14 = var14 * var8 >> 8;
         int var15 = (var5 << 16) + var12 * var13 + var11 * var14;
         int var16 = (var6 << 16) + (var12 * var14 - var11 * var13);
         int var17 = var1 + var2 * field_484;

         for(var2 = 0; var2 < var4; ++var2) {
            int var18 = var9[var2];
            int var19 = var17 + var18;
            int var20 = var15 + var14 * var18;
            int var21 = var16 - var13 * var18;

            for(var1 = -var10[var2]; var1 < 0; ++var1) {
               field_490[var19++] = this.field_502[(var20 >> 16) + (var21 >> 16) * this.field_508];
               var20 += var14;
               var21 -= var13;
            }

            var15 += var13;
            var16 += var14;
            var17 += field_484;
         }
      } catch (Exception var22) {
         ;
      }

   }

   // $FF: renamed from: aa () void
   public void method_843() {
      int[] var1 = new int[this.field_508 * this.field_500];
      int var2 = 0;

      for(int var3 = this.field_500 - 1; var3 >= 0; --var3) {
         for(int var4 = 0; var4 < this.field_508; ++var4) {
            var1[var2++] = this.field_502[var4 + var3 * this.field_508];
         }
      }

      this.field_502 = var1;
      this.field_503 = this.field_505 - this.field_500 - this.field_503;
   }

   // $FF: renamed from: cg (int, int, int, int, int, int, int[], int[]) void
   public void method_844(int var1, int var2, int var3, int var4, int var5, int var6, int[] var7, int[] var8) {
      int var9 = var2 < 0?-var2:0;
      int var10 = var2 + this.field_500 <= var6?this.field_500:var6 - var2;
      int var11 = var1 < 0?-var1:0;
      int var10000;
      if(var1 + this.field_508 <= var5) {
         var10000 = this.field_508;
      } else {
         var10000 = var5 - var1;
      }

      int var13 = var3 + var1 + var11 + (var4 + var2 + var9) * field_484;
      int var14 = var2 + var9;

      for(int var15 = var9; var15 < var10; ++var15) {
         int var16 = var7[var14];
         int var17 = var8[var14++];
         int var18 = var13;
         int var19;
         if(var1 < var16) {
            var19 = var16 - var1;
            var18 = var13 + (var19 - var11);
         } else {
            var19 = var11;
         }

         int var12;
         if(var1 + this.field_508 <= var16 + var17) {
            var12 = this.field_508;
         } else {
            var12 = var16 + var17 - var1;
         }

         for(int var20 = var19; var20 < var12; ++var20) {
            int var21 = this.field_502[var20 + var15 * this.field_508];
            if(var21 != 0) {
               field_490[var18++] = var21;
            } else {
               ++var18;
            }
         }

         var13 += field_484;
      }

   }

   // $FF: renamed from: co (int, int, int, int, int, int, int, int, int[], int[]) void
   public void method_845(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int[] var9, int[] var10) {
      try {
         int var11 = -var3 / 2;
         int var12 = -var4 / 2;
         int var13 = (int)(Math.sin((double)var7 / 326.11D) * 65536.0D);
         int var14 = (int)(Math.cos((double)var7 / 326.11D) * 65536.0D);
         var13 = var13 * var8 >> 8;
         var14 = var14 * var8 >> 8;
         int var15 = (var5 << 16) + var12 * var13 + var11 * var14;
         int var16 = (var6 << 16) + (var12 * var14 - var11 * var13);
         int var17 = var1 + var2 * field_484;

         for(var2 = 0; var2 < var4; ++var2) {
            int var18 = var9[var2];
            int var19 = var17 + var18;
            int var20 = var15 + var14 * var18;
            int var21 = var16 - var13 * var18;

            for(var1 = -var10[var2]; var1 < 0; ++var1) {
               field_490[var19++] = this.field_502[(var20 >> 16) + (var21 >> 16) * this.field_508];
               var20 += var14;
               var21 -= var13;
            }

            var15 += var13;
            var16 += var14;
            var17 += field_484;
         }
      } catch (Exception var22) {
         ;
      }

   }

   // $FF: renamed from: cn (int, int, int, int, int, int, int[], int[]) void
   public void method_846(int var1, int var2, int var3, int var4, int var5, int var6, int[] var7, int[] var8) {
      int var9 = var2 < 0?-var2:0;
      int var10 = var2 + this.field_500 <= var6?this.field_500:var6 - var2;
      int var11 = var1 < 0?-var1:0;
      int var10000;
      if(var1 + this.field_508 <= var5) {
         var10000 = this.field_508;
      } else {
         var10000 = var5 - var1;
      }

      int var13 = var3 + var1 + var11 + (var4 + var2 + var9) * field_484;
      int var14 = var2 + var9;

      for(int var15 = var9; var15 < var10; ++var15) {
         int var16 = var7[var14];
         int var17 = var8[var14++];
         int var18 = var13;
         int var19;
         if(var1 < var16) {
            var19 = var16 - var1;
            var18 = var13 + (var19 - var11);
         } else {
            var19 = var11;
         }

         int var12;
         if(var1 + this.field_508 <= var16 + var17) {
            var12 = this.field_508;
         } else {
            var12 = var16 + var17 - var1;
         }

         for(int var20 = var19; var20 < var12; ++var20) {
            int var21 = this.field_502[var20 + var15 * this.field_508];
            if(var21 != 0) {
               field_490[var18++] = var21;
            } else {
               ++var18;
            }
         }

         var13 += field_484;
      }

   }

   // $FF: renamed from: cj (int, int, int, int, int, int, int, int, int[], int[]) void
   public void method_847(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int[] var9, int[] var10) {
      try {
         int var11 = -var3 / 2;
         int var12 = -var4 / 2;
         int var13 = (int)(Math.sin((double)var7 / 326.11D) * 65536.0D);
         int var14 = (int)(Math.cos((double)var7 / 326.11D) * 65536.0D);
         var13 = var13 * var8 >> 8;
         var14 = var14 * var8 >> 8;
         int var15 = (var5 << 16) + var12 * var13 + var11 * var14;
         int var16 = (var6 << 16) + (var12 * var14 - var11 * var13);
         int var17 = var1 + var2 * field_484;

         for(var2 = 0; var2 < var4; ++var2) {
            int var18 = var9[var2];
            int var19 = var17 + var18;
            int var20 = var15 + var14 * var18;
            int var21 = var16 - var13 * var18;

            for(var1 = -var10[var2]; var1 < 0; ++var1) {
               field_490[var19++] = this.field_502[(var20 >> 16) + (var21 >> 16) * this.field_508];
               var20 += var14;
               var21 -= var13;
            }

            var15 += var13;
            var16 += var14;
            var17 += field_484;
         }
      } catch (Exception var22) {
         ;
      }

   }

   // $FF: renamed from: cc (int, int, int, int, int, int, double, int) void
   public void method_848(int var1, int var2, int var3, int var4, int var5, int var6, double var7, int var9) {
      try {
         int var10 = -var3 / 2;
         int var11 = -var4 / 2;
         int var12 = (int)(Math.sin(var7) * 65536.0D);
         int var13 = (int)(Math.cos(var7) * 65536.0D);
         var12 = var12 * var9 >> 8;
         var13 = var13 * var9 >> 8;
         int var14 = (var5 << 16) + var11 * var12 + var10 * var13;
         int var15 = (var6 << 16) + (var11 * var13 - var10 * var12);
         int var16 = var1 + var2 * field_484;

         for(var2 = 0; var2 < var4; ++var2) {
            int var17 = var16;
            int var18 = var14;
            int var19 = var15;

            for(var1 = -var3; var1 < 0; ++var1) {
               int var20 = this.field_502[(var18 >> 16) + (var19 >> 16) * this.field_508];
               if(var20 != 0) {
                  field_490[var17++] = var20;
               } else {
                  ++var17;
               }

               var18 += var13;
               var19 -= var12;
            }

            var14 += var12;
            var15 += var13;
            var16 += field_484;
         }
      } catch (Exception var21) {
         ;
      }

   }

   // $FF: renamed from: bs (int, int, int, int) void
   public void method_849(int var1, int var2, int var3, int var4) {
      if(var3 > 0 && var4 > 0) {
         int var5 = this.field_508;
         int var6 = this.field_500;
         int var7 = 0;
         int var8 = 0;
         int var9 = this.field_501;
         int var10 = this.field_505;
         int var11 = (var9 << 16) / var3;
         int var12 = (var10 << 16) / var4;
         int var13;
         if(this.field_504 > 0) {
            var13 = ((this.field_504 << 16) + var11 - 1) / var11;
            var1 += var13;
            var7 += var13 * var11 - (this.field_504 << 16);
         }

         if(this.field_503 > 0) {
            var13 = ((this.field_503 << 16) + var12 - 1) / var12;
            var2 += var13;
            var8 += var13 * var12 - (this.field_503 << 16);
         }

         if(var5 < var9) {
            var3 = ((var5 << 16) - var7 + var11 - 1) / var11;
         }

         if(var6 < var10) {
            var4 = ((var6 << 16) - var8 + var12 - 1) / var12;
         }

         var13 = var1 + var2 * field_484;
         int var14 = field_484 - var3;
         if(var2 + var4 > field_485) {
            var4 -= var2 + var4 - field_485;
         }

         int var15;
         if(var2 < field_487) {
            var15 = field_487 - var2;
            var4 -= var15;
            var13 += var15 * field_484;
            var8 += var12 * var15;
         }

         if(var1 + var3 > field_488) {
            var15 = var1 + var3 - field_488;
            var3 -= var15;
            var14 += var15;
         }

         if(var1 < field_489) {
            var15 = field_489 - var1;
            var3 -= var15;
            var13 += var15;
            var7 += var11 * var15;
            var14 += var15;
         }

         method_801(field_490, this.field_502, 0, var7, var8, var13, var14, var3, var4, var11, var12, var5);
      }
   }

   // $FF: renamed from: cz (int, int, int, int, int, int, double, int) void
   public void method_850(int var1, int var2, int var3, int var4, int var5, int var6, double var7, int var9) {
      try {
         int var10 = -var3 / 2;
         int var11 = -var4 / 2;
         int var12 = (int)(Math.sin(var7) * 65536.0D);
         int var13 = (int)(Math.cos(var7) * 65536.0D);
         var12 = var12 * var9 >> 8;
         var13 = var13 * var9 >> 8;
         int var14 = (var5 << 16) + var11 * var12 + var10 * var13;
         int var15 = (var6 << 16) + (var11 * var13 - var10 * var12);
         int var16 = var1 + var2 * field_484;

         for(var2 = 0; var2 < var4; ++var2) {
            int var17 = var16;
            int var18 = var14;
            int var19 = var15;

            for(var1 = -var3; var1 < 0; ++var1) {
               int var20 = this.field_502[(var18 >> 16) + (var19 >> 16) * this.field_508];
               if(var20 != 0) {
                  field_490[var17++] = var20;
               } else {
                  ++var17;
               }

               var18 += var13;
               var19 -= var12;
            }

            var14 += var12;
            var15 += var13;
            var16 += field_484;
         }
      } catch (Exception var21) {
         ;
      }

   }

   // $FF: renamed from: cb (int, int, int, int) void
   public void method_851(int var1, int var2, int var3, int var4) {
      this.method_786(this.field_501 << 3, this.field_505 << 3, var1 << 4, var2 << 4, var3, var4);
   }

   // $FF: renamed from: cu (int, int, int, int, int, int, double, int) void
   public void method_852(int var1, int var2, int var3, int var4, int var5, int var6, double var7, int var9) {
      try {
         int var10 = -var3 / 2;
         int var11 = -var4 / 2;
         int var12 = (int)(Math.sin(var7) * 65536.0D);
         int var13 = (int)(Math.cos(var7) * 65536.0D);
         var12 = var12 * var9 >> 8;
         var13 = var13 * var9 >> 8;
         int var14 = (var5 << 16) + var11 * var12 + var10 * var13;
         int var15 = (var6 << 16) + (var11 * var13 - var10 * var12);
         int var16 = var1 + var2 * field_484;

         for(var2 = 0; var2 < var4; ++var2) {
            int var17 = var16;
            int var18 = var14;
            int var19 = var15;

            for(var1 = -var3; var1 < 0; ++var1) {
               int var20 = this.field_502[(var18 >> 16) + (var19 >> 16) * this.field_508];
               if(var20 != 0) {
                  field_490[var17++] = var20;
               } else {
                  ++var17;
               }

               var18 += var13;
               var19 -= var12;
            }

            var14 += var12;
            var15 += var13;
            var16 += field_484;
         }
      } catch (Exception var21) {
         ;
      }

   }

   // $FF: renamed from: at () void
   public void method_853() {
      if(this.field_508 != this.field_501 || this.field_500 != this.field_505) {
         int[] var1 = new int[this.field_501 * this.field_505];

         for(int var2 = 0; var2 < this.field_500; ++var2) {
            for(int var3 = 0; var3 < this.field_508; ++var3) {
               var1[(var2 + this.field_503) * this.field_501 + var3 + this.field_504] = this.field_502[var2 * this.field_508 + var3];
            }
         }

         this.field_502 = var1;
         this.field_508 = this.field_501;
         this.field_500 = this.field_505;
         this.field_504 = 0;
         this.field_503 = 0;
      }
   }

   // $FF: renamed from: ca (int, int, int, int) void
   public void method_854(int var1, int var2, int var3, int var4) {
      if(var3 <= this.field_501 && var4 <= this.field_505) {
         int var5 = var1 + this.field_504 * var3 / this.field_501;
         int var6 = var1 + ((this.field_504 + this.field_508) * var3 + this.field_501 - 1) / this.field_501;
         int var7 = var2 + this.field_503 * var4 / this.field_505;
         int var8 = var2 + ((this.field_503 + this.field_500) * var4 + this.field_505 - 1) / this.field_505;
         if(var5 < field_489) {
            var5 = field_489;
         }

         if(var6 > field_488) {
            var6 = field_488;
         }

         if(var7 < field_487) {
            var7 = field_487;
         }

         if(var8 > field_485) {
            var8 = field_485;
         }

         if(var5 < var6 && var7 < var8) {
            int var9 = var7 * field_484 + var5;
            int var10 = field_484 - (var6 - var5);
            if(var9 < field_490.length) {
               for(int var11 = var7; var11 < var8; ++var11) {
                  for(int var12 = var5; var12 < var6; ++var12) {
                     int var13 = var12 - var1 << 4;
                     int var14 = var11 - var2 << 4;
                     int var15 = var13 * this.field_501 / var3 - (this.field_504 << 4);
                     int var16 = (var13 + 16) * this.field_501 / var3 - (this.field_504 << 4);
                     int var17 = var14 * this.field_505 / var4 - (this.field_503 << 4);
                     int var18 = (var14 + 16) * this.field_505 / var4 - (this.field_503 << 4);
                     int var19 = (var16 - var15) * (var18 - var17) >> 1;
                     if(var19 != 0) {
                        if(var15 < 0) {
                           var15 = 0;
                        }

                        if(var16 >= this.field_508 << 4) {
                           var16 = this.field_508 << 4;
                        }

                        if(var17 < 0) {
                           var17 = 0;
                        }

                        if(var18 >= this.field_500 << 4) {
                           var18 = this.field_500 << 4;
                        }

                        --var16;
                        --var18;
                        int var20 = 16 - (var15 & 15);
                        int var21 = (var16 & 15) + 1;
                        int var22 = 16 - (var17 & 15);
                        int var23 = (var18 & 15) + 1;
                        var15 >>= 4;
                        var16 >>= 4;
                        var17 >>= 4;
                        var18 >>= 4;
                        int var24 = 0;
                        int var25 = 0;
                        int var26 = 0;
                        int var27 = 0;

                        int var28;
                        for(var28 = var17; var28 <= var18; ++var28) {
                           int var29 = 16;
                           if(var28 == var17) {
                              var29 = var22;
                           }

                           if(var28 == var18) {
                              var29 = var23;
                           }

                           for(int var30 = var15; var30 <= var16; ++var30) {
                              int var31 = this.field_502[var28 * this.field_508 + var30];
                              if(var31 != 0) {
                                 int var32;
                                 if(var30 == var15) {
                                    var32 = var29 * var20;
                                 } else if(var30 == var16) {
                                    var32 = var29 * var21;
                                 } else {
                                    var32 = var29 << 4;
                                 }

                                 var27 += var32;
                                 var24 += (var31 >> 16 & 255) * var32;
                                 var25 += (var31 >> 8 & 1038048323) * var32;
                                 var26 += (var31 & -489481111) * var32;
                              }
                           }
                        }

                        if(var27 >= var19) {
                           var28 = (var24 / var27 << 16) + (var25 / var27 << 8) + var26 / var27;
                           if(var28 == 0) {
                              var28 = 1;
                           }

                           field_490[var9] = var28;
                        }

                        ++var9;
                     }
                  }

                  var9 += var10;
               }

            }
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   // $FF: renamed from: cx (int, int, int, int) void
   public void method_855(int var1, int var2, int var3, int var4) {
      if(var3 <= this.field_501 && var4 <= this.field_505) {
         int var5 = var1 + this.field_504 * var3 / this.field_501;
         int var6 = var1 + ((this.field_504 + this.field_508) * var3 + this.field_501 - 1) / this.field_501;
         int var7 = var2 + this.field_503 * var4 / this.field_505;
         int var8 = var2 + ((this.field_503 + this.field_500) * var4 + this.field_505 - 1) / this.field_505;
         if(var5 < field_489) {
            var5 = field_489;
         }

         if(var6 > field_488) {
            var6 = field_488;
         }

         if(var7 < field_487) {
            var7 = field_487;
         }

         if(var8 > field_485) {
            var8 = field_485;
         }

         if(var5 < var6 && var7 < var8) {
            int var9 = var7 * field_484 + var5;
            int var10 = field_484 - (var6 - var5);
            if(var9 < field_490.length) {
               for(int var11 = var7; var11 < var8; ++var11) {
                  for(int var12 = var5; var12 < var6; ++var12) {
                     int var13 = var12 - var1 << 4;
                     int var14 = var11 - var2 << 4;
                     int var15 = var13 * this.field_501 / var3 - (this.field_504 << 4);
                     int var16 = (var13 + 16) * this.field_501 / var3 - (this.field_504 << 4);
                     int var17 = var14 * this.field_505 / var4 - (this.field_503 << 4);
                     int var18 = (var14 + 16) * this.field_505 / var4 - (this.field_503 << 4);
                     int var19 = (var16 - var15) * (var18 - var17) >> 1;
                     if(var19 != 0) {
                        if(var15 < 0) {
                           var15 = 0;
                        }

                        if(var16 >= this.field_508 << 4) {
                           var16 = this.field_508 << 4;
                        }

                        if(var17 < 0) {
                           var17 = 0;
                        }

                        if(var18 >= this.field_500 << 4) {
                           var18 = this.field_500 << 4;
                        }

                        --var16;
                        --var18;
                        int var20 = 16 - (var15 & 15);
                        int var21 = (var16 & 15) + 1;
                        int var22 = 16 - (var17 & 15);
                        int var23 = (var18 & 15) + 1;
                        var15 >>= 4;
                        var16 >>= 4;
                        var17 >>= 4;
                        var18 >>= 4;
                        int var24 = 0;
                        int var25 = 0;
                        int var26 = 0;
                        int var27 = 0;

                        int var28;
                        for(var28 = var17; var28 <= var18; ++var28) {
                           int var29 = 16;
                           if(var28 == var17) {
                              var29 = var22;
                           }

                           if(var28 == var18) {
                              var29 = var23;
                           }

                           for(int var30 = var15; var30 <= var16; ++var30) {
                              int var31 = this.field_502[var28 * this.field_508 + var30];
                              if(var31 != 0) {
                                 int var32;
                                 if(var30 == var15) {
                                    var32 = var29 * var20;
                                 } else if(var30 == var16) {
                                    var32 = var29 * var21;
                                 } else {
                                    var32 = var29 << 4;
                                 }

                                 var27 += var32;
                                 var24 += (var31 >> 16 & 255) * var32;
                                 var25 += (var31 >> 8 & 255) * var32;
                                 var26 += (var31 & 255) * var32;
                              }
                           }
                        }

                        if(var27 >= var19) {
                           var28 = (var24 / var27 << 16) + (var25 / var27 << 8) + var26 / var27;
                           if(var28 == 0) {
                              var28 = 1;
                           }

                           field_490[var9] = var28;
                        }

                        ++var9;
                     }
                  }

                  var9 += var10;
               }

            }
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   // $FF: renamed from: v () oh
   public class_67 method_856() {
      class_67 var10000 = new class_67;
      var10000.method_754(this.field_508, this.field_500);
      class_67 var1 = var10000;
      var1.field_501 = this.field_501;
      var1.field_505 = this.field_505;
      var1.field_504 = this.field_501 - this.field_508 - this.field_504;
      var1.field_503 = this.field_503;

      for(int var2 = 0; var2 < this.field_500; ++var2) {
         for(int var3 = 0; var3 < this.field_508; ++var3) {
            var1.field_502[var2 * this.field_508 + var3] = this.field_502[var2 * this.field_508 + this.field_508 - 1 - var3];
         }
      }

      return var1;
   }

   // $FF: renamed from: cl (int, int, int, int) void
   public void method_857(int var1, int var2, int var3, int var4) {
      if(var3 <= this.field_501 && var4 <= this.field_505) {
         int var5 = var1 + this.field_504 * var3 / this.field_501;
         int var6 = var1 + ((this.field_504 + this.field_508) * var3 + this.field_501 - 1) / this.field_501;
         int var7 = var2 + this.field_503 * var4 / this.field_505;
         int var8 = var2 + ((this.field_503 + this.field_500) * var4 + this.field_505 - 1) / this.field_505;
         if(var5 < field_489) {
            var5 = field_489;
         }

         if(var6 > field_488) {
            var6 = field_488;
         }

         if(var7 < field_487) {
            var7 = field_487;
         }

         if(var8 > field_485) {
            var8 = field_485;
         }

         if(var5 < var6 && var7 < var8) {
            int var9 = var7 * field_484 + var5;
            int var10 = field_484 - (var6 - var5);
            if(var9 < field_490.length) {
               for(int var11 = var7; var11 < var8; ++var11) {
                  for(int var12 = var5; var12 < var6; ++var12) {
                     int var13 = var12 - var1 << 4;
                     int var14 = var11 - var2 << 4;
                     int var15 = var13 * this.field_501 / var3 - (this.field_504 << 4);
                     int var16 = (var13 + 16) * this.field_501 / var3 - (this.field_504 << 4);
                     int var17 = var14 * this.field_505 / var4 - (this.field_503 << 4);
                     int var18 = (var14 + 16) * this.field_505 / var4 - (this.field_503 << 4);
                     int var19 = (var16 - var15) * (var18 - var17) >> 1;
                     if(var19 != 0) {
                        if(var15 < 0) {
                           var15 = 0;
                        }

                        if(var16 >= this.field_508 << 4) {
                           var16 = this.field_508 << 4;
                        }

                        if(var17 < 0) {
                           var17 = 0;
                        }

                        if(var18 >= this.field_500 << 4) {
                           var18 = this.field_500 << 4;
                        }

                        --var16;
                        --var18;
                        int var20 = 16 - (var15 & 15);
                        int var21 = (var16 & 15) + 1;
                        int var22 = 16 - (var17 & 15);
                        int var23 = (var18 & 15) + 1;
                        var15 >>= 4;
                        var16 >>= 4;
                        var17 >>= 4;
                        var18 >>= 4;
                        int var24 = 0;
                        int var25 = 0;
                        int var26 = 0;
                        int var27 = 0;

                        int var28;
                        for(var28 = var17; var28 <= var18; ++var28) {
                           int var29 = 16;
                           if(var28 == var17) {
                              var29 = var22;
                           }

                           if(var28 == var18) {
                              var29 = var23;
                           }

                           for(int var30 = var15; var30 <= var16; ++var30) {
                              int var31 = this.field_502[var28 * this.field_508 + var30];
                              if(var31 != 0) {
                                 int var32;
                                 if(var30 == var15) {
                                    var32 = var29 * var20;
                                 } else if(var30 == var16) {
                                    var32 = var29 * var21;
                                 } else {
                                    var32 = var29 << 4;
                                 }

                                 var27 += var32;
                                 var24 += (var31 >> 16 & 255) * var32;
                                 var25 += (var31 >> 8 & 255) * var32;
                                 var26 += (var31 & 255) * var32;
                              }
                           }
                        }

                        if(var27 >= var19) {
                           var28 = (var24 / var27 << 16) + (var25 / var27 << 8) + var26 / var27;
                           if(var28 == 0) {
                              var28 = 1;
                           }

                           field_490[var9] = var28;
                        }

                        ++var9;
                     }
                  }

                  var9 += var10;
               }

            }
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   // $FF: renamed from: cw (int, int, int, int) void
   public void method_858(int var1, int var2, int var3, int var4) {
      if(var3 <= this.field_501 && var4 <= this.field_505) {
         int var5 = var1 + this.field_504 * var3 / this.field_501;
         int var6 = var1 + ((this.field_504 + this.field_508) * var3 + this.field_501 - 1) / this.field_501;
         int var7 = var2 + this.field_503 * var4 / this.field_505;
         int var8 = var2 + ((this.field_503 + this.field_500) * var4 + this.field_505 - 1) / this.field_505;
         if(var5 < field_489) {
            var5 = field_489;
         }

         if(var6 > field_488) {
            var6 = field_488;
         }

         if(var7 < field_487) {
            var7 = field_487;
         }

         if(var8 > field_485) {
            var8 = field_485;
         }

         if(var5 < var6 && var7 < var8) {
            int var9 = var7 * field_484 + var5;
            int var10 = field_484 - (var6 - var5);
            if(var9 < field_490.length) {
               for(int var11 = var7; var11 < var8; ++var11) {
                  for(int var12 = var5; var12 < var6; ++var12) {
                     int var13 = var12 - var1 << 4;
                     int var14 = var11 - var2 << 4;
                     int var15 = var13 * this.field_501 / var3 - (this.field_504 << 4);
                     int var16 = (var13 + 16) * this.field_501 / var3 - (this.field_504 << 4);
                     int var17 = var14 * this.field_505 / var4 - (this.field_503 << 4);
                     int var18 = (var14 + 16) * this.field_505 / var4 - (this.field_503 << 4);
                     int var19 = (var16 - var15) * (var18 - var17) >> 1;
                     if(var19 != 0) {
                        if(var15 < 0) {
                           var15 = 0;
                        }

                        if(var16 >= this.field_508 << 4) {
                           var16 = this.field_508 << 4;
                        }

                        if(var17 < 0) {
                           var17 = 0;
                        }

                        if(var18 >= this.field_500 << 4) {
                           var18 = this.field_500 << 4;
                        }

                        --var16;
                        --var18;
                        int var20 = 16 - (var15 & 15);
                        int var21 = (var16 & 15) + 1;
                        int var22 = 16 - (var17 & 15);
                        int var23 = (var18 & 15) + 1;
                        var15 >>= 4;
                        var16 >>= 4;
                        var17 >>= 4;
                        var18 >>= 4;
                        int var24 = 0;
                        int var25 = 0;
                        int var26 = 0;
                        int var27 = 0;

                        int var28;
                        for(var28 = var17; var28 <= var18; ++var28) {
                           int var29 = 16;
                           if(var28 == var17) {
                              var29 = var22;
                           }

                           if(var28 == var18) {
                              var29 = var23;
                           }

                           for(int var30 = var15; var30 <= var16; ++var30) {
                              int var31 = this.field_502[var28 * this.field_508 + var30];
                              if(var31 != 0) {
                                 int var32;
                                 if(var30 == var15) {
                                    var32 = var29 * var20;
                                 } else if(var30 == var16) {
                                    var32 = var29 * var21;
                                 } else {
                                    var32 = var29 << 4;
                                 }

                                 var27 += var32;
                                 var24 += (var31 >> 16 & 255) * var32;
                                 var25 += (var31 >> 8 & -1994204748) * var32;
                                 var26 += (var31 & 255) * var32;
                              }
                           }
                        }

                        if(var27 >= var19) {
                           var28 = (var24 / var27 << 16) + (var25 / var27 << 8) + var26 / var27;
                           if(var28 == 0) {
                              var28 = 1;
                           }

                           field_490[var9] = var28;
                        }

                        ++var9;
                     }
                  }

                  var9 += var10;
               }

            }
         }
      } else {
         throw new IllegalArgumentException();
      }
   }
}
