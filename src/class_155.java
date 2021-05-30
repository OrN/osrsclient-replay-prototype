
// $FF: renamed from: bs
public class class_155 {

   // $FF: renamed from: n int
   int field_1935;
   // $FF: renamed from: f int[]
   int[] field_1936;
   // $FF: renamed from: v int
   int field_1937;
   // $FF: renamed from: y int[]
   int[] field_1938;
   // $FF: renamed from: p float[][]
   float[][] field_1939;
   // $FF: renamed from: j int[]
   int[] field_1940;


   // $FF: renamed from: d () float[]
   float[] method_3253() {
      return this.field_1939[this.method_3256()];
   }

   // $FF: renamed from: <init> () void
   void method_3254() {
      super();
      class_57.method_599(24);
      this.field_1937 = class_57.method_599(16);
      this.field_1935 = class_57.method_599(24);
      this.field_1936 = new int[this.field_1935];
      boolean var1 = class_57.method_596() != 0;
      int var2;
      int var3;
      int var5;
      if(var1) {
         var2 = 0;

         for(var3 = class_57.method_599(5) + 1; var2 < this.field_1935; ++var3) {
            int var4 = class_57.method_599(class_240.method_4642(this.field_1935 - var2, -766228874));

            for(var5 = 0; var5 < var4; ++var5) {
               this.field_1936[var2++] = var3;
            }
         }
      } else {
         boolean var14 = class_57.method_596() != 0;

         for(var3 = 0; var3 < this.field_1935; ++var3) {
            if(var14 && class_57.method_596() == 0) {
               this.field_1936[var3] = 0;
            } else {
               this.field_1936[var3] = class_57.method_599(5) + 1;
            }
         }
      }

      this.method_3259();
      var2 = class_57.method_599(4);
      if(var2 > 0) {
         float var15 = class_57.method_628(class_57.method_599(32));
         float var16 = class_57.method_628(class_57.method_599(32));
         var5 = class_57.method_599(4) + 1;
         boolean var6 = class_57.method_596() != 0;
         int var7;
         if(var2 == 1) {
            var7 = method_3255(this.field_1935, this.field_1937);
         } else {
            var7 = this.field_1935 * this.field_1937;
         }

         this.field_1938 = new int[var7];

         int var8;
         for(var8 = 0; var8 < var7; ++var8) {
            this.field_1938[var8] = class_57.method_599(var5);
         }

         this.field_1939 = new float[this.field_1935][this.field_1937];
         float var9;
         int var10;
         int var11;
         if(var2 == 1) {
            for(var8 = 0; var8 < this.field_1935; ++var8) {
               var9 = 0.0F;
               var10 = 1;

               for(var11 = 0; var11 < this.field_1937; ++var11) {
                  int var12 = var8 / var10 % var7;
                  float var13 = (float)this.field_1938[var12] * var16 + var15 + var9;
                  this.field_1939[var8][var11] = var13;
                  if(var6) {
                     var9 = var13;
                  }

                  var10 *= var7;
               }
            }
         } else {
            for(var8 = 0; var8 < this.field_1935; ++var8) {
               var9 = 0.0F;
               var10 = var8 * this.field_1937;

               for(var11 = 0; var11 < this.field_1937; ++var11) {
                  float var17 = (float)this.field_1938[var10] * var16 + var15 + var9;
                  this.field_1939[var8][var11] = var17;
                  if(var6) {
                     var9 = var17;
                  }

                  ++var10;
               }
            }
         }
      }

   }

   // $FF: renamed from: v (int, int) int
   static int method_3255(int var0, int var1) {
      int var2 = (int)Math.pow((double)var0, 1.0D / (double)var1) + 1;

      while(true) {
         int var4 = var2;
         int var5 = var1;

         int var6;
         for(var6 = 1; var5 > 1; var5 >>= 1) {
            if((var5 & 1) != 0) {
               var6 *= var4;
            }

            var4 *= var4;
         }

         int var3;
         if(1 == var5) {
            var3 = var6 * var4;
         } else {
            var3 = var6;
         }

         if(var3 <= var0) {
            return var2;
         }

         --var2;
      }
   }

   // $FF: renamed from: f () int
   int method_3256() {
      int var1;
      for(var1 = 0; this.field_1940[var1] >= 0; var1 = class_57.method_596() != 0?this.field_1940[var1]:var1 + 1) {
         ;
      }

      return ~this.field_1940[var1];
   }

   // $FF: renamed from: y () float[]
   float[] method_3257() {
      return this.field_1939[this.method_3256()];
   }

   // $FF: renamed from: j () void
   void method_3258() {
      int[] var1 = new int[this.field_1935];
      int[] var2 = new int[33];

      int var3;
      int var4;
      int var5;
      int var6;
      int var7;
      int var8;
      int var10;
      for(var3 = 0; var3 < this.field_1935; ++var3) {
         var4 = this.field_1936[var3];
         if(var4 != 0) {
            var5 = 1 << 32 - var4;
            var6 = var2[var4];
            var1[var3] = var6;
            int var9;
            if((var6 & var5) != 0) {
               var7 = var2[var4 - 1];
            } else {
               var7 = var6 | var5;

               for(var8 = var4 - 1; var8 >= 1; --var8) {
                  var9 = var2[var8];
                  if(var9 != var6) {
                     break;
                  }

                  var10 = 1 << 32 - var8;
                  if((var9 & var10) != 0) {
                     var2[var8] = var2[var8 - 1];
                     break;
                  }

                  var2[var8] = var9 | var10;
               }
            }

            var2[var4] = var7;

            for(var8 = var4 + 1; var8 <= 32; ++var8) {
               var9 = var2[var8];
               if(var9 == var6) {
                  var2[var8] = var7;
               }
            }
         }
      }

      this.field_1940 = new int[8];
      int var11 = 0;

      for(var3 = 0; var3 < this.field_1935; ++var3) {
         var4 = this.field_1936[var3];
         if(var4 != 0) {
            var5 = var1[var3];
            var6 = 0;

            for(var7 = 0; var7 < var4; ++var7) {
               var8 = Integer.MIN_VALUE >>> var7;
               if((var5 & var8) != 0) {
                  if(this.field_1940[var6] == 0) {
                     this.field_1940[var6] = var11;
                  }

                  var6 = this.field_1940[var6];
               } else {
                  ++var6;
               }

               if(var6 >= this.field_1940.length) {
                  int[] var12 = new int[this.field_1940.length * 2];

                  for(var10 = 0; var10 < this.field_1940.length; ++var10) {
                     var12[var10] = this.field_1940[var10];
                  }

                  this.field_1940 = var12;
               }

               var8 >>>= 1;
            }

            this.field_1940[var6] = ~var3;
            if(var6 >= var11) {
               var11 = var6 + 1;
            }
         }
      }

   }

   // $FF: renamed from: n () void
   void method_3259() {
      int[] var1 = new int[this.field_1935];
      int[] var2 = new int[33];

      int var3;
      int var4;
      int var5;
      int var6;
      int var7;
      int var8;
      int var10;
      for(var3 = 0; var3 < this.field_1935; ++var3) {
         var4 = this.field_1936[var3];
         if(var4 != 0) {
            var5 = 1 << 32 - var4;
            var6 = var2[var4];
            var1[var3] = var6;
            int var9;
            if((var6 & var5) != 0) {
               var7 = var2[var4 - 1];
            } else {
               var7 = var6 | var5;

               for(var8 = var4 - 1; var8 >= 1; --var8) {
                  var9 = var2[var8];
                  if(var9 != var6) {
                     break;
                  }

                  var10 = 1 << 32 - var8;
                  if((var9 & var10) != 0) {
                     var2[var8] = var2[var8 - 1];
                     break;
                  }

                  var2[var8] = var9 | var10;
               }
            }

            var2[var4] = var7;

            for(var8 = var4 + 1; var8 <= 32; ++var8) {
               var9 = var2[var8];
               if(var9 == var6) {
                  var2[var8] = var7;
               }
            }
         }
      }

      this.field_1940 = new int[8];
      int var11 = 0;

      for(var3 = 0; var3 < this.field_1935; ++var3) {
         var4 = this.field_1936[var3];
         if(var4 != 0) {
            var5 = var1[var3];
            var6 = 0;

            for(var7 = 0; var7 < var4; ++var7) {
               var8 = Integer.MIN_VALUE >>> var7;
               if((var5 & var8) != 0) {
                  if(this.field_1940[var6] == 0) {
                     this.field_1940[var6] = var11;
                  }

                  var6 = this.field_1940[var6];
               } else {
                  ++var6;
               }

               if(var6 >= this.field_1940.length) {
                  int[] var12 = new int[this.field_1940.length * 2];

                  for(var10 = 0; var10 < this.field_1940.length; ++var10) {
                     var12[var10] = this.field_1940[var10];
                  }

                  this.field_1940 = var12;
               }

               var8 >>>= 1;
            }

            this.field_1940[var6] = ~var3;
            if(var6 >= var11) {
               var11 = var6 + 1;
            }
         }
      }

   }

   // $FF: renamed from: r () int
   int method_3260() {
      int var1;
      for(var1 = 0; this.field_1940[var1] >= 0; var1 = class_57.method_596() != 0?this.field_1940[var1]:var1 + 1) {
         ;
      }

      return ~this.field_1940[var1];
   }

   // $FF: renamed from: b () float[]
   float[] method_3261() {
      return this.field_1939[this.method_3256()];
   }

   // $FF: renamed from: p (int, int) int
   static int method_3262(int var0, int var1) {
      int var2 = (int)Math.pow((double)var0, 1.0D / (double)var1) + 1;

      while(true) {
         int var4 = var2;
         int var5 = var1;

         int var6;
         for(var6 = 1; var5 > 1; var5 >>= 1) {
            if((var5 & 1) != 0) {
               var6 *= var4;
            }

            var4 *= var4;
         }

         int var3;
         if(1 == var5) {
            var3 = var6 * var4;
         } else {
            var3 = var6;
         }

         if(var3 <= var0) {
            return var2;
         }

         --var2;
      }
   }
}
