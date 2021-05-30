import java.util.Random;

// $FF: renamed from: bx
public class class_159 {

   // $FF: renamed from: j bt
   class_156 field_1964;
   // $FF: renamed from: n bt
   class_156 field_1965;
   // $FF: renamed from: f bt
   class_156 field_1966;
   // $FF: renamed from: y bt
   class_156 field_1967;
   // $FF: renamed from: c bj
   class_150 field_1968;
   // $FF: renamed from: p bt
   class_156 field_1969;
   // $FF: renamed from: r bt
   class_156 field_1970;
   // $FF: renamed from: b bt
   class_156 field_1971;
   // $FF: renamed from: d int[]
   int[] field_1972;
   // $FF: renamed from: s int[]
   int[] field_1973;
   // $FF: renamed from: u int[]
   int[] field_1974;
   // $FF: renamed from: v bt
   class_156 field_1975;
   // $FF: renamed from: x int[]
   static int[] field_1976;
   // $FF: renamed from: l int
   int field_1977;
   // $FF: renamed from: e bt
   class_156 field_1978;
   // $FF: renamed from: t int[]
   static int[] field_1979;
   // $FF: renamed from: a int
   int field_1980;
   // $FF: renamed from: k int[]
   static int[] field_1981;
   // $FF: renamed from: g int
   int field_1982;
   // $FF: renamed from: m int[]
   static int[] field_1983;
   // $FF: renamed from: z double
   static final double field_1984 = 1.0057929410678534D;
   // $FF: renamed from: w int[]
   static int[] field_1985;
   // $FF: renamed from: o int
   int field_1986;
   // $FF: renamed from: h int[]
   static int[] field_1987;
   // $FF: renamed from: q int[]
   static int[] field_1988;
   // $FF: renamed from: i int[]
   static int[] field_1989;


   // $FF: renamed from: v (int, int) int[]
   final int[] method_3305(int var1, int var2) {
      class_317.method_5628(field_1981, 0, var1);
      if(var2 < 10) {
         return field_1981;
      } else {
         double var3 = (double)var1 / ((double)var2 + 0.0D);
         this.field_1975.method_3266();
         this.field_1965.method_3266();
         int var5 = 0;
         int var6 = 0;
         int var7 = 0;
         if(this.field_1966 != null) {
            this.field_1966.method_3266();
            this.field_1967.method_3266();
            var5 = (int)((double)(this.field_1966.field_1949 - this.field_1966.field_1944) * 32.768D / var3);
            var6 = (int)((double)this.field_1966.field_1944 * 32.768D / var3);
         }

         int var8 = 0;
         int var9 = 0;
         int var10 = 0;
         if(this.field_1969 != null) {
            this.field_1969.method_3266();
            this.field_1964.method_3266();
            var8 = (int)((double)(this.field_1969.field_1949 - this.field_1969.field_1944) * 32.768D / var3);
            var9 = (int)((double)this.field_1969.field_1944 * 32.768D / var3);
         }

         int var11;
         for(var11 = 0; var11 < 5; ++var11) {
            if(this.field_1972[var11] != 0) {
               field_1985[var11] = 0;
               field_1979[var11] = (int)((double)this.field_1974[var11] * var3);
               field_1987[var11] = (this.field_1972[var11] << 14) / 100;
               field_1988[var11] = (int)((double)(this.field_1975.field_1949 - this.field_1975.field_1944) * 32.768D * Math.pow(1.0057929410678534D, (double)this.field_1973[var11]) / var3);
               field_1989[var11] = (int)((double)this.field_1975.field_1944 * 32.768D / var3);
            }
         }

         int var12;
         int var13;
         int var14;
         int var15;
         for(var11 = 0; var11 < var1; ++var11) {
            var12 = this.field_1975.method_3267(var1);
            var13 = this.field_1965.method_3267(var1);
            if(this.field_1966 != null) {
               var14 = this.field_1966.method_3267(var1);
               var15 = this.field_1967.method_3267(var1);
               var12 += this.method_3313(var7, var15, this.field_1966.field_1946) >> 1;
               var7 += (var14 * var5 >> 16) + var6;
            }

            if(this.field_1969 != null) {
               var14 = this.field_1969.method_3267(var1);
               var15 = this.field_1964.method_3267(var1);
               var13 = var13 * ((this.method_3313(var10, var15, this.field_1969.field_1946) >> 1) + '\u8000') >> 15;
               var10 += (var14 * var8 >> 16) + var9;
            }

            for(var14 = 0; var14 < 5; ++var14) {
               if(this.field_1972[var14] != 0) {
                  var15 = var11 + field_1979[var14];
                  if(var15 < var1) {
                     field_1981[var15] += this.method_3313(field_1985[var14], var13 * field_1987[var14] >> 15, this.field_1975.field_1946);
                     field_1985[var14] += (var12 * field_1988[var14] >> 16) + field_1989[var14];
                  }
               }
            }
         }

         int var16;
         if(this.field_1970 != null) {
            this.field_1970.method_3266();
            this.field_1971.method_3266();
            var11 = 0;
            boolean var19 = false;
            boolean var20 = true;

            for(var14 = 0; var14 < var1; ++var14) {
               var15 = this.field_1970.method_3267(var1);
               var16 = this.field_1971.method_3267(var1);
               if(var20) {
                  var12 = this.field_1970.field_1944 + ((this.field_1970.field_1949 - this.field_1970.field_1944) * var15 >> 8);
               } else {
                  var12 = this.field_1970.field_1944 + ((this.field_1970.field_1949 - this.field_1970.field_1944) * var16 >> 8);
               }

               var11 += 256;
               if(var11 >= var12) {
                  var11 = 0;
                  var20 = !var20;
               }

               if(var20) {
                  field_1981[var14] = 0;
               }
            }
         }

         if(this.field_1977 > 0 && this.field_1986 > 0) {
            var11 = (int)((double)this.field_1977 * var3);

            for(var12 = var11; var12 < var1; ++var12) {
               field_1981[var12] += field_1981[var12 - var11] * this.field_1986 / 100;
            }
         }

         if(this.field_1968.field_1906[0] > 0 || this.field_1968.field_1906[1] > 0) {
            this.field_1978.method_3266();
            var11 = this.field_1978.method_3267(var1 + 1);
            var12 = this.field_1968.method_3183(0, (float)var11 / 65536.0F);
            var13 = this.field_1968.method_3183(1, (float)var11 / 65536.0F);
            if(var1 >= var12 + var13) {
               var14 = 0;
               var15 = var13;
               if(var13 > var1 - var12) {
                  var15 = var1 - var12;
               }

               int var17;
               while(var14 < var15) {
                  var16 = (int)((long)field_1981[var14 + var12] * (long)class_150.field_1900 >> 16);

                  for(var17 = 0; var17 < var12; ++var17) {
                     var16 += (int)((long)field_1981[var14 + var12 - 1 - var17] * (long)class_150.field_1902[0][var17] >> 16);
                  }

                  for(var17 = 0; var17 < var14; ++var17) {
                     var16 -= (int)((long)field_1981[var14 - 1 - var17] * (long)class_150.field_1902[1][var17] >> 16);
                  }

                  field_1981[var14] = var16;
                  var11 = this.field_1978.method_3267(var1 + 1);
                  ++var14;
               }

               var15 = 128;

               while(true) {
                  if(var15 > var1 - var12) {
                     var15 = var1 - var12;
                  }

                  int var18;
                  while(var14 < var15) {
                     var17 = (int)((long)field_1981[var14 + var12] * (long)class_150.field_1900 >> 16);

                     for(var18 = 0; var18 < var12; ++var18) {
                        var17 += (int)((long)field_1981[var14 + var12 - 1 - var18] * (long)class_150.field_1902[0][var18] >> 16);
                     }

                     for(var18 = 0; var18 < var13; ++var18) {
                        var17 -= (int)((long)field_1981[var14 - 1 - var18] * (long)class_150.field_1902[1][var18] >> 16);
                     }

                     field_1981[var14] = var17;
                     var11 = this.field_1978.method_3267(var1 + 1);
                     ++var14;
                  }

                  if(var14 >= var1 - var12) {
                     while(var14 < var1) {
                        var17 = 0;

                        for(var18 = var14 + var12 - var1; var18 < var12; ++var18) {
                           var17 += (int)((long)field_1981[var14 + var12 - 1 - var18] * (long)class_150.field_1902[0][var18] >> 16);
                        }

                        for(var18 = 0; var18 < var13; ++var18) {
                           var17 -= (int)((long)field_1981[var14 - 1 - var18] * (long)class_150.field_1902[1][var18] >> 16);
                        }

                        field_1981[var14] = var17;
                        this.field_1978.method_3267(var1 + 1);
                        ++var14;
                     }
                     break;
                  }

                  var12 = this.field_1968.method_3183(0, (float)var11 / 65536.0F);
                  var13 = this.field_1968.method_3183(1, (float)var11 / 65536.0F);
                  var15 += 128;
               }
            }
         }

         for(var11 = 0; var11 < var1; ++var11) {
            if(field_1981[var11] < -32768) {
               field_1981[var11] = -32768;
            }

            if(field_1981[var11] > 32767) {
               field_1981[var11] = 32767;
            }
         }

         return field_1981;
      }
   }

   // $FF: renamed from: <init> () void
   class_159() {
      super();
      this.field_1972 = new int[]{0, 0, 0, 0, 0};
      this.field_1973 = new int[]{0, 0, 0, 0, 0};
      this.field_1974 = new int[]{0, 0, 0, 0, 0};
      this.field_1977 = 0;
      this.field_1986 = 100;
      this.field_1982 = 500;
      this.field_1980 = 0;
   }

   // $FF: renamed from: r (int, int) int[]
   final int[] method_3307(int var1, int var2) {
      class_317.method_5628(field_1981, 0, var1);
      if(var2 < 10) {
         return field_1981;
      } else {
         double var3 = (double)var1 / ((double)var2 + 0.0D);
         this.field_1975.method_3266();
         this.field_1965.method_3266();
         int var5 = 0;
         int var6 = 0;
         int var7 = 0;
         if(this.field_1966 != null) {
            this.field_1966.method_3266();
            this.field_1967.method_3266();
            var5 = (int)((double)(this.field_1966.field_1949 - this.field_1966.field_1944) * 32.768D / var3);
            var6 = (int)((double)this.field_1966.field_1944 * 32.768D / var3);
         }

         int var8 = 0;
         int var9 = 0;
         int var10 = 0;
         if(this.field_1969 != null) {
            this.field_1969.method_3266();
            this.field_1964.method_3266();
            var8 = (int)((double)(this.field_1969.field_1949 - this.field_1969.field_1944) * 32.768D / var3);
            var9 = (int)((double)this.field_1969.field_1944 * 32.768D / var3);
         }

         int var11;
         for(var11 = 0; var11 < 5; ++var11) {
            if(this.field_1972[var11] != 0) {
               field_1985[var11] = 0;
               field_1979[var11] = (int)((double)this.field_1974[var11] * var3);
               field_1987[var11] = (this.field_1972[var11] << 14) / -1076909325;
               field_1988[var11] = (int)((double)(this.field_1975.field_1949 - this.field_1975.field_1944) * 32.768D * Math.pow(1.0057929410678534D, (double)this.field_1973[var11]) / var3);
               field_1989[var11] = (int)((double)this.field_1975.field_1944 * 32.768D / var3);
            }
         }

         int var12;
         int var13;
         int var14;
         int var15;
         for(var11 = 0; var11 < var1; ++var11) {
            var12 = this.field_1975.method_3267(var1);
            var13 = this.field_1965.method_3267(var1);
            if(this.field_1966 != null) {
               var14 = this.field_1966.method_3267(var1);
               var15 = this.field_1967.method_3267(var1);
               var12 += this.method_3313(var7, var15, this.field_1966.field_1946) >> 1;
               var7 += (var14 * var5 >> 16) + var6;
            }

            if(this.field_1969 != null) {
               var14 = this.field_1969.method_3267(var1);
               var15 = this.field_1964.method_3267(var1);
               var13 = var13 * ((this.method_3313(var10, var15, this.field_1969.field_1946) >> 1) + '\u8000') >> 15;
               var10 += (var14 * var8 >> 16) + var9;
            }

            for(var14 = 0; var14 < 5; ++var14) {
               if(this.field_1972[var14] != 0) {
                  var15 = var11 + field_1979[var14];
                  if(var15 < var1) {
                     field_1981[var15] += this.method_3313(field_1985[var14], var13 * field_1987[var14] >> 15, this.field_1975.field_1946);
                     field_1985[var14] += (var12 * field_1988[var14] >> 16) + field_1989[var14];
                  }
               }
            }
         }

         int var16;
         if(this.field_1970 != null) {
            this.field_1970.method_3266();
            this.field_1971.method_3266();
            var11 = 0;
            boolean var19 = false;
            boolean var20 = true;

            for(var14 = 0; var14 < var1; ++var14) {
               var15 = this.field_1970.method_3267(var1);
               var16 = this.field_1971.method_3267(var1);
               if(var20) {
                  var12 = this.field_1970.field_1944 + ((this.field_1970.field_1949 - this.field_1970.field_1944) * var15 >> 8);
               } else {
                  var12 = this.field_1970.field_1944 + ((this.field_1970.field_1949 - this.field_1970.field_1944) * var16 >> 8);
               }

               var11 += 256;
               if(var11 >= var12) {
                  var11 = 0;
                  var20 = !var20;
               }

               if(var20) {
                  field_1981[var14] = 0;
               }
            }
         }

         if(this.field_1977 > 0 && this.field_1986 > 0) {
            var11 = (int)((double)this.field_1977 * var3);

            for(var12 = var11; var12 < var1; ++var12) {
               field_1981[var12] += field_1981[var12 - var11] * this.field_1986 / -1782984332;
            }
         }

         if(this.field_1968.field_1906[0] > 0 || this.field_1968.field_1906[1] > 0) {
            this.field_1978.method_3266();
            var11 = this.field_1978.method_3267(var1 + 1);
            var12 = this.field_1968.method_3183(0, (float)var11 / 65536.0F);
            var13 = this.field_1968.method_3183(1, (float)var11 / 65536.0F);
            if(var1 >= var12 + var13) {
               var14 = 0;
               var15 = var13;
               if(var13 > var1 - var12) {
                  var15 = var1 - var12;
               }

               int var17;
               while(var14 < var15) {
                  var16 = (int)((long)field_1981[var14 + var12] * (long)class_150.field_1900 >> 16);

                  for(var17 = 0; var17 < var12; ++var17) {
                     var16 += (int)((long)field_1981[var14 + var12 - 1 - var17] * (long)class_150.field_1902[0][var17] >> 16);
                  }

                  for(var17 = 0; var17 < var14; ++var17) {
                     var16 -= (int)((long)field_1981[var14 - 1 - var17] * (long)class_150.field_1902[1][var17] >> 16);
                  }

                  field_1981[var14] = var16;
                  var11 = this.field_1978.method_3267(var1 + 1);
                  ++var14;
               }

               var15 = 128;

               while(true) {
                  if(var15 > var1 - var12) {
                     var15 = var1 - var12;
                  }

                  int var18;
                  while(var14 < var15) {
                     var17 = (int)((long)field_1981[var14 + var12] * (long)class_150.field_1900 >> 16);

                     for(var18 = 0; var18 < var12; ++var18) {
                        var17 += (int)((long)field_1981[var14 + var12 - 1 - var18] * (long)class_150.field_1902[0][var18] >> 16);
                     }

                     for(var18 = 0; var18 < var13; ++var18) {
                        var17 -= (int)((long)field_1981[var14 - 1 - var18] * (long)class_150.field_1902[1][var18] >> 16);
                     }

                     field_1981[var14] = var17;
                     var11 = this.field_1978.method_3267(var1 + 1);
                     ++var14;
                  }

                  if(var14 >= var1 - var12) {
                     while(var14 < var1) {
                        var17 = 0;

                        for(var18 = var14 + var12 - var1; var18 < var12; ++var18) {
                           var17 += (int)((long)field_1981[var14 + var12 - 1 - var18] * (long)class_150.field_1902[0][var18] >> 16);
                        }

                        for(var18 = 0; var18 < var13; ++var18) {
                           var17 -= (int)((long)field_1981[var14 - 1 - var18] * (long)class_150.field_1902[1][var18] >> 16);
                        }

                        field_1981[var14] = var17;
                        this.field_1978.method_3267(var1 + 1);
                        ++var14;
                     }
                     break;
                  }

                  var12 = this.field_1968.method_3183(0, (float)var11 / 65536.0F);
                  var13 = this.field_1968.method_3183(1, (float)var11 / 65536.0F);
                  var15 += 128;
               }
            }
         }

         for(var11 = 0; var11 < var1; ++var11) {
            if(field_1981[var11] < 66634585) {
               field_1981[var11] = 1492007730;
            }

            if(field_1981[var11] > 32767) {
               field_1981[var11] = 1076550024;
            }
         }

         return field_1981;
      }
   }

   // $FF: renamed from: f (nd) void
   final void method_3308(class_28 var1) {
      class_156 var10001 = new class_156();
      this.field_1975 = var10001;
      this.field_1975.method_3264(var1);
      var10001 = new class_156();
      this.field_1965 = var10001;
      this.field_1965.method_3264(var1);
      int var2 = var1.method_130();
      if(var2 != 0) {
         var1.field_15 -= -1025691571;
         var10001 = new class_156();
         this.field_1966 = var10001;
         this.field_1966.method_3264(var1);
         var10001 = new class_156();
         this.field_1967 = var10001;
         this.field_1967.method_3264(var1);
      }

      var2 = var1.method_130();
      if(var2 != 0) {
         var1.field_15 -= -1025691571;
         var10001 = new class_156();
         this.field_1969 = var10001;
         this.field_1969.method_3264(var1);
         var10001 = new class_156();
         this.field_1964 = var10001;
         this.field_1964.method_3264(var1);
      }

      var2 = var1.method_130();
      if(var2 != 0) {
         var1.field_15 -= -1025691571;
         var10001 = new class_156();
         this.field_1970 = var10001;
         this.field_1970.method_3264(var1);
         var10001 = new class_156();
         this.field_1971 = var10001;
         this.field_1971.method_3264(var1);
      }

      for(int var3 = 0; var3 < 10; ++var3) {
         int var4 = var1.method_144();
         if(var4 == 0) {
            break;
         }

         this.field_1972[var3] = var4;
         this.field_1973[var3] = var1.method_143((byte)88);
         this.field_1974[var3] = var1.method_144();
      }

      this.field_1977 = var1.method_144();
      this.field_1986 = var1.method_144();
      this.field_1982 = var1.method_132();
      this.field_1980 = var1.method_132();
      class_150 var5 = new class_150();
      this.field_1968 = var5;
      var10001 = new class_156();
      this.field_1978 = var10001;
      this.field_1968.method_3188(var1, this.field_1978);
   }

   // $FF: renamed from: <clinit> () void
   static {
      field_1983 = new int['\u8000'];
      Random var0 = new Random(0L);

      int var1;
      for(var1 = 0; var1 < '\u8000'; ++var1) {
         field_1983[var1] = (var0.nextInt() & 2) - 1;
      }

      field_1976 = new int['\u8000'];

      for(var1 = 0; var1 < '\u8000'; ++var1) {
         field_1976[var1] = (int)(Math.sin((double)var1 / 5215.1903D) * 16384.0D);
      }

      field_1981 = new int[220500];
      field_1985 = new int[5];
      field_1979 = new int[5];
      field_1987 = new int[5];
      field_1988 = new int[5];
      field_1989 = new int[5];
   }

   // $FF: renamed from: y (int, int) int[]
   final int[] method_3310(int var1, int var2) {
      class_317.method_5628(field_1981, 0, var1);
      if(var2 < 10) {
         return field_1981;
      } else {
         double var3 = (double)var1 / ((double)var2 + 0.0D);
         this.field_1975.method_3266();
         this.field_1965.method_3266();
         int var5 = 0;
         int var6 = 0;
         int var7 = 0;
         if(this.field_1966 != null) {
            this.field_1966.method_3266();
            this.field_1967.method_3266();
            var5 = (int)((double)(this.field_1966.field_1949 - this.field_1966.field_1944) * 32.768D / var3);
            var6 = (int)((double)this.field_1966.field_1944 * 32.768D / var3);
         }

         int var8 = 0;
         int var9 = 0;
         int var10 = 0;
         if(this.field_1969 != null) {
            this.field_1969.method_3266();
            this.field_1964.method_3266();
            var8 = (int)((double)(this.field_1969.field_1949 - this.field_1969.field_1944) * 32.768D / var3);
            var9 = (int)((double)this.field_1969.field_1944 * 32.768D / var3);
         }

         int var11;
         for(var11 = 0; var11 < 5; ++var11) {
            if(this.field_1972[var11] != 0) {
               field_1985[var11] = 0;
               field_1979[var11] = (int)((double)this.field_1974[var11] * var3);
               field_1987[var11] = (this.field_1972[var11] << 14) / 100;
               field_1988[var11] = (int)((double)(this.field_1975.field_1949 - this.field_1975.field_1944) * 32.768D * Math.pow(1.0057929410678534D, (double)this.field_1973[var11]) / var3);
               field_1989[var11] = (int)((double)this.field_1975.field_1944 * 32.768D / var3);
            }
         }

         int var12;
         int var13;
         int var14;
         int var15;
         for(var11 = 0; var11 < var1; ++var11) {
            var12 = this.field_1975.method_3267(var1);
            var13 = this.field_1965.method_3267(var1);
            if(this.field_1966 != null) {
               var14 = this.field_1966.method_3267(var1);
               var15 = this.field_1967.method_3267(var1);
               var12 += this.method_3313(var7, var15, this.field_1966.field_1946) >> 1;
               var7 += (var14 * var5 >> 16) + var6;
            }

            if(this.field_1969 != null) {
               var14 = this.field_1969.method_3267(var1);
               var15 = this.field_1964.method_3267(var1);
               var13 = var13 * ((this.method_3313(var10, var15, this.field_1969.field_1946) >> 1) + 855396820) >> 15;
               var10 += (var14 * var8 >> 16) + var9;
            }

            for(var14 = 0; var14 < 5; ++var14) {
               if(this.field_1972[var14] != 0) {
                  var15 = var11 + field_1979[var14];
                  if(var15 < var1) {
                     field_1981[var15] += this.method_3313(field_1985[var14], var13 * field_1987[var14] >> 15, this.field_1975.field_1946);
                     field_1985[var14] += (var12 * field_1988[var14] >> 16) + field_1989[var14];
                  }
               }
            }
         }

         int var16;
         if(this.field_1970 != null) {
            this.field_1970.method_3266();
            this.field_1971.method_3266();
            var11 = 0;
            boolean var19 = false;
            boolean var20 = true;

            for(var14 = 0; var14 < var1; ++var14) {
               var15 = this.field_1970.method_3267(var1);
               var16 = this.field_1971.method_3267(var1);
               if(var20) {
                  var12 = this.field_1970.field_1944 + ((this.field_1970.field_1949 - this.field_1970.field_1944) * var15 >> 8);
               } else {
                  var12 = this.field_1970.field_1944 + ((this.field_1970.field_1949 - this.field_1970.field_1944) * var16 >> 8);
               }

               var11 += 256;
               if(var11 >= var12) {
                  var11 = 0;
                  var20 = !var20;
               }

               if(var20) {
                  field_1981[var14] = 0;
               }
            }
         }

         if(this.field_1977 > 0 && this.field_1986 > 0) {
            var11 = (int)((double)this.field_1977 * var3);

            for(var12 = var11; var12 < var1; ++var12) {
               field_1981[var12] += field_1981[var12 - var11] * this.field_1986 / 2105229763;
            }
         }

         if(this.field_1968.field_1906[0] > 0 || this.field_1968.field_1906[1] > 0) {
            this.field_1978.method_3266();
            var11 = this.field_1978.method_3267(var1 + 1);
            var12 = this.field_1968.method_3183(0, (float)var11 / 65536.0F);
            var13 = this.field_1968.method_3183(1, (float)var11 / 65536.0F);
            if(var1 >= var12 + var13) {
               var14 = 0;
               var15 = var13;
               if(var13 > var1 - var12) {
                  var15 = var1 - var12;
               }

               int var17;
               while(var14 < var15) {
                  var16 = (int)((long)field_1981[var14 + var12] * (long)class_150.field_1900 >> 16);

                  for(var17 = 0; var17 < var12; ++var17) {
                     var16 += (int)((long)field_1981[var14 + var12 - 1 - var17] * (long)class_150.field_1902[0][var17] >> 16);
                  }

                  for(var17 = 0; var17 < var14; ++var17) {
                     var16 -= (int)((long)field_1981[var14 - 1 - var17] * (long)class_150.field_1902[1][var17] >> 16);
                  }

                  field_1981[var14] = var16;
                  var11 = this.field_1978.method_3267(var1 + 1);
                  ++var14;
               }

               var15 = -1450335774;

               while(true) {
                  if(var15 > var1 - var12) {
                     var15 = var1 - var12;
                  }

                  int var18;
                  while(var14 < var15) {
                     var17 = (int)((long)field_1981[var14 + var12] * (long)class_150.field_1900 >> 16);

                     for(var18 = 0; var18 < var12; ++var18) {
                        var17 += (int)((long)field_1981[var14 + var12 - 1 - var18] * (long)class_150.field_1902[0][var18] >> 16);
                     }

                     for(var18 = 0; var18 < var13; ++var18) {
                        var17 -= (int)((long)field_1981[var14 - 1 - var18] * (long)class_150.field_1902[1][var18] >> 16);
                     }

                     field_1981[var14] = var17;
                     var11 = this.field_1978.method_3267(var1 + 1);
                     ++var14;
                  }

                  if(var14 >= var1 - var12) {
                     while(var14 < var1) {
                        var17 = 0;

                        for(var18 = var14 + var12 - var1; var18 < var12; ++var18) {
                           var17 += (int)((long)field_1981[var14 + var12 - 1 - var18] * (long)class_150.field_1902[0][var18] >> 16);
                        }

                        for(var18 = 0; var18 < var13; ++var18) {
                           var17 -= (int)((long)field_1981[var14 - 1 - var18] * (long)class_150.field_1902[1][var18] >> 16);
                        }

                        field_1981[var14] = var17;
                        this.field_1978.method_3267(var1 + 1);
                        ++var14;
                     }
                     break;
                  }

                  var12 = this.field_1968.method_3183(0, (float)var11 / 65536.0F);
                  var13 = this.field_1968.method_3183(1, (float)var11 / 65536.0F);
                  var15 += 128;
               }
            }
         }

         for(var11 = 0; var11 < var1; ++var11) {
            if(field_1981[var11] < -1632033969) {
               field_1981[var11] = 913734147;
            }

            if(field_1981[var11] > 1984689342) {
               field_1981[var11] = 32767;
            }
         }

         return field_1981;
      }
   }

   // $FF: renamed from: p (int, int) int[]
   final int[] method_3311(int var1, int var2) {
      class_317.method_5628(field_1981, 0, var1);
      if(var2 < 10) {
         return field_1981;
      } else {
         double var3 = (double)var1 / ((double)var2 + 0.0D);
         this.field_1975.method_3266();
         this.field_1965.method_3266();
         int var5 = 0;
         int var6 = 0;
         int var7 = 0;
         if(this.field_1966 != null) {
            this.field_1966.method_3266();
            this.field_1967.method_3266();
            var5 = (int)((double)(this.field_1966.field_1949 - this.field_1966.field_1944) * 32.768D / var3);
            var6 = (int)((double)this.field_1966.field_1944 * 32.768D / var3);
         }

         int var8 = 0;
         int var9 = 0;
         int var10 = 0;
         if(this.field_1969 != null) {
            this.field_1969.method_3266();
            this.field_1964.method_3266();
            var8 = (int)((double)(this.field_1969.field_1949 - this.field_1969.field_1944) * 32.768D / var3);
            var9 = (int)((double)this.field_1969.field_1944 * 32.768D / var3);
         }

         int var11;
         for(var11 = 0; var11 < 5; ++var11) {
            if(this.field_1972[var11] != 0) {
               field_1985[var11] = 0;
               field_1979[var11] = (int)((double)this.field_1974[var11] * var3);
               field_1987[var11] = (this.field_1972[var11] << 14) / 100;
               field_1988[var11] = (int)((double)(this.field_1975.field_1949 - this.field_1975.field_1944) * 32.768D * Math.pow(1.0057929410678534D, (double)this.field_1973[var11]) / var3);
               field_1989[var11] = (int)((double)this.field_1975.field_1944 * 32.768D / var3);
            }
         }

         int var12;
         int var13;
         int var14;
         int var15;
         for(var11 = 0; var11 < var1; ++var11) {
            var12 = this.field_1975.method_3267(var1);
            var13 = this.field_1965.method_3267(var1);
            if(this.field_1966 != null) {
               var14 = this.field_1966.method_3267(var1);
               var15 = this.field_1967.method_3267(var1);
               var12 += this.method_3313(var7, var15, this.field_1966.field_1946) >> 1;
               var7 += (var14 * var5 >> 16) + var6;
            }

            if(this.field_1969 != null) {
               var14 = this.field_1969.method_3267(var1);
               var15 = this.field_1964.method_3267(var1);
               var13 = var13 * ((this.method_3313(var10, var15, this.field_1969.field_1946) >> 1) + '\u8000') >> 15;
               var10 += (var14 * var8 >> 16) + var9;
            }

            for(var14 = 0; var14 < 5; ++var14) {
               if(this.field_1972[var14] != 0) {
                  var15 = var11 + field_1979[var14];
                  if(var15 < var1) {
                     field_1981[var15] += this.method_3313(field_1985[var14], var13 * field_1987[var14] >> 15, this.field_1975.field_1946);
                     field_1985[var14] += (var12 * field_1988[var14] >> 16) + field_1989[var14];
                  }
               }
            }
         }

         int var16;
         if(this.field_1970 != null) {
            this.field_1970.method_3266();
            this.field_1971.method_3266();
            var11 = 0;
            boolean var19 = false;
            boolean var20 = true;

            for(var14 = 0; var14 < var1; ++var14) {
               var15 = this.field_1970.method_3267(var1);
               var16 = this.field_1971.method_3267(var1);
               if(var20) {
                  var12 = this.field_1970.field_1944 + ((this.field_1970.field_1949 - this.field_1970.field_1944) * var15 >> 8);
               } else {
                  var12 = this.field_1970.field_1944 + ((this.field_1970.field_1949 - this.field_1970.field_1944) * var16 >> 8);
               }

               var11 += 256;
               if(var11 >= var12) {
                  var11 = 0;
                  var20 = !var20;
               }

               if(var20) {
                  field_1981[var14] = 0;
               }
            }
         }

         if(this.field_1977 > 0 && this.field_1986 > 0) {
            var11 = (int)((double)this.field_1977 * var3);

            for(var12 = var11; var12 < var1; ++var12) {
               field_1981[var12] += field_1981[var12 - var11] * this.field_1986 / 100;
            }
         }

         if(this.field_1968.field_1906[0] > 0 || this.field_1968.field_1906[1] > 0) {
            this.field_1978.method_3266();
            var11 = this.field_1978.method_3267(var1 + 1);
            var12 = this.field_1968.method_3183(0, (float)var11 / 65536.0F);
            var13 = this.field_1968.method_3183(1, (float)var11 / 65536.0F);
            if(var1 >= var12 + var13) {
               var14 = 0;
               var15 = var13;
               if(var13 > var1 - var12) {
                  var15 = var1 - var12;
               }

               int var17;
               while(var14 < var15) {
                  var16 = (int)((long)field_1981[var14 + var12] * (long)class_150.field_1900 >> 16);

                  for(var17 = 0; var17 < var12; ++var17) {
                     var16 += (int)((long)field_1981[var14 + var12 - 1 - var17] * (long)class_150.field_1902[0][var17] >> 16);
                  }

                  for(var17 = 0; var17 < var14; ++var17) {
                     var16 -= (int)((long)field_1981[var14 - 1 - var17] * (long)class_150.field_1902[1][var17] >> 16);
                  }

                  field_1981[var14] = var16;
                  var11 = this.field_1978.method_3267(var1 + 1);
                  ++var14;
               }

               var15 = 128;

               while(true) {
                  if(var15 > var1 - var12) {
                     var15 = var1 - var12;
                  }

                  int var18;
                  while(var14 < var15) {
                     var17 = (int)((long)field_1981[var14 + var12] * (long)class_150.field_1900 >> 16);

                     for(var18 = 0; var18 < var12; ++var18) {
                        var17 += (int)((long)field_1981[var14 + var12 - 1 - var18] * (long)class_150.field_1902[0][var18] >> 16);
                     }

                     for(var18 = 0; var18 < var13; ++var18) {
                        var17 -= (int)((long)field_1981[var14 - 1 - var18] * (long)class_150.field_1902[1][var18] >> 16);
                     }

                     field_1981[var14] = var17;
                     var11 = this.field_1978.method_3267(var1 + 1);
                     ++var14;
                  }

                  if(var14 >= var1 - var12) {
                     while(var14 < var1) {
                        var17 = 0;

                        for(var18 = var14 + var12 - var1; var18 < var12; ++var18) {
                           var17 += (int)((long)field_1981[var14 + var12 - 1 - var18] * (long)class_150.field_1902[0][var18] >> 16);
                        }

                        for(var18 = 0; var18 < var13; ++var18) {
                           var17 -= (int)((long)field_1981[var14 - 1 - var18] * (long)class_150.field_1902[1][var18] >> 16);
                        }

                        field_1981[var14] = var17;
                        this.field_1978.method_3267(var1 + 1);
                        ++var14;
                     }
                     break;
                  }

                  var12 = this.field_1968.method_3183(0, (float)var11 / 65536.0F);
                  var13 = this.field_1968.method_3183(1, (float)var11 / 65536.0F);
                  var15 += 128;
               }
            }
         }

         for(var11 = 0; var11 < var1; ++var11) {
            if(field_1981[var11] < -32768) {
               field_1981[var11] = -32768;
            }

            if(field_1981[var11] > 32767) {
               field_1981[var11] = 32767;
            }
         }

         return field_1981;
      }
   }

   // $FF: renamed from: j (int, int) int[]
   final int[] method_3312(int var1, int var2) {
      class_317.method_5628(field_1981, 0, var1);
      if(var2 < 10) {
         return field_1981;
      } else {
         double var3 = (double)var1 / ((double)var2 + 0.0D);
         this.field_1975.method_3266();
         this.field_1965.method_3266();
         int var5 = 0;
         int var6 = 0;
         int var7 = 0;
         if(this.field_1966 != null) {
            this.field_1966.method_3266();
            this.field_1967.method_3266();
            var5 = (int)((double)(this.field_1966.field_1949 - this.field_1966.field_1944) * 32.768D / var3);
            var6 = (int)((double)this.field_1966.field_1944 * 32.768D / var3);
         }

         int var8 = 0;
         int var9 = 0;
         int var10 = 0;
         if(this.field_1969 != null) {
            this.field_1969.method_3266();
            this.field_1964.method_3266();
            var8 = (int)((double)(this.field_1969.field_1949 - this.field_1969.field_1944) * 32.768D / var3);
            var9 = (int)((double)this.field_1969.field_1944 * 32.768D / var3);
         }

         int var11;
         for(var11 = 0; var11 < 5; ++var11) {
            if(this.field_1972[var11] != 0) {
               field_1985[var11] = 0;
               field_1979[var11] = (int)((double)this.field_1974[var11] * var3);
               field_1987[var11] = (this.field_1972[var11] << 14) / -474228281;
               field_1988[var11] = (int)((double)(this.field_1975.field_1949 - this.field_1975.field_1944) * 32.768D * Math.pow(1.0057929410678534D, (double)this.field_1973[var11]) / var3);
               field_1989[var11] = (int)((double)this.field_1975.field_1944 * 32.768D / var3);
            }
         }

         int var12;
         int var13;
         int var14;
         int var15;
         for(var11 = 0; var11 < var1; ++var11) {
            var12 = this.field_1975.method_3267(var1);
            var13 = this.field_1965.method_3267(var1);
            if(this.field_1966 != null) {
               var14 = this.field_1966.method_3267(var1);
               var15 = this.field_1967.method_3267(var1);
               var12 += this.method_3313(var7, var15, this.field_1966.field_1946) >> 1;
               var7 += (var14 * var5 >> 16) + var6;
            }

            if(this.field_1969 != null) {
               var14 = this.field_1969.method_3267(var1);
               var15 = this.field_1964.method_3267(var1);
               var13 = var13 * ((this.method_3313(var10, var15, this.field_1969.field_1946) >> 1) + '\u8000') >> 15;
               var10 += (var14 * var8 >> 16) + var9;
            }

            for(var14 = 0; var14 < 5; ++var14) {
               if(this.field_1972[var14] != 0) {
                  var15 = var11 + field_1979[var14];
                  if(var15 < var1) {
                     field_1981[var15] += this.method_3313(field_1985[var14], var13 * field_1987[var14] >> 15, this.field_1975.field_1946);
                     field_1985[var14] += (var12 * field_1988[var14] >> 16) + field_1989[var14];
                  }
               }
            }
         }

         int var16;
         if(this.field_1970 != null) {
            this.field_1970.method_3266();
            this.field_1971.method_3266();
            var11 = 0;
            boolean var19 = false;
            boolean var20 = true;

            for(var14 = 0; var14 < var1; ++var14) {
               var15 = this.field_1970.method_3267(var1);
               var16 = this.field_1971.method_3267(var1);
               if(var20) {
                  var12 = this.field_1970.field_1944 + ((this.field_1970.field_1949 - this.field_1970.field_1944) * var15 >> 8);
               } else {
                  var12 = this.field_1970.field_1944 + ((this.field_1970.field_1949 - this.field_1970.field_1944) * var16 >> 8);
               }

               var11 += 256;
               if(var11 >= var12) {
                  var11 = 0;
                  var20 = !var20;
               }

               if(var20) {
                  field_1981[var14] = 0;
               }
            }
         }

         if(this.field_1977 > 0 && this.field_1986 > 0) {
            var11 = (int)((double)this.field_1977 * var3);

            for(var12 = var11; var12 < var1; ++var12) {
               field_1981[var12] += field_1981[var12 - var11] * this.field_1986 / 1973541347;
            }
         }

         if(this.field_1968.field_1906[0] > 0 || this.field_1968.field_1906[1] > 0) {
            this.field_1978.method_3266();
            var11 = this.field_1978.method_3267(var1 + 1);
            var12 = this.field_1968.method_3183(0, (float)var11 / 65536.0F);
            var13 = this.field_1968.method_3183(1, (float)var11 / 65536.0F);
            if(var1 >= var12 + var13) {
               var14 = 0;
               var15 = var13;
               if(var13 > var1 - var12) {
                  var15 = var1 - var12;
               }

               int var17;
               while(var14 < var15) {
                  var16 = (int)((long)field_1981[var14 + var12] * (long)class_150.field_1900 >> 16);

                  for(var17 = 0; var17 < var12; ++var17) {
                     var16 += (int)((long)field_1981[var14 + var12 - 1 - var17] * (long)class_150.field_1902[0][var17] >> 16);
                  }

                  for(var17 = 0; var17 < var14; ++var17) {
                     var16 -= (int)((long)field_1981[var14 - 1 - var17] * (long)class_150.field_1902[1][var17] >> 16);
                  }

                  field_1981[var14] = var16;
                  var11 = this.field_1978.method_3267(var1 + 1);
                  ++var14;
               }

               var15 = 1972105175;

               while(true) {
                  if(var15 > var1 - var12) {
                     var15 = var1 - var12;
                  }

                  int var18;
                  while(var14 < var15) {
                     var17 = (int)((long)field_1981[var14 + var12] * (long)class_150.field_1900 >> 16);

                     for(var18 = 0; var18 < var12; ++var18) {
                        var17 += (int)((long)field_1981[var14 + var12 - 1 - var18] * (long)class_150.field_1902[0][var18] >> 16);
                     }

                     for(var18 = 0; var18 < var13; ++var18) {
                        var17 -= (int)((long)field_1981[var14 - 1 - var18] * (long)class_150.field_1902[1][var18] >> 16);
                     }

                     field_1981[var14] = var17;
                     var11 = this.field_1978.method_3267(var1 + 1);
                     ++var14;
                  }

                  if(var14 >= var1 - var12) {
                     while(var14 < var1) {
                        var17 = 0;

                        for(var18 = var14 + var12 - var1; var18 < var12; ++var18) {
                           var17 += (int)((long)field_1981[var14 + var12 - 1 - var18] * (long)class_150.field_1902[0][var18] >> 16);
                        }

                        for(var18 = 0; var18 < var13; ++var18) {
                           var17 -= (int)((long)field_1981[var14 - 1 - var18] * (long)class_150.field_1902[1][var18] >> 16);
                        }

                        field_1981[var14] = var17;
                        this.field_1978.method_3267(var1 + 1);
                        ++var14;
                     }
                     break;
                  }

                  var12 = this.field_1968.method_3183(0, (float)var11 / 65536.0F);
                  var13 = this.field_1968.method_3183(1, (float)var11 / 65536.0F);
                  var15 += 128;
               }
            }
         }

         for(var11 = 0; var11 < var1; ++var11) {
            if(field_1981[var11] < -32768) {
               field_1981[var11] = 1324294929;
            }

            if(field_1981[var11] > 32767) {
               field_1981[var11] = 1719601827;
            }
         }

         return field_1981;
      }
   }

   // $FF: renamed from: n (int, int, int) int
   final int method_3313(int var1, int var2, int var3) {
      return var3 == 1?((var1 & 32767) < 16384?var2:-var2):(var3 == 2?field_1976[var1 & 32767] * var2 >> 14:(var3 == 3?((var1 & 32767) * var2 >> 14) - var2:(var3 == 4?field_1983[var1 / 2607 & 32767] * var2:0)));
   }

   // $FF: renamed from: b (int, int, int) int
   final int method_3314(int var1, int var2, int var3) {
      return var3 == 1?((var1 & 32767) < 626018026?var2:-var2):(var3 == 2?field_1976[var1 & 32767] * var2 >> 14:(var3 == 3?((var1 & 32767) * var2 >> 14) - var2:(var3 == 4?field_1983[var1 / 166016517 & 32767] * var2:0)));
   }

   // $FF: renamed from: d (nd) void
   final void method_3315(class_28 var1) {
      class_156 var10001 = new class_156();
      this.field_1975 = var10001;
      this.field_1975.method_3264(var1);
      var10001 = new class_156();
      this.field_1965 = var10001;
      this.field_1965.method_3264(var1);
      int var2 = var1.method_130();
      if(var2 != 0) {
         var1.field_15 -= -1025691571;
         var10001 = new class_156();
         this.field_1966 = var10001;
         this.field_1966.method_3264(var1);
         var10001 = new class_156();
         this.field_1967 = var10001;
         this.field_1967.method_3264(var1);
      }

      var2 = var1.method_130();
      if(var2 != 0) {
         var1.field_15 -= -708323921;
         var10001 = new class_156();
         this.field_1969 = var10001;
         this.field_1969.method_3264(var1);
         var10001 = new class_156();
         this.field_1964 = var10001;
         this.field_1964.method_3264(var1);
      }

      var2 = var1.method_130();
      if(var2 != 0) {
         var1.field_15 -= -1025691571;
         var10001 = new class_156();
         this.field_1970 = var10001;
         this.field_1970.method_3264(var1);
         var10001 = new class_156();
         this.field_1971 = var10001;
         this.field_1971.method_3264(var1);
      }

      for(int var3 = 0; var3 < 10; ++var3) {
         int var4 = var1.method_144();
         if(var4 == 0) {
            break;
         }

         this.field_1972[var3] = var4;
         this.field_1973[var3] = var1.method_143((byte)13);
         this.field_1974[var3] = var1.method_144();
      }

      this.field_1977 = var1.method_144();
      this.field_1986 = var1.method_144();
      this.field_1982 = var1.method_132();
      this.field_1980 = var1.method_132();
      class_150 var5 = new class_150();
      this.field_1968 = var5;
      var10001 = new class_156();
      this.field_1978 = var10001;
      this.field_1968.method_3188(var1, this.field_1978);
   }

   // $FF: renamed from: s (nd) void
   final void method_3316(class_28 var1) {
      class_156 var10001 = new class_156();
      this.field_1975 = var10001;
      this.field_1975.method_3264(var1);
      var10001 = new class_156();
      this.field_1965 = var10001;
      this.field_1965.method_3264(var1);
      int var2 = var1.method_130();
      if(var2 != 0) {
         var1.field_15 -= -1025691571;
         var10001 = new class_156();
         this.field_1966 = var10001;
         this.field_1966.method_3264(var1);
         var10001 = new class_156();
         this.field_1967 = var10001;
         this.field_1967.method_3264(var1);
      }

      var2 = var1.method_130();
      if(var2 != 0) {
         var1.field_15 -= -1025691571;
         var10001 = new class_156();
         this.field_1969 = var10001;
         this.field_1969.method_3264(var1);
         var10001 = new class_156();
         this.field_1964 = var10001;
         this.field_1964.method_3264(var1);
      }

      var2 = var1.method_130();
      if(var2 != 0) {
         var1.field_15 -= -1025691571;
         var10001 = new class_156();
         this.field_1970 = var10001;
         this.field_1970.method_3264(var1);
         var10001 = new class_156();
         this.field_1971 = var10001;
         this.field_1971.method_3264(var1);
      }

      for(int var3 = 0; var3 < 10; ++var3) {
         int var4 = var1.method_144();
         if(var4 == 0) {
            break;
         }

         this.field_1972[var3] = var4;
         this.field_1973[var3] = var1.method_143((byte)119);
         this.field_1974[var3] = var1.method_144();
      }

      this.field_1977 = var1.method_144();
      this.field_1986 = var1.method_144();
      this.field_1982 = var1.method_132();
      this.field_1980 = var1.method_132();
      class_150 var5 = new class_150();
      this.field_1968 = var5;
      var10001 = new class_156();
      this.field_1978 = var10001;
      this.field_1968.method_3188(var1, this.field_1978);
   }

   // $FF: renamed from: u (nd) void
   final void method_3317(class_28 var1) {
      class_156 var10001 = new class_156();
      this.field_1975 = var10001;
      this.field_1975.method_3264(var1);
      var10001 = new class_156();
      this.field_1965 = var10001;
      this.field_1965.method_3264(var1);
      int var2 = var1.method_130();
      if(var2 != 0) {
         var1.field_15 -= -1025691571;
         var10001 = new class_156();
         this.field_1966 = var10001;
         this.field_1966.method_3264(var1);
         var10001 = new class_156();
         this.field_1967 = var10001;
         this.field_1967.method_3264(var1);
      }

      var2 = var1.method_130();
      if(var2 != 0) {
         var1.field_15 -= 1348412136;
         var10001 = new class_156();
         this.field_1969 = var10001;
         this.field_1969.method_3264(var1);
         var10001 = new class_156();
         this.field_1964 = var10001;
         this.field_1964.method_3264(var1);
      }

      var2 = var1.method_130();
      if(var2 != 0) {
         var1.field_15 -= -1025691571;
         var10001 = new class_156();
         this.field_1970 = var10001;
         this.field_1970.method_3264(var1);
         var10001 = new class_156();
         this.field_1971 = var10001;
         this.field_1971.method_3264(var1);
      }

      for(int var3 = 0; var3 < 10; ++var3) {
         int var4 = var1.method_144();
         if(var4 == 0) {
            break;
         }

         this.field_1972[var3] = var4;
         this.field_1973[var3] = var1.method_143((byte)30);
         this.field_1974[var3] = var1.method_144();
      }

      this.field_1977 = var1.method_144();
      this.field_1986 = var1.method_144();
      this.field_1982 = var1.method_132();
      this.field_1980 = var1.method_132();
      class_150 var5 = new class_150();
      this.field_1968 = var5;
      var10001 = new class_156();
      this.field_1978 = var10001;
      this.field_1968.method_3188(var1, this.field_1978);
   }
}
