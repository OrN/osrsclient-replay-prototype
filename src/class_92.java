
// $FF: renamed from: gr
public class class_92 extends class_91 {

   // $FF: renamed from: af int[]
   static int[] field_912;
   // $FF: renamed from: n byte[]
   static byte[] field_913;
   // $FF: renamed from: f gr
   static class_92 field_914;
   // $FF: renamed from: bx int[]
   static int[] field_915;
   // $FF: renamed from: p int
   int field_916;
   // $FF: renamed from: j int[]
   int[] field_917;
   // $FF: renamed from: r int[]
   int[] field_918;
   // $FF: renamed from: ar int
   int field_919;
   // $FF: renamed from: o int[]
   int[] field_920;
   // $FF: renamed from: s int[]
   int[] field_921;
   // $FF: renamed from: v gr
   static class_92 field_922;
   // $FF: renamed from: l int[]
   int[] field_923;
   // $FF: renamed from: bq int[]
   static int[] field_924;
   // $FF: renamed from: c int[]
   int[] field_925;
   // $FF: renamed from: e int[]
   int[] field_926;
   // $FF: renamed from: be int[]
   static int[] field_927;
   // $FF: renamed from: a byte[]
   byte[] field_928;
   // $FF: renamed from: k byte[]
   byte[] field_929;
   // $FF: renamed from: m short[]
   short[] field_930;
   // $FF: renamed from: x byte
   byte field_931;
   // $FF: renamed from: z int
   int field_932;
   // $FF: renamed from: w int[]
   int[] field_933;
   // $FF: renamed from: t int[]
   int[] field_934;
   // $FF: renamed from: aq int[]
   static int[] field_935;
   // $FF: renamed from: b int[]
   int[] field_936;
   // $FF: renamed from: i int[][]
   int[][] field_937;
   // $FF: renamed from: ae boolean
   public boolean field_938;
   // $FF: renamed from: ap int
   int field_939;
   // $FF: renamed from: as int
   int field_940;
   // $FF: renamed from: al int
   int field_941;
   // $FF: renamed from: ag int
   int field_942;
   // $FF: renamed from: ai int
   int field_943;
   // $FF: renamed from: ab int
   int field_944;
   // $FF: renamed from: av boolean[]
   static boolean[] field_945;
   // $FF: renamed from: bf int
   static final int field_946 = 20;
   // $FF: renamed from: aj int
   int field_947;
   // $FF: renamed from: g byte[]
   byte[] field_948;
   // $FF: renamed from: ah int[]
   static int[] field_949;
   // $FF: renamed from: az int
   static final int field_950 = 4700;
   // $FF: renamed from: am int
   int field_951;
   // $FF: renamed from: bm int
   static int field_952;
   // $FF: renamed from: at int[]
   static int[] field_953;
   // $FF: renamed from: ad int
   int field_954;
   // $FF: renamed from: ao int[]
   static int[] field_955;
   // $FF: renamed from: ay int[]
   static int[] field_956;
   // $FF: renamed from: aw int[]
   static int[] field_957;
   // $FF: renamed from: h int[]
   int[] field_958;
   // $FF: renamed from: ak int
   static final int field_959 = 1600;
   // $FF: renamed from: ax int
   int field_960;
   // $FF: renamed from: aa int[][]
   static int[][] field_961;
   // $FF: renamed from: au int[]
   static int[] field_962;
   // $FF: renamed from: an int[][]
   static int[][] field_963;
   // $FF: renamed from: bd int[]
   static int[] field_964;
   // $FF: renamed from: bt int[]
   static int[] field_965;
   // $FF: renamed from: u int[]
   int[] field_966;
   // $FF: renamed from: bu int[]
   static int[] field_967;
   // $FF: renamed from: ba int[]
   static int[] field_968;
   // $FF: renamed from: bv int[]
   static int[] field_969;
   // $FF: renamed from: d int
   int field_970;
   // $FF: renamed from: bz int
   static int field_971;
   // $FF: renamed from: bh int
   static int field_972;
   // $FF: renamed from: bs boolean
   static boolean field_973;
   // $FF: renamed from: br int
   static final int field_974 = 5;
   // $FF: renamed from: ac boolean[]
   static boolean[] field_975;
   // $FF: renamed from: y byte[]
   static byte[] field_976;
   // $FF: renamed from: q int[][]
   int[][] field_977;
   // $FF: renamed from: bj int[]
   static int[] field_978;
   // $FF: renamed from: bl int[]
   static int[] field_979;
   // $FF: renamed from: bp int
   static final int field_980 = 50;
   // $FF: renamed from: bn int
   static final int field_981 = 3500;


   // $FF: renamed from: bv () void
   public void method_1614() {
      for(int var1 = 0; var1 < this.field_916; ++var1) {
         int var2 = this.field_936[var1];
         this.field_936[var1] = this.field_917[var1];
         this.field_917[var1] = -var2;
      }

      this.method_1624();
   }

   // $FF: renamed from: <init> (gr[], int) void
   public class_92(class_92[] var1, int var2) {
      super();
      this.field_916 = 0;
      this.field_970 = 0;
      this.field_931 = 0;
      this.field_932 = 0;
      this.field_938 = false;
      this.field_940 = -1;
      this.field_947 = -1;
      this.field_951 = -1;
      boolean var3 = false;
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;
      this.field_916 = 0;
      this.field_970 = 0;
      this.field_932 = 0;
      this.field_931 = -1;

      int var7;
      class_92 var8;
      for(var7 = 0; var7 < var2; ++var7) {
         var8 = var1[var7];
         if(var8 != null) {
            this.field_916 += var8.field_916;
            this.field_970 += var8.field_970;
            this.field_932 += var8.field_932;
            if(var8.field_948 != null) {
               var3 = true;
            } else {
               if(this.field_931 == -1) {
                  this.field_931 = var8.field_931;
               }

               if(this.field_931 != var8.field_931) {
                  var3 = true;
               }
            }

            var4 |= var8.field_928 != null;
            var5 |= var8.field_930 != null;
            var6 |= var8.field_929 != null;
         }
      }

      this.field_917 = new int[this.field_916];
      this.field_918 = new int[this.field_916];
      this.field_936 = new int[this.field_916];
      this.field_921 = new int[this.field_970];
      this.field_966 = new int[this.field_970];
      this.field_923 = new int[this.field_970];
      this.field_920 = new int[this.field_970];
      this.field_925 = new int[this.field_970];
      this.field_926 = new int[this.field_970];
      if(var3) {
         this.field_948 = new byte[this.field_970];
      }

      if(var4) {
         this.field_928 = new byte[this.field_970];
      }

      if(var5) {
         this.field_930 = new short[this.field_970];
      }

      if(var6) {
         this.field_929 = new byte[this.field_970];
      }

      if(this.field_932 > 0) {
         this.field_933 = new int[this.field_932];
         this.field_934 = new int[this.field_932];
         this.field_958 = new int[this.field_932];
      }

      this.field_916 = 0;
      this.field_970 = 0;
      this.field_932 = 0;

      for(var7 = 0; var7 < var2; ++var7) {
         var8 = var1[var7];
         if(var8 != null) {
            int var9;
            for(var9 = 0; var9 < var8.field_970; ++var9) {
               this.field_921[this.field_970] = var8.field_921[var9] + this.field_916;
               this.field_966[this.field_970] = var8.field_966[var9] + this.field_916;
               this.field_923[this.field_970] = var8.field_923[var9] + this.field_916;
               this.field_920[this.field_970] = var8.field_920[var9];
               this.field_925[this.field_970] = var8.field_925[var9];
               this.field_926[this.field_970] = var8.field_926[var9];
               if(var3) {
                  if(var8.field_948 != null) {
                     this.field_948[this.field_970] = var8.field_948[var9];
                  } else {
                     this.field_948[this.field_970] = var8.field_931;
                  }
               }

               if(var4 && var8.field_928 != null) {
                  this.field_928[this.field_970] = var8.field_928[var9];
               }

               if(var5) {
                  if(var8.field_930 != null) {
                     this.field_930[this.field_970] = var8.field_930[var9];
                  } else {
                     this.field_930[this.field_970] = -1;
                  }
               }

               if(var6) {
                  if(var8.field_929 != null && var8.field_929[var9] != -1) {
                     this.field_929[this.field_970] = (byte)(var8.field_929[var9] + this.field_932);
                  } else {
                     this.field_929[this.field_970] = -1;
                  }
               }

               ++this.field_970;
            }

            for(var9 = 0; var9 < var8.field_932; ++var9) {
               this.field_933[this.field_932] = var8.field_933[var9] + this.field_916;
               this.field_934[this.field_932] = var8.field_934[var9] + this.field_916;
               this.field_958[this.field_932] = var8.field_958[var9] + this.field_916;
               ++this.field_932;
            }

            for(var9 = 0; var9 < var8.field_916; ++var9) {
               this.field_917[this.field_916] = var8.field_917[var9];
               this.field_918[this.field_916] = var8.field_918[var9];
               this.field_936[this.field_916] = var8.field_936[var9];
               ++this.field_916;
            }
         }
      }

   }

   // $FF: renamed from: v (int[][], int, int, int, boolean, int) gr
   public class_92 method_1616(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
      this.method_1621();
      int var7 = var2 - this.field_941;
      int var8 = var2 + this.field_941;
      int var9 = var4 - this.field_941;
      int var10 = var4 + this.field_941;
      if(var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) {
         var7 >>= 7;
         var8 = var8 + 127 >> 7;
         var9 >>= 7;
         var10 = var10 + 127 >> 7;
         if(var1[var7][var9] == var3 && var1[var8][var9] == var3 && var1[var7][var10] == var3 && var1[var8][var10] == var3) {
            return this;
         } else {
            class_92 var11;
            if(var5) {
               class_92 var10000 = new class_92();
               var11 = var10000;
               var11.field_916 = this.field_916;
               var11.field_970 = this.field_970;
               var11.field_932 = this.field_932;
               var11.field_917 = this.field_917;
               var11.field_936 = this.field_936;
               var11.field_921 = this.field_921;
               var11.field_966 = this.field_966;
               var11.field_923 = this.field_923;
               var11.field_920 = this.field_920;
               var11.field_925 = this.field_925;
               var11.field_926 = this.field_926;
               var11.field_948 = this.field_948;
               var11.field_928 = this.field_928;
               var11.field_929 = this.field_929;
               var11.field_930 = this.field_930;
               var11.field_931 = this.field_931;
               var11.field_933 = this.field_933;
               var11.field_934 = this.field_934;
               var11.field_958 = this.field_958;
               var11.field_977 = this.field_977;
               var11.field_937 = this.field_937;
               var11.field_938 = this.field_938;
               var11.field_918 = new int[var11.field_916];
            } else {
               var11 = this;
            }

            int var12;
            int var13;
            int var14;
            int var15;
            int var16;
            int var17;
            int var18;
            int var19;
            int var20;
            int var21;
            if(var6 == 0) {
               for(var12 = 0; var12 < var11.field_916; ++var12) {
                  var13 = this.field_917[var12] + var2;
                  var14 = this.field_936[var12] + var4;
                  var15 = var13 & 127;
                  var16 = var14 & 127;
                  var17 = var13 >> 7;
                  var18 = var14 >> 7;
                  var19 = var1[var17][var18] * (128 - var15) + var1[var17 + 1][var18] * var15 >> 7;
                  var20 = var1[var17][var18 + 1] * (128 - var15) + var1[var17 + 1][var18 + 1] * var15 >> 7;
                  var21 = var19 * (128 - var16) + var20 * var16 >> 7;
                  var11.field_918[var12] = this.field_918[var12] + var21 - var3;
               }
            } else {
               for(var12 = 0; var12 < var11.field_916; ++var12) {
                  var13 = (-this.field_918[var12] << 16) / (this.field_911 * 267422413);
                  if(var13 < var6) {
                     var14 = this.field_917[var12] + var2;
                     var15 = this.field_936[var12] + var4;
                     var16 = var14 & 127;
                     var17 = var15 & 127;
                     var18 = var14 >> 7;
                     var19 = var15 >> 7;
                     var20 = var1[var18][var19] * (128 - var16) + var1[var18 + 1][var19] * var16 >> 7;
                     var21 = var1[var18][var19 + 1] * (128 - var16) + var1[var18 + 1][var19 + 1] * var16 >> 7;
                     int var22 = var20 * (128 - var17) + var21 * var17 >> 7;
                     var11.field_918[var12] = this.field_918[var12] + (var22 - var3) * (var6 - var13) / var6;
                  }
               }
            }

            var11.method_1624();
            return var11;
         }
      } else {
         return this;
      }
   }

   // $FF: renamed from: f (boolean) gr
   public class_92 method_1617(boolean var1) {
      if(!var1 && field_913.length < this.field_970) {
         field_913 = new byte[this.field_970 + 100];
      }

      return this.method_1619(var1, field_922, field_913);
   }

   // $FF: renamed from: br (int, int, int) void
   public void method_1618(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field_916; ++var4) {
         this.field_917[var4] += var1;
         this.field_918[var4] += var2;
         this.field_936[var4] += var3;
      }

      this.method_1624();
   }

   // $FF: renamed from: b (boolean, gr, byte[]) gr
   class_92 method_1619(boolean var1, class_92 var2, byte[] var3) {
      var2.field_916 = this.field_916;
      var2.field_970 = this.field_970;
      var2.field_932 = this.field_932;
      if(var2.field_917 == null || var2.field_917.length < this.field_916) {
         var2.field_917 = new int[this.field_916 + 100];
         var2.field_918 = new int[this.field_916 + 100];
         var2.field_936 = new int[this.field_916 + 100];
      }

      int var4;
      for(var4 = 0; var4 < this.field_916; ++var4) {
         var2.field_917[var4] = this.field_917[var4];
         var2.field_918[var4] = this.field_918[var4];
         var2.field_936[var4] = this.field_936[var4];
      }

      if(var1) {
         var2.field_928 = this.field_928;
      } else {
         var2.field_928 = var3;
         if(this.field_928 == null) {
            for(var4 = 0; var4 < this.field_970; ++var4) {
               var2.field_928[var4] = 0;
            }
         } else {
            for(var4 = 0; var4 < this.field_970; ++var4) {
               var2.field_928[var4] = this.field_928[var4];
            }
         }
      }

      var2.field_921 = this.field_921;
      var2.field_966 = this.field_966;
      var2.field_923 = this.field_923;
      var2.field_920 = this.field_920;
      var2.field_925 = this.field_925;
      var2.field_926 = this.field_926;
      var2.field_948 = this.field_948;
      var2.field_929 = this.field_929;
      var2.field_930 = this.field_930;
      var2.field_931 = this.field_931;
      var2.field_933 = this.field_933;
      var2.field_934 = this.field_934;
      var2.field_958 = this.field_958;
      var2.field_977 = this.field_977;
      var2.field_937 = this.field_937;
      var2.field_938 = this.field_938;
      var2.method_1624();
      return var2;
   }

   // $FF: renamed from: bq () void
   public void method_1620() {
      for(int var1 = 0; var1 < this.field_916; ++var1) {
         this.field_917[var1] = -this.field_917[var1];
         this.field_936[var1] = -this.field_936[var1];
      }

      this.method_1624();
   }

   // $FF: renamed from: s () void
   public void method_1621() {
      if(this.field_939 != 1) {
         this.field_939 = 1;
         this.field_911 = 0;
         this.field_944 = 0;
         this.field_941 = 0;

         for(int var1 = 0; var1 < this.field_916; ++var1) {
            int var2 = this.field_917[var1];
            int var3 = this.field_918[var1];
            int var4 = this.field_936[var1];
            if(-var3 > this.field_911 * 267422413) {
               this.field_911 = -var3 * -126455291;
            }

            if(var3 > this.field_944) {
               this.field_944 = var3;
            }

            int var5 = var2 * var2 + var4 * var4;
            if(var5 > this.field_941) {
               this.field_941 = var5;
            }
         }

         this.field_941 = (int)(Math.sqrt((double)this.field_941) + 0.99D);
         this.field_943 = (int)(Math.sqrt((double)(this.field_941 * this.field_941 + this.field_911 * 267422413 * this.field_911 * 267422413)) + 0.99D);
         this.field_954 = this.field_943 + (int)(Math.sqrt((double)(this.field_941 * this.field_941 + this.field_944 * this.field_944)) + 0.99D);
      }
   }

   // $FF: renamed from: u () void
   void method_1622() {
      if(this.field_939 != 2) {
         this.field_939 = 2;
         this.field_941 = 0;

         for(int var1 = 0; var1 < this.field_916; ++var1) {
            int var2 = this.field_917[var1];
            int var3 = this.field_918[var1];
            int var4 = this.field_936[var1];
            int var5 = var2 * var2 + var4 * var4 + var3 * var3;
            if(var5 > this.field_941) {
               this.field_941 = var5;
            }
         }

         this.field_941 = (int)(Math.sqrt((double)this.field_941) + 0.99D);
         this.field_943 = this.field_941;
         this.field_954 = this.field_941 + this.field_941;
      }
   }

   // $FF: renamed from: aj (int) void
   void method_1623(int var1) {
      if(this.field_940 == -1) {
         int var2 = 0;
         int var3 = 0;
         int var4 = 0;
         int var5 = 0;
         int var6 = 0;
         int var7 = 0;
         int var8 = field_927[var1];
         int var9 = field_968[var1];

         for(int var10 = 0; var10 < this.field_916; ++var10) {
            int var11 = class_70.method_986(this.field_917[var10], this.field_936[var10], var8, var9);
            int var12 = this.field_918[var10];
            int var13 = class_70.method_987(this.field_917[var10], this.field_936[var10], var8, var9);
            if(var11 < var2) {
               var2 = var11;
            }

            if(var11 > var5) {
               var5 = var11;
            }

            if(var12 < var3) {
               var3 = var12;
            }

            if(var12 > var6) {
               var6 = var12;
            }

            if(var13 < var4) {
               var4 = var13;
            }

            if(var13 > var7) {
               var7 = var13;
            }
         }

         this.field_919 = (var5 + var2) / 2;
         this.field_942 = (var6 + var3) / 2;
         this.field_960 = (var7 + var4) / 2;
         this.field_940 = (var5 - var2 + 1) / 2;
         this.field_947 = (var6 - var3 + 1) / 2;
         this.field_951 = (var7 - var4 + 1) / 2;
         if(this.field_940 < -1793351276) {
            this.field_940 = 746273224;
         }

         if(this.field_951 < 32) {
            this.field_951 = 1931039075;
         }

         if(this.field_938) {
            this.field_940 += 8;
            this.field_951 += 8;
         }

      }
   }

   // $FF: renamed from: o () void
   void method_1624() {
      this.field_939 = 0;
      this.field_940 = -1;
   }

   // $FF: renamed from: c (gd, int) void
   public void method_1625(class_71 var1, int var2) {
      if(this.field_977 != null) {
         if(var2 != -1) {
            class_252 var3 = var1.field_562[var2];
            class_43 var4 = var3.field_2852;
            field_952 = 0;
            field_971 = 0;
            field_972 = 0;

            for(int var5 = 0; var5 < var3.field_2855; ++var5) {
               int var6 = var3.field_2853[var5];
               this.method_1648(var4.field_312[var6], var4.field_313[var6], var3.field_2856[var5], var3.field_2857[var5], var3.field_2858[var5]);
            }

            this.method_1624();
         }
      }
   }

   // $FF: renamed from: al (boolean) gr
   public class_92 method_1626(boolean var1) {
      if(!var1 && field_913.length < this.field_970) {
         field_913 = new byte[this.field_970 + 100];
      }

      return this.method_1619(var1, field_922, field_913);
   }

   // $FF: renamed from: y (boolean) gr
   public class_92 method_1627(boolean var1) {
      if(!var1 && field_976.length < this.field_970) {
         field_976 = new byte[this.field_970 + 100];
      }

      return this.method_1619(var1, field_914, field_976);
   }

   // $FF: renamed from: a () void
   public void method_1628() {
      for(int var1 = 0; var1 < this.field_916; ++var1) {
         int var2 = this.field_917[var1];
         this.field_917[var1] = this.field_936[var1];
         this.field_936[var1] = -var2;
      }

      this.method_1624();
   }

   // $FF: renamed from: bg (int) void
   final void method_1629(int var1) {
      int var2 = class_70.field_545;
      int var3 = class_70.field_538;
      int var4 = 0;
      int var5 = this.field_921[var1];
      int var6 = this.field_966[var1];
      int var7 = this.field_923[var1];
      int var8 = field_912[var5];
      int var9 = field_912[var6];
      int var10 = field_912[var7];
      if(this.field_928 == null) {
         class_70.field_554 = 0;
      } else {
         class_70.field_554 = this.field_928[var1] & 255;
      }

      int var11;
      int var12;
      int var13;
      int var14;
      if(var8 >= 50) {
         field_967[var4] = field_953[var5];
         field_979[var4] = field_949[var5];
         field_969[var4++] = this.field_920[var1];
      } else {
         var11 = field_935[var5];
         var12 = field_957[var5];
         var13 = this.field_920[var1];
         if(var10 >= -1593968521) {
            var14 = (50 - var8) * field_915[var10 - var8];
            field_967[var4] = var2 + (var11 + ((field_935[var7] - var11) * var14 >> 16)) * class_70.field_544 / 1141764282;
            field_979[var4] = var3 + (var12 + ((field_957[var7] - var12) * var14 >> 16)) * class_70.field_544 / 61485074;
            field_969[var4++] = var13 + ((this.field_926[var1] - var13) * var14 >> 16);
         }

         if(var9 >= 50) {
            var14 = (499919604 - var8) * field_915[var9 - var8];
            field_967[var4] = var2 + (var11 + ((field_935[var6] - var11) * var14 >> 16)) * class_70.field_544 / 50;
            field_979[var4] = var3 + (var12 + ((field_957[var6] - var12) * var14 >> 16)) * class_70.field_544 / 50;
            field_969[var4++] = var13 + ((this.field_925[var1] - var13) * var14 >> 16);
         }
      }

      if(var9 >= -2090134907) {
         field_967[var4] = field_953[var6];
         field_979[var4] = field_949[var6];
         field_969[var4++] = this.field_925[var1];
      } else {
         var11 = field_935[var6];
         var12 = field_957[var6];
         var13 = this.field_925[var1];
         if(var8 >= 50) {
            var14 = (-1286188710 - var9) * field_915[var8 - var9];
            field_967[var4] = var2 + (var11 + ((field_935[var5] - var11) * var14 >> 16)) * class_70.field_544 / 50;
            field_979[var4] = var3 + (var12 + ((field_957[var5] - var12) * var14 >> 16)) * class_70.field_544 / 1437971572;
            field_969[var4++] = var13 + ((this.field_920[var1] - var13) * var14 >> 16);
         }

         if(var10 >= -1841207708) {
            var14 = (50 - var9) * field_915[var10 - var9];
            field_967[var4] = var2 + (var11 + ((field_935[var7] - var11) * var14 >> 16)) * class_70.field_544 / 50;
            field_979[var4] = var3 + (var12 + ((field_957[var7] - var12) * var14 >> 16)) * class_70.field_544 / 50;
            field_969[var4++] = var13 + ((this.field_926[var1] - var13) * var14 >> 16);
         }
      }

      if(var10 >= 50) {
         field_967[var4] = field_953[var7];
         field_979[var4] = field_949[var7];
         field_969[var4++] = this.field_926[var1];
      } else {
         var11 = field_935[var7];
         var12 = field_957[var7];
         var13 = this.field_926[var1];
         if(var9 >= 1512199784) {
            var14 = (1024278328 - var10) * field_915[var9 - var10];
            field_967[var4] = var2 + (var11 + ((field_935[var6] - var11) * var14 >> 16)) * class_70.field_544 / 50;
            field_979[var4] = var3 + (var12 + ((field_957[var6] - var12) * var14 >> 16)) * class_70.field_544 / 50;
            field_969[var4++] = var13 + ((this.field_925[var1] - var13) * var14 >> 16);
         }

         if(var8 >= -1417724514) {
            var14 = (-794344371 - var10) * field_915[var8 - var10];
            field_967[var4] = var2 + (var11 + ((field_935[var5] - var11) * var14 >> 16)) * class_70.field_544 / -320351181;
            field_979[var4] = var3 + (var12 + ((field_957[var5] - var12) * var14 >> 16)) * class_70.field_544 / -570483527;
            field_969[var4++] = var13 + ((this.field_920[var1] - var13) * var14 >> 16);
         }
      }

      var11 = field_967[0];
      var12 = field_967[1];
      var13 = field_967[2];
      var14 = field_979[0];
      int var15 = field_979[1];
      int var16 = field_979[2];
      class_70.field_536 = false;
      int var17;
      int var18;
      int var19;
      int var20;
      if(var4 == 3) {
         if(var11 < 0 || var12 < 0 || var13 < 0 || var11 > class_70.field_537 || var12 > class_70.field_537 || var13 > class_70.field_537) {
            class_70.field_536 = true;
         }

         if(this.field_930 != null && this.field_930[var1] != -1) {
            if(this.field_929 != null && this.field_929[var1] != -1) {
               var20 = this.field_929[var1] & 255;
               var17 = this.field_933[var20];
               var18 = this.field_934[var20];
               var19 = this.field_958[var20];
            } else {
               var17 = var5;
               var18 = var6;
               var19 = var7;
            }

            if(this.field_926[var1] == -1) {
               class_70.method_1000(var14, var15, var16, var11, var12, var13, this.field_920[var1], this.field_920[var1], this.field_920[var1], field_935[var17], field_935[var18], field_935[var19], field_957[var17], field_957[var18], field_957[var19], field_912[var17], field_912[var18], field_912[var19], this.field_930[var1]);
            } else {
               class_70.method_1000(var14, var15, var16, var11, var12, var13, field_969[0], field_969[1], field_969[2], field_935[var17], field_935[var18], field_935[var19], field_957[var17], field_957[var18], field_957[var19], field_912[var17], field_912[var18], field_912[var19], this.field_930[var1]);
            }
         } else if(this.field_926[var1] == -1) {
            class_70.method_1042(var14, var15, var16, var11, var12, var13, field_978[this.field_920[var1]]);
         } else {
            class_70.method_977(var14, var15, var16, var11, var12, var13, field_969[0], field_969[1], field_969[2]);
         }
      }

      if(var4 == 4) {
         if(var11 < 0 || var12 < 0 || var13 < 0 || var11 > class_70.field_537 || var12 > class_70.field_537 || var13 > class_70.field_537 || field_967[3] < 0 || field_967[3] > class_70.field_537) {
            class_70.field_536 = true;
         }

         if(this.field_930 != null && this.field_930[var1] != -1) {
            if(this.field_929 != null && this.field_929[var1] != -1) {
               var20 = this.field_929[var1] & 1776529836;
               var17 = this.field_933[var20];
               var18 = this.field_934[var20];
               var19 = this.field_958[var20];
            } else {
               var17 = var5;
               var18 = var6;
               var19 = var7;
            }

            short var21 = this.field_930[var1];
            if(this.field_926[var1] == -1) {
               class_70.method_1000(var14, var15, var16, var11, var12, var13, this.field_920[var1], this.field_920[var1], this.field_920[var1], field_935[var17], field_935[var18], field_935[var19], field_957[var17], field_957[var18], field_957[var19], field_912[var17], field_912[var18], field_912[var19], var21);
               class_70.method_1000(var14, var16, field_979[3], var11, var13, field_967[3], this.field_920[var1], this.field_920[var1], this.field_920[var1], field_935[var17], field_935[var18], field_935[var19], field_957[var17], field_957[var18], field_957[var19], field_912[var17], field_912[var18], field_912[var19], var21);
            } else {
               class_70.method_1000(var14, var15, var16, var11, var12, var13, field_969[0], field_969[1], field_969[2], field_935[var17], field_935[var18], field_935[var19], field_957[var17], field_957[var18], field_957[var19], field_912[var17], field_912[var18], field_912[var19], var21);
               class_70.method_1000(var14, var16, field_979[3], var11, var13, field_967[3], field_969[0], field_969[2], field_969[3], field_935[var17], field_935[var18], field_935[var19], field_957[var17], field_957[var18], field_957[var19], field_912[var17], field_912[var18], field_912[var19], var21);
            }
         } else if(this.field_926[var1] == -1) {
            var17 = field_978[this.field_920[var1]];
            class_70.method_1042(var14, var15, var16, var11, var12, var13, var17);
            class_70.method_1042(var14, var16, field_979[3], var11, var13, field_967[3], var17);
         } else {
            class_70.method_977(var14, var15, var16, var11, var12, var13, field_969[0], field_969[1], field_969[2]);
            class_70.method_977(var14, var16, field_979[3], var11, var13, field_967[3], field_969[0], field_969[2], field_969[3]);
         }
      }

   }

   // $FF: renamed from: m () void
   public void method_1630() {
      for(int var1 = 0; var1 < this.field_916; ++var1) {
         int var2 = this.field_936[var1];
         this.field_936[var1] = this.field_917[var1];
         this.field_917[var1] = -var2;
      }

      this.method_1624();
   }

   // $FF: renamed from: x (int) void
   public void method_1631(int var1) {
      int var2 = field_968[var1];
      int var3 = field_927[var1];

      for(int var4 = 0; var4 < this.field_916; ++var4) {
         int var5 = this.field_918[var4] * var3 - this.field_936[var4] * var2 >> 16;
         this.field_936[var4] = this.field_918[var4] * var2 + this.field_936[var4] * var3 >> 16;
         this.field_918[var4] = var5;
      }

      this.method_1624();
   }

   // $FF: renamed from: z (int, int, int) void
   public void method_1632(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field_916; ++var4) {
         this.field_917[var4] += var1;
         this.field_918[var4] += var2;
         this.field_936[var4] += var3;
      }

      this.method_1624();
   }

   // $FF: renamed from: w (int, int, int) void
   public void method_1633(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field_916; ++var4) {
         this.field_917[var4] = this.field_917[var4] * var1 / 128;
         this.field_918[var4] = this.field_918[var4] * var2 / 128;
         this.field_936[var4] = this.field_936[var4] * var3 / 128;
      }

      this.method_1624();
   }

   // $FF: renamed from: ao () int
   public int method_1634() {
      this.method_1621();
      return this.field_941;
   }

   // $FF: renamed from: bb (int) void
   final void method_1635(int var1) {
      if(field_975[var1]) {
         this.method_1638(var1);
      } else {
         int var2 = this.field_921[var1];
         int var3 = this.field_966[var1];
         int var4 = this.field_923[var1];
         class_70.field_536 = field_945[var1];
         if(this.field_928 == null) {
            class_70.field_554 = 0;
         } else {
            class_70.field_554 = this.field_928[var1] & 255;
         }

         if(this.field_930 != null && this.field_930[var1] != -1) {
            int var5;
            int var6;
            int var7;
            if(this.field_929 != null && this.field_929[var1] != -1) {
               int var8 = this.field_929[var1] & 255;
               var5 = this.field_933[var8];
               var6 = this.field_934[var8];
               var7 = this.field_958[var8];
            } else {
               var5 = var2;
               var6 = var3;
               var7 = var4;
            }

            if(this.field_926[var1] == -1) {
               class_70.method_1000(field_949[var2], field_949[var3], field_949[var4], field_953[var2], field_953[var3], field_953[var4], this.field_920[var1], this.field_920[var1], this.field_920[var1], field_935[var5], field_935[var6], field_935[var7], field_957[var5], field_957[var6], field_957[var7], field_912[var5], field_912[var6], field_912[var7], this.field_930[var1]);
            } else {
               class_70.method_1000(field_949[var2], field_949[var3], field_949[var4], field_953[var2], field_953[var3], field_953[var4], this.field_920[var1], this.field_925[var1], this.field_926[var1], field_935[var5], field_935[var6], field_935[var7], field_957[var5], field_957[var6], field_957[var7], field_912[var5], field_912[var6], field_912[var7], this.field_930[var1]);
            }
         } else if(this.field_926[var1] == -1) {
            class_70.method_1042(field_949[var2], field_949[var3], field_949[var4], field_953[var2], field_953[var3], field_953[var4], field_978[this.field_920[var1]]);
         } else {
            class_70.method_977(field_949[var2], field_949[var3], field_949[var4], field_953[var2], field_953[var3], field_953[var4], this.field_920[var1], this.field_925[var1], this.field_926[var1]);
         }

      }
   }

   // $FF: renamed from: ct (int, int, int, int, int, int, int, int, long) void
   void method_1607(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
      field_956[0] = -1;
      if(this.field_939 != 1) {
         this.method_1621();
      }

      this.method_1653(var1);
      int var11 = var8 * var5 - var6 * var4 >> 16;
      int var12 = var7 * var2 + var11 * var3 >> 16;
      int var13 = this.field_941 * var3 >> 16;
      int var14 = var12 + var13;
      if(var14 > 50 && var12 < 3500) {
         int var15 = var8 * var4 + var6 * var5 >> 16;
         int var16 = (var15 - this.field_941) * class_70.field_544;
         if(var16 / var14 < class_70.field_550) {
            int var17 = (var15 + this.field_941) * class_70.field_544;
            if(var17 / var14 > class_70.field_549) {
               int var18 = var7 * var3 - var11 * var2 >> 16;
               int var19 = this.field_941 * var2 >> 16;
               int var20 = (var18 + var19) * class_70.field_544;
               if(var20 / var14 > class_70.field_551) {
                  int var21 = var19 + (this.field_911 * 267422413 * var3 >> 16);
                  int var22 = (var18 - var21) * class_70.field_544;
                  if(var22 / var14 < class_70.field_533) {
                     int var23 = var13 + (this.field_911 * 267422413 * var2 >> 16);
                     boolean var24 = false;
                     boolean var25 = false;
                     if(var12 - var23 <= 50) {
                        var25 = true;
                     }

                     boolean var26 = var25 || this.field_932 > 0;
                     int var27 = class_202.method_4075(2118107095);
                     int var28 = class_195.method_3987(2094559510);
                     boolean var29 = class_255.field_2876;
                     boolean var32 = var9 != 0L;
                     boolean var33;
                     if(var32) {
                        var33 = 1 == (int)(var9 >>> 16 & 1L);
                        var32 = !var33;
                     }

                     var33 = false;
                     int var36;
                     int var38;
                     int var39;
                     int var40;
                     int var41;
                     int var42;
                     int var49;
                     int var50;
                     if(var32 && var29) {
                        boolean var34 = false;
                        if(field_973) {
                           boolean var37 = class_255.field_2876;
                           boolean var35;
                           if(!var37) {
                              var35 = false;
                           } else {
                              class_210.method_4167(-26460885);
                              var38 = this.field_919 + var6;
                              var39 = this.field_942 + var7;
                              var40 = this.field_960 + var8;
                              var41 = this.field_940;
                              var42 = this.field_947;
                              int var43 = this.field_951;
                              int var44 = -1563417631 * class_255.field_2875 - var38;
                              int var45 = class_283.field_3255 * -288783387 - var39;
                              int var46 = 1940869639 * class_255.field_2880 - var40;
                              if(Math.abs(var44) > var41 + class_235.field_2626 * 1034667621) {
                                 var35 = false;
                              } else if(Math.abs(var45) > class_122.field_1344 * -49357127 + var42) {
                                 var35 = false;
                              } else if(Math.abs(var46) > var43 + class_147.field_1864 * -344685783) {
                                 var35 = false;
                              } else if(Math.abs(var46 * class_223.field_2525 * -1317870659 - var45 * -1885485519 * class_278.field_3224) > var43 * class_122.field_1344 * -49357127 + var42 * -344685783 * class_147.field_1864) {
                                 var35 = false;
                              } else if(Math.abs(var44 * class_278.field_3224 * -1885485519 - var46 * class_255.field_2879 * -1999867305) > 1034667621 * class_235.field_2626 * var43 + var41 * -344685783 * class_147.field_1864) {
                                 var35 = false;
                              } else if(Math.abs(-1999867305 * class_255.field_2879 * var45 - var44 * -1317870659 * class_223.field_2525) > -49357127 * class_122.field_1344 * var41 + class_235.field_2626 * 1034667621 * var42) {
                                 var35 = false;
                              } else {
                                 var35 = true;
                              }
                           }

                           var34 = var35;
                        } else {
                           var50 = var12 - var13;
                           if(var50 <= 50) {
                              var50 = 50;
                           }

                           if(var15 > 0) {
                              var16 /= var14;
                              var17 /= var50;
                           } else {
                              var17 /= var14;
                              var16 /= var50;
                           }

                           if(var18 > 0) {
                              var22 /= var14;
                              var20 /= var50;
                           } else {
                              var20 /= var14;
                              var22 /= var50;
                           }

                           var36 = var27 - class_70.field_545;
                           var49 = var28 - class_70.field_538;
                           if(var36 > var16 && var36 < var17 && var49 > var22 && var49 < var20) {
                              var34 = true;
                           }
                        }

                        if(var34) {
                           if(this.field_938) {
                              class_98.method_1812(var9);
                           } else {
                              var33 = true;
                           }
                        }
                     }

                     int var48 = class_70.field_545;
                     var50 = class_70.field_538;
                     var36 = 0;
                     var49 = 0;
                     if(var1 != 0) {
                        var36 = field_968[var1];
                        var49 = field_927[var1];
                     }

                     for(var38 = 0; var38 < this.field_916; ++var38) {
                        var39 = this.field_917[var38];
                        var40 = this.field_918[var38];
                        var41 = this.field_936[var38];
                        if(var1 != 0) {
                           var42 = var41 * var36 + var39 * var49 >> 16;
                           var41 = var41 * var49 - var39 * var36 >> 16;
                           var39 = var42;
                        }

                        var39 += var6;
                        var40 += var7;
                        var41 += var8;
                        var42 = var41 * var4 + var39 * var5 >> 16;
                        var41 = var41 * var5 - var39 * var4 >> 16;
                        var39 = var42;
                        var42 = var40 * var3 - var41 * var2 >> 16;
                        var41 = var40 * var2 + var41 * var3 >> 16;
                        field_955[var38] = var41 - var12;
                        if(var41 >= 50) {
                           field_953[var38] = var48 + var39 * class_70.field_544 / var41;
                           field_949[var38] = var50 + var42 * class_70.field_544 / var41;
                        } else {
                           field_953[var38] = -5000;
                           var24 = true;
                        }

                        if(var26) {
                           field_935[var38] = var39;
                           field_957[var38] = var42;
                           field_912[var38] = var41;
                        }
                     }

                     try {
                        this.method_1636(var24, var33, this.field_938, var9);
                     } catch (Exception var47) {
                        ;
                     }

                  }
               }
            }
         }
      }
   }

   // $FF: renamed from: q (boolean, boolean, boolean, long) void
   final void method_1636(boolean var1, boolean var2, boolean var3, long var4) {
      if(this.field_954 < 1600) {
         int var6;
         for(var6 = 0; var6 < this.field_954; ++var6) {
            field_956[var6] = 0;
         }

         var6 = var3?20:5;

         int var7;
         int var8;
         int var9;
         int var10;
         int var11;
         int var12;
         int var13;
         int var15;
         int var16;
         int var18;
         for(var7 = 0; var7 < this.field_970; ++var7) {
            if(this.field_926[var7] != -2) {
               var8 = this.field_921[var7];
               var9 = this.field_966[var7];
               var10 = this.field_923[var7];
               var11 = field_953[var8];
               var12 = field_953[var9];
               var13 = field_953[var10];
               int var14;
               if(var1 && (var11 == -5000 || var12 == -5000 || var13 == -5000)) {
                  var14 = field_935[var8];
                  var15 = field_935[var9];
                  var16 = field_935[var10];
                  int var17 = field_957[var8];
                  var18 = field_957[var9];
                  int var19 = field_957[var10];
                  int var20 = field_912[var8];
                  int var21 = field_912[var9];
                  int var22 = field_912[var10];
                  var14 -= var15;
                  var16 -= var15;
                  var17 -= var18;
                  var19 -= var18;
                  var20 -= var21;
                  var22 -= var21;
                  int var23 = var17 * var22 - var20 * var19;
                  int var24 = var20 * var16 - var14 * var22;
                  int var25 = var14 * var19 - var17 * var16;
                  if(var15 * var23 + var18 * var24 + var21 * var25 > 0) {
                     field_975[var7] = true;
                     int var26 = (field_955[var8] + field_955[var9] + field_955[var10]) / 3 + this.field_943;
                     field_961[var26][field_956[var26]++] = var7;
                  }
               } else {
                  if(var2 && class_169.method_3614(field_949[var8], field_949[var9], field_949[var10], var11, var12, var13, var6, 1961168244)) {
                     class_98.method_1812(var4);
                     var2 = false;
                  }

                  if((var11 - var12) * (field_949[var10] - field_949[var9]) - (field_949[var8] - field_949[var9]) * (var13 - var12) > 0) {
                     field_975[var7] = false;
                     if(var11 >= 0 && var12 >= 0 && var13 >= 0 && var11 <= class_70.field_537 && var12 <= class_70.field_537 && var13 <= class_70.field_537) {
                        field_945[var7] = false;
                     } else {
                        field_945[var7] = true;
                     }

                     var14 = (field_955[var8] + field_955[var9] + field_955[var10]) / 3 + this.field_943;
                     field_961[var14][field_956[var14]++] = var7;
                  }
               }
            }
         }

         int[] var27;
         if(this.field_948 == null) {
            for(var7 = this.field_954 - 1; var7 >= 0; --var7) {
               var8 = field_956[var7];
               if(var8 > 0) {
                  var27 = field_961[var7];

                  for(var10 = 0; var10 < var8; ++var10) {
                     this.method_1687(var27[var10]);
                  }
               }
            }

         } else {
            for(var7 = 0; var7 < 12; ++var7) {
               field_962[var7] = 0;
               field_924[var7] = 0;
            }

            for(var7 = this.field_954 - 1; var7 >= 0; --var7) {
               var8 = field_956[var7];
               if(var8 > 0) {
                  var27 = field_961[var7];

                  for(var10 = 0; var10 < var8; ++var10) {
                     var11 = var27[var10];
                     byte var28 = this.field_948[var11];
                     var13 = field_962[var28]++;
                     field_963[var28][var13] = var11;
                     if(var28 < 10) {
                        field_924[var28] += var7;
                     } else if(var28 == 10) {
                        field_964[var13] = var7;
                     } else {
                        field_965[var13] = var7;
                     }
                  }
               }
            }

            var7 = 0;
            if(field_962[1] > 0 || field_962[2] > 0) {
               var7 = (field_924[1] + field_924[2]) / (field_962[1] + field_962[2]);
            }

            var8 = 0;
            if(field_962[3] > 0 || field_962[4] > 0) {
               var8 = (field_924[3] + field_924[4]) / (field_962[3] + field_962[4]);
            }

            var9 = 0;
            if(field_962[6] > 0 || field_962[8] > 0) {
               var9 = (field_924[6] + field_924[8]) / (field_962[6] + field_962[8]);
            }

            var11 = 0;
            var12 = field_962[10];
            int[] var29 = field_963[10];
            int[] var30 = field_964;
            if(var11 == var12) {
               var11 = 0;
               var12 = field_962[11];
               var29 = field_963[11];
               var30 = field_965;
            }

            if(var11 < var12) {
               var10 = var30[var11];
            } else {
               var10 = -1000;
            }

            for(var15 = 0; var15 < 10; ++var15) {
               while(var15 == 0 && var10 > var7) {
                  this.method_1687(var29[var11++]);
                  if(var11 == var12 && var29 != field_963[11]) {
                     var11 = 0;
                     var12 = field_962[11];
                     var29 = field_963[11];
                     var30 = field_965;
                  }

                  if(var11 < var12) {
                     var10 = var30[var11];
                  } else {
                     var10 = -1000;
                  }
               }

               while(var15 == 3 && var10 > var8) {
                  this.method_1687(var29[var11++]);
                  if(var11 == var12 && var29 != field_963[11]) {
                     var11 = 0;
                     var12 = field_962[11];
                     var29 = field_963[11];
                     var30 = field_965;
                  }

                  if(var11 < var12) {
                     var10 = var30[var11];
                  } else {
                     var10 = -1000;
                  }
               }

               while(var15 == 5 && var10 > var9) {
                  this.method_1687(var29[var11++]);
                  if(var11 == var12 && var29 != field_963[11]) {
                     var11 = 0;
                     var12 = field_962[11];
                     var29 = field_963[11];
                     var30 = field_965;
                  }

                  if(var11 < var12) {
                     var10 = var30[var11];
                  } else {
                     var10 = -1000;
                  }
               }

               var16 = field_962[var15];
               int[] var31 = field_963[var15];

               for(var18 = 0; var18 < var16; ++var18) {
                  this.method_1687(var31[var18]);
               }
            }

            while(var10 != -1000) {
               this.method_1687(var29[var11++]);
               if(var11 == var12 && var29 != field_963[11]) {
                  var11 = 0;
                  var29 = field_963[11];
                  var12 = field_962[11];
                  var30 = field_965;
               }

               if(var11 < var12) {
                  var10 = var30[var11];
               } else {
                  var10 = -1000;
               }
            }

         }
      }
   }

   // $FF: renamed from: bj (int, int, int) void
   public void method_1637(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field_916; ++var4) {
         this.field_917[var4] = this.field_917[var4] * var1 / -2043431124;
         this.field_918[var4] = this.field_918[var4] * var2 / 128;
         this.field_936[var4] = this.field_936[var4] * var3 / 170241525;
      }

      this.method_1624();
   }

   // $FF: renamed from: ae (int) void
   final void method_1638(int var1) {
      int var2 = class_70.field_545;
      int var3 = class_70.field_538;
      int var4 = 0;
      int var5 = this.field_921[var1];
      int var6 = this.field_966[var1];
      int var7 = this.field_923[var1];
      int var8 = field_912[var5];
      int var9 = field_912[var6];
      int var10 = field_912[var7];
      if(this.field_928 == null) {
         class_70.field_554 = 0;
      } else {
         class_70.field_554 = this.field_928[var1] & 255;
      }

      int var11;
      int var12;
      int var13;
      int var14;
      if(var8 >= 50) {
         field_967[var4] = field_953[var5];
         field_979[var4] = field_949[var5];
         field_969[var4++] = this.field_920[var1];
      } else {
         var11 = field_935[var5];
         var12 = field_957[var5];
         var13 = this.field_920[var1];
         if(var10 >= 50) {
            var14 = (50 - var8) * field_915[var10 - var8];
            field_967[var4] = var2 + (var11 + ((field_935[var7] - var11) * var14 >> 16)) * class_70.field_544 / 50;
            field_979[var4] = var3 + (var12 + ((field_957[var7] - var12) * var14 >> 16)) * class_70.field_544 / 50;
            field_969[var4++] = var13 + ((this.field_926[var1] - var13) * var14 >> 16);
         }

         if(var9 >= 50) {
            var14 = (50 - var8) * field_915[var9 - var8];
            field_967[var4] = var2 + (var11 + ((field_935[var6] - var11) * var14 >> 16)) * class_70.field_544 / 50;
            field_979[var4] = var3 + (var12 + ((field_957[var6] - var12) * var14 >> 16)) * class_70.field_544 / 50;
            field_969[var4++] = var13 + ((this.field_925[var1] - var13) * var14 >> 16);
         }
      }

      if(var9 >= 50) {
         field_967[var4] = field_953[var6];
         field_979[var4] = field_949[var6];
         field_969[var4++] = this.field_925[var1];
      } else {
         var11 = field_935[var6];
         var12 = field_957[var6];
         var13 = this.field_925[var1];
         if(var8 >= 50) {
            var14 = (50 - var9) * field_915[var8 - var9];
            field_967[var4] = var2 + (var11 + ((field_935[var5] - var11) * var14 >> 16)) * class_70.field_544 / 50;
            field_979[var4] = var3 + (var12 + ((field_957[var5] - var12) * var14 >> 16)) * class_70.field_544 / 50;
            field_969[var4++] = var13 + ((this.field_920[var1] - var13) * var14 >> 16);
         }

         if(var10 >= 50) {
            var14 = (50 - var9) * field_915[var10 - var9];
            field_967[var4] = var2 + (var11 + ((field_935[var7] - var11) * var14 >> 16)) * class_70.field_544 / 50;
            field_979[var4] = var3 + (var12 + ((field_957[var7] - var12) * var14 >> 16)) * class_70.field_544 / 50;
            field_969[var4++] = var13 + ((this.field_926[var1] - var13) * var14 >> 16);
         }
      }

      if(var10 >= 50) {
         field_967[var4] = field_953[var7];
         field_979[var4] = field_949[var7];
         field_969[var4++] = this.field_926[var1];
      } else {
         var11 = field_935[var7];
         var12 = field_957[var7];
         var13 = this.field_926[var1];
         if(var9 >= 50) {
            var14 = (50 - var10) * field_915[var9 - var10];
            field_967[var4] = var2 + (var11 + ((field_935[var6] - var11) * var14 >> 16)) * class_70.field_544 / 50;
            field_979[var4] = var3 + (var12 + ((field_957[var6] - var12) * var14 >> 16)) * class_70.field_544 / 50;
            field_969[var4++] = var13 + ((this.field_925[var1] - var13) * var14 >> 16);
         }

         if(var8 >= 50) {
            var14 = (50 - var10) * field_915[var8 - var10];
            field_967[var4] = var2 + (var11 + ((field_935[var5] - var11) * var14 >> 16)) * class_70.field_544 / 50;
            field_979[var4] = var3 + (var12 + ((field_957[var5] - var12) * var14 >> 16)) * class_70.field_544 / 50;
            field_969[var4++] = var13 + ((this.field_920[var1] - var13) * var14 >> 16);
         }
      }

      var11 = field_967[0];
      var12 = field_967[1];
      var13 = field_967[2];
      var14 = field_979[0];
      int var15 = field_979[1];
      int var16 = field_979[2];
      class_70.field_536 = false;
      int var17;
      int var18;
      int var19;
      int var20;
      if(var4 == 3) {
         if(var11 < 0 || var12 < 0 || var13 < 0 || var11 > class_70.field_537 || var12 > class_70.field_537 || var13 > class_70.field_537) {
            class_70.field_536 = true;
         }

         if(this.field_930 != null && this.field_930[var1] != -1) {
            if(this.field_929 != null && this.field_929[var1] != -1) {
               var20 = this.field_929[var1] & 255;
               var17 = this.field_933[var20];
               var18 = this.field_934[var20];
               var19 = this.field_958[var20];
            } else {
               var17 = var5;
               var18 = var6;
               var19 = var7;
            }

            if(this.field_926[var1] == -1) {
               class_70.method_1000(var14, var15, var16, var11, var12, var13, this.field_920[var1], this.field_920[var1], this.field_920[var1], field_935[var17], field_935[var18], field_935[var19], field_957[var17], field_957[var18], field_957[var19], field_912[var17], field_912[var18], field_912[var19], this.field_930[var1]);
            } else {
               class_70.method_1000(var14, var15, var16, var11, var12, var13, field_969[0], field_969[1], field_969[2], field_935[var17], field_935[var18], field_935[var19], field_957[var17], field_957[var18], field_957[var19], field_912[var17], field_912[var18], field_912[var19], this.field_930[var1]);
            }
         } else if(this.field_926[var1] == -1) {
            class_70.method_1042(var14, var15, var16, var11, var12, var13, field_978[this.field_920[var1]]);
         } else {
            class_70.method_977(var14, var15, var16, var11, var12, var13, field_969[0], field_969[1], field_969[2]);
         }
      }

      if(var4 == 4) {
         if(var11 < 0 || var12 < 0 || var13 < 0 || var11 > class_70.field_537 || var12 > class_70.field_537 || var13 > class_70.field_537 || field_967[3] < 0 || field_967[3] > class_70.field_537) {
            class_70.field_536 = true;
         }

         if(this.field_930 != null && this.field_930[var1] != -1) {
            if(this.field_929 != null && this.field_929[var1] != -1) {
               var20 = this.field_929[var1] & 255;
               var17 = this.field_933[var20];
               var18 = this.field_934[var20];
               var19 = this.field_958[var20];
            } else {
               var17 = var5;
               var18 = var6;
               var19 = var7;
            }

            short var21 = this.field_930[var1];
            if(this.field_926[var1] == -1) {
               class_70.method_1000(var14, var15, var16, var11, var12, var13, this.field_920[var1], this.field_920[var1], this.field_920[var1], field_935[var17], field_935[var18], field_935[var19], field_957[var17], field_957[var18], field_957[var19], field_912[var17], field_912[var18], field_912[var19], var21);
               class_70.method_1000(var14, var16, field_979[3], var11, var13, field_967[3], this.field_920[var1], this.field_920[var1], this.field_920[var1], field_935[var17], field_935[var18], field_935[var19], field_957[var17], field_957[var18], field_957[var19], field_912[var17], field_912[var18], field_912[var19], var21);
            } else {
               class_70.method_1000(var14, var15, var16, var11, var12, var13, field_969[0], field_969[1], field_969[2], field_935[var17], field_935[var18], field_935[var19], field_957[var17], field_957[var18], field_957[var19], field_912[var17], field_912[var18], field_912[var19], var21);
               class_70.method_1000(var14, var16, field_979[3], var11, var13, field_967[3], field_969[0], field_969[2], field_969[3], field_935[var17], field_935[var18], field_935[var19], field_957[var17], field_957[var18], field_957[var19], field_912[var17], field_912[var18], field_912[var19], var21);
            }
         } else if(this.field_926[var1] == -1) {
            var17 = field_978[this.field_920[var1]];
            class_70.method_1042(var14, var15, var16, var11, var12, var13, var17);
            class_70.method_1042(var14, var16, field_979[3], var11, var13, field_967[3], var17);
         } else {
            class_70.method_977(var14, var15, var16, var11, var12, var13, field_969[0], field_969[1], field_969[2]);
            class_70.method_977(var14, var16, field_979[3], var11, var13, field_967[3], field_969[0], field_969[2], field_969[3]);
         }
      }

   }

   // $FF: renamed from: <clinit> () void
   static {
      class_92 var10000 = new class_92();
      field_922 = var10000;
      field_913 = new byte[1];
      var10000 = new class_92();
      field_914 = var10000;
      field_976 = new byte[1];
      field_945 = new boolean[4700];
      field_975 = new boolean[4700];
      field_953 = new int[4700];
      field_949 = new int[4700];
      field_955 = new int[4700];
      field_935 = new int[4700];
      field_957 = new int[4700];
      field_912 = new int[4700];
      field_956 = new int[1600];
      field_961 = new int[1600][512];
      field_962 = new int[12];
      field_963 = new int[12][2000];
      field_964 = new int[2000];
      field_965 = new int[2000];
      field_924 = new int[12];
      field_967 = new int[10];
      field_979 = new int[10];
      field_969 = new int[10];
      field_973 = true;
      field_968 = class_70.field_548;
      field_927 = class_70.field_559;
      field_978 = class_70.field_546;
      field_915 = class_70.field_557;
   }

   // $FF: renamed from: cq (int, int, int, int, int, int, int, int, long) void
   void method_1611(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
      field_956[0] = -1;
      if(this.field_939 != 1) {
         this.method_1621();
      }

      this.method_1653(var1);
      int var11 = var8 * var5 - var6 * var4 >> 16;
      int var12 = var7 * var2 + var11 * var3 >> 16;
      int var13 = this.field_941 * var3 >> 16;
      int var14 = var12 + var13;
      if(var14 > 50 && var12 < 3500) {
         int var15 = var8 * var4 + var6 * var5 >> 16;
         int var16 = (var15 - this.field_941) * class_70.field_544;
         if(var16 / var14 < class_70.field_550) {
            int var17 = (var15 + this.field_941) * class_70.field_544;
            if(var17 / var14 > class_70.field_549) {
               int var18 = var7 * var3 - var11 * var2 >> 16;
               int var19 = this.field_941 * var2 >> 16;
               int var20 = (var18 + var19) * class_70.field_544;
               if(var20 / var14 > class_70.field_551) {
                  int var21 = var19 + (this.field_911 * 267422413 * var3 >> 16);
                  int var22 = (var18 - var21) * class_70.field_544;
                  if(var22 / var14 < class_70.field_533) {
                     int var23 = var13 + (this.field_911 * 267422413 * var2 >> 16);
                     boolean var24 = false;
                     boolean var25 = false;
                     if(var12 - var23 <= 50) {
                        var25 = true;
                     }

                     boolean var26 = var25 || this.field_932 > 0;
                     int var27 = class_202.method_4075(2118107095);
                     int var28 = class_195.method_3987(2060392277);
                     boolean var29 = class_255.field_2876;
                     boolean var32 = var9 != 0L;
                     boolean var33;
                     if(var32) {
                        var33 = 1 == (int)(var9 >>> 16 & 1L);
                        var32 = !var33;
                     }

                     var33 = false;
                     int var36;
                     int var38;
                     int var39;
                     int var40;
                     int var41;
                     int var42;
                     int var49;
                     int var50;
                     if(var32 && var29) {
                        boolean var34 = false;
                        if(field_973) {
                           boolean var37 = class_255.field_2876;
                           boolean var35;
                           if(!var37) {
                              var35 = false;
                           } else {
                              class_210.method_4167(-26460885);
                              var38 = this.field_919 + var6;
                              var39 = this.field_942 + var7;
                              var40 = this.field_960 + var8;
                              var41 = this.field_940;
                              var42 = this.field_947;
                              int var43 = this.field_951;
                              int var44 = -1563417631 * class_255.field_2875 - var38;
                              int var45 = class_283.field_3255 * -288783387 - var39;
                              int var46 = 1940869639 * class_255.field_2880 - var40;
                              if(Math.abs(var44) > var41 + class_235.field_2626 * 1034667621) {
                                 var35 = false;
                              } else if(Math.abs(var45) > class_122.field_1344 * -49357127 + var42) {
                                 var35 = false;
                              } else if(Math.abs(var46) > var43 + class_147.field_1864 * -344685783) {
                                 var35 = false;
                              } else if(Math.abs(var46 * class_223.field_2525 * -1317870659 - var45 * -1885485519 * class_278.field_3224) > var43 * class_122.field_1344 * -49357127 + var42 * -344685783 * class_147.field_1864) {
                                 var35 = false;
                              } else if(Math.abs(var44 * class_278.field_3224 * -1885485519 - var46 * class_255.field_2879 * -1999867305) > 1034667621 * class_235.field_2626 * var43 + var41 * -344685783 * class_147.field_1864) {
                                 var35 = false;
                              } else if(Math.abs(-1999867305 * class_255.field_2879 * var45 - var44 * -1317870659 * class_223.field_2525) > -49357127 * class_122.field_1344 * var41 + class_235.field_2626 * 1034667621 * var42) {
                                 var35 = false;
                              } else {
                                 var35 = true;
                              }
                           }

                           var34 = var35;
                        } else {
                           var50 = var12 - var13;
                           if(var50 <= 50) {
                              var50 = 50;
                           }

                           if(var15 > 0) {
                              var16 /= var14;
                              var17 /= var50;
                           } else {
                              var17 /= var14;
                              var16 /= var50;
                           }

                           if(var18 > 0) {
                              var22 /= var14;
                              var20 /= var50;
                           } else {
                              var20 /= var14;
                              var22 /= var50;
                           }

                           var36 = var27 - class_70.field_545;
                           var49 = var28 - class_70.field_538;
                           if(var36 > var16 && var36 < var17 && var49 > var22 && var49 < var20) {
                              var34 = true;
                           }
                        }

                        if(var34) {
                           if(this.field_938) {
                              class_98.method_1812(var9);
                           } else {
                              var33 = true;
                           }
                        }
                     }

                     int var48 = class_70.field_545;
                     var50 = class_70.field_538;
                     var36 = 0;
                     var49 = 0;
                     if(var1 != 0) {
                        var36 = field_968[var1];
                        var49 = field_927[var1];
                     }

                     for(var38 = 0; var38 < this.field_916; ++var38) {
                        var39 = this.field_917[var38];
                        var40 = this.field_918[var38];
                        var41 = this.field_936[var38];
                        if(var1 != 0) {
                           var42 = var41 * var36 + var39 * var49 >> 16;
                           var41 = var41 * var49 - var39 * var36 >> 16;
                           var39 = var42;
                        }

                        var39 += var6;
                        var40 += var7;
                        var41 += var8;
                        var42 = var41 * var4 + var39 * var5 >> 16;
                        var41 = var41 * var5 - var39 * var4 >> 16;
                        var39 = var42;
                        var42 = var40 * var3 - var41 * var2 >> 16;
                        var41 = var40 * var2 + var41 * var3 >> 16;
                        field_955[var38] = var41 - var12;
                        if(var41 >= 50) {
                           field_953[var38] = var48 + var39 * class_70.field_544 / var41;
                           field_949[var38] = var50 + var42 * class_70.field_544 / var41;
                        } else {
                           field_953[var38] = -5000;
                           var24 = true;
                        }

                        if(var26) {
                           field_935[var38] = var39;
                           field_957[var38] = var42;
                           field_912[var38] = var41;
                        }
                     }

                     try {
                        this.method_1636(var24, var33, this.field_938, var9);
                     } catch (Exception var47) {
                        ;
                     }

                  }
               }
            }
         }
      }
   }

   // $FF: renamed from: ay (gd, int, gd, int, int[]) void
   public void method_1640(class_71 var1, int var2, class_71 var3, int var4, int[] var5) {
      if(var2 != -1) {
         if(var5 != null && var4 != -1) {
            class_252 var6 = var1.field_562[var2];
            class_252 var7 = var3.field_562[var4];
            class_43 var8 = var6.field_2852;
            field_952 = 0;
            field_971 = 0;
            field_972 = 0;
            byte var9 = 0;
            int var13 = var9 + 1;
            int var10 = var5[var9];

            int var11;
            int var12;
            for(var11 = 0; var11 < var6.field_2855; ++var11) {
               for(var12 = var6.field_2853[var11]; var12 > var10; var10 = var5[var13++]) {
                  ;
               }

               if(var12 != var10 || var8.field_312[var12] == 0) {
                  this.method_1648(var8.field_312[var12], var8.field_313[var12], var6.field_2856[var11], var6.field_2857[var11], var6.field_2858[var11]);
               }
            }

            field_952 = 0;
            field_971 = 0;
            field_972 = 0;
            var9 = 0;
            var13 = var9 + 1;
            var10 = var5[var9];

            for(var11 = 0; var11 < var7.field_2855; ++var11) {
               for(var12 = var7.field_2853[var11]; var12 > var10; var10 = var5[var13++]) {
                  ;
               }

               if(var12 == var10 || var8.field_312[var12] == 0) {
                  this.method_1648(var8.field_312[var12], var8.field_313[var12], var7.field_2856[var11], var7.field_2857[var11], var7.field_2858[var11]);
               }
            }

            this.method_1624();
         } else {
            this.method_1625(var1, var2);
         }
      }
   }

   // $FF: renamed from: cf (int, int, int, int, int, int, int, int, long) void
   void method_1606(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
      field_956[0] = -1;
      if(this.field_939 != 1) {
         this.method_1621();
      }

      this.method_1653(var1);
      int var11 = var8 * var5 - var6 * var4 >> 16;
      int var12 = var7 * var2 + var11 * var3 >> 16;
      int var13 = this.field_941 * var3 >> 16;
      int var14 = var12 + var13;
      if(var14 > 50 && var12 < -1591032475) {
         int var15 = var8 * var4 + var6 * var5 >> 16;
         int var16 = (var15 - this.field_941) * class_70.field_544;
         if(var16 / var14 < class_70.field_550) {
            int var17 = (var15 + this.field_941) * class_70.field_544;
            if(var17 / var14 > class_70.field_549) {
               int var18 = var7 * var3 - var11 * var2 >> 16;
               int var19 = this.field_941 * var2 >> 16;
               int var20 = (var18 + var19) * class_70.field_544;
               if(var20 / var14 > class_70.field_551) {
                  int var21 = var19 + (this.field_911 * -258721790 * var3 >> 16);
                  int var22 = (var18 - var21) * class_70.field_544;
                  if(var22 / var14 < class_70.field_533) {
                     int var23 = var13 + (this.field_911 * 267422413 * var2 >> 16);
                     boolean var24 = false;
                     boolean var25 = false;
                     if(var12 - var23 <= 50) {
                        var25 = true;
                     }

                     boolean var26 = var25 || this.field_932 > 0;
                     int var27 = class_202.method_4075(2118107095);
                     int var28 = class_195.method_3987(1987121682);
                     boolean var29 = class_255.field_2876;
                     boolean var32 = var9 != 0L;
                     boolean var33;
                     if(var32) {
                        var33 = 1 == (int)(var9 >>> 16 & 1L);
                        var32 = !var33;
                     }

                     var33 = false;
                     int var36;
                     int var38;
                     int var39;
                     int var40;
                     int var41;
                     int var42;
                     int var49;
                     int var50;
                     if(var32 && var29) {
                        boolean var34 = false;
                        if(field_973) {
                           boolean var37 = class_255.field_2876;
                           boolean var35;
                           if(!var37) {
                              var35 = false;
                           } else {
                              class_210.method_4167(-26460885);
                              var38 = this.field_919 + var6;
                              var39 = this.field_942 + var7;
                              var40 = this.field_960 + var8;
                              var41 = this.field_940;
                              var42 = this.field_947;
                              int var43 = this.field_951;
                              int var44 = -1563417631 * class_255.field_2875 - var38;
                              int var45 = class_283.field_3255 * -1133823357 - var39;
                              int var46 = 285752097 * class_255.field_2880 - var40;
                              if(Math.abs(var44) > var41 + class_235.field_2626 * -1171801081) {
                                 var35 = false;
                              } else if(Math.abs(var45) > class_122.field_1344 * -49357127 + var42) {
                                 var35 = false;
                              } else if(Math.abs(var46) > var43 + class_147.field_1864 * -344685783) {
                                 var35 = false;
                              } else if(Math.abs(var46 * class_223.field_2525 * -1317870659 - var45 * -1885485519 * class_278.field_3224) > var43 * class_122.field_1344 * -1777618543 + var42 * 645836322 * class_147.field_1864) {
                                 var35 = false;
                              } else if(Math.abs(var44 * class_278.field_3224 * 744065955 - var46 * class_255.field_2879 * -48432889) > 604733014 * class_235.field_2626 * var43 + var41 * -344685783 * class_147.field_1864) {
                                 var35 = false;
                              } else if(Math.abs(-1921893328 * class_255.field_2879 * var45 - var44 * -1317870659 * class_223.field_2525) > -49357127 * class_122.field_1344 * var41 + class_235.field_2626 * 1034667621 * var42) {
                                 var35 = false;
                              } else {
                                 var35 = true;
                              }
                           }

                           var34 = var35;
                        } else {
                           var50 = var12 - var13;
                           if(var50 <= -1466648488) {
                              var50 = 1520271966;
                           }

                           if(var15 > 0) {
                              var16 /= var14;
                              var17 /= var50;
                           } else {
                              var17 /= var14;
                              var16 /= var50;
                           }

                           if(var18 > 0) {
                              var22 /= var14;
                              var20 /= var50;
                           } else {
                              var20 /= var14;
                              var22 /= var50;
                           }

                           var36 = var27 - class_70.field_545;
                           var49 = var28 - class_70.field_538;
                           if(var36 > var16 && var36 < var17 && var49 > var22 && var49 < var20) {
                              var34 = true;
                           }
                        }

                        if(var34) {
                           if(this.field_938) {
                              class_98.method_1812(var9);
                           } else {
                              var33 = true;
                           }
                        }
                     }

                     int var48 = class_70.field_545;
                     var50 = class_70.field_538;
                     var36 = 0;
                     var49 = 0;
                     if(var1 != 0) {
                        var36 = field_968[var1];
                        var49 = field_927[var1];
                     }

                     for(var38 = 0; var38 < this.field_916; ++var38) {
                        var39 = this.field_917[var38];
                        var40 = this.field_918[var38];
                        var41 = this.field_936[var38];
                        if(var1 != 0) {
                           var42 = var41 * var36 + var39 * var49 >> 16;
                           var41 = var41 * var49 - var39 * var36 >> 16;
                           var39 = var42;
                        }

                        var39 += var6;
                        var40 += var7;
                        var41 += var8;
                        var42 = var41 * var4 + var39 * var5 >> 16;
                        var41 = var41 * var5 - var39 * var4 >> 16;
                        var39 = var42;
                        var42 = var40 * var3 - var41 * var2 >> 16;
                        var41 = var40 * var2 + var41 * var3 >> 16;
                        field_955[var38] = var41 - var12;
                        if(var41 >= -2108536349) {
                           field_953[var38] = var48 + var39 * class_70.field_544 / var41;
                           field_949[var38] = var50 + var42 * class_70.field_544 / var41;
                        } else {
                           field_953[var38] = -5000;
                           var24 = true;
                        }

                        if(var26) {
                           field_935[var38] = var39;
                           field_957[var38] = var42;
                           field_912[var38] = var41;
                        }
                     }

                     try {
                        this.method_1636(var24, var33, this.field_938, var9);
                     } catch (Exception var47) {
                        ;
                     }

                  }
               }
            }
         }
      }
   }

   // $FF: renamed from: ap (int[][], int, int, int, boolean, int) gr
   public class_92 method_1641(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
      this.method_1621();
      int var7 = var2 - this.field_941;
      int var8 = var2 + this.field_941;
      int var9 = var4 - this.field_941;
      int var10 = var4 + this.field_941;
      if(var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 1323114114 >> 7 < var1[0].length) {
         var7 >>= 7;
         var8 = var8 + 127 >> 7;
         var9 >>= 7;
         var10 = var10 + 127 >> 7;
         if(var1[var7][var9] == var3 && var1[var8][var9] == var3 && var1[var7][var10] == var3 && var1[var8][var10] == var3) {
            return this;
         } else {
            class_92 var11;
            if(var5) {
               class_92 var10000 = new class_92();
               var11 = var10000;
               var11.field_916 = this.field_916;
               var11.field_970 = this.field_970;
               var11.field_932 = this.field_932;
               var11.field_917 = this.field_917;
               var11.field_936 = this.field_936;
               var11.field_921 = this.field_921;
               var11.field_966 = this.field_966;
               var11.field_923 = this.field_923;
               var11.field_920 = this.field_920;
               var11.field_925 = this.field_925;
               var11.field_926 = this.field_926;
               var11.field_948 = this.field_948;
               var11.field_928 = this.field_928;
               var11.field_929 = this.field_929;
               var11.field_930 = this.field_930;
               var11.field_931 = this.field_931;
               var11.field_933 = this.field_933;
               var11.field_934 = this.field_934;
               var11.field_958 = this.field_958;
               var11.field_977 = this.field_977;
               var11.field_937 = this.field_937;
               var11.field_938 = this.field_938;
               var11.field_918 = new int[var11.field_916];
            } else {
               var11 = this;
            }

            int var12;
            int var13;
            int var14;
            int var15;
            int var16;
            int var17;
            int var18;
            int var19;
            int var20;
            int var21;
            if(var6 == 0) {
               for(var12 = 0; var12 < var11.field_916; ++var12) {
                  var13 = this.field_917[var12] + var2;
                  var14 = this.field_936[var12] + var4;
                  var15 = var13 & 127;
                  var16 = var14 & -1467709372;
                  var17 = var13 >> 7;
                  var18 = var14 >> 7;
                  var19 = var1[var17][var18] * (128 - var15) + var1[var17 + 1][var18] * var15 >> 7;
                  var20 = var1[var17][var18 + 1] * (1016232113 - var15) + var1[var17 + 1][var18 + 1] * var15 >> 7;
                  var21 = var19 * (374559247 - var16) + var20 * var16 >> 7;
                  var11.field_918[var12] = this.field_918[var12] + var21 - var3;
               }
            } else {
               for(var12 = 0; var12 < var11.field_916; ++var12) {
                  var13 = (-this.field_918[var12] << 16) / (this.field_911 * 639857762);
                  if(var13 < var6) {
                     var14 = this.field_917[var12] + var2;
                     var15 = this.field_936[var12] + var4;
                     var16 = var14 & 1597151276;
                     var17 = var15 & 127;
                     var18 = var14 >> 7;
                     var19 = var15 >> 7;
                     var20 = var1[var18][var19] * (128 - var16) + var1[var18 + 1][var19] * var16 >> 7;
                     var21 = var1[var18][var19 + 1] * (1430839155 - var16) + var1[var18 + 1][var19 + 1] * var16 >> 7;
                     int var22 = var20 * (-1291912708 - var17) + var21 * var17 >> 7;
                     var11.field_918[var12] = this.field_918[var12] + (var22 - var3) * (var6 - var13) / var6;
                  }
               }
            }

            var11.method_1624();
            return var11;
         }
      } else {
         return this;
      }
   }

   // $FF: renamed from: ab (boolean) gr
   public class_92 method_1642(boolean var1) {
      if(!var1 && field_913.length < this.field_970) {
         field_913 = new byte[this.field_970 + 100];
      }

      return this.method_1619(var1, field_922, field_913);
   }

   // $FF: renamed from: cr (int, int, int, int, int, int, int, int, long) void
   void method_1612(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
      field_956[0] = -1;
      if(this.field_939 != 1) {
         this.method_1621();
      }

      this.method_1653(var1);
      int var11 = var8 * var5 - var6 * var4 >> 16;
      int var12 = var7 * var2 + var11 * var3 >> 16;
      int var13 = this.field_941 * var3 >> 16;
      int var14 = var12 + var13;
      if(var14 > 50 && var12 < 3500) {
         int var15 = var8 * var4 + var6 * var5 >> 16;
         int var16 = (var15 - this.field_941) * class_70.field_544;
         if(var16 / var14 < class_70.field_550) {
            int var17 = (var15 + this.field_941) * class_70.field_544;
            if(var17 / var14 > class_70.field_549) {
               int var18 = var7 * var3 - var11 * var2 >> 16;
               int var19 = this.field_941 * var2 >> 16;
               int var20 = (var18 + var19) * class_70.field_544;
               if(var20 / var14 > class_70.field_551) {
                  int var21 = var19 + (this.field_911 * 267422413 * var3 >> 16);
                  int var22 = (var18 - var21) * class_70.field_544;
                  if(var22 / var14 < class_70.field_533) {
                     int var23 = var13 + (this.field_911 * 2137074112 * var2 >> 16);
                     boolean var24 = false;
                     boolean var25 = false;
                     if(var12 - var23 <= -1714339551) {
                        var25 = true;
                     }

                     boolean var26 = var25 || this.field_932 > 0;
                     int var27 = class_202.method_4075(2118107095);
                     int var28 = class_195.method_3987(2146980448);
                     boolean var29 = class_255.field_2876;
                     boolean var32 = var9 != 0L;
                     boolean var33;
                     if(var32) {
                        var33 = 1 == (int)(var9 >>> 16 & 1L);
                        var32 = !var33;
                     }

                     var33 = false;
                     int var36;
                     int var38;
                     int var39;
                     int var40;
                     int var41;
                     int var42;
                     int var49;
                     int var50;
                     if(var32 && var29) {
                        boolean var34 = false;
                        if(field_973) {
                           boolean var37 = class_255.field_2876;
                           boolean var35;
                           if(!var37) {
                              var35 = false;
                           } else {
                              class_210.method_4167(-26460885);
                              var38 = this.field_919 + var6;
                              var39 = this.field_942 + var7;
                              var40 = this.field_960 + var8;
                              var41 = this.field_940;
                              var42 = this.field_947;
                              int var43 = this.field_951;
                              int var44 = -1563417631 * class_255.field_2875 - var38;
                              int var45 = class_283.field_3255 * 1068781087 - var39;
                              int var46 = 1940869639 * class_255.field_2880 - var40;
                              if(Math.abs(var44) > var41 + class_235.field_2626 * 1034667621) {
                                 var35 = false;
                              } else if(Math.abs(var45) > class_122.field_1344 * -424027484 + var42) {
                                 var35 = false;
                              } else if(Math.abs(var46) > var43 + class_147.field_1864 * 571473024) {
                                 var35 = false;
                              } else if(Math.abs(var46 * class_223.field_2525 * -1317870659 - var45 * -842427298 * class_278.field_3224) > var43 * class_122.field_1344 * 1903451700 + var42 * -476803665 * class_147.field_1864) {
                                 var35 = false;
                              } else if(Math.abs(var44 * class_278.field_3224 * -481846583 - var46 * class_255.field_2879 * -1505504154) > -912844087 * class_235.field_2626 * var43 + var41 * -344685783 * class_147.field_1864) {
                                 var35 = false;
                              } else if(Math.abs(-1999867305 * class_255.field_2879 * var45 - var44 * -1317870659 * class_223.field_2525) > -49357127 * class_122.field_1344 * var41 + class_235.field_2626 * -1480198360 * var42) {
                                 var35 = false;
                              } else {
                                 var35 = true;
                              }
                           }

                           var34 = var35;
                        } else {
                           var50 = var12 - var13;
                           if(var50 <= 50) {
                              var50 = 1632685759;
                           }

                           if(var15 > 0) {
                              var16 /= var14;
                              var17 /= var50;
                           } else {
                              var17 /= var14;
                              var16 /= var50;
                           }

                           if(var18 > 0) {
                              var22 /= var14;
                              var20 /= var50;
                           } else {
                              var20 /= var14;
                              var22 /= var50;
                           }

                           var36 = var27 - class_70.field_545;
                           var49 = var28 - class_70.field_538;
                           if(var36 > var16 && var36 < var17 && var49 > var22 && var49 < var20) {
                              var34 = true;
                           }
                        }

                        if(var34) {
                           if(this.field_938) {
                              class_98.method_1812(var9);
                           } else {
                              var33 = true;
                           }
                        }
                     }

                     int var48 = class_70.field_545;
                     var50 = class_70.field_538;
                     var36 = 0;
                     var49 = 0;
                     if(var1 != 0) {
                        var36 = field_968[var1];
                        var49 = field_927[var1];
                     }

                     for(var38 = 0; var38 < this.field_916; ++var38) {
                        var39 = this.field_917[var38];
                        var40 = this.field_918[var38];
                        var41 = this.field_936[var38];
                        if(var1 != 0) {
                           var42 = var41 * var36 + var39 * var49 >> 16;
                           var41 = var41 * var49 - var39 * var36 >> 16;
                           var39 = var42;
                        }

                        var39 += var6;
                        var40 += var7;
                        var41 += var8;
                        var42 = var41 * var4 + var39 * var5 >> 16;
                        var41 = var41 * var5 - var39 * var4 >> 16;
                        var39 = var42;
                        var42 = var40 * var3 - var41 * var2 >> 16;
                        var41 = var40 * var2 + var41 * var3 >> 16;
                        field_955[var38] = var41 - var12;
                        if(var41 >= 50) {
                           field_953[var38] = var48 + var39 * class_70.field_544 / var41;
                           field_949[var38] = var50 + var42 * class_70.field_544 / var41;
                        } else {
                           field_953[var38] = -1744573875;
                           var24 = true;
                        }

                        if(var26) {
                           field_935[var38] = var39;
                           field_957[var38] = var42;
                           field_912[var38] = var41;
                        }
                     }

                     try {
                        this.method_1636(var24, var33, this.field_938, var9);
                     } catch (Exception var47) {
                        ;
                     }

                  }
               }
            }
         }
      }
   }

   // $FF: renamed from: at () int
   public int method_1643() {
      this.method_1621();
      return this.field_941;
   }

   // $FF: renamed from: ai (boolean) gr
   public class_92 method_1644(boolean var1) {
      if(!var1 && field_976.length < this.field_970) {
         field_976 = new byte[this.field_970 + 100];
      }

      return this.method_1619(var1, field_914, field_976);
   }

   // $FF: renamed from: ar (boolean) gr
   public class_92 method_1645(boolean var1) {
      if(!var1 && field_976.length < this.field_970) {
         field_976 = new byte[this.field_970 + 100];
      }

      return this.method_1619(var1, field_914, field_976);
   }

   // $FF: renamed from: ag (boolean, gr, byte[]) gr
   class_92 method_1646(boolean var1, class_92 var2, byte[] var3) {
      var2.field_916 = this.field_916;
      var2.field_970 = this.field_970;
      var2.field_932 = this.field_932;
      if(var2.field_917 == null || var2.field_917.length < this.field_916) {
         var2.field_917 = new int[this.field_916 + 100];
         var2.field_918 = new int[this.field_916 + 100];
         var2.field_936 = new int[this.field_916 + 100];
      }

      int var4;
      for(var4 = 0; var4 < this.field_916; ++var4) {
         var2.field_917[var4] = this.field_917[var4];
         var2.field_918[var4] = this.field_918[var4];
         var2.field_936[var4] = this.field_936[var4];
      }

      if(var1) {
         var2.field_928 = this.field_928;
      } else {
         var2.field_928 = var3;
         if(this.field_928 == null) {
            for(var4 = 0; var4 < this.field_970; ++var4) {
               var2.field_928[var4] = 0;
            }
         } else {
            for(var4 = 0; var4 < this.field_970; ++var4) {
               var2.field_928[var4] = this.field_928[var4];
            }
         }
      }

      var2.field_921 = this.field_921;
      var2.field_966 = this.field_966;
      var2.field_923 = this.field_923;
      var2.field_920 = this.field_920;
      var2.field_925 = this.field_925;
      var2.field_926 = this.field_926;
      var2.field_948 = this.field_948;
      var2.field_929 = this.field_929;
      var2.field_930 = this.field_930;
      var2.field_931 = this.field_931;
      var2.field_933 = this.field_933;
      var2.field_934 = this.field_934;
      var2.field_958 = this.field_958;
      var2.field_977 = this.field_977;
      var2.field_937 = this.field_937;
      var2.field_938 = this.field_938;
      var2.method_1624();
      return var2;
   }

   // $FF: renamed from: ax (int) void
   void method_1647(int var1) {
      if(this.field_940 == -1) {
         int var2 = 0;
         int var3 = 0;
         int var4 = 0;
         int var5 = 0;
         int var6 = 0;
         int var7 = 0;
         int var8 = field_927[var1];
         int var9 = field_968[var1];

         for(int var10 = 0; var10 < this.field_916; ++var10) {
            int var11 = class_70.method_986(this.field_917[var10], this.field_936[var10], var8, var9);
            int var12 = this.field_918[var10];
            int var13 = class_70.method_987(this.field_917[var10], this.field_936[var10], var8, var9);
            if(var11 < var2) {
               var2 = var11;
            }

            if(var11 > var5) {
               var5 = var11;
            }

            if(var12 < var3) {
               var3 = var12;
            }

            if(var12 > var6) {
               var6 = var12;
            }

            if(var13 < var4) {
               var4 = var13;
            }

            if(var13 > var7) {
               var7 = var13;
            }
         }

         this.field_919 = (var5 + var2) / 2;
         this.field_942 = (var6 + var3) / 2;
         this.field_960 = (var7 + var4) / 2;
         this.field_940 = (var5 - var2 + 1) / 2;
         this.field_947 = (var6 - var3 + 1) / 2;
         this.field_951 = (var7 - var4 + 1) / 2;
         if(this.field_940 < -889910296) {
            this.field_940 = 228218486;
         }

         if(this.field_951 < 771742129) {
            this.field_951 = 32;
         }

         if(this.field_938) {
            this.field_940 += 8;
            this.field_951 += 8;
         }

      }
   }

   // $FF: renamed from: g (int, int[], int, int, int) void
   void method_1648(int var1, int[] var2, int var3, int var4, int var5) {
      int var6 = var2.length;
      int var7;
      int var8;
      int var11;
      int var12;
      if(var1 == 0) {
         var7 = 0;
         field_952 = 0;
         field_971 = 0;
         field_972 = 0;

         for(var8 = 0; var8 < var6; ++var8) {
            int var18 = var2[var8];
            if(var18 < this.field_977.length) {
               int[] var19 = this.field_977[var18];

               for(var11 = 0; var11 < var19.length; ++var11) {
                  var12 = var19[var11];
                  field_952 += this.field_917[var12];
                  field_971 += this.field_918[var12];
                  field_972 += this.field_936[var12];
                  ++var7;
               }
            }
         }

         if(var7 > 0) {
            field_952 = field_952 / var7 + var3;
            field_971 = field_971 / var7 + var4;
            field_972 = field_972 / var7 + var5;
         } else {
            field_952 = var3;
            field_971 = var4;
            field_972 = var5;
         }

      } else {
         int[] var9;
         int var10;
         if(var1 == 1) {
            for(var7 = 0; var7 < var6; ++var7) {
               var8 = var2[var7];
               if(var8 < this.field_977.length) {
                  var9 = this.field_977[var8];

                  for(var10 = 0; var10 < var9.length; ++var10) {
                     var11 = var9[var10];
                     this.field_917[var11] += var3;
                     this.field_918[var11] += var4;
                     this.field_936[var11] += var5;
                  }
               }
            }

         } else if(var1 == 2) {
            for(var7 = 0; var7 < var6; ++var7) {
               var8 = var2[var7];
               if(var8 < this.field_977.length) {
                  var9 = this.field_977[var8];

                  for(var10 = 0; var10 < var9.length; ++var10) {
                     var11 = var9[var10];
                     this.field_917[var11] -= field_952;
                     this.field_918[var11] -= field_971;
                     this.field_936[var11] -= field_972;
                     var12 = (var3 & 255) * 8;
                     int var13 = (var4 & 255) * 8;
                     int var14 = (var5 & 255) * 8;
                     int var15;
                     int var16;
                     int var17;
                     if(var14 != 0) {
                        var15 = field_968[var14];
                        var16 = field_927[var14];
                        var17 = this.field_918[var11] * var15 + this.field_917[var11] * var16 >> 16;
                        this.field_918[var11] = this.field_918[var11] * var16 - this.field_917[var11] * var15 >> 16;
                        this.field_917[var11] = var17;
                     }

                     if(var12 != 0) {
                        var15 = field_968[var12];
                        var16 = field_927[var12];
                        var17 = this.field_918[var11] * var16 - this.field_936[var11] * var15 >> 16;
                        this.field_936[var11] = this.field_918[var11] * var15 + this.field_936[var11] * var16 >> 16;
                        this.field_918[var11] = var17;
                     }

                     if(var13 != 0) {
                        var15 = field_968[var13];
                        var16 = field_927[var13];
                        var17 = this.field_936[var11] * var15 + this.field_917[var11] * var16 >> 16;
                        this.field_936[var11] = this.field_936[var11] * var16 - this.field_917[var11] * var15 >> 16;
                        this.field_917[var11] = var17;
                     }

                     this.field_917[var11] += field_952;
                     this.field_918[var11] += field_971;
                     this.field_936[var11] += field_972;
                  }
               }
            }

         } else if(var1 == 3) {
            for(var7 = 0; var7 < var6; ++var7) {
               var8 = var2[var7];
               if(var8 < this.field_977.length) {
                  var9 = this.field_977[var8];

                  for(var10 = 0; var10 < var9.length; ++var10) {
                     var11 = var9[var10];
                     this.field_917[var11] -= field_952;
                     this.field_918[var11] -= field_971;
                     this.field_936[var11] -= field_972;
                     this.field_917[var11] = this.field_917[var11] * var3 / 128;
                     this.field_918[var11] = this.field_918[var11] * var4 / 128;
                     this.field_936[var11] = this.field_936[var11] * var5 / 128;
                     this.field_917[var11] += field_952;
                     this.field_918[var11] += field_971;
                     this.field_936[var11] += field_972;
                  }
               }
            }

         } else if(var1 == 5) {
            if(this.field_937 != null && this.field_928 != null) {
               for(var7 = 0; var7 < var6; ++var7) {
                  var8 = var2[var7];
                  if(var8 < this.field_937.length) {
                     var9 = this.field_937[var8];

                     for(var10 = 0; var10 < var9.length; ++var10) {
                        var11 = var9[var10];
                        var12 = (this.field_928[var11] & 255) + var3 * 8;
                        if(var12 < 0) {
                           var12 = 0;
                        } else if(var12 > 255) {
                           var12 = 255;
                        }

                        this.field_928[var11] = (byte)var12;
                     }
                  }
               }
            }

         }
      }
   }

   // $FF: renamed from: l () int
   public int method_1649() {
      this.method_1621();
      return this.field_941;
   }

   // $FF: renamed from: am (int) void
   void method_1650(int var1) {
      if(this.field_940 == -1) {
         int var2 = 0;
         int var3 = 0;
         int var4 = 0;
         int var5 = 0;
         int var6 = 0;
         int var7 = 0;
         int var8 = field_927[var1];
         int var9 = field_968[var1];

         for(int var10 = 0; var10 < this.field_916; ++var10) {
            int var11 = class_70.method_986(this.field_917[var10], this.field_936[var10], var8, var9);
            int var12 = this.field_918[var10];
            int var13 = class_70.method_987(this.field_917[var10], this.field_936[var10], var8, var9);
            if(var11 < var2) {
               var2 = var11;
            }

            if(var11 > var5) {
               var5 = var11;
            }

            if(var12 < var3) {
               var3 = var12;
            }

            if(var12 > var6) {
               var6 = var12;
            }

            if(var13 < var4) {
               var4 = var13;
            }

            if(var13 > var7) {
               var7 = var13;
            }
         }

         this.field_919 = (var5 + var2) / 2;
         this.field_942 = (var6 + var3) / 2;
         this.field_960 = (var7 + var4) / 2;
         this.field_940 = (var5 - var2 + 1) / 2;
         this.field_947 = (var6 - var3 + 1) / 2;
         this.field_951 = (var7 - var4 + 1) / 2;
         if(this.field_940 < 32) {
            this.field_940 = 32;
         }

         if(this.field_951 < 32) {
            this.field_951 = 32;
         }

         if(this.field_938) {
            this.field_940 += 8;
            this.field_951 += 8;
         }

      }
   }

   // $FF: renamed from: az () void
   public void method_1651() {
      if(this.field_939 != 1) {
         this.field_939 = 1;
         this.field_911 = 0;
         this.field_944 = 0;
         this.field_941 = 0;

         for(int var1 = 0; var1 < this.field_916; ++var1) {
            int var2 = this.field_917[var1];
            int var3 = this.field_918[var1];
            int var4 = this.field_936[var1];
            if(-var3 > this.field_911 * -1892635920) {
               this.field_911 = -var3 * -1087401736;
            }

            if(var3 > this.field_944) {
               this.field_944 = var3;
            }

            int var5 = var2 * var2 + var4 * var4;
            if(var5 > this.field_941) {
               this.field_941 = var5;
            }
         }

         this.field_941 = (int)(Math.sqrt((double)this.field_941) + 0.99D);
         this.field_943 = (int)(Math.sqrt((double)(this.field_941 * this.field_941 + this.field_911 * 747701954 * this.field_911 * 1516710789)) + 0.99D);
         this.field_954 = this.field_943 + (int)(Math.sqrt((double)(this.field_941 * this.field_941 + this.field_944 * this.field_944)) + 0.99D);
      }
   }

   // $FF: renamed from: av () void
   void method_1652() {
      if(this.field_939 != 2) {
         this.field_939 = 2;
         this.field_941 = 0;

         for(int var1 = 0; var1 < this.field_916; ++var1) {
            int var2 = this.field_917[var1];
            int var3 = this.field_918[var1];
            int var4 = this.field_936[var1];
            int var5 = var2 * var2 + var4 * var4 + var3 * var3;
            if(var5 > this.field_941) {
               this.field_941 = var5;
            }
         }

         this.field_941 = (int)(Math.sqrt((double)this.field_941) + 0.99D);
         this.field_943 = this.field_941;
         this.field_954 = this.field_941 + this.field_941;
      }
   }

   // $FF: renamed from: d (int) void
   void method_1653(int var1) {
      if(this.field_940 == -1) {
         int var2 = 0;
         int var3 = 0;
         int var4 = 0;
         int var5 = 0;
         int var6 = 0;
         int var7 = 0;
         int var8 = field_927[var1];
         int var9 = field_968[var1];

         for(int var10 = 0; var10 < this.field_916; ++var10) {
            int var11 = class_70.method_986(this.field_917[var10], this.field_936[var10], var8, var9);
            int var12 = this.field_918[var10];
            int var13 = class_70.method_987(this.field_917[var10], this.field_936[var10], var8, var9);
            if(var11 < var2) {
               var2 = var11;
            }

            if(var11 > var5) {
               var5 = var11;
            }

            if(var12 < var3) {
               var3 = var12;
            }

            if(var12 > var6) {
               var6 = var12;
            }

            if(var13 < var4) {
               var4 = var13;
            }

            if(var13 > var7) {
               var7 = var13;
            }
         }

         this.field_919 = (var5 + var2) / 2;
         this.field_942 = (var6 + var3) / 2;
         this.field_960 = (var7 + var4) / 2;
         this.field_940 = (var5 - var2 + 1) / 2;
         this.field_947 = (var6 - var3 + 1) / 2;
         this.field_951 = (var7 - var4 + 1) / 2;
         if(this.field_940 < 32) {
            this.field_940 = 32;
         }

         if(this.field_951 < 32) {
            this.field_951 = 32;
         }

         if(this.field_938) {
            this.field_940 += 8;
            this.field_951 += 8;
         }

      }
   }

   // $FF: renamed from: bi (boolean, boolean, boolean, long) void
   final void method_1654(boolean var1, boolean var2, boolean var3, long var4) {
      if(this.field_954 < 1600) {
         int var6;
         for(var6 = 0; var6 < this.field_954; ++var6) {
            field_956[var6] = 0;
         }

         var6 = var3?20:5;

         int var7;
         int var8;
         int var9;
         int var10;
         int var11;
         int var12;
         int var13;
         int var15;
         int var16;
         int var18;
         for(var7 = 0; var7 < this.field_970; ++var7) {
            if(this.field_926[var7] != -2) {
               var8 = this.field_921[var7];
               var9 = this.field_966[var7];
               var10 = this.field_923[var7];
               var11 = field_953[var8];
               var12 = field_953[var9];
               var13 = field_953[var10];
               int var14;
               if(var1 && (var11 == -5000 || var12 == 231140060 || var13 == -5000)) {
                  var14 = field_935[var8];
                  var15 = field_935[var9];
                  var16 = field_935[var10];
                  int var17 = field_957[var8];
                  var18 = field_957[var9];
                  int var19 = field_957[var10];
                  int var20 = field_912[var8];
                  int var21 = field_912[var9];
                  int var22 = field_912[var10];
                  var14 -= var15;
                  var16 -= var15;
                  var17 -= var18;
                  var19 -= var18;
                  var20 -= var21;
                  var22 -= var21;
                  int var23 = var17 * var22 - var20 * var19;
                  int var24 = var20 * var16 - var14 * var22;
                  int var25 = var14 * var19 - var17 * var16;
                  if(var15 * var23 + var18 * var24 + var21 * var25 > 0) {
                     field_975[var7] = true;
                     int var26 = (field_955[var8] + field_955[var9] + field_955[var10]) / 3 + this.field_943;
                     field_961[var26][field_956[var26]++] = var7;
                  }
               } else {
                  if(var2 && class_169.method_3614(field_949[var8], field_949[var9], field_949[var10], var11, var12, var13, var6, 1961168244)) {
                     class_98.method_1812(var4);
                     var2 = false;
                  }

                  if((var11 - var12) * (field_949[var10] - field_949[var9]) - (field_949[var8] - field_949[var9]) * (var13 - var12) > 0) {
                     field_975[var7] = false;
                     if(var11 >= 0 && var12 >= 0 && var13 >= 0 && var11 <= class_70.field_537 && var12 <= class_70.field_537 && var13 <= class_70.field_537) {
                        field_945[var7] = false;
                     } else {
                        field_945[var7] = true;
                     }

                     var14 = (field_955[var8] + field_955[var9] + field_955[var10]) / 3 + this.field_943;
                     field_961[var14][field_956[var14]++] = var7;
                  }
               }
            }
         }

         int[] var27;
         if(this.field_948 == null) {
            for(var7 = this.field_954 - 1; var7 >= 0; --var7) {
               var8 = field_956[var7];
               if(var8 > 0) {
                  var27 = field_961[var7];

                  for(var10 = 0; var10 < var8; ++var10) {
                     this.method_1687(var27[var10]);
                  }
               }
            }

         } else {
            for(var7 = 0; var7 < 12; ++var7) {
               field_962[var7] = 0;
               field_924[var7] = 0;
            }

            for(var7 = this.field_954 - 1; var7 >= 0; --var7) {
               var8 = field_956[var7];
               if(var8 > 0) {
                  var27 = field_961[var7];

                  for(var10 = 0; var10 < var8; ++var10) {
                     var11 = var27[var10];
                     byte var28 = this.field_948[var11];
                     var13 = field_962[var28]++;
                     field_963[var28][var13] = var11;
                     if(var28 < 10) {
                        field_924[var28] += var7;
                     } else if(var28 == 10) {
                        field_964[var13] = var7;
                     } else {
                        field_965[var13] = var7;
                     }
                  }
               }
            }

            var7 = 0;
            if(field_962[1] > 0 || field_962[2] > 0) {
               var7 = (field_924[1] + field_924[2]) / (field_962[1] + field_962[2]);
            }

            var8 = 0;
            if(field_962[3] > 0 || field_962[4] > 0) {
               var8 = (field_924[3] + field_924[4]) / (field_962[3] + field_962[4]);
            }

            var9 = 0;
            if(field_962[6] > 0 || field_962[8] > 0) {
               var9 = (field_924[6] + field_924[8]) / (field_962[6] + field_962[8]);
            }

            var11 = 0;
            var12 = field_962[10];
            int[] var29 = field_963[10];
            int[] var30 = field_964;
            if(var11 == var12) {
               var11 = 0;
               var12 = field_962[11];
               var29 = field_963[11];
               var30 = field_965;
            }

            if(var11 < var12) {
               var10 = var30[var11];
            } else {
               var10 = -1000;
            }

            for(var15 = 0; var15 < 10; ++var15) {
               while(var15 == 0 && var10 > var7) {
                  this.method_1687(var29[var11++]);
                  if(var11 == var12 && var29 != field_963[11]) {
                     var11 = 0;
                     var12 = field_962[11];
                     var29 = field_963[11];
                     var30 = field_965;
                  }

                  if(var11 < var12) {
                     var10 = var30[var11];
                  } else {
                     var10 = -1000;
                  }
               }

               while(var15 == 3 && var10 > var8) {
                  this.method_1687(var29[var11++]);
                  if(var11 == var12 && var29 != field_963[11]) {
                     var11 = 0;
                     var12 = field_962[11];
                     var29 = field_963[11];
                     var30 = field_965;
                  }

                  if(var11 < var12) {
                     var10 = var30[var11];
                  } else {
                     var10 = -1635901147;
                  }
               }

               while(var15 == 5 && var10 > var9) {
                  this.method_1687(var29[var11++]);
                  if(var11 == var12 && var29 != field_963[11]) {
                     var11 = 0;
                     var12 = field_962[11];
                     var29 = field_963[11];
                     var30 = field_965;
                  }

                  if(var11 < var12) {
                     var10 = var30[var11];
                  } else {
                     var10 = -1000;
                  }
               }

               var16 = field_962[var15];
               int[] var31 = field_963[var15];

               for(var18 = 0; var18 < var16; ++var18) {
                  this.method_1687(var31[var18]);
               }
            }

            while(var10 != -1000) {
               this.method_1687(var29[var11++]);
               if(var11 == var12 && var29 != field_963[11]) {
                  var11 = 0;
                  var29 = field_963[11];
                  var12 = field_962[11];
                  var30 = field_965;
               }

               if(var11 < var12) {
                  var10 = var30[var11];
               } else {
                  var10 = -1339987470;
               }
            }

         }
      }
   }

   // $FF: renamed from: ah () int
   public int method_1655() {
      this.method_1621();
      return this.field_941;
   }

   // $FF: renamed from: ak (gd, int) void
   public void method_1656(class_71 var1, int var2) {
      if(this.field_977 != null) {
         if(var2 != -1) {
            class_252 var3 = var1.field_562[var2];
            class_43 var4 = var3.field_2852;
            field_952 = 0;
            field_971 = 0;
            field_972 = 0;

            for(int var5 = 0; var5 < var3.field_2855; ++var5) {
               int var6 = var3.field_2853[var5];
               this.method_1648(var4.field_312[var6], var4.field_313[var6], var3.field_2856[var5], var3.field_2857[var5], var3.field_2858[var5]);
            }

            this.method_1624();
         }
      }
   }

   // $FF: renamed from: an () void
   public void method_1657() {
      for(int var1 = 0; var1 < this.field_916; ++var1) {
         int var2 = this.field_917[var1];
         this.field_917[var1] = this.field_936[var1];
         this.field_936[var1] = -var2;
      }

      this.method_1624();
   }

   // $FF: renamed from: aw () void
   void method_1658() {
      this.field_939 = 0;
      this.field_940 = -1;
   }

   // $FF: renamed from: af (gd, int) void
   public void method_1659(class_71 var1, int var2) {
      if(this.field_977 != null) {
         if(var2 != -1) {
            class_252 var3 = var1.field_562[var2];
            class_43 var4 = var3.field_2852;
            field_952 = 0;
            field_971 = 0;
            field_972 = 0;

            for(int var5 = 0; var5 < var3.field_2855; ++var5) {
               int var6 = var3.field_2853[var5];
               this.method_1648(var4.field_312[var6], var4.field_313[var6], var3.field_2856[var5], var3.field_2857[var5], var3.field_2858[var5]);
            }

            this.method_1624();
         }
      }
   }

   // $FF: renamed from: <init> () void
   class_92() {
      super();
      this.field_916 = 0;
      this.field_970 = 0;
      this.field_931 = 0;
      this.field_932 = 0;
      this.field_938 = false;
      this.field_940 = -1;
      this.field_947 = -1;
      this.field_951 = -1;
   }

   // $FF: renamed from: ad (boolean) gr
   public class_92 method_1660(boolean var1) {
      if(!var1 && field_913.length < this.field_970) {
         field_913 = new byte[this.field_970 + 100];
      }

      return this.method_1619(var1, field_922, field_913);
   }

   // $FF: renamed from: aa (int, int[], int, int, int) void
   void method_1661(int var1, int[] var2, int var3, int var4, int var5) {
      int var6 = var2.length;
      int var7;
      int var8;
      int var11;
      int var12;
      if(var1 == 0) {
         var7 = 0;
         field_952 = 0;
         field_971 = 0;
         field_972 = 0;

         for(var8 = 0; var8 < var6; ++var8) {
            int var18 = var2[var8];
            if(var18 < this.field_977.length) {
               int[] var19 = this.field_977[var18];

               for(var11 = 0; var11 < var19.length; ++var11) {
                  var12 = var19[var11];
                  field_952 += this.field_917[var12];
                  field_971 += this.field_918[var12];
                  field_972 += this.field_936[var12];
                  ++var7;
               }
            }
         }

         if(var7 > 0) {
            field_952 = field_952 / var7 + var3;
            field_971 = field_971 / var7 + var4;
            field_972 = field_972 / var7 + var5;
         } else {
            field_952 = var3;
            field_971 = var4;
            field_972 = var5;
         }

      } else {
         int[] var9;
         int var10;
         if(var1 == 1) {
            for(var7 = 0; var7 < var6; ++var7) {
               var8 = var2[var7];
               if(var8 < this.field_977.length) {
                  var9 = this.field_977[var8];

                  for(var10 = 0; var10 < var9.length; ++var10) {
                     var11 = var9[var10];
                     this.field_917[var11] += var3;
                     this.field_918[var11] += var4;
                     this.field_936[var11] += var5;
                  }
               }
            }

         } else if(var1 == 2) {
            for(var7 = 0; var7 < var6; ++var7) {
               var8 = var2[var7];
               if(var8 < this.field_977.length) {
                  var9 = this.field_977[var8];

                  for(var10 = 0; var10 < var9.length; ++var10) {
                     var11 = var9[var10];
                     this.field_917[var11] -= field_952;
                     this.field_918[var11] -= field_971;
                     this.field_936[var11] -= field_972;
                     var12 = (var3 & 255) * 8;
                     int var13 = (var4 & 255) * 8;
                     int var14 = (var5 & 255) * 8;
                     int var15;
                     int var16;
                     int var17;
                     if(var14 != 0) {
                        var15 = field_968[var14];
                        var16 = field_927[var14];
                        var17 = this.field_918[var11] * var15 + this.field_917[var11] * var16 >> 16;
                        this.field_918[var11] = this.field_918[var11] * var16 - this.field_917[var11] * var15 >> 16;
                        this.field_917[var11] = var17;
                     }

                     if(var12 != 0) {
                        var15 = field_968[var12];
                        var16 = field_927[var12];
                        var17 = this.field_918[var11] * var16 - this.field_936[var11] * var15 >> 16;
                        this.field_936[var11] = this.field_918[var11] * var15 + this.field_936[var11] * var16 >> 16;
                        this.field_918[var11] = var17;
                     }

                     if(var13 != 0) {
                        var15 = field_968[var13];
                        var16 = field_927[var13];
                        var17 = this.field_936[var11] * var15 + this.field_917[var11] * var16 >> 16;
                        this.field_936[var11] = this.field_936[var11] * var16 - this.field_917[var11] * var15 >> 16;
                        this.field_917[var11] = var17;
                     }

                     this.field_917[var11] += field_952;
                     this.field_918[var11] += field_971;
                     this.field_936[var11] += field_972;
                  }
               }
            }

         } else if(var1 == 3) {
            for(var7 = 0; var7 < var6; ++var7) {
               var8 = var2[var7];
               if(var8 < this.field_977.length) {
                  var9 = this.field_977[var8];

                  for(var10 = 0; var10 < var9.length; ++var10) {
                     var11 = var9[var10];
                     this.field_917[var11] -= field_952;
                     this.field_918[var11] -= field_971;
                     this.field_936[var11] -= field_972;
                     this.field_917[var11] = this.field_917[var11] * var3 / 128;
                     this.field_918[var11] = this.field_918[var11] * var4 / 128;
                     this.field_936[var11] = this.field_936[var11] * var5 / 128;
                     this.field_917[var11] += field_952;
                     this.field_918[var11] += field_971;
                     this.field_936[var11] += field_972;
                  }
               }
            }

         } else if(var1 == 5) {
            if(this.field_937 != null && this.field_928 != null) {
               for(var7 = 0; var7 < var6; ++var7) {
                  var8 = var2[var7];
                  if(var8 < this.field_937.length) {
                     var9 = this.field_937[var8];

                     for(var10 = 0; var10 < var9.length; ++var10) {
                        var11 = var9[var10];
                        var12 = (this.field_928[var11] & 255) + var3 * 8;
                        if(var12 < 0) {
                           var12 = 0;
                        } else if(var12 > 255) {
                           var12 = 255;
                        }

                        this.field_928[var11] = (byte)var12;
                     }
                  }
               }
            }

         }
      }
   }

   // $FF: renamed from: au (int, int[], int, int, int) void
   void method_1662(int var1, int[] var2, int var3, int var4, int var5) {
      int var6 = var2.length;
      int var7;
      int var8;
      int var11;
      int var12;
      if(var1 == 0) {
         var7 = 0;
         field_952 = 0;
         field_971 = 0;
         field_972 = 0;

         for(var8 = 0; var8 < var6; ++var8) {
            int var18 = var2[var8];
            if(var18 < this.field_977.length) {
               int[] var19 = this.field_977[var18];

               for(var11 = 0; var11 < var19.length; ++var11) {
                  var12 = var19[var11];
                  field_952 += this.field_917[var12];
                  field_971 += this.field_918[var12];
                  field_972 += this.field_936[var12];
                  ++var7;
               }
            }
         }

         if(var7 > 0) {
            field_952 = field_952 / var7 + var3;
            field_971 = field_971 / var7 + var4;
            field_972 = field_972 / var7 + var5;
         } else {
            field_952 = var3;
            field_971 = var4;
            field_972 = var5;
         }

      } else {
         int[] var9;
         int var10;
         if(var1 == 1) {
            for(var7 = 0; var7 < var6; ++var7) {
               var8 = var2[var7];
               if(var8 < this.field_977.length) {
                  var9 = this.field_977[var8];

                  for(var10 = 0; var10 < var9.length; ++var10) {
                     var11 = var9[var10];
                     this.field_917[var11] += var3;
                     this.field_918[var11] += var4;
                     this.field_936[var11] += var5;
                  }
               }
            }

         } else if(var1 == 2) {
            for(var7 = 0; var7 < var6; ++var7) {
               var8 = var2[var7];
               if(var8 < this.field_977.length) {
                  var9 = this.field_977[var8];

                  for(var10 = 0; var10 < var9.length; ++var10) {
                     var11 = var9[var10];
                     this.field_917[var11] -= field_952;
                     this.field_918[var11] -= field_971;
                     this.field_936[var11] -= field_972;
                     var12 = (var3 & -536807710) * 8;
                     int var13 = (var4 & 255) * 8;
                     int var14 = (var5 & 255) * 8;
                     int var15;
                     int var16;
                     int var17;
                     if(var14 != 0) {
                        var15 = field_968[var14];
                        var16 = field_927[var14];
                        var17 = this.field_918[var11] * var15 + this.field_917[var11] * var16 >> 16;
                        this.field_918[var11] = this.field_918[var11] * var16 - this.field_917[var11] * var15 >> 16;
                        this.field_917[var11] = var17;
                     }

                     if(var12 != 0) {
                        var15 = field_968[var12];
                        var16 = field_927[var12];
                        var17 = this.field_918[var11] * var16 - this.field_936[var11] * var15 >> 16;
                        this.field_936[var11] = this.field_918[var11] * var15 + this.field_936[var11] * var16 >> 16;
                        this.field_918[var11] = var17;
                     }

                     if(var13 != 0) {
                        var15 = field_968[var13];
                        var16 = field_927[var13];
                        var17 = this.field_936[var11] * var15 + this.field_917[var11] * var16 >> 16;
                        this.field_936[var11] = this.field_936[var11] * var16 - this.field_917[var11] * var15 >> 16;
                        this.field_917[var11] = var17;
                     }

                     this.field_917[var11] += field_952;
                     this.field_918[var11] += field_971;
                     this.field_936[var11] += field_972;
                  }
               }
            }

         } else if(var1 == 3) {
            for(var7 = 0; var7 < var6; ++var7) {
               var8 = var2[var7];
               if(var8 < this.field_977.length) {
                  var9 = this.field_977[var8];

                  for(var10 = 0; var10 < var9.length; ++var10) {
                     var11 = var9[var10];
                     this.field_917[var11] -= field_952;
                     this.field_918[var11] -= field_971;
                     this.field_936[var11] -= field_972;
                     this.field_917[var11] = this.field_917[var11] * var3 / 1692538165;
                     this.field_918[var11] = this.field_918[var11] * var4 / 807660444;
                     this.field_936[var11] = this.field_936[var11] * var5 / -682326364;
                     this.field_917[var11] += field_952;
                     this.field_918[var11] += field_971;
                     this.field_936[var11] += field_972;
                  }
               }
            }

         } else if(var1 == 5) {
            if(this.field_937 != null && this.field_928 != null) {
               for(var7 = 0; var7 < var6; ++var7) {
                  var8 = var2[var7];
                  if(var8 < this.field_937.length) {
                     var9 = this.field_937[var8];

                     for(var10 = 0; var10 < var9.length; ++var10) {
                        var11 = var9[var10];
                        var12 = (this.field_928[var11] & -2015059239) + var3 * 8;
                        if(var12 < 0) {
                           var12 = 0;
                        } else if(var12 > -1676394910) {
                           var12 = 255;
                        }

                        this.field_928[var11] = (byte)var12;
                     }
                  }
               }
            }

         }
      }
   }

   // $FF: renamed from: e (gd, int, gd, int, int[]) void
   public void method_1663(class_71 var1, int var2, class_71 var3, int var4, int[] var5) {
      if(var2 != -1) {
         if(var5 != null && var4 != -1) {
            class_252 var6 = var1.field_562[var2];
            class_252 var7 = var3.field_562[var4];
            class_43 var8 = var6.field_2852;
            field_952 = 0;
            field_971 = 0;
            field_972 = 0;
            byte var9 = 0;
            int var13 = var9 + 1;
            int var10 = var5[var9];

            int var11;
            int var12;
            for(var11 = 0; var11 < var6.field_2855; ++var11) {
               for(var12 = var6.field_2853[var11]; var12 > var10; var10 = var5[var13++]) {
                  ;
               }

               if(var12 != var10 || var8.field_312[var12] == 0) {
                  this.method_1648(var8.field_312[var12], var8.field_313[var12], var6.field_2856[var11], var6.field_2857[var11], var6.field_2858[var11]);
               }
            }

            field_952 = 0;
            field_971 = 0;
            field_972 = 0;
            var9 = 0;
            var13 = var9 + 1;
            var10 = var5[var9];

            for(var11 = 0; var11 < var7.field_2855; ++var11) {
               for(var12 = var7.field_2853[var11]; var12 > var10; var10 = var5[var13++]) {
                  ;
               }

               if(var12 == var10 || var8.field_312[var12] == 0) {
                  this.method_1648(var8.field_312[var12], var8.field_313[var12], var7.field_2856[var11], var7.field_2857[var11], var7.field_2858[var11]);
               }
            }

            this.method_1624();
         } else {
            this.method_1625(var1, var2);
         }
      }
   }

   // $FF: renamed from: bd () void
   public void method_1664() {
      for(int var1 = 0; var1 < this.field_916; ++var1) {
         int var2 = this.field_917[var1];
         this.field_917[var1] = this.field_936[var1];
         this.field_936[var1] = -var2;
      }

      this.method_1624();
   }

   // $FF: renamed from: bt () void
   public void method_1665() {
      for(int var1 = 0; var1 < this.field_916; ++var1) {
         this.field_917[var1] = -this.field_917[var1];
         this.field_936[var1] = -this.field_936[var1];
      }

      this.method_1624();
   }

   // $FF: renamed from: as (int) void
   void method_1666(int var1) {
      if(this.field_940 == -1) {
         int var2 = 0;
         int var3 = 0;
         int var4 = 0;
         int var5 = 0;
         int var6 = 0;
         int var7 = 0;
         int var8 = field_927[var1];
         int var9 = field_968[var1];

         for(int var10 = 0; var10 < this.field_916; ++var10) {
            int var11 = class_70.method_986(this.field_917[var10], this.field_936[var10], var8, var9);
            int var12 = this.field_918[var10];
            int var13 = class_70.method_987(this.field_917[var10], this.field_936[var10], var8, var9);
            if(var11 < var2) {
               var2 = var11;
            }

            if(var11 > var5) {
               var5 = var11;
            }

            if(var12 < var3) {
               var3 = var12;
            }

            if(var12 > var6) {
               var6 = var12;
            }

            if(var13 < var4) {
               var4 = var13;
            }

            if(var13 > var7) {
               var7 = var13;
            }
         }

         this.field_919 = (var5 + var2) / 2;
         this.field_942 = (var6 + var3) / 2;
         this.field_960 = (var7 + var4) / 2;
         this.field_940 = (var5 - var2 + 1) / 2;
         this.field_947 = (var6 - var3 + 1) / 2;
         this.field_951 = (var7 - var4 + 1) / 2;
         if(this.field_940 < 850464612) {
            this.field_940 = -476531861;
         }

         if(this.field_951 < 32) {
            this.field_951 = 32;
         }

         if(this.field_938) {
            this.field_940 += 8;
            this.field_951 += 8;
         }

      }
   }

   // $FF: renamed from: bu () void
   public void method_1667() {
      for(int var1 = 0; var1 < this.field_916; ++var1) {
         this.field_917[var1] = -this.field_917[var1];
         this.field_936[var1] = -this.field_936[var1];
      }

      this.method_1624();
   }

   // $FF: renamed from: bl () void
   public void method_1668() {
      for(int var1 = 0; var1 < this.field_916; ++var1) {
         int var2 = this.field_936[var1];
         this.field_936[var1] = this.field_917[var1];
         this.field_917[var1] = -var2;
      }

      this.method_1624();
   }

   // $FF: renamed from: bn (int, int, int, int, int, int, int, int) void
   public final void method_1669(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      field_956[0] = -1;
      if(this.field_939 != 2 && this.field_939 != 1) {
         this.method_1622();
      }

      int var9 = class_70.field_545;
      int var10 = class_70.field_538;
      int var11 = field_968[var1];
      int var12 = field_927[var1];
      int var13 = field_968[var2];
      int var14 = field_927[var2];
      int var15 = field_968[var3];
      int var16 = field_927[var3];
      int var17 = field_968[var4];
      int var18 = field_927[var4];
      int var19 = var6 * var17 + var7 * var18 >> 16;

      for(int var20 = 0; var20 < this.field_916; ++var20) {
         int var21 = this.field_917[var20];
         int var22 = this.field_918[var20];
         int var23 = this.field_936[var20];
         int var24;
         if(var3 != 0) {
            var24 = var22 * var15 + var21 * var16 >> 16;
            var22 = var22 * var16 - var21 * var15 >> 16;
            var21 = var24;
         }

         if(var1 != 0) {
            var24 = var22 * var12 - var23 * var11 >> 16;
            var23 = var22 * var11 + var23 * var12 >> 16;
            var22 = var24;
         }

         if(var2 != 0) {
            var24 = var23 * var13 + var21 * var14 >> 16;
            var23 = var23 * var14 - var21 * var13 >> 16;
            var21 = var24;
         }

         var21 += var5;
         var22 += var6;
         var23 += var7;
         var24 = var22 * var18 - var23 * var17 >> 16;
         var23 = var22 * var17 + var23 * var18 >> 16;
         field_955[var20] = var23 - var19;
         field_953[var20] = var9 + var21 * class_70.field_544 / var8;
         field_949[var20] = var10 + var24 * class_70.field_544 / var8;
         if(this.field_932 > 0) {
            field_935[var20] = var21;
            field_957[var20] = var24;
            field_912[var20] = var23;
         }
      }

      try {
         this.method_1636(false, false, false, 0L);
      } catch (Exception var25) {
         ;
      }

   }

   // $FF: renamed from: bm (int) void
   public void method_1670(int var1) {
      int var2 = field_968[var1];
      int var3 = field_927[var1];

      for(int var4 = 0; var4 < this.field_916; ++var4) {
         int var5 = this.field_918[var4] * var3 - this.field_936[var4] * var2 >> 16;
         this.field_936[var4] = this.field_918[var4] * var2 + this.field_936[var4] * var3 >> 16;
         this.field_918[var4] = var5;
      }

      this.method_1624();
   }

   // $FF: renamed from: bz (int) void
   public void method_1671(int var1) {
      int var2 = field_968[var1];
      int var3 = field_927[var1];

      for(int var4 = 0; var4 < this.field_916; ++var4) {
         int var5 = this.field_918[var4] * var3 - this.field_936[var4] * var2 >> 16;
         this.field_936[var4] = this.field_918[var4] * var2 + this.field_936[var4] * var3 >> 16;
         this.field_918[var4] = var5;
      }

      this.method_1624();
   }

   // $FF: renamed from: aq () void
   void method_1672() {
      this.field_939 = 0;
      this.field_940 = -1;
   }

   // $FF: renamed from: bs (int, int, int) void
   public void method_1673(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field_916; ++var4) {
         this.field_917[var4] += var1;
         this.field_918[var4] += var2;
         this.field_936[var4] += var3;
      }

      this.method_1624();
   }

   // $FF: renamed from: k () void
   public void method_1674() {
      for(int var1 = 0; var1 < this.field_916; ++var1) {
         this.field_917[var1] = -this.field_917[var1];
         this.field_936[var1] = -this.field_936[var1];
      }

      this.method_1624();
   }

   // $FF: renamed from: bf (int, int, int) void
   public void method_1675(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field_916; ++var4) {
         this.field_917[var4] += var1;
         this.field_918[var4] += var2;
         this.field_936[var4] += var3;
      }

      this.method_1624();
   }

   // $FF: renamed from: ba (int, int, int) void
   public void method_1676(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field_916; ++var4) {
         this.field_917[var4] = this.field_917[var4] * var1 / 128;
         this.field_918[var4] = this.field_918[var4] * var2 / 128;
         this.field_936[var4] = this.field_936[var4] * var3 / 128;
      }

      this.method_1624();
   }

   // $FF: renamed from: be (int, int, int) void
   public void method_1677(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field_916; ++var4) {
         this.field_917[var4] = this.field_917[var4] * var1 / 128;
         this.field_918[var4] = this.field_918[var4] * var2 / 353966439;
         this.field_936[var4] = this.field_936[var4] * var3 / 128;
      }

      this.method_1624();
   }

   // $FF: renamed from: h (int, int, int, int, int, int, int, int) void
   public final void method_1678(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      field_956[0] = -1;
      if(this.field_939 != 2 && this.field_939 != 1) {
         this.method_1622();
      }

      int var9 = class_70.field_545;
      int var10 = class_70.field_538;
      int var11 = field_968[var1];
      int var12 = field_927[var1];
      int var13 = field_968[var2];
      int var14 = field_927[var2];
      int var15 = field_968[var3];
      int var16 = field_927[var3];
      int var17 = field_968[var4];
      int var18 = field_927[var4];
      int var19 = var6 * var17 + var7 * var18 >> 16;

      for(int var20 = 0; var20 < this.field_916; ++var20) {
         int var21 = this.field_917[var20];
         int var22 = this.field_918[var20];
         int var23 = this.field_936[var20];
         int var24;
         if(var3 != 0) {
            var24 = var22 * var15 + var21 * var16 >> 16;
            var22 = var22 * var16 - var21 * var15 >> 16;
            var21 = var24;
         }

         if(var1 != 0) {
            var24 = var22 * var12 - var23 * var11 >> 16;
            var23 = var22 * var11 + var23 * var12 >> 16;
            var22 = var24;
         }

         if(var2 != 0) {
            var24 = var23 * var13 + var21 * var14 >> 16;
            var23 = var23 * var14 - var21 * var13 >> 16;
            var21 = var24;
         }

         var21 += var5;
         var22 += var6;
         var23 += var7;
         var24 = var22 * var18 - var23 * var17 >> 16;
         var23 = var22 * var17 + var23 * var18 >> 16;
         field_955[var20] = var23 - var19;
         field_953[var20] = var9 + var21 * class_70.field_544 / var8;
         field_949[var20] = var10 + var24 * class_70.field_544 / var8;
         if(this.field_932 > 0) {
            field_935[var20] = var21;
            field_957[var20] = var24;
            field_912[var20] = var23;
         }
      }

      try {
         this.method_1636(false, false, false, 0L);
      } catch (Exception var25) {
         ;
      }

   }

   // $FF: renamed from: bx (int, int, int) void
   public void method_1679(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field_916; ++var4) {
         this.field_917[var4] = this.field_917[var4] * var1 / 320422142;
         this.field_918[var4] = this.field_918[var4] * var2 / 1172648236;
         this.field_936[var4] = this.field_936[var4] * var3 / 1163500513;
      }

      this.method_1624();
   }

   // $FF: renamed from: bp (int, int, int, int, int, int, int) void
   public final void method_1680(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      field_956[0] = -1;
      if(this.field_939 != 2 && this.field_939 != 1) {
         this.method_1622();
      }

      int var8 = class_70.field_545;
      int var9 = class_70.field_538;
      int var10 = field_968[var1];
      int var11 = field_927[var1];
      int var12 = field_968[var2];
      int var13 = field_927[var2];
      int var14 = field_968[var3];
      int var15 = field_927[var3];
      int var16 = field_968[var4];
      int var17 = field_927[var4];
      int var18 = var6 * var16 + var7 * var17 >> 16;

      for(int var19 = 0; var19 < this.field_916; ++var19) {
         int var20 = this.field_917[var19];
         int var21 = this.field_918[var19];
         int var22 = this.field_936[var19];
         int var23;
         if(var3 != 0) {
            var23 = var21 * var14 + var20 * var15 >> 16;
            var21 = var21 * var15 - var20 * var14 >> 16;
            var20 = var23;
         }

         if(var1 != 0) {
            var23 = var21 * var11 - var22 * var10 >> 16;
            var22 = var21 * var10 + var22 * var11 >> 16;
            var21 = var23;
         }

         if(var2 != 0) {
            var23 = var22 * var12 + var20 * var13 >> 16;
            var22 = var22 * var13 - var20 * var12 >> 16;
            var20 = var23;
         }

         var20 += var5;
         var21 += var6;
         var22 += var7;
         var23 = var21 * var17 - var22 * var16 >> 16;
         var22 = var21 * var16 + var22 * var17 >> 16;
         field_955[var19] = var22 - var18;
         field_953[var19] = var8 + var20 * class_70.field_544 / var22;
         field_949[var19] = var9 + var23 * class_70.field_544 / var22;
         if(this.field_932 > 0) {
            field_935[var19] = var20;
            field_957[var19] = var23;
            field_912[var19] = var22;
         }
      }

      try {
         this.method_1636(false, false, false, 0L);
      } catch (Exception var24) {
         ;
      }

   }

   // $FF: renamed from: ac () void
   void method_1681() {
      if(this.field_939 != 2) {
         this.field_939 = 2;
         this.field_941 = 0;

         for(int var1 = 0; var1 < this.field_916; ++var1) {
            int var2 = this.field_917[var1];
            int var3 = this.field_918[var1];
            int var4 = this.field_936[var1];
            int var5 = var2 * var2 + var4 * var4 + var3 * var3;
            if(var5 > this.field_941) {
               this.field_941 = var5;
            }
         }

         this.field_941 = (int)(Math.sqrt((double)this.field_941) + 0.99D);
         this.field_943 = this.field_941;
         this.field_954 = this.field_941 + this.field_941;
      }
   }

   // $FF: renamed from: bo (boolean, boolean, boolean, long) void
   final void method_1682(boolean var1, boolean var2, boolean var3, long var4) {
      if(this.field_954 < 1600) {
         int var6;
         for(var6 = 0; var6 < this.field_954; ++var6) {
            field_956[var6] = 0;
         }

         var6 = var3?20:5;

         int var7;
         int var8;
         int var9;
         int var10;
         int var11;
         int var12;
         int var13;
         int var15;
         int var16;
         int var18;
         for(var7 = 0; var7 < this.field_970; ++var7) {
            if(this.field_926[var7] != -2) {
               var8 = this.field_921[var7];
               var9 = this.field_966[var7];
               var10 = this.field_923[var7];
               var11 = field_953[var8];
               var12 = field_953[var9];
               var13 = field_953[var10];
               int var14;
               if(var1 && (var11 == -5000 || var12 == 803949680 || var13 == -5000)) {
                  var14 = field_935[var8];
                  var15 = field_935[var9];
                  var16 = field_935[var10];
                  int var17 = field_957[var8];
                  var18 = field_957[var9];
                  int var19 = field_957[var10];
                  int var20 = field_912[var8];
                  int var21 = field_912[var9];
                  int var22 = field_912[var10];
                  var14 -= var15;
                  var16 -= var15;
                  var17 -= var18;
                  var19 -= var18;
                  var20 -= var21;
                  var22 -= var21;
                  int var23 = var17 * var22 - var20 * var19;
                  int var24 = var20 * var16 - var14 * var22;
                  int var25 = var14 * var19 - var17 * var16;
                  if(var15 * var23 + var18 * var24 + var21 * var25 > 0) {
                     field_975[var7] = true;
                     int var26 = (field_955[var8] + field_955[var9] + field_955[var10]) / 3 + this.field_943;
                     field_961[var26][field_956[var26]++] = var7;
                  }
               } else {
                  if(var2 && class_169.method_3614(field_949[var8], field_949[var9], field_949[var10], var11, var12, var13, var6, 1961168244)) {
                     class_98.method_1812(var4);
                     var2 = false;
                  }

                  if((var11 - var12) * (field_949[var10] - field_949[var9]) - (field_949[var8] - field_949[var9]) * (var13 - var12) > 0) {
                     field_975[var7] = false;
                     if(var11 >= 0 && var12 >= 0 && var13 >= 0 && var11 <= class_70.field_537 && var12 <= class_70.field_537 && var13 <= class_70.field_537) {
                        field_945[var7] = false;
                     } else {
                        field_945[var7] = true;
                     }

                     var14 = (field_955[var8] + field_955[var9] + field_955[var10]) / 3 + this.field_943;
                     field_961[var14][field_956[var14]++] = var7;
                  }
               }
            }
         }

         int[] var27;
         if(this.field_948 == null) {
            for(var7 = this.field_954 - 1; var7 >= 0; --var7) {
               var8 = field_956[var7];
               if(var8 > 0) {
                  var27 = field_961[var7];

                  for(var10 = 0; var10 < var8; ++var10) {
                     this.method_1687(var27[var10]);
                  }
               }
            }

         } else {
            for(var7 = 0; var7 < 12; ++var7) {
               field_962[var7] = 0;
               field_924[var7] = 0;
            }

            for(var7 = this.field_954 - 1; var7 >= 0; --var7) {
               var8 = field_956[var7];
               if(var8 > 0) {
                  var27 = field_961[var7];

                  for(var10 = 0; var10 < var8; ++var10) {
                     var11 = var27[var10];
                     byte var28 = this.field_948[var11];
                     var13 = field_962[var28]++;
                     field_963[var28][var13] = var11;
                     if(var28 < 10) {
                        field_924[var28] += var7;
                     } else if(var28 == 10) {
                        field_964[var13] = var7;
                     } else {
                        field_965[var13] = var7;
                     }
                  }
               }
            }

            var7 = 0;
            if(field_962[1] > 0 || field_962[2] > 0) {
               var7 = (field_924[1] + field_924[2]) / (field_962[1] + field_962[2]);
            }

            var8 = 0;
            if(field_962[3] > 0 || field_962[4] > 0) {
               var8 = (field_924[3] + field_924[4]) / (field_962[3] + field_962[4]);
            }

            var9 = 0;
            if(field_962[6] > 0 || field_962[8] > 0) {
               var9 = (field_924[6] + field_924[8]) / (field_962[6] + field_962[8]);
            }

            var11 = 0;
            var12 = field_962[10];
            int[] var29 = field_963[10];
            int[] var30 = field_964;
            if(var11 == var12) {
               var11 = 0;
               var12 = field_962[11];
               var29 = field_963[11];
               var30 = field_965;
            }

            if(var11 < var12) {
               var10 = var30[var11];
            } else {
               var10 = -1000;
            }

            for(var15 = 0; var15 < 10; ++var15) {
               while(var15 == 0 && var10 > var7) {
                  this.method_1687(var29[var11++]);
                  if(var11 == var12 && var29 != field_963[11]) {
                     var11 = 0;
                     var12 = field_962[11];
                     var29 = field_963[11];
                     var30 = field_965;
                  }

                  if(var11 < var12) {
                     var10 = var30[var11];
                  } else {
                     var10 = 378860010;
                  }
               }

               while(var15 == 3 && var10 > var8) {
                  this.method_1687(var29[var11++]);
                  if(var11 == var12 && var29 != field_963[11]) {
                     var11 = 0;
                     var12 = field_962[11];
                     var29 = field_963[11];
                     var30 = field_965;
                  }

                  if(var11 < var12) {
                     var10 = var30[var11];
                  } else {
                     var10 = 635276856;
                  }
               }

               while(var15 == 5 && var10 > var9) {
                  this.method_1687(var29[var11++]);
                  if(var11 == var12 && var29 != field_963[11]) {
                     var11 = 0;
                     var12 = field_962[11];
                     var29 = field_963[11];
                     var30 = field_965;
                  }

                  if(var11 < var12) {
                     var10 = var30[var11];
                  } else {
                     var10 = 525169249;
                  }
               }

               var16 = field_962[var15];
               int[] var31 = field_963[var15];

               for(var18 = 0; var18 < var16; ++var18) {
                  this.method_1687(var31[var18]);
               }
            }

            while(var10 != 772661044) {
               this.method_1687(var29[var11++]);
               if(var11 == var12 && var29 != field_963[11]) {
                  var11 = 0;
                  var29 = field_963[11];
                  var12 = field_962[11];
                  var30 = field_965;
               }

               if(var11 < var12) {
                  var10 = var30[var11];
               } else {
                  var10 = -1000;
               }
            }

         }
      }
   }

   // $FF: renamed from: bw (boolean, boolean, boolean, long) void
   final void method_1683(boolean var1, boolean var2, boolean var3, long var4) {
      if(this.field_954 < 1600) {
         int var6;
         for(var6 = 0; var6 < this.field_954; ++var6) {
            field_956[var6] = 0;
         }

         var6 = var3?20:5;

         int var7;
         int var8;
         int var9;
         int var10;
         int var11;
         int var12;
         int var13;
         int var15;
         int var16;
         int var18;
         for(var7 = 0; var7 < this.field_970; ++var7) {
            if(this.field_926[var7] != -2) {
               var8 = this.field_921[var7];
               var9 = this.field_966[var7];
               var10 = this.field_923[var7];
               var11 = field_953[var8];
               var12 = field_953[var9];
               var13 = field_953[var10];
               int var14;
               if(var1 && (var11 == -5000 || var12 == -5000 || var13 == -5000)) {
                  var14 = field_935[var8];
                  var15 = field_935[var9];
                  var16 = field_935[var10];
                  int var17 = field_957[var8];
                  var18 = field_957[var9];
                  int var19 = field_957[var10];
                  int var20 = field_912[var8];
                  int var21 = field_912[var9];
                  int var22 = field_912[var10];
                  var14 -= var15;
                  var16 -= var15;
                  var17 -= var18;
                  var19 -= var18;
                  var20 -= var21;
                  var22 -= var21;
                  int var23 = var17 * var22 - var20 * var19;
                  int var24 = var20 * var16 - var14 * var22;
                  int var25 = var14 * var19 - var17 * var16;
                  if(var15 * var23 + var18 * var24 + var21 * var25 > 0) {
                     field_975[var7] = true;
                     int var26 = (field_955[var8] + field_955[var9] + field_955[var10]) / 3 + this.field_943;
                     field_961[var26][field_956[var26]++] = var7;
                  }
               } else {
                  if(var2 && class_169.method_3614(field_949[var8], field_949[var9], field_949[var10], var11, var12, var13, var6, 1961168244)) {
                     class_98.method_1812(var4);
                     var2 = false;
                  }

                  if((var11 - var12) * (field_949[var10] - field_949[var9]) - (field_949[var8] - field_949[var9]) * (var13 - var12) > 0) {
                     field_975[var7] = false;
                     if(var11 >= 0 && var12 >= 0 && var13 >= 0 && var11 <= class_70.field_537 && var12 <= class_70.field_537 && var13 <= class_70.field_537) {
                        field_945[var7] = false;
                     } else {
                        field_945[var7] = true;
                     }

                     var14 = (field_955[var8] + field_955[var9] + field_955[var10]) / 3 + this.field_943;
                     field_961[var14][field_956[var14]++] = var7;
                  }
               }
            }
         }

         int[] var27;
         if(this.field_948 == null) {
            for(var7 = this.field_954 - 1; var7 >= 0; --var7) {
               var8 = field_956[var7];
               if(var8 > 0) {
                  var27 = field_961[var7];

                  for(var10 = 0; var10 < var8; ++var10) {
                     this.method_1687(var27[var10]);
                  }
               }
            }

         } else {
            for(var7 = 0; var7 < 12; ++var7) {
               field_962[var7] = 0;
               field_924[var7] = 0;
            }

            for(var7 = this.field_954 - 1; var7 >= 0; --var7) {
               var8 = field_956[var7];
               if(var8 > 0) {
                  var27 = field_961[var7];

                  for(var10 = 0; var10 < var8; ++var10) {
                     var11 = var27[var10];
                     byte var28 = this.field_948[var11];
                     var13 = field_962[var28]++;
                     field_963[var28][var13] = var11;
                     if(var28 < 10) {
                        field_924[var28] += var7;
                     } else if(var28 == 10) {
                        field_964[var13] = var7;
                     } else {
                        field_965[var13] = var7;
                     }
                  }
               }
            }

            var7 = 0;
            if(field_962[1] > 0 || field_962[2] > 0) {
               var7 = (field_924[1] + field_924[2]) / (field_962[1] + field_962[2]);
            }

            var8 = 0;
            if(field_962[3] > 0 || field_962[4] > 0) {
               var8 = (field_924[3] + field_924[4]) / (field_962[3] + field_962[4]);
            }

            var9 = 0;
            if(field_962[6] > 0 || field_962[8] > 0) {
               var9 = (field_924[6] + field_924[8]) / (field_962[6] + field_962[8]);
            }

            var11 = 0;
            var12 = field_962[10];
            int[] var29 = field_963[10];
            int[] var30 = field_964;
            if(var11 == var12) {
               var11 = 0;
               var12 = field_962[11];
               var29 = field_963[11];
               var30 = field_965;
            }

            if(var11 < var12) {
               var10 = var30[var11];
            } else {
               var10 = -1000;
            }

            for(var15 = 0; var15 < 10; ++var15) {
               while(var15 == 0 && var10 > var7) {
                  this.method_1687(var29[var11++]);
                  if(var11 == var12 && var29 != field_963[11]) {
                     var11 = 0;
                     var12 = field_962[11];
                     var29 = field_963[11];
                     var30 = field_965;
                  }

                  if(var11 < var12) {
                     var10 = var30[var11];
                  } else {
                     var10 = -1000;
                  }
               }

               while(var15 == 3 && var10 > var8) {
                  this.method_1687(var29[var11++]);
                  if(var11 == var12 && var29 != field_963[11]) {
                     var11 = 0;
                     var12 = field_962[11];
                     var29 = field_963[11];
                     var30 = field_965;
                  }

                  if(var11 < var12) {
                     var10 = var30[var11];
                  } else {
                     var10 = -1000;
                  }
               }

               while(var15 == 5 && var10 > var9) {
                  this.method_1687(var29[var11++]);
                  if(var11 == var12 && var29 != field_963[11]) {
                     var11 = 0;
                     var12 = field_962[11];
                     var29 = field_963[11];
                     var30 = field_965;
                  }

                  if(var11 < var12) {
                     var10 = var30[var11];
                  } else {
                     var10 = -1000;
                  }
               }

               var16 = field_962[var15];
               int[] var31 = field_963[var15];

               for(var18 = 0; var18 < var16; ++var18) {
                  this.method_1687(var31[var18]);
               }
            }

            while(var10 != -1000) {
               this.method_1687(var29[var11++]);
               if(var11 == var12 && var29 != field_963[11]) {
                  var11 = 0;
                  var29 = field_963[11];
                  var12 = field_962[11];
                  var30 = field_965;
               }

               if(var11 < var12) {
                  var10 = var30[var11];
               } else {
                  var10 = -1000;
               }
            }

         }
      }
   }

   // $FF: renamed from: bk (int) void
   final void method_1684(int var1) {
      int var2 = class_70.field_545;
      int var3 = class_70.field_538;
      int var4 = 0;
      int var5 = this.field_921[var1];
      int var6 = this.field_966[var1];
      int var7 = this.field_923[var1];
      int var8 = field_912[var5];
      int var9 = field_912[var6];
      int var10 = field_912[var7];
      if(this.field_928 == null) {
         class_70.field_554 = 0;
      } else {
         class_70.field_554 = this.field_928[var1] & 255;
      }

      int var11;
      int var12;
      int var13;
      int var14;
      if(var8 >= 50) {
         field_967[var4] = field_953[var5];
         field_979[var4] = field_949[var5];
         field_969[var4++] = this.field_920[var1];
      } else {
         var11 = field_935[var5];
         var12 = field_957[var5];
         var13 = this.field_920[var1];
         if(var10 >= 50) {
            var14 = (50 - var8) * field_915[var10 - var8];
            field_967[var4] = var2 + (var11 + ((field_935[var7] - var11) * var14 >> 16)) * class_70.field_544 / 50;
            field_979[var4] = var3 + (var12 + ((field_957[var7] - var12) * var14 >> 16)) * class_70.field_544 / 50;
            field_969[var4++] = var13 + ((this.field_926[var1] - var13) * var14 >> 16);
         }

         if(var9 >= 50) {
            var14 = (50 - var8) * field_915[var9 - var8];
            field_967[var4] = var2 + (var11 + ((field_935[var6] - var11) * var14 >> 16)) * class_70.field_544 / 50;
            field_979[var4] = var3 + (var12 + ((field_957[var6] - var12) * var14 >> 16)) * class_70.field_544 / 50;
            field_969[var4++] = var13 + ((this.field_925[var1] - var13) * var14 >> 16);
         }
      }

      if(var9 >= 50) {
         field_967[var4] = field_953[var6];
         field_979[var4] = field_949[var6];
         field_969[var4++] = this.field_925[var1];
      } else {
         var11 = field_935[var6];
         var12 = field_957[var6];
         var13 = this.field_925[var1];
         if(var8 >= 50) {
            var14 = (50 - var9) * field_915[var8 - var9];
            field_967[var4] = var2 + (var11 + ((field_935[var5] - var11) * var14 >> 16)) * class_70.field_544 / 50;
            field_979[var4] = var3 + (var12 + ((field_957[var5] - var12) * var14 >> 16)) * class_70.field_544 / 50;
            field_969[var4++] = var13 + ((this.field_920[var1] - var13) * var14 >> 16);
         }

         if(var10 >= 50) {
            var14 = (50 - var9) * field_915[var10 - var9];
            field_967[var4] = var2 + (var11 + ((field_935[var7] - var11) * var14 >> 16)) * class_70.field_544 / 50;
            field_979[var4] = var3 + (var12 + ((field_957[var7] - var12) * var14 >> 16)) * class_70.field_544 / 50;
            field_969[var4++] = var13 + ((this.field_926[var1] - var13) * var14 >> 16);
         }
      }

      if(var10 >= 50) {
         field_967[var4] = field_953[var7];
         field_979[var4] = field_949[var7];
         field_969[var4++] = this.field_926[var1];
      } else {
         var11 = field_935[var7];
         var12 = field_957[var7];
         var13 = this.field_926[var1];
         if(var9 >= 50) {
            var14 = (50 - var10) * field_915[var9 - var10];
            field_967[var4] = var2 + (var11 + ((field_935[var6] - var11) * var14 >> 16)) * class_70.field_544 / 50;
            field_979[var4] = var3 + (var12 + ((field_957[var6] - var12) * var14 >> 16)) * class_70.field_544 / 50;
            field_969[var4++] = var13 + ((this.field_925[var1] - var13) * var14 >> 16);
         }

         if(var8 >= 50) {
            var14 = (50 - var10) * field_915[var8 - var10];
            field_967[var4] = var2 + (var11 + ((field_935[var5] - var11) * var14 >> 16)) * class_70.field_544 / 50;
            field_979[var4] = var3 + (var12 + ((field_957[var5] - var12) * var14 >> 16)) * class_70.field_544 / 50;
            field_969[var4++] = var13 + ((this.field_920[var1] - var13) * var14 >> 16);
         }
      }

      var11 = field_967[0];
      var12 = field_967[1];
      var13 = field_967[2];
      var14 = field_979[0];
      int var15 = field_979[1];
      int var16 = field_979[2];
      class_70.field_536 = false;
      int var17;
      int var18;
      int var19;
      int var20;
      if(var4 == 3) {
         if(var11 < 0 || var12 < 0 || var13 < 0 || var11 > class_70.field_537 || var12 > class_70.field_537 || var13 > class_70.field_537) {
            class_70.field_536 = true;
         }

         if(this.field_930 != null && this.field_930[var1] != -1) {
            if(this.field_929 != null && this.field_929[var1] != -1) {
               var20 = this.field_929[var1] & 255;
               var17 = this.field_933[var20];
               var18 = this.field_934[var20];
               var19 = this.field_958[var20];
            } else {
               var17 = var5;
               var18 = var6;
               var19 = var7;
            }

            if(this.field_926[var1] == -1) {
               class_70.method_1000(var14, var15, var16, var11, var12, var13, this.field_920[var1], this.field_920[var1], this.field_920[var1], field_935[var17], field_935[var18], field_935[var19], field_957[var17], field_957[var18], field_957[var19], field_912[var17], field_912[var18], field_912[var19], this.field_930[var1]);
            } else {
               class_70.method_1000(var14, var15, var16, var11, var12, var13, field_969[0], field_969[1], field_969[2], field_935[var17], field_935[var18], field_935[var19], field_957[var17], field_957[var18], field_957[var19], field_912[var17], field_912[var18], field_912[var19], this.field_930[var1]);
            }
         } else if(this.field_926[var1] == -1) {
            class_70.method_1042(var14, var15, var16, var11, var12, var13, field_978[this.field_920[var1]]);
         } else {
            class_70.method_977(var14, var15, var16, var11, var12, var13, field_969[0], field_969[1], field_969[2]);
         }
      }

      if(var4 == 4) {
         if(var11 < 0 || var12 < 0 || var13 < 0 || var11 > class_70.field_537 || var12 > class_70.field_537 || var13 > class_70.field_537 || field_967[3] < 0 || field_967[3] > class_70.field_537) {
            class_70.field_536 = true;
         }

         if(this.field_930 != null && this.field_930[var1] != -1) {
            if(this.field_929 != null && this.field_929[var1] != -1) {
               var20 = this.field_929[var1] & 255;
               var17 = this.field_933[var20];
               var18 = this.field_934[var20];
               var19 = this.field_958[var20];
            } else {
               var17 = var5;
               var18 = var6;
               var19 = var7;
            }

            short var21 = this.field_930[var1];
            if(this.field_926[var1] == -1) {
               class_70.method_1000(var14, var15, var16, var11, var12, var13, this.field_920[var1], this.field_920[var1], this.field_920[var1], field_935[var17], field_935[var18], field_935[var19], field_957[var17], field_957[var18], field_957[var19], field_912[var17], field_912[var18], field_912[var19], var21);
               class_70.method_1000(var14, var16, field_979[3], var11, var13, field_967[3], this.field_920[var1], this.field_920[var1], this.field_920[var1], field_935[var17], field_935[var18], field_935[var19], field_957[var17], field_957[var18], field_957[var19], field_912[var17], field_912[var18], field_912[var19], var21);
            } else {
               class_70.method_1000(var14, var15, var16, var11, var12, var13, field_969[0], field_969[1], field_969[2], field_935[var17], field_935[var18], field_935[var19], field_957[var17], field_957[var18], field_957[var19], field_912[var17], field_912[var18], field_912[var19], var21);
               class_70.method_1000(var14, var16, field_979[3], var11, var13, field_967[3], field_969[0], field_969[2], field_969[3], field_935[var17], field_935[var18], field_935[var19], field_957[var17], field_957[var18], field_957[var19], field_912[var17], field_912[var18], field_912[var19], var21);
            }
         } else if(this.field_926[var1] == -1) {
            var17 = field_978[this.field_920[var1]];
            class_70.method_1042(var14, var15, var16, var11, var12, var13, var17);
            class_70.method_1042(var14, var16, field_979[3], var11, var13, field_967[3], var17);
         } else {
            class_70.method_977(var14, var15, var16, var11, var12, var13, field_969[0], field_969[1], field_969[2]);
            class_70.method_977(var14, var16, field_979[3], var11, var13, field_967[3], field_969[0], field_969[2], field_969[3]);
         }
      }

   }

   // $FF: renamed from: bh (int) void
   public void method_1685(int var1) {
      int var2 = field_968[var1];
      int var3 = field_927[var1];

      for(int var4 = 0; var4 < this.field_916; ++var4) {
         int var5 = this.field_918[var4] * var3 - this.field_936[var4] * var2 >> 16;
         this.field_936[var4] = this.field_918[var4] * var2 + this.field_936[var4] * var3 >> 16;
         this.field_918[var4] = var5;
      }

      this.method_1624();
   }

   // $FF: renamed from: t (int, int, int, int, int, int, int) void
   public final void method_1686(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      field_956[0] = -1;
      if(this.field_939 != 2 && this.field_939 != 1) {
         this.method_1622();
      }

      int var8 = class_70.field_545;
      int var9 = class_70.field_538;
      int var10 = field_968[var1];
      int var11 = field_927[var1];
      int var12 = field_968[var2];
      int var13 = field_927[var2];
      int var14 = field_968[var3];
      int var15 = field_927[var3];
      int var16 = field_968[var4];
      int var17 = field_927[var4];
      int var18 = var6 * var16 + var7 * var17 >> 16;

      for(int var19 = 0; var19 < this.field_916; ++var19) {
         int var20 = this.field_917[var19];
         int var21 = this.field_918[var19];
         int var22 = this.field_936[var19];
         int var23;
         if(var3 != 0) {
            var23 = var21 * var14 + var20 * var15 >> 16;
            var21 = var21 * var15 - var20 * var14 >> 16;
            var20 = var23;
         }

         if(var1 != 0) {
            var23 = var21 * var11 - var22 * var10 >> 16;
            var22 = var21 * var10 + var22 * var11 >> 16;
            var21 = var23;
         }

         if(var2 != 0) {
            var23 = var22 * var12 + var20 * var13 >> 16;
            var22 = var22 * var13 - var20 * var12 >> 16;
            var20 = var23;
         }

         var20 += var5;
         var21 += var6;
         var22 += var7;
         var23 = var21 * var17 - var22 * var16 >> 16;
         var22 = var21 * var16 + var22 * var17 >> 16;
         field_955[var19] = var22 - var18;
         field_953[var19] = var8 + var20 * class_70.field_544 / var22;
         field_949[var19] = var9 + var23 * class_70.field_544 / var22;
         if(this.field_932 > 0) {
            field_935[var19] = var20;
            field_957[var19] = var23;
            field_912[var19] = var22;
         }
      }

      try {
         this.method_1636(false, false, false, 0L);
      } catch (Exception var24) {
         ;
      }

   }

   // $FF: renamed from: i (int) void
   final void method_1687(int var1) {
      if(field_975[var1]) {
         this.method_1638(var1);
      } else {
         int var2 = this.field_921[var1];
         int var3 = this.field_966[var1];
         int var4 = this.field_923[var1];
         class_70.field_536 = field_945[var1];
         if(this.field_928 == null) {
            class_70.field_554 = 0;
         } else {
            class_70.field_554 = this.field_928[var1] & 255;
         }

         if(this.field_930 != null && this.field_930[var1] != -1) {
            int var5;
            int var6;
            int var7;
            if(this.field_929 != null && this.field_929[var1] != -1) {
               int var8 = this.field_929[var1] & 255;
               var5 = this.field_933[var8];
               var6 = this.field_934[var8];
               var7 = this.field_958[var8];
            } else {
               var5 = var2;
               var6 = var3;
               var7 = var4;
            }

            if(this.field_926[var1] == -1) {
               class_70.method_1000(field_949[var2], field_949[var3], field_949[var4], field_953[var2], field_953[var3], field_953[var4], this.field_920[var1], this.field_920[var1], this.field_920[var1], field_935[var5], field_935[var6], field_935[var7], field_957[var5], field_957[var6], field_957[var7], field_912[var5], field_912[var6], field_912[var7], this.field_930[var1]);
            } else {
               class_70.method_1000(field_949[var2], field_949[var3], field_949[var4], field_953[var2], field_953[var3], field_953[var4], this.field_920[var1], this.field_925[var1], this.field_926[var1], field_935[var5], field_935[var6], field_935[var7], field_957[var5], field_957[var6], field_957[var7], field_912[var5], field_912[var6], field_912[var7], this.field_930[var1]);
            }
         } else if(this.field_926[var1] == -1) {
            class_70.method_1042(field_949[var2], field_949[var3], field_949[var4], field_953[var2], field_953[var3], field_953[var4], field_978[this.field_920[var1]]);
         } else {
            class_70.method_977(field_949[var2], field_949[var3], field_949[var4], field_953[var2], field_953[var3], field_953[var4], this.field_920[var1], this.field_925[var1], this.field_926[var1]);
         }

      }
   }
}
