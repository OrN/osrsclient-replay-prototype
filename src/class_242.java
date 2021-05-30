
// $FF: renamed from: gb
public class class_242 {

   // $FF: renamed from: kc int
   static final int field_2689 = 8;
   // $FF: renamed from: v int
   int field_2690;
   // $FF: renamed from: d int
   static final int field_2691 = 256;
   // $FF: renamed from: m int
   public static final int field_2692 = 4;
   // $FF: renamed from: n byte[][][]
   byte[][][] field_2693;


   // $FF: renamed from: p (int) void
   void method_4650(int var1) {
      try {
         byte[] var2 = new byte[this.field_2690 * -455192265 * -455192265 * this.field_2690];
         int var3 = 0;

         int var4;
         int var5;
         for(var4 = 0; var4 < -455192265 * this.field_2690; ++var4) {
            if(var1 >= 1834944583) {
               throw new IllegalStateException();
            }

            for(var5 = 0; var5 < this.field_2690 * -455192265; ++var5) {
               if(var1 >= 1834944583) {
                  throw new IllegalStateException();
               }

               if(var5 <= var4) {
                  var2[var3] = -1;
               }

               ++var3;
            }
         }

         this.field_2693[0][0] = var2;
         var2 = new byte[-455192265 * this.field_2690 * this.field_2690 * -455192265];
         var3 = 0;

         for(var4 = this.field_2690 * -455192265 - 1; var4 >= 0; --var4) {
            if(var1 >= 1834944583) {
               throw new IllegalStateException();
            }

            for(var5 = 0; var5 < -455192265 * this.field_2690; ++var5) {
               if(var1 >= 1834944583) {
                  throw new IllegalStateException();
               }

               if(var5 <= var4) {
                  var2[var3] = -1;
               }

               ++var3;
            }
         }

         this.field_2693[0][1] = var2;
         var2 = new byte[-455192265 * this.field_2690 * -455192265 * this.field_2690];
         var3 = 0;

         for(var4 = 0; var4 < -455192265 * this.field_2690; ++var4) {
            if(var1 >= 1834944583) {
               return;
            }

            for(var5 = 0; var5 < this.field_2690 * -455192265; ++var5) {
               if(var1 >= 1834944583) {
                  throw new IllegalStateException();
               }

               if(var5 >= var4) {
                  if(var1 >= 1834944583) {
                     throw new IllegalStateException();
                  }

                  var2[var3] = -1;
               }

               ++var3;
            }
         }

         this.field_2693[0][2] = var2;
         var2 = new byte[this.field_2690 * -455192265 * this.field_2690 * -455192265];
         var3 = 0;

         for(var4 = this.field_2690 * -455192265 - 1; var4 >= 0; --var4) {
            for(var5 = 0; var5 < this.field_2690 * -455192265; ++var5) {
               if(var1 >= 1834944583) {
                  throw new IllegalStateException();
               }

               if(var5 >= var4) {
                  if(var1 >= 1834944583) {
                     throw new IllegalStateException();
                  }

                  var2[var3] = -1;
               }

               ++var3;
            }
         }

         this.field_2693[0][3] = var2;
      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6, "gb.p(" + ')');
      }
   }

   // $FF: renamed from: v (int, int, int, int, int, int, int, int, byte) void
   void method_4651(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, byte var9) {
      try {
         if(var7 != 0) {
            if(var9 <= 1) {
               throw new IllegalStateException();
            }

            if(-455192265 * this.field_2690 != 0) {
               if(var9 <= 1) {
                  throw new IllegalStateException();
               }

               if(null != this.field_2693) {
                  var8 = this.method_4664(var8, var7, -2107942869);
                  var7 = this.method_4653(var7, (byte)2);
                  class_65.method_669(var1, var2, var5, var6, var3, var4, this.field_2693[var7 - 1][var8], -455192265 * this.field_2690, true);
                  return;
               }

               if(var9 <= 1) {
                  throw new IllegalStateException();
               }
            }
         }

      } catch (RuntimeException var10) {
         throw class_223.method_4281(var10, "gb.v(" + ')');
      }
   }

   // $FF: renamed from: u (int) void
   void method_4652(int var1) {
      try {
         byte[] var10000 = new byte[-455192265 * this.field_2690 * -455192265 * this.field_2690];
         boolean var3 = false;
         byte[] var2 = new byte[this.field_2690 * -455192265 * -455192265 * this.field_2690];
         int var7 = 0;

         int var4;
         int var5;
         for(var4 = 0; var4 < -455192265 * this.field_2690; ++var4) {
            if(var1 >= 1339781231) {
               return;
            }

            for(var5 = 0; var5 < this.field_2690 * -455192265; ++var5) {
               if(var5 <= var4 - -455192265 * this.field_2690 / 2) {
                  if(var1 >= 1339781231) {
                     throw new IllegalStateException();
                  }

                  var2[var7] = -1;
               }

               ++var7;
            }
         }

         this.field_2693[6][0] = var2;
         var2 = new byte[-455192265 * this.field_2690 * this.field_2690 * -455192265];
         var7 = 0;

         for(var4 = -455192265 * this.field_2690 - 1; var4 >= 0; --var4) {
            if(var1 >= 1339781231) {
               throw new IllegalStateException();
            }

            for(var5 = 0; var5 < this.field_2690 * -455192265; ++var5) {
               if(var1 >= 1339781231) {
                  return;
               }

               if(var5 <= var4 - this.field_2690 * -455192265 / 2) {
                  if(var1 >= 1339781231) {
                     throw new IllegalStateException();
                  }

                  var2[var7] = -1;
               }

               ++var7;
            }
         }

         this.field_2693[6][1] = var2;
         var2 = new byte[this.field_2690 * -455192265 * this.field_2690 * -455192265];
         var7 = 0;

         for(var4 = this.field_2690 * -455192265 - 1; var4 >= 0; --var4) {
            if(var1 >= 1339781231) {
               throw new IllegalStateException();
            }

            for(var5 = this.field_2690 * -455192265 - 1; var5 >= 0; --var5) {
               if(var1 >= 1339781231) {
                  throw new IllegalStateException();
               }

               if(var5 <= var4 - -455192265 * this.field_2690 / 2) {
                  if(var1 >= 1339781231) {
                     throw new IllegalStateException();
                  }

                  var2[var7] = -1;
               }

               ++var7;
            }
         }

         this.field_2693[6][2] = var2;
         var2 = new byte[this.field_2690 * -455192265 * -455192265 * this.field_2690];
         var7 = 0;

         for(var4 = 0; var4 < -455192265 * this.field_2690; ++var4) {
            if(var1 >= 1339781231) {
               throw new IllegalStateException();
            }

            for(var5 = -455192265 * this.field_2690 - 1; var5 >= 0; --var5) {
               if(var1 >= 1339781231) {
                  throw new IllegalStateException();
               }

               if(var5 <= var4 - -455192265 * this.field_2690 / 2) {
                  var2[var7] = -1;
               }

               ++var7;
            }
         }

         this.field_2693[6][3] = var2;
      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6, "gb.u(" + ')');
      }
   }

   // $FF: renamed from: f (int, byte) int
   int method_4653(int var1, byte var2) {
      try {
         if(var1 != 9) {
            if(10 != var1) {
               if(var1 == 11) {
                  if(var2 != 2) {
                     throw new IllegalStateException();
                  }

                  return 8;
               }

               return var1;
            }

            if(var2 != 2) {
               throw new IllegalStateException();
            }
         }

         return 1;
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3, "gb.f(" + ')');
      }
   }

   // $FF: renamed from: <init> (int) void
   void method_4654(int var1) {
      try {
         super();
         this.field_2690 = -35900281 * var1;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "gb.<init>(" + ')');
      }
   }

   // $FF: renamed from: d (int) void
   void method_4655(int var1) {
      try {
         byte[] var2 = new byte[this.field_2690 * -455192265 * this.field_2690 * -455192265];
         int var3 = 0;

         int var4;
         int var5;
         for(var4 = -455192265 * this.field_2690 - 1; var4 >= 0; --var4) {
            if(var1 == 794829134) {
               return;
            }

            for(var5 = -455192265 * this.field_2690 - 1; var5 >= 0; --var5) {
               if(var1 == 794829134) {
                  throw new IllegalStateException();
               }

               if(var5 >= var4 >> 1) {
                  if(var1 == 794829134) {
                     throw new IllegalStateException();
                  }

                  var2[var3] = -1;
               }

               ++var3;
            }
         }

         this.field_2693[4][0] = var2;
         var2 = new byte[this.field_2690 * -455192265 * -455192265 * this.field_2690];
         var3 = 0;

         for(var4 = this.field_2690 * -455192265 - 1; var4 >= 0; --var4) {
            for(var5 = 0; var5 < -455192265 * this.field_2690; ++var5) {
               if(var5 <= var4 << 1) {
                  if(var1 == 794829134) {
                     return;
                  }

                  var2[var3] = -1;
               }

               ++var3;
            }
         }

         this.field_2693[4][1] = var2;
         var2 = new byte[-455192265 * this.field_2690 * this.field_2690 * -455192265];
         var3 = 0;

         for(var4 = 0; var4 < this.field_2690 * -455192265; ++var4) {
            if(var1 == 794829134) {
               return;
            }

            for(var5 = 0; var5 < this.field_2690 * -455192265; ++var5) {
               if(var5 >= var4 >> 1) {
                  if(var1 == 794829134) {
                     throw new IllegalStateException();
                  }

                  var2[var3] = -1;
               }

               ++var3;
            }
         }

         this.field_2693[4][2] = var2;
         var2 = new byte[this.field_2690 * -455192265 * this.field_2690 * -455192265];
         var3 = 0;

         for(var4 = 0; var4 < -455192265 * this.field_2690; ++var4) {
            if(var1 == 794829134) {
               throw new IllegalStateException();
            }

            for(var5 = this.field_2690 * -455192265 - 1; var5 >= 0; --var5) {
               if(var1 == 794829134) {
                  throw new IllegalStateException();
               }

               if(var5 <= var4 << 1) {
                  if(var1 == 794829134) {
                     throw new IllegalStateException();
                  }

                  var2[var3] = -1;
               }

               ++var3;
            }
         }

         this.field_2693[4][3] = var2;
      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6, "gb.d(" + ')');
      }
   }

   // $FF: renamed from: j (int) void
   void method_4656(int var1) {
      try {
         byte[] var2 = new byte[-455192265 * this.field_2690 * this.field_2690 * -455192265];
         int var3 = 0;

         int var4;
         int var5;
         for(var4 = -455192265 * this.field_2690 - 1; var4 >= 0; --var4) {
            for(var5 = 0; var5 < -455192265 * this.field_2690; ++var5) {
               if(var1 <= -1083702967) {
                  throw new IllegalStateException();
               }

               if(var5 <= var4 >> 1) {
                  var2[var3] = -1;
               }

               ++var3;
            }
         }

         this.field_2693[1][0] = var2;
         var2 = new byte[this.field_2690 * -455192265 * -455192265 * this.field_2690];
         var3 = 0;

         for(var4 = 0; var4 < this.field_2690 * -455192265; ++var4) {
            if(var1 <= -1083702967) {
               throw new IllegalStateException();
            }

            for(var5 = 0; var5 < -455192265 * this.field_2690; ++var5) {
               if(var1 <= -1083702967) {
                  return;
               }

               if(var3 >= 0) {
                  if(var1 <= -1083702967) {
                     return;
                  }

                  if(var3 < var2.length) {
                     if(var5 >= var4 << 1) {
                        var2[var3] = -1;
                     }

                     ++var3;
                     continue;
                  }
               }

               ++var3;
            }
         }

         this.field_2693[1][1] = var2;
         var2 = new byte[-455192265 * this.field_2690 * -455192265 * this.field_2690];
         var3 = 0;

         for(var4 = 0; var4 < -455192265 * this.field_2690; ++var4) {
            if(var1 <= -1083702967) {
               throw new IllegalStateException();
            }

            for(var5 = this.field_2690 * -455192265 - 1; var5 >= 0; --var5) {
               if(var5 <= var4 >> 1) {
                  if(var1 <= -1083702967) {
                     throw new IllegalStateException();
                  }

                  var2[var3] = -1;
               }

               ++var3;
            }
         }

         this.field_2693[1][2] = var2;
         var2 = new byte[-455192265 * this.field_2690 * this.field_2690 * -455192265];
         var3 = 0;

         for(var4 = this.field_2690 * -455192265 - 1; var4 >= 0; --var4) {
            for(var5 = this.field_2690 * -455192265 - 1; var5 >= 0; --var5) {
               if(var5 >= var4 << 1) {
                  var2[var3] = -1;
               }

               ++var3;
            }
         }

         this.field_2693[1][3] = var2;
      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6, "gb.j(" + ')');
      }
   }

   // $FF: renamed from: r (int) void
   void method_4657(int var1) {
      try {
         byte[] var2 = new byte[-455192265 * this.field_2690 * -455192265 * this.field_2690];
         int var3 = 0;

         int var4;
         int var5;
         for(var4 = -455192265 * this.field_2690 - 1; var4 >= 0; --var4) {
            if(var1 == -1087727229) {
               throw new IllegalStateException();
            }

            for(var5 = this.field_2690 * -455192265 - 1; var5 >= 0; --var5) {
               if(var1 == -1087727229) {
                  throw new IllegalStateException();
               }

               if(var5 <= var4 >> 1) {
                  if(var1 == -1087727229) {
                     throw new IllegalStateException();
                  }

                  var2[var3] = -1;
               }

               ++var3;
            }
         }

         this.field_2693[2][0] = var2;
         var2 = new byte[-455192265 * this.field_2690 * -455192265 * this.field_2690];
         var3 = 0;

         for(var4 = -455192265 * this.field_2690 - 1; var4 >= 0; --var4) {
            if(var1 == -1087727229) {
               throw new IllegalStateException();
            }

            for(var5 = 0; var5 < -455192265 * this.field_2690; ++var5) {
               if(var5 >= var4 << 1) {
                  if(var1 == -1087727229) {
                     throw new IllegalStateException();
                  }

                  var2[var3] = -1;
               }

               ++var3;
            }
         }

         this.field_2693[2][1] = var2;
         var2 = new byte[this.field_2690 * -455192265 * this.field_2690 * -455192265];
         var3 = 0;

         for(var4 = 0; var4 < this.field_2690 * -455192265; ++var4) {
            if(var1 == -1087727229) {
               throw new IllegalStateException();
            }

            for(var5 = 0; var5 < this.field_2690 * -455192265; ++var5) {
               if(var1 == -1087727229) {
                  throw new IllegalStateException();
               }

               if(var5 <= var4 >> 1) {
                  if(var1 == -1087727229) {
                     return;
                  }

                  var2[var3] = -1;
               }

               ++var3;
            }
         }

         this.field_2693[2][2] = var2;
         var2 = new byte[-455192265 * this.field_2690 * -455192265 * this.field_2690];
         var3 = 0;

         for(var4 = 0; var4 < -455192265 * this.field_2690; ++var4) {
            if(var1 == -1087727229) {
               return;
            }

            for(var5 = -455192265 * this.field_2690 - 1; var5 >= 0; --var5) {
               if(var1 == -1087727229) {
                  throw new IllegalStateException();
               }

               if(var5 >= var4 << 1) {
                  if(var1 == -1087727229) {
                     throw new IllegalStateException();
                  }

                  var2[var3] = -1;
               }

               ++var3;
            }
         }

         this.field_2693[2][3] = var2;
      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6, "gb.r(" + ')');
      }
   }

   // $FF: renamed from: g (int, int) int
   int method_4658(int var1, int var2) {
      if(var2 == 9) {
         var1 = 1 + var1 & 3;
      }

      if(10 == var2) {
         var1 = 3 + var1 & 3;
      }

      if(var2 == 11) {
         var1 = var1 + 3 & 3;
      }

      return var1;
   }

   // $FF: renamed from: b (int) void
   void method_4659(int var1) {
      try {
         byte[] var2 = new byte[-455192265 * this.field_2690 * -455192265 * this.field_2690];
         int var3 = 0;

         int var4;
         int var5;
         for(var4 = -455192265 * this.field_2690 - 1; var4 >= 0; --var4) {
            if(var1 == -939468839) {
               throw new IllegalStateException();
            }

            for(var5 = 0; var5 < this.field_2690 * -455192265; ++var5) {
               if(var5 >= var4 >> 1) {
                  if(var1 == -939468839) {
                     throw new IllegalStateException();
                  }

                  var2[var3] = -1;
               }

               ++var3;
            }
         }

         this.field_2693[3][0] = var2;
         var2 = new byte[-455192265 * this.field_2690 * -455192265 * this.field_2690];
         var3 = 0;

         for(var4 = 0; var4 < this.field_2690 * -455192265; ++var4) {
            if(var1 == -939468839) {
               return;
            }

            for(var5 = 0; var5 < this.field_2690 * -455192265; ++var5) {
               if(var5 <= var4 << 1) {
                  if(var1 == -939468839) {
                     throw new IllegalStateException();
                  }

                  var2[var3] = -1;
               }

               ++var3;
            }
         }

         this.field_2693[3][1] = var2;
         var2 = new byte[this.field_2690 * -455192265 * -455192265 * this.field_2690];
         var3 = 0;

         for(var4 = 0; var4 < -455192265 * this.field_2690; ++var4) {
            if(var1 == -939468839) {
               throw new IllegalStateException();
            }

            for(var5 = this.field_2690 * -455192265 - 1; var5 >= 0; --var5) {
               if(var1 == -939468839) {
                  throw new IllegalStateException();
               }

               if(var5 >= var4 >> 1) {
                  var2[var3] = -1;
               }

               ++var3;
            }
         }

         this.field_2693[3][2] = var2;
         var2 = new byte[-455192265 * this.field_2690 * this.field_2690 * -455192265];
         var3 = 0;

         for(var4 = this.field_2690 * -455192265 - 1; var4 >= 0; --var4) {
            for(var5 = this.field_2690 * -455192265 - 1; var5 >= 0; --var5) {
               if(var1 == -939468839) {
                  throw new IllegalStateException();
               }

               if(var5 <= var4 << 1) {
                  var2[var3] = -1;
               }

               ++var3;
            }
         }

         this.field_2693[3][3] = var2;
      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6, "gb.b(" + ')');
      }
   }

   // $FF: renamed from: s (int) void
   void method_4660(int var1) {
      try {
         byte[] var10000 = new byte[-455192265 * this.field_2690 * this.field_2690 * -455192265];
         boolean var3 = false;
         byte[] var2 = new byte[this.field_2690 * -455192265 * -455192265 * this.field_2690];
         int var7 = 0;

         int var4;
         int var5;
         for(var4 = 0; var4 < this.field_2690 * -455192265; ++var4) {
            if(var1 >= 642012801) {
               throw new IllegalStateException();
            }

            for(var5 = 0; var5 < -455192265 * this.field_2690; ++var5) {
               if(var1 >= 642012801) {
                  throw new IllegalStateException();
               }

               if(var5 <= this.field_2690 * -455192265 / 2) {
                  if(var1 >= 642012801) {
                     throw new IllegalStateException();
                  }

                  var2[var7] = -1;
               }

               ++var7;
            }
         }

         this.field_2693[5][0] = var2;
         var2 = new byte[this.field_2690 * -455192265 * -455192265 * this.field_2690];
         var7 = 0;

         for(var4 = 0; var4 < -455192265 * this.field_2690; ++var4) {
            for(var5 = 0; var5 < this.field_2690 * -455192265; ++var5) {
               if(var1 >= 642012801) {
                  throw new IllegalStateException();
               }

               if(var4 <= this.field_2690 * -455192265 / 2) {
                  if(var1 >= 642012801) {
                     return;
                  }

                  var2[var7] = -1;
               }

               ++var7;
            }
         }

         this.field_2693[5][1] = var2;
         var2 = new byte[this.field_2690 * -455192265 * -455192265 * this.field_2690];
         var7 = 0;

         for(var4 = 0; var4 < this.field_2690 * -455192265; ++var4) {
            if(var1 >= 642012801) {
               throw new IllegalStateException();
            }

            for(var5 = 0; var5 < -455192265 * this.field_2690; ++var5) {
               if(var5 >= this.field_2690 * -455192265 / 2) {
                  if(var1 >= 642012801) {
                     throw new IllegalStateException();
                  }

                  var2[var7] = -1;
               }

               ++var7;
            }
         }

         this.field_2693[5][2] = var2;
         var2 = new byte[this.field_2690 * -455192265 * this.field_2690 * -455192265];
         var7 = 0;

         for(var4 = 0; var4 < this.field_2690 * -455192265; ++var4) {
            if(var1 >= 642012801) {
               throw new IllegalStateException();
            }

            for(var5 = 0; var5 < this.field_2690 * -455192265; ++var5) {
               if(var1 >= 642012801) {
                  return;
               }

               if(var4 >= -455192265 * this.field_2690 / 2) {
                  if(var1 >= 642012801) {
                     throw new IllegalStateException();
                  }

                  var2[var7] = -1;
               }

               ++var7;
            }
         }

         this.field_2693[5][3] = var2;
      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6, "gb.s(" + ')');
      }
   }

   // $FF: renamed from: c (int, int, int, int, int, int, int, int) void
   void method_4661(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if(var7 != 0 && -455192265 * this.field_2690 != 0 && null != this.field_2693) {
         var8 = this.method_4664(var8, var7, -2042087825);
         var7 = this.method_4653(var7, (byte)2);
         class_65.method_669(var1, var2, var5, var6, var3, var4, this.field_2693[var7 - 1][var8], -455192265 * this.field_2690, true);
      }
   }

   // $FF: renamed from: l (byte) void
   void method_4662(byte var1) {
      try {
         byte[] var10000 = new byte[this.field_2690 * -455192265 * this.field_2690 * -455192265];
         boolean var3 = false;
         byte[] var2 = new byte[-455192265 * this.field_2690 * this.field_2690 * -455192265];
         int var7 = 0;

         int var4;
         int var5;
         for(var4 = 0; var4 < -455192265 * this.field_2690; ++var4) {
            if(var1 <= 0) {
               throw new IllegalStateException();
            }

            for(var5 = 0; var5 < this.field_2690 * -455192265; ++var5) {
               if(var5 >= var4 - -455192265 * this.field_2690 / 2) {
                  if(var1 <= 0) {
                     throw new IllegalStateException();
                  }

                  var2[var7] = -1;
               }

               ++var7;
            }
         }

         this.field_2693[7][0] = var2;
         var2 = new byte[-455192265 * this.field_2690 * -455192265 * this.field_2690];
         var7 = 0;

         for(var4 = this.field_2690 * -455192265 - 1; var4 >= 0; --var4) {
            if(var1 <= 0) {
               throw new IllegalStateException();
            }

            for(var5 = 0; var5 < this.field_2690 * -455192265; ++var5) {
               if(var1 <= 0) {
                  return;
               }

               if(var5 >= var4 - -455192265 * this.field_2690 / 2) {
                  var2[var7] = -1;
               }

               ++var7;
            }
         }

         this.field_2693[7][1] = var2;
         var2 = new byte[-455192265 * this.field_2690 * this.field_2690 * -455192265];
         var7 = 0;

         for(var4 = this.field_2690 * -455192265 - 1; var4 >= 0; --var4) {
            if(var1 <= 0) {
               throw new IllegalStateException();
            }

            for(var5 = -455192265 * this.field_2690 - 1; var5 >= 0; --var5) {
               if(var1 <= 0) {
                  return;
               }

               if(var5 >= var4 - this.field_2690 * -455192265 / 2) {
                  if(var1 <= 0) {
                     throw new IllegalStateException();
                  }

                  var2[var7] = -1;
               }

               ++var7;
            }
         }

         this.field_2693[7][2] = var2;
         var2 = new byte[-455192265 * this.field_2690 * -455192265 * this.field_2690];
         var7 = 0;

         for(var4 = 0; var4 < -455192265 * this.field_2690; ++var4) {
            for(var5 = this.field_2690 * -455192265 - 1; var5 >= 0; --var5) {
               if(var1 <= 0) {
                  throw new IllegalStateException();
               }

               if(var5 >= var4 - -455192265 * this.field_2690 / 2) {
                  if(var1 <= 0) {
                     throw new IllegalStateException();
                  }

                  var2[var7] = -1;
               }

               ++var7;
            }
         }

         this.field_2693[7][3] = var2;
      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6, "gb.l(" + ')');
      }
   }

   // $FF: renamed from: o (int, int, int, int, int, int, int, int) void
   void method_4663(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if(var7 != 0 && -1297249049 * this.field_2690 != 0 && null != this.field_2693) {
         var8 = this.method_4664(var8, var7, -2044614743);
         var7 = this.method_4653(var7, (byte)2);
         class_65.method_669(var1, var2, var5, var6, var3, var4, this.field_2693[var7 - 1][var8], -455192265 * this.field_2690, true);
      }
   }

   // $FF: renamed from: n (int, int, int) int
   int method_4664(int var1, int var2, int var3) {
      try {
         if(var2 == 9) {
            if(var3 >= -1975995241) {
               throw new IllegalStateException();
            }

            var1 = 1 + var1 & 3;
         }

         if(10 == var2) {
            if(var3 >= -1975995241) {
               throw new IllegalStateException();
            }

            var1 = 3 + var1 & 3;
         }

         if(var2 == 11) {
            if(var3 >= -1975995241) {
               throw new IllegalStateException();
            }

            var1 = var1 + 3 & 3;
         }

         return var1;
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4, "gb.n(" + ')');
      }
   }

   // $FF: renamed from: al () void
   void method_4665() {
      byte[] var10000 = new byte[-455192265 * this.field_2690 * -455192265 * this.field_2690];
      boolean var2 = false;
      byte[] var1 = new byte[this.field_2690 * -455192265 * -455192265 * this.field_2690];
      int var5 = 0;

      int var3;
      int var4;
      for(var3 = 0; var3 < -455192265 * this.field_2690; ++var3) {
         for(var4 = 0; var4 < this.field_2690 * -455192265; ++var4) {
            if(var4 <= var3 - -455192265 * this.field_2690 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field_2693[6][0] = var1;
      var1 = new byte[-455192265 * this.field_2690 * this.field_2690 * -455192265];
      var5 = 0;

      for(var3 = -455192265 * this.field_2690 - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < this.field_2690 * -455192265; ++var4) {
            if(var4 <= var3 - this.field_2690 * -455192265 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field_2693[6][1] = var1;
      var1 = new byte[this.field_2690 * -455192265 * this.field_2690 * -455192265];
      var5 = 0;

      for(var3 = this.field_2690 * -455192265 - 1; var3 >= 0; --var3) {
         for(var4 = this.field_2690 * -455192265 - 1; var4 >= 0; --var4) {
            if(var4 <= var3 - -455192265 * this.field_2690 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field_2693[6][2] = var1;
      var1 = new byte[this.field_2690 * -455192265 * -455192265 * this.field_2690];
      var5 = 0;

      for(var3 = 0; var3 < -455192265 * this.field_2690; ++var3) {
         for(var4 = -455192265 * this.field_2690 - 1; var4 >= 0; --var4) {
            if(var4 <= var3 - -455192265 * this.field_2690 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field_2693[6][3] = var1;
   }

   // $FF: renamed from: z () void
   void method_4666() {
      byte[] var1 = new byte[this.field_2690 * -455192265 * -455192265 * this.field_2690];
      int var2 = 0;

      int var3;
      int var4;
      for(var3 = 0; var3 < -455192265 * this.field_2690; ++var3) {
         for(var4 = 0; var4 < this.field_2690 * -545756905; ++var4) {
            if(var4 <= var3) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field_2693[0][0] = var1;
      var1 = new byte[-932165824 * this.field_2690 * this.field_2690 * -645787511];
      var2 = 0;

      for(var3 = this.field_2690 * -39100867 - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < -10420973 * this.field_2690; ++var4) {
            if(var4 <= var3) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field_2693[0][1] = var1;
      var1 = new byte[-455192265 * this.field_2690 * 2144442804 * this.field_2690];
      var2 = 0;

      for(var3 = 0; var3 < -1188758949 * this.field_2690; ++var3) {
         for(var4 = 0; var4 < this.field_2690 * -1471366146; ++var4) {
            if(var4 >= var3) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field_2693[0][2] = var1;
      var1 = new byte[this.field_2690 * -1216615262 * this.field_2690 * 1895561923];
      var2 = 0;

      for(var3 = this.field_2690 * -455192265 - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < this.field_2690 * -455192265; ++var4) {
            if(var4 >= var3) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field_2693[0][3] = var1;
   }

   // $FF: renamed from: a (int) int
   int method_4667(int var1) {
      return var1 != 9 && 10 != var1?(var1 == 11?8:var1):1;
   }

   // $FF: renamed from: k (int) int
   int method_4668(int var1) {
      return var1 != 9 && 10 != var1?(var1 == 11?8:var1):1;
   }

   // $FF: renamed from: m () void
   void method_4669() {
      if(this.field_2693 == null) {
         this.field_2693 = new byte[8][4][];
         this.method_4650(-1354099121);
         this.method_4656(1284019799);
         this.method_4657(-1466932674);
         this.method_4659(57756701);
         this.method_4655(1493383620);
         this.method_4660(-120472511);
         this.method_4652(363698173);
         this.method_4662((byte)103);
      }
   }

   // $FF: renamed from: x () void
   void method_4670() {
      if(this.field_2693 == null) {
         this.field_2693 = new byte[8][4][];
         this.method_4650(-11794038);
         this.method_4656(742445603);
         this.method_4657(884206138);
         this.method_4659(1571091862);
         this.method_4655(432899316);
         this.method_4660(488675511);
         this.method_4652(-450662955);
         this.method_4662((byte)115);
      }
   }

   // $FF: renamed from: w () void
   void method_4671() {
      byte[] var1 = new byte[370570320 * this.field_2690 * -455192265 * this.field_2690];
      int var2 = 0;

      int var3;
      int var4;
      for(var3 = -455192265 * this.field_2690 - 1; var3 >= 0; --var3) {
         for(var4 = this.field_2690 * -126434622 - 1; var4 >= 0; --var4) {
            if(var4 <= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field_2693[2][0] = var1;
      var1 = new byte[-455192265 * this.field_2690 * 674416179 * this.field_2690];
      var2 = 0;

      for(var3 = -455192265 * this.field_2690 - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < -455192265 * this.field_2690; ++var4) {
            if(var4 >= var3 << 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field_2693[2][1] = var1;
      var1 = new byte[this.field_2690 * -455192265 * this.field_2690 * -455192265];
      var2 = 0;

      for(var3 = 0; var3 < this.field_2690 * -1035029712; ++var3) {
         for(var4 = 0; var4 < this.field_2690 * -455192265; ++var4) {
            if(var4 <= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field_2693[2][2] = var1;
      var1 = new byte[924855872 * this.field_2690 * -1331652489 * this.field_2690];
      var2 = 0;

      for(var3 = 0; var3 < -455192265 * this.field_2690; ++var3) {
         for(var4 = -466793737 * this.field_2690 - 1; var4 >= 0; --var4) {
            if(var4 >= var3 << 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field_2693[2][3] = var1;
   }

   // $FF: renamed from: ap () void
   void method_4672() {
      byte[] var10000 = new byte[-455192265 * this.field_2690 * this.field_2690 * -1011469589];
      boolean var2 = false;
      byte[] var1 = new byte[this.field_2690 * -2005772514 * -455192265 * this.field_2690];
      int var5 = 0;

      int var3;
      int var4;
      for(var3 = 0; var3 < this.field_2690 * -455192265; ++var3) {
         for(var4 = 0; var4 < -455192265 * this.field_2690; ++var4) {
            if(var4 <= this.field_2690 * -455192265 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field_2693[5][0] = var1;
      var1 = new byte[this.field_2690 * 1832849539 * -455192265 * this.field_2690];
      var5 = 0;

      for(var3 = 0; var3 < -1361888612 * this.field_2690; ++var3) {
         for(var4 = 0; var4 < this.field_2690 * -455192265; ++var4) {
            if(var3 <= this.field_2690 * -1893952121 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field_2693[5][1] = var1;
      var1 = new byte[this.field_2690 * -998976228 * -455192265 * this.field_2690];
      var5 = 0;

      for(var3 = 0; var3 < this.field_2690 * 956607950; ++var3) {
         for(var4 = 0; var4 < -455192265 * this.field_2690; ++var4) {
            if(var4 >= this.field_2690 * 1368312731 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field_2693[5][2] = var1;
      var1 = new byte[this.field_2690 * -455192265 * this.field_2690 * -455192265];
      var5 = 0;

      for(var3 = 0; var3 < this.field_2690 * -455192265; ++var3) {
         for(var4 = 0; var4 < this.field_2690 * -455192265; ++var4) {
            if(var3 >= -1425341877 * this.field_2690 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field_2693[5][3] = var1;
   }

   // $FF: renamed from: t () void
   void method_4673() {
      byte[] var1 = new byte[-455192265 * this.field_2690 * 1001969688 * this.field_2690];
      int var2 = 0;

      int var3;
      int var4;
      for(var3 = -455192265 * this.field_2690 - 1; var3 >= 0; --var3) {
         for(var4 = this.field_2690 * -2100873405 - 1; var4 >= 0; --var4) {
            if(var4 <= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field_2693[2][0] = var1;
      var1 = new byte[-455192265 * this.field_2690 * -455192265 * this.field_2690];
      var2 = 0;

      for(var3 = -923466706 * this.field_2690 - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < -1698448063 * this.field_2690; ++var4) {
            if(var4 >= var3 << 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field_2693[2][1] = var1;
      var1 = new byte[this.field_2690 * -977179681 * this.field_2690 * 1559021773];
      var2 = 0;

      for(var3 = 0; var3 < this.field_2690 * -1987995572; ++var3) {
         for(var4 = 0; var4 < this.field_2690 * -455192265; ++var4) {
            if(var4 <= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field_2693[2][2] = var1;
      var1 = new byte[-1626291156 * this.field_2690 * 1067054533 * this.field_2690];
      var2 = 0;

      for(var3 = 0; var3 < -99945912 * this.field_2690; ++var3) {
         for(var4 = 249988949 * this.field_2690 - 1; var4 >= 0; --var4) {
            if(var4 >= var3 << 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field_2693[2][3] = var1;
   }

   // $FF: renamed from: e (int, int) int
   int method_4674(int var1, int var2) {
      if(var2 == 9) {
         var1 = 1 + var1 & 3;
      }

      if(10 == var2) {
         var1 = 3 + var1 & 3;
      }

      if(var2 == 11) {
         var1 = var1 + 3 & 3;
      }

      return var1;
   }

   // $FF: renamed from: q () void
   void method_4675() {
      byte[] var1 = new byte[-455192265 * this.field_2690 * 1758245709 * this.field_2690];
      int var2 = 0;

      int var3;
      int var4;
      for(var3 = -123261428 * this.field_2690 - 1; var3 >= 0; --var3) {
         for(var4 = this.field_2690 * -455192265 - 1; var4 >= 0; --var4) {
            if(var4 <= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field_2693[2][0] = var1;
      var1 = new byte[-455192265 * this.field_2690 * -144911901 * this.field_2690];
      var2 = 0;

      for(var3 = 1932373433 * this.field_2690 - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < 1502045557 * this.field_2690; ++var4) {
            if(var4 >= var3 << 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field_2693[2][1] = var1;
      var1 = new byte[this.field_2690 * -303228360 * this.field_2690 * -1822280602];
      var2 = 0;

      for(var3 = 0; var3 < this.field_2690 * -455192265; ++var3) {
         for(var4 = 0; var4 < this.field_2690 * -455192265; ++var4) {
            if(var4 <= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field_2693[2][2] = var1;
      var1 = new byte[-455192265 * this.field_2690 * 1816560926 * this.field_2690];
      var2 = 0;

      for(var3 = 0; var3 < 755905900 * this.field_2690; ++var3) {
         for(var4 = 112088135 * this.field_2690 - 1; var4 >= 0; --var4) {
            if(var4 >= var3 << 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field_2693[2][3] = var1;
   }

   // $FF: renamed from: i () void
   void method_4676() {
      byte[] var1 = new byte[-455192265 * this.field_2690 * -455192265 * this.field_2690];
      int var2 = 0;

      int var3;
      int var4;
      for(var3 = -455192265 * this.field_2690 - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < this.field_2690 * -455192265; ++var4) {
            if(var4 >= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field_2693[3][0] = var1;
      var1 = new byte[-455192265 * this.field_2690 * -455192265 * this.field_2690];
      var2 = 0;

      for(var3 = 0; var3 < this.field_2690 * -455192265; ++var3) {
         for(var4 = 0; var4 < this.field_2690 * -455192265; ++var4) {
            if(var4 <= var3 << 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field_2693[3][1] = var1;
      var1 = new byte[this.field_2690 * -455192265 * -455192265 * this.field_2690];
      var2 = 0;

      for(var3 = 0; var3 < -455192265 * this.field_2690; ++var3) {
         for(var4 = this.field_2690 * -455192265 - 1; var4 >= 0; --var4) {
            if(var4 >= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field_2693[3][2] = var1;
      var1 = new byte[-455192265 * this.field_2690 * this.field_2690 * -455192265];
      var2 = 0;

      for(var3 = this.field_2690 * -455192265 - 1; var3 >= 0; --var3) {
         for(var4 = this.field_2690 * -455192265 - 1; var4 >= 0; --var4) {
            if(var4 <= var3 << 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field_2693[3][3] = var1;
   }

   // $FF: renamed from: ae () void
   void method_4677() {
      byte[] var1 = new byte[this.field_2690 * -455192265 * this.field_2690 * -455192265];
      int var2 = 0;

      int var3;
      int var4;
      for(var3 = -455192265 * this.field_2690 - 1; var3 >= 0; --var3) {
         for(var4 = -455192265 * this.field_2690 - 1; var4 >= 0; --var4) {
            if(var4 >= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field_2693[4][0] = var1;
      var1 = new byte[this.field_2690 * -455192265 * -455192265 * this.field_2690];
      var2 = 0;

      for(var3 = this.field_2690 * -455192265 - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < -455192265 * this.field_2690; ++var4) {
            if(var4 <= var3 << 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field_2693[4][1] = var1;
      var1 = new byte[-455192265 * this.field_2690 * this.field_2690 * -455192265];
      var2 = 0;

      for(var3 = 0; var3 < this.field_2690 * -455192265; ++var3) {
         for(var4 = 0; var4 < this.field_2690 * -455192265; ++var4) {
            if(var4 >= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field_2693[4][2] = var1;
      var1 = new byte[this.field_2690 * -455192265 * this.field_2690 * -455192265];
      var2 = 0;

      for(var3 = 0; var3 < -455192265 * this.field_2690; ++var3) {
         for(var4 = this.field_2690 * -455192265 - 1; var4 >= 0; --var4) {
            if(var4 <= var3 << 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field_2693[4][3] = var1;
   }

   // $FF: renamed from: y (byte) void
   void method_4678(byte var1) {
      try {
         if(this.field_2693 == null) {
            this.field_2693 = new byte[8][4][];
            this.method_4650(1080825248);
            this.method_4656(801681003);
            this.method_4657(1431897073);
            this.method_4659(-1131330964);
            this.method_4655(517266785);
            this.method_4660(-1671132761);
            this.method_4652(732319141);
            this.method_4662((byte)83);
         }
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "gb.y(" + ')');
      }
   }

   // $FF: renamed from: ab () void
   void method_4679() {
      byte[] var10000 = new byte[-455192265 * this.field_2690 * this.field_2690 * -455192265];
      boolean var2 = false;
      byte[] var1 = new byte[this.field_2690 * -455192265 * -455192265 * this.field_2690];
      int var5 = 0;

      int var3;
      int var4;
      for(var3 = 0; var3 < this.field_2690 * -455192265; ++var3) {
         for(var4 = 0; var4 < -455192265 * this.field_2690; ++var4) {
            if(var4 <= this.field_2690 * -455192265 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field_2693[5][0] = var1;
      var1 = new byte[this.field_2690 * -455192265 * -455192265 * this.field_2690];
      var5 = 0;

      for(var3 = 0; var3 < -455192265 * this.field_2690; ++var3) {
         for(var4 = 0; var4 < this.field_2690 * -455192265; ++var4) {
            if(var3 <= this.field_2690 * -455192265 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field_2693[5][1] = var1;
      var1 = new byte[this.field_2690 * -455192265 * -455192265 * this.field_2690];
      var5 = 0;

      for(var3 = 0; var3 < this.field_2690 * -455192265; ++var3) {
         for(var4 = 0; var4 < -455192265 * this.field_2690; ++var4) {
            if(var4 >= this.field_2690 * -455192265 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field_2693[5][2] = var1;
      var1 = new byte[this.field_2690 * -455192265 * this.field_2690 * -455192265];
      var5 = 0;

      for(var3 = 0; var3 < this.field_2690 * -455192265; ++var3) {
         for(var4 = 0; var4 < this.field_2690 * -455192265; ++var4) {
            if(var3 >= -455192265 * this.field_2690 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field_2693[5][3] = var1;
   }

   // $FF: renamed from: h () void
   void method_4680() {
      byte[] var1 = new byte[-455192265 * this.field_2690 * -455192265 * this.field_2690];
      int var2 = 0;

      int var3;
      int var4;
      for(var3 = -455192265 * this.field_2690 - 1; var3 >= 0; --var3) {
         for(var4 = this.field_2690 * -455192265 - 1; var4 >= 0; --var4) {
            if(var4 <= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field_2693[2][0] = var1;
      var1 = new byte[-455192265 * this.field_2690 * -455192265 * this.field_2690];
      var2 = 0;

      for(var3 = -455192265 * this.field_2690 - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < -455192265 * this.field_2690; ++var4) {
            if(var4 >= var3 << 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field_2693[2][1] = var1;
      var1 = new byte[this.field_2690 * -455192265 * this.field_2690 * -455192265];
      var2 = 0;

      for(var3 = 0; var3 < this.field_2690 * -455192265; ++var3) {
         for(var4 = 0; var4 < this.field_2690 * -455192265; ++var4) {
            if(var4 <= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field_2693[2][2] = var1;
      var1 = new byte[-455192265 * this.field_2690 * -455192265 * this.field_2690];
      var2 = 0;

      for(var3 = 0; var3 < -455192265 * this.field_2690; ++var3) {
         for(var4 = -455192265 * this.field_2690 - 1; var4 >= 0; --var4) {
            if(var4 >= var3 << 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field_2693[2][3] = var1;
   }

   // $FF: renamed from: ad () void
   void method_4681() {
      byte[] var10000 = new byte[140150070 * this.field_2690 * 643996267 * this.field_2690];
      boolean var2 = false;
      byte[] var1 = new byte[this.field_2690 * -455192265 * -455192265 * this.field_2690];
      int var5 = 0;

      int var3;
      int var4;
      for(var3 = 0; var3 < -455192265 * this.field_2690; ++var3) {
         for(var4 = 0; var4 < this.field_2690 * -1367617387; ++var4) {
            if(var4 <= var3 - -455192265 * this.field_2690 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field_2693[6][0] = var1;
      var1 = new byte[-455192265 * this.field_2690 * this.field_2690 * -312946003];
      var5 = 0;

      for(var3 = -455192265 * this.field_2690 - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < this.field_2690 * -1436177191; ++var4) {
            if(var4 <= var3 - this.field_2690 * -455192265 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field_2693[6][1] = var1;
      var1 = new byte[this.field_2690 * 425469483 * this.field_2690 * -455192265];
      var5 = 0;

      for(var3 = this.field_2690 * 139573681 - 1; var3 >= 0; --var3) {
         for(var4 = this.field_2690 * 2696598 - 1; var4 >= 0; --var4) {
            if(var4 <= var3 - -1642872778 * this.field_2690 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field_2693[6][2] = var1;
      var1 = new byte[this.field_2690 * -455192265 * -742086629 * this.field_2690];
      var5 = 0;

      for(var3 = 0; var3 < -563512480 * this.field_2690; ++var3) {
         for(var4 = -455192265 * this.field_2690 - 1; var4 >= 0; --var4) {
            if(var4 <= var3 - -1872352320 * this.field_2690 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field_2693[6][3] = var1;
   }

   // $FF: renamed from: ai () void
   void method_4682() {
      byte[] var10000 = new byte[-455192265 * this.field_2690 * -455192265 * this.field_2690];
      boolean var2 = false;
      byte[] var1 = new byte[this.field_2690 * -455192265 * -455192265 * this.field_2690];
      int var5 = 0;

      int var3;
      int var4;
      for(var3 = 0; var3 < -455192265 * this.field_2690; ++var3) {
         for(var4 = 0; var4 < this.field_2690 * -455192265; ++var4) {
            if(var4 <= var3 - -455192265 * this.field_2690 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field_2693[6][0] = var1;
      var1 = new byte[-455192265 * this.field_2690 * this.field_2690 * -455192265];
      var5 = 0;

      for(var3 = -455192265 * this.field_2690 - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < this.field_2690 * -455192265; ++var4) {
            if(var4 <= var3 - this.field_2690 * -455192265 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field_2693[6][1] = var1;
      var1 = new byte[this.field_2690 * -455192265 * this.field_2690 * -455192265];
      var5 = 0;

      for(var3 = this.field_2690 * -455192265 - 1; var3 >= 0; --var3) {
         for(var4 = this.field_2690 * -455192265 - 1; var4 >= 0; --var4) {
            if(var4 <= var3 - -455192265 * this.field_2690 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field_2693[6][2] = var1;
      var1 = new byte[this.field_2690 * -455192265 * -455192265 * this.field_2690];
      var5 = 0;

      for(var3 = 0; var3 < -455192265 * this.field_2690; ++var3) {
         for(var4 = -455192265 * this.field_2690 - 1; var4 >= 0; --var4) {
            if(var4 <= var3 - -455192265 * this.field_2690 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field_2693[6][3] = var1;
   }

   // $FF: renamed from: ar () void
   void method_4683() {
      byte[] var10000 = new byte[-455192265 * this.field_2690 * -455192265 * this.field_2690];
      boolean var2 = false;
      byte[] var1 = new byte[this.field_2690 * -455192265 * -455192265 * this.field_2690];
      int var5 = 0;

      int var3;
      int var4;
      for(var3 = 0; var3 < -455192265 * this.field_2690; ++var3) {
         for(var4 = 0; var4 < this.field_2690 * -455192265; ++var4) {
            if(var4 <= var3 - -455192265 * this.field_2690 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field_2693[6][0] = var1;
      var1 = new byte[-455192265 * this.field_2690 * this.field_2690 * -455192265];
      var5 = 0;

      for(var3 = -455192265 * this.field_2690 - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < this.field_2690 * -455192265; ++var4) {
            if(var4 <= var3 - this.field_2690 * -455192265 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field_2693[6][1] = var1;
      var1 = new byte[this.field_2690 * -455192265 * this.field_2690 * -455192265];
      var5 = 0;

      for(var3 = this.field_2690 * -455192265 - 1; var3 >= 0; --var3) {
         for(var4 = this.field_2690 * -455192265 - 1; var4 >= 0; --var4) {
            if(var4 <= var3 - -455192265 * this.field_2690 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field_2693[6][2] = var1;
      var1 = new byte[this.field_2690 * -455192265 * -455192265 * this.field_2690];
      var5 = 0;

      for(var3 = 0; var3 < -455192265 * this.field_2690; ++var3) {
         for(var4 = -455192265 * this.field_2690 - 1; var4 >= 0; --var4) {
            if(var4 <= var3 - -455192265 * this.field_2690 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field_2693[6][3] = var1;
   }

   // $FF: renamed from: ag () void
   void method_4684() {
      byte[] var10000 = new byte[this.field_2690 * -455192265 * this.field_2690 * -455192265];
      boolean var2 = false;
      byte[] var1 = new byte[-455192265 * this.field_2690 * this.field_2690 * -455192265];
      int var5 = 0;

      int var3;
      int var4;
      for(var3 = 0; var3 < -455192265 * this.field_2690; ++var3) {
         for(var4 = 0; var4 < this.field_2690 * -455192265; ++var4) {
            if(var4 >= var3 - -455192265 * this.field_2690 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field_2693[7][0] = var1;
      var1 = new byte[-455192265 * this.field_2690 * -455192265 * this.field_2690];
      var5 = 0;

      for(var3 = this.field_2690 * -455192265 - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < this.field_2690 * -455192265; ++var4) {
            if(var4 >= var3 - -455192265 * this.field_2690 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field_2693[7][1] = var1;
      var1 = new byte[-455192265 * this.field_2690 * this.field_2690 * -455192265];
      var5 = 0;

      for(var3 = this.field_2690 * -455192265 - 1; var3 >= 0; --var3) {
         for(var4 = -455192265 * this.field_2690 - 1; var4 >= 0; --var4) {
            if(var4 >= var3 - this.field_2690 * -455192265 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field_2693[7][2] = var1;
      var1 = new byte[-455192265 * this.field_2690 * -455192265 * this.field_2690];
      var5 = 0;

      for(var3 = 0; var3 < -455192265 * this.field_2690; ++var3) {
         for(var4 = this.field_2690 * -455192265 - 1; var4 >= 0; --var4) {
            if(var4 >= var3 - -455192265 * this.field_2690 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field_2693[7][3] = var1;
   }
}
