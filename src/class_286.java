
// $FF: renamed from: is
public class class_286 {

   // $FF: renamed from: dt jp
   static class_307 field_3275;
   // $FF: renamed from: ax int
   static final int field_3276 = 40;


   // $FF: renamed from: ae (int) boolean
   public static boolean method_5251(int var0) {
      return (var0 >> 30 & 1) != 0;
   }

   // $FF: renamed from: ab (int) boolean
   public static boolean method_5252(int var0) {
      return 0 != (var0 >> 31 & 1);
   }

   // $FF: renamed from: d (int, int) boolean
   public static boolean method_5253(int var0, int var1) {
      return (var0 >> var1 + 1 & 1) != 0;
   }

   // $FF: renamed from: m (int) boolean
   public static boolean method_5254(int var0) {
      return (var0 >> 20 & 1) != 0;
   }

   // $FF: renamed from: u (int) int
   public static int method_5255(int var0) {
      return var0 >> 11 & 63;
   }

   // $FF: renamed from: l (int) int
   public static int method_5256(int var0) {
      return var0 >> 11 & 63;
   }

   // $FF: renamed from: o (int) int
   public static int method_5257(int var0) {
      return var0 >> 11 & 63;
   }

   // $FF: renamed from: a (int) boolean
   public static boolean method_5258(int var0) {
      return (var0 >> 20 & 1) != 0;
   }

   // $FF: renamed from: e (int) int
   public static int method_5259(int var0) {
      return var0 >> 17 & 7;
   }

   // $FF: renamed from: g (int) int
   public static int method_5260(int var0) {
      return var0 >> 17 & 7;
   }

   // $FF: renamed from: hd (int, int, int, int, int, int, int, int) void
   static final void method_5261(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      try {
         if(var2 >= 1) {
            if(var7 >= -1299859019) {
               throw new IllegalStateException();
            }

            if(var3 >= 1 && var2 <= 102 && var3 <= 102) {
               if(var7 >= -1299859019) {
                  return;
               }

               if(client.field_1417 && var0 != 1115122599 * class_115.field_1289) {
                  if(var7 >= -1299859019) {
                     throw new IllegalStateException();
                  }

                  return;
               }

               long var8 = 0L;
               boolean var10 = true;
               boolean var11 = false;
               boolean var12 = false;
               if(var1 == 0) {
                  if(var7 >= -1299859019) {
                     return;
                  }

                  var8 = class_206.field_2401.method_4749(var0, var2, var3);
               }

               if(1 == var1) {
                  if(var7 >= -1299859019) {
                     throw new IllegalStateException();
                  }

                  var8 = class_206.field_2401.method_4750(var0, var2, var3);
               }

               if(2 == var1) {
                  if(var7 >= -1299859019) {
                     return;
                  }

                  var8 = class_206.field_2401.method_4818(var0, var2, var3);
               }

               if(3 == var1) {
                  if(var7 >= -1299859019) {
                     throw new IllegalStateException();
                  }

                  var8 = class_206.field_2401.method_4752(var0, var2, var3);
               }

               int var13;
               if(0L != var8) {
                  if(var7 >= -1299859019) {
                     throw new IllegalStateException();
                  }

                  var13 = class_206.field_2401.method_4753(var0, var2, var3, var8);
                  int var16 = class_164.method_3425(var8);
                  int var17 = var13 & 31;
                  int var18 = var13 >> 6 & 3;
                  class_87 var14;
                  if(0 == var1) {
                     class_206.field_2401.method_4740(var0, var2, var3);
                     var14 = class_121.method_2269(var16, 1936930829);
                     if(0 != 1384594797 * var14.field_818) {
                        if(var7 >= -1299859019) {
                           throw new IllegalStateException();
                        }

                        client.field_1475[var0].method_4615(var2, var3, var17, var18, var14.field_837, 2020526331);
                     }
                  }

                  if(1 == var1) {
                     class_206.field_2401.method_4741(var0, var2, var3);
                  }

                  if(2 == var1) {
                     label189: {
                        if(var7 >= -1299859019) {
                           throw new IllegalStateException();
                        }

                        class_206.field_2401.method_4808(var0, var2, var3);
                        var14 = class_121.method_2269(var16, 213584699);
                        if(-288612135 * var14.field_839 + var2 <= 103) {
                           if(var7 >= -1299859019) {
                              throw new IllegalStateException();
                           }

                           if(var14.field_839 * -288612135 + var3 <= 103) {
                              if(var7 >= -1299859019) {
                                 throw new IllegalStateException();
                              }

                              if(var2 + -1812944985 * var14.field_851 <= 103) {
                                 if(var7 >= -1299859019) {
                                    throw new IllegalStateException();
                                 }

                                 if(var14.field_851 * -1812944985 + var3 <= 103) {
                                    if(var14.field_818 * 1384594797 != 0) {
                                       if(var7 >= -1299859019) {
                                          throw new IllegalStateException();
                                       }

                                       client.field_1475[var0].method_4616(var2, var3, -288612135 * var14.field_839, -1812944985 * var14.field_851, var18, var14.field_837, 1639638094);
                                    }
                                    break label189;
                                 }
                              }
                           }
                        }

                        return;
                     }
                  }

                  if(3 == var1) {
                     if(var7 >= -1299859019) {
                        return;
                     }

                     class_206.field_2401.method_4743(var0, var2, var3);
                     var14 = class_121.method_2269(var16, 804781776);
                     if(1384594797 * var14.field_818 == 1) {
                        if(var7 >= -1299859019) {
                           return;
                        }

                        client.field_1475[var0].method_4608(var2, var3, -118708245);
                     }
                  }
               }

               if(var4 >= 0) {
                  var13 = var0;
                  if(var0 < 3) {
                     if(var7 >= -1299859019) {
                        return;
                     }

                     if(2 == (class_166.field_2069[1][var2][var3] & 2)) {
                        if(var7 >= -1299859019) {
                           throw new IllegalStateException();
                        }

                        var13 = var0 + 1;
                     }
                  }

                  class_141.method_3050(var0, var13, var2, var3, var4, var5, var6, class_206.field_2401, client.field_1475[var0], (byte)85);
               }
            }
         }

      } catch (RuntimeException var15) {
         throw class_223.method_4281(var15, "is.hd(" + ')');
      }
   }

   // $FF: renamed from: k (int) boolean
   public static boolean method_5262(int var0) {
      return (var0 >> 20 & 1) != 0;
   }

   // $FF: renamed from: al (int) boolean
   public static boolean method_5263(int var0) {
      return 0 != (var0 >> 31 & 1);
   }

   // $FF: renamed from: x (int) boolean
   public static boolean method_5264(int var0) {
      return (var0 >> 20 & 1) != 0;
   }

   // $FF: renamed from: z (int) boolean
   public static boolean method_5265(int var0) {
      return (var0 >> 20 & 1) != 0;
   }

   // $FF: renamed from: w (int) boolean
   public static boolean method_5266(int var0) {
      return (var0 >> 29 & 1) != 0;
   }

   // $FF: renamed from: t (int) boolean
   public static boolean method_5267(int var0) {
      return (var0 >> 29 & 1) != 0;
   }

   // $FF: renamed from: h (int) boolean
   public static boolean method_5268(int var0) {
      return (var0 >> 29 & 1) != 0;
   }

   // $FF: renamed from: q (int) boolean
   public static boolean method_5269(int var0) {
      return (var0 >> 30 & 1) != 0;
   }

   // $FF: renamed from: i (int) boolean
   public static boolean method_5270(int var0) {
      return (var0 >> 30 & 1) != 0;
   }

   // $FF: renamed from: s (int, int) boolean
   public static boolean method_5271(int var0, int var1) {
      return (var0 >> var1 + 1 & 1) != 0;
   }

   // $FF: renamed from: ap (int) boolean
   public static boolean method_5272(int var0) {
      return 0 != (var0 >> 31 & 1);
   }

   // $FF: renamed from: b (int, int) boolean
   public static boolean method_5273(int var0, int var1) {
      return (var0 >> var1 + 1 & 1) != 0;
   }

   // $FF: renamed from: <init> () void
   void method_5274() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1, "is.<init>(" + ')');
      }
   }

   // $FF: renamed from: c (int) int
   public static int method_5275(int var0) {
      return var0 >> 17 & 7;
   }
}
