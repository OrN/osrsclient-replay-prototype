
// $FF: renamed from: ae
public class class_126 extends class_111 {

   // $FF: renamed from: v long
   long field_1366;
   // $FF: renamed from: n java.lang.String
   String field_1367;
   // $FF: renamed from: f int
   int field_1368;
   // $FF: renamed from: k l
   static class_171 field_1369;
   // $FF: renamed from: ac oe
   public static class_142 field_1370;
   // $FF: renamed from: r java.lang.String
   public static final String field_1371 = "main_file_cache.dat2";
   // $FF: synthetic field
   final class_167 this$0;
   // $FF: renamed from: o bh
   static class_3 field_1372;
   // $FF: renamed from: s int
   static final int field_1373 = 16777215;


   // $FF: renamed from: n (l, byte) void
   void method_2232(class_171 var1, byte var2) {
      try {
         var1.method_3641(1552499431731106411L * this.field_1366, this.field_1367, -1135955153 * this.field_1368, 965862752);
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3, "ae.n(" + ')');
      }
   }

   // $FF: renamed from: p (l) void
   void method_2230(class_171 var1) {
      var1.method_3641(1552499431731106411L * this.field_1366, this.field_1367, 1005365475 * this.field_1368, 965862752);
   }

   // $FF: renamed from: v (nd, int) void
   void method_2231(class_28 var1, int var2) {
      try {
         if(var1.method_130(584285795) != 255) {
            if(var2 >= -24934327) {
               throw new IllegalStateException();
            }

            var1.field_15 -= -1025691571;
            this.field_1366 = var1.method_136(849910691) * 562247036214512195L;
         }

         this.field_1367 = var1.method_347(-47631958);
         this.field_1368 = var1.method_132((byte)-46) * -707431473;
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3, "ae.v(" + ')');
      }
   }

   // $FF: renamed from: f (nd) void
   void method_2234(class_28 var1) {
      if(var1.method_130(495260796) != -1730927792) {
         var1.field_15 -= -1025691571;
         this.field_1366 = var1.method_136(971400564) * 562247036214512195L;
      }

      this.field_1367 = var1.method_347(-1790620980);
      this.field_1368 = var1.method_132((byte)-59) * -707431473;
   }

   // $FF: renamed from: y (nd) void
   void method_2233(class_28 var1) {
      if(var1.method_130(-756081470) != -1765968671) {
         var1.field_15 -= -1025691571;
         this.field_1366 = var1.method_136(1528992179) * 562247036214512195L;
      }

      this.field_1367 = var1.method_347(-706051404);
      this.field_1368 = var1.method_132((byte)-50) * -707431473;
   }

   // $FF: renamed from: <init> (f) void
   void method_2289(class_167 var1) {
      try {
         this.this$0 = var1;
         super.method_105();
         this.field_1366 = -562247036214512195L;
         this.field_1367 = null;
         this.field_1368 = 0;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "ae.<init>(" + ')');
      }
   }

   // $FF: renamed from: e (int, int, int) int
   static final int method_2290(int var0, int var1, int var2) {
      try {
         if(var0 == -2) {
            if(var2 >= -843166722) {
               throw new IllegalStateException();
            } else {
               return 12345678;
            }
         } else if(var0 == -1) {
            if(var2 >= -843166722) {
               throw new IllegalStateException();
            } else {
               if(var1 < 2) {
                  if(var2 >= -843166722) {
                     throw new IllegalStateException();
                  }

                  var1 = 2;
               } else if(var1 > 126) {
                  if(var2 >= -843166722) {
                     throw new IllegalStateException();
                  }

                  var1 = 126;
               }

               return var1;
            }
         } else {
            var1 = (var0 & 127) * var1 / 128;
            if(var1 < 2) {
               if(var2 >= -843166722) {
                  throw new IllegalStateException();
               }

               var1 = 2;
            } else if(var1 > 126) {
               var1 = 126;
            }

            return (var0 & '\uff80') + var1;
         }
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3, "ae.e(" + ')');
      }
   }

   // $FF: renamed from: i (int, cf, boolean, byte) int
   static int method_2291(int var0, class_90 var1, boolean var2, byte var3) {
      try {
         if(var0 == 3600) {
            if(var3 == 1) {
               throw new IllegalStateException();
            } else {
               if(class_208.field_2413.field_1991 * 1124775275 == 0) {
                  if(var3 == 1) {
                     throw new IllegalStateException();
                  }

                  class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = -2;
               } else if(1 == 1124775275 * class_208.field_2413.field_1991) {
                  if(var3 == 1) {
                     throw new IllegalStateException();
                  }

                  class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = -1;
               } else {
                  class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = class_208.field_2413.field_1994.method_6061(-878563685);
               }

               return 1;
            }
         } else {
            int var9;
            if(3601 == var0) {
               if(var3 == 1) {
                  throw new IllegalStateException();
               } else {
                  var9 = class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885];
                  if(class_208.field_2413.method_3319(1883790130) && var9 >= 0) {
                     if(var3 == 1) {
                        throw new IllegalStateException();
                     }

                     if(var9 < class_208.field_2413.field_1994.method_6061(949807732)) {
                        if(var3 == 1) {
                           throw new IllegalStateException();
                        }

                        class_340 var8 = (class_340)class_208.field_2413.field_1994.method_6071(var9, (byte)-1);
                        class_165.field_2053[(class_165.field_2054 += 1647125333) * 1824375293 - 1] = var8.method_5997((byte)1);
                        class_165.field_2053[(class_165.field_2054 += 1647125333) * 1824375293 - 1] = var8.method_5998(192558419);
                        return 1;
                     }
                  }

                  class_165.field_2053[(class_165.field_2054 += 1647125333) * 1824375293 - 1] = "";
                  class_165.field_2053[(class_165.field_2054 += 1647125333) * 1824375293 - 1] = "";
                  return 1;
               }
            } else if(3602 == var0) {
               if(var3 == 1) {
                  throw new IllegalStateException();
               } else {
                  var9 = class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885];
                  if(class_208.field_2413.method_3319(1807719974) && var9 >= 0 && var9 < class_208.field_2413.field_1994.method_6061(938016885)) {
                     if(var3 == 1) {
                        throw new IllegalStateException();
                     }

                     class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = ((class_339)class_208.field_2413.field_1994.method_6071(var9, (byte)-1)).field_3888 * 1693720149;
                  } else {
                     class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = 0;
                  }

                  return 1;
               }
            } else if(3603 == var0) {
               if(var3 == 1) {
                  throw new IllegalStateException();
               } else {
                  var9 = class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885];
                  if(class_208.field_2413.method_3319(1309486703)) {
                     if(var3 == 1) {
                        throw new IllegalStateException();
                     }

                     if(var9 >= 0) {
                        if(var3 == 1) {
                           throw new IllegalStateException();
                        }

                        if(var9 < class_208.field_2413.field_1994.method_6061(-1368652586)) {
                           if(var3 == 1) {
                              throw new IllegalStateException();
                           }

                           class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = ((class_339)class_208.field_2413.field_1994.method_6071(var9, (byte)-1)).field_3887 * -523203081;
                           return 1;
                        }
                     }
                  }

                  class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = 0;
                  return 1;
               }
            } else {
               String var10;
               if(3604 == var0) {
                  if(var3 == 1) {
                     throw new IllegalStateException();
                  } else {
                     var10 = class_165.field_2053[(class_165.field_2054 -= 1647125333) * 1824375293];
                     int var7 = class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885];
                     class_212.method_4177(var10, var7, 1083454679);
                     return 1;
                  }
               } else if(var0 == 3605) {
                  if(var3 == 1) {
                     throw new IllegalStateException();
                  } else {
                     var10 = class_165.field_2053[(class_165.field_2054 -= 1647125333) * 1824375293];
                     class_208.field_2413.method_3353(var10, -2078408502);
                     return 1;
                  }
               } else if(3606 == var0) {
                  if(var3 == 1) {
                     throw new IllegalStateException();
                  } else {
                     var10 = class_165.field_2053[(class_165.field_2054 -= 1647125333) * 1824375293];
                     class_208.field_2413.method_3330(var10, 752053487);
                     return 1;
                  }
               } else if(3607 == var0) {
                  if(var3 == 1) {
                     throw new IllegalStateException();
                  } else {
                     var10 = class_165.field_2053[(class_165.field_2054 -= 1647125333) * 1824375293];
                     class_208.field_2413.method_3318(var10, (byte)-7);
                     return 1;
                  }
               } else if(var0 == 3608) {
                  if(var3 == 1) {
                     throw new IllegalStateException();
                  } else {
                     var10 = class_165.field_2053[(class_165.field_2054 -= 1647125333) * 1824375293];
                     class_208.field_2413.method_3331(var10, -1893508939);
                     return 1;
                  }
               } else {
                  byte var14;
                  class_160 var10002;
                  class_359 var10003;
                  int var26;
                  int[] var28;
                  if(3609 == var0) {
                     if(var3 == 1) {
                        throw new IllegalStateException();
                     } else {
                        var10 = class_165.field_2053[(class_165.field_2054 -= 1647125333) * 1824375293];
                        var10 = class_122.method_2271(var10, (byte)16);
                        var28 = class_165.field_2052;
                        var26 = (class_136.field_1752 += -1087727229) * -26460885 - 1;
                        var10002 = class_208.field_2413;
                        var10003 = new class_359;
                        var10003.method_6280(var10, class_239.field_2659);
                        if(var10002.method_3324(var10003, false, -1207370332)) {
                           if(var3 == 1) {
                              throw new IllegalStateException();
                           }

                           var14 = 1;
                        } else {
                           var14 = 0;
                        }

                        var28[var26] = var14;
                        return 1;
                     }
                  } else if(3611 == var0) {
                     if(var3 == 1) {
                        throw new IllegalStateException();
                     } else {
                        if(class_233.field_2617 != null) {
                           class_165.field_2053[(class_165.field_2054 += 1647125333) * 1824375293 - 1] = class_233.field_2617.field_3909;
                        } else {
                           class_165.field_2053[(class_165.field_2054 += 1647125333) * 1824375293 - 1] = "";
                        }

                        return 1;
                     }
                  } else if(var0 == 3612) {
                     if(var3 == 1) {
                        throw new IllegalStateException();
                     } else {
                        if(null != class_233.field_2617) {
                           class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = class_233.field_2617.method_6061(1231396388);
                        } else {
                           class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = 0;
                        }

                        return 1;
                     }
                  } else if(3613 == var0) {
                     if(var3 == 1) {
                        throw new IllegalStateException();
                     } else {
                        var9 = class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885];
                        if(null != class_233.field_2617) {
                           if(var3 == 1) {
                              throw new IllegalStateException();
                           }

                           if(var9 < class_233.field_2617.method_6061(872704428)) {
                              if(var3 == 1) {
                                 throw new IllegalStateException();
                              }

                              class_165.field_2053[(class_165.field_2054 += 1647125333) * 1824375293 - 1] = class_233.field_2617.method_6071(var9, (byte)-1).method_5999(1137547802).method_6272(2100767767);
                              return 1;
                           }
                        }

                        class_165.field_2053[(class_165.field_2054 += 1647125333) * 1824375293 - 1] = "";
                        return 1;
                     }
                  } else if(var0 == 3614) {
                     if(var3 == 1) {
                        throw new IllegalStateException();
                     } else {
                        var9 = class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885];
                        if(null != class_233.field_2617) {
                           if(var3 == 1) {
                              throw new IllegalStateException();
                           }

                           if(var9 < class_233.field_2617.method_6061(450079364)) {
                              if(var3 == 1) {
                                 throw new IllegalStateException();
                              }

                              class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = ((class_339)class_233.field_2617.method_6071(var9, (byte)-1)).method_6017(1537988847);
                              return 1;
                           }
                        }

                        class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = 0;
                        return 1;
                     }
                  } else if(var0 == 3615) {
                     if(var3 == 1) {
                        throw new IllegalStateException();
                     } else {
                        var9 = class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885];
                        if(null != class_233.field_2617 && var9 < class_233.field_2617.method_6061(-495026728)) {
                           if(var3 == 1) {
                              throw new IllegalStateException();
                           }

                           class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = ((class_339)class_233.field_2617.method_6071(var9, (byte)-1)).field_3887 * -523203081;
                        } else {
                           class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = 0;
                        }

                        return 1;
                     }
                  } else if(var0 == 3616) {
                     var28 = class_165.field_2052;
                     var26 = (class_136.field_1752 += -1087727229) * -26460885 - 1;
                     byte var23;
                     if(class_233.field_2617 != null) {
                        if(var3 == 1) {
                           throw new IllegalStateException();
                        }

                        var23 = class_233.field_2617.field_3911;
                     } else {
                        var23 = 0;
                     }

                     var28[var26] = var23;
                     return 1;
                  } else if(3617 == var0) {
                     var10 = class_165.field_2053[(class_165.field_2054 -= 1647125333) * 1824375293];
                     class_205.method_4116(var10, 1444494320);
                     return 1;
                  } else if(var0 == 3618) {
                     if(var3 == 1) {
                        throw new IllegalStateException();
                     } else {
                        var28 = class_165.field_2052;
                        var26 = (class_136.field_1752 += -1087727229) * -26460885 - 1;
                        int var19;
                        if(null != class_233.field_2617) {
                           if(var3 == 1) {
                              throw new IllegalStateException();
                           }

                           var19 = -78473377 * class_233.field_2617.field_3912;
                        } else {
                           var19 = 0;
                        }

                        var28[var26] = var19;
                        return 1;
                     }
                  } else if(3619 == var0) {
                     if(var3 == 1) {
                        throw new IllegalStateException();
                     } else {
                        var10 = class_165.field_2053[(class_165.field_2054 -= 1647125333) * 1824375293];
                        class_88.method_1564(var10, (short)-1922);
                        return 1;
                     }
                  } else if(var0 == 3620) {
                     if(var3 == 1) {
                        throw new IllegalStateException();
                     } else {
                        class_131.method_2902((byte)86);
                        return 1;
                     }
                  } else if(3621 == var0) {
                     if(var3 == 1) {
                        throw new IllegalStateException();
                     } else {
                        if(!class_208.field_2413.method_3319(2095092761)) {
                           class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = -1;
                        } else {
                           class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = class_208.field_2413.field_1995.method_6061(224092193);
                        }

                        return 1;
                     }
                  } else if(3622 == var0) {
                     if(var3 == 1) {
                        throw new IllegalStateException();
                     } else {
                        var9 = class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885];
                        if(class_208.field_2413.method_3319(1981421065)) {
                           if(var3 == 1) {
                              throw new IllegalStateException();
                           }

                           if(var9 >= 0 && var9 < class_208.field_2413.field_1995.method_6061(1237960662)) {
                              if(var3 == 1) {
                                 throw new IllegalStateException();
                              }

                              class_342 var5 = (class_342)class_208.field_2413.field_1995.method_6071(var9, (byte)-1);
                              class_165.field_2053[(class_165.field_2054 += 1647125333) * 1824375293 - 1] = var5.method_5997((byte)1);
                              class_165.field_2053[(class_165.field_2054 += 1647125333) * 1824375293 - 1] = var5.method_5998(2057081728);
                              return 1;
                           }
                        }

                        class_165.field_2053[(class_165.field_2054 += 1647125333) * 1824375293 - 1] = "";
                        class_165.field_2053[(class_165.field_2054 += 1647125333) * 1824375293 - 1] = "";
                        return 1;
                     }
                  } else if(var0 == 3623) {
                     if(var3 == 1) {
                        throw new IllegalStateException();
                     } else {
                        var10 = class_165.field_2053[(class_165.field_2054 -= 1647125333) * 1824375293];
                        var10 = class_122.method_2271(var10, (byte)16);
                        var28 = class_165.field_2052;
                        var26 = (class_136.field_1752 += -1087727229) * -26460885 - 1;
                        var10002 = class_208.field_2413;
                        var10003 = new class_359;
                        var10003.method_6280(var10, class_239.field_2659);
                        if(var10002.method_3325(var10003, 279756852)) {
                           if(var3 == 1) {
                              throw new IllegalStateException();
                           }

                           var14 = 1;
                        } else {
                           var14 = 0;
                        }

                        var28[var26] = var14;
                        return 1;
                     }
                  } else if(var0 == 3624) {
                     if(var3 == 1) {
                        throw new IllegalStateException();
                     } else {
                        var9 = class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885];
                        if(null != class_233.field_2617) {
                           if(var3 == 1) {
                              throw new IllegalStateException();
                           }

                           if(var9 < class_233.field_2617.method_6061(-720258229)) {
                              if(var3 == 1) {
                                 throw new IllegalStateException();
                              }

                              if(class_233.field_2617.method_6071(var9, (byte)-1).method_5999(2118629061).equals(class_164.field_2044.field_1148)) {
                                 if(var3 == 1) {
                                    throw new IllegalStateException();
                                 }

                                 class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = 1;
                                 return 1;
                              }
                           }
                        }

                        class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = 0;
                        return 1;
                     }
                  } else if(3625 == var0) {
                     if(var3 == 1) {
                        throw new IllegalStateException();
                     } else {
                        if(class_233.field_2617 != null && class_233.field_2617.field_3906 != null) {
                           if(var3 == 1) {
                              throw new IllegalStateException();
                           }

                           class_165.field_2053[(class_165.field_2054 += 1647125333) * 1824375293 - 1] = class_233.field_2617.field_3906;
                        } else {
                           class_165.field_2053[(class_165.field_2054 += 1647125333) * 1824375293 - 1] = "";
                        }

                        return 1;
                     }
                  } else if(3626 == var0) {
                     if(var3 == 1) {
                        throw new IllegalStateException();
                     } else {
                        var9 = class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885];
                        if(class_233.field_2617 != null) {
                           if(var3 == 1) {
                              throw new IllegalStateException();
                           }

                           if(var9 < class_233.field_2617.method_6061(-1729966006)) {
                              if(var3 == 1) {
                                 throw new IllegalStateException();
                              }

                              if(((class_341)class_233.field_2617.method_6071(var9, (byte)-1)).method_6044(1945487843)) {
                                 if(var3 == 1) {
                                    throw new IllegalStateException();
                                 }

                                 class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = 1;
                                 return 1;
                              }
                           }
                        }

                        class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = 0;
                        return 1;
                     }
                  } else if(3627 == var0) {
                     if(var3 == 1) {
                        throw new IllegalStateException();
                     } else {
                        var9 = class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885];
                        if(null != class_233.field_2617) {
                           if(var3 == 1) {
                              throw new IllegalStateException();
                           }

                           if(var9 < class_233.field_2617.method_6061(-2015939297) && ((class_341)class_233.field_2617.method_6071(var9, (byte)-1)).method_6030(601254132)) {
                              if(var3 == 1) {
                                 throw new IllegalStateException();
                              }

                              class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = 1;
                              return 1;
                           }
                        }

                        class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = 0;
                        return 1;
                     }
                  } else if(var0 == 3628) {
                     class_208.field_2413.field_1994.method_6081(1532221549);
                     return 1;
                  } else {
                     boolean var4;
                     boolean var10000;
                     class_346 var16;
                     class_388 var25;
                     if(3629 == var0) {
                        if(var3 == 1) {
                           throw new IllegalStateException();
                        } else {
                           if(class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885] == 1) {
                              if(var3 == 1) {
                                 throw new IllegalStateException();
                              }

                              var10000 = true;
                           } else {
                              var10000 = false;
                           }

                           var4 = var10000;
                           var16 = class_208.field_2413.field_1994;
                           var25 = new class_388;
                           var25.method_6733(var4);
                           var16.method_6124(var25, 1224360715);
                           return 1;
                        }
                     } else {
                        class_380 var24;
                        if(var0 == 3630) {
                           if(var3 == 1) {
                              throw new IllegalStateException();
                           } else {
                              if(class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885] == 1) {
                                 if(var3 == 1) {
                                    throw new IllegalStateException();
                                 }

                                 var10000 = true;
                              } else {
                                 var10000 = false;
                              }

                              var4 = var10000;
                              var16 = class_208.field_2413.field_1994;
                              var24 = new class_380;
                              var24.method_6672(var4);
                              var16.method_6124(var24, 1224360715);
                              return 1;
                           }
                        } else {
                           class_183 var22;
                           if(3631 == var0) {
                              if(var3 == 1) {
                                 throw new IllegalStateException();
                              } else {
                                 if(class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885] == 1) {
                                    if(var3 == 1) {
                                       throw new IllegalStateException();
                                    }

                                    var10000 = true;
                                 } else {
                                    var10000 = false;
                                 }

                                 var4 = var10000;
                                 var16 = class_208.field_2413.field_1994;
                                 var22 = new class_183;
                                 var22.method_3842(var4);
                                 var16.method_6124(var22, 1224360715);
                                 return 1;
                              }
                           } else {
                              class_204 var21;
                              if(var0 == 3632) {
                                 if(var3 == 1) {
                                    throw new IllegalStateException();
                                 } else {
                                    if(class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885] == 1) {
                                       if(var3 == 1) {
                                          throw new IllegalStateException();
                                       }

                                       var10000 = true;
                                    } else {
                                       var10000 = false;
                                    }

                                    var4 = var10000;
                                    var16 = class_208.field_2413.field_1994;
                                    var21 = new class_204;
                                    var21.method_4103(var4);
                                    var16.method_6124(var21, 1224360715);
                                    return 1;
                                 }
                              } else {
                                 class_189 var20;
                                 if(3633 == var0) {
                                    if(var3 == 1) {
                                       throw new IllegalStateException();
                                    } else {
                                       if(class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885] == 1) {
                                          if(var3 == 1) {
                                             throw new IllegalStateException();
                                          }

                                          var10000 = true;
                                       } else {
                                          var10000 = false;
                                       }

                                       var4 = var10000;
                                       var16 = class_208.field_2413.field_1994;
                                       var20 = new class_189;
                                       var20.method_3897(var4);
                                       var16.method_6124(var20, 1224360715);
                                       return 1;
                                    }
                                 } else {
                                    class_186 var18;
                                    if(var0 == 3634) {
                                       if(var3 == 1) {
                                          throw new IllegalStateException();
                                       } else {
                                          if(class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885] == 1) {
                                             if(var3 == 1) {
                                                throw new IllegalStateException();
                                             }

                                             var10000 = true;
                                          } else {
                                             var10000 = false;
                                          }

                                          var4 = var10000;
                                          var16 = class_208.field_2413.field_1994;
                                          var18 = new class_186;
                                          var18.method_3870(var4);
                                          var16.method_6124(var18, 1224360715);
                                          return 1;
                                       }
                                    } else {
                                       class_188 var17;
                                       if(3635 == var0) {
                                          if(var3 == 1) {
                                             throw new IllegalStateException();
                                          } else {
                                             if(class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885] == 1) {
                                                if(var3 == 1) {
                                                   throw new IllegalStateException();
                                                }

                                                var10000 = true;
                                             } else {
                                                var10000 = false;
                                             }

                                             var4 = var10000;
                                             var16 = class_208.field_2413.field_1994;
                                             var17 = new class_188;
                                             var17.method_3887(var4);
                                             var16.method_6124(var17, 1224360715);
                                             return 1;
                                          }
                                       } else {
                                          class_182 var15;
                                          if(var0 == 3636) {
                                             if(class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885] == 1) {
                                                if(var3 == 1) {
                                                   throw new IllegalStateException();
                                                }

                                                var10000 = true;
                                             } else {
                                                var10000 = false;
                                             }

                                             var4 = var10000;
                                             var16 = class_208.field_2413.field_1994;
                                             var15 = new class_182;
                                             var15.method_3834(var4);
                                             var16.method_6124(var15, 1224360715);
                                             return 1;
                                          } else {
                                             class_187 var13;
                                             if(var0 == 3637) {
                                                if(class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885] == 1) {
                                                   if(var3 == 1) {
                                                      throw new IllegalStateException();
                                                   }

                                                   var10000 = true;
                                                } else {
                                                   var10000 = false;
                                                }

                                                var4 = var10000;
                                                var16 = class_208.field_2413.field_1994;
                                                var13 = new class_187;
                                                var13.method_3879(var4);
                                                var16.method_6124(var13, 1224360715);
                                                return 1;
                                             } else {
                                                class_184 var12;
                                                if(3638 == var0) {
                                                   if(var3 == 1) {
                                                      throw new IllegalStateException();
                                                   } else {
                                                      if(class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885] == 1) {
                                                         if(var3 == 1) {
                                                            throw new IllegalStateException();
                                                         }

                                                         var10000 = true;
                                                      } else {
                                                         var10000 = false;
                                                      }

                                                      var4 = var10000;
                                                      var16 = class_208.field_2413.field_1994;
                                                      var12 = new class_184;
                                                      var12.method_3848(var4);
                                                      var16.method_6124(var12, 1224360715);
                                                      return 1;
                                                   }
                                                } else if(3639 == var0) {
                                                   if(var3 == 1) {
                                                      throw new IllegalStateException();
                                                   } else {
                                                      class_208.field_2413.field_1994.method_6118(1091302386);
                                                      return 1;
                                                   }
                                                } else if(3640 == var0) {
                                                   if(var3 == 1) {
                                                      throw new IllegalStateException();
                                                   } else {
                                                      class_208.field_2413.field_1995.method_6081(1532221549);
                                                      return 1;
                                                   }
                                                } else {
                                                   class_345 var27;
                                                   if(var0 == 3641) {
                                                      if(var3 == 1) {
                                                         throw new IllegalStateException();
                                                      } else {
                                                         if(class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885] == 1) {
                                                            if(var3 == 1) {
                                                               throw new IllegalStateException();
                                                            }

                                                            var10000 = true;
                                                         } else {
                                                            var10000 = false;
                                                         }

                                                         var4 = var10000;
                                                         var27 = class_208.field_2413.field_1995;
                                                         var25 = new class_388;
                                                         var25.method_6733(var4);
                                                         var27.method_6124(var25, 1224360715);
                                                         return 1;
                                                      }
                                                   } else if(var0 == 3642) {
                                                      if(var3 == 1) {
                                                         throw new IllegalStateException();
                                                      } else {
                                                         if(class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885] == 1) {
                                                            if(var3 == 1) {
                                                               throw new IllegalStateException();
                                                            }

                                                            var10000 = true;
                                                         } else {
                                                            var10000 = false;
                                                         }

                                                         var4 = var10000;
                                                         var27 = class_208.field_2413.field_1995;
                                                         var24 = new class_380;
                                                         var24.method_6672(var4);
                                                         var27.method_6124(var24, 1224360715);
                                                         return 1;
                                                      }
                                                   } else if(3643 == var0) {
                                                      if(var3 == 1) {
                                                         throw new IllegalStateException();
                                                      } else {
                                                         class_208.field_2413.field_1995.method_6118(1433978028);
                                                         return 1;
                                                      }
                                                   } else if(var0 == 3644) {
                                                      if(var3 == 1) {
                                                         throw new IllegalStateException();
                                                      } else {
                                                         if(class_233.field_2617 != null) {
                                                            if(var3 == 1) {
                                                               throw new IllegalStateException();
                                                            }

                                                            class_233.field_2617.method_6081(1532221549);
                                                         }

                                                         return 1;
                                                      }
                                                   } else {
                                                      class_344 var11;
                                                      if(3645 == var0) {
                                                         if(class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885] == 1) {
                                                            if(var3 == 1) {
                                                               throw new IllegalStateException();
                                                            }

                                                            var10000 = true;
                                                         } else {
                                                            var10000 = false;
                                                         }

                                                         var4 = var10000;
                                                         if(null != class_233.field_2617) {
                                                            if(var3 == 1) {
                                                               throw new IllegalStateException();
                                                            }

                                                            var11 = class_233.field_2617;
                                                            var25 = new class_388;
                                                            var25.method_6733(var4);
                                                            var11.method_6124(var25, 1224360715);
                                                         }

                                                         return 1;
                                                      } else if(var0 == 3646) {
                                                         if(var3 == 1) {
                                                            throw new IllegalStateException();
                                                         } else {
                                                            if(class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885] == 1) {
                                                               if(var3 == 1) {
                                                                  throw new IllegalStateException();
                                                               }

                                                               var10000 = true;
                                                            } else {
                                                               var10000 = false;
                                                            }

                                                            var4 = var10000;
                                                            if(class_233.field_2617 != null) {
                                                               if(var3 == 1) {
                                                                  throw new IllegalStateException();
                                                               }

                                                               var11 = class_233.field_2617;
                                                               var24 = new class_380;
                                                               var24.method_6672(var4);
                                                               var11.method_6124(var24, 1224360715);
                                                            }

                                                            return 1;
                                                         }
                                                      } else if(var0 == 3647) {
                                                         if(var3 == 1) {
                                                            throw new IllegalStateException();
                                                         } else {
                                                            var4 = class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885] == 1;
                                                            if(null != class_233.field_2617) {
                                                               var11 = class_233.field_2617;
                                                               var22 = new class_183;
                                                               var22.method_3842(var4);
                                                               var11.method_6124(var22, 1224360715);
                                                            }

                                                            return 1;
                                                         }
                                                      } else if(3648 == var0) {
                                                         if(var3 == 1) {
                                                            throw new IllegalStateException();
                                                         } else {
                                                            if(class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885] == 1) {
                                                               if(var3 == 1) {
                                                                  throw new IllegalStateException();
                                                               }

                                                               var10000 = true;
                                                            } else {
                                                               var10000 = false;
                                                            }

                                                            var4 = var10000;
                                                            if(null != class_233.field_2617) {
                                                               if(var3 == 1) {
                                                                  throw new IllegalStateException();
                                                               }

                                                               var11 = class_233.field_2617;
                                                               var21 = new class_204;
                                                               var21.method_4103(var4);
                                                               var11.method_6124(var21, 1224360715);
                                                            }

                                                            return 1;
                                                         }
                                                      } else if(var0 == 3649) {
                                                         if(var3 == 1) {
                                                            throw new IllegalStateException();
                                                         } else {
                                                            if(class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885] == 1) {
                                                               if(var3 == 1) {
                                                                  throw new IllegalStateException();
                                                               }

                                                               var10000 = true;
                                                            } else {
                                                               var10000 = false;
                                                            }

                                                            var4 = var10000;
                                                            if(null != class_233.field_2617) {
                                                               if(var3 == 1) {
                                                                  throw new IllegalStateException();
                                                               }

                                                               var11 = class_233.field_2617;
                                                               var20 = new class_189;
                                                               var20.method_3897(var4);
                                                               var11.method_6124(var20, 1224360715);
                                                            }

                                                            return 1;
                                                         }
                                                      } else if(var0 == 3650) {
                                                         if(class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885] == 1) {
                                                            if(var3 == 1) {
                                                               throw new IllegalStateException();
                                                            }

                                                            var10000 = true;
                                                         } else {
                                                            var10000 = false;
                                                         }

                                                         var4 = var10000;
                                                         if(class_233.field_2617 != null) {
                                                            if(var3 == 1) {
                                                               throw new IllegalStateException();
                                                            }

                                                            var11 = class_233.field_2617;
                                                            var18 = new class_186;
                                                            var18.method_3870(var4);
                                                            var11.method_6124(var18, 1224360715);
                                                         }

                                                         return 1;
                                                      } else if(var0 == 3651) {
                                                         if(var3 == 1) {
                                                            throw new IllegalStateException();
                                                         } else {
                                                            if(class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885] == 1) {
                                                               if(var3 == 1) {
                                                                  throw new IllegalStateException();
                                                               }

                                                               var10000 = true;
                                                            } else {
                                                               var10000 = false;
                                                            }

                                                            var4 = var10000;
                                                            if(class_233.field_2617 != null) {
                                                               if(var3 == 1) {
                                                                  throw new IllegalStateException();
                                                               }

                                                               var11 = class_233.field_2617;
                                                               var17 = new class_188;
                                                               var17.method_3887(var4);
                                                               var11.method_6124(var17, 1224360715);
                                                            }

                                                            return 1;
                                                         }
                                                      } else if(3652 == var0) {
                                                         if(var3 == 1) {
                                                            throw new IllegalStateException();
                                                         } else {
                                                            var4 = class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885] == 1;
                                                            if(class_233.field_2617 != null) {
                                                               if(var3 == 1) {
                                                                  throw new IllegalStateException();
                                                               }

                                                               var11 = class_233.field_2617;
                                                               var15 = new class_182;
                                                               var15.method_3834(var4);
                                                               var11.method_6124(var15, 1224360715);
                                                            }

                                                            return 1;
                                                         }
                                                      } else if(var0 == 3653) {
                                                         if(var3 == 1) {
                                                            throw new IllegalStateException();
                                                         } else {
                                                            if(class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885] == 1) {
                                                               if(var3 == 1) {
                                                                  throw new IllegalStateException();
                                                               }

                                                               var10000 = true;
                                                            } else {
                                                               var10000 = false;
                                                            }

                                                            var4 = var10000;
                                                            if(null != class_233.field_2617) {
                                                               var11 = class_233.field_2617;
                                                               var13 = new class_187;
                                                               var13.method_3879(var4);
                                                               var11.method_6124(var13, 1224360715);
                                                            }

                                                            return 1;
                                                         }
                                                      } else if(3654 == var0) {
                                                         if(var3 == 1) {
                                                            throw new IllegalStateException();
                                                         } else {
                                                            if(class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885] == 1) {
                                                               if(var3 == 1) {
                                                                  throw new IllegalStateException();
                                                               }

                                                               var10000 = true;
                                                            } else {
                                                               var10000 = false;
                                                            }

                                                            var4 = var10000;
                                                            if(class_233.field_2617 != null) {
                                                               if(var3 == 1) {
                                                                  throw new IllegalStateException();
                                                               }

                                                               var11 = class_233.field_2617;
                                                               var12 = new class_184;
                                                               var12.method_3848(var4);
                                                               var11.method_6124(var12, 1224360715);
                                                            }

                                                            return 1;
                                                         }
                                                      } else if(var0 == 3655) {
                                                         if(var3 == 1) {
                                                            throw new IllegalStateException();
                                                         } else {
                                                            if(class_233.field_2617 != null) {
                                                               class_233.field_2617.method_6118(825163038);
                                                            }

                                                            return 1;
                                                         }
                                                      } else {
                                                         class_185 var10001;
                                                         if(3656 == var0) {
                                                            if(var3 == 1) {
                                                               throw new IllegalStateException();
                                                            } else {
                                                               if(class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885] == 1) {
                                                                  if(var3 == 1) {
                                                                     throw new IllegalStateException();
                                                                  }

                                                                  var10000 = true;
                                                               } else {
                                                                  var10000 = false;
                                                               }

                                                               var4 = var10000;
                                                               var16 = class_208.field_2413.field_1994;
                                                               var10001 = new class_185;
                                                               var10001.method_3857(var4);
                                                               var16.method_6124(var10001, 1224360715);
                                                               return 1;
                                                            }
                                                         } else if(var0 == 3657) {
                                                            if(var3 == 1) {
                                                               throw new IllegalStateException();
                                                            } else {
                                                               if(class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885] == 1) {
                                                                  if(var3 == 1) {
                                                                     throw new IllegalStateException();
                                                                  }

                                                                  var10000 = true;
                                                               } else {
                                                                  var10000 = false;
                                                               }

                                                               var4 = var10000;
                                                               if(class_233.field_2617 != null) {
                                                                  if(var3 == 1) {
                                                                     throw new IllegalStateException();
                                                                  }

                                                                  var11 = class_233.field_2617;
                                                                  var10001 = new class_185;
                                                                  var10001.method_3857(var4);
                                                                  var11.method_6124(var10001, 1224360715);
                                                               }

                                                               return 1;
                                                            }
                                                         } else {
                                                            return 2;
                                                         }
                                                      }
                                                   }
                                                }
                                             }
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6, "ae.i(" + ')');
      }
   }

   // $FF: renamed from: a (int, cf, boolean, int) int
   static int method_2292(int var0, class_90 var1, boolean var2, int var3) {
      try {
         class_37 var10000;
         class_37 var4;
         if(var0 != 1927) {
            if(var3 == -625659423) {
               throw new IllegalStateException();
            }

            if(2927 != var0) {
               int var9;
               if(1928 == var0) {
                  if(var2) {
                     if(var3 == -625659423) {
                        throw new IllegalStateException();
                     }

                     var10000 = class_124.field_1357;
                  } else {
                     var10000 = class_165.field_2064;
                  }

                  var4 = var10000;
                  var9 = class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885];
                  if(var9 >= 1) {
                     if(var9 <= 10) {
                        class_382.method_6682(var9, -1722455647 * var4.field_101, 41180389 * var4.field_102, var4.field_229 * 539336237, "", 2062561496);
                        return 1;
                     }

                     if(var3 == -625659423) {
                        throw new IllegalStateException();
                     }
                  }

                  throw new RuntimeException();
               }

               if(var0 == 2928) {
                  if(var3 == -625659423) {
                     throw new IllegalStateException();
                  }

                  class_136.field_1752 -= 1031785609;
                  int var8 = class_165.field_2052[class_136.field_1752 * -26460885];
                  var9 = class_165.field_2052[1 + class_136.field_1752 * -26460885];
                  int var6 = class_165.field_2052[-26460885 * class_136.field_1752 + 2];
                  if(var6 >= 1) {
                     if(var3 == -625659423) {
                        throw new IllegalStateException();
                     }

                     if(var6 <= 10) {
                        class_382.method_6682(var6, var8, var9, class_71.method_1047(var8, 1567541088).field_229 * 539336237, "", -1103601505);
                        return 1;
                     }

                     if(var3 == -625659423) {
                        throw new IllegalStateException();
                     }
                  }

                  throw new RuntimeException();
               }

               return 2;
            }

            if(var3 == -625659423) {
               throw new IllegalStateException();
            }
         }

         if(class_165.field_2063 * 606273051 >= 10) {
            if(var3 == -625659423) {
               throw new IllegalStateException();
            } else {
               throw new RuntimeException();
            }
         } else {
            if(var0 >= 2000) {
               if(var3 == -625659423) {
                  throw new IllegalStateException();
               }

               var4 = class_71.method_1047(class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885], 297636177);
            } else {
               if(var2) {
                  if(var3 == -625659423) {
                     throw new IllegalStateException();
                  }

                  var10000 = class_124.field_1357;
               } else {
                  var10000 = class_165.field_2064;
               }

               var4 = var10000;
            }

            if(var4.field_218 == null) {
               return 0;
            } else {
               class_45 var10 = new class_45;
               var10.method_105();
               class_45 var5 = var10;
               var5.field_332 = var4;
               var5.field_337 = var4.field_218;
               var5.field_340 = -1092501739 * class_165.field_2063 + 1271286415;
               client.field_1576.method_5939(var5);
               return 1;
            }
         }
      } catch (RuntimeException var7) {
         throw class_223.method_4281(var7, "ae.a(" + ')');
      }
   }
}
