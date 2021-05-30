import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;

// $FF: renamed from: cv
public class class_179 {

   // $FF: renamed from: er java.lang.String
   static String host;
   // $FF: renamed from: l int
   static final int field_2224 = 7;
   // $FF: renamed from: y int
   static final int field_2225 = 1000;
   // $FF: renamed from: p java.math.BigInteger
   static final BigInteger field_2226;
   // $FF: renamed from: j java.math.BigInteger
   static final BigInteger field_2227;
   // $FF: renamed from: n java.lang.String
   static final String field_2228 = "services";
   // $FF: renamed from: o int
   static final int field_2229 = 2;
   // $FF: renamed from: v java.lang.String
   static final String field_2230 = "m=accountappeal/login.ws";


   // $FF: renamed from: ad (int, cf, boolean, int) int
   static int method_3805(int var0, class_90 var1, boolean var2, int var3) {
      try {
         String var4;
         int var11;
         if(var0 == 4100) {
            var4 = class_165.field_2053[(class_165.field_2054 -= 1647125333) * 1824375293];
            var11 = class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885];
            class_165.field_2053[(class_165.field_2054 += 1647125333) * 1824375293 - 1] = var4 + var11;
            return 1;
         } else {
            String var5;
            if(var0 == 4101) {
               if(var3 >= 2046790876) {
                  throw new IllegalStateException();
               } else {
                  class_165.field_2054 -= -1000716630;
                  var4 = class_165.field_2053[class_165.field_2054 * 1824375293];
                  var5 = class_165.field_2053[class_165.field_2054 * 1824375293 + 1];
                  class_165.field_2053[(class_165.field_2054 += 1647125333) * 1824375293 - 1] = var4 + var5;
                  return 1;
               }
            } else if(4102 == var0) {
               if(var3 >= 2046790876) {
                  throw new IllegalStateException();
               } else {
                  var4 = class_165.field_2053[(class_165.field_2054 -= 1647125333) * 1824375293];
                  var11 = class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885];
                  class_165.field_2053[(class_165.field_2054 += 1647125333) * 1824375293 - 1] = var4 + method_3809(var11, true, (short)7104);
                  return 1;
               }
            } else if(4103 == var0) {
               if(var3 >= 2046790876) {
                  throw new IllegalStateException();
               } else {
                  var4 = class_165.field_2053[(class_165.field_2054 -= 1647125333) * 1824375293];
                  class_165.field_2053[(class_165.field_2054 += 1647125333) * 1824375293 - 1] = var4.toLowerCase();
                  return 1;
               }
            } else {
               int var7;
               int var13;
               if(4104 == var0) {
                  var13 = class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885];
                  long var16 = 86400000L * ((long)var13 + 11745L);
                  class_165.field_2057.setTime(new Date(var16));
                  var7 = class_165.field_2057.get(5);
                  int var18 = class_165.field_2057.get(2);
                  int var9 = class_165.field_2057.get(1);
                  class_165.field_2053[(class_165.field_2054 += 1647125333) * 1824375293 - 1] = var7 + "-" + class_165.field_2060[var18] + "-" + var9;
                  return 1;
               } else if(4105 == var0) {
                  if(var3 >= 2046790876) {
                     throw new IllegalStateException();
                  } else {
                     class_165.field_2054 -= -1000716630;
                     var4 = class_165.field_2053[class_165.field_2054 * 1824375293];
                     var5 = class_165.field_2053[1 + 1824375293 * class_165.field_2054];
                     if(class_164.field_2044.field_1143 != null && class_164.field_2044.field_1143.field_3208) {
                        if(var3 >= 2046790876) {
                           throw new IllegalStateException();
                        }

                        class_165.field_2053[(class_165.field_2054 += 1647125333) * 1824375293 - 1] = var5;
                     } else {
                        class_165.field_2053[(class_165.field_2054 += 1647125333) * 1824375293 - 1] = var4;
                     }

                     return 1;
                  }
               } else if(4106 == var0) {
                  if(var3 >= 2046790876) {
                     throw new IllegalStateException();
                  } else {
                     var13 = class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885];
                     class_165.field_2053[(class_165.field_2054 += 1647125333) * 1824375293 - 1] = Integer.toString(var13);
                     return 1;
                  }
               } else if(var0 == 4107) {
                  if(var3 >= 2046790876) {
                     throw new IllegalStateException();
                  } else {
                     class_165.field_2054 -= -1000716630;
                     class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = class_184.method_3853(class_284.method_5189(class_165.field_2053[class_165.field_2054 * 1824375293], class_165.field_2053[1 + 1824375293 * class_165.field_2054], class_387.field_4226, 61619413), -1839553264);
                     return 1;
                  }
               } else {
                  int var6;
                  byte[] var15;
                  class_69 var17;
                  class_69 var19;
                  if(var0 == 4108) {
                     if(var3 >= 2046790876) {
                        throw new IllegalStateException();
                     } else {
                        var4 = class_165.field_2053[(class_165.field_2054 -= 1647125333) * 1824375293];
                        class_136.field_1752 -= 2119512838;
                        var11 = class_165.field_2052[-26460885 * class_136.field_1752];
                        var6 = class_165.field_2052[class_136.field_1752 * -26460885 + 1];
                        var15 = class_148.field_1869.method_5381(var6, 0, -26460885);
                        var19 = new class_69(var15);
                        var17 = var19;
                        class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = var17.method_867(var4, var11);
                        return 1;
                     }
                  } else if(4109 == var0) {
                     if(var3 >= 2046790876) {
                        throw new IllegalStateException();
                     } else {
                        var4 = class_165.field_2053[(class_165.field_2054 -= 1647125333) * 1824375293];
                        class_136.field_1752 -= 2119512838;
                        var11 = class_165.field_2052[-26460885 * class_136.field_1752];
                        var6 = class_165.field_2052[1 + -26460885 * class_136.field_1752];
                        var15 = class_148.field_1869.method_5381(var6, 0, -26460885);
                        var19 = new class_69(var15);
                        var17 = var19;
                        class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = var17.method_866(var4, var11);
                        return 1;
                     }
                  } else if(var0 == 4110) {
                     if(var3 >= 2046790876) {
                        throw new IllegalStateException();
                     } else {
                        class_165.field_2054 -= -1000716630;
                        var4 = class_165.field_2053[class_165.field_2054 * 1824375293];
                        var5 = class_165.field_2053[1824375293 * class_165.field_2054 + 1];
                        if(class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885] == 1) {
                           class_165.field_2053[(class_165.field_2054 += 1647125333) * 1824375293 - 1] = var4;
                        } else {
                           class_165.field_2053[(class_165.field_2054 += 1647125333) * 1824375293 - 1] = var5;
                        }

                        return 1;
                     }
                  } else if(4111 == var0) {
                     if(var3 >= 2046790876) {
                        throw new IllegalStateException();
                     } else {
                        var4 = class_165.field_2053[(class_165.field_2054 -= 1647125333) * 1824375293];
                        class_165.field_2053[(class_165.field_2054 += 1647125333) * 1824375293 - 1] = class_68.method_868(var4);
                        return 1;
                     }
                  } else if(var0 == 4112) {
                     var4 = class_165.field_2053[(class_165.field_2054 -= 1647125333) * 1824375293];
                     var11 = class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885];
                     class_165.field_2053[(class_165.field_2054 += 1647125333) * 1824375293 - 1] = var4 + (char)var11;
                     return 1;
                  } else {
                     int[] var10000;
                     int var10001;
                     byte var10002;
                     if(4113 == var0) {
                        if(var3 >= 2046790876) {
                           throw new IllegalStateException();
                        } else {
                           var13 = class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885];
                           var10000 = class_165.field_2052;
                           var10001 = (class_136.field_1752 += -1087727229) * -26460885 - 1;
                           if(class_279.method_5152((char)var13, 2146522147)) {
                              if(var3 >= 2046790876) {
                                 throw new IllegalStateException();
                              }

                              var10002 = 1;
                           } else {
                              var10002 = 0;
                           }

                           var10000[var10001] = var10002;
                           return 1;
                        }
                     } else if(var0 == 4114) {
                        if(var3 >= 2046790876) {
                           throw new IllegalStateException();
                        } else {
                           var13 = class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885];
                           var10000 = class_165.field_2052;
                           var10001 = (class_136.field_1752 += -1087727229) * -26460885 - 1;
                           if(class_177.method_3795((char)var13, 1338737271)) {
                              if(var3 >= 2046790876) {
                                 throw new IllegalStateException();
                              }

                              var10002 = 1;
                           } else {
                              var10002 = 0;
                           }

                           var10000[var10001] = var10002;
                           return 1;
                        }
                     } else if(var0 == 4115) {
                        if(var3 >= 2046790876) {
                           throw new IllegalStateException();
                        } else {
                           var13 = class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885];
                           var10000 = class_165.field_2052;
                           var10001 = (class_136.field_1752 += -1087727229) * -26460885 - 1;
                           if(class_75.method_1130((char)var13, (short)-28639)) {
                              if(var3 >= 2046790876) {
                                 throw new IllegalStateException();
                              }

                              var10002 = 1;
                           } else {
                              var10002 = 0;
                           }

                           var10000[var10001] = var10002;
                           return 1;
                        }
                     } else if(4116 == var0) {
                        var13 = class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885];
                        var10000 = class_165.field_2052;
                        var10001 = (class_136.field_1752 += -1087727229) * -26460885 - 1;
                        if(class_184.method_3852((char)var13, (byte)-32)) {
                           if(var3 >= 2046790876) {
                              throw new IllegalStateException();
                           }

                           var10002 = 1;
                        } else {
                           var10002 = 0;
                        }

                        var10000[var10001] = var10002;
                        return 1;
                     } else if(var0 == 4117) {
                        var4 = class_165.field_2053[(class_165.field_2054 -= 1647125333) * 1824375293];
                        if(var4 != null) {
                           class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = var4.length();
                        } else {
                           class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = 0;
                        }

                        return 1;
                     } else if(4118 == var0) {
                        if(var3 >= 2046790876) {
                           throw new IllegalStateException();
                        } else {
                           var4 = class_165.field_2053[(class_165.field_2054 -= 1647125333) * 1824375293];
                           class_136.field_1752 -= 2119512838;
                           var11 = class_165.field_2052[-26460885 * class_136.field_1752];
                           var6 = class_165.field_2052[1 + -26460885 * class_136.field_1752];
                           class_165.field_2053[(class_165.field_2054 += 1647125333) * 1824375293 - 1] = var4.substring(var11, var6);
                           return 1;
                        }
                     } else if(var0 == 4119) {
                        if(var3 >= 2046790876) {
                           throw new IllegalStateException();
                        } else {
                           var4 = class_165.field_2053[(class_165.field_2054 -= 1647125333) * 1824375293];
                           StringBuilder var12 = new StringBuilder(var4.length());
                           boolean var14 = false;

                           for(var7 = 0; var7 < var4.length(); ++var7) {
                              if(var3 >= 2046790876) {
                                 throw new IllegalStateException();
                              }

                              char var8 = var4.charAt(var7);
                              if(60 == var8) {
                                 if(var3 >= 2046790876) {
                                    throw new IllegalStateException();
                                 }

                                 var14 = true;
                              } else if(var8 == 62) {
                                 if(var3 >= 2046790876) {
                                    throw new IllegalStateException();
                                 }

                                 var14 = false;
                              } else if(!var14) {
                                 if(var3 >= 2046790876) {
                                    throw new IllegalStateException();
                                 }

                                 var12.append(var8);
                              }
                           }

                           class_165.field_2053[(class_165.field_2054 += 1647125333) * 1824375293 - 1] = var12.toString();
                           return 1;
                        }
                     } else if(var0 == 4120) {
                        if(var3 >= 2046790876) {
                           throw new IllegalStateException();
                        } else {
                           var4 = class_165.field_2053[(class_165.field_2054 -= 1647125333) * 1824375293];
                           var11 = class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885];
                           class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = var4.indexOf(var11);
                           return 1;
                        }
                     } else if(4121 == var0) {
                        if(var3 >= 2046790876) {
                           throw new IllegalStateException();
                        } else {
                           class_165.field_2054 -= -1000716630;
                           var4 = class_165.field_2053[1824375293 * class_165.field_2054];
                           var5 = class_165.field_2053[1 + class_165.field_2054 * 1824375293];
                           var6 = class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885];
                           class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = var4.indexOf(var5, var6);
                           return 1;
                        }
                     } else if(var0 == 4122) {
                        var4 = class_165.field_2053[(class_165.field_2054 -= 1647125333) * 1824375293];
                        class_165.field_2053[(class_165.field_2054 += 1647125333) * 1824375293 - 1] = var4.toUpperCase();
                        return 1;
                     } else {
                        return 2;
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var10) {
         throw class_223.method_4281(var10, "cv.ad(" + ')');
      }
   }

   // $FF: renamed from: <clinit> () void
   static {
      field_2226 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");
      field_2227 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");
   }

   // $FF: renamed from: n (java.lang.String) boolean
   static boolean method_3807(String var0) {
      if(var0 == null) {
         return false;
      } else {
         try {
            new URL(var0);
            return true;
         } catch (MalformedURLException var2) {
            return false;
         }
      }
   }

   // $FF: renamed from: f (java.lang.String) boolean
   static boolean method_3808(String var0) {
      if(var0 == null) {
         return false;
      } else {
         try {
            new URL(var0);
            return true;
         } catch (MalformedURLException var2) {
            return false;
         }
      }
   }

   // $FF: renamed from: j (int, boolean, short) java.lang.String
   public static String method_3809(int var0, boolean var1, short var2) {
      try {
         if(var1) {
            if(var2 != 7104) {
               throw new IllegalStateException();
            }

            if(var0 >= 0) {
               return class_90.method_1604(var0, 10, var1, (byte)-128);
            }

            if(var2 != 7104) {
               throw new IllegalStateException();
            }
         }

         return Integer.toString(var0);
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3, "cv.j(" + ')');
      }
   }

   // $FF: renamed from: l (int) void
   public static final void method_3810(int var0) {
      try {
         class_255.field_2876 = false;
         class_255.field_2882 = 0;
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1, "cv.l(" + ')');
      }
   }

   // $FF: renamed from: <init> () void
   class_179() throws Throwable {
      super();
      try {
         throw new Error();
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1, "cv.<init>(" + ')');
      }
   }
}
