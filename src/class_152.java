
// $FF: renamed from: bl
public class class_152 {

   // $FF: renamed from: f int
   int field_1914;
   // $FF: renamed from: v int
   int field_1915;
   // $FF: renamed from: n int
   int field_1916;
   // $FF: renamed from: y int
   int field_1917;
   // $FF: renamed from: p int
   int field_1918;
   // $FF: renamed from: j int
   int field_1919;
   // $FF: renamed from: r int[]
   int[] field_1920;


   // $FF: renamed from: <init> () void
   class_152() {
      super();
      this.field_1915 = class_57.method_599(16);
      this.field_1916 = class_57.method_599(24);
      this.field_1914 = class_57.method_599(24);
      this.field_1917 = class_57.method_599(24) + 1;
      this.field_1918 = class_57.method_599(6) + 1;
      this.field_1919 = class_57.method_599(8);
      int[] var1 = new int[this.field_1918];

      int var2;
      for(var2 = 0; var2 < this.field_1918; ++var2) {
         int var3 = 0;
         int var4 = class_57.method_599(3);
         boolean var5 = class_57.method_596() != 0;
         if(var5) {
            var3 = class_57.method_599(5);
         }

         var1[var2] = var3 << 3 | var4;
      }

      this.field_1920 = new int[this.field_1918 * 8];

      for(var2 = 0; var2 < this.field_1918 * 8; ++var2) {
         this.field_1920[var2] = (var1[var2 >> 3] & 1 << (var2 & 7)) != 0?class_57.method_599(8):-1;
      }

   }

   // $FF: renamed from: v (float[], int, boolean) void
   void method_3218(float[] var1, int var2, boolean var3) {
      int var4;
      for(var4 = 0; var4 < var2; ++var4) {
         var1[var4] = 0.0F;
      }

      if(!var3) {
         var4 = class_57.field_434[this.field_1919].field_1937;
         int var5 = this.field_1914 - this.field_1916;
         int var6 = var5 / this.field_1917;
         int[] var7 = new int[var6];

         for(int var8 = 0; var8 < 8; ++var8) {
            int var9 = 0;

            while(var9 < var6) {
               int var10;
               int var11;
               if(var8 == 0) {
                  var10 = class_57.field_434[this.field_1919].method_3256();

                  for(var11 = var4 - 1; var11 >= 0; --var11) {
                     if(var9 + var11 < var6) {
                        var7[var9 + var11] = var10 % this.field_1918;
                     }

                     var10 /= this.field_1918;
                  }
               }

               for(var10 = 0; var10 < var4; ++var10) {
                  var11 = var7[var9];
                  int var12 = this.field_1920[var11 * 8 + var8];
                  if(var12 >= 0) {
                     int var13 = this.field_1916 + var9 * this.field_1917;
                     class_155 var14 = class_57.field_434[var12];
                     int var15;
                     if(this.field_1915 == 0) {
                        var15 = this.field_1917 / var14.field_1937;

                        for(int var19 = 0; var19 < var15; ++var19) {
                           float[] var20 = var14.method_3257();

                           for(int var18 = 0; var18 < var14.field_1937; ++var18) {
                              var1[var13 + var19 + var18 * var15] += var20[var18];
                           }
                        }
                     } else {
                        var15 = 0;

                        while(var15 < this.field_1917) {
                           float[] var16 = var14.method_3257();

                           for(int var17 = 0; var17 < var14.field_1937; ++var17) {
                              var1[var13 + var15] += var16[var17];
                              ++var15;
                           }
                        }
                     }
                  }

                  ++var9;
                  if(var9 >= var6) {
                     break;
                  }
               }
            }
         }

      }
   }

   // $FF: renamed from: n (float[], int, boolean) void
   void method_3219(float[] var1, int var2, boolean var3) {
      int var4;
      for(var4 = 0; var4 < var2; ++var4) {
         var1[var4] = 0.0F;
      }

      if(!var3) {
         var4 = class_57.field_434[this.field_1919].field_1937;
         int var5 = this.field_1914 - this.field_1916;
         int var6 = var5 / this.field_1917;
         int[] var7 = new int[var6];

         for(int var8 = 0; var8 < 8; ++var8) {
            int var9 = 0;

            while(var9 < var6) {
               int var10;
               int var11;
               if(var8 == 0) {
                  var10 = class_57.field_434[this.field_1919].method_3256();

                  for(var11 = var4 - 1; var11 >= 0; --var11) {
                     if(var9 + var11 < var6) {
                        var7[var9 + var11] = var10 % this.field_1918;
                     }

                     var10 /= this.field_1918;
                  }
               }

               for(var10 = 0; var10 < var4; ++var10) {
                  var11 = var7[var9];
                  int var12 = this.field_1920[var11 * 8 + var8];
                  if(var12 >= 0) {
                     int var13 = this.field_1916 + var9 * this.field_1917;
                     class_155 var14 = class_57.field_434[var12];
                     int var15;
                     if(this.field_1915 == 0) {
                        var15 = this.field_1917 / var14.field_1937;

                        for(int var19 = 0; var19 < var15; ++var19) {
                           float[] var20 = var14.method_3257();

                           for(int var18 = 0; var18 < var14.field_1937; ++var18) {
                              var1[var13 + var19 + var18 * var15] += var20[var18];
                           }
                        }
                     } else {
                        var15 = 0;

                        while(var15 < this.field_1917) {
                           float[] var16 = var14.method_3257();

                           for(int var17 = 0; var17 < var14.field_1937; ++var17) {
                              var1[var13 + var15] += var16[var17];
                              ++var15;
                           }
                        }
                     }
                  }

                  ++var9;
                  if(var9 >= var6) {
                     break;
                  }
               }
            }
         }

      }
   }

   // $FF: renamed from: y (float[], int, boolean) void
   void method_3220(float[] var1, int var2, boolean var3) {
      int var4;
      for(var4 = 0; var4 < var2; ++var4) {
         var1[var4] = 0.0F;
      }

      if(!var3) {
         var4 = class_57.field_434[this.field_1919].field_1937;
         int var5 = this.field_1914 - this.field_1916;
         int var6 = var5 / this.field_1917;
         int[] var7 = new int[var6];

         for(int var8 = 0; var8 < 8; ++var8) {
            int var9 = 0;

            while(var9 < var6) {
               int var10;
               int var11;
               if(var8 == 0) {
                  var10 = class_57.field_434[this.field_1919].method_3256();

                  for(var11 = var4 - 1; var11 >= 0; --var11) {
                     if(var9 + var11 < var6) {
                        var7[var9 + var11] = var10 % this.field_1918;
                     }

                     var10 /= this.field_1918;
                  }
               }

               for(var10 = 0; var10 < var4; ++var10) {
                  var11 = var7[var9];
                  int var12 = this.field_1920[var11 * 8 + var8];
                  if(var12 >= 0) {
                     int var13 = this.field_1916 + var9 * this.field_1917;
                     class_155 var14 = class_57.field_434[var12];
                     int var15;
                     if(this.field_1915 == 0) {
                        var15 = this.field_1917 / var14.field_1937;

                        for(int var19 = 0; var19 < var15; ++var19) {
                           float[] var20 = var14.method_3257();

                           for(int var18 = 0; var18 < var14.field_1937; ++var18) {
                              var1[var13 + var19 + var18 * var15] += var20[var18];
                           }
                        }
                     } else {
                        var15 = 0;

                        while(var15 < this.field_1917) {
                           float[] var16 = var14.method_3257();

                           for(int var17 = 0; var17 < var14.field_1937; ++var17) {
                              var1[var13 + var15] += var16[var17];
                              ++var15;
                           }
                        }
                     }
                  }

                  ++var9;
                  if(var9 >= var6) {
                     break;
                  }
               }
            }
         }

      }
   }

   // $FF: renamed from: f (float[], int, boolean) void
   void method_3221(float[] var1, int var2, boolean var3) {
      int var4;
      for(var4 = 0; var4 < var2; ++var4) {
         var1[var4] = 0.0F;
      }

      if(!var3) {
         var4 = class_57.field_434[this.field_1919].field_1937;
         int var5 = this.field_1914 - this.field_1916;
         int var6 = var5 / this.field_1917;
         int[] var7 = new int[var6];

         for(int var8 = 0; var8 < 8; ++var8) {
            int var9 = 0;

            while(var9 < var6) {
               int var10;
               int var11;
               if(var8 == 0) {
                  var10 = class_57.field_434[this.field_1919].method_3256();

                  for(var11 = var4 - 1; var11 >= 0; --var11) {
                     if(var9 + var11 < var6) {
                        var7[var9 + var11] = var10 % this.field_1918;
                     }

                     var10 /= this.field_1918;
                  }
               }

               for(var10 = 0; var10 < var4; ++var10) {
                  var11 = var7[var9];
                  int var12 = this.field_1920[var11 * 8 + var8];
                  if(var12 >= 0) {
                     int var13 = this.field_1916 + var9 * this.field_1917;
                     class_155 var14 = class_57.field_434[var12];
                     int var15;
                     if(this.field_1915 == 0) {
                        var15 = this.field_1917 / var14.field_1937;

                        for(int var19 = 0; var19 < var15; ++var19) {
                           float[] var20 = var14.method_3257();

                           for(int var18 = 0; var18 < var14.field_1937; ++var18) {
                              var1[var13 + var19 + var18 * var15] += var20[var18];
                           }
                        }
                     } else {
                        var15 = 0;

                        while(var15 < this.field_1917) {
                           float[] var16 = var14.method_3257();

                           for(int var17 = 0; var17 < var14.field_1937; ++var17) {
                              var1[var13 + var15] += var16[var17];
                              ++var15;
                           }
                        }
                     }
                  }

                  ++var9;
                  if(var9 >= var6) {
                     break;
                  }
               }
            }
         }

      }
   }
}
