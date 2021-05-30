import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import java.io.File;
import java.io.IOException;

// $FF: renamed from: ac
public final class class_26 extends Canvas {

   // $FF: renamed from: tf int
   static int field_5;
   // $FF: renamed from: v java.awt.Component
   Component field_6;
   // $FF: renamed from: j int
   static final int field_7 = 256;
   // $FF: renamed from: cf int
   static final int field_8 = 128;


   // $FF: renamed from: f (java.awt.Graphics) void
   public final void method_91(Graphics var1) {
      this.field_6.paint(var1);
   }

   // $FF: renamed from: <init> (java.awt.Component) void
   class_26(Component var1) {
      super();
      try {
         this.field_6 = var1;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   public final void paint(Graphics var1) {
      try {
         this.field_6.paint(var1);
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: y (java.awt.Graphics) void
   public final void method_93(Graphics var1) {
      this.field_6.paint(var1);
   }

   // $FF: renamed from: v (java.awt.Graphics) void
   public final void method_94(Graphics var1) {
      this.field_6.update(var1);
   }

   // $FF: renamed from: n (java.awt.Graphics) void
   public final void method_95(Graphics var1) {
      this.field_6.paint(var1);
   }

   public final void update(Graphics var1) {
      try {
         this.field_6.update(var1);
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: hj (int, int, boolean, int) void
   static final void method_96(int var0, int var1, boolean var2, int var3) {
      try {
         if(var2) {
            if(var3 == 1439708156) {
               throw new IllegalStateException();
            }

            if(var0 == 1130183005 * class_151.field_1910) {
               if(var3 == 1439708156) {
                  throw new IllegalStateException();
               }

               if(class_204.field_2387 * -845013717 == var1) {
                  if(var3 == 1439708156) {
                     throw new IllegalStateException();
                  }

                  return;
               }
            }
         }

         class_151.field_1910 = 1635050229 * var0;
         class_204.field_2387 = var1 * -681199229;
         class_53.method_579(25, (byte)0);
         class_278.method_5148(class_305.field_3433, true, -1591335539);
         int var4 = 697161691 * class_243.field_2700;
         int var5 = -27903763 * class_154.field_1929;
         class_243.field_2700 = -1722654056 * (var0 - 6);
         class_154.field_1929 = -1964562648 * (var1 - 6);
         int var6 = class_243.field_2700 * 697161691 - var4;
         int var7 = -27903763 * class_154.field_1929 - var5;
         var4 = 697161691 * class_243.field_2700;
         var5 = class_154.field_1929 * -27903763;

         int var8;
         int var10;
         for(var8 = 0; var8 < '\u8000'; ++var8) {
            if(var3 == 1439708156) {
               throw new IllegalStateException();
            }

            class_99 var9 = client.field_1458[var8];
            if(var9 != null) {
               if(var3 == 1439708156) {
                  throw new IllegalStateException();
               }

               for(var10 = 0; var10 < 10; ++var10) {
                  if(var3 == 1439708156) {
                     throw new IllegalStateException();
                  }

                  var9.field_1112[var10] -= var6;
                  var9.field_1126[var10] -= var7;
               }

               var9.field_1077 -= 785886848 * var6;
               var9.field_1076 -= var7 * -368818304;
            }
         }

         for(var8 = 0; var8 < 2048; ++var8) {
            if(var3 == 1439708156) {
               return;
            }

            class_100 var21 = client.field_1605[var8];
            if(null != var21) {
               if(var3 == 1439708156) {
                  throw new IllegalStateException();
               }

               for(var10 = 0; var10 < 10; ++var10) {
                  if(var3 == 1439708156) {
                     throw new IllegalStateException();
                  }

                  var21.field_1112[var10] -= var6;
                  var21.field_1126[var10] -= var7;
               }

               var21.field_1077 -= var6 * 785886848;
               var21.field_1076 -= -368818304 * var7;
            }
         }

         byte var20 = 0;
         byte var22 = 104;
         byte var23 = 1;
         if(var6 < 0) {
            if(var3 == 1439708156) {
               throw new IllegalStateException();
            }

            var20 = 103;
            var22 = -1;
            var23 = -1;
         }

         byte var11 = 0;
         byte var12 = 104;
         byte var13 = 1;
         if(var7 < 0) {
            if(var3 == 1439708156) {
               throw new IllegalStateException();
            }

            var11 = 103;
            var12 = -1;
            var13 = -1;
         }

         int var15;
         for(int var14 = var20; var22 != var14; var14 += var23) {
            if(var3 == 1439708156) {
               return;
            }

            for(var15 = var11; var15 != var12; var15 += var13) {
               if(var3 == 1439708156) {
                  throw new IllegalStateException();
               }

               int var16 = var14 + var6;
               int var17 = var7 + var15;

               for(int var18 = 0; var18 < 4; ++var18) {
                  if(var3 == 1439708156) {
                     throw new IllegalStateException();
                  }

                  if(var16 >= 0) {
                     if(var3 == 1439708156) {
                        throw new IllegalStateException();
                     }

                     if(var17 >= 0) {
                        if(var3 == 1439708156) {
                           throw new IllegalStateException();
                        }

                        if(var16 < 104) {
                           if(var3 == 1439708156) {
                              throw new IllegalStateException();
                           }

                           if(var17 < 104) {
                              client.field_1635[var18][var14][var15] = client.field_1635[var18][var16][var17];
                              continue;
                           }
                        }
                     }
                  }

                  client.field_1635[var18][var14][var15] = null;
               }
            }
         }

         for(class_50 var24 = (class_50)client.field_1574.method_5944(); var24 != null; var24 = (class_50)client.field_1574.method_5972()) {
            if(var3 == 1439708156) {
               throw new IllegalStateException();
            }

            var24.field_364 -= var6 * 480409937;
            var24.field_367 -= 221790913 * var7;
            if(1813016497 * var24.field_364 >= 0 && -396145343 * var24.field_367 >= 0) {
               if(var3 == 1439708156) {
                  throw new IllegalStateException();
               }

               if(1813016497 * var24.field_364 < 104) {
                  if(var3 == 1439708156) {
                     throw new IllegalStateException();
                  }

                  if(var24.field_367 * -396145343 < 104) {
                     continue;
                  }

                  if(var3 == 1439708156) {
                     return;
                  }
               }
            }

            var24.method_108();
         }

         if(0 != -1714532039 * client.field_1520) {
            if(var3 == 1439708156) {
               throw new IllegalStateException();
            }

            client.field_1520 -= 819547401 * var6;
            client.field_1562 -= var7 * 1551872625;
         }

         client.field_1642 = 0;
         client.field_1537 = false;
         class_131.field_1719 -= -1739220461 * (var6 << 7);
         class_205.field_2393 -= (var7 << 7) * -989203669;
         class_146.field_1861 -= 640290789 * (var6 << 7);
         class_271.field_3188 -= (var7 << 7) * 921873329;
         client.field_1648 = -1174639715;
         client.field_1694.method_5966();
         client.field_1683.method_5966();

         for(var15 = 0; var15 < 4; ++var15) {
            if(var3 == 1439708156) {
               throw new IllegalStateException();
            }

            client.field_1475[var15].method_4609(1589803633);
         }

      } catch (RuntimeException var19) {
         throw class_223.method_4281(var19);
      }
   }

   // $FF: renamed from: jz (io[], int, int) void
   static final void method_97(class_37[] var0, int var1, int var2) {
      try {
         for(int var3 = 0; var3 < var0.length; ++var3) {
            if(var2 == -1874976982) {
               throw new IllegalStateException();
            }

            class_37 var4 = var0[var3];
            if(null == var4) {
               if(var2 == -1874976982) {
                  throw new IllegalStateException();
               }
            } else if(var4.field_152 * -1338646279 == var1) {
               if(var4.field_100) {
                  if(var2 == -1874976982) {
                     return;
                  }

                  if(class_76.method_1197(var4)) {
                     if(var2 == -1874976982) {
                        throw new IllegalStateException();
                     }
                     continue;
                  }
               }

               int var6;
               if(1659206769 * var4.field_103 == 0) {
                  if(var2 == -1874976982) {
                     return;
                  }

                  if(!var4.field_100) {
                     if(var2 == -1874976982) {
                        return;
                     }

                     if(class_76.method_1197(var4)) {
                        if(var2 == -1874976982) {
                           throw new IllegalStateException();
                        }

                        if(var4 != class_149.field_1893) {
                           if(var2 == -1874976982) {
                              throw new IllegalStateException();
                           }
                           continue;
                        }
                     }
                  }

                  method_97(var0, var4.field_101 * -1722455647, -465709340);
                  if(var4.field_233 != null) {
                     method_97(var4.field_233, -1722455647 * var4.field_101, -1517450743);
                  }

                  class_48 var5 = (class_48)client.field_1578.method_6523((long)(-1722455647 * var4.field_101));
                  if(null != var5) {
                     var6 = var5.field_353 * 897280301;
                     if(!class_191.method_3957(var6, (byte)-110)) {
                        if(var2 == -1874976982) {
                           throw new IllegalStateException();
                        }
                     } else {
                        method_97(class_37.field_93[var6], -1, 1036238054);
                     }
                  }
               }

               if(var4.field_103 * 1659206769 == 6) {
                  if(var2 == -1874976982) {
                     return;
                  }

                  label181: {
                     if(var4.field_148 * 679546321 == -1) {
                        if(var2 == -1874976982) {
                           throw new IllegalStateException();
                        }

                        if(-296516383 * var4.field_95 == -1) {
                           break label181;
                        }

                        if(var2 == -1874976982) {
                           throw new IllegalStateException();
                        }
                     }

                     boolean var9 = class_81.method_1355(var4, -1051636424);
                     if(var9) {
                        if(var2 == -1874976982) {
                           throw new IllegalStateException();
                        }

                        var6 = var4.field_95 * -296516383;
                     } else {
                        var6 = 679546321 * var4.field_148;
                     }

                     if(-1 != var6) {
                        if(var2 == -1874976982) {
                           throw new IllegalStateException();
                        }

                        class_72 var7 = class_162.method_3412(var6, -77736406);

                        for(var4.field_232 += 1142241787 * client.field_1689; var4.field_232 * -672258589 > var7.field_570[903501349 * var4.field_116]; class_254.method_4900(var4, (byte)72)) {
                           if(var2 == -1874976982) {
                              throw new IllegalStateException();
                           }

                           var4.field_232 -= var7.field_570[903501349 * var4.field_116] * 1084377035;
                           var4.field_116 += -159656531;
                           if(var4.field_116 * 903501349 >= var7.field_568.length) {
                              if(var2 == -1874976982) {
                                 throw new IllegalStateException();
                              }

                              var4.field_116 -= var7.field_567 * 929392267;
                              if(903501349 * var4.field_116 >= 0) {
                                 if(var2 == -1874976982) {
                                    throw new IllegalStateException();
                                 }

                                 if(903501349 * var4.field_116 < var7.field_568.length) {
                                    continue;
                                 }

                                 if(var2 == -1874976982) {
                                    throw new IllegalStateException();
                                 }
                              }

                              var4.field_116 = 0;
                           }
                        }
                     }
                  }

                  if(0 != 1762860885 * var4.field_157) {
                     if(var2 == -1874976982) {
                        return;
                     }

                     if(!var4.field_100) {
                        int var10 = 1762860885 * var4.field_157 >> 16;
                        var6 = 1762860885 * var4.field_157 << 16 >> 16;
                        var10 *= 613265553 * client.field_1689;
                        var6 *= client.field_1689 * 613265553;
                        var4.field_142 = 626567735 * (-1005507705 * var4.field_142 + var10 & 2047);
                        var4.field_153 = -1507467001 * (490585271 * var4.field_153 + var6 & 2047);
                        class_254.method_4900(var4, (byte)41);
                     }
                  }
               }
            }
         }

      } catch (RuntimeException var8) {
         throw class_223.method_4281(var8);
      }
   }

   // $FF: renamed from: v (java.lang.String, java.lang.String, int, int) java.io.File
   public static File method_98(String var0, String var1, int var2, int var3) {
      try {
         String var4 = 0 == var2?"":"" + var2;
         class_396.field_4253 = new File(class_115.homeDirectory, "jagex_cl_" + var0 + "_" + var1 + var4 + ".dat");
         String var5 = null;
         String var6 = null;
         boolean var7 = false;
         Buffer var9;
         RAFileHandle var10000;
         File var22;
         Buffer var29;
         if(class_396.field_4253.exists()) {
            if(var3 != 1145652403) {
               throw new IllegalStateException();
            }

            try {
               label249: {
                  var10000 = new RAFileHandle(class_396.field_4253, "rw", 10000L);
                  RAFileHandle var8 = var10000;
                  var29 = new Buffer((int)var8.size());

                  int var10;
                  for(var9 = var29; var9.offset * -442398587 < var9.data.length; var9.offset += -1025691571 * var10) {
                     if(var3 != 1145652403) {
                        throw new IllegalStateException();
                     }

                     var10 = var8.read(var9.data, -442398587 * var9.offset, var9.data.length - -442398587 * var9.offset, (byte)-3);
                     if(var10 == -1) {
                        if(var3 != 1145652403) {
                           throw new IllegalStateException();
                        }

                        throw new IOException();
                     }
                  }

                  var9.offset = 0;
                  var10 = var9.readUnsignedByte();
                  if(var10 >= 1) {
                     if(var3 != 1145652403) {
                        throw new IllegalStateException();
                     }

                     if(var10 <= 3) {
                        int var11 = 0;
                        if(var10 > 1) {
                           if(var3 != 1145652403) {
                              throw new IllegalStateException();
                           }

                           var11 = var9.readUnsignedByte();
                        }

                        if(var10 <= 2) {
                           var5 = var9.method_140((byte)100);
                           if(var11 == 1) {
                              if(var3 != 1145652403) {
                                 throw new IllegalStateException();
                              }

                              var6 = var9.method_140((byte)34);
                           }
                        } else {
                           var5 = var9.method_141((byte)41);
                           if(var11 == 1) {
                              if(var3 != 1145652403) {
                                 throw new IllegalStateException();
                              }

                              var6 = var9.method_141((byte)-58);
                           }
                        }

                        var8.close();
                        break label249;
                     }

                     if(var3 != 1145652403) {
                        throw new IllegalStateException();
                     }
                  }

                  throw new IOException("" + var10);
               }
            } catch (IOException var18) {
               var18.printStackTrace();
            }

            if(var5 != null) {
               if(var3 != 1145652403) {
                  throw new IllegalStateException();
               }

               var22 = new File(var5);
               if(!var22.exists()) {
                  if(var3 != 1145652403) {
                     throw new IllegalStateException();
                  }

                  var5 = null;
               }
            }

            if(var5 != null) {
               var22 = new File(var5, "test.dat");
               if(!class_246.method_4711(var22, true, -1334979321)) {
                  if(var3 != 1145652403) {
                     throw new IllegalStateException();
                  }

                  var5 = null;
               }
            }
         }

         if(var5 == null) {
            if(var3 != 1145652403) {
               throw new IllegalStateException();
            }

            if(var2 == 0) {
               if(var3 != 1145652403) {
                  throw new IllegalStateException();
               }

               label207:
               for(int var20 = 0; var20 < class_292.field_3333.length; ++var20) {
                  if(var3 != 1145652403) {
                     throw new IllegalStateException();
                  }

                  for(int var23 = 0; var23 < class_48.cacheDirectories.length; ++var23) {
                     if(var3 != 1145652403) {
                        throw new IllegalStateException();
                     }

                     File var24 = new File(class_48.cacheDirectories[var23] + class_292.field_3333[var20] + File.separatorChar + var0 + File.separatorChar);
                     if(var24.exists()) {
                        if(var3 != 1145652403) {
                           throw new IllegalStateException();
                        }

                        if(class_246.method_4711(new File(var24, "test.dat"), true, -788654893)) {
                           if(var3 != 1145652403) {
                              throw new IllegalStateException();
                           }

                           var5 = var24.toString();
                           var7 = true;
                           break label207;
                        }
                     }
                  }
               }
            }
         }

         if(null == var5) {
            if(var3 != 1145652403) {
               throw new IllegalStateException();
            }

            var5 = class_115.homeDirectory + File.separatorChar + "jagexcache" + var4 + File.separatorChar + var0 + File.separatorChar + var1 + File.separatorChar;
            var7 = true;
         }

         File var21;
         if(var6 != null) {
            if(var3 != 1145652403) {
               throw new IllegalStateException();
            }

            var21 = new File(var6);
            var22 = new File(var5);

            try {
               File[] var25 = var21.listFiles();
               File[] var27 = var25;

               for(int var12 = 0; var12 < var27.length; ++var12) {
                  if(var3 != 1145652403) {
                     throw new IllegalStateException();
                  }

                  File var13 = var27[var12];
                  File var14 = new File(var22, var13.getName());
                  boolean var15 = var13.renameTo(var14);
                  if(!var15) {
                     if(var3 != 1145652403) {
                        throw new IllegalStateException();
                     }

                     throw new IOException();
                  }
               }
            } catch (Exception var17) {
               var17.printStackTrace();
            }

            var7 = true;
         }

         if(var7) {
            var21 = new File(var5);
            var9 = null;

            try {
               var10000 = new RAFileHandle(class_396.field_4253, "rw", 10000L);
               RAFileHandle var26 = var10000;
               var29 = new Buffer(500);
               Buffer var28 = var29;
               var28.writeByte(3);
               byte var10001;
               if(var9 != null) {
                  if(var3 != 1145652403) {
                     throw new IllegalStateException();
                  }

                  var10001 = 1;
               } else {
                  var10001 = 0;
               }

               var28.writeByte(var10001);
               var28.method_128(var21.getPath(), 499802318);
               if(var9 != null) {
                  if(var3 != 1145652403) {
                     throw new IllegalStateException();
                  }

                  // TODO: Check if decompiler problem, originally: var9
                  var28.method_128(var21.getPath(), 499802318);
               }

               var26.write(var28.data, 0, -442398587 * var28.offset, (byte)29);
               var26.close();
            } catch (IOException var16) {
               var16.printStackTrace();
            }
         }

         return new File(var5);
      } catch (RuntimeException var19) {
         throw class_223.method_4281(var19);
      }
   }

   // $FF: renamed from: p (int, int) boolean
   public static boolean method_99(int var0) {
      try {
         return (var0 >> 29 & 1) != 0;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: y (int, jv, int, int, int, boolean, int) void
   public static void method_100(int var0, class_306 var1, int var2, int var3, int var4, boolean var5) {
      try {
         class_270.field_3180 = 1262412465;
         class_271.field_3186 = var1;
         class_137.field_1760 = var2 * 416619779;
         class_119.field_1322 = var3 * 23452087;
         class_270.field_3181 = var4 * 2118204629;
         class_270.field_3179 = var5;
         class_270.field_3183 = -230768741 * var0;
      } catch (RuntimeException var7) {
         throw class_223.method_4281(var7);
      }
   }
}
