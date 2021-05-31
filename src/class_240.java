
// $FF: renamed from: fz
public class class_240 {

    // $FF: renamed from: ag int
   int field_2674;
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
   public void method_4608(int var1, int var2) {
      try {
         var1 -= 280751135 * this.field_2674;
         var2 -= -992681321 * this.field_2681;
         this.field_2679[var1][var2] &= -262145;
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
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
         throw class_223.method_4281(var4);
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

                        this.method_4626(var8, var9, var7);
                     }
                  }
               }
            }
         }

      } catch (RuntimeException var10) {
         throw class_223.method_4281(var10);
      }
   }

    // $FF: renamed from: kp (byte) void
   static final void method_4613() {
      try {
         client.field_1620 = client.field_1602 * 553007447;
         class_38.field_258 = true;
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1);
      }
   }

   // $FF: renamed from: <init> (int, int) void
   public class_240(int var1, int var2) {
      super();
      try {
         this.field_2674 = 0;
         this.field_2681 = 0;
         this.field_2677 = var1 * 722151597;
         this.field_2678 = var2 * -1242547951;
         this.field_2679 = new int[this.field_2677 * 960002853][this.field_2678 * 1646122993];
         this.method_4609(1916620252);
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
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
               this.method_4617(var1, var2, 128);
               this.method_4617(var1 - 1, var2, 8);
            }

            if(var4 == 1) {
               if(var6 <= 1200805345) {
                  throw new IllegalStateException();
               }

               this.method_4617(var1, var2, 2);
               this.method_4617(var1, 1 + var2, 32);
            }

            if(var4 == 2) {
               if(var6 <= 1200805345) {
                  throw new IllegalStateException();
               }

               this.method_4617(var1, var2, 8);
               this.method_4617(1 + var1, var2, 128);
            }

            if(var4 == 3) {
               if(var6 <= 1200805345) {
                  throw new IllegalStateException();
               }

               this.method_4617(var1, var2, 32);
               this.method_4617(var1, var2 - 1, 2);
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

               this.method_4617(var1, var2, 1);
               this.method_4617(var1 - 1, var2 + 1, 16);
            }

            if(1 == var4) {
               if(var6 <= 1200805345) {
                  throw new IllegalStateException();
               }

               this.method_4617(var1, var2, 4);
               this.method_4617(1 + var1, var2 + 1, 64);
            }

            if(var4 == 2) {
               if(var6 <= 1200805345) {
                  throw new IllegalStateException();
               }

               this.method_4617(var1, var2, 16);
               this.method_4617(var1 + 1, var2 - 1, 1);
            }

            if(var4 == 3) {
               if(var6 <= 1200805345) {
                  return;
               }

               this.method_4617(var1, var2, 64);
               this.method_4617(var1 - 1, var2 - 1, 4);
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

               this.method_4617(var1, var2, 130);
               this.method_4617(var1 - 1, var2, 8);
               this.method_4617(var1, 1 + var2, 32);
            }

            if(1 == var4) {
               if(var6 <= 1200805345) {
                  return;
               }

               this.method_4617(var1, var2, 10);
               this.method_4617(var1, var2 + 1, 32);
               this.method_4617(1 + var1, var2, 128);
            }

            if(var4 == 2) {
               if(var6 <= 1200805345) {
                  throw new IllegalStateException();
               }

               this.method_4617(var1, var2, 40);
               this.method_4617(var1 + 1, var2, 128);
               this.method_4617(var1, var2 - 1, 2);
            }

            if(3 == var4) {
               if(var6 <= 1200805345) {
                  throw new IllegalStateException();
               }

               this.method_4617(var1, var2, 160);
               this.method_4617(var1, var2 - 1, 2);
               this.method_4617(var1 - 1, var2, 8);
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

                  this.method_4617(var1, var2, 65536);
                  this.method_4617(var1 - 1, var2, 4096);
               }

               if(var4 == 1) {
                  if(var6 <= 1200805345) {
                     throw new IllegalStateException();
                  }

                  this.method_4617(var1, var2, 1024);
                  this.method_4617(var1, 1 + var2, 16384);
               }

               if(var4 == 2) {
                  if(var6 <= 1200805345) {
                     return;
                  }

                  this.method_4617(var1, var2, 4096);
                  this.method_4617(1 + var1, var2, 65536);
               }

               if(var4 == 3) {
                  this.method_4617(var1, var2, 16384);
                  this.method_4617(var1, var2 - 1, 1024);
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

                  this.method_4617(var1, var2, 512);
                  this.method_4617(var1 - 1, var2 + 1, 8192);
               }

               if(1 == var4) {
                  if(var6 <= 1200805345) {
                     return;
                  }

                  this.method_4617(var1, var2, 2048);
                  this.method_4617(1 + var1, 1 + var2, '\u8000');
               }

               if(2 == var4) {
                  if(var6 <= 1200805345) {
                     return;
                  }

                  this.method_4617(var1, var2, 8192);
                  this.method_4617(var1 + 1, var2 - 1, 512);
               }

               if(3 == var4) {
                  if(var6 <= 1200805345) {
                     throw new IllegalStateException();
                  }

                  this.method_4617(var1, var2, '\u8000');
                  this.method_4617(var1 - 1, var2 - 1, 2048);
               }
            }

            if(var3 == 2) {
               if(0 == var4) {
                  if(var6 <= 1200805345) {
                     throw new IllegalStateException();
                  }

                  this.method_4617(var1, var2, 66560);
                  this.method_4617(var1 - 1, var2, 4096);
                  this.method_4617(var1, 1 + var2, 16384);
               }

               if(1 == var4) {
                  if(var6 <= 1200805345) {
                     throw new IllegalStateException();
                  }

                  this.method_4617(var1, var2, 5120);
                  this.method_4617(var1, 1 + var2, 16384);
                  this.method_4617(1 + var1, var2, 65536);
               }

               if(2 == var4) {
                  if(var6 <= 1200805345) {
                     return;
                  }

                  this.method_4617(var1, var2, 20480);
                  this.method_4617(var1 + 1, var2, 65536);
                  this.method_4617(var1, var2 - 1, 1024);
               }

               if(var4 == 3) {
                  if(var6 <= 1200805345) {
                     throw new IllegalStateException();
                  }

                  this.method_4617(var1, var2, 81920);
                  this.method_4617(var1, var2 - 1, 1024);
                  this.method_4617(var1 - 1, var2, 4096);
               }
            }
         }

      } catch (RuntimeException var7) {
         throw class_223.method_4281(var7);
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

                           this.method_4617(var9, var10, var8);
                        }
                     }
                  }
               }
            }
         }

      } catch (RuntimeException var11) {
         throw class_223.method_4281(var11);
      }
   }

   // $FF: renamed from: d (int, int, int, int) void
   void method_4617(int var1, int var2, int var3) {
      try {
         this.field_2679[var1][var2] &= ~var3;
      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5);
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

               this.method_4626(var1, var2, 128);
               this.method_4626(var1 - 1, var2, 8);
            }

            if(var4 == 1) {
               if(var6 != -1946469678) {
                  throw new IllegalStateException();
               }

               this.method_4626(var1, var2, 2);
               this.method_4626(var1, var2 + 1, 32);
            }

            if(2 == var4) {
               if(var6 != -1946469678) {
                  return;
               }

               this.method_4626(var1, var2, 8);
               this.method_4626(1 + var1, var2, 128);
            }

            if(3 == var4) {
               this.method_4626(var1, var2, 32);
               this.method_4626(var1, var2 - 1, 2);
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

               this.method_4626(var1, var2, 1);
               this.method_4626(var1 - 1, 1 + var2, 16);
            }

            if(var4 == 1) {
               if(var6 != -1946469678) {
                  throw new IllegalStateException();
               }

               this.method_4626(var1, var2, 4);
               this.method_4626(var1 + 1, 1 + var2, 64);
            }

            if(2 == var4) {
               this.method_4626(var1, var2, 16);
               this.method_4626(var1 + 1, var2 - 1, 1);
            }

            if(var4 == 3) {
               if(var6 != -1946469678) {
                  return;
               }

               this.method_4626(var1, var2, 64);
               this.method_4626(var1 - 1, var2 - 1, 4);
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

               this.method_4626(var1, var2, 130);
               this.method_4626(var1 - 1, var2, 8);
               this.method_4626(var1, var2 + 1, 32);
            }

            if(var4 == 1) {
               if(var6 != -1946469678) {
                  throw new IllegalStateException();
               }

               this.method_4626(var1, var2, 10);
               this.method_4626(var1, 1 + var2, 32);
               this.method_4626(var1 + 1, var2, 128);
            }

            if(2 == var4) {
               if(var6 != -1946469678) {
                  return;
               }

               this.method_4626(var1, var2, 40);
               this.method_4626(var1 + 1, var2, 128);
               this.method_4626(var1, var2 - 1, 2);
            }

            if(var4 == 3) {
               if(var6 != -1946469678) {
                  return;
               }

               this.method_4626(var1, var2, 160);
               this.method_4626(var1, var2 - 1, 2);
               this.method_4626(var1 - 1, var2, 8);
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

                  this.method_4626(var1, var2, 65536);
                  this.method_4626(var1 - 1, var2, 4096);
               }

               if(1 == var4) {
                  if(var6 != -1946469678) {
                     return;
                  }

                  this.method_4626(var1, var2, 1024);
                  this.method_4626(var1, var2 + 1, 16384);
               }

               if(2 == var4) {
                  if(var6 != -1946469678) {
                     throw new IllegalStateException();
                  }

                  this.method_4626(var1, var2, 4096);
                  this.method_4626(var1 + 1, var2, 65536);
               }

               if(3 == var4) {
                  this.method_4626(var1, var2, 16384);
                  this.method_4626(var1, var2 - 1, 1024);
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
                  this.method_4626(var1, var2, 512);
                  this.method_4626(var1 - 1, var2 + 1, 8192);
               }

               if(1 == var4) {
                  if(var6 != -1946469678) {
                     throw new IllegalStateException();
                  }

                  this.method_4626(var1, var2, 2048);
                  this.method_4626(var1 + 1, var2 + 1, '\u8000');
               }

               if(var4 == 2) {
                  this.method_4626(var1, var2, 8192);
                  this.method_4626(var1 + 1, var2 - 1, 512);
               }

               if(3 == var4) {
                  this.method_4626(var1, var2, '\u8000');
                  this.method_4626(var1 - 1, var2 - 1, 2048);
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

                  this.method_4626(var1, var2, 66560);
                  this.method_4626(var1 - 1, var2, 4096);
                  this.method_4626(var1, var2 + 1, 16384);
               }

               if(var4 == 1) {
                  if(var6 != -1946469678) {
                     throw new IllegalStateException();
                  }

                  this.method_4626(var1, var2, 5120);
                  this.method_4626(var1, 1 + var2, 16384);
                  this.method_4626(var1 + 1, var2, 65536);
               }

               if(2 == var4) {
                  if(var6 != -1946469678) {
                     throw new IllegalStateException();
                  }

                  this.method_4626(var1, var2, 20480);
                  this.method_4626(1 + var1, var2, 65536);
                  this.method_4626(var1, var2 - 1, 1024);
               }

               if(var4 == 3) {
                  if(var6 != -1946469678) {
                     throw new IllegalStateException();
                  }

                  this.method_4626(var1, var2, 81920);
                  this.method_4626(var1, var2 - 1, 1024);
                  this.method_4626(var1 - 1, var2, 4096);
               }
            }
         }

      } catch (RuntimeException var7) {
         throw class_223.method_4281(var7);
      }
   }

   // $FF: renamed from: p (int, int, int) void
   public void method_4624(int var1, int var2) {
      try {
         var1 -= 280751135 * this.field_2674;
         var2 -= -992681321 * this.field_2681;
         this.field_2679[var1][var2] |= 262144;
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

    // $FF: renamed from: j (int, int, int, int) void
   void method_4626(int var1, int var2, int var3) {
      try {
         this.field_2679[var1][var2] |= var3;
      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5);
      }
   }

    // $FF: renamed from: y (int, int, int) void
   public void method_4641(int var1, int var2) {
      try {
         var1 -= 280751135 * this.field_2674;
         var2 -= this.field_2681 * -992681321;
         this.field_2679[var1][var2] |= 2097152;
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
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
         throw class_223.method_4281(var3);
      }
   }

    // $FF: renamed from: n (int, int) int
   public static int method_4644(int var0) {
      try {
         return class_260.field_2904[var0];
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
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

            class_40 var2 = class_112.newPacket(ClientOpcode.OPCODE_90, client.field_1463.isaac, (byte)8);
            var2.networkBuffer.writeByte(class_78.method_1223(702215999));
            var2.networkBuffer.writeShortReverse(class_137.field_1766 * 646214551);
            var2.networkBuffer.writeShortReverse(class_58.field_460 * -1538307343);
            client.field_1463.method_4079(var2);
         }

      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }
}
