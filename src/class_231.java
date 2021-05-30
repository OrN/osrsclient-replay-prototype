import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

// $FF: renamed from: gz
public class class_231 extends class_230 {

   // $FF: renamed from: c java.util.HashSet
   HashSet field_2590;
   // $FF: renamed from: gx int[][]
   static int[][] field_2591;
   // $FF: renamed from: e java.util.List
   List field_2592;
   // $FF: renamed from: o java.util.HashSet
   HashSet field_2593;


   // $FF: renamed from: hf (byte) void
   static final void method_4427(byte var0) {
      try {
         class_245.method_4709(false, -148617531);
         client.field_1470 = 0;
         boolean var1 = true;

         int var2;
         for(var2 = 0; var2 < class_119.field_1316.length; ++var2) {
            if(var0 != 0) {
               throw new IllegalStateException();
            }

            if(class_51.field_376[var2] != -1) {
               if(var0 != 0) {
                  throw new IllegalStateException();
               }

               if(null == class_119.field_1316[var2]) {
                  if(var0 != 0) {
                     throw new IllegalStateException();
                  }

                  class_119.field_1316[var2] = class_286.field_3275.method_5381(class_51.field_376[var2], 0, -26460885);
                  if(null == class_119.field_1316[var2]) {
                     var1 = false;
                     client.field_1470 += -394356945;
                  }
               }
            }

            if(class_176.field_2178[var2] != -1 && null == class_168.field_2103[var2]) {
               if(var0 != 0) {
                  return;
               }

               class_168.field_2103[var2] = class_286.field_3275.method_5382(class_176.field_2178[var2], 0, field_2591[var2], 744457350);
               if(null == class_168.field_2103[var2]) {
                  if(var0 != 0) {
                     throw new IllegalStateException();
                  }

                  var1 = false;
                  client.field_1470 += -394356945;
               }
            }
         }

         if(!var1) {
            if(var0 != 0) {
               throw new IllegalStateException();
            } else {
               client.field_1474 = 1169115583;
            }
         } else {
            client.field_1472 = 0;
            var1 = true;

            int var4;
            int var5;
            class_28 var9;
            int var10;
            int var11;
            int var12;
            int var14;
            int var15;
            class_28 var10000;
            int var16;
            int var17;
            int var18;
            int var19;
            for(var2 = 0; var2 < class_119.field_1316.length; ++var2) {
               if(var0 != 0) {
                  throw new IllegalStateException();
               }

               byte[] var3 = class_168.field_2103[var2];
               if(var3 != null) {
                  if(var0 != 0) {
                     throw new IllegalStateException();
                  }

                  var4 = 64 * (class_275.field_3216[var2] >> 8) - 697161691 * class_243.field_2700;
                  var5 = (class_275.field_3216[var2] & 255) * 64 - -27903763 * class_154.field_1929;
                  if(client.field_1476) {
                     var4 = 10;
                     var5 = 10;
                  }

                  boolean var8 = true;
                  var10000 = new class_28;
                  var10000.method_178(var3);
                  var9 = var10000;
                  var10 = -1;

                  label920:
                  while(true) {
                     var11 = var9.method_124(-1225252005);
                     if(var11 == 0) {
                        var1 &= var8;
                        break;
                     }

                     var10 += var11;
                     var12 = 0;
                     boolean var13 = false;

                     while(true) {
                        while(!var13) {
                           var14 = var9.method_144((byte)-15);
                           if(0 == var14) {
                              if(var0 != 0) {
                                 throw new IllegalStateException();
                              }
                              continue label920;
                           }

                           var12 += var14 - 1;
                           var15 = var12 & 63;
                           var16 = var12 >> 6 & 63;
                           var17 = var9.method_130(1092853583) >> 2;
                           var18 = var16 + var4;
                           var19 = var5 + var15;
                           if(var18 > 0) {
                              if(var0 != 0) {
                                 throw new IllegalStateException();
                              }

                              if(var19 > 0) {
                                 if(var0 != 0) {
                                    throw new IllegalStateException();
                                 }

                                 if(var18 < 103) {
                                    if(var0 != 0) {
                                       throw new IllegalStateException();
                                    }

                                    if(var19 < 103) {
                                       if(var0 != 0) {
                                          throw new IllegalStateException();
                                       }

                                       class_87 var20 = class_121.method_2269(var10, 636840001);
                                       if(22 == var17) {
                                          if(var0 != 0) {
                                             throw new IllegalStateException();
                                          }

                                          if(client.field_1417) {
                                             if(var0 != 0) {
                                                throw new IllegalStateException();
                                             }

                                             if(-1747290425 * var20.field_820 == 0) {
                                                if(var0 != 0) {
                                                   throw new IllegalStateException();
                                                }

                                                if(1 != var20.field_818 * 1384594797) {
                                                   if(var0 != 0) {
                                                      return;
                                                   }

                                                   if(!var20.field_843) {
                                                      continue;
                                                   }
                                                }
                                             }
                                          }
                                       }

                                       if(!var20.method_1538(-205337927)) {
                                          if(var0 != 0) {
                                             throw new IllegalStateException();
                                          }

                                          client.field_1472 += -1316298113;
                                          var8 = false;
                                       }

                                       var13 = true;
                                    }
                                 }
                              }
                           }
                        }

                        if(var0 != 0) {
                           throw new IllegalStateException();
                        }

                        var14 = var9.method_144((byte)-104);
                        if(0 == var14) {
                           if(var0 != 0) {
                              throw new IllegalStateException();
                           }
                           break;
                        }

                        var9.method_130(-2093284455);
                     }
                  }
               }
            }

            if(!var1) {
               if(var0 == 0) {
                  client.field_1474 = -1956736130;
               }
            } else {
               if(-189422017 * client.field_1474 != 0) {
                  if(var0 != 0) {
                     throw new IllegalStateException();
                  }

                  class_278.method_5148(class_305.field_3433 + class_205.field_2398 + class_205.field_2395 + 100 + "%" + class_205.field_2396, true, -1591335539);
               }

               class_46.method_536(-1808857292);
               class_206.field_2401.method_4723();

               for(var2 = 0; var2 < 4; ++var2) {
                  if(var0 != 0) {
                     throw new IllegalStateException();
                  }

                  client.field_1475[var2].method_4609(1513589499);
               }

               int var32;
               for(var2 = 0; var2 < 4; ++var2) {
                  for(var32 = 0; var32 < 104; ++var32) {
                     if(var0 != 0) {
                        throw new IllegalStateException();
                     }

                     for(var4 = 0; var4 < 104; ++var4) {
                        if(var0 != 0) {
                           throw new IllegalStateException();
                        }

                        class_166.field_2069[var2][var32][var4] = 0;
                     }
                  }
               }

               class_46.method_536(-1808857292);
               class_144.method_3080(-67481948);
               var2 = class_119.field_1316.length;
               class_217.method_4202(581142439);
               class_245.method_4709(true, 909885941);
               int var21;
               int var22;
               int var34;
               int var42;
               int var45;
               if(!client.field_1476) {
                  byte[] var6;
                  for(var32 = 0; var32 < var2; ++var32) {
                     if(var0 != 0) {
                        throw new IllegalStateException();
                     }

                     var4 = 64 * (class_275.field_3216[var32] >> 8) - 697161691 * class_243.field_2700;
                     var5 = 64 * (class_275.field_3216[var32] & 255) - -27903763 * class_154.field_1929;
                     var6 = class_119.field_1316[var32];
                     if(null != var6) {
                        if(var0 != 0) {
                           throw new IllegalStateException();
                        }

                        class_46.method_536(-1808857292);
                        class_237.method_4595(var6, var4, var5, class_151.field_1910 * 451529448 - 48, 1829824856 * class_204.field_2387 - 48, client.field_1475, 1162395561);
                     }
                  }

                  for(var32 = 0; var32 < var2; ++var32) {
                     if(var0 != 0) {
                        throw new IllegalStateException();
                     }

                     var4 = 64 * (class_275.field_3216[var32] >> 8) - 697161691 * class_243.field_2700;
                     var5 = 64 * (class_275.field_3216[var32] & 255) - class_154.field_1929 * -27903763;
                     var6 = class_119.field_1316[var32];
                     if(null == var6) {
                        if(var0 != 0) {
                           throw new IllegalStateException();
                        }

                        if(-845013717 * class_204.field_2387 < 800) {
                           if(var0 != 0) {
                              throw new IllegalStateException();
                           }

                           class_46.method_536(-1808857292);
                           class_80.method_1336(var4, var5, 64, 64, -919320059);
                        }
                     }
                  }

                  class_245.method_4709(true, 457519199);

                  for(var32 = 0; var32 < var2; ++var32) {
                     if(var0 != 0) {
                        throw new IllegalStateException();
                     }

                     byte[] var33 = class_168.field_2103[var32];
                     if(var33 != null) {
                        if(var0 != 0) {
                           return;
                        }

                        var5 = (class_275.field_3216[var32] >> 8) * 64 - class_243.field_2700 * 697161691;
                        var34 = (class_275.field_3216[var32] & 255) * 64 - class_154.field_1929 * -27903763;
                        class_46.method_536(-1808857292);
                        class_251 var7 = class_206.field_2401;
                        class_240[] var37 = client.field_1475;
                        var10000 = new class_28;
                        var10000.method_178(var33);
                        var9 = var10000;
                        var10 = -1;

                        while(true) {
                           var11 = var9.method_124(-1225252005);
                           if(0 == var11) {
                              if(var0 != 0) {
                                 return;
                              }
                              break;
                           }

                           var10 += var11;
                           var12 = 0;

                           while(true) {
                              var42 = var9.method_144((byte)-62);
                              if(0 == var42) {
                                 if(var0 != 0) {
                                    throw new IllegalStateException();
                                 }
                                 break;
                              }

                              var12 += var42 - 1;
                              var14 = var12 & 63;
                              var15 = var12 >> 6 & 63;
                              var16 = var12 >> 12;
                              var17 = var9.method_130(-1445542437);
                              var18 = var17 >> 2;
                              var19 = var17 & 3;
                              var45 = var5 + var15;
                              var21 = var34 + var14;
                              if(var45 > 0) {
                                 if(var0 != 0) {
                                    throw new IllegalStateException();
                                 }

                                 if(var21 > 0) {
                                    if(var0 != 0) {
                                       throw new IllegalStateException();
                                    }

                                    if(var45 < 103) {
                                       if(var0 != 0) {
                                          return;
                                       }

                                       if(var21 < 103) {
                                          if(var0 != 0) {
                                             throw new IllegalStateException();
                                          }

                                          var22 = var16;
                                          if((class_166.field_2069[1][var45][var21] & 2) == 2) {
                                             if(var0 != 0) {
                                                return;
                                             }

                                             var22 = var16 - 1;
                                          }

                                          class_240 var23 = null;
                                          if(var22 >= 0) {
                                             if(var0 != 0) {
                                                return;
                                             }

                                             var23 = var37[var22];
                                          }

                                          class_178.method_3803(var16, var45, var21, var10, var19, var18, var7, var23, (byte)11);
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }

               int var36;
               int var38;
               int var40;
               if(client.field_1476) {
                  if(var0 != 0) {
                     throw new IllegalStateException();
                  }

                  for(var32 = 0; var32 < 4; ++var32) {
                     if(var0 != 0) {
                        return;
                     }

                     class_46.method_536(-1808857292);

                     for(var4 = 0; var4 < 13; ++var4) {
                        if(var0 != 0) {
                           throw new IllegalStateException();
                        }

                        for(var5 = 0; var5 < 13; ++var5) {
                           boolean var35 = false;
                           var36 = client.field_1477[var32][var4][var5];
                           if(var36 != -1) {
                              if(var0 != 0) {
                                 throw new IllegalStateException();
                              }

                              var38 = var36 >> 24 & 3;
                              var40 = var36 >> 1 & 3;
                              var10 = var36 >> 14 & 1023;
                              var11 = var36 >> 3 & 2047;
                              var12 = (var10 / 8 << 8) + var11 / 8;

                              for(var42 = 0; var42 < class_275.field_3216.length; ++var42) {
                                 if(var0 != 0) {
                                    return;
                                 }

                                 if(var12 == class_275.field_3216[var42]) {
                                    if(var0 != 0) {
                                       throw new IllegalStateException();
                                    }

                                    if(class_119.field_1316[var42] != null) {
                                       byte[] var43 = class_119.field_1316[var42];
                                       var15 = var4 * 8;
                                       var16 = var5 * 8;
                                       var17 = 8 * (var10 & 7);
                                       var18 = (var11 & 7) * 8;
                                       class_240[] var44 = client.field_1475;

                                       for(var45 = 0; var45 < 8; ++var45) {
                                          if(var0 != 0) {
                                             throw new IllegalStateException();
                                          }

                                          for(var21 = 0; var21 < 8; ++var21) {
                                             if(var0 != 0) {
                                                throw new IllegalStateException();
                                             }

                                             if(var15 + var45 > 0 && var15 + var45 < 103) {
                                                if(var0 != 0) {
                                                   throw new IllegalStateException();
                                                }

                                                if(var16 + var21 > 0) {
                                                   if(var0 != 0) {
                                                      throw new IllegalStateException();
                                                   }

                                                   if(var21 + var16 < 103) {
                                                      var44[var32].field_2679[var45 + var15][var21 + var16] &= -16777217;
                                                   }
                                                }
                                             }
                                          }
                                       }

                                       var10000 = new class_28;
                                       var10000.method_178(var43);
                                       class_28 var46 = var10000;

                                       for(var21 = 0; var21 < 4; ++var21) {
                                          if(var0 != 0) {
                                             throw new IllegalStateException();
                                          }

                                          for(var22 = 0; var22 < 64; ++var22) {
                                             if(var0 != 0) {
                                                throw new IllegalStateException();
                                             }

                                             for(int var47 = 0; var47 < 64; ++var47) {
                                                if(var0 != 0) {
                                                   throw new IllegalStateException();
                                                }

                                                if(var38 == var21) {
                                                   if(var0 != 0) {
                                                      throw new IllegalStateException();
                                                   }

                                                   if(var22 >= var17 && var22 < 8 + var17) {
                                                      if(var0 != 0) {
                                                         throw new IllegalStateException();
                                                      }

                                                      if(var47 >= var18) {
                                                         if(var0 != 0) {
                                                            throw new IllegalStateException();
                                                         }

                                                         if(var47 < var18 + 8) {
                                                            int var28 = var22 & 7;
                                                            int var29 = var47 & 7;
                                                            int var30 = var40 & 3;
                                                            int var27;
                                                            if(var30 == 0) {
                                                               if(var0 != 0) {
                                                                  throw new IllegalStateException();
                                                               }

                                                               var27 = var28;
                                                            } else if(1 == var30) {
                                                               var27 = var29;
                                                            } else if(2 == var30) {
                                                               var27 = 7 - var28;
                                                            } else {
                                                               var27 = 7 - var29;
                                                            }

                                                            method_4435(var46, var32, var27 + var15, var16 + class_178.method_3799(var22 & 7, var47 & 7, var40, -1338731866), 0, 0, var40, (byte)-20);
                                                            continue;
                                                         }
                                                      }
                                                   }
                                                }

                                                method_4435(var46, 0, -1, -1, 0, 0, 0, (byte)-71);
                                             }
                                          }
                                       }

                                       var35 = true;
                                       break;
                                    }
                                 }
                              }
                           }

                           if(!var35) {
                              if(var0 != 0) {
                                 throw new IllegalStateException();
                              }

                              class_163.method_3422(var32, var4 * 8, var5 * 8, -558099635);
                           }
                        }
                     }
                  }

                  for(var32 = 0; var32 < 13; ++var32) {
                     if(var0 != 0) {
                        throw new IllegalStateException();
                     }

                     for(var4 = 0; var4 < 13; ++var4) {
                        if(var0 != 0) {
                           throw new IllegalStateException();
                        }

                        var5 = client.field_1477[0][var32][var4];
                        if(var5 == -1) {
                           if(var0 != 0) {
                              throw new IllegalStateException();
                           }

                           class_80.method_1336(var32 * 8, var4 * 8, 8, 8, -210693932);
                        }
                     }
                  }

                  class_245.method_4709(true, -13272677);

                  for(var32 = 0; var32 < 4; ++var32) {
                     if(var0 != 0) {
                        throw new IllegalStateException();
                     }

                     class_46.method_536(-1808857292);

                     for(var4 = 0; var4 < 13; ++var4) {
                        if(var0 != 0) {
                           throw new IllegalStateException();
                        }

                        for(var5 = 0; var5 < 13; ++var5) {
                           if(var0 != 0) {
                              throw new IllegalStateException();
                           }

                           var34 = client.field_1477[var32][var4][var5];
                           if(var34 != -1) {
                              if(var0 != 0) {
                                 throw new IllegalStateException();
                              }

                              var36 = var34 >> 24 & 3;
                              var38 = var34 >> 1 & 3;
                              var40 = var34 >> 14 & 1023;
                              var10 = var34 >> 3 & 2047;
                              var11 = (var40 / 8 << 8) + var10 / 8;

                              for(var12 = 0; var12 < class_275.field_3216.length; ++var12) {
                                 if(var0 != 0) {
                                    throw new IllegalStateException();
                                 }

                                 if(var11 == class_275.field_3216[var12]) {
                                    if(var0 != 0) {
                                       throw new IllegalStateException();
                                    }

                                    if(null != class_168.field_2103[var12]) {
                                       if(var0 != 0) {
                                          throw new IllegalStateException();
                                       }

                                       class_373.method_6614(class_168.field_2103[var12], var32, 8 * var4, 8 * var5, var36, 8 * (var40 & 7), 8 * (var10 & 7), var38, class_206.field_2401, client.field_1475, 305716239);
                                       break;
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }

               class_245.method_4709(true, -1423260224);
               class_46.method_536(-1808857292);
               class_120.method_2266(class_206.field_2401, client.field_1475, -1580902995);
               class_245.method_4709(true, 660381724);
               var32 = class_166.field_2070 * 1752941579;
               if(var32 > class_115.field_1289 * 1115122599) {
                  var32 = class_115.field_1289 * 1115122599;
               }

               if(var32 < 1115122599 * class_115.field_1289 - 1) {
                  var32 = 1115122599 * class_115.field_1289 - 1;
               }

               if(client.field_1417) {
                  if(var0 != 0) {
                     return;
                  }

                  class_206.field_2401.method_4815(class_166.field_2070 * 1752941579);
               } else {
                  class_206.field_2401.method_4815(0);
               }

               for(var4 = 0; var4 < 104; ++var4) {
                  if(var0 != 0) {
                     throw new IllegalStateException();
                  }

                  for(var5 = 0; var5 < 104; ++var5) {
                     class_171.method_3690(var4, var5, (byte)0);
                  }
               }

               class_46.method_536(-1808857292);

               for(class_50 var39 = (class_50)client.field_1574.method_5944(); var39 != null; var39 = (class_50)client.field_1574.method_5972()) {
                  if(-1 == 2028634435 * var39.field_375) {
                     if(var0 != 0) {
                        throw new IllegalStateException();
                     }

                     var39.field_374 = 0;
                     class_189.method_3896(var39, 14093457);
                  } else {
                     var39.method_108();
                  }
               }

               class_87.field_817.method_5074();
               class_40 var41;
               if(class_121.field_1337.method_2439((byte)-45)) {
                  if(var0 != 0) {
                     throw new IllegalStateException();
                  }

                  var41 = class_112.method_2238(class_266.field_3057, client.field_1463.field_2384, (byte)8);
                  var41.field_263.method_116(1057001181, 1744702424);
                  client.field_1463.method_4079(var41, -1805852969);
               }

               if(!client.field_1476) {
                  if(var0 != 0) {
                     throw new IllegalStateException();
                  }

                  var4 = (class_151.field_1910 * 1130183005 - 6) / 8;
                  var5 = (6 + class_151.field_1910 * 1130183005) / 8;
                  var34 = (-845013717 * class_204.field_2387 - 6) / 8;
                  var36 = (-845013717 * class_204.field_2387 + 6) / 8;

                  for(var38 = var4 - 1; var38 <= var5 + 1; ++var38) {
                     if(var0 != 0) {
                        throw new IllegalStateException();
                     }

                     for(var40 = var34 - 1; var40 <= 1 + var36; ++var40) {
                        if(var0 != 0) {
                           throw new IllegalStateException();
                        }

                        if(var38 >= var4) {
                           if(var0 != 0) {
                              throw new IllegalStateException();
                           }

                           if(var38 <= var5) {
                              if(var0 != 0) {
                                 throw new IllegalStateException();
                              }

                              if(var40 >= var34) {
                                 if(var0 != 0) {
                                    throw new IllegalStateException();
                                 }

                                 if(var40 <= var36) {
                                    if(var0 != 0) {
                                       return;
                                    }
                                    continue;
                                 }
                              }
                           }
                        }

                        class_286.field_3275.method_5405("m" + var38 + "_" + var40, (byte)-13);
                        class_286.field_3275.method_5405("l" + var38 + "_" + var40, (byte)-55);
                     }
                  }
               }

               class_53.method_579(30, (byte)0);
               class_46.method_536(-1808857292);
               class_144.method_3081((byte)0);
               var41 = class_112.method_2238(class_266.field_3143, client.field_1463.field_2384, (byte)8);
               client.field_1463.method_4079(var41, -1922743362);
               client.field_1383.method_3950(-1887937791);

               for(var5 = 0; var5 < 32; ++var5) {
                  if(var0 != 0) {
                     throw new IllegalStateException();
                  }

                  client.field_1407[var5] = 0L;
               }

               for(var5 = 0; var5 < 32; ++var5) {
                  if(var0 != 0) {
                     throw new IllegalStateException();
                  }

                  client.field_1386[var5] = 0L;
               }

               class_299.field_3366 = 0;
            }
         }
      } catch (RuntimeException var31) {
         throw class_223.method_4281(var31, "gz.hf(" + ')');
      }
   }

   // $FF: renamed from: <init> () void
   void method_4404() {
      try {
         super.method_4404();
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1, "gz.<init>(" + ')');
      }
   }

   // $FF: renamed from: ba (nd, nd, int, boolean, int) void
   void method_4428(class_28 var1, class_28 var2, int var3, boolean var4, int var5) {
      try {
         this.method_4363(var1, var3, -1928943401);
         int var6 = var2.method_132((byte)-49);
         this.field_2593 = new HashSet(var6);

         int var7;
         for(var7 = 0; var7 < var6; ++var7) {
            if(var5 <= -508707417) {
               return;
            }

            class_228 var10000 = new class_228;
            var10000.method_4298();
            class_228 var8 = var10000;

            try {
               var8.method_4350(var2, 1254081030);
            } catch (IllegalStateException var12) {
               continue;
            }

            this.field_2593.add(var8);
         }

         var7 = var2.method_132((byte)-81);
         this.field_2590 = new HashSet(var7);

         for(int var14 = 0; var14 < var7; ++var14) {
            if(var5 <= -508707417) {
               return;
            }

            class_227 var15 = new class_227;
            var15.method_4298();
            class_227 var9 = var15;

            try {
               var9.method_4348(var2, 1665401809);
            } catch (IllegalStateException var11) {
               continue;
            }

            this.field_2590.add(var9);
         }

         this.method_4434(var2, var4, 1182006206);
      } catch (RuntimeException var13) {
         throw class_223.method_4281(var13, "gz.ba(" + ')');
      }
   }

   // $FF: renamed from: bj (nd, nd, int, boolean) void
   void method_4429(class_28 var1, class_28 var2, int var3, boolean var4) {
      this.method_4363(var1, var3, -1948786332);
      int var5 = var2.method_132((byte)-49);
      this.field_2593 = new HashSet(var5);

      int var6;
      for(var6 = 0; var6 < var5; ++var6) {
         class_228 var10000 = new class_228;
         var10000.method_4298();
         class_228 var7 = var10000;

         try {
            var7.method_4350(var2, 1254081030);
         } catch (IllegalStateException var11) {
            continue;
         }

         this.field_2593.add(var7);
      }

      var6 = var2.method_132((byte)-111);
      this.field_2590 = new HashSet(var6);

      for(int var12 = 0; var12 < var6; ++var12) {
         class_227 var13 = new class_227;
         var13.method_4298();
         class_227 var8 = var13;

         try {
            var8.method_4348(var2, 1119048660);
         } catch (IllegalStateException var10) {
            continue;
         }

         this.field_2590.add(var8);
      }

      this.method_4434(var2, var4, -976961084);
   }

   // $FF: renamed from: bx (nd, nd, int, boolean) void
   void method_4430(class_28 var1, class_28 var2, int var3, boolean var4) {
      this.method_4363(var1, var3, -1955589150);
      int var5 = var2.method_132((byte)-41);
      this.field_2593 = new HashSet(var5);

      int var6;
      for(var6 = 0; var6 < var5; ++var6) {
         class_228 var10000 = new class_228;
         var10000.method_4298();
         class_228 var7 = var10000;

         try {
            var7.method_4350(var2, 1254081030);
         } catch (IllegalStateException var11) {
            continue;
         }

         this.field_2593.add(var7);
      }

      var6 = var2.method_132((byte)-5);
      this.field_2590 = new HashSet(var6);

      for(int var12 = 0; var12 < var6; ++var12) {
         class_227 var13 = new class_227;
         var13.method_4298();
         class_227 var8 = var13;

         try {
            var8.method_4348(var2, -1327270592);
         } catch (IllegalStateException var10) {
            continue;
         }

         this.field_2590.add(var8);
      }

      this.method_4434(var2, var4, -1845506801);
   }

   // $FF: renamed from: bp (nd, nd, int, boolean) void
   void method_4431(class_28 var1, class_28 var2, int var3, boolean var4) {
      this.method_4363(var1, var3, -2007496695);
      int var5 = var2.method_132((byte)-28);
      this.field_2593 = new HashSet(var5);

      int var6;
      for(var6 = 0; var6 < var5; ++var6) {
         class_228 var10000 = new class_228;
         var10000.method_4298();
         class_228 var7 = var10000;

         try {
            var7.method_4350(var2, 1254081030);
         } catch (IllegalStateException var11) {
            continue;
         }

         this.field_2593.add(var7);
      }

      var6 = var2.method_132((byte)-70);
      this.field_2590 = new HashSet(var6);

      for(int var12 = 0; var12 < var6; ++var12) {
         class_227 var13 = new class_227;
         var13.method_4298();
         class_227 var8 = var13;

         try {
            var8.method_4348(var2, 599177859);
         } catch (IllegalStateException var10) {
            continue;
         }

         this.field_2590.add(var8);
      }

      this.method_4434(var2, var4, 1592872912);
   }

   // $FF: renamed from: bn (nd, boolean) void
   void method_4432(class_28 var1, boolean var2) {
      this.field_2592 = new LinkedList();
      int var3 = var1.method_132((byte)-121);

      for(int var4 = 0; var4 < var3; ++var4) {
         int var5 = var1.method_147(175216334);
         class_280 var10000 = new class_280;
         var10000.method_5163(var1.method_135((byte)-47));
         class_280 var6 = var10000;
         boolean var7 = var1.method_130(-376547559) == 1;
         if(var2 || !var7) {
            List var8 = this.field_2592;
            class_219 var10001 = new class_219;
            var10001.method_4229((class_280)null, var6, var5, (class_237)null);
            var8.add(var10001);
         }
      }

   }

   // $FF: renamed from: bo (nd, boolean) void
   void method_4433(class_28 var1, boolean var2) {
      this.field_2592 = new LinkedList();
      int var3 = var1.method_132((byte)-102);

      for(int var4 = 0; var4 < var3; ++var4) {
         int var5 = var1.method_147(821647098);
         class_280 var10000 = new class_280;
         var10000.method_5163(var1.method_135((byte)-65));
         class_280 var6 = var10000;
         boolean var7 = var1.method_130(9430553) == 1;
         if(var2 || !var7) {
            List var8 = this.field_2592;
            class_219 var10001 = new class_219;
            var10001.method_4229((class_280)null, var6, var5, (class_237)null);
            var8.add(var10001);
         }
      }

   }

   // $FF: renamed from: be (nd, boolean, int) void
   void method_4434(class_28 var1, boolean var2, int var3) {
      try {
         this.field_2592 = new LinkedList();
         int var4 = var1.method_132((byte)-31);

         for(int var5 = 0; var5 < var4; ++var5) {
            if(var3 == -1764619255) {
               throw new IllegalStateException();
            }

            int var6 = var1.method_147(1576289878);
            class_280 var10000 = new class_280;
            var10000.method_5163(var1.method_135((byte)-36));
            class_280 var7 = var10000;
            boolean var10;
            if(var1.method_130(169497240) == 1) {
               if(var3 == -1764619255) {
                  throw new IllegalStateException();
               }

               var10 = true;
            } else {
               var10 = false;
            }

            boolean var8 = var10;
            if(!var2) {
               if(var3 == -1764619255) {
                  throw new IllegalStateException();
               }

               if(var8) {
                  continue;
               }

               if(var3 == -1764619255) {
                  throw new IllegalStateException();
               }
            }

            List var11 = this.field_2592;
            class_219 var10001 = new class_219;
            var10001.method_4229((class_280)null, var7, var6, (class_237)null);
            var11.add(var10001);
         }

      } catch (RuntimeException var9) {
         throw class_223.method_4281(var9, "gz.be(" + ')');
      }
   }

   // $FF: renamed from: j (nd, int, int, int, int, int, int, byte) void
   static final void method_4435(class_28 var0, int var1, int var2, int var3, int var4, int var5, int var6, byte var7) {
      try {
         int var8;
         if(var2 >= 0) {
            if(var7 == 1) {
               throw new IllegalStateException();
            }

            if(var2 < 104 && var3 >= 0) {
               if(var7 == 1) {
                  throw new IllegalStateException();
               }

               if(var3 < 104) {
                  if(var7 == 1) {
                     throw new IllegalStateException();
                  }

                  class_166.field_2069[var1][var2][var3] = 0;

                  while(true) {
                     var8 = var0.method_130(1278486625);
                     if(0 == var8) {
                        if(0 == var1) {
                           if(var7 == 1) {
                              throw new IllegalStateException();
                           }

                           int[] var16 = class_166.field_2078[0][var2];
                           int var12 = var2 + 932731 + var4;
                           int var13 = var5 + var3 + 556238;
                           int var14 = class_43.method_492(var12 + '\ub135', var13 + 91923, 4, -698896598) - 128 + (class_43.method_492(10294 + var12, '\u93bd' + var13, 2, 186574029) - 128 >> 1) + (class_43.method_492(var12, var13, 1, -1058072714) - 128 >> 2);
                           var14 = 35 + (int)((double)var14 * 0.3D);
                           if(var14 < 10) {
                              var14 = 10;
                           } else if(var14 > 60) {
                              if(var7 == 1) {
                                 throw new IllegalStateException();
                              }

                              var14 = 60;
                           }

                           var16[var3] = -var14 * 8;
                        } else {
                           class_166.field_2078[var1][var2][var3] = class_166.field_2078[var1 - 1][var2][var3] - 240;
                        }

                        return;
                     }

                     if(1 == var8) {
                        if(var7 == 1) {
                           throw new IllegalStateException();
                        }

                        int var9 = var0.method_130(-1241223206);
                        if(var9 == 1) {
                           if(var7 == 1) {
                              throw new IllegalStateException();
                           }

                           var9 = 0;
                        }

                        if(0 == var1) {
                           class_166.field_2078[0][var2][var3] = -var9 * 8;
                        } else {
                           class_166.field_2078[var1][var2][var3] = class_166.field_2078[var1 - 1][var2][var3] - var9 * 8;
                        }

                        return;
                     }

                     if(var8 <= 49) {
                        if(var7 == 1) {
                           throw new IllegalStateException();
                        }

                        class_273.field_3195[var1][var2][var3] = var0.method_131((byte)-46);
                        class_52.field_389[var1][var2][var3] = (byte)((var8 - 2) / 4);
                        class_278.field_3226[var1][var2][var3] = (byte)(var8 - 2 + var6 & 3);
                     } else if(var8 <= 81) {
                        if(var7 == 1) {
                           return;
                        }

                        class_166.field_2069[var1][var2][var3] = (byte)(var8 - 49);
                     } else {
                        class_166.field_2071[var1][var2][var3] = (byte)(var8 - 81);
                     }
                  }
               }
            }
         }

         while(true) {
            var8 = var0.method_130(147595042);
            if(var8 == 0) {
               break;
            }

            if(var8 == 1) {
               if(var7 == 1) {
                  throw new IllegalStateException();
               }

               var0.method_130(830496168);
               break;
            }

            if(var8 <= 49) {
               if(var7 == 1) {
                  return;
               }

               var0.method_130(1055755922);
            }
         }

      } catch (RuntimeException var15) {
         throw class_223.method_4281(var15, "gz.j(" + ')');
      }
   }

   // $FF: renamed from: bw (nd, boolean) void
   void method_4436(class_28 var1, boolean var2) {
      this.field_2592 = new LinkedList();
      int var3 = var1.method_132((byte)-79);

      for(int var4 = 0; var4 < var3; ++var4) {
         int var5 = var1.method_147(374015837);
         class_280 var10000 = new class_280;
         var10000.method_5163(var1.method_135((byte)-95));
         class_280 var6 = var10000;
         boolean var7 = var1.method_130(1412148732) == 1;
         if(var2 || !var7) {
            List var8 = this.field_2592;
            class_219 var10001 = new class_219;
            var10001.method_4229((class_280)null, var6, var5, (class_237)null);
            var8.add(var10001);
         }
      }

   }
}
