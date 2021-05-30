
// $FF: renamed from: fz
public class class_240 {

   // $FF: renamed from: b int
   static final int field_2669 = 128;
   // $FF: renamed from: p int
   static final int field_2670 = 16;
   // $FF: renamed from: ar int
   public static final int field_2671 = 16;
   // $FF: renamed from: u int
   static final int field_2672 = 1024;
   // $FF: renamed from: o int
   static final int field_2673 = 4096;
   // $FF: renamed from: ag int
   int field_2674;
   // $FF: renamed from: v int
   static final int field_2675 = 1;
   // $FF: renamed from: e int
   static final int field_2676 = 16384;
   // $FF: renamed from: as int
   int field_2677;
   // $FF: renamed from: aj int
   int field_2678;
   // $FF: renamed from: am int[][]
   public int[][] field_2679;
   // $FF: renamed from: dq jp
   static class_307 field_2680;
   // $FF: renamed from: ax int
   int field_2681;


   // $FF: renamed from: s (int, int, int) void
   public void method_4608(int var1, int var2, int var3) {
      try {
         var1 -= 280751135 * this.field_2674;
         var2 -= -992681321 * this.field_2681;
         this.field_2679[var1][var2] &= -262145;
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4, "fz.s(" + ')');
      }
   }

   // $FF: renamed from: v (int) void
   public void method_4609(int var1) {
      try {
         for(int var2 = 0; var2 < 960002853 * this.field_2677; ++var2) {
            if(var1 <= 1288048061) {
               throw new IllegalStateException();
            }

            for(int var3 = 0; var3 < this.field_2678 * 1646122993; ++var3) {
               if(var2 != 0) {
                  if(var1 <= 1288048061) {
                     throw new IllegalStateException();
                  }

                  if(0 != var3) {
                     if(var1 <= 1288048061) {
                        throw new IllegalStateException();
                     }

                     if(var2 < 960002853 * this.field_2677 - 5 && var3 < this.field_2678 * 1646122993 - 5) {
                        this.field_2679[var2][var3] = 16777216;
                        continue;
                     }
                  }
               }

               this.field_2679[var2][var3] = 16777215;
            }
         }

      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4, "fz.v(" + ')');
      }
   }

   // $FF: renamed from: h (int, int, int, int, boolean) void
   public void method_4610(int var1, int var2, int var3, int var4, boolean var5) {
      var1 -= this.field_2674 * 280751135;
      var2 -= -992681321 * this.field_2681;
      if(var3 == 0) {
         if(0 == var4) {
            this.method_4617(var1, var2, 128, -308385855);
            this.method_4617(var1 - 1, var2, 8, -308385855);
         }

         if(var4 == 1) {
            this.method_4617(var1, var2, 2, -308385855);
            this.method_4617(var1, 1 + var2, 32, -308385855);
         }

         if(var4 == 2) {
            this.method_4617(var1, var2, 8, -308385855);
            this.method_4617(1 + var1, var2, 128, -308385855);
         }

         if(var4 == 3) {
            this.method_4617(var1, var2, 32, -308385855);
            this.method_4617(var1, var2 - 1, 2, -308385855);
         }
      }

      if(var3 == 1 || var3 == 3) {
         if(0 == var4) {
            this.method_4617(var1, var2, 1, -308385855);
            this.method_4617(var1 - 1, var2 + 1, 16, -308385855);
         }

         if(1 == var4) {
            this.method_4617(var1, var2, 4, -308385855);
            this.method_4617(1 + var1, var2 + 1, 64, -308385855);
         }

         if(var4 == 2) {
            this.method_4617(var1, var2, 16, -308385855);
            this.method_4617(var1 + 1, var2 - 1, 1, -308385855);
         }

         if(var4 == 3) {
            this.method_4617(var1, var2, 64, -308385855);
            this.method_4617(var1 - 1, var2 - 1, 4, -308385855);
         }
      }

      if(2 == var3) {
         if(var4 == 0) {
            this.method_4617(var1, var2, 130, -308385855);
            this.method_4617(var1 - 1, var2, 8, -308385855);
            this.method_4617(var1, 1 + var2, 32, -308385855);
         }

         if(1 == var4) {
            this.method_4617(var1, var2, 10, -308385855);
            this.method_4617(var1, var2 + 1, 32, -308385855);
            this.method_4617(1 + var1, var2, 128, -308385855);
         }

         if(var4 == 2) {
            this.method_4617(var1, var2, 40, -308385855);
            this.method_4617(var1 + 1, var2, 128, -308385855);
            this.method_4617(var1, var2 - 1, 2, -308385855);
         }

         if(3 == var4) {
            this.method_4617(var1, var2, 160, -308385855);
            this.method_4617(var1, var2 - 1, 2, -308385855);
            this.method_4617(var1 - 1, var2, 8, -308385855);
         }
      }

      if(var5) {
         if(var3 == 0) {
            if(0 == var4) {
               this.method_4617(var1, var2, 65536, -308385855);
               this.method_4617(var1 - 1, var2, 4096, -308385855);
            }

            if(var4 == 1) {
               this.method_4617(var1, var2, 1024, -308385855);
               this.method_4617(var1, 1 + var2, 16384, -308385855);
            }

            if(var4 == 2) {
               this.method_4617(var1, var2, 4096, -308385855);
               this.method_4617(1 + var1, var2, 65536, -308385855);
            }

            if(var4 == 3) {
               this.method_4617(var1, var2, 16384, -308385855);
               this.method_4617(var1, var2 - 1, 1024, -308385855);
            }
         }

         if(1 == var3 || var3 == 3) {
            if(var4 == 0) {
               this.method_4617(var1, var2, 512, -308385855);
               this.method_4617(var1 - 1, var2 + 1, 8192, -308385855);
            }

            if(1 == var4) {
               this.method_4617(var1, var2, 2048, -308385855);
               this.method_4617(1 + var1, 1 + var2, '\u8000', -308385855);
            }

            if(2 == var4) {
               this.method_4617(var1, var2, 8192, -308385855);
               this.method_4617(var1 + 1, var2 - 1, 512, -308385855);
            }

            if(3 == var4) {
               this.method_4617(var1, var2, '\u8000', -308385855);
               this.method_4617(var1 - 1, var2 - 1, 2048, -308385855);
            }
         }

         if(var3 == 2) {
            if(0 == var4) {
               this.method_4617(var1, var2, 66560, -308385855);
               this.method_4617(var1 - 1, var2, 4096, -308385855);
               this.method_4617(var1, 1 + var2, 16384, -308385855);
            }

            if(1 == var4) {
               this.method_4617(var1, var2, 5120, -308385855);
               this.method_4617(var1, 1 + var2, 16384, -308385855);
               this.method_4617(1 + var1, var2, 65536, -308385855);
            }

            if(2 == var4) {
               this.method_4617(var1, var2, 20480, -308385855);
               this.method_4617(var1 + 1, var2, 65536, -308385855);
               this.method_4617(var1, var2 - 1, 1024, -308385855);
            }

            if(var4 == 3) {
               this.method_4617(var1, var2, 81920, -308385855);
               this.method_4617(var1, var2 - 1, 1024, -308385855);
               this.method_4617(var1 - 1, var2, 4096, -308385855);
            }
         }
      }

   }

   // $FF: renamed from: f (int, int, int, int, boolean, int) void
   public void method_4611(int var1, int var2, int var3, int var4, boolean var5, int var6) {
      try {
         int var7 = 256;
         if(var5) {
            if(var6 <= -646005257) {
               return;
            }

            var7 += 131072;
         }

         var1 -= 280751135 * this.field_2674;
         var2 -= this.field_2681 * -992681321;

         for(int var8 = var1; var8 < var1 + var3; ++var8) {
            if(var6 <= -646005257) {
               throw new IllegalStateException();
            }

            if(var8 >= 0) {
               if(var6 <= -646005257) {
                  return;
               }

               if(var8 < this.field_2677 * 960002853) {
                  if(var6 <= -646005257) {
                     throw new IllegalStateException();
                  }

                  for(int var9 = var2; var9 < var2 + var4; ++var9) {
                     if(var6 <= -646005257) {
                        throw new IllegalStateException();
                     }

                     if(var9 >= 0 && var9 < this.field_2678 * 1646122993) {
                        if(var6 <= -646005257) {
                           throw new IllegalStateException();
                        }

                        this.method_4626(var8, var9, var7, 1796762342);
                     }
                  }
               }
            }
         }

      } catch (RuntimeException var10) {
         throw class_223.method_4281(var10, "fz.f(" + ')');
      }
   }

   // $FF: renamed from: e (int, int, int, int, boolean) void
   public void method_4612(int var1, int var2, int var3, int var4, boolean var5) {
      int var6 = 256;
      if(var5) {
         var6 += 131072;
      }

      var1 -= 280751135 * this.field_2674;
      var2 -= this.field_2681 * -992681321;

      for(int var7 = var1; var7 < var1 + var3; ++var7) {
         if(var7 >= 0 && var7 < this.field_2677 * 960002853) {
            for(int var8 = var2; var8 < var2 + var4; ++var8) {
               if(var8 >= 0 && var8 < this.field_2678 * 1646122993) {
                  this.method_4626(var7, var8, var6, -321907959);
               }
            }
         }
      }

   }

   // $FF: renamed from: kp (byte) void
   static final void method_4613(byte var0) {
      try {
         client.field_1620 = client.field_1602 * 553007447;
         class_38.field_258 = true;
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1, "fz.kp(" + ')');
      }
   }

   // $FF: renamed from: <init> (int, int) void
   public void method_4614(int var1, int var2) {
      try {
         super();
         this.field_2674 = 0;
         this.field_2681 = 0;
         this.field_2677 = var1 * 722151597;
         this.field_2678 = var2 * -1242547951;
         this.field_2679 = new int[this.field_2677 * 960002853][this.field_2678 * 1646122993];
         this.method_4609(1916620252);
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3, "fz.<init>(" + ')');
      }
   }

   // $FF: renamed from: r (int, int, int, int, boolean, int) void
   public void method_4615(int var1, int var2, int var3, int var4, boolean var5, int var6) {
      try {
         var1 -= this.field_2674 * 280751135;
         var2 -= -992681321 * this.field_2681;
         if(var3 == 0) {
            if(var6 <= 1200805345) {
               return;
            }

            if(0 == var4) {
               this.method_4617(var1, var2, 128, -308385855);
               this.method_4617(var1 - 1, var2, 8, -308385855);
            }

            if(var4 == 1) {
               if(var6 <= 1200805345) {
                  throw new IllegalStateException();
               }

               this.method_4617(var1, var2, 2, -308385855);
               this.method_4617(var1, 1 + var2, 32, -308385855);
            }

            if(var4 == 2) {
               if(var6 <= 1200805345) {
                  throw new IllegalStateException();
               }

               this.method_4617(var1, var2, 8, -308385855);
               this.method_4617(1 + var1, var2, 128, -308385855);
            }

            if(var4 == 3) {
               if(var6 <= 1200805345) {
                  throw new IllegalStateException();
               }

               this.method_4617(var1, var2, 32, -308385855);
               this.method_4617(var1, var2 - 1, 2, -308385855);
            }
         }

         label272: {
            if(var3 != 1) {
               if(var6 <= 1200805345) {
                  throw new IllegalStateException();
               }

               if(var3 != 3) {
                  break label272;
               }

               if(var6 <= 1200805345) {
                  throw new IllegalStateException();
               }
            }

            if(0 == var4) {
               if(var6 <= 1200805345) {
                  throw new IllegalStateException();
               }

               this.method_4617(var1, var2, 1, -308385855);
               this.method_4617(var1 - 1, var2 + 1, 16, -308385855);
            }

            if(1 == var4) {
               if(var6 <= 1200805345) {
                  throw new IllegalStateException();
               }

               this.method_4617(var1, var2, 4, -308385855);
               this.method_4617(1 + var1, var2 + 1, 64, -308385855);
            }

            if(var4 == 2) {
               if(var6 <= 1200805345) {
                  throw new IllegalStateException();
               }

               this.method_4617(var1, var2, 16, -308385855);
               this.method_4617(var1 + 1, var2 - 1, 1, -308385855);
            }

            if(var4 == 3) {
               if(var6 <= 1200805345) {
                  return;
               }

               this.method_4617(var1, var2, 64, -308385855);
               this.method_4617(var1 - 1, var2 - 1, 4, -308385855);
            }
         }

         if(2 == var3) {
            if(var6 <= 1200805345) {
               throw new IllegalStateException();
            }

            if(var4 == 0) {
               if(var6 <= 1200805345) {
                  return;
               }

               this.method_4617(var1, var2, 130, -308385855);
               this.method_4617(var1 - 1, var2, 8, -308385855);
               this.method_4617(var1, 1 + var2, 32, -308385855);
            }

            if(1 == var4) {
               if(var6 <= 1200805345) {
                  return;
               }

               this.method_4617(var1, var2, 10, -308385855);
               this.method_4617(var1, var2 + 1, 32, -308385855);
               this.method_4617(1 + var1, var2, 128, -308385855);
            }

            if(var4 == 2) {
               if(var6 <= 1200805345) {
                  throw new IllegalStateException();
               }

               this.method_4617(var1, var2, 40, -308385855);
               this.method_4617(var1 + 1, var2, 128, -308385855);
               this.method_4617(var1, var2 - 1, 2, -308385855);
            }

            if(3 == var4) {
               if(var6 <= 1200805345) {
                  throw new IllegalStateException();
               }

               this.method_4617(var1, var2, 160, -308385855);
               this.method_4617(var1, var2 - 1, 2, -308385855);
               this.method_4617(var1 - 1, var2, 8, -308385855);
            }
         }

         if(var5) {
            if(var6 <= 1200805345) {
               throw new IllegalStateException();
            }

            if(var3 == 0) {
               if(var6 <= 1200805345) {
                  return;
               }

               if(0 == var4) {
                  if(var6 <= 1200805345) {
                     throw new IllegalStateException();
                  }

                  this.method_4617(var1, var2, 65536, -308385855);
                  this.method_4617(var1 - 1, var2, 4096, -308385855);
               }

               if(var4 == 1) {
                  if(var6 <= 1200805345) {
                     throw new IllegalStateException();
                  }

                  this.method_4617(var1, var2, 1024, -308385855);
                  this.method_4617(var1, 1 + var2, 16384, -308385855);
               }

               if(var4 == 2) {
                  if(var6 <= 1200805345) {
                     return;
                  }

                  this.method_4617(var1, var2, 4096, -308385855);
                  this.method_4617(1 + var1, var2, 65536, -308385855);
               }

               if(var4 == 3) {
                  this.method_4617(var1, var2, 16384, -308385855);
                  this.method_4617(var1, var2 - 1, 1024, -308385855);
               }
            }

            label277: {
               if(1 != var3) {
                  if(var6 <= 1200805345) {
                     throw new IllegalStateException();
                  }

                  if(var3 != 3) {
                     break label277;
                  }

                  if(var6 <= 1200805345) {
                     return;
                  }
               }

               if(var4 == 0) {
                  if(var6 <= 1200805345) {
                     throw new IllegalStateException();
                  }

                  this.method_4617(var1, var2, 512, -308385855);
                  this.method_4617(var1 - 1, var2 + 1, 8192, -308385855);
               }

               if(1 == var4) {
                  if(var6 <= 1200805345) {
                     return;
                  }

                  this.method_4617(var1, var2, 2048, -308385855);
                  this.method_4617(1 + var1, 1 + var2, '\u8000', -308385855);
               }

               if(2 == var4) {
                  if(var6 <= 1200805345) {
                     return;
                  }

                  this.method_4617(var1, var2, 8192, -308385855);
                  this.method_4617(var1 + 1, var2 - 1, 512, -308385855);
               }

               if(3 == var4) {
                  if(var6 <= 1200805345) {
                     throw new IllegalStateException();
                  }

                  this.method_4617(var1, var2, '\u8000', -308385855);
                  this.method_4617(var1 - 1, var2 - 1, 2048, -308385855);
               }
            }

            if(var3 == 2) {
               if(0 == var4) {
                  if(var6 <= 1200805345) {
                     throw new IllegalStateException();
                  }

                  this.method_4617(var1, var2, 66560, -308385855);
                  this.method_4617(var1 - 1, var2, 4096, -308385855);
                  this.method_4617(var1, 1 + var2, 16384, -308385855);
               }

               if(1 == var4) {
                  if(var6 <= 1200805345) {
                     throw new IllegalStateException();
                  }

                  this.method_4617(var1, var2, 5120, -308385855);
                  this.method_4617(var1, 1 + var2, 16384, -308385855);
                  this.method_4617(1 + var1, var2, 65536, -308385855);
               }

               if(2 == var4) {
                  if(var6 <= 1200805345) {
                     return;
                  }

                  this.method_4617(var1, var2, 20480, -308385855);
                  this.method_4617(var1 + 1, var2, 65536, -308385855);
                  this.method_4617(var1, var2 - 1, 1024, -308385855);
               }

               if(var4 == 3) {
                  if(var6 <= 1200805345) {
                     throw new IllegalStateException();
                  }

                  this.method_4617(var1, var2, 81920, -308385855);
                  this.method_4617(var1, var2 - 1, 1024, -308385855);
                  this.method_4617(var1 - 1, var2, 4096, -308385855);
               }
            }
         }

      } catch (RuntimeException var7) {
         throw class_223.method_4281(var7, "fz.r(" + ')');
      }
   }

   // $FF: renamed from: b (int, int, int, int, int, boolean, int) void
   public void method_4616(int var1, int var2, int var3, int var4, int var5, boolean var6, int var7) {
      try {
         int var8 = 256;
         if(var6) {
            if(var7 == 1338880923) {
               return;
            }

            var8 += 131072;
         }

         int var9;
         label84: {
            var1 -= this.field_2674 * 280751135;
            var2 -= this.field_2681 * -992681321;
            if(1 != var5) {
               if(var7 == 1338880923) {
                  throw new IllegalStateException();
               }

               if(3 != var5) {
                  break label84;
               }

               if(var7 == 1338880923) {
                  return;
               }
            }

            var9 = var3;
            var3 = var4;
            var4 = var9;
         }

         for(var9 = var1; var9 < var3 + var1; ++var9) {
            if(var7 == 1338880923) {
               throw new IllegalStateException();
            }

            if(var9 >= 0) {
               if(var7 == 1338880923) {
                  throw new IllegalStateException();
               }

               if(var9 < this.field_2677 * 960002853) {
                  if(var7 == 1338880923) {
                     return;
                  }

                  for(int var10 = var2; var10 < var4 + var2; ++var10) {
                     if(var7 == 1338880923) {
                        throw new IllegalStateException();
                     }

                     if(var10 >= 0) {
                        if(var7 == 1338880923) {
                           throw new IllegalStateException();
                        }

                        if(var10 < 1646122993 * this.field_2678) {
                           if(var7 == 1338880923) {
                              throw new IllegalStateException();
                           }

                           this.method_4617(var9, var10, var8, -308385855);
                        }
                     }
                  }
               }
            }
         }

      } catch (RuntimeException var11) {
         throw class_223.method_4281(var11, "fz.b(" + ')');
      }
   }

   // $FF: renamed from: d (int, int, int, int) void
   void method_4617(int var1, int var2, int var3, int var4) {
      try {
         this.field_2679[var1][var2] &= ~var3;
      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5, "fz.d(" + ')');
      }
   }

   // $FF: renamed from: ae (int, int, int) void
   void method_4618(int var1, int var2, int var3) {
      this.field_2679[var1][var2] &= ~var3;
   }

   // $FF: renamed from: u () void
   public void method_4619() {
      for(int var1 = 0; var1 < 960002853 * this.field_2677; ++var1) {
         for(int var2 = 0; var2 < this.field_2678 * 1326584081; ++var2) {
            if(var1 != 0 && 0 != var2 && var1 < 1500722814 * this.field_2677 - 5 && var2 < this.field_2678 * 1646122993 - 5) {
               this.field_2679[var1][var2] = -1422818134;
            } else {
               this.field_2679[var1][var2] = -553749361;
            }
         }
      }

   }

   // $FF: renamed from: ar (int, int) void
   public void method_4620(int var1, int var2) {
      var1 -= 280751135 * this.field_2674;
      var2 -= -992681321 * this.field_2681;
      this.field_2679[var1][var2] &= -262145;
   }

   // $FF: renamed from: o (int, int, int, int, boolean) void
   public void method_4621(int var1, int var2, int var3, int var4, boolean var5) {
      var1 -= this.field_2674 * 280751135;
      var2 -= -992681321 * this.field_2681;
      if(var3 == 0) {
         if(var4 == 0) {
            this.method_4626(var1, var2, 128, 9668469);
            this.method_4626(var1 - 1, var2, 8, 332534735);
         }

         if(var4 == 1) {
            this.method_4626(var1, var2, 2, 714917570);
            this.method_4626(var1, var2 + 1, 32, 1778721701);
         }

         if(2 == var4) {
            this.method_4626(var1, var2, 8, -302880423);
            this.method_4626(1 + var1, var2, 128, 37849559);
         }

         if(3 == var4) {
            this.method_4626(var1, var2, 32, 1527225913);
            this.method_4626(var1, var2 - 1, 2, -733107289);
         }
      }

      if(1 == var3 || var3 == 3) {
         if(0 == var4) {
            this.method_4626(var1, var2, 1, 1835723346);
            this.method_4626(var1 - 1, 1 + var2, 16, 968966514);
         }

         if(var4 == 1) {
            this.method_4626(var1, var2, 4, 442304875);
            this.method_4626(var1 + 1, 1 + var2, 64, 1568522781);
         }

         if(2 == var4) {
            this.method_4626(var1, var2, 16, 1809859053);
            this.method_4626(var1 + 1, var2 - 1, 1, 319533201);
         }

         if(var4 == 3) {
            this.method_4626(var1, var2, 64, 1648668445);
            this.method_4626(var1 - 1, var2 - 1, 4, 2105388152);
         }
      }

      if(var3 == 2) {
         if(var4 == 0) {
            this.method_4626(var1, var2, 130, 355224268);
            this.method_4626(var1 - 1, var2, 8, 1726180213);
            this.method_4626(var1, var2 + 1, 32, 676110818);
         }

         if(var4 == 1) {
            this.method_4626(var1, var2, 10, 218150891);
            this.method_4626(var1, 1 + var2, 32, -652400590);
            this.method_4626(var1 + 1, var2, 128, -249954854);
         }

         if(2 == var4) {
            this.method_4626(var1, var2, 40, 253154008);
            this.method_4626(var1 + 1, var2, 128, -649420427);
            this.method_4626(var1, var2 - 1, 2, -325776490);
         }

         if(var4 == 3) {
            this.method_4626(var1, var2, 160, -244337264);
            this.method_4626(var1, var2 - 1, 2, -531753212);
            this.method_4626(var1 - 1, var2, 8, -754813090);
         }
      }

      if(var5) {
         if(var3 == 0) {
            if(var4 == 0) {
               this.method_4626(var1, var2, 65536, 1250143718);
               this.method_4626(var1 - 1, var2, 4096, 924730556);
            }

            if(1 == var4) {
               this.method_4626(var1, var2, 1024, 944922714);
               this.method_4626(var1, var2 + 1, 16384, 1522513224);
            }

            if(2 == var4) {
               this.method_4626(var1, var2, 4096, 1082650303);
               this.method_4626(var1 + 1, var2, 65536, -614362299);
            }

            if(3 == var4) {
               this.method_4626(var1, var2, 16384, 223785058);
               this.method_4626(var1, var2 - 1, 1024, 1669069884);
            }
         }

         if(var3 == 1 || 3 == var3) {
            if(0 == var4) {
               this.method_4626(var1, var2, 512, 1219407054);
               this.method_4626(var1 - 1, var2 + 1, 8192, 1198892424);
            }

            if(1 == var4) {
               this.method_4626(var1, var2, 2048, 1477876663);
               this.method_4626(var1 + 1, var2 + 1, '\u8000', 984769520);
            }

            if(var4 == 2) {
               this.method_4626(var1, var2, 8192, 1996641069);
               this.method_4626(var1 + 1, var2 - 1, 512, 618125659);
            }

            if(3 == var4) {
               this.method_4626(var1, var2, '\u8000', -33907914);
               this.method_4626(var1 - 1, var2 - 1, 2048, 979656524);
            }
         }

         if(2 == var3) {
            if(var4 == 0) {
               this.method_4626(var1, var2, 66560, 45840434);
               this.method_4626(var1 - 1, var2, 4096, 1403816117);
               this.method_4626(var1, var2 + 1, 16384, 801921189);
            }

            if(var4 == 1) {
               this.method_4626(var1, var2, 5120, -348876964);
               this.method_4626(var1, 1 + var2, 16384, -810730036);
               this.method_4626(var1 + 1, var2, 65536, 322813402);
            }

            if(2 == var4) {
               this.method_4626(var1, var2, 20480, 1595960023);
               this.method_4626(1 + var1, var2, 65536, 833875450);
               this.method_4626(var1, var2 - 1, 1024, -195918295);
            }

            if(var4 == 3) {
               this.method_4626(var1, var2, 81920, 924552825);
               this.method_4626(var1, var2 - 1, 1024, -334992273);
               this.method_4626(var1 - 1, var2, 4096, 1562035343);
            }
         }
      }

   }

   // $FF: renamed from: c (int, int, int, int, boolean) void
   public void method_4622(int var1, int var2, int var3, int var4, boolean var5) {
      int var6 = 256;
      if(var5) {
         var6 += 131072;
      }

      var1 -= 280751135 * this.field_2674;
      var2 -= this.field_2681 * -992681321;

      for(int var7 = var1; var7 < var1 + var3; ++var7) {
         if(var7 >= 0 && var7 < this.field_2677 * 960002853) {
            for(int var8 = var2; var8 < var2 + var4; ++var8) {
               if(var8 >= 0 && var8 < this.field_2678 * 1646122993) {
                  this.method_4626(var7, var8, var6, 330387270);
               }
            }
         }
      }

   }

   // $FF: renamed from: n (int, int, int, int, boolean, int) void
   public void method_4623(int var1, int var2, int var3, int var4, boolean var5, int var6) {
      try {
         var1 -= this.field_2674 * 280751135;
         var2 -= -992681321 * this.field_2681;
         if(var3 == 0) {
            if(var6 != -1946469678) {
               return;
            }

            if(var4 == 0) {
               if(var6 != -1946469678) {
                  throw new IllegalStateException();
               }

               this.method_4626(var1, var2, 128, 1715659368);
               this.method_4626(var1 - 1, var2, 8, 1563744352);
            }

            if(var4 == 1) {
               if(var6 != -1946469678) {
                  throw new IllegalStateException();
               }

               this.method_4626(var1, var2, 2, -106860642);
               this.method_4626(var1, var2 + 1, 32, -133558977);
            }

            if(2 == var4) {
               if(var6 != -1946469678) {
                  return;
               }

               this.method_4626(var1, var2, 8, 1867803916);
               this.method_4626(1 + var1, var2, 128, 2070148055);
            }

            if(3 == var4) {
               this.method_4626(var1, var2, 32, 1895152463);
               this.method_4626(var1, var2 - 1, 2, -351000480);
            }
         }

         label255: {
            if(1 != var3) {
               if(var6 != -1946469678) {
                  throw new IllegalStateException();
               }

               if(var3 != 3) {
                  break label255;
               }
            }

            if(0 == var4) {
               if(var6 != -1946469678) {
                  throw new IllegalStateException();
               }

               this.method_4626(var1, var2, 1, 1251266484);
               this.method_4626(var1 - 1, 1 + var2, 16, 275112364);
            }

            if(var4 == 1) {
               if(var6 != -1946469678) {
                  throw new IllegalStateException();
               }

               this.method_4626(var1, var2, 4, -570944664);
               this.method_4626(var1 + 1, 1 + var2, 64, 995756539);
            }

            if(2 == var4) {
               this.method_4626(var1, var2, 16, 808577643);
               this.method_4626(var1 + 1, var2 - 1, 1, 507812497);
            }

            if(var4 == 3) {
               if(var6 != -1946469678) {
                  return;
               }

               this.method_4626(var1, var2, 64, 1758833161);
               this.method_4626(var1 - 1, var2 - 1, 4, 904110552);
            }
         }

         if(var3 == 2) {
            if(var6 != -1946469678) {
               throw new IllegalStateException();
            }

            if(var4 == 0) {
               if(var6 != -1946469678) {
                  throw new IllegalStateException();
               }

               this.method_4626(var1, var2, 130, 1874043981);
               this.method_4626(var1 - 1, var2, 8, 932608545);
               this.method_4626(var1, var2 + 1, 32, 1466767828);
            }

            if(var4 == 1) {
               if(var6 != -1946469678) {
                  throw new IllegalStateException();
               }

               this.method_4626(var1, var2, 10, 408221940);
               this.method_4626(var1, 1 + var2, 32, 1594713043);
               this.method_4626(var1 + 1, var2, 128, 1489041558);
            }

            if(2 == var4) {
               if(var6 != -1946469678) {
                  return;
               }

               this.method_4626(var1, var2, 40, 1980697067);
               this.method_4626(var1 + 1, var2, 128, 1911089819);
               this.method_4626(var1, var2 - 1, 2, 300911483);
            }

            if(var4 == 3) {
               if(var6 != -1946469678) {
                  return;
               }

               this.method_4626(var1, var2, 160, 416215498);
               this.method_4626(var1, var2 - 1, 2, 465648186);
               this.method_4626(var1 - 1, var2, 8, 1780441805);
            }
         }

         if(var5) {
            if(var6 != -1946469678) {
               return;
            }

            if(var3 == 0) {
               if(var4 == 0) {
                  if(var6 != -1946469678) {
                     throw new IllegalStateException();
                  }

                  this.method_4626(var1, var2, 65536, 1161749986);
                  this.method_4626(var1 - 1, var2, 4096, 1148725369);
               }

               if(1 == var4) {
                  if(var6 != -1946469678) {
                     return;
                  }

                  this.method_4626(var1, var2, 1024, 856199491);
                  this.method_4626(var1, var2 + 1, 16384, 1347131635);
               }

               if(2 == var4) {
                  if(var6 != -1946469678) {
                     throw new IllegalStateException();
                  }

                  this.method_4626(var1, var2, 4096, -781146355);
                  this.method_4626(var1 + 1, var2, 65536, 1368885946);
               }

               if(3 == var4) {
                  this.method_4626(var1, var2, 16384, -615109501);
                  this.method_4626(var1, var2 - 1, 1024, -509214086);
               }
            }

            label259: {
               if(var3 != 1) {
                  if(var6 != -1946469678) {
                     return;
                  }

                  if(3 != var3) {
                     break label259;
                  }

                  if(var6 != -1946469678) {
                     throw new IllegalStateException();
                  }
               }

               if(0 == var4) {
                  this.method_4626(var1, var2, 512, 2042009452);
                  this.method_4626(var1 - 1, var2 + 1, 8192, -337781624);
               }

               if(1 == var4) {
                  if(var6 != -1946469678) {
                     throw new IllegalStateException();
                  }

                  this.method_4626(var1, var2, 2048, -226726235);
                  this.method_4626(var1 + 1, var2 + 1, '\u8000', 309733201);
               }

               if(var4 == 2) {
                  this.method_4626(var1, var2, 8192, 1592285720);
                  this.method_4626(var1 + 1, var2 - 1, 512, 127062086);
               }

               if(3 == var4) {
                  this.method_4626(var1, var2, '\u8000', 376080645);
                  this.method_4626(var1 - 1, var2 - 1, 2048, 1306127974);
               }
            }

            if(2 == var3) {
               if(var6 != -1946469678) {
                  throw new IllegalStateException();
               }

               if(var4 == 0) {
                  if(var6 != -1946469678) {
                     throw new IllegalStateException();
                  }

                  this.method_4626(var1, var2, 66560, 312684292);
                  this.method_4626(var1 - 1, var2, 4096, -474924687);
                  this.method_4626(var1, var2 + 1, 16384, 758840635);
               }

               if(var4 == 1) {
                  if(var6 != -1946469678) {
                     throw new IllegalStateException();
                  }

                  this.method_4626(var1, var2, 5120, 1791229432);
                  this.method_4626(var1, 1 + var2, 16384, 1817264937);
                  this.method_4626(var1 + 1, var2, 65536, 2108780091);
               }

               if(2 == var4) {
                  if(var6 != -1946469678) {
                     throw new IllegalStateException();
                  }

                  this.method_4626(var1, var2, 20480, 2005916182);
                  this.method_4626(1 + var1, var2, 65536, 1074471431);
                  this.method_4626(var1, var2 - 1, 1024, 2067120645);
               }

               if(var4 == 3) {
                  if(var6 != -1946469678) {
                     throw new IllegalStateException();
                  }

                  this.method_4626(var1, var2, 81920, 757747681);
                  this.method_4626(var1, var2 - 1, 1024, 1199363329);
                  this.method_4626(var1 - 1, var2, 4096, 1032487519);
               }
            }
         }

      } catch (RuntimeException var7) {
         throw class_223.method_4281(var7, "fz.n(" + ')');
      }
   }

   // $FF: renamed from: p (int, int, int) void
   public void method_4624(int var1, int var2, int var3) {
      try {
         var1 -= 280751135 * this.field_2674;
         var2 -= -992681321 * this.field_2681;
         this.field_2679[var1][var2] |= 262144;
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4, "fz.p(" + ')');
      }
   }

   // $FF: renamed from: a (int, int) void
   public void method_4625(int var1, int var2) {
      var1 -= 1259541094 * this.field_2674;
      var2 -= this.field_2681 * -992681321;
      this.field_2679[var1][var2] |= -7892558;
   }

   // $FF: renamed from: j (int, int, int, int) void
   void method_4626(int var1, int var2, int var3, int var4) {
      try {
         this.field_2679[var1][var2] |= var3;
      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5, "fz.j(" + ')');
      }
   }

   // $FF: renamed from: m (int, int) void
   public void method_4627(int var1, int var2) {
      var1 -= -749789952 * this.field_2674;
      var2 -= 104122789 * this.field_2681;
      this.field_2679[var1][var2] |= -1988844770;
   }

   // $FF: renamed from: x (int, int) void
   public void method_4628(int var1, int var2) {
      var1 -= 280751135 * this.field_2674;
      var2 -= -992681321 * this.field_2681;
      this.field_2679[var1][var2] |= 275576437;
   }

   // $FF: renamed from: z (int, int, int) void
   void method_4629(int var1, int var2, int var3) {
      this.field_2679[var1][var2] |= var3;
   }

   // $FF: renamed from: w (int, int, int) void
   void method_4630(int var1, int var2, int var3) {
      this.field_2679[var1][var2] |= var3;
   }

   // $FF: renamed from: ab (int, int, int) void
   void method_4631(int var1, int var2, int var3) {
      this.field_2679[var1][var2] &= ~var3;
   }

   // $FF: renamed from: g (int, int, int, int, boolean) void
   public void method_4632(int var1, int var2, int var3, int var4, boolean var5) {
      int var6 = 256;
      if(var5) {
         var6 += 131072;
      }

      var1 -= 280751135 * this.field_2674;
      var2 -= this.field_2681 * -992681321;

      for(int var7 = var1; var7 < var1 + var3; ++var7) {
         if(var7 >= 0 && var7 < this.field_2677 * 1845638257) {
            for(int var8 = var2; var8 < var2 + var4; ++var8) {
               if(var8 >= 0 && var8 < this.field_2678 * 1646122993) {
                  this.method_4626(var7, var8, var6, 776095509);
               }
            }
         }
      }

   }

   // $FF: renamed from: q (int, int, int, int, boolean) void
   public void method_4633(int var1, int var2, int var3, int var4, boolean var5) {
      var1 -= this.field_2674 * 280751135;
      var2 -= -992681321 * this.field_2681;
      if(var3 == 0) {
         if(0 == var4) {
            this.method_4617(var1, var2, 128, -308385855);
            this.method_4617(var1 - 1, var2, 8, -308385855);
         }

         if(var4 == 1) {
            this.method_4617(var1, var2, 2, -308385855);
            this.method_4617(var1, 1 + var2, 32, -308385855);
         }

         if(var4 == 2) {
            this.method_4617(var1, var2, 8, -308385855);
            this.method_4617(1 + var1, var2, 128, -308385855);
         }

         if(var4 == 3) {
            this.method_4617(var1, var2, 32, -308385855);
            this.method_4617(var1, var2 - 1, 2, -308385855);
         }
      }

      if(var3 == 1 || var3 == 3) {
         if(0 == var4) {
            this.method_4617(var1, var2, 1, -308385855);
            this.method_4617(var1 - 1, var2 + 1, 16, -308385855);
         }

         if(1 == var4) {
            this.method_4617(var1, var2, 4, -308385855);
            this.method_4617(1 + var1, var2 + 1, 64, -308385855);
         }

         if(var4 == 2) {
            this.method_4617(var1, var2, 16, -308385855);
            this.method_4617(var1 + 1, var2 - 1, 1, -308385855);
         }

         if(var4 == 3) {
            this.method_4617(var1, var2, 64, -308385855);
            this.method_4617(var1 - 1, var2 - 1, 4, -308385855);
         }
      }

      if(2 == var3) {
         if(var4 == 0) {
            this.method_4617(var1, var2, 130, -308385855);
            this.method_4617(var1 - 1, var2, 8, -308385855);
            this.method_4617(var1, 1 + var2, 32, -308385855);
         }

         if(1 == var4) {
            this.method_4617(var1, var2, 10, -308385855);
            this.method_4617(var1, var2 + 1, 32, -308385855);
            this.method_4617(1 + var1, var2, 128, -308385855);
         }

         if(var4 == 2) {
            this.method_4617(var1, var2, 40, -308385855);
            this.method_4617(var1 + 1, var2, 128, -308385855);
            this.method_4617(var1, var2 - 1, 2, -308385855);
         }

         if(3 == var4) {
            this.method_4617(var1, var2, 160, -308385855);
            this.method_4617(var1, var2 - 1, 2, -308385855);
            this.method_4617(var1 - 1, var2, 8, -308385855);
         }
      }

      if(var5) {
         if(var3 == 0) {
            if(0 == var4) {
               this.method_4617(var1, var2, 65536, -308385855);
               this.method_4617(var1 - 1, var2, 4096, -308385855);
            }

            if(var4 == 1) {
               this.method_4617(var1, var2, 1024, -308385855);
               this.method_4617(var1, 1 + var2, 16384, -308385855);
            }

            if(var4 == 2) {
               this.method_4617(var1, var2, 4096, -308385855);
               this.method_4617(1 + var1, var2, 65536, -308385855);
            }

            if(var4 == 3) {
               this.method_4617(var1, var2, 16384, -308385855);
               this.method_4617(var1, var2 - 1, 1024, -308385855);
            }
         }

         if(1 == var3 || var3 == 3) {
            if(var4 == 0) {
               this.method_4617(var1, var2, 512, -308385855);
               this.method_4617(var1 - 1, var2 + 1, 8192, -308385855);
            }

            if(1 == var4) {
               this.method_4617(var1, var2, 2048, -308385855);
               this.method_4617(1 + var1, 1 + var2, '\u8000', -308385855);
            }

            if(2 == var4) {
               this.method_4617(var1, var2, 8192, -308385855);
               this.method_4617(var1 + 1, var2 - 1, 512, -308385855);
            }

            if(3 == var4) {
               this.method_4617(var1, var2, '\u8000', -308385855);
               this.method_4617(var1 - 1, var2 - 1, 2048, -308385855);
            }
         }

         if(var3 == 2) {
            if(0 == var4) {
               this.method_4617(var1, var2, 66560, -308385855);
               this.method_4617(var1 - 1, var2, 4096, -308385855);
               this.method_4617(var1, 1 + var2, 16384, -308385855);
            }

            if(1 == var4) {
               this.method_4617(var1, var2, 5120, -308385855);
               this.method_4617(var1, 1 + var2, 16384, -308385855);
               this.method_4617(1 + var1, var2, 65536, -308385855);
            }

            if(2 == var4) {
               this.method_4617(var1, var2, 20480, -308385855);
               this.method_4617(var1 + 1, var2, 65536, -308385855);
               this.method_4617(var1, var2 - 1, 1024, -308385855);
            }

            if(var4 == 3) {
               this.method_4617(var1, var2, 81920, -308385855);
               this.method_4617(var1, var2 - 1, 1024, -308385855);
               this.method_4617(var1 - 1, var2, 4096, -308385855);
            }
         }
      }

   }

   // $FF: renamed from: i (int, int, int) void
   void method_4634(int var1, int var2, int var3) {
      this.field_2679[var1][var2] &= ~var3;
   }

   // $FF: renamed from: l () void
   public void method_4635() {
      for(int var1 = 0; var1 < 960002853 * this.field_2677; ++var1) {
         for(int var2 = 0; var2 < this.field_2678 * 1646122993; ++var2) {
            if(var1 != 0 && 0 != var2 && var1 < 960002853 * this.field_2677 - 5 && var2 < this.field_2678 * 1646122993 - 5) {
               this.field_2679[var1][var2] = 16777216;
            } else {
               this.field_2679[var1][var2] = 16777215;
            }
         }
      }

   }

   // $FF: renamed from: ap (int, int, int) void
   void method_4636(int var1, int var2, int var3) {
      this.field_2679[var1][var2] &= ~var3;
   }

   // $FF: renamed from: t (int, int, int, int, boolean) void
   public void method_4637(int var1, int var2, int var3, int var4, boolean var5) {
      var1 -= this.field_2674 * 164431377;
      var2 -= -697614727 * this.field_2681;
      if(var3 == 0) {
         if(0 == var4) {
            this.method_4617(var1, var2, -959781936, -308385855);
            this.method_4617(var1 - 1, var2, 8, -308385855);
         }

         if(var4 == 1) {
            this.method_4617(var1, var2, 2, -308385855);
            this.method_4617(var1, 1 + var2, 32, -308385855);
         }

         if(var4 == 2) {
            this.method_4617(var1, var2, 8, -308385855);
            this.method_4617(1 + var1, var2, -254110452, -308385855);
         }

         if(var4 == 3) {
            this.method_4617(var1, var2, 32, -308385855);
            this.method_4617(var1, var2 - 1, 2, -308385855);
         }
      }

      if(var3 == 1 || var3 == 3) {
         if(0 == var4) {
            this.method_4617(var1, var2, 1, -308385855);
            this.method_4617(var1 - 1, var2 + 1, 16, -308385855);
         }

         if(1 == var4) {
            this.method_4617(var1, var2, 4, -308385855);
            this.method_4617(1 + var1, var2 + 1, -1363735808, -308385855);
         }

         if(var4 == 2) {
            this.method_4617(var1, var2, 16, -308385855);
            this.method_4617(var1 + 1, var2 - 1, 1, -308385855);
         }

         if(var4 == 3) {
            this.method_4617(var1, var2, 64, -308385855);
            this.method_4617(var1 - 1, var2 - 1, 4, -308385855);
         }
      }

      if(2 == var3) {
         if(var4 == 0) {
            this.method_4617(var1, var2, 130, -308385855);
            this.method_4617(var1 - 1, var2, 8, -308385855);
            this.method_4617(var1, 1 + var2, -1340729713, -308385855);
         }

         if(1 == var4) {
            this.method_4617(var1, var2, 10, -308385855);
            this.method_4617(var1, var2 + 1, 32, -308385855);
            this.method_4617(1 + var1, var2, -91776715, -308385855);
         }

         if(var4 == 2) {
            this.method_4617(var1, var2, 40, -308385855);
            this.method_4617(var1 + 1, var2, 128, -308385855);
            this.method_4617(var1, var2 - 1, 2, -308385855);
         }

         if(3 == var4) {
            this.method_4617(var1, var2, 771587571, -308385855);
            this.method_4617(var1, var2 - 1, 2, -308385855);
            this.method_4617(var1 - 1, var2, 8, -308385855);
         }
      }

      if(var5) {
         if(var3 == 0) {
            if(0 == var4) {
               this.method_4617(var1, var2, 440227387, -308385855);
               this.method_4617(var1 - 1, var2, 4096, -308385855);
            }

            if(var4 == 1) {
               this.method_4617(var1, var2, 1024, -308385855);
               this.method_4617(var1, 1 + var2, 309503732, -308385855);
            }

            if(var4 == 2) {
               this.method_4617(var1, var2, 4096, -308385855);
               this.method_4617(1 + var1, var2, 65536, -308385855);
            }

            if(var4 == 3) {
               this.method_4617(var1, var2, 16384, -308385855);
               this.method_4617(var1, var2 - 1, 1024, -308385855);
            }
         }

         if(1 == var3 || var3 == 3) {
            if(var4 == 0) {
               this.method_4617(var1, var2, 512, -308385855);
               this.method_4617(var1 - 1, var2 + 1, 1739558829, -308385855);
            }

            if(1 == var4) {
               this.method_4617(var1, var2, 2048, -308385855);
               this.method_4617(1 + var1, 1 + var2, '\u8000', -308385855);
            }

            if(2 == var4) {
               this.method_4617(var1, var2, 2054374635, -308385855);
               this.method_4617(var1 + 1, var2 - 1, -169638712, -308385855);
            }

            if(3 == var4) {
               this.method_4617(var1, var2, 602765004, -308385855);
               this.method_4617(var1 - 1, var2 - 1, 1882490987, -308385855);
            }
         }

         if(var3 == 2) {
            if(0 == var4) {
               this.method_4617(var1, var2, -2090561345, -308385855);
               this.method_4617(var1 - 1, var2, 1537330995, -308385855);
               this.method_4617(var1, 1 + var2, 16384, -308385855);
            }

            if(1 == var4) {
               this.method_4617(var1, var2, -1635258090, -308385855);
               this.method_4617(var1, 1 + var2, 16384, -308385855);
               this.method_4617(1 + var1, var2, 1904640386, -308385855);
            }

            if(2 == var4) {
               this.method_4617(var1, var2, -816220578, -308385855);
               this.method_4617(var1 + 1, var2, 65536, -308385855);
               this.method_4617(var1, var2 - 1, 1024, -308385855);
            }

            if(var4 == 3) {
               this.method_4617(var1, var2, 81920, -308385855);
               this.method_4617(var1, var2 - 1, 1024, -308385855);
               this.method_4617(var1 - 1, var2, -1134662699, -308385855);
            }
         }
      }

   }

   // $FF: renamed from: al (int, int, int) void
   void method_4638(int var1, int var2, int var3) {
      this.field_2679[var1][var2] &= ~var3;
   }

   // $FF: renamed from: ad (int, int) void
   public void method_4639(int var1, int var2) {
      var1 -= 280751135 * this.field_2674;
      var2 -= -992681321 * this.field_2681;
      this.field_2679[var1][var2] &= -262145;
   }

   // $FF: renamed from: ai (int, int) void
   public void method_4640(int var1, int var2) {
      var1 -= 280751135 * this.field_2674;
      var2 -= 1342476876 * this.field_2681;
      this.field_2679[var1][var2] &= -262145;
   }

   // $FF: renamed from: y (int, int, int) void
   public void method_4641(int var1, int var2, int var3) {
      try {
         var1 -= 280751135 * this.field_2674;
         var2 -= this.field_2681 * -992681321;
         this.field_2679[var1][var2] |= 2097152;
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4, "fz.y(" + ')');
      }
   }

   // $FF: renamed from: r (int, int) int
   public static int method_4642(int var0, int var1) {
      try {
         int var2;
         label55: {
            var2 = 0;
            if(var0 >= 0) {
               if(var1 <= -868937628) {
                  throw new IllegalStateException();
               }

               if(var0 < 65536) {
                  break label55;
               }

               if(var1 <= -868937628) {
                  throw new IllegalStateException();
               }
            }

            var0 >>>= 16;
            var2 += 16;
         }

         if(var0 >= 256) {
            if(var1 <= -868937628) {
               throw new IllegalStateException();
            }

            var0 >>>= 8;
            var2 += 8;
         }

         if(var0 >= 16) {
            if(var1 <= -868937628) {
               throw new IllegalStateException();
            }

            var0 >>>= 4;
            var2 += 4;
         }

         if(var0 >= 4) {
            var0 >>>= 2;
            var2 += 2;
         }

         if(var0 >= 1) {
            if(var1 <= -868937628) {
               throw new IllegalStateException();
            }

            var0 >>>= 1;
            ++var2;
         }

         return var0 + var2;
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3, "fz.r(" + ')');
      }
   }

   // $FF: renamed from: k (int, int) void
   public void method_4643(int var1, int var2) {
      var1 -= 280751135 * this.field_2674;
      var2 -= this.field_2681 * -992681321;
      this.field_2679[var1][var2] |= 2097152;
   }

   // $FF: renamed from: n (int, int) int
   public static int method_4644(int var0, int var1) {
      try {
         return class_260.field_2904[var0];
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "fz.n(" + ')');
      }
   }

   // $FF: renamed from: gs (int, int) void
   static void method_4645(int var0, int var1) {
      try {
         client.field_1634 = 0L;
         if(var0 >= 2) {
            if(var1 <= 491527025) {
               throw new IllegalStateException();
            }

            client.field_1675 = true;
         } else {
            client.field_1675 = false;
         }

         if(class_78.method_1223(702215999) == 1) {
            class_121.field_1337.method_2294(765, 503, -1134068726);
         } else {
            class_121.field_1337.method_2294(7680, 2160, 1645826633);
         }

         if(-888167097 * client.field_1421 >= 25) {
            if(var1 <= 491527025) {
               return;
            }

            class_40 var2 = class_112.method_2238(class_266.field_3136, client.field_1463.field_2384, (byte)8);
            var2.field_263.method_210(class_78.method_1223(702215999), 303066737);
            var2.field_263.method_333(class_137.field_1766 * 646214551, -1826329058);
            var2.field_263.method_333(class_58.field_460 * -1538307343, 1653266263);
            client.field_1463.method_4079(var2, -2081373116);
         }

      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3, "fz.gs(" + ')');
      }
   }
}
