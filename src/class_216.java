
// $FF: renamed from: fb
public class class_216 implements class_6 {

   // $FF: renamed from: d int
   int field_2462;
   // $FF: renamed from: b int
   int field_2463;
   // $FF: renamed from: n int
   int field_2464;
   // $FF: renamed from: y int
   int field_2465;
   // $FF: renamed from: p int
   int field_2466;
   // $FF: renamed from: j int
   int field_2467;
   // $FF: renamed from: r int
   int field_2468;
   // $FF: renamed from: v int
   int field_2469;
   // $FF: renamed from: f int
   int field_2470;
   // $FF: renamed from: s int
   int field_2471;


    // $FF: renamed from: n (int, int, int, int) boolean
   public boolean method_23(int var1, int var2, int var3, int var4) {
      try {
         if(var1 >= this.field_2469 * -1405879659) {
            if(var4 != 264048682) {
               throw new IllegalStateException();
            }

            if(var1 < this.field_2464 * -1291885051 + -1405879659 * this.field_2469) {
               boolean var10000;
               if(var2 >> 6 >= 1139978387 * this.field_2470 && var2 >> 6 <= this.field_2466 * -144912345) {
                  if(var4 != 264048682) {
                     throw new IllegalStateException();
                  }

                  if(var3 >> 6 >= this.field_2465 * -1146438231) {
                     if(var4 != 264048682) {
                        throw new IllegalStateException();
                     }

                     if(var3 >> 6 <= -720689063 * this.field_2467) {
                        if(var4 != 264048682) {
                           throw new IllegalStateException();
                        }

                        var10000 = true;
                        return var10000;
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

   // $FF: renamed from: v (fo, int) void
   public void method_16(class_230 var1, int var2) {
      try {
         if(var1.field_2584 * -214984287 > this.field_2468 * -18859023) {
            var1.field_2584 = this.field_2468 * 290234449;
         }

         if(1975622015 * var1.field_2575 < -120763515 * this.field_2462) {
            if(var2 == 859416337) {
               return;
            }

            var1.field_2575 = this.field_2462 * -902679301;
         }

         if(-1153356879 * var1.field_2583 > this.field_2463 * -1614238823) {
            var1.field_2583 = this.field_2463 * -1122385815;
         }

         if(var1.field_2582 * 1020551999 < 1556024609 * this.field_2471) {
            if(var2 == 859416337) {
               throw new IllegalStateException();
            }

            var1.field_2582 = 824530847 * this.field_2471;
         }

      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: d (int, int, int) boolean
   public boolean method_17(int var1, int var2, int var3) {
      return var1 >= this.field_2469 * -1405879659 && var1 < this.field_2464 * -1291885051 + -1405879659 * this.field_2469?var2 >> 6 >= 1139978387 * this.field_2470 && var2 >> 6 <= this.field_2466 * -144912345 && var3 >> 6 >= this.field_2465 * -1146438231 && var3 >> 6 <= -720689063 * this.field_2467:false;
   }

   // $FF: renamed from: f (int, int, byte) boolean
   public boolean method_14(int var1, int var2, byte var3) {
      try {
         boolean var10000;
         if(var1 >> 6 >= -18859023 * this.field_2468) {
            if(var3 >= 31) {
               throw new IllegalStateException();
            }

            if(var1 >> 6 <= -120763515 * this.field_2462) {
               if(var3 >= 31) {
                  throw new IllegalStateException();
               }

               if(var2 >> 6 >= -1614238823 * this.field_2463 && var2 >> 6 <= this.field_2471 * 1556024609) {
                  if(var3 >= 31) {
                     throw new IllegalStateException();
                  }

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

   // $FF: renamed from: a (int, int) ii
   public class_280 method_25(int var1, int var2) {
      if(!this.method_14(var1, var2, (byte)-82)) {
         return null;
      } else {
         int var3 = -1479044829 * this.field_2470 - this.field_2468 * -1503257742 + var1;
         int var4 = -467287198 * this.field_2465 - 123793295 * this.field_2463 + var2;
         class_280 var10000 = new class_280(-1587202663 * this.field_2469, var3, var4);
         return var10000;
      }
   }

   // $FF: renamed from: p (int, int, int) ii
   public class_280 method_29(int var1, int var2, int var3) {
      try {
         if(!this.method_14(var1, var2, (byte)-11)) {
            if(var3 <= -1010131779) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            int var4 = -55827264 * this.field_2470 - this.field_2468 * -1206977472 + var1;
            int var5 = -357602752 * this.field_2465 - -232069568 * this.field_2463 + var2;
            class_280 var10000 = new class_280(-1405879659 * this.field_2469, var4, var5);
            return var10000;
         }
      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6);
      }
   }

   // $FF: renamed from: j (nd, int) void
   public void method_15(Buffer var1) {
      try {
         this.field_2469 = var1.readUnsignedByte() * -1625292611;
         this.field_2464 = var1.readUnsignedByte() * 2075227853;
         this.field_2470 = var1.readShort() * 7204251;
         this.field_2465 = var1.readShort() * 1429943961;
         this.field_2466 = var1.readShort() * 2011144087;
         this.field_2467 = var1.readShort() * -940466199;
         this.field_2468 = var1.readShort() * 730158353;
         this.field_2463 = var1.readShort() * 1798273193;
         this.field_2462 = var1.readShort() * 2100491597;
         this.field_2471 = var1.readShort() * -792676639;
         this.method_4195();
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: y (int, int, int, int) int[]
   public int[] method_13(int var1, int var2, int var3, int var4) {
      try {
         if(!this.method_23(var1, var2, var3, 264048682)) {
            if(var4 != 1943891890) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            int[] var5 = new int[]{this.field_2468 * -1206977472 - this.field_2470 * -55827264 + var2, -232069568 * this.field_2463 - -357602752 * this.field_2465 + var3};
            return var5;
         }
      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6);
      }
   }

   // $FF: renamed from: b (fo) void
   public void method_12(class_230 var1) {
      if(var1.field_2584 * -214984287 > this.field_2468 * -18859023) {
         var1.field_2584 = this.field_2468 * 290234449;
      }

      if(1975622015 * var1.field_2575 < -120763515 * this.field_2462) {
         var1.field_2575 = this.field_2462 * -902679301;
      }

      if(-1153356879 * var1.field_2583 > this.field_2463 * -1614238823) {
         var1.field_2583 = this.field_2463 * -1122385815;
      }

      if(var1.field_2582 * 1020551999 < 1556024609 * this.field_2471) {
         var1.field_2582 = 824530847 * this.field_2471;
      }

   }

   // $FF: renamed from: u (int, int, int) boolean
   public boolean method_19(int var1, int var2, int var3) {
      return var1 >= this.field_2469 * -1405879659 && var1 < this.field_2464 * -1291885051 + -1405879659 * this.field_2469?var2 >> 6 >= 1139978387 * this.field_2470 && var2 >> 6 <= this.field_2466 * -144912345 && var3 >> 6 >= this.field_2465 * -1146438231 && var3 >> 6 <= -720689063 * this.field_2467:false;
   }

   // $FF: renamed from: s (int, int, int) boolean
   public boolean method_18(int var1, int var2, int var3) {
      return var1 >= this.field_2469 * -238766187 && var1 < this.field_2464 * -1291885051 + -1405879659 * this.field_2469?var2 >> 6 >= 1498756419 * this.field_2470 && var2 >> 6 <= this.field_2466 * -144912345 && var3 >> 6 >= this.field_2465 * -1980768738 && var3 >> 6 <= 401188967 * this.field_2467:false;
   }

    // $FF: renamed from: l (int, int) boolean
   public boolean method_20(int var1, int var2) {
      return var1 >> 6 >= -18859023 * this.field_2468 && var1 >> 6 <= -120763515 * this.field_2462 && var2 >> 6 >= -1614238823 * this.field_2463 && var2 >> 6 <= this.field_2471 * 1556024609;
   }

   // $FF: renamed from: o (int, int) boolean
   public boolean method_21(int var1, int var2) {
      return var1 >> 6 >= -18859023 * this.field_2468 && var1 >> 6 <= -120763515 * this.field_2462 && var2 >> 6 >= -1614238823 * this.field_2463 && var2 >> 6 <= this.field_2471 * 1556024609;
   }

   // $FF: renamed from: c (int, int) boolean
   public boolean method_22(int var1, int var2) {
      return var1 >> 6 >= 905689816 * this.field_2468 && var1 >> 6 <= 916730008 * this.field_2462 && var2 >> 6 >= -131844308 * this.field_2463 && var2 >> 6 <= this.field_2471 * -1431378574;
   }

   // $FF: renamed from: e (int, int, int) int[]
   public int[] method_24(int var1, int var2, int var3) {
      if(!this.method_23(var1, var2, var3, 264048682)) {
         return null;
      } else {
         int[] var4 = new int[]{this.field_2468 * -1195925266 - this.field_2470 * -1565918435 + var2, -232069568 * this.field_2463 - -357602752 * this.field_2465 + var3};
         return var4;
      }
   }

   // $FF: renamed from: r (int) void
   void method_4195() {
      try {
         ;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: h (int, cf, boolean, int) int
   static int method_4196(int var0, int var3) {
      try {
         if(var0 == 3300) {
            if(var3 >= -845323800) {
               throw new IllegalStateException();
            } else {
               class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = client.field_1425 * -1702273423;
               return 1;
            }
         } else {
            int var4;
            int var5;
            if(3301 == var0) {
               if(var3 >= -845323800) {
                  throw new IllegalStateException();
               } else {
                  class_136.field_1752 -= 2119512838;
                  var4 = class_165.field_2052[-26460885 * class_136.field_1752];
                  var5 = class_165.field_2052[1 + class_136.field_1752 * -26460885];
                  class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = GameApplet.method_2361(var4, var5, -1726985857);
                  return 1;
               }
            } else if(var0 == 3302) {
               class_136.field_1752 -= 2119512838;
               var4 = class_165.field_2052[-26460885 * class_136.field_1752];
               var5 = class_165.field_2052[1 + class_136.field_1752 * -26460885];
               class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = class_52.method_576(var4, var5, -192400471);
               return 1;
            } else if(3303 == var0) {
               if(var3 >= -845323800) {
                  throw new IllegalStateException();
               } else {
                  class_136.field_1752 -= 2119512838;
                  var4 = class_165.field_2052[class_136.field_1752 * -26460885];
                  var5 = class_165.field_2052[1 + -26460885 * class_136.field_1752];
                  class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = class_162.method_3416(var4, var5, -2048658082);
                  return 1;
               }
            } else if(var0 == 3304) {
               if(var3 >= -845323800) {
                  throw new IllegalStateException();
               } else {
                  var4 = class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885];
                  class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = class_151.method_3215(var4, (byte)-78).field_755 * -1820336081;
                  return 1;
               }
            } else if(3305 == var0) {
               if(var3 >= -845323800) {
                  throw new IllegalStateException();
               } else {
                  var4 = class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885];
                  class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = client.field_1549[var4];
                  return 1;
               }
            } else if(3306 == var0) {
               if(var3 >= -845323800) {
                  throw new IllegalStateException();
               } else {
                  var4 = class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885];
                  class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = client.field_1550[var4];
                  return 1;
               }
            } else if(var0 == 3307) {
               if(var3 >= -845323800) {
                  throw new IllegalStateException();
               } else {
                  var4 = class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885];
                  class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = client.field_1551[var4];
                  return 1;
               }
            } else {
               int var6;
               if(var0 == 3308) {
                  if(var3 >= -845323800) {
                     throw new IllegalStateException();
                  } else {
                     var4 = class_115.field_1289 * 1115122599;
                     var5 = 697161691 * class_243.field_2700 + (class_164.field_2044.field_1077 * -130212619 >> 7);
                     var6 = (1248597615 * class_164.field_2044.field_1076 >> 7) + class_154.field_1929 * -27903763;
                     class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = (var5 << 14) + (var4 << 28) + var6;
                     return 1;
                  }
               } else if(3309 == var0) {
                  var4 = class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885];
                  class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = var4 >> 14 & 16383;
                  return 1;
               } else if(3310 == var0) {
                  if(var3 >= -845323800) {
                     throw new IllegalStateException();
                  } else {
                     var4 = class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885];
                     class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = var4 >> 28;
                     return 1;
                  }
               } else if(3311 == var0) {
                  if(var3 >= -845323800) {
                     throw new IllegalStateException();
                  } else {
                     var4 = class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885];
                     class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = var4 & 16383;
                     return 1;
                  }
               } else if(3312 == var0) {
                  int[] var10000 = class_165.field_2052;
                  int var10001 = (class_136.field_1752 += -1087727229) * -26460885 - 1;
                  byte var10002;
                  if(client.field_1416) {
                     if(var3 >= -845323800) {
                        throw new IllegalStateException();
                     }

                     var10002 = 1;
                  } else {
                     var10002 = 0;
                  }

                  var10000[var10001] = var10002;
                  return 1;
               } else if(3313 == var0) {
                  if(var3 >= -845323800) {
                     throw new IllegalStateException();
                  } else {
                     class_136.field_1752 -= 2119512838;
                     var4 = '\u8000' + class_165.field_2052[class_136.field_1752 * -26460885];
                     var5 = class_165.field_2052[class_136.field_1752 * -26460885 + 1];
                     class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = GameApplet.method_2361(var4, var5, -1726985857);
                     return 1;
                  }
               } else if(3314 == var0) {
                  if(var3 >= -845323800) {
                     throw new IllegalStateException();
                  } else {
                     class_136.field_1752 -= 2119512838;
                     var4 = class_165.field_2052[-26460885 * class_136.field_1752] + '\u8000';
                     var5 = class_165.field_2052[1 + -26460885 * class_136.field_1752];
                     class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = class_52.method_576(var4, var5, -192400471);
                     return 1;
                  }
               } else if(3315 == var0) {
                  if(var3 >= -845323800) {
                     throw new IllegalStateException();
                  } else {
                     class_136.field_1752 -= 2119512838;
                     var4 = class_165.field_2052[-26460885 * class_136.field_1752] + '\u8000';
                     var5 = class_165.field_2052[-26460885 * class_136.field_1752 + 1];
                     class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = class_162.method_3416(var4, var5, -1973062332);
                     return 1;
                  }
               } else if(var0 == 3316) {
                  if(var3 >= -845323800) {
                     throw new IllegalStateException();
                  } else {
                     if(-816484905 * client.field_1586 >= 2) {
                        if(var3 >= -845323800) {
                           throw new IllegalStateException();
                        }

                        class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = client.field_1586 * -816484905;
                     } else {
                        class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = 0;
                     }

                     return 1;
                  }
               } else if(var0 == 3317) {
                  if(var3 >= -845323800) {
                     throw new IllegalStateException();
                  } else {
                     class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = client.field_1432 * -414435005;
                     return 1;
                  }
               } else if(3318 == var0) {
                  if(var3 >= -845323800) {
                     throw new IllegalStateException();
                  } else {
                     class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = 1396273817 * client.field_1413;
                     return 1;
                  }
               } else if(var0 == 3321) {
                  class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = client.field_1674 * 1008679671;
                  return 1;
               } else if(3322 == var0) {
                  if(var3 >= -845323800) {
                     throw new IllegalStateException();
                  } else {
                     class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = client.field_1542 * -612986977;
                     return 1;
                  }
               } else if(var0 == 3323) {
                  if(var3 >= -845323800) {
                     throw new IllegalStateException();
                  } else {
                     if(client.field_1618) {
                        if(var3 >= -845323800) {
                           throw new IllegalStateException();
                        }

                        class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = 1;
                     } else {
                        class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = 0;
                     }

                     return 1;
                  }
               } else if(3324 == var0) {
                  if(var3 >= -845323800) {
                     throw new IllegalStateException();
                  } else {
                     class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = 1088533541 * client.field_1414;
                     return 1;
                  }
               } else if(3325 == var0) {
                  if(var3 >= -845323800) {
                     throw new IllegalStateException();
                  } else {
                     class_136.field_1752 -= -55941620;
                     var4 = class_165.field_2052[class_136.field_1752 * -26460885];
                     var5 = class_165.field_2052[-26460885 * class_136.field_1752 + 1];
                     var6 = class_165.field_2052[-26460885 * class_136.field_1752 + 2];
                     int var7 = class_165.field_2052[3 + class_136.field_1752 * -26460885];
                     var4 += var5 << 14;
                     var4 += var6 << 28;
                     var4 += var7;
                     class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = var4;
                     return 1;
                  }
               } else if(3326 == var0) {
                  class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = client.field_1427 * -1975403091;
                  return 1;
               } else if(3327 == var0) {
                  if(var3 >= -845323800) {
                     throw new IllegalStateException();
                  } else {
                     class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = 424553417 * client.field_1588;
                     return 1;
                  }
               } else {
                  return 2;
               }
            }
         }
      } catch (RuntimeException var8) {
         throw class_223.method_4281(var8);
      }
   }

   // $FF: renamed from: k (int, int) ii
   public class_280 method_26(int var1, int var2) {
      if(!this.method_14(var1, var2, (byte)-55)) {
         return null;
      } else {
         int var3 = -55827264 * this.field_2470 - this.field_2468 * -1481125223 + var1;
         int var4 = -1208728348 * this.field_2465 - -232069568 * this.field_2463 + var2;
         class_280 var10000 = new class_280(2011822775 * this.field_2469, var3, var4);
         return var10000;
      }
   }

   // $FF: renamed from: g (int, int, int) int[]
   public int[] method_10(int var1, int var2, int var3) {
      if(!this.method_23(var1, var2, var3, 264048682)) {
         return null;
      } else {
         int[] var4 = new int[]{this.field_2468 * -1206977472 - this.field_2470 * -55827264 + var2, -232069568 * this.field_2463 - -357602752 * this.field_2465 + var3};
         return var4;
      }
   }

   // $FF: renamed from: x (nd) void
   public void method_28(Buffer var1) {
      this.field_2469 = var1.readUnsignedByte() * -1625292611;
      this.field_2464 = var1.readUnsignedByte() * 2075227853;
      this.field_2470 = var1.readShort() * 7204251;
      this.field_2465 = var1.readShort() * 1429943961;
      this.field_2466 = var1.readShort() * 2011144087;
      this.field_2467 = var1.readShort() * -940466199;
      this.field_2468 = var1.readShort() * 730158353;
      this.field_2463 = var1.readShort() * 1798273193;
      this.field_2462 = var1.readShort() * 2100491597;
      this.field_2471 = var1.readShort() * -792676639;
      this.method_4195();
   }

   // $FF: renamed from: z (nd) void
   public void method_11(Buffer var1) {
      this.field_2469 = var1.readUnsignedByte() * -1625292611;
      this.field_2464 = var1.readUnsignedByte() * 2075227853;
      this.field_2470 = var1.readShort() * 7204251;
      this.field_2465 = var1.readShort() * 1429943961;
      this.field_2466 = var1.readShort() * 2011144087;
      this.field_2467 = var1.readShort() * -940466199;
      this.field_2468 = var1.readShort() * 730158353;
      this.field_2463 = var1.readShort() * 1798273193;
      this.field_2462 = var1.readShort() * 2100491597;
      this.field_2471 = var1.readShort() * -792676639;
      this.method_4195();
   }

   // $FF: renamed from: <init> () void
   class_216() {
      super();
      try {
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1);
      }
   }

   // $FF: renamed from: m (int, int) ii
   public class_280 method_27(int var1, int var2) {
      if(!this.method_14(var1, var2, (byte)24)) {
         return null;
      } else {
         int var3 = -55827264 * this.field_2470 - this.field_2468 * -1206977472 + var1;
         int var4 = -357602752 * this.field_2465 - -232069568 * this.field_2463 + var2;
         class_280 var10000 = new class_280(-1405879659 * this.field_2469, var3, var4);
         return var10000;
      }
   }
}
