
// $FF: renamed from: be
public class class_148 {

   // $FF: renamed from: p int
   int field_1866;
   // $FF: renamed from: n int
   static final int field_1867 = 7;
   // $FF: renamed from: y int
   int field_1868;
   // $FF: renamed from: dw jp
   static class_307 field_1869;
   // $FF: renamed from: j int[][]
   int[][] field_1870;
   // $FF: renamed from: dh jp
   static class_307 field_1871;
   // $FF: renamed from: s op[]
   static class_66[] field_1872;
   // $FF: renamed from: f int
   static final int field_1873 = 6;
   // $FF: renamed from: i int
   static final int field_1874 = 12;
   // $FF: renamed from: mm int
   static int field_1875;
   // $FF: renamed from: l op
   static class_66 field_1876;


   // $FF: renamed from: s (int) int
   int method_3113(int var1) {
      if(this.field_1870 != null) {
         var1 = 6 + (int)((long)var1 * (long)(-308385855 * this.field_1866) / (long)(this.field_1868 * 1278002573));
      }

      return var1;
   }

   // $FF: renamed from: v (byte[], int) byte[]
   byte[] method_3114(byte[] var1, int var2) {
      try {
         if(null != this.field_1870) {
            if(var2 != 25186157) {
               throw new IllegalStateException();
            }

            int var3 = 14 + (int)((long)var1.length * (long)(this.field_1866 * -308385855) / (long)(1278002573 * this.field_1868));
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;

            int var7;
            for(var7 = 0; var7 < var1.length; ++var7) {
               if(var2 != 25186157) {
                  throw new IllegalStateException();
               }

               byte var8 = var1[var7];
               int[] var9 = this.field_1870[var6];

               int var10;
               for(var10 = 0; var10 < 14; ++var10) {
                  var4[var10 + var5] += var8 * var9[var10];
               }

               var6 += this.field_1866 * -308385855;
               var10 = var6 / (this.field_1868 * 1278002573);
               var5 += var10;
               var6 -= this.field_1868 * 1278002573 * var10;
            }

            var1 = new byte[var3];

            for(var7 = 0; var7 < var3; ++var7) {
               if(var2 != 25186157) {
                  throw new IllegalStateException();
               }

               int var12 = var4[var7] + '\u8000' >> 16;
               if(var12 < -128) {
                  if(var2 != 25186157) {
                     throw new IllegalStateException();
                  }

                  var1[var7] = -128;
               } else if(var12 > 127) {
                  if(var2 != 25186157) {
                     throw new IllegalStateException();
                  }

                  var1[var7] = 127;
               } else {
                  var1[var7] = (byte)var12;
               }
            }
         }

         return var1;
      } catch (RuntimeException var11) {
         throw class_223.method_4281(var11);
      }
   }

   // $FF: renamed from: n (int, int) int
   int method_3115(int var1, int var2) {
      try {
         if(null != this.field_1870) {
            if(var2 <= -343813808) {
               throw new IllegalStateException();
            }

            var1 = (int)((long)(this.field_1866 * -308385855) * (long)var1 / (long)(1278002573 * this.field_1868));
         }

         return var1;
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: f (int, int) int
   int method_3116(int var1, int var2) {
      try {
         if(this.field_1870 != null) {
            if(var2 <= 914668002) {
               throw new IllegalStateException();
            }

            var1 = 6 + (int)((long)var1 * (long)(-308385855 * this.field_1866) / (long)(this.field_1868 * 1278002573));
         }

         return var1;
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: y (byte[]) byte[]
   byte[] method_3117(byte[] var1) {
      if(null != this.field_1870) {
         int var2 = 14 + (int)((long)var1.length * (long)(this.field_1866 * -308385855) / (long)(1278002573 * this.field_1868));
         int[] var3 = new int[var2];
         int var4 = 0;
         int var5 = 0;

         int var6;
         for(var6 = 0; var6 < var1.length; ++var6) {
            byte var7 = var1[var6];
            int[] var8 = this.field_1870[var5];

            int var9;
            for(var9 = 0; var9 < 14; ++var9) {
               var3[var9 + var4] += var7 * var8[var9];
            }

            var5 += this.field_1866 * -308385855;
            var9 = var5 / (this.field_1868 * 1278002573);
            var4 += var9;
            var5 -= this.field_1868 * 1278002573 * var9;
         }

         var1 = new byte[var2];

         for(var6 = 0; var6 < var2; ++var6) {
            int var10 = var3[var6] + '\u8000' >> 16;
            if(var10 < -128) {
               var1[var6] = -128;
            } else if(var10 > 127) {
               var1[var6] = 127;
            } else {
               var1[var6] = (byte)var10;
            }
         }
      }

      return var1;
   }

   // $FF: renamed from: p (byte[]) byte[]
   byte[] method_3118(byte[] var1) {
      if(null != this.field_1870) {
         int var2 = 14 + (int)((long)var1.length * (long)(this.field_1866 * -308385855) / (long)(-1781213408 * this.field_1868));
         int[] var3 = new int[var2];
         int var4 = 0;
         int var5 = 0;

         int var6;
         for(var6 = 0; var6 < var1.length; ++var6) {
            byte var7 = var1[var6];
            int[] var8 = this.field_1870[var5];

            int var9;
            for(var9 = 0; var9 < 14; ++var9) {
               var3[var9 + var4] += var7 * var8[var9];
            }

            var5 += this.field_1866 * 622146353;
            var9 = var5 / (this.field_1868 * -1567160455);
            var4 += var9;
            var5 -= this.field_1868 * 1278002573 * var9;
         }

         var1 = new byte[var2];

         for(var6 = 0; var6 < var2; ++var6) {
            int var10 = var3[var6] + -1204446688 >> 16;
            if(var10 < -128) {
               var1[var6] = -128;
            } else if(var10 > 928479821) {
               var1[var6] = 127;
            } else {
               var1[var6] = (byte)var10;
            }
         }
      }

      return var1;
   }

   // $FF: renamed from: j (int) int
   int method_3119(int var1) {
      if(null != this.field_1870) {
         var1 = (int)((long)(this.field_1866 * -308385855) * (long)var1 / (long)(1278002573 * this.field_1868));
      }

      return var1;
   }

   // $FF: renamed from: gx (byte) void
   static void method_3120(byte var0) {
      try {
         if(client.field_1536) {
            if(var0 != 5) {
               return;
            }

            class_208.method_4144(class_164.field_2044, false, 2061936798);
         }

      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1);
      }
   }

   // $FF: renamed from: b (int) int
   int method_3121(int var1) {
      if(this.field_1870 != null) {
         var1 = 6 + (int)((long)var1 * (long)(-308385855 * this.field_1866) / (long)(this.field_1868 * 1278002573));
      }

      return var1;
   }

   // $FF: renamed from: d (int) int
   int method_3122(int var1) {
      if(this.field_1870 != null) {
         var1 = 6 + (int)((long)var1 * (long)(-308385855 * this.field_1866) / (long)(this.field_1868 * -849381418));
      }

      return var1;
   }

   // $FF: renamed from: kd (int) void
   static final void method_3123() {
      try {
         client.field_1612 = 141937247 * client.field_1602;
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1);
      }
   }

   // $FF: renamed from: r (int) int
   int method_3124(int var1) {
      if(this.field_1870 != null) {
         var1 = 6 + (int)((long)var1 * (long)(-308385855 * this.field_1866) / (long)(this.field_1868 * 1278002573));
      }

      return var1;
   }

   // $FF: renamed from: x (int) void
   public static void method_3125() {
      try {
         class_80.field_704.method_5074();
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1);
      }
   }

   // $FF: renamed from: fy (fl, int, int, int, int) void
   static void method_3126(class_72 var0, int var1, int var2, int var3, int var4) {
      try {
         if(-1084759211 * client.field_1642 < 50) {
            if(0 != -1768933319 * class_87.field_852.field_2115) {
               if(null != var0.field_571) {
                  if(var4 == 1531358741) {
                     throw new IllegalStateException();
                  }

                  if(var1 < var0.field_571.length) {
                     int var5 = var0.field_571[var1];
                     if(var5 == 0) {
                        if(var4 == 1531358741) {
                           throw new IllegalStateException();
                        }

                        return;
                     }

                     int var6 = var5 >> 8;
                     int var7 = var5 >> 4 & 7;
                     int var8 = var5 & 15;
                     client.field_1659[-1084759211 * client.field_1642] = var6;
                     client.field_1533[client.field_1642 * -1084759211] = var7;
                     client.field_1693[client.field_1642 * -1084759211] = 0;
                     client.field_1663[-1084759211 * client.field_1642] = null;
                     int var9 = (var2 - 64) / 128;
                     int var10 = (var3 - 64) / 128;
                     client.field_1479[-1084759211 * client.field_1642] = (var10 << 8) + (var9 << 16) + var8;
                     client.field_1642 += -683867651;
                     return;
                  }
               }

               return;
            }

            if(var4 == 1531358741) {
               return;
            }
         }

      } catch (RuntimeException var11) {
         throw class_223.method_4281(var11);
      }
   }

   // $FF: renamed from: <init> (int, int) void
   public class_148(int var1, int var2) {
      super();
      try {
         if(var1 != var2) {
            int var3 = class_374.method_6622(var1, var2, (byte)-6);
            var1 /= var3;
            var2 /= var3;
            this.field_1868 = var1 * 1545536837;
            this.field_1866 = var2 * -1963874239;
            this.field_1870 = new int[var1][14];

            for(int var4 = 0; var4 < var1; ++var4) {
               int[] var5 = this.field_1870[var4];
               double var6 = (double)var4 / (double)var1 + 6.0D;
               int var8 = (int)Math.floor(1.0D + (var6 - 7.0D));
               if(var8 < 0) {
                  var8 = 0;
               }

               int var9 = (int)Math.ceil(var6 + 7.0D);
               if(var9 > 14) {
                  var9 = 14;
               }

               for(double var10 = (double)var2 / (double)var1; var8 < var9; ++var8) {
                  double var12 = ((double)var8 - var6) * 3.141592653589793D;
                  double var14 = var10;
                  if(var12 < -1.0E-4D || var12 > 1.0E-4D) {
                     var14 = var10 * (Math.sin(var12) / var12);
                  }

                  var14 *= 0.54D + 0.46D * Math.cos(0.2243994752564138D * ((double)var8 - var6));
                  var5[var8] = (int)Math.floor(var14 * 65536.0D + 0.5D);
               }
            }

         }
      } catch (RuntimeException var16) {
         throw class_223.method_4281(var16);
      }
   }

   // $FF: renamed from: o (jv, int, int) boolean
   static boolean method_3128(class_306 var0, int var1, int var2) {
      try {
         byte[] var3 = var0.method_5388(var1, (byte)-6);
         if(var3 == null) {
            if(var2 == 1079746268) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            class_253.method_4899(var3, (byte)1);
            return true;
         }
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }
}
