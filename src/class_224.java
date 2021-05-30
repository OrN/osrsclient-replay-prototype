
// $FF: renamed from: fj
public class class_224 implements class_6 {

   // $FF: renamed from: r int
   int field_2530;
   // $FF: renamed from: n int
   int field_2531;
   // $FF: renamed from: f int
   int field_2532;
   // $FF: renamed from: d int
   int field_2533;
   // $FF: renamed from: p int
   int field_2534;
   // $FF: renamed from: j int
   int field_2535;
   // $FF: renamed from: y int
   int field_2536;
   // $FF: renamed from: b int
   int field_2537;
   // $FF: renamed from: v int
   int field_2538;
   // $FF: renamed from: s int
   int field_2539;


   // $FF: renamed from: c (int, int) boolean
   public boolean method_22(int var1, int var2) {
      return var1 >= (this.field_2534 * 1859823215 << 6) + (832342515 * this.field_2533 << 3) && var1 <= (1859823215 * this.field_2534 << 6) + (this.field_2533 * 832342515 << 3) + 7 && var2 >= (this.field_2539 * -701591619 << 3) + (this.field_2535 * -466083281 << 6) && var2 <= 7 + (this.field_2535 * -466083281 << 6) + (-701591619 * this.field_2539 << 3);
   }

   // $FF: renamed from: v (fo, int) void
   public void method_16(class_230 var1, int var2) {
      try {
         if(var1.field_2584 * -214984287 > 1859823215 * this.field_2534) {
            if(var2 == 859416337) {
               throw new IllegalStateException();
            }

            var1.field_2584 = this.field_2534 * -221583857;
         }

         if(1975622015 * var1.field_2575 < 1859823215 * this.field_2534) {
            var1.field_2575 = -1306981615 * this.field_2534;
         }

         if(-1153356879 * var1.field_2583 > -466083281 * this.field_2535) {
            var1.field_2583 = this.field_2535 * 502268895;
         }

         if(var1.field_2582 * 1020551999 < -466083281 * this.field_2535) {
            if(var2 == 859416337) {
               return;
            }

            var1.field_2582 = this.field_2535 * -1651591919;
         }

      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: n (int, int, int, int) boolean
   public boolean method_23(int var1, int var2, int var3, int var4) {
      try {
         if(var1 >= 398172859 * this.field_2538) {
            if(var4 != 264048682) {
               throw new IllegalStateException();
            }

            if(var1 < this.field_2538 * 398172859 + this.field_2531 * -829119157) {
               boolean var10000;
               if(var2 >= (-558728135 * this.field_2530 << 3) + (2102107219 * this.field_2532 << 6)) {
                  if(var4 != 264048682) {
                     throw new IllegalStateException();
                  }

                  if(var2 <= (2102107219 * this.field_2532 << 6) + (this.field_2530 * -558728135 << 3) + 7) {
                     if(var4 != 264048682) {
                        throw new IllegalStateException();
                     }

                     if(var3 >= (this.field_2537 * -77605471 << 3) + (-620257867 * this.field_2536 << 6)) {
                        if(var4 != 264048682) {
                           throw new IllegalStateException();
                        }

                        if(var3 <= (this.field_2537 * -77605471 << 3) + (this.field_2536 * -620257867 << 6) + 7) {
                           if(var4 != 264048682) {
                              throw new IllegalStateException();
                           }

                           var10000 = true;
                           return var10000;
                        }
                     }
                  }
               }

               var10000 = false;
               return var10000;
            }

            if(var4 != 264048682) {
               throw new IllegalStateException();
            }
         }

         return false;
      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5);
      }
   }

   // $FF: renamed from: r (int) void
   void method_4282() {
      try {
         ;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: <init> () void
   class_224() {
      super();
      try {
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1);
      }
   }

   // $FF: renamed from: p (int, int, int) ii
   public class_280 method_29(int var1, int var2, int var3) {
      try {
         if(!this.method_14(var1, var2, (byte)-112)) {
            if(var3 <= -1010131779) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            int var4 = var1 + (this.field_2532 * 1390875840 - -1230398528 * this.field_2534) + (this.field_2530 * -174857784 - this.field_2533 * -1931194472);
            int var5 = -620843768 * this.field_2537 - -1317765656 * this.field_2539 + var2 + (this.field_2536 * -1041797824 - this.field_2535 * 235441088);
            class_280 var10000 = new class_280(this.field_2538 * 398172859, var4, var5);
            return var10000;
         }
      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6);
      }
   }

   // $FF: renamed from: j (nd, int) void
   public void method_15(Buffer var1) {
      try {
         this.field_2538 = var1.readUnsignedByte() * 1130517107;
         this.field_2531 = var1.readUnsignedByte() * 1103346787;
         this.field_2532 = var1.readShort() * -1150744613;
         this.field_2530 = var1.readUnsignedByte() * 808104457;
         this.field_2536 = var1.readShort() * 1525688477;
         this.field_2537 = var1.readUnsignedByte() * 1157189217;
         this.field_2534 = var1.readShort() * 1815574671;
         this.field_2533 = var1.readUnsignedByte() * -724355269;
         this.field_2535 = var1.readShort() * -1000446769;
         this.field_2539 = var1.readUnsignedByte() * 7709589;
         this.method_4282();
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: g (int, int, int) int[]
   public int[] method_10(int var1, int var2, int var3) {
      if(!this.method_23(var1, var2, var3, 264048682)) {
         return null;
      } else {
         int[] var4 = new int[]{var2 + (this.field_2534 * -1230398528 - 1390875840 * this.field_2532) + (-1931194472 * this.field_2533 - -174857784 * this.field_2530), this.field_2539 * -1317765656 - 515570678 * this.field_2537 + this.field_2535 * -853510490 - -1041797824 * this.field_2536 + var3};
         return var4;
      }
   }

   // $FF: renamed from: u (int, int, int) boolean
   public boolean method_19(int var1, int var2, int var3) {
      return var1 >= 398172859 * this.field_2538 && var1 < this.field_2538 * 398172859 + this.field_2531 * -829119157?var2 >= (-558728135 * this.field_2530 << 3) + (2102107219 * this.field_2532 << 6) && var2 <= (2102107219 * this.field_2532 << 6) + (this.field_2530 * -558728135 << 3) + 7 && var3 >= (this.field_2537 * -77605471 << 3) + (-620257867 * this.field_2536 << 6) && var3 <= (this.field_2537 * -77605471 << 3) + (this.field_2536 * -620257867 << 6) + 7:false;
   }

   // $FF: renamed from: d (int, int, int) boolean
   public boolean method_17(int var1, int var2, int var3) {
      return var1 >= 398172859 * this.field_2538 && var1 < this.field_2538 * 398172859 + this.field_2531 * -34276623?var2 >= (-558728135 * this.field_2530 << 3) + (2102107219 * this.field_2532 << 6) && var2 <= (2063246357 * this.field_2532 << 6) + (this.field_2530 * 930052326 << 3) + 7 && var3 >= (this.field_2537 * 1512650891 << 3) + (-2002978341 * this.field_2536 << 6) && var3 <= (this.field_2537 * -77605471 << 3) + (this.field_2536 * 420127952 << 6) + 7:false;
   }

   // $FF: renamed from: s (int, int, int) boolean
   public boolean method_18(int var1, int var2, int var3) {
      return var1 >= 398172859 * this.field_2538 && var1 < this.field_2538 * 398172859 + this.field_2531 * -829119157?var2 >= (-558728135 * this.field_2530 << 3) + (2102107219 * this.field_2532 << 6) && var2 <= (2102107219 * this.field_2532 << 6) + (this.field_2530 * -558728135 << 3) + 7 && var3 >= (this.field_2537 * -77605471 << 3) + (-620257867 * this.field_2536 << 6) && var3 <= (this.field_2537 * -77605471 << 3) + (this.field_2536 * -620257867 << 6) + 7:false;
   }

   // $FF: renamed from: e (int, int, int) int[]
   public int[] method_24(int var1, int var2, int var3) {
      if(!this.method_23(var1, var2, var3, 264048682)) {
         return null;
      } else {
         int[] var4 = new int[]{var2 + (this.field_2534 * 1933356233 - 1390875840 * this.field_2532) + (1349781130 * this.field_2533 - -1013856322 * this.field_2530), this.field_2539 * -1317765656 - -620843768 * this.field_2537 + this.field_2535 * 1865308906 - 1448423472 * this.field_2536 + var3};
         return var4;
      }
   }

   // $FF: renamed from: l (int, int) boolean
   public boolean method_20(int var1, int var2) {
      return var1 >= (this.field_2534 * 1859823215 << 6) + (832342515 * this.field_2533 << 3) && var1 <= (1859823215 * this.field_2534 << 6) + (this.field_2533 * 832342515 << 3) + 7 && var2 >= (this.field_2539 * -701591619 << 3) + (this.field_2535 * -466083281 << 6) && var2 <= 7 + (this.field_2535 * -466083281 << 6) + (-701591619 * this.field_2539 << 3);
   }

   // $FF: renamed from: o (int, int) boolean
   public boolean method_21(int var1, int var2) {
      return var1 >= (this.field_2534 * 1859823215 << 6) + (832342515 * this.field_2533 << 3) && var1 <= (1859823215 * this.field_2534 << 6) + (this.field_2533 * 832342515 << 3) + 7 && var2 >= (this.field_2539 * -701591619 << 3) + (this.field_2535 * -466083281 << 6) && var2 <= 7 + (this.field_2535 * -466083281 << 6) + (-701591619 * this.field_2539 << 3);
   }

   // $FF: renamed from: y (int, int, int, int) int[]
   public int[] method_13(int var1, int var2, int var3, int var4) {
      try {
         if(!this.method_23(var1, var2, var3, 264048682)) {
            return null;
         } else {
            int[] var5 = new int[]{var2 + (this.field_2534 * -1230398528 - 1390875840 * this.field_2532) + (-1931194472 * this.field_2533 - -174857784 * this.field_2530), this.field_2539 * -1317765656 - -620843768 * this.field_2537 + this.field_2535 * 235441088 - -1041797824 * this.field_2536 + var3};
            return var5;
         }
      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6);
      }
   }

   // $FF: renamed from: f (int, int, byte) boolean
   public boolean method_14(int var1, int var2, byte var3) {
      try {
         boolean var10000;
         if(var1 >= (this.field_2534 * 1859823215 << 6) + (832342515 * this.field_2533 << 3)) {
            if(var3 >= 31) {
               throw new IllegalStateException();
            }

            if(var1 <= (1859823215 * this.field_2534 << 6) + (this.field_2533 * 832342515 << 3) + 7) {
               if(var3 >= 31) {
                  throw new IllegalStateException();
               }

               if(var2 >= (this.field_2539 * -701591619 << 3) + (this.field_2535 * -466083281 << 6) && var2 <= 7 + (this.field_2535 * -466083281 << 6) + (-701591619 * this.field_2539 << 3)) {
                  var10000 = true;
                  return var10000;
               }
            }
         }

         var10000 = false;
         return var10000;
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: b (fo) void
   public void method_12(class_230 var1) {
      if(var1.field_2584 * 306009337 > 1859823215 * this.field_2534) {
         var1.field_2584 = this.field_2534 * -221583857;
      }

      if(1975622015 * var1.field_2575 < 742445985 * this.field_2534) {
         var1.field_2575 = 1531664791 * this.field_2534;
      }

      if(-848549449 * var1.field_2583 > -466083281 * this.field_2535) {
         var1.field_2583 = this.field_2535 * 1657906658;
      }

      if(var1.field_2582 * 1020551999 < -466083281 * this.field_2535) {
         var1.field_2582 = this.field_2535 * -1651591919;
      }

   }

   // $FF: renamed from: a (int, int) ii
   public class_280 method_25(int var1, int var2) {
      if(!this.method_14(var1, var2, (byte)-122)) {
         return null;
      } else {
         int var3 = var1 + (this.field_2532 * 1390875840 - -1230398528 * this.field_2534) + (this.field_2530 * -174857784 - this.field_2533 * -1931194472);
         int var4 = -620843768 * this.field_2537 - -1317765656 * this.field_2539 + var2 + (this.field_2536 * -1041797824 - this.field_2535 * 235441088);
         class_280 var10000 = new class_280(this.field_2538 * 398172859, var3, var4);
         return var10000;
      }
   }

   // $FF: renamed from: k (int, int) ii
   public class_280 method_26(int var1, int var2) {
      if(!this.method_14(var1, var2, (byte)-7)) {
         return null;
      } else {
         int var3 = var1 + (this.field_2532 * 1390875840 - -1230398528 * this.field_2534) + (this.field_2530 * -174857784 - this.field_2533 * -1931194472);
         int var4 = -620843768 * this.field_2537 - -1317765656 * this.field_2539 + var2 + (this.field_2536 * -1041797824 - this.field_2535 * 235441088);
         class_280 var10000 = new class_280(this.field_2538 * 398172859, var3, var4);
         return var10000;
      }
   }

   // $FF: renamed from: m (int, int) ii
   public class_280 method_27(int var1, int var2) {
      if(!this.method_14(var1, var2, (byte)-38)) {
         return null;
      } else {
         int var3 = var1 + (this.field_2532 * 1390875840 - -1230398528 * this.field_2534) + (this.field_2530 * -174857784 - this.field_2533 * -1931194472);
         int var4 = -620843768 * this.field_2537 - -1317765656 * this.field_2539 + var2 + (this.field_2536 * -1041797824 - this.field_2535 * 235441088);
         class_280 var10000 = new class_280(this.field_2538 * 398172859, var3, var4);
         return var10000;
      }
   }

   // $FF: renamed from: x (nd) void
   public void method_28(Buffer var1) {
      this.field_2538 = var1.readUnsignedByte() * 1130517107;
      this.field_2531 = var1.readUnsignedByte() * 1103346787;
      this.field_2532 = var1.readShort() * -1150744613;
      this.field_2530 = var1.readUnsignedByte() * -682080498;
      this.field_2536 = var1.readShort() * 1525688477;
      this.field_2537 = var1.readUnsignedByte() * 2098297500;
      this.field_2534 = var1.readShort() * -745810811;
      this.field_2533 = var1.readUnsignedByte() * 754161821;
      this.field_2535 = var1.readShort() * 10746648;
      this.field_2539 = var1.readUnsignedByte() * -1775925895;
      this.method_4282();
   }

   // $FF: renamed from: z (nd) void
   public void method_11(Buffer var1) {
      this.field_2538 = var1.readUnsignedByte() * 1835974205;
      this.field_2531 = var1.readUnsignedByte() * 1103346787;
      this.field_2532 = var1.readShort() * -1150744613;
      this.field_2530 = var1.readUnsignedByte() * 808104457;
      this.field_2536 = var1.readShort() * -1986608780;
      this.field_2537 = var1.readUnsignedByte() * -1387513413;
      this.field_2534 = var1.readShort() * -1064945484;
      this.field_2533 = var1.readUnsignedByte() * -67855614;
      this.field_2535 = var1.readShort() * -738837839;
      this.field_2539 = var1.readUnsignedByte() * 1993030596;
      this.method_4282();
   }

    // $FF: renamed from: p (int, int, int, int, int) void
   static void method_4286(int var0, int var1, int var2, int var3, int var4) {
      try {
         for(class_103 var5 = (class_103)class_103.field_1203.method_5944(); var5 != null; var5 = (class_103)class_103.field_1203.method_5972()) {
            if(-1 == 2113426875 * var5.field_1195) {
               if(var4 != -309944500) {
                  throw new IllegalStateException();
               }

               if(var5.field_1199 == null) {
                  if(var4 != -309944500) {
                     throw new IllegalStateException();
                  }
                  continue;
               }
            }

            int var6 = 0;
            if(var1 > var5.field_1192 * -1913199289) {
               var6 += var1 - -1913199289 * var5.field_1192;
            } else if(var1 < var5.field_1198 * 382039955) {
               if(var4 != -309944500) {
                  throw new IllegalStateException();
               }

               var6 += var5.field_1198 * 382039955 - var1;
            }

            if(var2 > var5.field_1193 * 846164283) {
               if(var4 != -309944500) {
                  return;
               }

               var6 += var2 - var5.field_1193 * 846164283;
            } else if(var2 < var5.field_1191 * -377542945) {
               if(var4 != -309944500) {
                  throw new IllegalStateException();
               }

               var6 += -377542945 * var5.field_1191 - var2;
            }

            if(var6 - 64 <= var5.field_1194 * 2101998419) {
               if(var4 != -309944500) {
                  throw new IllegalStateException();
               }

               if(0 != -1768933319 * class_87.preferences.field_2115) {
                  if(var4 != -309944500) {
                     throw new IllegalStateException();
                  }

                  if(var0 == var5.field_1188 * 1262714503) {
                     var6 -= 64;
                     if(var6 < 0) {
                        if(var4 != -309944500) {
                           throw new IllegalStateException();
                        }

                        var6 = 0;
                     }

                     int var7 = class_87.preferences.field_2115 * -1768933319 * (var5.field_1194 * 2101998419 - var6) / (var5.field_1194 * 2101998419);
                     if(null == var5.field_1196) {
                        if(var5.field_1195 * 2113426875 >= 0) {
                           if(var4 != -309944500) {
                              return;
                           }

                           class_24 var8 = class_24.method_79(class_137.field_1762, var5.field_1195 * 2113426875, 0);
                           if(var8 != null) {
                              if(var4 != -309944500) {
                                 throw new IllegalStateException();
                              }

                              class_110 var9 = var8.method_78().method_2225(class_94.field_1025);
                              class_107 var10 = class_107.method_2071(var9, 100, var7);
                              var10.method_2074(-1);
                              class_320.field_3804.method_2198(var10);
                              var5.field_1196 = var10;
                           }
                        }
                     } else {
                        var5.field_1196.method_2075(var7);
                     }

                     if(var5.field_1201 == null) {
                        if(var4 != -309944500) {
                           return;
                        }

                        if(var5.field_1199 != null && (var5.field_1190 -= var3 * -1252270037) * 1313201795 <= 0) {
                           if(var4 != -309944500) {
                              return;
                           }

                           int var13 = (int)(Math.random() * (double)var5.field_1199.length);
                           class_24 var14 = class_24.method_79(class_137.field_1762, var5.field_1199[var13], 0);
                           if(var14 != null) {
                              if(var4 != -309944500) {
                                 throw new IllegalStateException();
                              }

                              class_110 var15 = var14.method_78().method_2225(class_94.field_1025);
                              class_107 var11 = class_107.method_2071(var15, 100, var7);
                              var11.method_2074(0);
                              class_320.field_3804.method_2198(var11);
                              var5.field_1201 = var11;
                              var5.field_1190 = (var5.field_1197 * 1385478755 + (int)(Math.random() * (double)(-1819837691 * var5.field_1200 - 1385478755 * var5.field_1197))) * -1252270037;
                           }
                        }
                     } else {
                        var5.field_1201.method_2075(var7);
                        if(!var5.field_1201.method_103()) {
                           if(var4 != -309944500) {
                              throw new IllegalStateException();
                           }

                           var5.field_1201 = null;
                        }
                     }
                     continue;
                  }

                  if(var4 != -309944500) {
                     return;
                  }
               }
            }

            if(null != var5.field_1196) {
               class_320.field_3804.method_2199(var5.field_1196);
               var5.field_1196 = null;
            }

            if(null != var5.field_1201) {
               class_320.field_3804.method_2199(var5.field_1201);
               var5.field_1201 = null;
            }
         }

      } catch (RuntimeException var12) {
         throw class_223.method_4281(var12);
      }
   }
}
