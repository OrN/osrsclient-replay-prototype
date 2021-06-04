import java.awt.Component;

// $FF: renamed from: ca
public class class_162 {

   // $FF: renamed from: u int[]
   int[] field_2006;
    // $FF: renamed from: r int[]
   int[] field_2010;
   // $FF: renamed from: b int
   int field_2011;
   // $FF: renamed from: d int[]
   int[] field_2012;
   // $FF: renamed from: s int[]
   int[] field_2013;
   // $FF: renamed from: k int[]
   int[] field_2014;
   // $FF: renamed from: c int
   int field_2015;
   // $FF: renamed from: v op[]
   class_66[] field_2016;
   // $FF: renamed from: l int[]
   int[] field_2017;
   // $FF: renamed from: e int[]
   int[] field_2018;
   // $FF: renamed from: g int[]
   int[] field_2019;
   // $FF: renamed from: o int
   int field_2020;
   // $FF: renamed from: a int[]
   int[] field_2021;
   // $FF: renamed from: m int
   int field_2022;
   // $FF: renamed from: x int
   int field_2023;
   // $FF: renamed from: z int
   int field_2024;


    // $FF: renamed from: r (int, int[], int) void
   final void method_3381(int var1, int[] var2, int var3) {
      try {
         int var4 = this.field_2012.length;

         for(int var5 = 0; var5 < var4; ++var5) {
            if(var1 > 768) {
               if(var3 <= -54898163) {
                  throw new IllegalStateException();
               }

               this.field_2012[var5] = this.method_3385(this.field_2013[var5], var2[var5], 1024 - var1);
            } else if(var1 > 256) {
               if(var3 <= -54898163) {
                  throw new IllegalStateException();
               }

               this.field_2012[var5] = var2[var5];
            } else {
               this.field_2012[var5] = this.method_3385(var2[var5], this.field_2013[var5], 256 - var1);
            }
         }

      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6);
      }
   }

   // $FF: renamed from: n (short) void
   void method_3382() {
      try {
         this.field_2013 = null;
         this.field_2006 = null;
         this.field_2017 = null;
         this.field_2012 = null;
         this.field_2021 = null;
         this.field_2014 = null;
         this.field_2018 = null;
         this.field_2019 = null;
         this.field_2022 = 0;
         this.field_2023 = 0;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

    // $FF: renamed from: y (int, short) void
   final void method_3384(int var1, short var2) {
      try {
         this.field_2022 += -731534976 * var1;
         int var3;
         if(348893403 * this.field_2022 > this.field_2021.length) {
            if(var2 <= 128) {
               throw new IllegalStateException();
            }

            this.field_2022 -= this.field_2021.length * 396938067;
            var3 = (int)(Math.random() * 12.0D);
            this.method_3413(this.field_2016[var3], (byte)4);
         }

         var3 = 0;
         int var4 = 128 * var1;
         int var5 = (256 - var1) * 128;

         int var7;
         for(int var6 = 0; var6 < var5; ++var6) {
            if(var2 <= 128) {
               throw new IllegalStateException();
            }

            var7 = this.field_2018[var3 + var4] - var1 * this.field_2021[this.field_2022 * 348893403 + var3 & this.field_2021.length - 1] / 6;
            if(var7 < 0) {
               if(var2 <= 128) {
                  throw new IllegalStateException();
               }

               var7 = 0;
            }

            this.field_2018[var3++] = var7;
         }

         byte var17 = 10;
         var7 = 128 - var17;

         int var8;
         int var11;
         for(var8 = 256 - var1; var8 < 256; ++var8) {
            int var9 = var8 * 128;

            for(int var10 = 0; var10 < 128; ++var10) {
               if(var2 <= 128) {
                  throw new IllegalStateException();
               }

               var11 = (int)(Math.random() * 100.0D);
               if(var11 < 50) {
                  if(var2 <= 128) {
                     throw new IllegalStateException();
                  }

                  if(var10 > var17 && var10 < var7) {
                     if(var2 <= 128) {
                        return;
                     }

                     this.field_2018[var9 + var10] = 255;
                     continue;
                  }
               }

               this.field_2018[var10 + var9] = 0;
            }
         }

         if(this.field_2020 * 1784020073 > 0) {
            if(var2 <= 128) {
               throw new IllegalStateException();
            }

            this.field_2020 -= 1958563684 * var1;
         }

         if(this.field_2015 * -962717377 > 0) {
            if(var2 <= 128) {
               throw new IllegalStateException();
            }

            this.field_2015 -= 1640061692 * var1;
         }

         if(0 == this.field_2020 * 1784020073) {
            if(var2 <= 128) {
               throw new IllegalStateException();
            }

            if(0 == this.field_2015 * -962717377) {
               var8 = (int)(Math.random() * (double)(2000 / var1));
               if(var8 == 0) {
                  this.field_2020 = -1118870528;
               }

               if(var8 == 1) {
                  this.field_2015 = -1051001856;
               }
            }
         }

         for(var8 = 0; var8 < 256 - var1; ++var8) {
            if(var2 <= 128) {
               throw new IllegalStateException();
            }

            this.field_2010[var8] = this.field_2010[var8 + var1];
         }

         for(var8 = 256 - var1; var8 < 256; ++var8) {
            if(var2 <= 128) {
               return;
            }

            this.field_2010[var8] = (int)(Math.sin((double)(1934818705 * this.field_2011) / 14.0D) * 16.0D + Math.sin((double)(this.field_2011 * 1934818705) / 15.0D) * 14.0D + Math.sin((double)(this.field_2011 * 1934818705) / 16.0D) * 12.0D);
            this.field_2011 += -1344314511;
         }

         this.field_2023 += -1124753851 * var1;
         var8 = (var1 + (-1702273423 * client.field_1425 & 1)) / 2;
         if(var8 > 0) {
            if(var2 <= 128) {
               return;
            }

            short var18 = 128;
            byte var19 = 2;
            var11 = 128 - var19 - var19;

            int var12;
            int var13;
            int var14;
            for(var12 = 0; var12 < this.field_2023 * -2077702380; ++var12) {
               if(var2 <= 128) {
                  return;
               }

               var13 = (int)(Math.random() * (double)var11) + var19;
               var14 = (int)(Math.random() * (double)var18) + var18;
               this.field_2018[(var14 << 7) + var13] = 192;
            }

            this.field_2023 = 0;

            int var15;
            for(var12 = 0; var12 < 256; ++var12) {
               if(var2 <= 128) {
                  throw new IllegalStateException();
               }

               var13 = 0;
               var14 = 128 * var12;

               for(var15 = -var8; var15 < 128; ++var15) {
                  if(var2 <= 128) {
                     throw new IllegalStateException();
                  }

                  if(var15 + var8 < 128) {
                     var13 += this.field_2018[var8 + var14 + var15];
                  }

                  if(var15 - (var8 + 1) >= 0) {
                     if(var2 <= 128) {
                        throw new IllegalStateException();
                     }

                     var13 -= this.field_2018[var14 + var15 - (1 + var8)];
                  }

                  if(var15 >= 0) {
                     if(var2 <= 128) {
                        throw new IllegalStateException();
                     }

                     this.field_2019[var14 + var15] = var13 / (1 + var8 * 2);
                  }
               }
            }

            for(var12 = 0; var12 < 128; ++var12) {
               if(var2 <= 128) {
                  throw new IllegalStateException();
               }

               var13 = 0;

               for(var14 = -var8; var14 < 256; ++var14) {
                  var15 = var14 * 128;
                  if(var8 + var14 < 256) {
                     if(var2 <= 128) {
                        return;
                     }

                     var13 += this.field_2019[128 * var8 + var15 + var12];
                  }

                  if(var14 - (1 + var8) >= 0) {
                     if(var2 <= 128) {
                        throw new IllegalStateException();
                     }

                     var13 -= this.field_2019[var12 + var15 - (1 + var8) * 128];
                  }

                  if(var14 >= 0) {
                     if(var2 <= 128) {
                        return;
                     }

                     this.field_2018[var15 + var12] = var13 / (2 * var8 + 1);
                  }
               }
            }
         }

      } catch (RuntimeException var16) {
         throw class_223.method_4281(var16);
      }
   }

   // $FF: renamed from: p (int, int, int, byte) int
   final int method_3385(int var1, int var2, int var3) {
      try {
         int var5 = 256 - var3;
         return (var5 * (var1 & 16711935) + (var2 & 16711935) * var3 & -16711936) + (var3 * (var2 & '\uff00') + (var1 & '\uff00') * var5 & 16711680) >> 8;
      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6);
      }
   }

   // $FF: renamed from: j (int, int) void
   final void method_3386(int var1, int var2) {
      try {
         int var3 = this.field_2012.length;
         if(this.field_2020 * 1784020073 > 0) {
            if(var2 <= 2055325169) {
               return;
            }

            this.method_3381(this.field_2020 * 1784020073, this.field_2006, 912923891);
         } else if(-962717377 * this.field_2015 > 0) {
            if(var2 <= 2055325169) {
               throw new IllegalStateException();
            }

            this.method_3381(this.field_2015 * -962717377, this.field_2017, 889214650);
         } else {
            for(int var4 = 0; var4 < var3; ++var4) {
               if(var2 <= 2055325169) {
                  throw new IllegalStateException();
               }

               this.field_2012[var4] = this.field_2013[var4];
            }
         }

         this.method_3388(var1, 366284227);
      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5);
      }
   }

    // $FF: renamed from: b (int, int) void
   final void method_3388(int var1, int var2) {
      try {
         int var3 = 0;

         for(int var4 = 1; var4 < 255; ++var4) {
            if(var2 == 1115122599) {
               return;
            }

            int var5 = (256 - var4) * this.field_2010[var4] / 256;
            int var6 = var1 + var5;
            int var7 = 0;
            int var8 = 128;
            if(var6 < 0) {
               if(var2 == 1115122599) {
                  throw new IllegalStateException();
               }

               var7 = -var6;
               var6 = 0;
            }

            if(128 + var6 >= class_126.field_1370.field_1816 * -740510445) {
               if(var2 == 1115122599) {
                  return;
               }

               var8 = -740510445 * class_126.field_1370.field_1816 - var6;
            }

            int var9 = (var4 + 8) * class_126.field_1370.field_1816 * -740510445 + var6;
            var3 += var7;

            for(int var10 = var7; var10 < var8; ++var10) {
               if(var2 == 1115122599) {
                  return;
               }

               int var11 = this.field_2018[var3++];
               int var12 = var9 % class_65.field_484;
               if(var11 != 0) {
                  if(var2 == 1115122599) {
                     throw new IllegalStateException();
                  }

                  if(var12 >= class_65.field_489) {
                     if(var2 == 1115122599) {
                        throw new IllegalStateException();
                     }

                     if(var12 < class_65.field_488) {
                        if(var2 == 1115122599) {
                           throw new IllegalStateException();
                        }

                        int var13 = var11;
                        int var14 = 256 - var11;
                        var11 = this.field_2012[var11];
                        int var15 = class_126.field_1370.field_1817[var9];
                        class_126.field_1370.field_1817[var9++] = -16777216 | (var13 * (var11 & '\uff00') + (var15 & '\uff00') * var14 & 16711680) + (var13 * (var11 & 16711935) + (var15 & 16711935) * var14 & -16711936) >> 8;
                        continue;
                     }
                  }
               }

               ++var9;
            }

            var3 += 128 - var8;
         }

      } catch (RuntimeException var16) {
         throw class_223.method_4281(var16);
      }
   }

    // $FF: renamed from: v (jv, int) void
   public static void method_3390(class_306 var0) {
      try {
         class_81.field_754 = var0;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

    // $FF: renamed from: v (byte) void
   void method_3397(byte var1) {
      try {
         this.field_2013 = new int[256];

         int var2;
         for(var2 = 0; var2 < 64; ++var2) {
            if(var1 <= 0) {
               throw new IllegalStateException();
            }

            this.field_2013[var2] = 262144 * var2;
         }

         for(var2 = 0; var2 < 64; ++var2) {
            if(var1 <= 0) {
               throw new IllegalStateException();
            }

            this.field_2013[var2 + 64] = 16711680 + var2 * 1024;
         }

         for(var2 = 0; var2 < 64; ++var2) {
            if(var1 <= 0) {
               throw new IllegalStateException();
            }

            this.field_2013[var2 + 128] = 4 * var2 + 16776960;
         }

         for(var2 = 0; var2 < 64; ++var2) {
            if(var1 <= 0) {
               throw new IllegalStateException();
            }

            this.field_2013[var2 + 192] = 16777215;
         }

         this.field_2006 = new int[256];

         for(var2 = 0; var2 < 64; ++var2) {
            if(var1 <= 0) {
               throw new IllegalStateException();
            }

            this.field_2006[var2] = 1024 * var2;
         }

         for(var2 = 0; var2 < 64; ++var2) {
            this.field_2006[var2 + 64] = var2 * 4 + '\uff00';
         }

         for(var2 = 0; var2 < 64; ++var2) {
            if(var1 <= 0) {
               throw new IllegalStateException();
            }

            this.field_2006[128 + var2] = 262144 * var2 + '\uffff';
         }

         for(var2 = 0; var2 < 64; ++var2) {
            if(var1 <= 0) {
               throw new IllegalStateException();
            }

            this.field_2006[var2 + 192] = 16777215;
         }

         this.field_2017 = new int[256];

         for(var2 = 0; var2 < 64; ++var2) {
            this.field_2017[var2] = 4 * var2;
         }

         for(var2 = 0; var2 < 64; ++var2) {
            if(var1 <= 0) {
               throw new IllegalStateException();
            }

            this.field_2017[var2 + 64] = 255 + var2 * 262144;
         }

         for(var2 = 0; var2 < 64; ++var2) {
            this.field_2017[128 + var2] = 1024 * var2 + 16711935;
         }

         for(var2 = 0; var2 < 64; ++var2) {
            if(var1 <= 0) {
               throw new IllegalStateException();
            }

            this.field_2017[var2 + 192] = 16777215;
         }

         this.field_2012 = new int[256];
         this.field_2022 = 0;
         this.field_2021 = new int['\u8000'];
         this.field_2014 = new int['\u8000'];
         this.method_3413((class_66)null, (byte)-54);
         this.field_2018 = new int['\u8000'];
         this.field_2019 = new int['\u8000'];
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

    // $FF: renamed from: n (jv, int, int, int, boolean, int) void
   public static void method_3399(class_306 var0, int var1, int var2, int var3, boolean var4) {
      try {
         class_270.field_3180 = 1262412465;
         class_271.field_3186 = var0;
         class_137.field_1760 = 416619779 * var1;
         class_119.field_1322 = 23452087 * var2;
         class_270.field_3181 = var3 * 2118204629;
         class_270.field_3179 = var4;
         class_270.field_3183 = -1289972048;
      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6);
      }
   }

    // $FF: renamed from: f (int, int, int) void
   void method_3401(int var1, int var2, int var3) {
      try {
         if(this.field_2018 == null) {
            if(var3 >= 35101152) {
               throw new IllegalStateException();
            }

            this.method_3397((byte)41);
         }

         if(0 == this.field_2024 * -453028953) {
            if(var3 >= 35101152) {
               return;
            }

            this.field_2024 = var2 * -1445714921;
         }

         int var4 = var2 - this.field_2024 * -453028953;
         if(var4 >= 256) {
            if(var3 >= 35101152) {
               throw new IllegalStateException();
            }

            var4 = 0;
         }

         this.field_2024 = -1445714921 * var2;
         if(var4 > 0) {
            if(var3 >= 35101152) {
               throw new IllegalStateException();
            }

            this.method_3384(var4, (short)12943);
         }

         this.method_3386(var1, 2071342179);
      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5);
      }
   }

   // $FF: renamed from: <init> (op[]) void
   class_162(class_66[] var1) {
      super();
      try {
         this.field_2010 = new int[256];
         this.field_2011 = 0;
         this.field_2020 = 0;
         this.field_2015 = 0;
         this.field_2022 = 0;
         this.field_2023 = 0;
         this.field_2024 = 0;
         this.field_2016 = var1;
         this.method_3397((byte)27);
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

    // $FF: renamed from: v (int, int) fl
   public static class_72 method_3412(int var0, int var1) {
      try {
         class_72 var2 = (class_72)class_72.field_577.method_5065((long)var0);
         if(var2 != null) {
            if(var1 >= 2050386517) {
               throw new IllegalStateException();
            } else {
               return var2;
            }
         } else {
            byte[] var3 = class_72.field_563.method_5381(12, var0);
            class_72 var10000 = new class_72();
            var2 = var10000;
            if(var3 != null) {
               if(var1 >= 2050386517) {
                  throw new IllegalStateException();
               }

               Buffer var10001 = new Buffer(var3);
               var2.method_1076(var10001, (byte)11);
            }

            var2.method_1051(-1519522081);
            class_72.field_577.method_5064(var2, (long)var0);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: d (op, byte) void
   final void method_3413(class_66 var1, byte var2) {
      try {
         int var3;
         for(var3 = 0; var3 < this.field_2021.length; ++var3) {
            if(var2 == 16) {
               throw new IllegalStateException();
            }

            this.field_2021[var3] = 0;
         }

         int var4;
         for(var3 = 0; var3 < 5000; ++var3) {
            if(var2 == 16) {
               throw new IllegalStateException();
            }

            var4 = (int)(Math.random() * 128.0D * 256.0D);
            this.field_2021[var4] = (int)(Math.random() * 256.0D);
         }

         int var5;
         int var6;
         for(var3 = 0; var3 < 20; ++var3) {
            if(var2 == 16) {
               throw new IllegalStateException();
            }

            for(var4 = 1; var4 < 255; ++var4) {
               if(var2 == 16) {
                  return;
               }

               for(var5 = 1; var5 < 127; ++var5) {
                  if(var2 == 16) {
                     return;
                  }

                  var6 = (var4 << 7) + var5;
                  this.field_2014[var6] = (this.field_2021[var6 + 1] + this.field_2021[var6 - 1] + this.field_2021[var6 - 128] + this.field_2021[128 + var6]) / 4;
               }
            }

            int[] var10 = this.field_2021;
            this.field_2021 = this.field_2014;
            this.field_2014 = var10;
         }

         if(var1 != null) {
            if(var2 == 16) {
               throw new IllegalStateException();
            }

            var3 = 0;

            for(var4 = 0; var4 < var1.field_492; ++var4) {
               if(var2 == 16) {
                  throw new IllegalStateException();
               }

               for(var5 = 0; var5 < var1.field_498; ++var5) {
                  if(var2 == 16) {
                     return;
                  }

                  if(var1.field_493[var3++] != 0) {
                     if(var2 == 16) {
                        return;
                     }

                     var6 = var1.field_495 + var5 + 16;
                     int var7 = var4 + 16 + var1.field_496;
                     int var8 = var6 + (var7 << 7);
                     this.field_2021[var8] = 0;
                  }
               }
            }
         }

      } catch (RuntimeException var9) {
         throw class_223.method_4281(var9);
      }
   }

    // $FF: renamed from: it (int, int, int, int, int) void
   static void method_3415(int var0, int var1, int var2, int var3, int var4) {
      try {
         class_37 var5 = class_325.method_5779(var0, var1, -456851860);
         if(null != var5) {
            if(var4 >= -2141166364) {
               throw new IllegalStateException();
            }

            if(null != var5.field_198) {
               class_45 var10000 = new class_45();
               class_45 var6 = var10000;
               var6.field_332 = var5;
               var6.field_337 = var5.field_198;
               class_203.method_4099(var6);
            }
         }

         client.field_1564 = -504803099 * var3;
         client.field_1572 = true;
         class_148.field_1875 = 611170069 * var0;
         client.field_1573 = 449656091 * var1;
         class_117.field_1305 = 451729829 * var2;
         class_254.method_4900(var5, (byte)97);
      } catch (RuntimeException var7) {
         throw class_223.method_4281(var7);
      }
   }

   // $FF: renamed from: f (int, int, int) int
   static int method_3416(int var0, int var1, int var2) {
      try {
         class_49 var3 = (class_49)class_49.field_361.method_6523((long)var0);
         if(null == var3) {
            if(var2 >= -1929251208) {
               throw new IllegalStateException();
            } else {
               return 0;
            }
         } else if(-1 == var1) {
            if(var2 >= -1929251208) {
               throw new IllegalStateException();
            } else {
               return 0;
            }
         } else {
            int var4 = 0;

            for(int var5 = 0; var5 < var3.field_362.length; ++var5) {
               if(var2 >= -1929251208) {
                  throw new IllegalStateException();
               }

               if(var1 == var3.field_360[var5]) {
                  if(var2 >= -1929251208) {
                     throw new IllegalStateException();
                  }

                  var4 += var3.field_362[var5];
               }
            }

            return var4;
         }
      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6);
      }
   }

   // $FF: renamed from: n (java.awt.Component, int) void
   static void initKeyboardListener(Component component) {
      try {
         component.setFocusTraversalKeysEnabled(false);
         component.addKeyListener(class_145.field_1846);
         component.addFocusListener(class_145.field_1846);
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }
}
