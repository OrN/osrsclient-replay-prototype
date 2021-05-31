
// $FF: renamed from: ii
public class class_280 {

   // $FF: renamed from: l int
   public static final int field_3233 = 57;
   // $FF: renamed from: v int
   public int field_3234;
   // $FF: renamed from: f int
   public int field_3235;
   // $FF: renamed from: n int
   public int field_3236;


   // $FF: renamed from: eo (java.lang.Object) boolean
   public boolean method_5153(Object var1) {
      return this == var1?true:(!(var1 instanceof class_280)?false:this.method_5166((class_280)var1, (byte)-40));
   }

   // $FF: renamed from: <init> (ii) void
   public class_280(class_280 var1) {
      super();
      try {
         this.field_3234 = 1 * var1.field_3234;
         this.field_3236 = 1 * var1.field_3236;
         this.field_3235 = var1.field_3235 * 1;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: f (java.lang.String, int) java.lang.String
   String method_5155(String var1) {
      try {
         return -1820038389 * this.field_3234 + var1 + (this.field_3236 * -2092998769 >> 6) + var1 + (349527629 * this.field_3235 >> 6) + var1 + (this.field_3236 * -2092998769 & 63) + var1 + (349527629 * this.field_3235 & 63);
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: v (int) int
   public int method_5156() {
      try {
         return this.field_3234 * -1820038389 << 28 | -2092998769 * this.field_3236 << 14 | this.field_3235 * 349527629;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   public boolean equals(Object var1) {
      try {
         return this == var1?true:(!(var1 instanceof class_280)?false:this.method_5166((class_280)var1, (byte)-43));
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   public String acv() {
      return this.method_5155(",");
   }

   public int hashCode() {
      try {
         return this.method_5156();
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1);
      }
   }

   public String toString() {
      try {
         return this.method_5155(",");
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1);
      }
   }

   // $FF: renamed from: y () int
   public int method_5157() {
      return this.field_3234 * -992555136 << 28 | -2092998769 * this.field_3236 << 14 | this.field_3235 * 303117496;
   }

   // $FF: renamed from: eg (java.lang.Object) boolean
   public boolean method_5158(Object var1) {
      return this == var1?true:(!(var1 instanceof class_280)?false:this.method_5166((class_280)var1, (byte)-116));
   }

   // $FF: renamed from: fl (java.lang.Object) boolean
   public boolean method_5159(Object var1) {
      return this == var1?true:(!(var1 instanceof class_280)?false:this.method_5166((class_280)var1, (byte)-71));
   }

   public String acx() {
      return this.method_5155(",");
   }

   // $FF: renamed from: j (ii) boolean
   boolean method_5160(class_280 var1) {
      return -1820038389 * var1.field_3234 != this.field_3234 * -1820038389?false:(-2092998769 * this.field_3236 != var1.field_3236 * -2092998769?false:349527629 * var1.field_3235 == 349527629 * this.field_3235);
   }

   public String acm() {
      return this.method_5155(",");
   }

   public int aco() {
      return this.method_5156();
   }

   // $FF: renamed from: hm (int, int, int, int, int, int) void
   static final void method_5161(int var0, int var1, int var2, int var3, int var4, int var5) {
      try {
         long var6 = class_206.field_2401.method_4749(var0, var1, var2);
         int var8;
         int var9;
         int var10;
         int var11;
         int var15;
         boolean var10000;
         int var26;
         if(var6 != 0L) {
            if(var5 == -795163869) {
               return;
            }

            var8 = class_206.field_2401.method_4753(var0, var1, var2, var6);
            var9 = var8 >> 6 & 3;
            var10 = var8 & 31;
            var11 = var3;
            if(0L != var6) {
               if(var5 == -795163869) {
                  return;
               }

               var10000 = true;
            } else {
               var10000 = false;
            }

            boolean var13 = var10000;
            if(var13) {
               if(var5 == -795163869) {
                  throw new IllegalStateException();
               }

               if(1 == (int)(var6 >>> 16 & 1L)) {
                  if(var5 == -795163869) {
                     return;
                  }

                  var10000 = true;
               } else {
                  var10000 = false;
               }

               boolean var14 = var10000;
               if(!var14) {
                  if(var5 == -795163869) {
                     throw new IllegalStateException();
                  }

                  var10000 = true;
               } else {
                  var10000 = false;
               }

               var13 = var10000;
            }

            if(var13) {
               if(var5 == -795163869) {
                  throw new IllegalStateException();
               }

               var11 = var4;
            }

            int[] var24 = GameApplet.field_1410.field_502;
            var26 = 24624 + var1 * 4 + (103 - var2) * 2048;
            var15 = class_164.method_3425(var6);
            class_87 var16 = class_121.method_2269(var15, -559129028);
            if(1953806269 * var16.field_830 != -1) {
               if(var5 == -795163869) {
                  throw new IllegalStateException();
               }

               class_66 var17 = class_114.field_1284[1953806269 * var16.field_830];
               if(null != var17) {
                  if(var5 == -795163869) {
                     throw new IllegalStateException();
                  }

                  int var18 = (var16.field_839 * -1154448540 - var17.field_498) / 2;
                  int var19 = (var16.field_851 * 1338154652 - var17.field_492) / 2;
                  var17.draw(48 + 4 * var1 + var18, var19 + (104 - var2 - var16.field_851 * -1812944985) * 4 + 48);
               }
            } else {
               label292: {
                  if(0 != var10) {
                     if(var5 == -795163869) {
                        throw new IllegalStateException();
                     }

                     if(var10 != 2) {
                        break label292;
                     }
                  }

                  if(var9 == 0) {
                     if(var5 == -795163869) {
                        throw new IllegalStateException();
                     }

                     var24[var26] = var11;
                     var24[512 + var26] = var11;
                     var24[var26 + 1024] = var11;
                     var24[var26 + 1536] = var11;
                  } else if(1 == var9) {
                     var24[var26] = var11;
                     var24[1 + var26] = var11;
                     var24[var26 + 2] = var11;
                     var24[3 + var26] = var11;
                  } else if(var9 == 2) {
                     if(var5 == -795163869) {
                        return;
                     }

                     var24[3 + var26] = var11;
                     var24[512 + 3 + var26] = var11;
                     var24[var26 + 3 + 1024] = var11;
                     var24[var26 + 3 + 1536] = var11;
                  } else if(3 == var9) {
                     var24[var26 + 1536] = var11;
                     var24[1536 + var26 + 1] = var11;
                     var24[var26 + 1536 + 2] = var11;
                     var24[1536 + var26 + 3] = var11;
                  }
               }

               if(3 == var10) {
                  if(var5 == -795163869) {
                     return;
                  }

                  if(0 == var9) {
                     if(var5 == -795163869) {
                        throw new IllegalStateException();
                     }

                     var24[var26] = var11;
                  } else if(var9 == 1) {
                     if(var5 == -795163869) {
                        throw new IllegalStateException();
                     }

                     var24[var26 + 3] = var11;
                  } else if(var9 == 2) {
                     if(var5 == -795163869) {
                        throw new IllegalStateException();
                     }

                     var24[1536 + var26 + 3] = var11;
                  } else if(3 == var9) {
                     if(var5 == -795163869) {
                        throw new IllegalStateException();
                     }

                     var24[var26 + 1536] = var11;
                  }
               }

               if(var10 == 2) {
                  if(var9 == 3) {
                     var24[var26] = var11;
                     var24[512 + var26] = var11;
                     var24[var26 + 1024] = var11;
                     var24[1536 + var26] = var11;
                  } else if(0 == var9) {
                     if(var5 == -795163869) {
                        return;
                     }

                     var24[var26] = var11;
                     var24[var26 + 1] = var11;
                     var24[var26 + 2] = var11;
                     var24[var26 + 3] = var11;
                  } else if(var9 == 1) {
                     if(var5 == -795163869) {
                        throw new IllegalStateException();
                     }

                     var24[3 + var26] = var11;
                     var24[3 + var26 + 512] = var11;
                     var24[1024 + var26 + 3] = var11;
                     var24[3 + var26 + 1536] = var11;
                  } else if(2 == var9) {
                     if(var5 == -795163869) {
                        throw new IllegalStateException();
                     }

                     var24[1536 + var26] = var11;
                     var24[1536 + var26 + 1] = var11;
                     var24[var26 + 1536 + 2] = var11;
                     var24[1536 + var26 + 3] = var11;
                  }
               }
            }
         }

         var6 = class_206.field_2401.method_4818(var0, var1, var2);
         if(0L != var6) {
            if(var5 == -795163869) {
               throw new IllegalStateException();
            }

            var8 = class_206.field_2401.method_4753(var0, var1, var2, var6);
            var9 = var8 >> 6 & 3;
            var10 = var8 & 31;
            var11 = class_164.method_3425(var6);
            class_87 var12 = class_121.method_2269(var11, -1450265627);
            if(var12.field_830 * 1953806269 != -1) {
               class_66 var25 = class_114.field_1284[1953806269 * var12.field_830];
               if(var25 != null) {
                  if(var5 == -795163869) {
                     return;
                  }

                  var26 = (var12.field_839 * -1154448540 - var25.field_498) / 2;
                  var15 = (var12.field_851 * 1338154652 - var25.field_492) / 2;
                  var25.draw(var26 + 4 * var1 + 48, (104 - var2 - -1812944985 * var12.field_851) * 4 + 48 + var15);
               }
            } else if(9 == var10) {
               label308: {
                  int var27 = 15658734;
                  if(var6 != 0L) {
                     if(var5 == -795163869) {
                        return;
                     }

                     var10000 = true;
                  } else {
                     var10000 = false;
                  }

                  boolean var28 = var10000;
                  if(var28) {
                     if(var5 == -795163869) {
                        throw new IllegalStateException();
                     }

                     if(1 == (int)(var6 >>> 16 & 1L)) {
                        if(var5 == -795163869) {
                           throw new IllegalStateException();
                        }

                        var10000 = true;
                     } else {
                        var10000 = false;
                     }

                     boolean var29 = var10000;
                     if(!var29) {
                        if(var5 == -795163869) {
                           throw new IllegalStateException();
                        }

                        var10000 = true;
                     } else {
                        var10000 = false;
                     }

                     var28 = var10000;
                  }

                  if(var28) {
                     if(var5 == -795163869) {
                        throw new IllegalStateException();
                     }

                     var27 = 15597568;
                  }

                  int[] var30 = GameApplet.field_1410.field_502;
                  int var31 = (103 - var2) * 2048 + var1 * 4 + 24624;
                  if(0 != var9) {
                     if(var9 != 2) {
                        var30[var31] = var27;
                        var30[var31 + 512 + 1] = var27;
                        var30[var31 + 1024 + 2] = var27;
                        var30[1536 + var31 + 3] = var27;
                        break label308;
                     }

                     if(var5 == -795163869) {
                        return;
                     }
                  }

                  var30[var31 + 1536] = var27;
                  var30[1024 + var31 + 1] = var27;
                  var30[var31 + 512 + 2] = var27;
                  var30[var31 + 3] = var27;
               }
            }
         }

         var6 = class_206.field_2401.method_4752(var0, var1, var2);
         if(var6 != 0L) {
            if(var5 == -795163869) {
               throw new IllegalStateException();
            }

            var8 = class_164.method_3425(var6);
            class_87 var21 = class_121.method_2269(var8, 1858243223);
            if(-1 != 1953806269 * var21.field_830) {
               if(var5 == -795163869) {
                  throw new IllegalStateException();
               }

               class_66 var22 = class_114.field_1284[var21.field_830 * 1953806269];
               if(var22 != null) {
                  if(var5 == -795163869) {
                     throw new IllegalStateException();
                  }

                  var11 = (var21.field_839 * -1154448540 - var22.field_498) / 2;
                  int var23 = (1338154652 * var21.field_851 - var22.field_492) / 2;
                  var22.draw(var1 * 4 + 48 + var11, 48 + 4 * (104 - var2 - var21.field_851 * -1812944985) + var23);
               }
            }
         }

      } catch (RuntimeException var20) {
         throw class_223.method_4281(var20);
      }
   }

   // $FF: renamed from: p () int
   public int method_5162() {
      return this.field_3234 * 1363944370 << 28 | -2092998769 * this.field_3236 << 14 | this.field_3235 * 349527629;
   }

   // $FF: renamed from: <init> (int) void
   public class_280(int var1) {
      super();
      try {
         if(var1 == -1) {
            this.field_3234 = 524908381;
         } else {
            this.field_3234 = -524908381 * (var1 >> 28 & 3);
            this.field_3236 = 1144577903 * (var1 >> 14 & 16383);
            this.field_3235 = -1764554107 * (var1 & 16383);
         }

      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: r (ii) boolean
   boolean method_5164(class_280 var1) {
      return -1820038389 * var1.field_3234 != this.field_3234 * -1820038389?false:(-2092998769 * this.field_3236 != var1.field_3236 * -2092998769?false:349527629 * var1.field_3235 == 349527629 * this.field_3235);
   }

   // $FF: renamed from: <init> (int, int, int) void
   public class_280(int var1, int var2, int var3) {
      super();
      try {
         this.field_3234 = var1 * -524908381;
         this.field_3236 = var2 * 1144577903;
         this.field_3235 = var3 * -1764554107;
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: n (ii, byte) boolean
   boolean method_5166(class_280 var1, byte var2) {
      try {
         if(-1820038389 * var1.field_3234 != this.field_3234 * -1820038389) {
            if(var2 >= 0) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else if(-2092998769 * this.field_3236 != var1.field_3236 * -2092998769) {
            if(var2 >= 0) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else if(349527629 * var1.field_3235 != 349527629 * this.field_3235) {
            if(var2 >= 0) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            return true;
         }
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   public int abl() {
      return this.method_5156();
   }

   public int abu() {
      return this.method_5156();
   }

   // $FF: renamed from: b (java.lang.String) java.lang.String
   String method_5167(String var1) {
      return -1820038389 * this.field_3234 + var1 + (this.field_3236 * -2092998769 >> 6) + var1 + (349527629 * this.field_3235 >> 6) + var1 + (this.field_3236 * -2092998769 & 63) + var1 + (349527629 * this.field_3235 & 63);
   }

   public String aci() {
      return this.method_5155(",");
   }

   // $FF: renamed from: v (nb, byte) void
   static final void method_5168(NetworkBuffer var0, byte var1) {
      try {
         var0.method_358();
         int var2 = 929092845 * client.field_1534;
         class_100[] var10000 = client.field_1605;
         class_100 var10002 = new class_100();
         class_100 var3 = class_164.field_2044 = var10000[var2] = var10002;
         var3.field_1142 = var2 * -1619133141;
         int var4 = var0.method_361(30, (byte)-61);
         byte var5 = (byte)(var4 >> 28);
         int var6 = var4 >> 14 & 16383;
         int var7 = var4 & 16383;
         var3.field_1112[0] = var6 - class_243.field_2700 * 697161691;
         var3.field_1077 = ((var3.field_1112[0] << 7) + (var3.method_1833(-1517836125) << 6)) * -1369591971;
         var3.field_1126[0] = var7 - class_154.field_1929 * -27903763;
         var3.field_1076 = ((var3.field_1126[0] << 7) + (var3.method_1833(-1683797039) << 6)) * -1747711857;
         class_115.field_1289 = (var3.field_1163 = 1571462451 * var5) * -1993331315;
         if(class_195.field_2312[var2] != null) {
            if(var1 != -128) {
               return;
            }

            var3.method_1824(class_195.field_2312[var2], (byte)1);
         }

         class_195.field_2313 = 0;
         class_195.field_2318[(class_195.field_2313 += 1909342277) * -1143549299 - 1] = var2;
         class_195.field_2308[var2] = 0;
         class_195.field_2315 = 0;

         for(int var8 = 1; var8 < 2048; ++var8) {
            if(var2 == var8) {
               if(var1 != -128) {
                  return;
               }
            } else {
               int var9 = var0.method_361(18, (byte)-45);
               int var10 = var9 >> 16;
               int var11 = var9 >> 8 & 597;
               int var12 = var9 & 597;
               class_195.field_2309[var8] = (var10 << 28) + (var11 << 14) + var12;
               class_195.field_2310[var8] = 0;
               class_195.field_2317[var8] = -1;
               class_195.field_2316[(class_195.field_2315 += -262660203) * -1936837699 - 1] = var8;
               class_195.field_2308[var8] = 0;
            }
         }

         var0.method_362();
      } catch (RuntimeException var13) {
         throw class_223.method_4281(var13);
      }
   }
}
