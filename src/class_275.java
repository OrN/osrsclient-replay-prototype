import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.SecureRandom;

// $FF: renamed from: ic
public class class_275 {

   // $FF: renamed from: b boolean
   boolean field_3206;
   // $FF: renamed from: v int[]
   int[] field_3207;
   // $FF: renamed from: f boolean
   public boolean field_3208;
   // $FF: renamed from: y int
   public int field_3209;
   // $FF: renamed from: p long
   long field_3210;
   // $FF: renamed from: j long
   long field_3211;
   // $FF: renamed from: n int[]
   int[] field_3212;
   // $FF: renamed from: c hz
   static class_272 field_3213;
   // $FF: renamed from: o int[]
   static final int[] field_3214;
   // $FF: renamed from: r ed[]
   class_211[] field_3215;
   // $FF: renamed from: go int[]
   static int[] field_3216;


   // $FF: renamed from: aj () int
   public int method_5083() {
      return -1 == this.field_3209 * -1525645945?(this.field_3207[11] << 5) + (this.field_3207[0] << 15) + (this.field_3212[4] << 20) + (this.field_3212[0] << 25) + (this.field_3207[8] << 10) + this.field_3207[1]:305419896 + class_85.method_1443(this.field_3209 * -1525645945, 1756746607).field_857 * -2060838679;
   }

   // $FF: renamed from: y (nd, int, byte) void
   public static void method_5084(class_28 var0, int var1, byte var2) {
      try {
         class_58 var10000 = new class_58;
         var10000.method_105();
         class_58 var3 = var10000;
         var3.field_464 = var0.method_130(188145457) * 1028183917;
         var3.field_459 = var0.method_135((byte)-43) * 534927143;
         var3.field_458 = new int[var3.field_464 * -637285787];
         var3.field_457 = new int[var3.field_464 * -637285787];
         var3.field_461 = new Field[var3.field_464 * -637285787];
         var3.field_462 = new int[-637285787 * var3.field_464];
         var3.field_463 = new Method[var3.field_464 * -637285787];
         var3.field_468 = new byte[-637285787 * var3.field_464][][];

         for(int var4 = 0; var4 < var3.field_464 * -637285787; ++var4) {
            try {
               int var5 = var0.method_130(-1171694551);
               String var6;
               String var7;
               int var8;
               if(0 != var5) {
                  if(var2 != 14) {
                     throw new IllegalStateException();
                  }

                  if(1 != var5) {
                     if(var2 != 14) {
                        return;
                     }

                     if(2 != var5) {
                        if(var5 != 3) {
                           if(var2 != 14) {
                              return;
                           }

                           if(var5 != 4) {
                              continue;
                           }

                           if(var2 != 14) {
                              throw new IllegalStateException();
                           }
                        }

                        var6 = var0.method_139(-391631059);
                        var7 = var0.method_139(-391631059);
                        var8 = var0.method_130(-523840510);
                        String[] var9 = new String[var8];

                        for(int var10 = 0; var10 < var8; ++var10) {
                           if(var2 != 14) {
                              throw new IllegalStateException();
                           }

                           var9[var10] = var0.method_139(-391631059);
                        }

                        String var27 = var0.method_139(-391631059);
                        byte[][] var11 = new byte[var8][];
                        int var13;
                        if(var5 == 3) {
                           for(int var12 = 0; var12 < var8; ++var12) {
                              if(var2 != 14) {
                                 throw new IllegalStateException();
                              }

                              var13 = var0.method_135((byte)-110);
                              var11[var12] = new byte[var13];
                              var0.method_267(var11[var12], 0, var13, 1127537554);
                           }
                        }

                        var3.field_458[var4] = var5;
                        Class[] var28 = new Class[var8];

                        for(var13 = 0; var13 < var8; ++var13) {
                           if(var2 != 14) {
                              return;
                           }

                           var28[var13] = class_186.method_3875(var9[var13], -2002767091);
                        }

                        Class var29 = class_186.method_3875(var27, -2037840804);
                        if(class_186.method_3875(var6, -2102522780).getClassLoader() == null) {
                           if(var2 != 14) {
                              throw new IllegalStateException();
                           }

                           throw new SecurityException();
                        }

                        Method[] var14 = class_186.method_3875(var6, -2082435183).getDeclaredMethods();
                        Method[] var15 = var14;

                        for(int var16 = 0; var16 < var15.length; ++var16) {
                           if(var2 != 14) {
                              throw new IllegalStateException();
                           }

                           Method var17 = var15[var16];
                           if(var17.getName().equals(var7)) {
                              if(var2 != 14) {
                                 throw new IllegalStateException();
                              }

                              Class[] var18 = var17.getParameterTypes();
                              if(var18.length == var28.length) {
                                 if(var2 != 14) {
                                    return;
                                 }

                                 boolean var19 = true;

                                 for(int var20 = 0; var20 < var28.length; ++var20) {
                                    if(var2 != 14) {
                                       return;
                                    }

                                    if(var18[var20] != var28[var20]) {
                                       var19 = false;
                                       break;
                                    }
                                 }

                                 if(var19) {
                                    if(var2 != 14) {
                                       throw new IllegalStateException();
                                    }

                                    if(var29 == var17.getReturnType()) {
                                       if(var2 != 14) {
                                          throw new IllegalStateException();
                                       }

                                       var3.field_463[var4] = var17;
                                    }
                                 }
                              }
                           }
                        }

                        var3.field_468[var4] = var11;
                        continue;
                     }

                     if(var2 != 14) {
                        throw new IllegalStateException();
                     }
                  }
               }

               var6 = var0.method_139(-391631059);
               var7 = var0.method_139(-391631059);
               var8 = 0;
               if(var5 == 1) {
                  var8 = var0.method_135((byte)-125);
               }

               var3.field_458[var4] = var5;
               var3.field_462[var4] = var8;
               if(class_186.method_3875(var6, -2129011135).getClassLoader() == null) {
                  throw new SecurityException();
               }

               var3.field_461[var4] = class_186.method_3875(var6, -2027147058).getDeclaredField(var7);
            } catch (ClassNotFoundException var21) {
               var3.field_457[var4] = -1;
            } catch (SecurityException var22) {
               var3.field_457[var4] = -2;
            } catch (NullPointerException var23) {
               var3.field_457[var4] = -3;
            } catch (Exception var24) {
               var3.field_457[var4] = -4;
            } catch (Throwable var25) {
               var3.field_457[var4] = -5;
            }
         }

         class_153.field_1926.method_5697(var3);
      } catch (RuntimeException var26) {
         throw class_223.method_4281(var26, "ic.y(" + ')');
      }
   }

   // $FF: renamed from: e (int[], int[], boolean, int) void
   public void method_5085(int[] var1, int[] var2, boolean var3, int var4) {
      if(var1 == null) {
         var1 = new int[12];

         for(int var5 = 0; var5 < 7; ++var5) {
            for(int var6 = 0; var6 < class_271.field_3187 * -258878521; ++var6) {
               class_83 var7 = class_220.method_4236(var6, (byte)91);
               if(var7 != null && !var7.field_771 && 2136524687 * var7.field_772 == var5 + (var3?7:0)) {
                  var1[field_3214[var5]] = var6 + -987908132;
                  break;
               }
            }
         }
      }

      this.field_3207 = var1;
      this.field_3212 = var2;
      this.field_3208 = var3;
      this.field_3209 = var4 * -974866377;
      this.method_5090(-1440101066);
   }

   // $FF: renamed from: f (int, boolean, int) void
   public void method_5086(int var1, boolean var2, int var3) {
      try {
         if(1 == var1 && this.field_3208) {
            if(var3 <= -1051001856) {
               throw new IllegalStateException();
            }
         } else {
            int var4 = this.field_3207[field_3214[var1]];
            if(0 == var4) {
               if(var3 <= -1051001856) {
                  throw new IllegalStateException();
               }
            } else {
               var4 -= 256;

               while(true) {
                  if(!var2) {
                     if(var3 <= -1051001856) {
                        throw new IllegalStateException();
                     }

                     --var4;
                     if(var4 < 0) {
                        if(var3 <= -1051001856) {
                           return;
                        }

                        var4 = class_271.field_3187 * -254849601 - 1;
                     }
                  } else {
                     ++var4;
                     if(var4 >= class_271.field_3187 * -254849601) {
                        if(var3 <= -1051001856) {
                           return;
                        }

                        var4 = 0;
                     }
                  }

                  class_83 var5 = class_220.method_4236(var4, (byte)50);
                  if(null != var5) {
                     if(var3 <= -1051001856) {
                        throw new IllegalStateException();
                     }

                     if(!var5.field_771) {
                        if(var3 <= -1051001856) {
                           return;
                        }

                        byte var10000;
                        if(this.field_3208) {
                           if(var3 <= -1051001856) {
                              throw new IllegalStateException();
                           }

                           var10000 = 7;
                        } else {
                           var10000 = 0;
                        }

                        if(var10000 + var1 == 2136524687 * var5.field_772) {
                           if(var3 <= -1051001856) {
                              throw new IllegalStateException();
                           }

                           this.field_3207[field_3214[var1]] = var4 + 256;
                           this.method_5090(-1440101066);
                           return;
                        }
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6, "ic.f(" + ')');
      }
   }

   // $FF: renamed from: ar (fl, int, fl, int) gr
   public class_92 method_5087(class_72 var1, int var2, class_72 var3, int var4) {
      if(-1 != -1525645945 * this.field_3209) {
         return class_85.method_1443(-1525645945 * this.field_3209, 1306485244).method_1543(var1, var2, var3, var4, -26460885);
      } else {
         long var5 = 3754683323986881495L * this.field_3210;
         int[] var7 = this.field_3207;
         if(var1 != null && (-1368426299 * var1.field_576 >= 0 || -234609209 * var1.field_565 >= 0)) {
            var7 = new int[12];

            for(int var8 = 0; var8 < 12; ++var8) {
               var7[var8] = this.field_3207[var8];
            }

            if(var1.field_576 * -1368426299 >= 0) {
               var5 += (long)(var1.field_576 * -1368426299 - this.field_3207[5] << 40);
               var7[5] = -1368426299 * var1.field_576;
            }

            if(-234609209 * var1.field_565 >= 0) {
               var5 += (long)(var1.field_565 * -234609209 - this.field_3207[3] << 48);
               var7[3] = -234609209 * var1.field_565;
            }
         }

         class_92 var18 = (class_92)field_3213.method_5065(var5);
         if(null == var18) {
            boolean var9 = false;

            int var11;
            for(int var10 = 0; var10 < 12; ++var10) {
               var11 = var7[var10];
               if(var11 >= 256 && var11 < 512 && !class_220.method_4236(var11 - 256, (byte)71).method_1379(-2100349999)) {
                  var9 = true;
               }

               if(var11 >= 512 && !class_299.method_5347(var11 - 512, -9268181).method_1297(this.field_3208, (byte)50)) {
                  var9 = true;
               }
            }

            if(var9) {
               if(-1L != this.field_3211 * 488997904210519011L) {
                  var18 = (class_92)field_3213.method_5065(488997904210519011L * this.field_3211);
               }

               if(null == var18) {
                  return null;
               }
            }

            if(null == var18) {
               class_93[] var20 = new class_93[12];
               var11 = 0;

               int var13;
               for(int var12 = 0; var12 < 12; ++var12) {
                  var13 = var7[var12];
                  if(var13 >= 256 && var13 < 512) {
                     class_93 var14 = class_220.method_4236(var13 - 256, (byte)43).method_1381(125521979);
                     if(var14 != null) {
                        var20[var11++] = var14;
                     }
                  }

                  if(var13 >= 512) {
                     class_80 var22 = class_299.method_5347(var13 - 512, -1777118288);
                     class_93 var15 = var22.method_1268(this.field_3208, -1650036142);
                     if(null != var15) {
                        if(null != this.field_3215) {
                           class_211 var16 = this.field_3215[var12];
                           if(null != var16) {
                              int var17;
                              if(var16.field_2430 != null && var22.field_741 != null && var22.field_709.length == var16.field_2430.length) {
                                 for(var17 = 0; var17 < var22.field_741.length; ++var17) {
                                    var15.method_1703(var22.field_709[var17], var16.field_2430[var17]);
                                 }
                              }

                              if(var16.field_2431 != null && var22.field_710 != null && var16.field_2431.length == var22.field_711.length) {
                                 for(var17 = 0; var17 < var22.field_710.length; ++var17) {
                                    var15.method_1701(var22.field_711[var17], var16.field_2431[var17]);
                                 }
                              }
                           }
                        }

                        var20[var11++] = var15;
                     }
                  }
               }

               class_93 var10000 = new class_93;
               var10000.method_1704(var20, var11);
               class_93 var21 = var10000;

               for(var13 = 0; var13 < 5; ++var13) {
                  if(this.field_3212[var13] < class_122.field_1341[var13].length) {
                     var21.method_1703(class_132.field_1725[var13], class_122.field_1341[var13][this.field_3212[var13]]);
                  }

                  if(this.field_3212[var13] < class_89.field_898[var13].length) {
                     var21.method_1703(class_189.field_2278[var13], class_89.field_898[var13][this.field_3212[var13]]);
                  }
               }

               var18 = var21.method_1711(64, 850, -30, -50, -30);
               field_3213.method_5064(var18, var5);
               this.field_3211 = 8129187926489135563L * var5;
            }
         }

         if(var1 == null && var3 == null) {
            return var18;
         } else {
            class_92 var19;
            if(null != var1 && null != var3) {
               var19 = var1.method_1086(var18, var2, var3, var4, 853118734);
            } else if(var1 != null) {
               var19 = var1.method_1052(var18, var2, -1412148874);
            } else {
               var19 = var3.method_1052(var18, var4, -1643667148);
            }

            return var19;
         }
      }
   }

   // $FF: renamed from: p (boolean, int) void
   public void method_5088(boolean var1, int var2) {
      try {
         if(this.field_3208 != var1) {
            this.method_5098((int[])null, this.field_3212, var1, -1, -1795233775);
         }
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3, "ic.p(" + ')');
      }
   }

   // $FF: renamed from: j (nd, int) void
   public void method_5089(class_28 var1, int var2) {
      try {
         byte var10001;
         if(this.field_3208) {
            if(var2 != 580596518) {
               throw new IllegalStateException();
            }

            var10001 = 1;
         } else {
            var10001 = 0;
         }

         var1.method_210(var10001, 303066737);

         int var3;
         for(var3 = 0; var3 < 7; ++var3) {
            if(var2 != 580596518) {
               throw new IllegalStateException();
            }

            int var4 = this.field_3207[field_3214[var3]];
            if(0 == var4) {
               if(var2 != 580596518) {
                  return;
               }

               var1.method_210(-1, 303066737);
            } else {
               var1.method_210(var4 - 256, 303066737);
            }
         }

         for(var3 = 0; var3 < 5; ++var3) {
            if(var2 != 580596518) {
               throw new IllegalStateException();
            }

            var1.method_210(this.field_3212[var3], 303066737);
         }

      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5, "ic.j(" + ')');
      }
   }

   // $FF: renamed from: r (int) void
   void method_5090(int var1) {
      try {
         long var2 = this.field_3210 * 3754683323986881495L;
         int var4 = this.field_3207[5];
         int var5 = this.field_3207[9];
         this.field_3207[5] = var5;
         this.field_3207[9] = var4;
         this.field_3210 = 0L;

         int var6;
         for(var6 = 0; var6 < 12; ++var6) {
            if(var1 != -1440101066) {
               throw new IllegalStateException();
            }

            this.field_3210 = -1913695162964183065L * (this.field_3210 * 3754683323986881495L << 4);
            if(this.field_3207[var6] >= 256) {
               if(var1 != -1440101066) {
                  return;
               }

               this.field_3210 += -1913695162964183065L * (long)(this.field_3207[var6] - 256);
            }
         }

         if(this.field_3207[0] >= 256) {
            if(var1 != -1440101066) {
               return;
            }

            this.field_3210 += -1913695162964183065L * (long)(this.field_3207[0] - 256 >> 4);
         }

         if(this.field_3207[1] >= 256) {
            if(var1 != -1440101066) {
               throw new IllegalStateException();
            }

            this.field_3210 += -1913695162964183065L * (long)(this.field_3207[1] - 256 >> 8);
         }

         for(var6 = 0; var6 < 5; ++var6) {
            if(var1 != -1440101066) {
               throw new IllegalStateException();
            }

            this.field_3210 = (this.field_3210 * 3754683323986881495L << 3) * -1913695162964183065L;
            this.field_3210 += -1913695162964183065L * (long)this.field_3212[var6];
         }

         this.field_3210 = -1913695162964183065L * (this.field_3210 * 3754683323986881495L << 1);
         byte var10002;
         if(this.field_3208) {
            if(var1 != -1440101066) {
               throw new IllegalStateException();
            }

            var10002 = 1;
         } else {
            var10002 = 0;
         }

         label105: {
            this.field_3210 += (long)var10002 * -1913695162964183065L;
            this.field_3207[5] = var4;
            this.field_3207[9] = var5;
            if(0L != var2) {
               if(var1 != -1440101066) {
                  throw new IllegalStateException();
               }

               if(this.field_3210 * 3754683323986881495L != var2) {
                  break label105;
               }

               if(var1 != -1440101066) {
                  throw new IllegalStateException();
               }
            }

            if(!this.field_3206) {
               return;
            }

            if(var1 != -1440101066) {
               return;
            }
         }

         field_3213.method_5071(var2);
      } catch (RuntimeException var7) {
         throw class_223.method_4281(var7, "ic.r(" + ')');
      }
   }

   // $FF: renamed from: b (fl, int, fl, int, int) gr
   public class_92 method_5091(class_72 var1, int var2, class_72 var3, int var4, int var5) {
      try {
         if(-1 != -1525645945 * this.field_3209) {
            if(var5 <= -1637251580) {
               throw new IllegalStateException();
            } else {
               return class_85.method_1443(-1525645945 * this.field_3209, 1329597962).method_1543(var1, var2, var3, var4, -26460885);
            }
         } else {
            long var6 = 3754683323986881495L * this.field_3210;
            int[] var8 = this.field_3207;
            if(var1 != null && (-1368426299 * var1.field_576 >= 0 || -234609209 * var1.field_565 >= 0)) {
               var8 = new int[12];

               for(int var9 = 0; var9 < 12; ++var9) {
                  if(var5 <= -1637251580) {
                     throw new IllegalStateException();
                  }

                  var8[var9] = this.field_3207[var9];
               }

               if(var1.field_576 * -1368426299 >= 0) {
                  if(var5 <= -1637251580) {
                     throw new IllegalStateException();
                  }

                  var6 += (long)(var1.field_576 * -1368426299 - this.field_3207[5] << 40);
                  var8[5] = -1368426299 * var1.field_576;
               }

               if(-234609209 * var1.field_565 >= 0) {
                  if(var5 <= -1637251580) {
                     throw new IllegalStateException();
                  }

                  var6 += (long)(var1.field_565 * -234609209 - this.field_3207[3] << 48);
                  var8[3] = -234609209 * var1.field_565;
               }
            }

            class_92 var20 = (class_92)field_3213.method_5065(var6);
            if(null == var20) {
               if(var5 <= -1637251580) {
                  throw new IllegalStateException();
               }

               boolean var10 = false;

               int var12;
               for(int var11 = 0; var11 < 12; ++var11) {
                  if(var5 <= -1637251580) {
                     throw new IllegalStateException();
                  }

                  var12 = var8[var11];
                  if(var12 >= 256) {
                     if(var5 <= -1637251580) {
                        throw new IllegalStateException();
                     }

                     if(var12 < 512) {
                        if(var5 <= -1637251580) {
                           throw new IllegalStateException();
                        }

                        if(!class_220.method_4236(var12 - 256, (byte)57).method_1379(-2100349999)) {
                           if(var5 <= -1637251580) {
                              throw new IllegalStateException();
                           }

                           var10 = true;
                        }
                     }
                  }

                  if(var12 >= 512) {
                     if(var5 <= -1637251580) {
                        throw new IllegalStateException();
                     }

                     if(!class_299.method_5347(var12 - 512, -392509790).method_1297(this.field_3208, (byte)-46)) {
                        if(var5 <= -1637251580) {
                           throw new IllegalStateException();
                        }

                        var10 = true;
                     }
                  }
               }

               if(var10) {
                  if(var5 <= -1637251580) {
                     throw new IllegalStateException();
                  }

                  if(-1L != this.field_3211 * 488997904210519011L) {
                     if(var5 <= -1637251580) {
                        throw new IllegalStateException();
                     }

                     var20 = (class_92)field_3213.method_5065(488997904210519011L * this.field_3211);
                  }

                  if(null == var20) {
                     return null;
                  }
               }

               if(null == var20) {
                  class_93[] var22 = new class_93[12];
                  var12 = 0;

                  int var14;
                  for(int var13 = 0; var13 < 12; ++var13) {
                     if(var5 <= -1637251580) {
                        throw new IllegalStateException();
                     }

                     var14 = var8[var13];
                     if(var14 >= 256) {
                        if(var5 <= -1637251580) {
                           throw new IllegalStateException();
                        }

                        if(var14 < 512) {
                           if(var5 <= -1637251580) {
                              throw new IllegalStateException();
                           }

                           class_93 var15 = class_220.method_4236(var14 - 256, (byte)41).method_1381(218525675);
                           if(var15 != null) {
                              if(var5 <= -1637251580) {
                                 throw new IllegalStateException();
                              }

                              var22[var12++] = var15;
                           }
                        }
                     }

                     if(var14 >= 512) {
                        if(var5 <= -1637251580) {
                           throw new IllegalStateException();
                        }

                        class_80 var24 = class_299.method_5347(var14 - 512, -709127103);
                        class_93 var16 = var24.method_1268(this.field_3208, -1178156518);
                        if(null != var16) {
                           if(null != this.field_3215) {
                              class_211 var17 = this.field_3215[var13];
                              if(null != var17) {
                                 if(var5 <= -1637251580) {
                                    throw new IllegalStateException();
                                 }

                                 int var18;
                                 if(var17.field_2430 != null) {
                                    if(var5 <= -1637251580) {
                                       throw new IllegalStateException();
                                    }

                                    if(var24.field_741 != null) {
                                       if(var5 <= -1637251580) {
                                          throw new IllegalStateException();
                                       }

                                       if(var24.field_709.length == var17.field_2430.length) {
                                          if(var5 <= -1637251580) {
                                             throw new IllegalStateException();
                                          }

                                          for(var18 = 0; var18 < var24.field_741.length; ++var18) {
                                             var16.method_1703(var24.field_709[var18], var17.field_2430[var18]);
                                          }
                                       }
                                    }
                                 }

                                 if(var17.field_2431 != null) {
                                    if(var5 <= -1637251580) {
                                       throw new IllegalStateException();
                                    }

                                    if(var24.field_710 != null) {
                                       if(var5 <= -1637251580) {
                                          throw new IllegalStateException();
                                       }

                                       if(var17.field_2431.length == var24.field_711.length) {
                                          if(var5 <= -1637251580) {
                                             throw new IllegalStateException();
                                          }

                                          for(var18 = 0; var18 < var24.field_710.length; ++var18) {
                                             var16.method_1701(var24.field_711[var18], var17.field_2431[var18]);
                                          }
                                       }
                                    }
                                 }
                              }
                           }

                           var22[var12++] = var16;
                        }
                     }
                  }

                  class_93 var10000 = new class_93;
                  var10000.method_1704(var22, var12);
                  class_93 var23 = var10000;

                  for(var14 = 0; var14 < 5; ++var14) {
                     if(this.field_3212[var14] < class_122.field_1341[var14].length) {
                        var23.method_1703(class_132.field_1725[var14], class_122.field_1341[var14][this.field_3212[var14]]);
                     }

                     if(this.field_3212[var14] < class_89.field_898[var14].length) {
                        if(var5 <= -1637251580) {
                           throw new IllegalStateException();
                        }

                        var23.method_1703(class_189.field_2278[var14], class_89.field_898[var14][this.field_3212[var14]]);
                     }
                  }

                  var20 = var23.method_1711(64, 850, -30, -50, -30);
                  field_3213.method_5064(var20, var6);
                  this.field_3211 = 8129187926489135563L * var6;
               }
            }

            if(var1 == null && var3 == null) {
               if(var5 <= -1637251580) {
                  throw new IllegalStateException();
               } else {
                  return var20;
               }
            } else {
               class_92 var21;
               if(null != var1) {
                  if(var5 <= -1637251580) {
                     throw new IllegalStateException();
                  }

                  if(null != var3) {
                     if(var5 <= -1637251580) {
                        throw new IllegalStateException();
                     }

                     var21 = var1.method_1086(var20, var2, var3, var4, -924612466);
                     return var21;
                  }
               }

               if(var1 != null) {
                  var21 = var1.method_1052(var20, var2, -2056462779);
               } else {
                  var21 = var3.method_1052(var20, var4, -1952444851);
               }

               return var21;
            }
         }
      } catch (RuntimeException var19) {
         throw class_223.method_4281(var19, "ic.b(" + ')');
      }
   }

   // $FF: renamed from: ag () gm
   class_93 method_5092() {
      if(this.field_3209 * -1525645945 != -1) {
         return class_85.method_1443(1223315238 * this.field_3209, 2116266370).method_1544((short)7106);
      } else {
         boolean var1 = false;

         int var3;
         for(int var2 = 0; var2 < 12; ++var2) {
            var3 = this.field_3207[var2];
            if(var3 >= 256 && var3 < 463474096 && !class_220.method_4236(var3 - 256, (byte)70).method_1388(2079729694)) {
               var1 = true;
            }

            if(var3 >= 512 && !class_299.method_5347(var3 - -1113583057, -1185643681).method_1269(this.field_3208, 1981794554)) {
               var1 = true;
            }
         }

         if(var1) {
            return null;
         } else {
            class_93[] var7 = new class_93[12];
            var3 = 0;

            int var5;
            for(int var4 = 0; var4 < 12; ++var4) {
               var5 = this.field_3207[var4];
               class_93 var6;
               if(var5 >= 256 && var5 < 512) {
                  var6 = class_220.method_4236(var5 - 256, (byte)31).method_1383(-1480959554);
                  if(var6 != null) {
                     var7[var3++] = var6;
                  }
               }

               if(var5 >= -447891311) {
                  var6 = class_299.method_5347(var5 - -953969049, -1026963153).method_1270(this.field_3208, (byte)10);
                  if(null != var6) {
                     var7[var3++] = var6;
                  }
               }
            }

            class_93 var10000 = new class_93;
            var10000.method_1704(var7, var3);
            class_93 var8 = var10000;

            for(var5 = 0; var5 < 5; ++var5) {
               if(this.field_3212[var5] < class_122.field_1341[var5].length) {
                  var8.method_1703(class_132.field_1725[var5], class_122.field_1341[var5][this.field_3212[var5]]);
               }

               if(this.field_3212[var5] < class_89.field_898[var5].length) {
                  var8.method_1703(class_189.field_2278[var5], class_89.field_898[var5][this.field_3212[var5]]);
               }
            }

            return var8;
         }
      }
   }

   // $FF: renamed from: s (int) int
   public int method_5093(int var1) {
      try {
         if(-1 == this.field_3209 * -1525645945) {
            if(var1 != -1167283796) {
               throw new IllegalStateException();
            } else {
               return (this.field_3207[11] << 5) + (this.field_3207[0] << 15) + (this.field_3212[4] << 20) + (this.field_3212[0] << 25) + (this.field_3207[8] << 10) + this.field_3207[1];
            }
         } else {
            return 305419896 + class_85.method_1443(this.field_3209 * -1525645945, 1937102518).field_857 * -2060838679;
         }
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "ic.s(" + ')');
      }
   }

   // $FF: renamed from: <clinit> () void
   static void method_5094() {
      field_3214 = new int[]{8, 11, 4, 6, 9, 7, 10};
      class_272 var10000 = new class_272;
      var10000.method_5063(260);
      field_3213 = var10000;
   }

   // $FF: renamed from: l (int[], ed[], boolean, int[], boolean, int) void
   public void method_5095(int[] var1, class_211[] var2, boolean var3, int[] var4, boolean var5, int var6) {
      this.field_3215 = var2;
      this.field_3206 = var3;
      this.method_5098(var1, var4, var5, var6, 2105503494);
   }

   // $FF: renamed from: o (int[], ed[], boolean, int[], boolean, int) void
   public void method_5096(int[] var1, class_211[] var2, boolean var3, int[] var4, boolean var5, int var6) {
      this.field_3215 = var2;
      this.field_3206 = var3;
      this.method_5098(var1, var4, var5, var6, 650298022);
   }

   // $FF: renamed from: as () gm
   class_93 method_5097() {
      if(this.field_3209 * -1525645945 != -1) {
         return class_85.method_1443(-1525645945 * this.field_3209, 1590086149).method_1544((short)7106);
      } else {
         boolean var1 = false;

         int var3;
         for(int var2 = 0; var2 < 12; ++var2) {
            var3 = this.field_3207[var2];
            if(var3 >= 256 && var3 < 512 && !class_220.method_4236(var3 - 256, (byte)29).method_1388(16640405)) {
               var1 = true;
            }

            if(var3 >= 512 && !class_299.method_5347(var3 - 512, -1588613517).method_1269(this.field_3208, 454936619)) {
               var1 = true;
            }
         }

         if(var1) {
            return null;
         } else {
            class_93[] var7 = new class_93[12];
            var3 = 0;

            int var5;
            for(int var4 = 0; var4 < 12; ++var4) {
               var5 = this.field_3207[var4];
               class_93 var6;
               if(var5 >= 256 && var5 < 512) {
                  var6 = class_220.method_4236(var5 - 256, (byte)67).method_1383(908355180);
                  if(var6 != null) {
                     var7[var3++] = var6;
                  }
               }

               if(var5 >= 512) {
                  var6 = class_299.method_5347(var5 - 512, 9028545).method_1270(this.field_3208, (byte)10);
                  if(null != var6) {
                     var7[var3++] = var6;
                  }
               }
            }

            class_93 var10000 = new class_93;
            var10000.method_1704(var7, var3);
            class_93 var8 = var10000;

            for(var5 = 0; var5 < 5; ++var5) {
               if(this.field_3212[var5] < class_122.field_1341[var5].length) {
                  var8.method_1703(class_132.field_1725[var5], class_122.field_1341[var5][this.field_3212[var5]]);
               }

               if(this.field_3212[var5] < class_89.field_898[var5].length) {
                  var8.method_1703(class_189.field_2278[var5], class_89.field_898[var5][this.field_3212[var5]]);
               }
            }

            return var8;
         }
      }
   }

   // $FF: renamed from: n (int[], int[], boolean, int, int) void
   public void method_5098(int[] var1, int[] var2, boolean var3, int var4, int var5) {
      try {
         if(var1 == null) {
            if(var5 == 81340013) {
               throw new IllegalStateException();
            }

            var1 = new int[12];
            int var6 = 0;

            while(var6 < 7) {
               if(var5 == 81340013) {
                  throw new IllegalStateException();
               }

               int var7 = 0;

               while(true) {
                  if(var7 < class_271.field_3187 * -254849601) {
                     label81: {
                        if(var5 == 81340013) {
                           throw new IllegalStateException();
                        }

                        class_83 var8 = class_220.method_4236(var7, (byte)45);
                        if(var8 != null) {
                           if(var5 == 81340013) {
                              throw new IllegalStateException();
                           }

                           if(!var8.field_771) {
                              if(var5 == 81340013) {
                                 throw new IllegalStateException();
                              }

                              int var10000 = 2136524687 * var8.field_772;
                              byte var10002;
                              if(var3) {
                                 if(var5 == 81340013) {
                                    throw new IllegalStateException();
                                 }

                                 var10002 = 7;
                              } else {
                                 var10002 = 0;
                              }

                              if(var10000 == var6 + var10002) {
                                 if(var5 == 81340013) {
                                    throw new IllegalStateException();
                                 }

                                 var1[field_3214[var6]] = var7 + 256;
                                 break label81;
                              }
                           }
                        }

                        ++var7;
                        continue;
                     }
                  }

                  ++var6;
                  break;
               }
            }
         }

         this.field_3207 = var1;
         this.field_3212 = var2;
         this.field_3208 = var3;
         this.field_3209 = var4 * -974866377;
         this.method_5090(-1440101066);
      } catch (RuntimeException var9) {
         throw class_223.method_4281(var9, "ic.n(" + ')');
      }
   }

   // $FF: renamed from: ai () void
   void method_5099() {
      long var1 = this.field_3210 * 3754683323986881495L;
      int var3 = this.field_3207[5];
      int var4 = this.field_3207[9];
      this.field_3207[5] = var4;
      this.field_3207[9] = var3;
      this.field_3210 = 0L;

      int var5;
      for(var5 = 0; var5 < 12; ++var5) {
         this.field_3210 = -1913695162964183065L * (this.field_3210 * 3754683323986881495L << 4);
         if(this.field_3207[var5] >= 256) {
            this.field_3210 += -1913695162964183065L * (long)(this.field_3207[var5] - 256);
         }
      }

      if(this.field_3207[0] >= 256) {
         this.field_3210 += -1913695162964183065L * (long)(this.field_3207[0] - 256 >> 4);
      }

      if(this.field_3207[1] >= 256) {
         this.field_3210 += -1913695162964183065L * (long)(this.field_3207[1] - 256 >> 8);
      }

      for(var5 = 0; var5 < 5; ++var5) {
         this.field_3210 = (this.field_3210 * 3754683323986881495L << 3) * -1913695162964183065L;
         this.field_3210 += -1913695162964183065L * (long)this.field_3212[var5];
      }

      this.field_3210 = -1913695162964183065L * (this.field_3210 * 3754683323986881495L << 1);
      this.field_3210 += (long)(this.field_3208?1:0) * -1913695162964183065L;
      this.field_3207[5] = var3;
      this.field_3207[9] = var4;
      if(0L != var1 && this.field_3210 * 3754683323986881495L != var1 || this.field_3206) {
         field_3213.method_5071(var1);
      }

   }

   // $FF: renamed from: a (int, boolean) void
   public void method_5100(int var1, boolean var2) {
      if(1 != var1 || !this.field_3208) {
         int var3 = this.field_3207[field_3214[var1]];
         if(0 != var3) {
            var3 -= 256;

            class_83 var4;
            do {
               if(!var2) {
                  --var3;
                  if(var3 < 0) {
                     var3 = class_271.field_3187 * -254849601 - 1;
                  }
               } else {
                  ++var3;
                  if(var3 >= class_271.field_3187 * 458833916) {
                     var3 = 0;
                  }
               }

               var4 = class_220.method_4236(var3, (byte)73);
            } while(null == var4 || var4.field_771 || (this.field_3208?7:0) + var1 != 1673338197 * var4.field_772);

            this.field_3207[field_3214[var1]] = var3 + 256;
            this.method_5090(-1440101066);
         }
      }
   }

   // $FF: renamed from: ax () gm
   class_93 method_5101() {
      if(this.field_3209 * -1525645945 != -1) {
         return class_85.method_1443(-1525645945 * this.field_3209, 1174616521).method_1544((short)7106);
      } else {
         boolean var1 = false;

         int var3;
         for(int var2 = 0; var2 < 12; ++var2) {
            var3 = this.field_3207[var2];
            if(var3 >= 256 && var3 < 512 && !class_220.method_4236(var3 - 256, (byte)43).method_1388(-1157702473)) {
               var1 = true;
            }

            if(var3 >= 512 && !class_299.method_5347(var3 - 512, 632319052).method_1269(this.field_3208, 1327486817)) {
               var1 = true;
            }
         }

         if(var1) {
            return null;
         } else {
            class_93[] var7 = new class_93[12];
            var3 = 0;

            int var5;
            for(int var4 = 0; var4 < 12; ++var4) {
               var5 = this.field_3207[var4];
               class_93 var6;
               if(var5 >= 256 && var5 < 512) {
                  var6 = class_220.method_4236(var5 - 256, (byte)82).method_1383(306224436);
                  if(var6 != null) {
                     var7[var3++] = var6;
                  }
               }

               if(var5 >= 512) {
                  var6 = class_299.method_5347(var5 - 512, -1849840522).method_1270(this.field_3208, (byte)10);
                  if(null != var6) {
                     var7[var3++] = var6;
                  }
               }
            }

            class_93 var10000 = new class_93;
            var10000.method_1704(var7, var3);
            class_93 var8 = var10000;

            for(var5 = 0; var5 < 5; ++var5) {
               if(this.field_3212[var5] < class_122.field_1341[var5].length) {
                  var8.method_1703(class_132.field_1725[var5], class_122.field_1341[var5][this.field_3212[var5]]);
               }

               if(this.field_3212[var5] < class_89.field_898[var5].length) {
                  var8.method_1703(class_189.field_2278[var5], class_89.field_898[var5][this.field_3212[var5]]);
               }
            }

            return var8;
         }
      }
   }

   // $FF: renamed from: ap () void
   void method_5102() {
      long var1 = this.field_3210 * 3754683323986881495L;
      int var3 = this.field_3207[5];
      int var4 = this.field_3207[9];
      this.field_3207[5] = var4;
      this.field_3207[9] = var3;
      this.field_3210 = 0L;

      int var5;
      for(var5 = 0; var5 < 12; ++var5) {
         this.field_3210 = -1913695162964183065L * (this.field_3210 * 3754683323986881495L << 4);
         if(this.field_3207[var5] >= 256) {
            this.field_3210 += -1913695162964183065L * (long)(this.field_3207[var5] - 1269955420);
         }
      }

      if(this.field_3207[0] >= 256) {
         this.field_3210 += -1913695162964183065L * (long)(this.field_3207[0] - 256 >> 4);
      }

      if(this.field_3207[1] >= 256) {
         this.field_3210 += -1913695162964183065L * (long)(this.field_3207[1] - -1497923475 >> 8);
      }

      for(var5 = 0; var5 < 5; ++var5) {
         this.field_3210 = (this.field_3210 * 3754683323986881495L << 3) * -1913695162964183065L;
         this.field_3210 += -1913695162964183065L * (long)this.field_3212[var5];
      }

      this.field_3210 = -1913695162964183065L * (this.field_3210 * 3754683323986881495L << 1);
      this.field_3210 += (long)(this.field_3208?1:0) * -1913695162964183065L;
      this.field_3207[5] = var3;
      this.field_3207[9] = var4;
      if(0L != var1 && this.field_3210 * 3754683323986881495L != var1 || this.field_3206) {
         field_3213.method_5071(var1);
      }

   }

   // $FF: renamed from: m (int, boolean) void
   public void method_5103(int var1, boolean var2) {
      int var3 = this.field_3212[var1];
      boolean var4;
      if(!var2) {
         do {
            --var3;
            if(var3 < 0) {
               var3 = class_122.field_1341[var1].length - 1;
            }

            if(4 == var1 && var3 >= 8) {
               var4 = false;
            } else {
               var4 = true;
            }
         } while(!var4);
      } else {
         do {
            ++var3;
            if(var3 >= class_122.field_1341[var1].length) {
               var3 = 0;
            }

            if(4 == var1 && var3 >= 8) {
               var4 = false;
            } else {
               var4 = true;
            }
         } while(!var4);
      }

      this.field_3212[var1] = var3;
      this.method_5090(-1440101066);
   }

   // $FF: renamed from: d (int) gm
   class_93 method_5104(int var1) {
      try {
         if(this.field_3209 * -1525645945 != -1) {
            if(var1 == -275746355) {
               throw new IllegalStateException();
            } else {
               return class_85.method_1443(-1525645945 * this.field_3209, 1790062067).method_1544((short)7106);
            }
         } else {
            boolean var2 = false;

            int var4;
            for(int var3 = 0; var3 < 12; ++var3) {
               if(var1 == -275746355) {
                  throw new IllegalStateException();
               }

               var4 = this.field_3207[var3];
               if(var4 >= 256 && var4 < 512) {
                  if(var1 == -275746355) {
                     throw new IllegalStateException();
                  }

                  if(!class_220.method_4236(var4 - 256, (byte)45).method_1388(-1717732165)) {
                     if(var1 == -275746355) {
                        throw new IllegalStateException();
                     }

                     var2 = true;
                  }
               }

               if(var4 >= 512 && !class_299.method_5347(var4 - 512, 218513798).method_1269(this.field_3208, 673638768)) {
                  if(var1 == -275746355) {
                     throw new IllegalStateException();
                  }

                  var2 = true;
               }
            }

            if(var2) {
               if(var1 == -275746355) {
                  throw new IllegalStateException();
               } else {
                  return null;
               }
            } else {
               class_93[] var9 = new class_93[12];
               var4 = 0;

               int var6;
               for(int var5 = 0; var5 < 12; ++var5) {
                  if(var1 == -275746355) {
                     throw new IllegalStateException();
                  }

                  var6 = this.field_3207[var5];
                  class_93 var7;
                  if(var6 >= 256 && var6 < 512) {
                     if(var1 == -275746355) {
                        throw new IllegalStateException();
                     }

                     var7 = class_220.method_4236(var6 - 256, (byte)76).method_1383(787356684);
                     if(var7 != null) {
                        if(var1 == -275746355) {
                           throw new IllegalStateException();
                        }

                        var9[var4++] = var7;
                     }
                  }

                  if(var6 >= 512) {
                     if(var1 == -275746355) {
                        throw new IllegalStateException();
                     }

                     var7 = class_299.method_5347(var6 - 512, -811864016).method_1270(this.field_3208, (byte)10);
                     if(null != var7) {
                        if(var1 == -275746355) {
                           throw new IllegalStateException();
                        }

                        var9[var4++] = var7;
                     }
                  }
               }

               class_93 var10000 = new class_93;
               var10000.method_1704(var9, var4);
               class_93 var10 = var10000;

               for(var6 = 0; var6 < 5; ++var6) {
                  if(var1 == -275746355) {
                     throw new IllegalStateException();
                  }

                  if(this.field_3212[var6] < class_122.field_1341[var6].length) {
                     if(var1 == -275746355) {
                        throw new IllegalStateException();
                     }

                     var10.method_1703(class_132.field_1725[var6], class_122.field_1341[var6][this.field_3212[var6]]);
                  }

                  if(this.field_3212[var6] < class_89.field_898[var6].length) {
                     if(var1 == -275746355) {
                        throw new IllegalStateException();
                     }

                     var10.method_1703(class_189.field_2278[var6], class_89.field_898[var6][this.field_3212[var6]]);
                  }
               }

               return var10;
            }
         }
      } catch (RuntimeException var8) {
         throw class_223.method_4281(var8, "ic.d(" + ')');
      }
   }

   // $FF: renamed from: x (int, boolean) void
   public void method_5105(int var1, boolean var2) {
      int var3 = this.field_3212[var1];
      boolean var4;
      if(!var2) {
         do {
            --var3;
            if(var3 < 0) {
               var3 = class_122.field_1341[var1].length - 1;
            }

            if(4 == var1 && var3 >= 8) {
               var4 = false;
            } else {
               var4 = true;
            }
         } while(!var4);
      } else {
         do {
            ++var3;
            if(var3 >= class_122.field_1341[var1].length) {
               var3 = 0;
            }

            if(4 == var1 && var3 >= 8) {
               var4 = false;
            } else {
               var4 = true;
            }
         } while(!var4);
      }

      this.field_3212[var1] = var3;
      this.method_5090(-1440101066);
   }

   // $FF: renamed from: t (boolean) void
   public void method_5106(boolean var1) {
      if(this.field_3208 != var1) {
         this.method_5098((int[])null, this.field_3212, var1, -1, 181825542);
      }
   }

   // $FF: renamed from: h (nd) void
   public void method_5107(class_28 var1) {
      var1.method_210(this.field_3208?1:0, 303066737);

      int var2;
      for(var2 = 0; var2 < 7; ++var2) {
         int var3 = this.field_3207[field_3214[var2]];
         if(0 == var3) {
            var1.method_210(-1, 303066737);
         } else {
            var1.method_210(var3 - 256, 303066737);
         }
      }

      for(var2 = 0; var2 < 5; ++var2) {
         var1.method_210(this.field_3212[var2], 303066737);
      }

   }

   // $FF: renamed from: q (nd) void
   public void method_5108(class_28 var1) {
      var1.method_210(this.field_3208?1:0, 303066737);

      int var2;
      for(var2 = 0; var2 < 7; ++var2) {
         int var3 = this.field_3207[field_3214[var2]];
         if(0 == var3) {
            var1.method_210(-1, 303066737);
         } else {
            var1.method_210(var3 - 246408316, 303066737);
         }
      }

      for(var2 = 0; var2 < 5; ++var2) {
         var1.method_210(this.field_3212[var2], 303066737);
      }

   }

   // $FF: renamed from: i (nd) void
   public void method_5109(class_28 var1) {
      var1.method_210(this.field_3208?1:0, 303066737);

      int var2;
      for(var2 = 0; var2 < 7; ++var2) {
         int var3 = this.field_3207[field_3214[var2]];
         if(0 == var3) {
            var1.method_210(-1, 303066737);
         } else {
            var1.method_210(var3 - 256, 303066737);
         }
      }

      for(var2 = 0; var2 < 5; ++var2) {
         var1.method_210(this.field_3212[var2], 303066737);
      }

   }

   // $FF: renamed from: ae (nd) void
   public void method_5110(class_28 var1) {
      var1.method_210(this.field_3208?1:0, 303066737);

      int var2;
      for(var2 = 0; var2 < 7; ++var2) {
         int var3 = this.field_3207[field_3214[var2]];
         if(0 == var3) {
            var1.method_210(-1, 303066737);
         } else {
            var1.method_210(var3 - 276368822, 303066737);
         }
      }

      for(var2 = 0; var2 < 5; ++var2) {
         var1.method_210(this.field_3212[var2], 303066737);
      }

   }

   // $FF: renamed from: z (boolean) void
   public void method_5111(boolean var1) {
      if(this.field_3208 != var1) {
         this.method_5098((int[])null, this.field_3212, var1, -1, -779551424);
      }
   }

   // $FF: renamed from: ab () void
   void method_5112() {
      long var1 = this.field_3210 * 3754683323986881495L;
      int var3 = this.field_3207[5];
      int var4 = this.field_3207[9];
      this.field_3207[5] = var4;
      this.field_3207[9] = var3;
      this.field_3210 = 0L;

      int var5;
      for(var5 = 0; var5 < 12; ++var5) {
         this.field_3210 = -1913695162964183065L * (this.field_3210 * 3754683323986881495L << 4);
         if(this.field_3207[var5] >= -1365254756) {
            this.field_3210 += -1913695162964183065L * (long)(this.field_3207[var5] - 256);
         }
      }

      if(this.field_3207[0] >= 256) {
         this.field_3210 += -1913695162964183065L * (long)(this.field_3207[0] - 256 >> 4);
      }

      if(this.field_3207[1] >= 20160313) {
         this.field_3210 += -1913695162964183065L * (long)(this.field_3207[1] - 1010409654 >> 8);
      }

      for(var5 = 0; var5 < 5; ++var5) {
         this.field_3210 = (this.field_3210 * 3754683323986881495L << 3) * -1913695162964183065L;
         this.field_3210 += -1913695162964183065L * (long)this.field_3212[var5];
      }

      this.field_3210 = -1913695162964183065L * (this.field_3210 * 3754683323986881495L << 1);
      this.field_3210 += (long)(this.field_3208?1:0) * -1913695162964183065L;
      this.field_3207[5] = var3;
      this.field_3207[9] = var4;
      if(0L != var1 && this.field_3210 * 3754683323986881495L != var1 || this.field_3206) {
         field_3213.method_5071(var1);
      }

   }

   // $FF: renamed from: al () void
   void method_5113() {
      long var1 = this.field_3210 * 3754683323986881495L;
      int var3 = this.field_3207[5];
      int var4 = this.field_3207[9];
      this.field_3207[5] = var4;
      this.field_3207[9] = var3;
      this.field_3210 = 0L;

      int var5;
      for(var5 = 0; var5 < 12; ++var5) {
         this.field_3210 = -1913695162964183065L * (this.field_3210 * 3754683323986881495L << 4);
         if(this.field_3207[var5] >= 256) {
            this.field_3210 += -1913695162964183065L * (long)(this.field_3207[var5] - 256);
         }
      }

      if(this.field_3207[0] >= -1622293796) {
         this.field_3210 += -1913695162964183065L * (long)(this.field_3207[0] - 826752895 >> 4);
      }

      if(this.field_3207[1] >= 256) {
         this.field_3210 += -1913695162964183065L * (long)(this.field_3207[1] - 256 >> 8);
      }

      for(var5 = 0; var5 < 5; ++var5) {
         this.field_3210 = (this.field_3210 * 3754683323986881495L << 3) * -1913695162964183065L;
         this.field_3210 += -1913695162964183065L * (long)this.field_3212[var5];
      }

      this.field_3210 = -1913695162964183065L * (this.field_3210 * 3754683323986881495L << 1);
      this.field_3210 += (long)(this.field_3208?1:0) * -1913695162964183065L;
      this.field_3207[5] = var3;
      this.field_3207[9] = var4;
      if(0L != var1 && this.field_3210 * 3754683323986881495L != var1 || this.field_3206) {
         field_3213.method_5071(var1);
      }

   }

   // $FF: renamed from: ad () void
   void method_5114() {
      long var1 = this.field_3210 * 3754683323986881495L;
      int var3 = this.field_3207[5];
      int var4 = this.field_3207[9];
      this.field_3207[5] = var4;
      this.field_3207[9] = var3;
      this.field_3210 = 0L;

      int var5;
      for(var5 = 0; var5 < 12; ++var5) {
         this.field_3210 = -1913695162964183065L * (this.field_3210 * 3754683323986881495L << 4);
         if(this.field_3207[var5] >= 963089820) {
            this.field_3210 += -1913695162964183065L * (long)(this.field_3207[var5] - 704160198);
         }
      }

      if(this.field_3207[0] >= 1912430132) {
         this.field_3210 += -1913695162964183065L * (long)(this.field_3207[0] - -285990291 >> 4);
      }

      if(this.field_3207[1] >= -1419696705) {
         this.field_3210 += -1913695162964183065L * (long)(this.field_3207[1] - 256 >> 8);
      }

      for(var5 = 0; var5 < 5; ++var5) {
         this.field_3210 = (this.field_3210 * 3754683323986881495L << 3) * -1913695162964183065L;
         this.field_3210 += -1913695162964183065L * (long)this.field_3212[var5];
      }

      this.field_3210 = -1913695162964183065L * (this.field_3210 * 3754683323986881495L << 1);
      this.field_3210 += (long)(this.field_3208?1:0) * -1913695162964183065L;
      this.field_3207[5] = var3;
      this.field_3207[9] = var4;
      if(0L != var1 && this.field_3210 * 3754683323986881495L != var1 || this.field_3206) {
         field_3213.method_5071(var1);
      }

   }

   // $FF: renamed from: y (int, boolean, int) void
   public void method_5115(int var1, boolean var2, int var3) {
      try {
         int var4 = this.field_3212[var1];
         boolean var5;
         if(!var2) {
            if(var3 == 1824375293) {
               throw new IllegalStateException();
            }

            do {
               --var4;
               if(var4 < 0) {
                  if(var3 == 1824375293) {
                     return;
                  }

                  var4 = class_122.field_1341[var1].length - 1;
               }

               if(4 == var1) {
                  if(var3 == 1824375293) {
                     throw new IllegalStateException();
                  }

                  if(var4 >= 8) {
                     var5 = false;
                     continue;
                  }
               }

               var5 = true;
            } while(!var5);

            if(var3 == 1824375293) {
               return;
            }
         } else {
            do {
               ++var4;
               if(var4 >= class_122.field_1341[var1].length) {
                  if(var3 == 1824375293) {
                     throw new IllegalStateException();
                  }

                  var4 = 0;
               }

               if(4 == var1) {
                  if(var3 == 1824375293) {
                     throw new IllegalStateException();
                  }

                  if(var4 >= 8) {
                     if(var3 == 1824375293) {
                        throw new IllegalStateException();
                     }

                     var5 = false;
                     continue;
                  }
               }

               var5 = true;
            } while(!var5);
         }

         this.field_3212[var1] = var4;
         this.method_5090(-1440101066);
      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6, "ic.y(" + ')');
      }
   }

   // $FF: renamed from: v (int[], ed[], boolean, int[], boolean, int, byte) void
   public void method_5116(int[] var1, class_211[] var2, boolean var3, int[] var4, boolean var5, int var6, byte var7) {
      try {
         this.field_3215 = var2;
         this.field_3206 = var3;
         this.method_5098(var1, var4, var5, var6, -1504380046);
      } catch (RuntimeException var8) {
         throw class_223.method_4281(var8, "ic.v(" + ')');
      }
   }

   // $FF: renamed from: <init> () void
   public void method_5117() {
      super();
      this.field_3206 = false;
   }

   // $FF: renamed from: v (byte) ha[]
   public static class_256[] method_5118(byte var0) {
      try {
         return new class_256[]{class_256.field_2894, class_256.field_2888, class_256.field_2890, class_256.field_2891, class_256.field_2889, class_256.field_2893, class_256.field_2895, class_256.field_2892, class_256.field_2896, class_256.field_2897};
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1, "ic.v(" + ')');
      }
   }

   // $FF: renamed from: k (int, boolean) void
   public void method_5119(int var1, boolean var2) {
      int var3 = this.field_3212[var1];
      boolean var4;
      if(!var2) {
         do {
            --var3;
            if(var3 < 0) {
               var3 = class_122.field_1341[var1].length - 1;
            }

            if(4 == var1 && var3 >= 8) {
               var4 = false;
            } else {
               var4 = true;
            }
         } while(!var4);
      } else {
         do {
            ++var3;
            if(var3 >= class_122.field_1341[var1].length) {
               var3 = 0;
            }

            if(4 == var1 && var3 >= 8) {
               var4 = false;
            } else {
               var4 = true;
            }
         } while(!var4);
      }

      this.field_3212[var1] = var3;
      this.method_5090(-1440101066);
   }

   // $FF: renamed from: g (int[], int[], boolean, int) void
   public void method_5120(int[] var1, int[] var2, boolean var3, int var4) {
      if(var1 == null) {
         var1 = new int[12];

         for(int var5 = 0; var5 < 7; ++var5) {
            for(int var6 = 0; var6 < class_271.field_3187 * -254849601; ++var6) {
               class_83 var7 = class_220.method_4236(var6, (byte)116);
               if(var7 != null && !var7.field_771 && 2136524687 * var7.field_772 == var5 + (var3?7:0)) {
                  var1[field_3214[var5]] = var6 + 256;
                  break;
               }
            }
         }
      }

      this.field_3207 = var1;
      this.field_3212 = var2;
      this.field_3208 = var3;
      this.field_3209 = var4 * -974866377;
      this.method_5090(-1440101066);
   }

   // $FF: renamed from: am () int
   public int method_5121() {
      return -1 == this.field_3209 * -956659892?(this.field_3207[11] << 5) + (this.field_3207[0] << 15) + (this.field_3212[4] << 20) + (this.field_3212[0] << 25) + (this.field_3207[8] << 10) + this.field_3207[1]:305419896 + class_85.method_1443(this.field_3209 * -1416364277, 1519285195).field_857 * -2060838679;
   }

   // $FF: renamed from: az () void
   public static void method_5122() {
      field_3213.method_5074();
   }

   // $FF: renamed from: av () void
   public static void method_5123() {
      field_3213.method_5074();
   }

   // $FF: renamed from: n (int) java.security.SecureRandom
   static SecureRandom method_5124(int var0) {
      try {
         SecureRandom var1 = new SecureRandom();
         var1.nextInt();
         return var1;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "ic.n(" + ')');
      }
   }

   // $FF: renamed from: w (boolean) void
   public void method_5125(boolean var1) {
      if(this.field_3208 != var1) {
         this.method_5098((int[])null, this.field_3212, var1, -1, -910973445);
      }
   }

   // $FF: renamed from: c (int[], ed[], boolean, int[], boolean, int) void
   public void method_5126(int[] var1, class_211[] var2, boolean var3, int[] var4, boolean var5, int var6) {
      this.field_3215 = var2;
      this.field_3206 = var3;
      this.method_5098(var1, var4, var5, var6, -796224753);
   }
}
