import java.io.File;
import java.io.RandomAccessFile;

// $FF: renamed from: bw
public class class_158 {

   // $FF: renamed from: f int[]
   int[] field_1960;
   // $FF: renamed from: n int
   int field_1961;
   // $FF: renamed from: v cf
   class_90 field_1962;
   // $FF: renamed from: y java.lang.String[]
   String[] field_1963;


   // $FF: renamed from: v (java.lang.String, int) java.io.File
   public static File method_3302(String var0, int var1) {
      try {
         if(!class_210.field_2425) {
            if(var1 <= -710941750) {
               throw new IllegalStateException();
            } else {
               throw new RuntimeException("");
            }
         } else {
            File var2 = (File)class_210.field_2424.get(var0);
            if(var2 != null) {
               return var2;
            } else {
               File var3 = new File(class_210.fOldschoolCacheDir, var0);
               RandomAccessFile var4 = null;

               try {
                  File var5 = new File(var3.getParent());
                  if(!var5.exists()) {
                     throw new RuntimeException("");
                  } else {
                     var4 = new RandomAccessFile(var3, "rw");
                     int var6 = var4.read();
                     var4.seek(0L);
                     var4.write(var6);
                     var4.seek(0L);
                     var4.close();
                     class_210.field_2424.put(var0, var3);
                     return var3;
                  }
               } catch (Exception var8) {
                  try {
                     if(null != var4) {
                        if(var1 <= -710941750) {
                           throw new IllegalStateException();
                        }

                        var4.close();
                        var4 = null;
                     }
                  } catch (Exception var7) {
                     ;
                  }

                  throw new RuntimeException();
               }
            }
         }
      } catch (RuntimeException var9) {
         throw class_223.method_4281(var9);
      }
   }

   // $FF: renamed from: <init> () void
   class_158() {
      super();
      try {
         this.field_1961 = 815362225;
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1);
      }
   }

   // $FF: renamed from: gf (int, int, int, int, int) void
   static final void method_3304(int var0, int var1, int var2, int var3, int var4) {
      try {
         client.field_1559 += 1290631403;
         if(-1714532039 * client.field_1520 == -130212619 * class_164.field_2044.field_1077 >> 7) {
            if(var4 == -1785462492) {
               throw new IllegalStateException();
            }

            if(class_164.field_2044.field_1076 * 1248597615 >> 7 == client.field_1562 * 1810222737) {
               if(var4 == -1785462492) {
                  return;
               }

               client.field_1520 = 0;
            }
         }

         class_148.method_3120((byte)5);
         class_261.method_4991((byte)7);
         class_151.method_3213(true, 2022835517);
         class_390.method_6771(-1793660977);
         class_151.method_3213(false, 2012479792);

         int var7;
         for(class_95 var5 = (class_95)client.field_1683.method_5944(); null != var5; var5 = (class_95)client.field_1683.method_5972()) {
            if(-1185495603 * var5.field_1027 == class_115.field_1289 * 1115122599) {
               if(var4 == -1785462492) {
                  throw new IllegalStateException();
               }

               if(client.field_1425 * -1702273423 <= var5.field_1044 * -1817230173) {
                  if(-1702273423 * client.field_1425 >= var5.field_1032 * 1894077723) {
                     if(var4 == -1785462492) {
                        throw new IllegalStateException();
                     }

                     if(var5.field_1036 * 319116855 > 0) {
                        if(var4 == -1785462492) {
                           throw new IllegalStateException();
                        }

                        class_99 var6 = client.field_1458[319116855 * var5.field_1036 - 1];
                        if(null != var6) {
                           if(var4 == -1785462492) {
                              throw new IllegalStateException();
                           }

                           if(var6.field_1077 * -130212619 >= 0 && -130212619 * var6.field_1077 < 13312) {
                              if(var4 == -1785462492) {
                                 throw new IllegalStateException();
                              }

                              if(var6.field_1076 * 1248597615 >= 0 && var6.field_1076 * 1248597615 < 13312) {
                                 if(var4 == -1785462492) {
                                    return;
                                 }

                                 var5.method_1775(var6.field_1077 * -130212619, 1248597615 * var6.field_1076, class_205.method_4113(var6.field_1077 * -130212619, 1248597615 * var6.field_1076, var5.field_1027 * -1185495603, 1931303863) - var5.field_1031 * 460279713, client.field_1425 * -1702273423, 1172871120);
                              }
                           }
                        }
                     }

                     if(var5.field_1036 * 319116855 < 0) {
                        if(var4 == -1785462492) {
                           throw new IllegalStateException();
                        }

                        var7 = -(var5.field_1036 * 319116855) - 1;
                        class_100 var22;
                        if(var7 == 929092845 * client.field_1534) {
                           if(var4 == -1785462492) {
                              return;
                           }

                           var22 = class_164.field_2044;
                        } else {
                           var22 = client.field_1605[var7];
                        }

                        if(var22 != null) {
                           if(var4 == -1785462492) {
                              throw new IllegalStateException();
                           }

                           if(var22.field_1077 * -130212619 >= 0) {
                              if(var4 == -1785462492) {
                                 throw new IllegalStateException();
                              }

                              if(-130212619 * var22.field_1077 < 13312) {
                                 if(var4 == -1785462492) {
                                    throw new IllegalStateException();
                                 }

                                 if(1248597615 * var22.field_1076 >= 0 && 1248597615 * var22.field_1076 < 13312) {
                                    if(var4 == -1785462492) {
                                       throw new IllegalStateException();
                                    }

                                    var5.method_1775(-130212619 * var22.field_1077, var22.field_1076 * 1248597615, class_205.method_4113(-130212619 * var22.field_1077, 1248597615 * var22.field_1076, var5.field_1027 * -1185495603, 603232922) - 460279713 * var5.field_1031, client.field_1425 * -1702273423, 352787781);
                                 }
                              }
                           }
                        }
                     }

                     var5.method_1773(613265553 * client.field_1689, -602839745);
                     class_206.field_2401.method_4875(1115122599 * class_115.field_1289, (int)var5.field_1038, (int)var5.field_1039, (int)var5.field_1040, 60, var5, 2013686209 * var5.field_1046, -1L, false);
                  }
                  continue;
               }
            }

            var5.method_108();
         }

         for(class_97 var20 = (class_97)client.field_1694.method_5944(); null != var20; var20 = (class_97)client.field_1694.method_5972()) {
            if(var4 == -1785462492) {
               return;
            }

            if(1115122599 * class_115.field_1289 == var20.field_1066 * -1151722421) {
               if(var4 == -1785462492) {
                  throw new IllegalStateException();
               }

               if(!var20.field_1065) {
                  if(-1702273423 * client.field_1425 >= 2035613177 * var20.field_1073) {
                     if(var4 == -1785462492) {
                        return;
                     }

                     var20.method_1783(613265553 * client.field_1689, -1622052519);
                     if(var20.field_1065) {
                        if(var4 == -1785462492) {
                           throw new IllegalStateException();
                        }

                        var20.method_108();
                     } else {
                        class_206.field_2401.method_4875(-1151722421 * var20.field_1066, var20.field_1067 * 886051665, var20.field_1068 * -1737947099, var20.field_1069 * 1509450081, 60, var20, 0, -1L, false);
                     }
                  }
                  continue;
               }

               if(var4 == -1785462492) {
                  return;
               }
            }

            var20.method_108();
         }

         class_200.method_4042(var0, var1, var2, var3, true, 1159694527);
         var0 = client.field_1678 * -2020111655;
         var1 = 407581195 * client.field_1679;
         var2 = client.field_1680 * -592780465;
         var3 = client.field_1681 * 1806233111;
         class_65.method_694(var0, var1, var0 + var2, var3 + var1);
         class_70.method_968();
         int var8;
         int var9;
         int var10;
         int var11;
         int var12;
         int var13;
         int var14;
         int var15;
         int var21;
         int var23;
         if(!client.field_1537) {
            if(var4 == -1785462492) {
               throw new IllegalStateException();
            }

            var21 = -2031705619 * client.field_1486;
            if(client.field_1503 * 627480141 / 256 > var21) {
               var21 = client.field_1503 * 627480141 / 256;
            }

            if(client.field_1469[4]) {
               if(var4 == -1785462492) {
                  throw new IllegalStateException();
               }

               if(client.field_1667[4] + 128 > var21) {
                  if(var4 == -1785462492) {
                     throw new IllegalStateException();
                  }

                  var21 = client.field_1667[4] + 128;
               }
            }

            var23 = -574530013 * client.field_1629 & 2047;
            var7 = -1113352723 * class_146.field_1861;
            var8 = 769722653 * class_120.field_1329;
            var9 = -145310383 * class_271.field_3188;
            var10 = class_174.method_3727(var21);
            var10 = class_223.method_4280(var10, var3, -1091351445);
            var11 = 2048 - var21 & 2047;
            var12 = 2048 - var23 & 2047;
            var13 = 0;
            var14 = 0;
            var15 = var10;
            int var16;
            int var17;
            int var18;
            if(0 != var11) {
               if(var4 == -1785462492) {
                  throw new IllegalStateException();
               }

               var16 = class_70.field_548[var11];
               var17 = class_70.field_559[var11];
               var18 = var14 * var17 - var16 * var10 >> 16;
               var15 = var16 * var14 + var10 * var17 >> 16;
               var14 = var18;
            }

            if(0 != var12) {
               if(var4 == -1785462492) {
                  return;
               }

               var16 = class_70.field_548[var12];
               var17 = class_70.field_559[var12];
               var18 = var13 * var17 + var15 * var16 >> 16;
               var15 = var15 * var17 - var13 * var16 >> 16;
               var13 = var18;
            }

            class_131.field_1719 = -1739220461 * (var7 - var13);
            class_172.field_2159 = (var8 - var14) * -1768191443;
            class_205.field_2393 = (var9 - var15) * -989203669;
            class_78.field_686 = -1037557343 * var21;
            class_382.field_4208 = 252884949 * var23;
            if(1 == -400479567 * client.field_1660) {
               if(var4 == -1785462492) {
                  throw new IllegalStateException();
               }

               if(-816484905 * client.field_1586 >= 2 && client.field_1425 * -1702273423 % 50 == 0) {
                  label698: {
                     if(var4 == -1785462492) {
                        return;
                     }

                     if(-130212619 * class_164.field_2044.field_1077 >> 7 == class_146.field_1861 * -1113352723 >> 7) {
                        if(var4 == -1785462492) {
                           throw new IllegalStateException();
                        }

                        if(-145310383 * class_271.field_3188 >> 7 == class_164.field_2044.field_1076 * 1248597615 >> 7) {
                           break label698;
                        }

                        if(var4 == -1785462492) {
                           throw new IllegalStateException();
                        }
                     }

                     var16 = 671262203 * class_164.field_2044.field_1163;
                     var17 = class_243.field_2700 * 697161691 + (class_146.field_1861 * -1113352723 >> 7);
                     var18 = -27903763 * class_154.field_1929 + (-145310383 * class_271.field_3188 >> 7);
                     class_117.method_2253(var17, var18, var16, true, 1667185837);
                  }
               }
            }
         }

         if(!client.field_1537) {
            if(var4 == -1785462492) {
               throw new IllegalStateException();
            }

            if(class_87.field_852.field_2117) {
               if(var4 == -1785462492) {
                  return;
               }

               var23 = 1115122599 * class_115.field_1289;
            } else {
               label701: {
                  var7 = 3;
                  if(-1584922015 * class_78.field_686 < 310) {
                     label722: {
                        if(var4 == -1785462492) {
                           throw new IllegalStateException();
                        }

                        if(-400479567 * client.field_1660 == 1) {
                           if(var4 == -1785462492) {
                              throw new IllegalStateException();
                           }

                           var8 = -1113352723 * class_146.field_1861 >> 7;
                           var9 = class_271.field_3188 * -145310383 >> 7;
                        } else {
                           var8 = -130212619 * class_164.field_2044.field_1077 >> 7;
                           var9 = class_164.field_2044.field_1076 * 1248597615 >> 7;
                        }

                        var10 = 1681670171 * class_131.field_1719 >> 7;
                        var11 = -2115685501 * class_205.field_2393 >> 7;
                        if(var10 >= 0 && var11 >= 0) {
                           if(var4 == -1785462492) {
                              throw new IllegalStateException();
                           }

                           if(var10 < 104) {
                              if(var4 == -1785462492) {
                                 throw new IllegalStateException();
                              }

                              if(var11 < 104) {
                                 if(var8 >= 0) {
                                    if(var4 == -1785462492) {
                                       return;
                                    }

                                    if(var9 >= 0) {
                                       if(var4 == -1785462492) {
                                          throw new IllegalStateException();
                                       }

                                       if(var8 < 104) {
                                          if(var9 < 104) {
                                             if(0 != (class_166.field_2069[1115122599 * class_115.field_1289][var10][var11] & 4)) {
                                                if(var4 == -1785462492) {
                                                   throw new IllegalStateException();
                                                }

                                                var7 = 1115122599 * class_115.field_1289;
                                             }

                                             if(var8 > var10) {
                                                if(var4 == -1785462492) {
                                                   throw new IllegalStateException();
                                                }

                                                var12 = var8 - var10;
                                             } else {
                                                var12 = var10 - var8;
                                             }

                                             if(var9 > var11) {
                                                if(var4 == -1785462492) {
                                                   return;
                                                }

                                                var13 = var9 - var11;
                                             } else {
                                                var13 = var11 - var9;
                                             }

                                             if(var12 > var13) {
                                                if(var4 == -1785462492) {
                                                   throw new IllegalStateException();
                                                }

                                                var14 = 65536 * var13 / var12;
                                                var15 = '\u8000';

                                                while(var8 != var10) {
                                                   if(var4 == -1785462492) {
                                                      throw new IllegalStateException();
                                                   }

                                                   if(var10 < var8) {
                                                      if(var4 == -1785462492) {
                                                         throw new IllegalStateException();
                                                      }

                                                      ++var10;
                                                   } else if(var10 > var8) {
                                                      --var10;
                                                   }

                                                   if((class_166.field_2069[1115122599 * class_115.field_1289][var10][var11] & 4) != 0) {
                                                      if(var4 == -1785462492) {
                                                         throw new IllegalStateException();
                                                      }

                                                      var7 = class_115.field_1289 * 1115122599;
                                                   }

                                                   var15 += var14;
                                                   if(var15 >= 65536) {
                                                      if(var4 == -1785462492) {
                                                         throw new IllegalStateException();
                                                      }

                                                      var15 -= 65536;
                                                      if(var11 < var9) {
                                                         ++var11;
                                                      } else if(var11 > var9) {
                                                         if(var4 == -1785462492) {
                                                            throw new IllegalStateException();
                                                         }

                                                         --var11;
                                                      }

                                                      if(0 != (class_166.field_2069[class_115.field_1289 * 1115122599][var10][var11] & 4)) {
                                                         if(var4 == -1785462492) {
                                                            throw new IllegalStateException();
                                                         }

                                                         var7 = 1115122599 * class_115.field_1289;
                                                      }
                                                   }
                                                }
                                             } else if(var13 > 0) {
                                                if(var4 == -1785462492) {
                                                   throw new IllegalStateException();
                                                }

                                                var14 = 65536 * var12 / var13;
                                                var15 = '\u8000';

                                                while(var11 != var9) {
                                                   if(var4 == -1785462492) {
                                                      throw new IllegalStateException();
                                                   }

                                                   if(var11 < var9) {
                                                      if(var4 == -1785462492) {
                                                         throw new IllegalStateException();
                                                      }

                                                      ++var11;
                                                   } else if(var11 > var9) {
                                                      if(var4 == -1785462492) {
                                                         throw new IllegalStateException();
                                                      }

                                                      --var11;
                                                   }

                                                   if(0 != (class_166.field_2069[class_115.field_1289 * 1115122599][var10][var11] & 4)) {
                                                      if(var4 == -1785462492) {
                                                         throw new IllegalStateException();
                                                      }

                                                      var7 = class_115.field_1289 * 1115122599;
                                                   }

                                                   var15 += var14;
                                                   if(var15 >= 65536) {
                                                      if(var4 == -1785462492) {
                                                         throw new IllegalStateException();
                                                      }

                                                      var15 -= 65536;
                                                      if(var10 < var8) {
                                                         if(var4 == -1785462492) {
                                                            return;
                                                         }

                                                         ++var10;
                                                      } else if(var10 > var8) {
                                                         if(var4 == -1785462492) {
                                                            throw new IllegalStateException();
                                                         }

                                                         --var10;
                                                      }

                                                      if(0 != (class_166.field_2069[1115122599 * class_115.field_1289][var10][var11] & 4)) {
                                                         var7 = 1115122599 * class_115.field_1289;
                                                      }
                                                   }
                                                }
                                             }
                                             break label722;
                                          }

                                          if(var4 == -1785462492) {
                                             return;
                                          }
                                       }
                                    }
                                 }

                                 var23 = class_115.field_1289 * 1115122599;
                                 break label701;
                              }

                              if(var4 == -1785462492) {
                                 throw new IllegalStateException();
                              }
                           }
                        }

                        var23 = 1115122599 * class_115.field_1289;
                        break label701;
                     }
                  }

                  if(-130212619 * class_164.field_2044.field_1077 >= 0) {
                     if(var4 == -1785462492) {
                        throw new IllegalStateException();
                     }

                     if(class_164.field_2044.field_1076 * 1248597615 >= 0 && class_164.field_2044.field_1077 * -130212619 < 13312) {
                        if(var4 == -1785462492) {
                           throw new IllegalStateException();
                        }

                        if(1248597615 * class_164.field_2044.field_1076 < 13312) {
                           if(0 != (class_166.field_2069[1115122599 * class_115.field_1289][class_164.field_2044.field_1077 * -130212619 >> 7][1248597615 * class_164.field_2044.field_1076 >> 7] & 4)) {
                              var7 = 1115122599 * class_115.field_1289;
                           }

                           var23 = var7;
                           break label701;
                        }

                        if(var4 == -1785462492) {
                           return;
                        }
                     }
                  }

                  var23 = 1115122599 * class_115.field_1289;
               }
            }

            var21 = var23;
         } else {
            var21 = class_137.method_2971((byte)26);
         }

         var23 = 1681670171 * class_131.field_1719;
         var7 = class_172.field_2159 * 45831589;
         var8 = class_205.field_2393 * -2115685501;
         var9 = -1584922015 * class_78.field_686;
         var10 = 611240317 * class_382.field_4208;

         for(var11 = 0; var11 < 5; ++var11) {
            if(var4 == -1785462492) {
               return;
            }

            if(client.field_1469[var11]) {
               var12 = (int)(Math.random() * (double)(client.field_1666[var11] * 2 + 1) - (double)client.field_1666[var11] + Math.sin((double)client.field_1669[var11] * ((double)client.field_1668[var11] / 100.0D)) * (double)client.field_1667[var11]);
               if(0 == var11) {
                  if(var4 == -1785462492) {
                     throw new IllegalStateException();
                  }

                  class_131.field_1719 += -1739220461 * var12;
               }

               if(var11 == 1) {
                  if(var4 == -1785462492) {
                     throw new IllegalStateException();
                  }

                  class_172.field_2159 += -1768191443 * var12;
               }

               if(2 == var11) {
                  class_205.field_2393 += -989203669 * var12;
               }

               if(var11 == 3) {
                  if(var4 == -1785462492) {
                     return;
                  }

                  class_382.field_4208 = 252884949 * (var12 + 611240317 * class_382.field_4208 & 2047);
               }

               if(4 == var11) {
                  if(var4 == -1785462492) {
                     throw new IllegalStateException();
                  }

                  class_78.field_686 += -1037557343 * var12;
                  if(class_78.field_686 * -1584922015 < 128) {
                     if(var4 == -1785462492) {
                        return;
                     }

                     class_78.field_686 = 336646272;
                  }

                  if(-1584922015 * class_78.field_686 > 383) {
                     class_78.field_686 = 2047496159;
                  }
               }
            }
         }

         var11 = class_131.field_1722 * -678881683;
         var12 = class_131.field_1703 * 1903378733;
         if(0 != class_131.field_1717 * -265253353) {
            if(var4 == -1785462492) {
               return;
            }

            var11 = class_131.field_1701 * 1003938789;
            var12 = 339791065 * class_131.field_1711;
         }

         label579: {
            if(var11 >= var0) {
               if(var4 == -1785462492) {
                  throw new IllegalStateException();
               }

               if(var11 < var2 + var0) {
                  if(var4 == -1785462492) {
                     throw new IllegalStateException();
                  }

                  if(var12 >= var1) {
                     if(var4 == -1785462492) {
                        return;
                     }

                     if(var12 < var3 + var1) {
                        if(var4 == -1785462492) {
                           return;
                        }

                        class_211.method_4173(var11 - var0, var12 - var1);
                        break label579;
                     }
                  }
               }
            }

            class_179.method_3810();
         }

         class_46.method_536(-1808857292);
         class_65.method_681(var0, var1, var2, var3, 0);
         class_46.method_536(-1808857292);
         var13 = class_70.field_544;
         class_70.field_544 = client.field_1682 * 755828989;
         class_206.field_2401.method_4861(class_131.field_1719 * 1681670171, 45831589 * class_172.field_2159, class_205.field_2393 * -2115685501, class_78.field_686 * -1584922015, 611240317 * class_382.field_4208, var21);
         class_70.field_544 = var13;
         class_46.method_536(-1808857292);
         class_206.field_2401.method_4737();
         class_314.method_5587(var0, var1, var2, var3, 1592550546);
         class_175.method_3741(var0, var1, 694193640);
         ((class_245)class_70.field_555).method_4694(613265553 * client.field_1689, -451757246);
         class_125.method_2287(-630332055);
         class_131.field_1719 = -1739220461 * var23;
         class_172.field_2159 = -1768191443 * var7;
         class_205.field_2393 = -989203669 * var8;
         class_78.field_686 = -1037557343 * var9;
         class_382.field_4208 = var10 * 252884949;
         if(client.field_1577) {
            if(var4 == -1785462492) {
               throw new IllegalStateException();
            }

            byte var24 = 0;
            var15 = var24 + -1204808007 * class_314.field_3768 + class_314.field_3780 * 317801023;
            if(0 == var15) {
               if(var4 == -1785462492) {
                  throw new IllegalStateException();
               }

               client.field_1577 = false;
            }
         }

         if(client.field_1577) {
            if(var4 == -1785462492) {
               return;
            }

            class_65.method_681(var0, var1, var2, var3, 0);
            class_278.method_5148(class_305.field_3433, false, -1591335539);
         }

      } catch (RuntimeException var19) {
         throw class_223.method_4281(var19);
      }
   }
}
