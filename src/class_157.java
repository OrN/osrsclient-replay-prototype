import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

// $FF: renamed from: bu
public class class_157 {

    // $FF: renamed from: f md
   class_364 field_1953;
   // $FF: renamed from: v jv
   class_306 field_1954;
   // $FF: renamed from: y md
   class_364 field_1955;
   // $FF: renamed from: de jp
   static class_307 field_1956;
   // $FF: renamed from: rw int
   static int field_1957;
   // $FF: renamed from: j int
   public static int field_1958;
   // $FF: renamed from: n jv
   class_306 field_1959;


   // $FF: renamed from: v (int) void
   public static void method_3279() {
      try {
         class_323 var10000 = new class_323();
         class_153.field_1926 = var10000;
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1);
      }
   }

   // $FF: renamed from: v (int, int, int[], byte) au
   class_110 method_3280(int var1, int var2, int[] var3, byte var4) {
      try {
         int var5 = var2 ^ (var1 << 4 & '\uffff' | var1 >>> 12);
         var5 |= var1 << 16;
         long var6 = (long)var5;
         class_110 var8 = (class_110)this.field_1955.method_6523(var6);
         if(var8 != null) {
            if(var4 == 0) {
               throw new IllegalStateException();
            } else {
               return var8;
            }
         } else {
            if(null != var3) {
               if(var4 == 0) {
                  throw new IllegalStateException();
               }

               if(var3[0] <= 0) {
                  if(var4 == 0) {
                     throw new IllegalStateException();
                  }

                  return null;
               }
            }

            class_24 var9 = class_24.method_79(this.field_1954, var1, var2);
            if(null == var9) {
               if(var4 == 0) {
                  throw new IllegalStateException();
               } else {
                  return null;
               }
            } else {
               var8 = var9.method_78();
               this.field_1955.method_6525(var8, var6);
               if(var3 != null) {
                  if(var4 == 0) {
                     throw new IllegalStateException();
                  }

                  var3[0] -= var8.field_1266.length;
               }

               return var8;
            }
         }
      } catch (RuntimeException var10) {
         throw class_223.method_4281(var10);
      }
   }

   // $FF: renamed from: f (int, int[], byte) au
   public class_110 method_3281(int var1, int[] var2, byte var3) {
      try {
         if(this.field_1954.method_5457() == 1) {
            if(var3 == 1) {
               throw new IllegalStateException();
            } else {
               return this.method_3280(0, var1, var2, (byte)22);
            }
         } else if(this.field_1954.method_5393(var1) == 1) {
            if(var3 == 1) {
               throw new IllegalStateException();
            } else {
               return this.method_3280(var1, 0, var2, (byte)85);
            }
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

    // $FF: renamed from: y (int, int[], int) au
   public class_110 method_3284(int var1, int[] var2, int var3) {
      try {
         if(this.field_1959.method_5457() == 1) {
            if(var3 <= 1858423015) {
               throw new IllegalStateException();
            } else {
               return this.method_3295(0, var1, var2, (byte)83);
            }
         } else if(this.field_1959.method_5393(var1) == 1) {
            if(var3 <= 1858423015) {
               throw new IllegalStateException();
            } else {
               return this.method_3295(var1, 0, var2, (byte)9);
            }
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

    // $FF: renamed from: n (int, int, int[], byte) au
   class_110 method_3295(int var1, int var2, int[] var3, byte var4) {
      try {
         int var5 = var2 ^ (var1 << 4 & '\uffff' | var1 >>> 12);
         var5 |= var1 << 16;
         long var6 = (long)var5 ^ 4294967296L;
         class_110 var8 = (class_110)this.field_1955.method_6523(var6);
         if(null != var8) {
            return var8;
         } else {
            if(null != var3) {
               if(var4 == 0) {
                  throw new IllegalStateException();
               }

               if(var3[0] <= 0) {
                  if(var4 == 0) {
                     throw new IllegalStateException();
                  }

                  return null;
               }
            }

            class_57 var9 = (class_57)this.field_1953.method_6523(var6);
            if(null == var9) {
               if(var4 == 0) {
                  throw new IllegalStateException();
               }

               var9 = class_57.method_594(this.field_1959, var1, var2);
               if(var9 == null) {
                  if(var4 == 0) {
                     throw new IllegalStateException();
                  }

                  return null;
               }

               this.field_1953.method_6525(var9, var6);
            }

            var8 = var9.method_604(var3);
            if(var8 == null) {
               if(var4 == 0) {
                  throw new IllegalStateException();
               } else {
                  return null;
               }
            } else {
               var9.method_108();
               this.field_1955.method_6525(var8, var6);
               return var8;
            }
         }
      } catch (RuntimeException var10) {
         throw class_223.method_4281(var10);
      }
   }

    // $FF: renamed from: <init> (jv, jv) void
   public class_157(class_306 var1, class_306 var2) {
      super();
      try {
         class_364 var10001 = new class_364(256);
         this.field_1953 = var10001;
         var10001 = new class_364(256);
         this.field_1955 = var10001;
         this.field_1954 = var1;
         this.field_1959 = var2;
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: y (int) void
   public static void method_3299(int var0) {
      try {
         try {
            File fRandom = new File(class_115.homeDirectory, "random.dat");
            class_376 var10000;
            class_383 var10002;
            int var3;
            if(fRandom.exists()) {
               if(var0 <= 607273756) {
                  throw new IllegalStateException();
               }

               var10002 = new class_383(fRandom, "rw", 25L);
               var10000 = new class_376(var10002, 24, 0);
               class_199.field_2344 = var10000;
            } else {
               label49:
               for(int var2 = 0; var2 < class_292.field_3333.length; ++var2) {
                  if(var0 <= 607273756) {
                     throw new IllegalStateException();
                  }

                  for(var3 = 0; var3 < class_48.cacheDirectories.length; ++var3) {
                     File var4 = new File(class_48.cacheDirectories[var3] + class_292.field_3333[var2] + File.separatorChar + "random.dat");
                     if(var4.exists()) {
                        if(var0 <= 607273756) {
                           throw new IllegalStateException();
                        }

                        var10002 = new class_383(var4, "rw", 25L);
                        var10000 = new class_376(var10002, 24, 0);
                        class_199.field_2344 = var10000;
                        break label49;
                     }
                  }
               }
            }

            if(class_199.field_2344 == null) {
               if(var0 <= 607273756) {
                  throw new IllegalStateException();
               }

               RandomAccessFile var7 = new RandomAccessFile(fRandom, "rw");
               var3 = var7.read();
               var7.seek(0L);
               var7.write(var3);
               var7.seek(0L);
               var7.close();
               var10002 = new class_383(fRandom, "rw", 25L);
               var10000 = new class_376(var10002, 24, 0);
               class_199.field_2344 = var10000;
            }
         } catch (IOException var5) {
            ;
         }

      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6);
      }
   }

   // $FF: renamed from: f (bg[], int, int, int[], int[], int) void
   static void method_3300(class_149[] var0, int var1, int var2, int[] var3, int[] var4, int var5) {
      try {
         if(var1 < var2) {
            if(var5 == 773021759) {
               return;
            }

            int var6 = var1 - 1;
            int var7 = var2 + 1;
            int var8 = (var1 + var2) / 2;
            class_149 var9 = var0[var8];
            var0[var8] = var0[var1];
            var0[var1] = var9;

            while(var6 < var7) {
               boolean var10 = true;

               int var11;
               int var12;
               int var13;
               do {
                  --var7;

                  for(var11 = 0; var11 < 4; ++var11) {
                     if(var5 == 773021759) {
                        return;
                     }

                     if(var3[var11] == 2) {
                        if(var5 == 773021759) {
                           throw new IllegalStateException();
                        }

                        var12 = var0[var7].field_1891 * 2005307775;
                        var13 = var9.field_1891 * 2005307775;
                     } else if(1 == var3[var11]) {
                        var12 = var0[var7].field_1882 * -508707417;
                        var13 = -508707417 * var9.field_1882;
                        if(var12 == -1) {
                           if(var5 == 773021759) {
                              throw new IllegalStateException();
                           }

                           if(var4[var11] == 1) {
                              if(var5 == 773021759) {
                                 return;
                              }

                              var12 = 2001;
                           }
                        }

                        if(var13 == -1 && var4[var11] == 1) {
                           if(var5 == 773021759) {
                              throw new IllegalStateException();
                           }

                           var13 = 2001;
                        }
                     } else if(3 == var3[var11]) {
                        if(var5 == 773021759) {
                           return;
                        }

                        var12 = var0[var7].method_3130(931416520)?1:0;
                        var13 = var9.method_3130(-1183127982)?1:0;
                     } else {
                        var12 = -1428153959 * var0[var7].field_1894;
                        var13 = var9.field_1894 * -1428153959;
                     }

                     if(var12 != var13) {
                        if(1 == var4[var11]) {
                           if(var5 == 773021759) {
                              throw new IllegalStateException();
                           }

                           if(var12 > var13) {
                              if(var5 == 773021759) {
                                 throw new IllegalStateException();
                              }
                              break;
                           }
                        }

                        if(0 == var4[var11]) {
                           if(var5 == 773021759) {
                              throw new IllegalStateException();
                           }

                           if(var12 < var13) {
                              break;
                           }
                        }

                        var10 = false;
                        break;
                     }

                     if(var5 == 773021759) {
                        return;
                     }

                     if(3 == var11) {
                        if(var5 == 773021759) {
                           throw new IllegalStateException();
                        }

                        var10 = false;
                     }
                  }
               } while(var10);

               if(var5 == 773021759) {
                  throw new IllegalStateException();
               }

               var10 = true;

               do {
                  ++var6;

                  for(var11 = 0; var11 < 4; ++var11) {
                     if(var3[var11] == 2) {
                        if(var5 == 773021759) {
                           throw new IllegalStateException();
                        }

                        var12 = var0[var6].field_1891 * 2005307775;
                        var13 = 2005307775 * var9.field_1891;
                     } else if(var3[var11] == 1) {
                        var12 = -508707417 * var0[var6].field_1882;
                        var13 = -508707417 * var9.field_1882;
                        if(-1 == var12) {
                           if(var5 == 773021759) {
                              throw new IllegalStateException();
                           }

                           if(var4[var11] == 1) {
                              if(var5 == 773021759) {
                                 throw new IllegalStateException();
                              }

                              var12 = 2001;
                           }
                        }

                        if(var13 == -1) {
                           if(var5 == 773021759) {
                              return;
                           }

                           if(1 == var4[var11]) {
                              if(var5 == 773021759) {
                                 throw new IllegalStateException();
                              }

                              var13 = 2001;
                           }
                        }
                     } else if(var3[var11] == 3) {
                        if(var5 == 773021759) {
                           throw new IllegalStateException();
                        }

                        byte var10000;
                        if(var0[var6].method_3130(-1122886756)) {
                           if(var5 == 773021759) {
                              return;
                           }

                           var10000 = 1;
                        } else {
                           var10000 = 0;
                        }

                        var12 = var10000;
                        var13 = var9.method_3130(-279261541)?1:0;
                     } else {
                        var12 = var0[var6].field_1894 * -1428153959;
                        var13 = -1428153959 * var9.field_1894;
                     }

                     if(var12 != var13) {
                        if(var4[var11] == 1 && var12 < var13) {
                           if(var5 == 773021759) {
                              throw new IllegalStateException();
                           }
                           break;
                        }

                        if(0 == var4[var11]) {
                           if(var5 == 773021759) {
                              throw new IllegalStateException();
                           }

                           if(var12 > var13) {
                              if(var5 == 773021759) {
                                 return;
                              }
                              break;
                           }
                        }

                        var10 = false;
                        break;
                     }

                     if(var5 == 773021759) {
                        throw new IllegalStateException();
                     }

                     if(var11 == 3) {
                        if(var5 == 773021759) {
                           throw new IllegalStateException();
                        }

                        var10 = false;
                     }
                  }
               } while(var10);

               if(var6 < var7) {
                  if(var5 == 773021759) {
                     throw new IllegalStateException();
                  }

                  class_149 var15 = var0[var6];
                  var0[var6] = var0[var7];
                  var0[var7] = var15;
               }
            }

            method_3300(var0, var1, var7, var3, var4, 749397340);
            method_3300(var0, 1 + var7, var2, var3, var4, -1057873751);
         }

      } catch (RuntimeException var14) {
         throw class_223.method_4281(var14);
      }
   }

}
