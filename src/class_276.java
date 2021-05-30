import java.util.concurrent.ScheduledExecutorService;

// $FF: renamed from: id
public class class_276 {

   // $FF: renamed from: f int[]
   int[] field_3217;
   // $FF: renamed from: n byte[]
   byte[] field_3218;
   // $FF: renamed from: v int[]
   int[] field_3219;
   // $FF: renamed from: b java.util.concurrent.ScheduledExecutorService
   static ScheduledExecutorService field_3220;
   // $FF: renamed from: nt int
   static final int field_3221 = 31;


   // $FF: renamed from: f (byte[], int, int, byte[], int) int
   int method_5127(byte[] var1, int var2, int var3, byte[] var4, int var5) {
      int var6 = 0;
      int var7 = var5 << 3;

      for(var3 += var2; var2 < var3; ++var2) {
         int var8 = var1[var2] & 1844034790;
         int var9 = this.field_3219[var8];
         byte var10 = this.field_3218[var8];
         if(0 == var10) {
            throw new RuntimeException("" + var8);
         }

         int var11 = var7 >> 3;
         int var12 = var7 & 7;
         var6 &= -var12 >> 31;
         int var13 = var11 + (var10 + var12 - 1 >> 3);
         var12 += 24;
         var4[var11] = (byte)(var6 |= var9 >>> var12);
         if(var11 < var13) {
            ++var11;
            var12 -= 8;
            var4[var11] = (byte)(var6 = var9 >>> var12);
            if(var11 < var13) {
               ++var11;
               var12 -= 8;
               var4[var11] = (byte)(var6 = var9 >>> var12);
               if(var11 < var13) {
                  ++var11;
                  var12 -= 8;
                  var4[var11] = (byte)(var6 = var9 >>> var12);
                  if(var11 < var13) {
                     ++var11;
                     var12 -= 8;
                     var4[var11] = (byte)(var6 = var9 << -var12);
                  }
               }
            }
         }

         var7 += var10;
      }

      return (7 + var7 >> 3) - var5;
   }

   // $FF: renamed from: v (byte[], int, int, byte[], int, int) int
   int method_5128(byte[] var1, int var2, int var3, byte[] var4, int var5, int var6) {
      try {
         int var7 = 0;
         int var8 = var5 << 3;

         for(var3 += var2; var2 < var3; ++var2) {
            if(var6 != -1771956050) {
               throw new IllegalStateException();
            }

            int var9 = var1[var2] & 255;
            int var10 = this.field_3219[var9];
            byte var11 = this.field_3218[var9];
            if(0 == var11) {
               if(var6 != -1771956050) {
                  throw new IllegalStateException();
               }

               throw new RuntimeException("" + var9);
            }

            int var12 = var8 >> 3;
            int var13 = var8 & 7;
            var7 &= -var13 >> 31;
            int var14 = var12 + (var11 + var13 - 1 >> 3);
            var13 += 24;
            var4[var12] = (byte)(var7 |= var10 >>> var13);
            if(var12 >= var14) {
               if(var6 != -1771956050) {
                  throw new IllegalStateException();
               }
            } else {
               ++var12;
               var13 -= 8;
               var4[var12] = (byte)(var7 = var10 >>> var13);
               if(var12 >= var14) {
                  if(var6 != -1771956050) {
                     throw new IllegalStateException();
                  }
               } else {
                  ++var12;
                  var13 -= 8;
                  var4[var12] = (byte)(var7 = var10 >>> var13);
                  if(var12 >= var14) {
                     if(var6 != -1771956050) {
                        throw new IllegalStateException();
                     }
                  } else {
                     ++var12;
                     var13 -= 8;
                     var4[var12] = (byte)(var7 = var10 >>> var13);
                     if(var12 >= var14) {
                        if(var6 != -1771956050) {
                           throw new IllegalStateException();
                        }
                     } else {
                        ++var12;
                        var13 -= 8;
                        var4[var12] = (byte)(var7 = var10 << -var13);
                     }
                  }
               }
            }

            var8 += var11;
         }

         return (7 + var8 >> 3) - var5;
      } catch (RuntimeException var15) {
         throw class_223.method_4281(var15, "id.v(" + ')');
      }
   }

   // $FF: renamed from: <init> (byte[]) void
   public void method_5129(byte[] var1) {
      try {
         super();
         int var2 = var1.length;
         this.field_3219 = new int[var2];
         this.field_3218 = var1;
         int[] var3 = new int[33];
         this.field_3217 = new int[8];
         int var4 = 0;

         for(int var5 = 0; var5 < var2; ++var5) {
            byte var6 = var1[var5];
            if(0 != var6) {
               int var7 = 1 << 32 - var6;
               int var8 = var3[var6];
               this.field_3219[var5] = var8;
               int var9;
               int var10;
               int var11;
               int var12;
               if((var8 & var7) != 0) {
                  var9 = var3[var6 - 1];
               } else {
                  var9 = var8 | var7;

                  for(var10 = var6 - 1; var10 >= 1; --var10) {
                     var11 = var3[var10];
                     if(var8 != var11) {
                        break;
                     }

                     var12 = 1 << 32 - var10;
                     if((var11 & var12) != 0) {
                        var3[var10] = var3[var10 - 1];
                        break;
                     }

                     var3[var10] = var11 | var12;
                  }
               }

               var3[var6] = var9;

               for(var10 = var6 + 1; var10 <= 32; ++var10) {
                  if(var3[var10] == var8) {
                     var3[var10] = var9;
                  }
               }

               var10 = 0;

               for(var11 = 0; var11 < var6; ++var11) {
                  var12 = Integer.MIN_VALUE >>> var11;
                  if(0 != (var8 & var12)) {
                     if(0 == this.field_3217[var10]) {
                        this.field_3217[var10] = var4;
                     }

                     var10 = this.field_3217[var10];
                  } else {
                     ++var10;
                  }

                  if(var10 >= this.field_3217.length) {
                     int[] var13 = new int[2 * this.field_3217.length];

                     for(int var14 = 0; var14 < this.field_3217.length; ++var14) {
                        var13[var14] = this.field_3217[var14];
                     }

                     this.field_3217 = var13;
                  }

                  var12 >>>= 1;
               }

               this.field_3217[var10] = ~var5;
               if(var10 >= var4) {
                  var4 = 1 + var10;
               }
            }
         }

      } catch (RuntimeException var15) {
         throw class_223.method_4281(var15, "id.<init>(" + ')');
      }
   }

   // $FF: renamed from: n (byte[], int, byte[], int, int, int) int
   int method_5130(byte[] var1, int var2, byte[] var3, int var4, int var5, int var6) {
      try {
         if(0 == var5) {
            if(var6 <= 2144706699) {
               throw new IllegalStateException();
            } else {
               return 0;
            }
         } else {
            int var7 = 0;
            var5 += var4;
            int var8 = var2;

            while(true) {
               byte var9 = var1[var8];
               if(var9 < 0) {
                  if(var6 <= 2144706699) {
                     throw new IllegalStateException();
                  }

                  var7 = this.field_3217[var7];
               } else {
                  ++var7;
               }

               int var10;
               if((var10 = this.field_3217[var7]) < 0) {
                  var3[var4++] = (byte)(~var10);
                  if(var4 >= var5) {
                     break;
                  }

                  var7 = 0;
               }

               if(0 != (var9 & 64)) {
                  var7 = this.field_3217[var7];
               } else {
                  ++var7;
               }

               if((var10 = this.field_3217[var7]) < 0) {
                  var3[var4++] = (byte)(~var10);
                  if(var4 >= var5) {
                     if(var6 <= 2144706699) {
                        throw new IllegalStateException();
                     }
                     break;
                  }

                  var7 = 0;
               }

               if(0 != (var9 & 32)) {
                  if(var6 <= 2144706699) {
                     throw new IllegalStateException();
                  }

                  var7 = this.field_3217[var7];
               } else {
                  ++var7;
               }

               if((var10 = this.field_3217[var7]) < 0) {
                  if(var6 <= 2144706699) {
                     throw new IllegalStateException();
                  }

                  var3[var4++] = (byte)(~var10);
                  if(var4 >= var5) {
                     if(var6 <= 2144706699) {
                        throw new IllegalStateException();
                     }
                     break;
                  }

                  var7 = 0;
               }

               if((var9 & 16) != 0) {
                  if(var6 <= 2144706699) {
                     throw new IllegalStateException();
                  }

                  var7 = this.field_3217[var7];
               } else {
                  ++var7;
               }

               if((var10 = this.field_3217[var7]) < 0) {
                  if(var6 <= 2144706699) {
                     throw new IllegalStateException();
                  }

                  var3[var4++] = (byte)(~var10);
                  if(var4 >= var5) {
                     break;
                  }

                  var7 = 0;
               }

               if((var9 & 8) != 0) {
                  if(var6 <= 2144706699) {
                     throw new IllegalStateException();
                  }

                  var7 = this.field_3217[var7];
               } else {
                  ++var7;
               }

               if((var10 = this.field_3217[var7]) < 0) {
                  if(var6 <= 2144706699) {
                     throw new IllegalStateException();
                  }

                  var3[var4++] = (byte)(~var10);
                  if(var4 >= var5) {
                     if(var6 <= 2144706699) {
                        throw new IllegalStateException();
                     }
                     break;
                  }

                  var7 = 0;
               }

               if((var9 & 4) != 0) {
                  if(var6 <= 2144706699) {
                     throw new IllegalStateException();
                  }

                  var7 = this.field_3217[var7];
               } else {
                  ++var7;
               }

               if((var10 = this.field_3217[var7]) < 0) {
                  var3[var4++] = (byte)(~var10);
                  if(var4 >= var5) {
                     if(var6 <= 2144706699) {
                        throw new IllegalStateException();
                     }
                     break;
                  }

                  var7 = 0;
               }

               if((var9 & 2) != 0) {
                  if(var6 <= 2144706699) {
                     throw new IllegalStateException();
                  }

                  var7 = this.field_3217[var7];
               } else {
                  ++var7;
               }

               if((var10 = this.field_3217[var7]) < 0) {
                  var3[var4++] = (byte)(~var10);
                  if(var4 >= var5) {
                     if(var6 <= 2144706699) {
                        throw new IllegalStateException();
                     }
                     break;
                  }

                  var7 = 0;
               }

               if(0 != (var9 & 1)) {
                  if(var6 <= 2144706699) {
                     throw new IllegalStateException();
                  }

                  var7 = this.field_3217[var7];
               } else {
                  ++var7;
               }

               if((var10 = this.field_3217[var7]) < 0) {
                  var3[var4++] = (byte)(~var10);
                  if(var4 >= var5) {
                     break;
                  }

                  var7 = 0;
               }

               ++var8;
            }

            return 1 + var8 - var2;
         }
      } catch (RuntimeException var11) {
         throw class_223.method_4281(var11, "id.n(" + ')');
      }
   }

   // $FF: renamed from: y (byte[], int, byte[], int, int) int
   int method_5131(byte[] var1, int var2, byte[] var3, int var4, int var5) {
      if(0 == var5) {
         return 0;
      } else {
         int var6 = 0;
         var5 += var4;
         int var7 = var2;

         while(true) {
            byte var8 = var1[var7];
            if(var8 < 0) {
               var6 = this.field_3217[var6];
            } else {
               ++var6;
            }

            int var9;
            if((var9 = this.field_3217[var6]) < 0) {
               var3[var4++] = (byte)(~var9);
               if(var4 >= var5) {
                  break;
               }

               var6 = 0;
            }

            if(0 != (var8 & 64)) {
               var6 = this.field_3217[var6];
            } else {
               ++var6;
            }

            if((var9 = this.field_3217[var6]) < 0) {
               var3[var4++] = (byte)(~var9);
               if(var4 >= var5) {
                  break;
               }

               var6 = 0;
            }

            if(0 != (var8 & 32)) {
               var6 = this.field_3217[var6];
            } else {
               ++var6;
            }

            if((var9 = this.field_3217[var6]) < 0) {
               var3[var4++] = (byte)(~var9);
               if(var4 >= var5) {
                  break;
               }

               var6 = 0;
            }

            if((var8 & 16) != 0) {
               var6 = this.field_3217[var6];
            } else {
               ++var6;
            }

            if((var9 = this.field_3217[var6]) < 0) {
               var3[var4++] = (byte)(~var9);
               if(var4 >= var5) {
                  break;
               }

               var6 = 0;
            }

            if((var8 & 8) != 0) {
               var6 = this.field_3217[var6];
            } else {
               ++var6;
            }

            if((var9 = this.field_3217[var6]) < 0) {
               var3[var4++] = (byte)(~var9);
               if(var4 >= var5) {
                  break;
               }

               var6 = 0;
            }

            if((var8 & 4) != 0) {
               var6 = this.field_3217[var6];
            } else {
               ++var6;
            }

            if((var9 = this.field_3217[var6]) < 0) {
               var3[var4++] = (byte)(~var9);
               if(var4 >= var5) {
                  break;
               }

               var6 = 0;
            }

            if((var8 & 2) != 0) {
               var6 = this.field_3217[var6];
            } else {
               ++var6;
            }

            if((var9 = this.field_3217[var6]) < 0) {
               var3[var4++] = (byte)(~var9);
               if(var4 >= var5) {
                  break;
               }

               var6 = 0;
            }

            if(0 != (var8 & 1)) {
               var6 = this.field_3217[var6];
            } else {
               ++var6;
            }

            if((var9 = this.field_3217[var6]) < 0) {
               var3[var4++] = (byte)(~var9);
               if(var4 >= var5) {
                  break;
               }

               var6 = 0;
            }

            ++var7;
         }

         return 1 + var7 - var2;
      }
   }
}
