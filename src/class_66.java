
// $FF: renamed from: op
public final class class_66 extends class_65 {

   // $FF: renamed from: n int[]
   public int[] field_491;
   // $FF: renamed from: y int
   public int field_492;
   // $FF: renamed from: v byte[]
   public byte[] field_493;
   // $FF: renamed from: b int
   public int field_494;
   // $FF: renamed from: p int
   public int field_495;
   // $FF: renamed from: j int
   public int field_496;
   // $FF: renamed from: r int
   public int field_497;
   // $FF: renamed from: f int
   public int field_498;


   // $FF: renamed from: o (int, int) void
   public void method_732(int var1, int var2) {
      var1 += this.field_495;
      var2 += this.field_496;
      int var3 = var1 + var2 * field_484;
      int var4 = 0;
      int var5 = this.field_492;
      int var6 = this.field_498;
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
         method_736(field_490, this.field_493, this.field_491, var4, var3, var6, var5, var7, var8);
      }
   }

   // $FF: renamed from: c (int[], byte[], int[], int, int, int, int, int, int) void
   static void method_733(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = -(var5 >> 2);
      var5 = -(var5 & 3);

      for(int var10 = -var6; var10 < 0; ++var10) {
         int var11;
         byte var12;
         for(var11 = var9; var11 < 0; ++var11) {
            var12 = var1[var3++];
            if(var12 != 0) {
               var0[var4++] = var2[var12 & 255];
            } else {
               ++var4;
            }

            var12 = var1[var3++];
            if(var12 != 0) {
               var0[var4++] = var2[var12 & 255];
            } else {
               ++var4;
            }

            var12 = var1[var3++];
            if(var12 != 0) {
               var0[var4++] = var2[var12 & 2033238024];
            } else {
               ++var4;
            }

            var12 = var1[var3++];
            if(var12 != 0) {
               var0[var4++] = var2[var12 & -1240382877];
            } else {
               ++var4;
            }
         }

         for(var11 = var5; var11 < 0; ++var11) {
            var12 = var1[var3++];
            if(var12 != 0) {
               var0[var4++] = var2[var12 & -2069976783];
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   // $FF: renamed from: n (int, int, int) void
   public void method_734(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field_491.length; ++var4) {
         int var5 = this.field_491[var4] >> 16 & 255;
         var5 += var1;
         if(var5 < 0) {
            var5 = 0;
         } else if(var5 > 255) {
            var5 = 255;
         }

         int var6 = this.field_491[var4] >> 8 & 255;
         var6 += var2;
         if(var6 < 0) {
            var6 = 0;
         } else if(var6 > 255) {
            var6 = 255;
         }

         int var7 = this.field_491[var4] & 255;
         var7 += var3;
         if(var7 < 0) {
            var7 = 0;
         } else if(var7 > 255) {
            var7 = 255;
         }

         this.field_491[var4] = (var5 << 16) + (var6 << 8) + var7;
      }

   }

   // $FF: renamed from: f (int, int) void
   public void method_735(int var1, int var2) {
      var1 += this.field_495;
      var2 += this.field_496;
      int var3 = var1 + var2 * field_484;
      int var4 = 0;
      int var5 = this.field_492;
      int var6 = this.field_498;
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
         method_736(field_490, this.field_493, this.field_491, var4, var3, var6, var5, var7, var8);
      }
   }

   // $FF: renamed from: y (int[], byte[], int[], int, int, int, int, int, int) void
   static void method_736(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = -(var5 >> 2);
      var5 = -(var5 & 3);

      for(int var10 = -var6; var10 < 0; ++var10) {
         int var11;
         byte var12;
         for(var11 = var9; var11 < 0; ++var11) {
            var12 = var1[var3++];
            if(var12 != 0) {
               var0[var4++] = var2[var12 & 255];
            } else {
               ++var4;
            }

            var12 = var1[var3++];
            if(var12 != 0) {
               var0[var4++] = var2[var12 & 255];
            } else {
               ++var4;
            }

            var12 = var1[var3++];
            if(var12 != 0) {
               var0[var4++] = var2[var12 & 255];
            } else {
               ++var4;
            }

            var12 = var1[var3++];
            if(var12 != 0) {
               var0[var4++] = var2[var12 & 255];
            } else {
               ++var4;
            }
         }

         for(var11 = var5; var11 < 0; ++var11) {
            var12 = var1[var3++];
            if(var12 != 0) {
               var0[var4++] = var2[var12 & 255];
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   // $FF: renamed from: r () void
   public void method_737() {
      if(this.field_498 != this.field_497 || this.field_492 != this.field_494) {
         byte[] var1 = new byte[this.field_497 * this.field_494];
         int var2 = 0;

         for(int var3 = 0; var3 < this.field_492; ++var3) {
            for(int var4 = 0; var4 < this.field_498; ++var4) {
               var1[var4 + this.field_495 + (var3 + this.field_496) * this.field_497] = this.field_493[var2++];
            }
         }

         this.field_493 = var1;
         this.field_498 = this.field_497;
         this.field_492 = this.field_494;
         this.field_495 = 0;
         this.field_496 = 0;
      }
   }

   // $FF: renamed from: v () void
   public void method_738() {
      if(this.field_498 != this.field_497 || this.field_492 != this.field_494) {
         byte[] var1 = new byte[this.field_497 * this.field_494];
         int var2 = 0;

         for(int var3 = 0; var3 < this.field_492; ++var3) {
            for(int var4 = 0; var4 < this.field_498; ++var4) {
               var1[var4 + this.field_495 + (var3 + this.field_496) * this.field_497] = this.field_493[var2++];
            }
         }

         this.field_493 = var1;
         this.field_498 = this.field_497;
         this.field_492 = this.field_494;
         this.field_495 = 0;
         this.field_496 = 0;
      }
   }

   // $FF: renamed from: x (int[], byte[], int[], int, int, int, int, int, int, int, int, int) void
   static void method_739(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      int var12 = var3;

      for(int var13 = -var8; var13 < 0; ++var13) {
         int var14 = (var4 >> 16) * var11;

         for(int var15 = -var7; var15 < 0; ++var15) {
            byte var16 = var1[(var3 >> 16) + var14];
            if(var16 != 0) {
               var0[var5++] = var2[var16 & 613461147];
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

   // $FF: renamed from: b (int, int, int) void
   public void method_740(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field_491.length; ++var4) {
         int var5 = this.field_491[var4] >> 16 & 1095856994;
         var5 += var1;
         if(var5 < 0) {
            var5 = 0;
         } else if(var5 > -1947008655) {
            var5 = 566269820;
         }

         int var6 = this.field_491[var4] >> 8 & -114156280;
         var6 += var2;
         if(var6 < 0) {
            var6 = 0;
         } else if(var6 > 255) {
            var6 = -1312536611;
         }

         int var7 = this.field_491[var4] & 2074340256;
         var7 += var3;
         if(var7 < 0) {
            var7 = 0;
         } else if(var7 > 255) {
            var7 = -1659202546;
         }

         this.field_491[var4] = (var5 << 16) + (var6 << 8) + var7;
      }

   }

   // $FF: renamed from: d (int, int, int) void
   public void method_741(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field_491.length; ++var4) {
         int var5 = this.field_491[var4] >> 16 & 6692107;
         var5 += var1;
         if(var5 < 0) {
            var5 = 0;
         } else if(var5 > 255) {
            var5 = -2018108035;
         }

         int var6 = this.field_491[var4] >> 8 & 1265724345;
         var6 += var2;
         if(var6 < 0) {
            var6 = 0;
         } else if(var6 > 255) {
            var6 = 130778816;
         }

         int var7 = this.field_491[var4] & 1872005425;
         var7 += var3;
         if(var7 < 0) {
            var7 = 0;
         } else if(var7 > 1910140944) {
            var7 = 255;
         }

         this.field_491[var4] = (var5 << 16) + (var6 << 8) + var7;
      }

   }

   // $FF: renamed from: <init> () void
   class_66() {
      super();
   }

   // $FF: renamed from: u (int, int) void
   public void method_742(int var1, int var2) {
      var1 += this.field_495;
      var2 += this.field_496;
      int var3 = var1 + var2 * field_484;
      int var4 = 0;
      int var5 = this.field_492;
      int var6 = this.field_498;
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
         method_736(field_490, this.field_493, this.field_491, var4, var3, var6, var5, var7, var8);
      }
   }

   // $FF: renamed from: l (int, int) void
   public void method_743(int var1, int var2) {
      var1 += this.field_495;
      var2 += this.field_496;
      int var3 = var1 + var2 * field_484;
      int var4 = 0;
      int var5 = this.field_492;
      int var6 = this.field_498;
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
         method_736(field_490, this.field_493, this.field_491, var4, var3, var6, var5, var7, var8);
      }
   }

   // $FF: renamed from: s (int, int) void
   public void method_744(int var1, int var2) {
      var1 += this.field_495;
      var2 += this.field_496;
      int var3 = var1 + var2 * field_484;
      int var4 = 0;
      int var5 = this.field_492;
      int var6 = this.field_498;
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
         method_736(field_490, this.field_493, this.field_491, var4, var3, var6, var5, var7, var8);
      }
   }

   // $FF: renamed from: m (int[], byte[], int[], int, int, int, int, int, int, int, int, int) void
   static void method_745(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      int var12 = var3;

      for(int var13 = -var8; var13 < 0; ++var13) {
         int var14 = (var4 >> 16) * var11;

         for(int var15 = -var7; var15 < 0; ++var15) {
            byte var16 = var1[(var3 >> 16) + var14];
            if(var16 != 0) {
               var0[var5++] = var2[var16 & 255];
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

   // $FF: renamed from: e (int[], byte[], int[], int, int, int, int, int, int) void
   static void method_746(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = -(var5 >> 2);
      var5 = -(var5 & 3);

      for(int var10 = -var6; var10 < 0; ++var10) {
         int var11;
         byte var12;
         for(var11 = var9; var11 < 0; ++var11) {
            var12 = var1[var3++];
            if(var12 != 0) {
               var0[var4++] = var2[var12 & -1612369021];
            } else {
               ++var4;
            }

            var12 = var1[var3++];
            if(var12 != 0) {
               var0[var4++] = var2[var12 & 255];
            } else {
               ++var4;
            }

            var12 = var1[var3++];
            if(var12 != 0) {
               var0[var4++] = var2[var12 & -531403246];
            } else {
               ++var4;
            }

            var12 = var1[var3++];
            if(var12 != 0) {
               var0[var4++] = var2[var12 & 255];
            } else {
               ++var4;
            }
         }

         for(var11 = var5; var11 < 0; ++var11) {
            var12 = var1[var3++];
            if(var12 != 0) {
               var0[var4++] = var2[var12 & 57545977];
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   // $FF: renamed from: g (int[], byte[], int[], int, int, int, int, int, int) void
   static void method_747(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = -(var5 >> 2);
      var5 = -(var5 & 3);

      for(int var10 = -var6; var10 < 0; ++var10) {
         int var11;
         byte var12;
         for(var11 = var9; var11 < 0; ++var11) {
            var12 = var1[var3++];
            if(var12 != 0) {
               var0[var4++] = var2[var12 & 255];
            } else {
               ++var4;
            }

            var12 = var1[var3++];
            if(var12 != 0) {
               var0[var4++] = var2[var12 & 255];
            } else {
               ++var4;
            }

            var12 = var1[var3++];
            if(var12 != 0) {
               var0[var4++] = var2[var12 & 255];
            } else {
               ++var4;
            }

            var12 = var1[var3++];
            if(var12 != 0) {
               var0[var4++] = var2[var12 & -1894205106];
            } else {
               ++var4;
            }
         }

         for(var11 = var5; var11 < 0; ++var11) {
            var12 = var1[var3++];
            if(var12 != 0) {
               var0[var4++] = var2[var12 & 255];
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   // $FF: renamed from: a (int, int, int, int) void
   public void method_748(int var1, int var2, int var3, int var4) {
      int var5 = this.field_498;
      int var6 = this.field_492;
      int var7 = 0;
      int var8 = 0;
      int var9 = this.field_497;
      int var10 = this.field_494;
      int var11 = (var9 << 16) / var3;
      int var12 = (var10 << 16) / var4;
      int var13;
      if(this.field_495 > 0) {
         var13 = ((this.field_495 << 16) + var11 - 1) / var11;
         var1 += var13;
         var7 += var13 * var11 - (this.field_495 << 16);
      }

      if(this.field_496 > 0) {
         var13 = ((this.field_496 << 16) + var12 - 1) / var12;
         var2 += var13;
         var8 += var13 * var12 - (this.field_496 << 16);
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

      method_749(field_490, this.field_493, this.field_491, var7, var8, var13, var14, var3, var4, var11, var12, var5);
   }

   // $FF: renamed from: j (int[], byte[], int[], int, int, int, int, int, int, int, int, int) void
   static void method_749(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      int var12 = var3;

      for(int var13 = -var8; var13 < 0; ++var13) {
         int var14 = (var4 >> 16) * var11;

         for(int var15 = -var7; var15 < 0; ++var15) {
            byte var16 = var1[(var3 >> 16) + var14];
            if(var16 != 0) {
               var0[var5++] = var2[var16 & 255];
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

   // $FF: renamed from: k (int, int, int, int) void
   public void method_750(int var1, int var2, int var3, int var4) {
      int var5 = this.field_498;
      int var6 = this.field_492;
      int var7 = 0;
      int var8 = 0;
      int var9 = this.field_497;
      int var10 = this.field_494;
      int var11 = (var9 << 16) / var3;
      int var12 = (var10 << 16) / var4;
      int var13;
      if(this.field_495 > 0) {
         var13 = ((this.field_495 << 16) + var11 - 1) / var11;
         var1 += var13;
         var7 += var13 * var11 - (this.field_495 << 16);
      }

      if(this.field_496 > 0) {
         var13 = ((this.field_496 << 16) + var12 - 1) / var12;
         var2 += var13;
         var8 += var13 * var12 - (this.field_496 << 16);
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

      method_749(field_490, this.field_493, this.field_491, var7, var8, var13, var14, var3, var4, var11, var12, var5);
   }

   // $FF: renamed from: p (int, int, int, int) void
   public void method_751(int var1, int var2, int var3, int var4) {
      int var5 = this.field_498;
      int var6 = this.field_492;
      int var7 = 0;
      int var8 = 0;
      int var9 = this.field_497;
      int var10 = this.field_494;
      int var11 = (var9 << 16) / var3;
      int var12 = (var10 << 16) / var4;
      int var13;
      if(this.field_495 > 0) {
         var13 = ((this.field_495 << 16) + var11 - 1) / var11;
         var1 += var13;
         var7 += var13 * var11 - (this.field_495 << 16);
      }

      if(this.field_496 > 0) {
         var13 = ((this.field_496 << 16) + var12 - 1) / var12;
         var2 += var13;
         var8 += var13 * var12 - (this.field_496 << 16);
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

      method_749(field_490, this.field_493, this.field_491, var7, var8, var13, var14, var3, var4, var11, var12, var5);
   }

   // $FF: renamed from: z (int[], byte[], int[], int, int, int, int, int, int, int, int, int) void
   static void method_752(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      int var12 = var3;

      for(int var13 = -var8; var13 < 0; ++var13) {
         int var14 = (var4 >> 16) * var11;

         for(int var15 = -var7; var15 < 0; ++var15) {
            byte var16 = var1[(var3 >> 16) + var14];
            if(var16 != 0) {
               var0[var5++] = var2[var16 & 255];
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
}
