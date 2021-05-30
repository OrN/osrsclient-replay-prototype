import java.awt.Component;
import java.net.URL;

// $FF: renamed from: bq
public class class_154 implements Runnable {

    // $FF: renamed from: g nd
   public static class_28 field_1928;
   // $FF: renamed from: gq int
   static int field_1929;
    // $FF: renamed from: bl jd
   static class_295 field_1933;
   // $FF: renamed from: v bd[]
   volatile class_139[] field_1934;


   // $FF: renamed from: <init> () void
   class_154() {
      super();
      try {
         this.field_1934 = new class_139[2];
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1);
      }
   }

   // $FF: renamed from: f (java.awt.Component, byte) void
   static void method_3245(Component var0) {
      try {
         var0.removeKeyListener(class_145.field_1846);
         var0.removeFocusListener(class_145.field_1846);
         class_145.field_1843 = -1023229263;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

    // $FF: renamed from: u (int, int, int, int, byte) int
   static final int method_3248(int var0, int var1, int var2, int var3) {
      try {
         int var5 = 65536 - class_70.field_559[var2 * 1024 / var3] >> 1;
         return ((65536 - var5) * var0 >> 16) + (var5 * var1 >> 16);
      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6);
      }
   }

   public void run() {
      try {
         try {
            for(int var1 = 0; var1 < 2; ++var1) {
               class_139 var2 = this.field_1934[var1];
               if(null != var2) {
                  var2.method_2990((byte)72);
               }
            }
         } catch (Exception var3) {
            class_308.method_5523((String)null, var3, 1873323324);
         }

      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: v (int, int) eo
   public static class_82 method_3249(int var0, int var1) {
      try {
         class_82 var2 = (class_82)class_82.field_757.method_5065((long)var0);
         if(var2 != null) {
            if(var1 >= -80698473) {
               throw new IllegalStateException();
            } else {
               return var2;
            }
         } else {
            byte[] var3 = class_209.field_2421.method_5381(4, var0);
            class_82 var10000 = new class_82();
            var2 = var10000;
            if(null != var3) {
               if(var1 >= -80698473) {
                  throw new IllegalStateException();
               }

               class_28 var10001 = new class_28(var3);
               var2.method_1369(var10001, -1052896488);
            }

            var2.method_1359(-593078672);
            class_82.field_757.method_5064(var2, (long)var0);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: v (int, int, int, fc, fz, boolean, int[], int[], int) int
   public static int method_3250(int var0, int var1, int var2, class_146 var3, class_240 var4, boolean var5, int[] var6, int[] var7, int var8) {
      try {
         int var10;
         for(int var9 = 0; var9 < 128; ++var9) {
            if(var8 == -2006230823) {
               throw new IllegalStateException();
            }

            for(var10 = 0; var10 < 128; ++var10) {
               if(var8 == -2006230823) {
                  throw new IllegalStateException();
               }

               class_215.field_2457[var9][var10] = 0;
               class_215.field_2458[var9][var10] = 99999999;
            }
         }

         int var11;
         int var12;
         byte var13;
         byte var14;
         int var15;
         int var16;
         byte var17;
         int var18;
         int[][] var19;
         int var20;
         int var21;
         int var22;
         int var23;
         boolean var29;
         boolean var30;
         int var31;
         int var32;
         int var34;
         if(var2 == 1) {
            if(var8 == -2006230823) {
               throw new IllegalStateException();
            }

            var11 = var0;
            var12 = var1;
            var13 = 64;
            var14 = 64;
            var15 = var0 - var13;
            var16 = var1 - var14;
            class_215.field_2457[var13][var14] = 99;
            class_215.field_2458[var13][var14] = 0;
            var17 = 0;
            var18 = 0;
            class_215.field_2455[var17] = var0;
            var34 = var17 + 1;
            class_215.field_2460[var17] = var1;
            var19 = var4.field_2679;

            while(true) {
               if(var34 == var18) {
                  class_184.field_2256 = 1890198089 * var11;
                  class_246.field_2724 = -1284385059 * var12;
                  var30 = false;
                  break;
               }

               if(var8 == -2006230823) {
                  throw new IllegalStateException();
               }

               var11 = class_215.field_2455[var18];
               var12 = class_215.field_2460[var18];
               var18 = 1 + var18 & 4095;
               var31 = var11 - var15;
               var32 = var12 - var16;
               var20 = var11 - 280751135 * var4.field_2674;
               var21 = var12 - var4.field_2681 * -992681321;
               if(var3.method_3106(var11, var12, 496202097)) {
                  class_184.field_2256 = var11 * 1890198089;
                  class_246.field_2724 = var12 * -1284385059;
                  var30 = true;
                  break;
               }

               var22 = class_215.field_2458[var31][var32] + 1;
               if(var31 > 0) {
                  if(var8 == -2006230823) {
                     throw new IllegalStateException();
                  }

                  if(0 == class_215.field_2457[var31 - 1][var32]) {
                     if(var8 == -2006230823) {
                        throw new IllegalStateException();
                     }

                     if((var19[var20 - 1][var21] & 19136776) == 0) {
                        class_215.field_2455[var34] = var11 - 1;
                        class_215.field_2460[var34] = var12;
                        var34 = var34 + 1 & 4095;
                        class_215.field_2457[var31 - 1][var32] = 2;
                        class_215.field_2458[var31 - 1][var32] = var22;
                     }
                  }
               }

               if(var31 < 127 && 0 == class_215.field_2457[1 + var31][var32]) {
                  if(var8 == -2006230823) {
                     throw new IllegalStateException();
                  }

                  if((var19[1 + var20][var21] & 19136896) == 0) {
                     if(var8 == -2006230823) {
                        throw new IllegalStateException();
                     }

                     class_215.field_2455[var34] = 1 + var11;
                     class_215.field_2460[var34] = var12;
                     var34 = 1 + var34 & 4095;
                     class_215.field_2457[var31 + 1][var32] = 8;
                     class_215.field_2458[var31 + 1][var32] = var22;
                  }
               }

               if(var32 > 0) {
                  if(var8 == -2006230823) {
                     throw new IllegalStateException();
                  }

                  if(0 == class_215.field_2457[var31][var32 - 1]) {
                     if(var8 == -2006230823) {
                        throw new IllegalStateException();
                     }

                     if((var19[var20][var21 - 1] & 19136770) == 0) {
                        if(var8 == -2006230823) {
                           throw new IllegalStateException();
                        }

                        class_215.field_2455[var34] = var11;
                        class_215.field_2460[var34] = var12 - 1;
                        var34 = var34 + 1 & 4095;
                        class_215.field_2457[var31][var32 - 1] = 1;
                        class_215.field_2458[var31][var32 - 1] = var22;
                     }
                  }
               }

               if(var32 < 127) {
                  if(var8 == -2006230823) {
                     throw new IllegalStateException();
                  }

                  if(0 == class_215.field_2457[var31][1 + var32]) {
                     if(var8 == -2006230823) {
                        throw new IllegalStateException();
                     }

                     if((var19[var20][1 + var21] & 19136800) == 0) {
                        if(var8 == -2006230823) {
                           throw new IllegalStateException();
                        }

                        class_215.field_2455[var34] = var11;
                        class_215.field_2460[var34] = 1 + var12;
                        var34 = var34 + 1 & 4095;
                        class_215.field_2457[var31][var32 + 1] = 4;
                        class_215.field_2458[var31][var32 + 1] = var22;
                     }
                  }
               }

               if(var31 > 0) {
                  if(var8 == -2006230823) {
                     throw new IllegalStateException();
                  }

                  if(var32 > 0 && 0 == class_215.field_2457[var31 - 1][var32 - 1]) {
                     if(var8 == -2006230823) {
                        throw new IllegalStateException();
                     }

                     if(0 == (var19[var20 - 1][var21 - 1] & 19136782)) {
                        if(var8 == -2006230823) {
                           throw new IllegalStateException();
                        }

                        if(0 == (var19[var20 - 1][var21] & 19136776)) {
                           if(var8 == -2006230823) {
                              throw new IllegalStateException();
                           }

                           if((var19[var20][var21 - 1] & 19136770) == 0) {
                              if(var8 == -2006230823) {
                                 throw new IllegalStateException();
                              }

                              class_215.field_2455[var34] = var11 - 1;
                              class_215.field_2460[var34] = var12 - 1;
                              var34 = var34 + 1 & 4095;
                              class_215.field_2457[var31 - 1][var32 - 1] = 3;
                              class_215.field_2458[var31 - 1][var32 - 1] = var22;
                           }
                        }
                     }
                  }
               }

               if(var31 < 127) {
                  if(var8 == -2006230823) {
                     throw new IllegalStateException();
                  }

                  if(var32 > 0 && class_215.field_2457[1 + var31][var32 - 1] == 0) {
                     if(var8 == -2006230823) {
                        throw new IllegalStateException();
                     }

                     if((var19[var20 + 1][var21 - 1] & 19136899) == 0) {
                        if(var8 == -2006230823) {
                           throw new IllegalStateException();
                        }

                        if((var19[1 + var20][var21] & 19136896) == 0) {
                           if(var8 == -2006230823) {
                              throw new IllegalStateException();
                           }

                           if((var19[var20][var21 - 1] & 19136770) == 0) {
                              if(var8 == -2006230823) {
                                 throw new IllegalStateException();
                              }

                              class_215.field_2455[var34] = 1 + var11;
                              class_215.field_2460[var34] = var12 - 1;
                              var34 = 1 + var34 & 4095;
                              class_215.field_2457[1 + var31][var32 - 1] = 9;
                              class_215.field_2458[var31 + 1][var32 - 1] = var22;
                           }
                        }
                     }
                  }
               }

               if(var31 > 0) {
                  if(var8 == -2006230823) {
                     throw new IllegalStateException();
                  }

                  if(var32 < 127) {
                     if(var8 == -2006230823) {
                        throw new IllegalStateException();
                     }

                     if(class_215.field_2457[var31 - 1][var32 + 1] == 0 && (var19[var20 - 1][var21 + 1] & 19136824) == 0) {
                        if(var8 == -2006230823) {
                           throw new IllegalStateException();
                        }

                        if(0 == (var19[var20 - 1][var21] & 19136776)) {
                           if(var8 == -2006230823) {
                              throw new IllegalStateException();
                           }

                           if(0 == (var19[var20][1 + var21] & 19136800)) {
                              if(var8 == -2006230823) {
                                 throw new IllegalStateException();
                              }

                              class_215.field_2455[var34] = var11 - 1;
                              class_215.field_2460[var34] = 1 + var12;
                              var34 = 1 + var34 & 4095;
                              class_215.field_2457[var31 - 1][1 + var32] = 6;
                              class_215.field_2458[var31 - 1][1 + var32] = var22;
                           }
                        }
                     }
                  }
               }

               if(var31 < 127) {
                  if(var8 == -2006230823) {
                     throw new IllegalStateException();
                  }

                  if(var32 < 127) {
                     if(var8 == -2006230823) {
                        throw new IllegalStateException();
                     }

                     if(0 == class_215.field_2457[var31 + 1][1 + var32]) {
                        if(var8 == -2006230823) {
                           throw new IllegalStateException();
                        }

                        if((var19[var20 + 1][var21 + 1] & 19136992) == 0 && (var19[1 + var20][var21] & 19136896) == 0) {
                           if(var8 == -2006230823) {
                              throw new IllegalStateException();
                           }

                           if(0 == (var19[var20][1 + var21] & 19136800)) {
                              if(var8 == -2006230823) {
                                 throw new IllegalStateException();
                              }

                              class_215.field_2455[var34] = var11 + 1;
                              class_215.field_2460[var34] = 1 + var12;
                              var34 = 1 + var34 & 4095;
                              class_215.field_2457[var31 + 1][var32 + 1] = 12;
                              class_215.field_2458[var31 + 1][var32 + 1] = var22;
                           }
                        }
                     }
                  }
               }
            }

            var29 = var30;
         } else if(2 == var2) {
            if(var8 == -2006230823) {
               throw new IllegalStateException();
            }

            var11 = var0;
            var12 = var1;
            var13 = 64;
            var14 = 64;
            var15 = var0 - var13;
            var16 = var1 - var14;
            class_215.field_2457[var13][var14] = 99;
            class_215.field_2458[var13][var14] = 0;
            var17 = 0;
            var18 = 0;
            class_215.field_2455[var17] = var0;
            var34 = var17 + 1;
            class_215.field_2460[var17] = var1;
            var19 = var4.field_2679;

            while(true) {
               if(var34 == var18) {
                  class_184.field_2256 = var11 * 1890198089;
                  class_246.field_2724 = var12 * -1284385059;
                  var30 = false;
                  break;
               }

               if(var8 == -2006230823) {
                  throw new IllegalStateException();
               }

               var11 = class_215.field_2455[var18];
               var12 = class_215.field_2460[var18];
               var18 = 1 + var18 & 4095;
               var31 = var11 - var15;
               var32 = var12 - var16;
               var20 = var11 - 280751135 * var4.field_2674;
               var21 = var12 - -992681321 * var4.field_2681;
               if(var3.method_3106(var11, var12, 496202097)) {
                  if(var8 == -2006230823) {
                     throw new IllegalStateException();
                  }

                  class_184.field_2256 = 1890198089 * var11;
                  class_246.field_2724 = var12 * -1284385059;
                  var30 = true;
                  break;
               }

               var22 = 1 + class_215.field_2458[var31][var32];
               if(var31 > 0) {
                  if(var8 == -2006230823) {
                     throw new IllegalStateException();
                  }

                  if(class_215.field_2457[var31 - 1][var32] != 0) {
                     if(var8 == -2006230823) {
                        throw new IllegalStateException();
                     }
                  } else if(0 != (var19[var20 - 1][var21] & 19136782)) {
                     if(var8 == -2006230823) {
                        throw new IllegalStateException();
                     }
                  } else if(0 != (var19[var20 - 1][1 + var21] & 19136824)) {
                     if(var8 == -2006230823) {
                        throw new IllegalStateException();
                     }
                  } else {
                     class_215.field_2455[var34] = var11 - 1;
                     class_215.field_2460[var34] = var12;
                     var34 = 1 + var34 & 4095;
                     class_215.field_2457[var31 - 1][var32] = 2;
                     class_215.field_2458[var31 - 1][var32] = var22;
                  }
               }

               if(var31 < 126) {
                  if(var8 == -2006230823) {
                     throw new IllegalStateException();
                  }

                  if(class_215.field_2457[var31 + 1][var32] != 0) {
                     if(var8 == -2006230823) {
                        throw new IllegalStateException();
                     }
                  } else if(0 != (var19[2 + var20][var21] & 19136899)) {
                     if(var8 == -2006230823) {
                        throw new IllegalStateException();
                     }
                  } else if(0 != (var19[var20 + 2][1 + var21] & 19136992)) {
                     if(var8 == -2006230823) {
                        throw new IllegalStateException();
                     }
                  } else {
                     class_215.field_2455[var34] = var11 + 1;
                     class_215.field_2460[var34] = var12;
                     var34 = 1 + var34 & 4095;
                     class_215.field_2457[var31 + 1][var32] = 8;
                     class_215.field_2458[1 + var31][var32] = var22;
                  }
               }

               if(var32 > 0) {
                  if(var8 == -2006230823) {
                     throw new IllegalStateException();
                  }

                  if(class_215.field_2457[var31][var32 - 1] != 0) {
                     if(var8 == -2006230823) {
                        throw new IllegalStateException();
                     }
                  } else if(0 != (var19[var20][var21 - 1] & 19136782)) {
                     if(var8 == -2006230823) {
                        throw new IllegalStateException();
                     }
                  } else if(0 != (var19[1 + var20][var21 - 1] & 19136899)) {
                     if(var8 == -2006230823) {
                        throw new IllegalStateException();
                     }
                  } else {
                     class_215.field_2455[var34] = var11;
                     class_215.field_2460[var34] = var12 - 1;
                     var34 = 1 + var34 & 4095;
                     class_215.field_2457[var31][var32 - 1] = 1;
                     class_215.field_2458[var31][var32 - 1] = var22;
                  }
               }

               if(var32 < 126 && 0 == class_215.field_2457[var31][var32 + 1]) {
                  if((var19[var20][var21 + 2] & 19136824) != 0) {
                     if(var8 == -2006230823) {
                        throw new IllegalStateException();
                     }
                  } else if(0 != (var19[1 + var20][var21 + 2] & 19136992)) {
                     if(var8 == -2006230823) {
                        throw new IllegalStateException();
                     }
                  } else {
                     class_215.field_2455[var34] = var11;
                     class_215.field_2460[var34] = var12 + 1;
                     var34 = 1 + var34 & 4095;
                     class_215.field_2457[var31][1 + var32] = 4;
                     class_215.field_2458[var31][var32 + 1] = var22;
                  }
               }

               if(var31 > 0) {
                  if(var8 == -2006230823) {
                     throw new IllegalStateException();
                  }

                  if(var32 > 0) {
                     if(var8 == -2006230823) {
                        throw new IllegalStateException();
                     }

                     if(0 != class_215.field_2457[var31 - 1][var32 - 1]) {
                        if(var8 == -2006230823) {
                           throw new IllegalStateException();
                        }
                     } else if((var19[var20 - 1][var21] & 19136830) != 0) {
                        if(var8 == -2006230823) {
                           throw new IllegalStateException();
                        }
                     } else if((var19[var20 - 1][var21 - 1] & 19136782) == 0) {
                        if((var19[var20][var21 - 1] & 19136911) != 0) {
                           if(var8 == -2006230823) {
                              throw new IllegalStateException();
                           }
                        } else {
                           class_215.field_2455[var34] = var11 - 1;
                           class_215.field_2460[var34] = var12 - 1;
                           var34 = var34 + 1 & 4095;
                           class_215.field_2457[var31 - 1][var32 - 1] = 3;
                           class_215.field_2458[var31 - 1][var32 - 1] = var22;
                        }
                     }
                  }
               }

               if(var31 < 126) {
                  if(var8 == -2006230823) {
                     throw new IllegalStateException();
                  }

                  if(var32 > 0) {
                     if(var8 == -2006230823) {
                        throw new IllegalStateException();
                     }

                     if(0 != class_215.field_2457[var31 + 1][var32 - 1]) {
                        if(var8 == -2006230823) {
                           throw new IllegalStateException();
                        }
                     } else if((var19[1 + var20][var21 - 1] & 19136911) != 0) {
                        if(var8 == -2006230823) {
                           throw new IllegalStateException();
                        }
                     } else if((var19[var20 + 2][var21 - 1] & 19136899) != 0) {
                        if(var8 == -2006230823) {
                           throw new IllegalStateException();
                        }
                     } else if(0 != (var19[var20 + 2][var21] & 19136995)) {
                        if(var8 == -2006230823) {
                           throw new IllegalStateException();
                        }
                     } else {
                        class_215.field_2455[var34] = 1 + var11;
                        class_215.field_2460[var34] = var12 - 1;
                        var34 = 1 + var34 & 4095;
                        class_215.field_2457[1 + var31][var32 - 1] = 9;
                        class_215.field_2458[var31 + 1][var32 - 1] = var22;
                     }
                  }
               }

               if(var31 > 0 && var32 < 126) {
                  if(var8 == -2006230823) {
                     throw new IllegalStateException();
                  }

                  if(class_215.field_2457[var31 - 1][1 + var32] != 0) {
                     if(var8 == -2006230823) {
                        throw new IllegalStateException();
                     }
                  } else if(0 != (var19[var20 - 1][1 + var21] & 19136830)) {
                     if(var8 == -2006230823) {
                        throw new IllegalStateException();
                     }
                  } else if((var19[var20 - 1][2 + var21] & 19136824) != 0) {
                     if(var8 == -2006230823) {
                        throw new IllegalStateException();
                     }
                  } else if((var19[var20][var21 + 2] & 19137016) != 0) {
                     if(var8 == -2006230823) {
                        throw new IllegalStateException();
                     }
                  } else {
                     class_215.field_2455[var34] = var11 - 1;
                     class_215.field_2460[var34] = var12 + 1;
                     var34 = 1 + var34 & 4095;
                     class_215.field_2457[var31 - 1][var32 + 1] = 6;
                     class_215.field_2458[var31 - 1][var32 + 1] = var22;
                  }
               }

               if(var31 < 126) {
                  if(var8 == -2006230823) {
                     throw new IllegalStateException();
                  }

                  if(var32 < 126) {
                     if(var8 == -2006230823) {
                        throw new IllegalStateException();
                     }

                     if(class_215.field_2457[1 + var31][1 + var32] != 0) {
                        if(var8 == -2006230823) {
                           throw new IllegalStateException();
                        }
                     } else if(0 != (var19[1 + var20][var21 + 2] & 19137016)) {
                        if(var8 == -2006230823) {
                           throw new IllegalStateException();
                        }
                     } else if(0 != (var19[2 + var20][2 + var21] & 19136992)) {
                        if(var8 == -2006230823) {
                           throw new IllegalStateException();
                        }
                     } else if(0 != (var19[var20 + 2][var21 + 1] & 19136995)) {
                        if(var8 == -2006230823) {
                           throw new IllegalStateException();
                        }
                     } else {
                        class_215.field_2455[var34] = var11 + 1;
                        class_215.field_2460[var34] = 1 + var12;
                        var34 = 1 + var34 & 4095;
                        class_215.field_2457[1 + var31][var32 + 1] = 12;
                        class_215.field_2458[1 + var31][var32 + 1] = var22;
                     }
                  }
               }
            }

            var29 = var30;
         } else {
            var11 = var0;
            var12 = var1;
            var13 = 64;
            var14 = 64;
            var15 = var0 - var13;
            var16 = var1 - var14;
            class_215.field_2457[var13][var14] = 99;
            class_215.field_2458[var13][var14] = 0;
            var17 = 0;
            var18 = 0;
            class_215.field_2455[var17] = var0;
            var34 = var17 + 1;
            class_215.field_2460[var17] = var1;
            var19 = var4.field_2679;

            label1226:
            while(true) {
               if(var18 == var34) {
                  class_184.field_2256 = var11 * 1890198089;
                  class_246.field_2724 = var12 * -1284385059;
                  var30 = false;
                  break;
               }

               if(var8 == -2006230823) {
                  throw new IllegalStateException();
               }

               var11 = class_215.field_2455[var18];
               var12 = class_215.field_2460[var18];
               var18 = var18 + 1 & 4095;
               var31 = var11 - var15;
               var32 = var12 - var16;
               var20 = var11 - 280751135 * var4.field_2674;
               var21 = var12 - -992681321 * var4.field_2681;
               if(var3.method_3106(var11, var12, 496202097)) {
                  class_184.field_2256 = var11 * 1890198089;
                  class_246.field_2724 = var12 * -1284385059;
                  var30 = true;
                  break;
               }

               var22 = 1 + class_215.field_2458[var31][var32];
               if(var31 > 0) {
                  if(var8 == -2006230823) {
                     throw new IllegalStateException();
                  }

                  if(0 != class_215.field_2457[var31 - 1][var32]) {
                     if(var8 == -2006230823) {
                        throw new IllegalStateException();
                     }
                  } else if((var19[var20 - 1][var21] & 19136782) != 0) {
                     if(var8 == -2006230823) {
                        throw new IllegalStateException();
                     }
                  } else if(0 == (var19[var20 - 1][var21 + var2 - 1] & 19136824)) {
                     var23 = 1;

                     while(true) {
                        if(var23 >= var2 - 1) {
                           class_215.field_2455[var34] = var11 - 1;
                           class_215.field_2460[var34] = var12;
                           var34 = 1 + var34 & 4095;
                           class_215.field_2457[var31 - 1][var32] = 2;
                           class_215.field_2458[var31 - 1][var32] = var22;
                           break;
                        }

                        if(var8 == -2006230823) {
                           throw new IllegalStateException();
                        }

                        if((var19[var20 - 1][var23 + var21] & 19136830) != 0) {
                           if(var8 == -2006230823) {
                              throw new IllegalStateException();
                           }
                           break;
                        }

                        ++var23;
                     }
                  }
               }

               if(var31 < 128 - var2) {
                  if(var8 == -2006230823) {
                     throw new IllegalStateException();
                  }

                  if(0 != class_215.field_2457[var31 + 1][var32]) {
                     if(var8 == -2006230823) {
                        throw new IllegalStateException();
                     }
                  } else if(0 != (var19[var2 + var20][var21] & 19136899)) {
                     if(var8 == -2006230823) {
                        throw new IllegalStateException();
                     }
                  } else if(0 == (var19[var20 + var2][var2 + var21 - 1] & 19136992)) {
                     var23 = 1;

                     while(true) {
                        if(var23 >= var2 - 1) {
                           class_215.field_2455[var34] = 1 + var11;
                           class_215.field_2460[var34] = var12;
                           var34 = var34 + 1 & 4095;
                           class_215.field_2457[1 + var31][var32] = 8;
                           class_215.field_2458[var31 + 1][var32] = var22;
                           break;
                        }

                        if(var8 == -2006230823) {
                           throw new IllegalStateException();
                        }

                        if(0 != (var19[var20 + var2][var23 + var21] & 19136995)) {
                           if(var8 == -2006230823) {
                              throw new IllegalStateException();
                           }
                           break;
                        }

                        ++var23;
                     }
                  }
               }

               if(var32 > 0) {
                  if(var8 == -2006230823) {
                     throw new IllegalStateException();
                  }

                  if(0 != class_215.field_2457[var31][var32 - 1]) {
                     if(var8 == -2006230823) {
                        throw new IllegalStateException();
                     }
                  } else if((var19[var20][var21 - 1] & 19136782) != 0) {
                     if(var8 == -2006230823) {
                        throw new IllegalStateException();
                     }
                  } else if((var19[var2 + var20 - 1][var21 - 1] & 19136899) != 0) {
                     if(var8 == -2006230823) {
                        throw new IllegalStateException();
                     }
                  } else {
                     var23 = 1;

                     while(true) {
                        if(var23 >= var2 - 1) {
                           class_215.field_2455[var34] = var11;
                           class_215.field_2460[var34] = var12 - 1;
                           var34 = 1 + var34 & 4095;
                           class_215.field_2457[var31][var32 - 1] = 1;
                           class_215.field_2458[var31][var32 - 1] = var22;
                           break;
                        }

                        if(var8 == -2006230823) {
                           throw new IllegalStateException();
                        }

                        if((var19[var20 + var23][var21 - 1] & 19136911) != 0) {
                           break;
                        }

                        ++var23;
                     }
                  }
               }

               if(var32 < 128 - var2) {
                  if(var8 == -2006230823) {
                     throw new IllegalStateException();
                  }

                  if(0 != class_215.field_2457[var31][1 + var32]) {
                     if(var8 == -2006230823) {
                        throw new IllegalStateException();
                     }
                  } else if(0 != (var19[var20][var2 + var21] & 19136824)) {
                     if(var8 == -2006230823) {
                        throw new IllegalStateException();
                     }
                  } else if(0 == (var19[var20 + var2 - 1][var21 + var2] & 19136992)) {
                     var23 = 1;

                     while(true) {
                        if(var23 >= var2 - 1) {
                           class_215.field_2455[var34] = var11;
                           class_215.field_2460[var34] = var12 + 1;
                           var34 = 1 + var34 & 4095;
                           class_215.field_2457[var31][1 + var32] = 4;
                           class_215.field_2458[var31][var32 + 1] = var22;
                           break;
                        }

                        if(var8 == -2006230823) {
                           throw new IllegalStateException();
                        }

                        if(0 != (var19[var23 + var20][var21 + var2] & 19137016)) {
                           break;
                        }

                        ++var23;
                     }
                  }
               }

               if(var31 > 0) {
                  if(var8 == -2006230823) {
                     throw new IllegalStateException();
                  }

                  if(var32 > 0) {
                     if(var8 == -2006230823) {
                        throw new IllegalStateException();
                     }

                     if(0 != class_215.field_2457[var31 - 1][var32 - 1]) {
                        if(var8 == -2006230823) {
                           throw new IllegalStateException();
                        }
                     } else if((var19[var20 - 1][var21 - 1] & 19136782) != 0) {
                        if(var8 == -2006230823) {
                           throw new IllegalStateException();
                        }
                     } else {
                        var23 = 1;

                        while(true) {
                           if(var23 >= var2) {
                              class_215.field_2455[var34] = var11 - 1;
                              class_215.field_2460[var34] = var12 - 1;
                              var34 = 1 + var34 & 4095;
                              class_215.field_2457[var31 - 1][var32 - 1] = 3;
                              class_215.field_2458[var31 - 1][var32 - 1] = var22;
                              break;
                           }

                           if(var8 == -2006230823) {
                              throw new IllegalStateException();
                           }

                           if((var19[var20 - 1][var21 - 1 + var23] & 19136830) != 0) {
                              if(var8 == -2006230823) {
                                 throw new IllegalStateException();
                              }
                              break;
                           }

                           if((var19[var20 - 1 + var23][var21 - 1] & 19136911) != 0) {
                              if(var8 == -2006230823) {
                                 throw new IllegalStateException();
                              }
                              break;
                           }

                           ++var23;
                        }
                     }
                  }
               }

               if(var31 < 128 - var2) {
                  if(var8 == -2006230823) {
                     throw new IllegalStateException();
                  }

                  if(var32 > 0) {
                     if(var8 == -2006230823) {
                        throw new IllegalStateException();
                     }

                     if(class_215.field_2457[var31 + 1][var32 - 1] != 0) {
                        if(var8 == -2006230823) {
                           throw new IllegalStateException();
                        }
                     } else if((var19[var2 + var20][var21 - 1] & 19136899) != 0) {
                        if(var8 == -2006230823) {
                           throw new IllegalStateException();
                        }
                     } else {
                        var23 = 1;

                        while(true) {
                           if(var23 >= var2) {
                              class_215.field_2455[var34] = 1 + var11;
                              class_215.field_2460[var34] = var12 - 1;
                              var34 = 1 + var34 & 4095;
                              class_215.field_2457[var31 + 1][var32 - 1] = 9;
                              class_215.field_2458[1 + var31][var32 - 1] = var22;
                              break;
                           }

                           if(var8 == -2006230823) {
                              throw new IllegalStateException();
                           }

                           if(0 != (var19[var2 + var20][var23 + (var21 - 1)] & 19136995)) {
                              if(var8 == -2006230823) {
                                 throw new IllegalStateException();
                              }
                              break;
                           }

                           if((var19[var20 + var23][var21 - 1] & 19136911) != 0) {
                              if(var8 == -2006230823) {
                                 throw new IllegalStateException();
                              }
                              break;
                           }

                           ++var23;
                        }
                     }
                  }
               }

               if(var31 > 0) {
                  if(var8 == -2006230823) {
                     throw new IllegalStateException();
                  }

                  if(var32 < 128 - var2) {
                     if(var8 == -2006230823) {
                        throw new IllegalStateException();
                     }

                     if(class_215.field_2457[var31 - 1][1 + var32] != 0) {
                        if(var8 == -2006230823) {
                           throw new IllegalStateException();
                        }
                     } else if((var19[var20 - 1][var21 + var2] & 19136824) != 0) {
                        if(var8 == -2006230823) {
                           throw new IllegalStateException();
                        }
                     } else {
                        var23 = 1;

                        while(true) {
                           if(var23 >= var2) {
                              class_215.field_2455[var34] = var11 - 1;
                              class_215.field_2460[var34] = 1 + var12;
                              var34 = 1 + var34 & 4095;
                              class_215.field_2457[var31 - 1][var32 + 1] = 6;
                              class_215.field_2458[var31 - 1][var32 + 1] = var22;
                              break;
                           }

                           if(0 != (var19[var20 - 1][var21 + var23] & 19136830)) {
                              if(var8 == -2006230823) {
                                 throw new IllegalStateException();
                              }
                              break;
                           }

                           if(0 != (var19[var23 + (var20 - 1)][var21 + var2] & 19137016)) {
                              if(var8 == -2006230823) {
                                 throw new IllegalStateException();
                              }
                              break;
                           }

                           ++var23;
                        }
                     }
                  }
               }

               if(var31 < 128 - var2) {
                  if(var8 == -2006230823) {
                     throw new IllegalStateException();
                  }

                  if(var32 < 128 - var2) {
                     if(var8 == -2006230823) {
                        throw new IllegalStateException();
                     }

                     if(class_215.field_2457[var31 + 1][1 + var32] != 0) {
                        if(var8 == -2006230823) {
                           throw new IllegalStateException();
                        }
                     } else if((var19[var20 + var2][var21 + var2] & 19136992) != 0) {
                        if(var8 == -2006230823) {
                           throw new IllegalStateException();
                        }
                     } else {
                        for(var23 = 1; var23 < var2; ++var23) {
                           if(var8 == -2006230823) {
                              throw new IllegalStateException();
                           }

                           if((var19[var23 + var20][var2 + var21] & 19137016) != 0) {
                              if(var8 == -2006230823) {
                                 throw new IllegalStateException();
                              }
                              continue label1226;
                           }

                           if(0 != (var19[var2 + var20][var23 + var21] & 19136995)) {
                              if(var8 == -2006230823) {
                                 throw new IllegalStateException();
                              }
                              continue label1226;
                           }
                        }

                        class_215.field_2455[var34] = 1 + var11;
                        class_215.field_2460[var34] = var12 + 1;
                        var34 = var34 + 1 & 4095;
                        class_215.field_2457[var31 + 1][var32 + 1] = 12;
                        class_215.field_2458[1 + var31][var32 + 1] = var22;
                     }
                  }
               }
            }

            var29 = var30;
         }

         var10 = var0 - 64;
         var11 = var1 - 64;
         var12 = class_184.field_2256 * -2005962759;
         var31 = class_246.field_2724 * -311250571;
         if(!var29) {
            if(var8 == -2006230823) {
               throw new IllegalStateException();
            }

            if(!var5) {
               return -1;
            }

            if(var8 == -2006230823) {
               throw new IllegalStateException();
            }

            var32 = Integer.MAX_VALUE;
            var15 = Integer.MAX_VALUE;
            byte var33 = 10;
            var34 = -1931856815 * var3.field_1859;
            var18 = -2132337773 * var3.field_1857;
            int var35 = var3.field_1862 * 203403193;
            var20 = 308023697 * var3.field_1858;

            for(var21 = var34 - var33; var21 <= var34 + var33; ++var21) {
               for(var22 = var18 - var33; var22 <= var33 + var18; ++var22) {
                  var23 = var21 - var10;
                  int var24 = var22 - var11;
                  if(var23 >= 0) {
                     if(var8 == -2006230823) {
                        throw new IllegalStateException();
                     }

                     if(var24 >= 0) {
                        if(var8 == -2006230823) {
                           throw new IllegalStateException();
                        }

                        if(var23 < 128) {
                           if(var8 == -2006230823) {
                              throw new IllegalStateException();
                           }

                           if(var24 < 128) {
                              if(var8 == -2006230823) {
                                 throw new IllegalStateException();
                              }

                              if(class_215.field_2458[var23][var24] < 100) {
                                 int var25 = 0;
                                 if(var21 < var34) {
                                    if(var8 == -2006230823) {
                                       throw new IllegalStateException();
                                    }

                                    var25 = var34 - var21;
                                 } else if(var21 > var34 + var35 - 1) {
                                    var25 = var21 - (var34 + var35 - 1);
                                 }

                                 int var26 = 0;
                                 if(var22 < var18) {
                                    if(var8 == -2006230823) {
                                       throw new IllegalStateException();
                                    }

                                    var26 = var18 - var22;
                                 } else if(var22 > var18 + var20 - 1) {
                                    if(var8 == -2006230823) {
                                       throw new IllegalStateException();
                                    }

                                    var26 = var22 - (var20 + var18 - 1);
                                 }

                                 int var27 = var26 * var26 + var25 * var25;
                                 if(var27 >= var32) {
                                    if(var32 != var27 || class_215.field_2458[var23][var24] >= var15) {
                                       continue;
                                    }

                                    if(var8 == -2006230823) {
                                       throw new IllegalStateException();
                                    }
                                 }

                                 var32 = var27;
                                 var15 = class_215.field_2458[var23][var24];
                                 var12 = var21;
                                 var31 = var22;
                              }
                           }
                        }
                     }
                  }
               }
            }

            if(Integer.MAX_VALUE == var32) {
               if(var8 == -2006230823) {
                  throw new IllegalStateException();
               }

               return -1;
            }
         }

         if(var12 == var0) {
            if(var8 == -2006230823) {
               throw new IllegalStateException();
            }

            if(var31 == var1) {
               if(var8 == -2006230823) {
                  throw new IllegalStateException();
               }

               return 0;
            }
         }

         var14 = 0;
         class_215.field_2455[var14] = var12;
         var32 = var14 + 1;
         class_215.field_2460[var14] = var31;
         var15 = var16 = class_215.field_2457[var12 - var10][var31 - var11];

         while(true) {
            if(var0 == var12) {
               if(var8 == -2006230823) {
                  throw new IllegalStateException();
               }

               if(var31 == var1) {
                  var34 = 0;

                  while(var32-- > 0) {
                     if(var8 == -2006230823) {
                        throw new IllegalStateException();
                     }

                     var6[var34] = class_215.field_2455[var32];
                     var7[var34++] = class_215.field_2460[var32];
                     if(var34 >= var6.length) {
                        if(var8 == -2006230823) {
                           throw new IllegalStateException();
                        }
                        break;
                     }
                  }

                  return var34;
               }

               if(var8 == -2006230823) {
                  throw new IllegalStateException();
               }
            }

            if(var15 != var16) {
               var16 = var15;
               class_215.field_2455[var32] = var12;
               class_215.field_2460[var32++] = var31;
            }

            if(0 != (var15 & 2)) {
               if(var8 == -2006230823) {
                  throw new IllegalStateException();
               }

               ++var12;
            } else if((var15 & 8) != 0) {
               if(var8 == -2006230823) {
                  throw new IllegalStateException();
               }

               --var12;
            }

            if(0 != (var15 & 1)) {
               if(var8 == -2006230823) {
                  throw new IllegalStateException();
               }

               ++var31;
            } else if((var15 & 4) != 0) {
               if(var8 == -2006230823) {
                  throw new IllegalStateException();
               }

               --var31;
            }

            var15 = class_215.field_2457[var12 - var10][var31 - var11];
         }
      } catch (RuntimeException var28) {
         throw class_223.method_4281(var28);
      }
   }

   // $FF: renamed from: v (int) boolean
   static boolean method_3251() {
      try {
         try {
            if(class_192.field_2298 == null) {
               class_192.field_2298 = class_263.field_2989.method_4038(new URL(class_116.field_1291));
            } else if(class_192.field_2298.method_3963()) {
               byte[] var1 = class_192.field_2298.method_3961();
               class_28 var10000 = new class_28(var1);
               class_28 var2 = var10000;
               var2.method_135();
               class_149.field_1881 = var2.method_132() * 274545041;
               class_166.field_2083 = new class_149[class_149.field_1881 * 1267509105];

               for(int var3 = 0; var3 < 1267509105 * class_149.field_1881; ++var3) {
                  class_149[] var7 = class_166.field_2083;
                  class_149 var10002 = new class_149();
                  class_149 var4 = var7[var3] = var10002;
                  var4.field_1894 = var2.method_132() * -1640224087;
                  var4.field_1890 = var2.method_135() * 1964795281;
                  var4.field_1885 = var2.method_139(-391631059);
                  var4.field_1889 = var2.method_139(-391631059);
                  var4.field_1880 = var2.method_130() * -606233165;
                  var4.field_1882 = var2.method_269(-1542485131) * 687282711;
                  var4.field_1891 = 73870975 * var3;
               }

               class_157.method_3300(class_166.field_2083, 0, class_166.field_2083.length - 1, class_149.field_1884, class_149.field_1883, 259322863);
               class_192.field_2298 = null;
               return true;
            }
         } catch (Exception var5) {
            var5.printStackTrace();
            class_192.field_2298 = null;
         }

         return false;
      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6);
      }
   }

   // $FF: renamed from: hr (boolean, nb, int) void
   static final void method_3252(boolean var0, class_29 var1, int var2) {
      try {
         client.field_1538 = 0;
         client.field_1461 = 0;
         class_29 var3 = client.field_1463.field_2375;
         var3.method_358();
         int var4 = var3.method_361(8, (byte)-48);
         int var5;
         if(var4 < client.field_1459 * -1300723479) {
            if(var2 == 549162683) {
               throw new IllegalStateException();
            }

            for(var5 = var4; var5 < -1300723479 * client.field_1459; ++var5) {
               if(var2 == 549162683) {
                  return;
               }

               client.field_1547[(client.field_1538 += -1263620909) * 1717996379 - 1] = client.field_1460[var5];
            }
         }

         if(var4 > client.field_1459 * -1300723479) {
            if(var2 == 549162683) {
               throw new IllegalStateException();
            } else {
               throw new RuntimeException("");
            }
         } else {
            client.field_1459 = 0;

            int var6;
            int var8;
            int var9;
            int var10;
            for(var5 = 0; var5 < var4; ++var5) {
               if(var2 == 549162683) {
                  throw new IllegalStateException();
               }

               var6 = client.field_1460[var5];
               class_99 var7 = client.field_1458[var6];
               var8 = var3.method_361(1, (byte)-92);
               if(var8 == 0) {
                  client.field_1460[(client.field_1459 += 1942277977) * -1300723479 - 1] = var6;
                  var7.field_1125 = client.field_1425 * 2146319553;
               } else {
                  var9 = var3.method_361(2, (byte)11);
                  if(var9 == 0) {
                     if(var2 == 549162683) {
                        throw new IllegalStateException();
                     }

                     client.field_1460[(client.field_1459 += 1942277977) * -1300723479 - 1] = var6;
                     var7.field_1125 = 2146319553 * client.field_1425;
                     client.field_1462[(client.field_1461 += -308340747) * 1045404765 - 1] = var6;
                  } else {
                     int var11;
                     if(1 == var9) {
                        client.field_1460[(client.field_1459 += 1942277977) * -1300723479 - 1] = var6;
                        var7.field_1125 = client.field_1425 * 2146319553;
                        var10 = var3.method_361(3, (byte)24);
                        var7.method_1815(var10, (byte)1, -300135840);
                        var11 = var3.method_361(1, (byte)-40);
                        if(1 == var11) {
                           client.field_1462[(client.field_1461 += -308340747) * 1045404765 - 1] = var6;
                        }
                     } else if(var9 == 2) {
                        client.field_1460[(client.field_1459 += 1942277977) * -1300723479 - 1] = var6;
                        var7.field_1125 = 2146319553 * client.field_1425;
                        var10 = var3.method_361(3, (byte)22);
                        var7.method_1815(var10, (byte)2, -300135840);
                        var11 = var3.method_361(3, (byte)19);
                        var7.method_1815(var11, (byte)2, -300135840);
                        int var12 = var3.method_361(1, (byte)-26);
                        if(var12 == 1) {
                           if(var2 == 549162683) {
                              throw new IllegalStateException();
                           }

                           client.field_1462[(client.field_1461 += -308340747) * 1045404765 - 1] = var6;
                        }
                     } else if(var9 == 3) {
                        if(var2 == 549162683) {
                           return;
                        }

                        client.field_1547[(client.field_1538 += -1263620909) * 1717996379 - 1] = var6;
                     }
                  }
               }
            }

            int var14;
            while(true) {
               if(var1.method_363(-83736147 * client.field_1463.field_2380) < 27) {
                  if(var2 == 549162683) {
                     throw new IllegalStateException();
                  }
                  break;
               }

               var14 = var1.method_361(15, (byte)41);
               if(32767 == var14) {
                  if(var2 == 549162683) {
                     return;
                  }
                  break;
               }

               boolean var15 = false;
               if(client.field_1458[var14] == null) {
                  if(var2 == 549162683) {
                     throw new IllegalStateException();
                  }

                  class_99[] var10000 = client.field_1458;
                  class_99 var10002 = new class_99();
                  var10000[var14] = var10002;
                  var15 = true;
               }

               class_99 var16 = client.field_1458[var14];
               client.field_1460[(client.field_1459 += 1942277977) * -1300723479 - 1] = var14;
               var16.field_1125 = 2146319553 * client.field_1425;
               var16.field_1141 = class_85.method_1443(var1.method_361(14, (byte)-58), 1856212739);
               if(var0) {
                  var8 = var1.method_361(8, (byte)36);
                  if(var8 > 127) {
                     if(var2 == 549162683) {
                        throw new IllegalStateException();
                     }

                     var8 -= 256;
                  }
               } else {
                  var8 = var1.method_361(5, (byte)-1);
                  if(var8 > 15) {
                     if(var2 == 549162683) {
                        throw new IllegalStateException();
                     }

                     var8 -= 32;
                  }
               }

               int var17;
               if(var0) {
                  if(var2 == 549162683) {
                     throw new IllegalStateException();
                  }

                  var17 = var1.method_361(8, (byte)116);
                  if(var17 > 127) {
                     if(var2 == 549162683) {
                        return;
                     }

                     var17 -= 256;
                  }
               } else {
                  var17 = var1.method_361(5, (byte)-76);
                  if(var17 > 15) {
                     if(var2 == 549162683) {
                        throw new IllegalStateException();
                     }

                     var17 -= 32;
                  }
               }

               var9 = client.field_1543[var1.method_361(3, (byte)-83)];
               if(var15) {
                  if(var2 == 549162683) {
                     throw new IllegalStateException();
                  }

                  var16.field_1106 = (var16.field_1119 = var9 * 1042312747) * 1132248775;
               }

               var10 = var1.method_361(1, (byte)84);
               if(var10 == 1) {
                  client.field_1462[(client.field_1461 += -308340747) * 1045404765 - 1] = var14;
               }

               boolean var19;
               if(var1.method_361(1, (byte)-27) == 1) {
                  if(var2 == 549162683) {
                     throw new IllegalStateException();
                  }

                  var19 = true;
               } else {
                  var19 = false;
               }

               boolean var18 = var19;
               if(var18) {
                  if(var2 == 549162683) {
                     throw new IllegalStateException();
                  }

                  var1.method_361(32, (byte)13);
               }

               var6 = var1.method_361(1, (byte)-68);
               var16.field_1079 = var16.field_1141.field_859 * 400673345;
               var16.field_1129 = var16.field_1141.field_882 * -310470265;
               if(var16.field_1129 * -1889632377 == 0) {
                  var16.field_1119 = 0;
               }

               var16.field_1084 = 1103534349 * var16.field_1141.field_865;
               var16.field_1107 = var16.field_1141.field_870 * 1323745451;
               var16.field_1132 = var16.field_1141.field_867 * -504576421;
               var16.field_1087 = -1041316411 * var16.field_1141.field_868;
               var16.field_1081 = var16.field_1141.field_875 * -1839197911;
               var16.field_1121 = var16.field_1141.field_863 * 742534067;
               var16.field_1083 = -538991979 * var16.field_1141.field_874;
               int var10001 = var17 + class_164.field_2044.field_1112[0];
               int var20 = var8 + class_164.field_2044.field_1126[0];
               boolean var10003;
               if(var6 == 1) {
                  if(var2 == 549162683) {
                     throw new IllegalStateException();
                  }

                  var10003 = true;
               } else {
                  var10003 = false;
               }

               var16.method_1816(var10001, var20, var10003, -660093008);
            }

            var1.method_362();
            class_45.method_529(var1, -1497241252);

            for(var14 = 0; var14 < client.field_1538 * 1717996379; ++var14) {
               var4 = client.field_1547[var14];
               if(1280286129 * client.field_1458[var4].field_1125 != client.field_1425 * -1702273423) {
                  client.field_1458[var4].field_1141 = null;
                  client.field_1458[var4] = null;
               }
            }

            if(-442398587 * var1.field_15 != client.field_1463.field_2380 * -83736147) {
               if(var2 == 549162683) {
                  throw new IllegalStateException();
               } else {
                  throw new RuntimeException(-442398587 * var1.field_15 + class_205.field_2400 + -83736147 * client.field_1463.field_2380);
               }
            } else {
               for(var14 = 0; var14 < -1300723479 * client.field_1459; ++var14) {
                  if(var2 == 549162683) {
                     return;
                  }

                  if(client.field_1458[client.field_1460[var14]] == null) {
                     if(var2 == 549162683) {
                        throw new IllegalStateException();
                     }

                     throw new RuntimeException(var14 + class_205.field_2400 + client.field_1459 * -1300723479);
                  }
               }

            }
         }
      } catch (RuntimeException var13) {
         throw class_223.method_4281(var13);
      }
   }
}
