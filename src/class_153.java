import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// $FF: renamed from: bn
public class class_153 {

   // $FF: renamed from: ad int
   static final int field_1921 = 1;
   // $FF: renamed from: t gs
   static class_250 field_1922;
   // $FF: renamed from: ab int
   static final int field_1923 = 30;
   // $FF: renamed from: gh int
   static int field_1924;
   // $FF: renamed from: bf op
   static class_66 field_1925;
   // $FF: renamed from: v ki
   static class_323 field_1926;


   // $FF: renamed from: u () boolean
   public static boolean method_3222() {
      class_58 var0 = (class_58)field_1926.method_5700();
      return var0 != null;
   }

   // $FF: renamed from: <clinit> () void
   static void method_3223() {
      class_323 var10000 = new class_323;
      var10000.method_5737();
      field_1926 = var10000;
   }

   // $FF: renamed from: c (nb) void
   public static void method_3224(class_29 var0) {
      class_58 var1 = (class_58)field_1926.method_5700();
      if(var1 != null) {
         int var2 = var0.field_15 * -442398587;
         var0.method_116(var1.field_459 * -848582505, 1799580083);

         for(int var3 = 0; var3 < var1.field_464 * -637285787; ++var3) {
            if(0 != var1.field_457[var3]) {
               var0.method_210(var1.field_457[var3], 303066737);
            } else {
               try {
                  int var4 = var1.field_458[var3];
                  Field var5;
                  int var6;
                  if(var4 == 0) {
                     var5 = var1.field_461[var3];
                     var6 = var5.getInt((Object)null);
                     var0.method_210(0, 303066737);
                     var0.method_116(var6, 311644331);
                  } else if(1 == var4) {
                     var5 = var1.field_461[var3];
                     var5.setInt((Object)null, var1.field_462[var3]);
                     var0.method_210(0, 303066737);
                  } else if(2 == var4) {
                     var5 = var1.field_461[var3];
                     var6 = var5.getModifiers();
                     var0.method_210(0, 303066737);
                     var0.method_116(var6, -2021854579);
                  }

                  Method var22;
                  if(var4 == 3) {
                     var22 = var1.field_463[var3];
                     byte[][] var23 = var1.field_468[var3];
                     Object[] var7 = new Object[var23.length];

                     for(int var8 = 0; var8 < var23.length; ++var8) {
                        ObjectInputStream var9 = new ObjectInputStream(new ByteArrayInputStream(var23[var8]));
                        var7[var8] = var9.readObject();
                     }

                     Object var24 = var22.invoke((Object)null, var7);
                     if(null == var24) {
                        var0.method_210(0, 303066737);
                     } else if(var24 instanceof Number) {
                        var0.method_210(1, 303066737);
                        var0.method_341(((Number)var24).longValue());
                     } else if(var24 instanceof String) {
                        var0.method_210(2, 303066737);
                        var0.method_120((String)var24, -427478981);
                     } else {
                        var0.method_210(4, 303066737);
                     }
                  } else if(4 == var4) {
                     var22 = var1.field_463[var3];
                     var6 = var22.getModifiers();
                     var0.method_210(0, 303066737);
                     var0.method_116(var6, 467300688);
                  }
               } catch (ClassNotFoundException var10) {
                  var0.method_210(-10, 303066737);
               } catch (InvalidClassException var11) {
                  var0.method_210(-11, 303066737);
               } catch (StreamCorruptedException var12) {
                  var0.method_210(-12, 303066737);
               } catch (OptionalDataException var13) {
                  var0.method_210(-13, 303066737);
               } catch (IllegalAccessException var14) {
                  var0.method_210(-14, 303066737);
               } catch (IllegalArgumentException var15) {
                  var0.method_210(-15, 303066737);
               } catch (InvocationTargetException var16) {
                  var0.method_210(-16, 303066737);
               } catch (SecurityException var17) {
                  var0.method_210(-17, 303066737);
               } catch (IOException var18) {
                  var0.method_210(-18, 303066737);
               } catch (NullPointerException var19) {
                  var0.method_210(-19, 303066737);
               } catch (Exception var20) {
                  var0.method_210(-20, 303066737);
               } catch (Throwable var21) {
                  var0.method_210(-21, 303066737);
               }
            }
         }

         var0.method_285(var2, -1065581057);
         var1.method_108();
      }
   }

   // $FF: renamed from: x (nd, int) void
   public static void method_3225(class_28 var0, int var1) {
      class_58 var10000 = new class_58;
      var10000.method_105();
      class_58 var2 = var10000;
      var2.field_464 = var0.method_130(-1729356814) * 1028183917;
      var2.field_459 = var0.method_135((byte)-78) * 534927143;
      var2.field_458 = new int[var2.field_464 * -1599264063];
      var2.field_457 = new int[var2.field_464 * 1763507411];
      var2.field_461 = new Field[var2.field_464 * 508541958];
      var2.field_462 = new int[-637285787 * var2.field_464];
      var2.field_463 = new Method[var2.field_464 * -637285787];
      var2.field_468 = new byte[2038683585 * var2.field_464][][];

      for(int var3 = 0; var3 < var2.field_464 * -637285787; ++var3) {
         try {
            int var4 = var0.method_130(2067772330);
            String var5;
            String var6;
            int var7;
            if(0 != var4 && 1 != var4 && 2 != var4) {
               if(var4 == 3 || var4 == 4) {
                  var5 = var0.method_139(-391631059);
                  var6 = var0.method_139(-391631059);
                  var7 = var0.method_130(-1744063690);
                  String[] var8 = new String[var7];

                  for(int var9 = 0; var9 < var7; ++var9) {
                     var8[var9] = var0.method_139(-391631059);
                  }

                  String var25 = var0.method_139(-391631059);
                  byte[][] var10 = new byte[var7][];
                  int var12;
                  if(var4 == 3) {
                     for(int var11 = 0; var11 < var7; ++var11) {
                        var12 = var0.method_135((byte)-44);
                        var10[var11] = new byte[var12];
                        var0.method_267(var10[var11], 0, var12, 1697003441);
                     }
                  }

                  var2.field_458[var3] = var4;
                  Class[] var26 = new Class[var7];

                  for(var12 = 0; var12 < var7; ++var12) {
                     var26[var12] = class_186.method_3875(var8[var12], -2140396881);
                  }

                  Class var27 = class_186.method_3875(var25, -2128620508);
                  if(class_186.method_3875(var5, -2026374638).getClassLoader() == null) {
                     throw new SecurityException();
                  }

                  Method[] var13 = class_186.method_3875(var5, -1931232122).getDeclaredMethods();
                  Method[] var14 = var13;

                  for(int var15 = 0; var15 < var14.length; ++var15) {
                     Method var16 = var14[var15];
                     if(var16.getName().equals(var6)) {
                        Class[] var17 = var16.getParameterTypes();
                        if(var17.length == var26.length) {
                           boolean var18 = true;

                           for(int var19 = 0; var19 < var26.length; ++var19) {
                              if(var17[var19] != var26[var19]) {
                                 var18 = false;
                                 break;
                              }
                           }

                           if(var18 && var27 == var16.getReturnType()) {
                              var2.field_463[var3] = var16;
                           }
                        }
                     }
                  }

                  var2.field_468[var3] = var10;
               }
            } else {
               var5 = var0.method_139(-391631059);
               var6 = var0.method_139(-391631059);
               var7 = 0;
               if(var4 == 1) {
                  var7 = var0.method_135((byte)-103);
               }

               var2.field_458[var3] = var4;
               var2.field_462[var3] = var7;
               if(class_186.method_3875(var5, -2122543037).getClassLoader() == null) {
                  throw new SecurityException();
               }

               var2.field_461[var3] = class_186.method_3875(var5, -2101396137).getDeclaredField(var6);
            }
         } catch (ClassNotFoundException var20) {
            var2.field_457[var3] = -1;
         } catch (SecurityException var21) {
            var2.field_457[var3] = -2;
         } catch (NullPointerException var22) {
            var2.field_457[var3] = 516101013;
         } catch (Exception var23) {
            var2.field_457[var3] = -4;
         } catch (Throwable var24) {
            var2.field_457[var3] = -5;
         }
      }

      field_1926.method_5697(var2);
   }

   // $FF: renamed from: s (int, int) gd
   static class_71 method_3226(int var0, int var1) {
      try {
         class_71 var2 = (class_71)class_72.field_566.method_5065((long)var0);
         if(null != var2) {
            if(var1 >= -428987033) {
               throw new IllegalStateException();
            } else {
               return var2;
            }
         } else {
            class_306 var4 = class_72.field_579;
            class_306 var5 = class_72.field_564;
            boolean var6 = true;
            int[] var7 = var4.method_5392(var0, (byte)8);

            for(int var8 = 0; var8 < var7.length; ++var8) {
               if(var1 >= -428987033) {
                  throw new IllegalStateException();
               }

               byte[] var9 = var4.method_5418(var0, var7[var8], 791709889);
               if(var9 == null) {
                  if(var1 >= -428987033) {
                     throw new IllegalStateException();
                  }

                  var6 = false;
               } else {
                  int var10 = (var9[0] & 255) << 8 | var9[1] & 255;
                  byte[] var11 = var5.method_5418(var10, 0, 791709889);
                  if(var11 == null) {
                     if(var1 >= -428987033) {
                        throw new IllegalStateException();
                     }

                     var6 = false;
                  }
               }
            }

            class_71 var3;
            if(!var6) {
               if(var1 >= -428987033) {
                  throw new IllegalStateException();
               }

               var3 = null;
            } else {
               try {
                  class_71 var10000 = new class_71;
                  var10000.method_1046(var4, var5, var0, false);
                  var3 = var10000;
               } catch (Exception var12) {
                  var3 = null;
               }
            }

            if(null != var3) {
               class_72.field_566.method_5064(var3, (long)var0);
            }

            return var3;
         }
      } catch (RuntimeException var13) {
         throw class_223.method_4281(var13, "bn.s(" + ')');
      }
   }

   // $FF: renamed from: d () void
   public static void method_3227() {
      class_323 var10000 = new class_323;
      var10000.method_5737();
      field_1926 = var10000;
   }

   // $FF: renamed from: s () void
   public static void method_3228() {
      class_323 var10000 = new class_323;
      var10000.method_5737();
      field_1926 = var10000;
   }

   // $FF: renamed from: e (nb) void
   public static void method_3229(class_29 var0) {
      class_58 var1 = (class_58)field_1926.method_5700();
      if(var1 != null) {
         int var2 = var0.field_15 * -442398587;
         var0.method_116(var1.field_459 * 1194906404, -57071738);

         for(int var3 = 0; var3 < var1.field_464 * -1651654103; ++var3) {
            if(0 != var1.field_457[var3]) {
               var0.method_210(var1.field_457[var3], 303066737);
            } else {
               try {
                  int var4 = var1.field_458[var3];
                  Field var5;
                  int var6;
                  if(var4 == 0) {
                     var5 = var1.field_461[var3];
                     var6 = var5.getInt((Object)null);
                     var0.method_210(0, 303066737);
                     var0.method_116(var6, -655052603);
                  } else if(1 == var4) {
                     var5 = var1.field_461[var3];
                     var5.setInt((Object)null, var1.field_462[var3]);
                     var0.method_210(0, 303066737);
                  } else if(2 == var4) {
                     var5 = var1.field_461[var3];
                     var6 = var5.getModifiers();
                     var0.method_210(0, 303066737);
                     var0.method_116(var6, -772700582);
                  }

                  Method var22;
                  if(var4 == 3) {
                     var22 = var1.field_463[var3];
                     byte[][] var23 = var1.field_468[var3];
                     Object[] var7 = new Object[var23.length];

                     for(int var8 = 0; var8 < var23.length; ++var8) {
                        ObjectInputStream var9 = new ObjectInputStream(new ByteArrayInputStream(var23[var8]));
                        var7[var8] = var9.readObject();
                     }

                     Object var24 = var22.invoke((Object)null, var7);
                     if(null == var24) {
                        var0.method_210(0, 303066737);
                     } else if(var24 instanceof Number) {
                        var0.method_210(1, 303066737);
                        var0.method_341(((Number)var24).longValue());
                     } else if(var24 instanceof String) {
                        var0.method_210(2, 303066737);
                        var0.method_120((String)var24, -427478981);
                     } else {
                        var0.method_210(4, 303066737);
                     }
                  } else if(4 == var4) {
                     var22 = var1.field_463[var3];
                     var6 = var22.getModifiers();
                     var0.method_210(0, 303066737);
                     var0.method_116(var6, -248114221);
                  }
               } catch (ClassNotFoundException var10) {
                  var0.method_210(-10, 303066737);
               } catch (InvalidClassException var11) {
                  var0.method_210(-11, 303066737);
               } catch (StreamCorruptedException var12) {
                  var0.method_210(-12, 303066737);
               } catch (OptionalDataException var13) {
                  var0.method_210(-13, 303066737);
               } catch (IllegalAccessException var14) {
                  var0.method_210(-14, 303066737);
               } catch (IllegalArgumentException var15) {
                  var0.method_210(51321745, 303066737);
               } catch (InvocationTargetException var16) {
                  var0.method_210(-16, 303066737);
               } catch (SecurityException var17) {
                  var0.method_210(-17, 303066737);
               } catch (IOException var18) {
                  var0.method_210(-215525565, 303066737);
               } catch (NullPointerException var19) {
                  var0.method_210(-19, 303066737);
               } catch (Exception var20) {
                  var0.method_210(-20, 303066737);
               } catch (Throwable var21) {
                  var0.method_210(-21, 303066737);
               }
            }
         }

         var0.method_285(var2, -1065581057);
         var1.method_108();
      }
   }

   // $FF: renamed from: l () boolean
   public static boolean method_3230() {
      class_58 var0 = (class_58)field_1926.method_5700();
      return var0 != null;
   }

   // $FF: renamed from: o () boolean
   public static boolean method_3231() {
      class_58 var0 = (class_58)field_1926.method_5700();
      return var0 != null;
   }

   // $FF: renamed from: r () void
   public static void method_3232() {
      class_323 var10000 = new class_323;
      var10000.method_5737();
      field_1926 = var10000;
   }

   // $FF: renamed from: b () void
   public static void method_3233() {
      class_323 var10000 = new class_323;
      var10000.method_5737();
      field_1926 = var10000;
   }

   // $FF: renamed from: g (nd, int) void
   public static void method_3234(class_28 var0, int var1) {
      class_58 var10000 = new class_58;
      var10000.method_105();
      class_58 var2 = var10000;
      var2.field_464 = var0.method_130(-1475003787) * 1028183917;
      var2.field_459 = var0.method_135((byte)-91) * 534927143;
      var2.field_458 = new int[var2.field_464 * -637285787];
      var2.field_457 = new int[var2.field_464 * -637285787];
      var2.field_461 = new Field[var2.field_464 * -637285787];
      var2.field_462 = new int[-1790443720 * var2.field_464];
      var2.field_463 = new Method[var2.field_464 * -637285787];
      var2.field_468 = new byte[1482512135 * var2.field_464][][];

      for(int var3 = 0; var3 < var2.field_464 * 2088220069; ++var3) {
         try {
            int var4 = var0.method_130(-695635583);
            String var5;
            String var6;
            int var7;
            if(0 != var4 && 1 != var4 && 2 != var4) {
               if(var4 == 3 || var4 == 4) {
                  var5 = var0.method_139(-391631059);
                  var6 = var0.method_139(-391631059);
                  var7 = var0.method_130(-1721442429);
                  String[] var8 = new String[var7];

                  for(int var9 = 0; var9 < var7; ++var9) {
                     var8[var9] = var0.method_139(-391631059);
                  }

                  String var25 = var0.method_139(-391631059);
                  byte[][] var10 = new byte[var7][];
                  int var12;
                  if(var4 == 3) {
                     for(int var11 = 0; var11 < var7; ++var11) {
                        var12 = var0.method_135((byte)-38);
                        var10[var11] = new byte[var12];
                        var0.method_267(var10[var11], 0, var12, 1186564209);
                     }
                  }

                  var2.field_458[var3] = var4;
                  Class[] var26 = new Class[var7];

                  for(var12 = 0; var12 < var7; ++var12) {
                     var26[var12] = class_186.method_3875(var8[var12], -1959908684);
                  }

                  Class var27 = class_186.method_3875(var25, -1980252757);
                  if(class_186.method_3875(var5, -2091809200).getClassLoader() == null) {
                     throw new SecurityException();
                  }

                  Method[] var13 = class_186.method_3875(var5, -1931796096).getDeclaredMethods();
                  Method[] var14 = var13;

                  for(int var15 = 0; var15 < var14.length; ++var15) {
                     Method var16 = var14[var15];
                     if(var16.getName().equals(var6)) {
                        Class[] var17 = var16.getParameterTypes();
                        if(var17.length == var26.length) {
                           boolean var18 = true;

                           for(int var19 = 0; var19 < var26.length; ++var19) {
                              if(var17[var19] != var26[var19]) {
                                 var18 = false;
                                 break;
                              }
                           }

                           if(var18 && var27 == var16.getReturnType()) {
                              var2.field_463[var3] = var16;
                           }
                        }
                     }
                  }

                  var2.field_468[var3] = var10;
               }
            } else {
               var5 = var0.method_139(-391631059);
               var6 = var0.method_139(-391631059);
               var7 = 0;
               if(var4 == 1) {
                  var7 = var0.method_135((byte)-7);
               }

               var2.field_458[var3] = var4;
               var2.field_462[var3] = var7;
               if(class_186.method_3875(var5, -1994769789).getClassLoader() == null) {
                  throw new SecurityException();
               }

               var2.field_461[var3] = class_186.method_3875(var5, -1959046094).getDeclaredField(var6);
            }
         } catch (ClassNotFoundException var20) {
            var2.field_457[var3] = -1;
         } catch (SecurityException var21) {
            var2.field_457[var3] = 1816057152;
         } catch (NullPointerException var22) {
            var2.field_457[var3] = -466202383;
         } catch (Exception var23) {
            var2.field_457[var3] = -4;
         } catch (Throwable var24) {
            var2.field_457[var3] = -578104792;
         }
      }

      field_1926.method_5697(var2);
   }

   // $FF: renamed from: a (nd, int) void
   public static void method_3235(class_28 var0, int var1) {
      class_58 var10000 = new class_58;
      var10000.method_105();
      class_58 var2 = var10000;
      var2.field_464 = var0.method_130(1193604166) * 1028183917;
      var2.field_459 = var0.method_135((byte)-56) * 534927143;
      var2.field_458 = new int[var2.field_464 * -637285787];
      var2.field_457 = new int[var2.field_464 * -637285787];
      var2.field_461 = new Field[var2.field_464 * -637285787];
      var2.field_462 = new int[-637285787 * var2.field_464];
      var2.field_463 = new Method[var2.field_464 * -637285787];
      var2.field_468 = new byte[-637285787 * var2.field_464][][];

      for(int var3 = 0; var3 < var2.field_464 * -637285787; ++var3) {
         try {
            int var4 = var0.method_130(690173988);
            String var5;
            String var6;
            int var7;
            if(0 != var4 && 1 != var4 && 2 != var4) {
               if(var4 == 3 || var4 == 4) {
                  var5 = var0.method_139(-391631059);
                  var6 = var0.method_139(-391631059);
                  var7 = var0.method_130(-184367788);
                  String[] var8 = new String[var7];

                  for(int var9 = 0; var9 < var7; ++var9) {
                     var8[var9] = var0.method_139(-391631059);
                  }

                  String var25 = var0.method_139(-391631059);
                  byte[][] var10 = new byte[var7][];
                  int var12;
                  if(var4 == 3) {
                     for(int var11 = 0; var11 < var7; ++var11) {
                        var12 = var0.method_135((byte)-116);
                        var10[var11] = new byte[var12];
                        var0.method_267(var10[var11], 0, var12, 1474541949);
                     }
                  }

                  var2.field_458[var3] = var4;
                  Class[] var26 = new Class[var7];

                  for(var12 = 0; var12 < var7; ++var12) {
                     var26[var12] = class_186.method_3875(var8[var12], -2017290522);
                  }

                  Class var27 = class_186.method_3875(var25, -2086625871);
                  if(class_186.method_3875(var5, -2082981284).getClassLoader() == null) {
                     throw new SecurityException();
                  }

                  Method[] var13 = class_186.method_3875(var5, -2081304124).getDeclaredMethods();
                  Method[] var14 = var13;

                  for(int var15 = 0; var15 < var14.length; ++var15) {
                     Method var16 = var14[var15];
                     if(var16.getName().equals(var6)) {
                        Class[] var17 = var16.getParameterTypes();
                        if(var17.length == var26.length) {
                           boolean var18 = true;

                           for(int var19 = 0; var19 < var26.length; ++var19) {
                              if(var17[var19] != var26[var19]) {
                                 var18 = false;
                                 break;
                              }
                           }

                           if(var18 && var27 == var16.getReturnType()) {
                              var2.field_463[var3] = var16;
                           }
                        }
                     }
                  }

                  var2.field_468[var3] = var10;
               }
            } else {
               var5 = var0.method_139(-391631059);
               var6 = var0.method_139(-391631059);
               var7 = 0;
               if(var4 == 1) {
                  var7 = var0.method_135((byte)-15);
               }

               var2.field_458[var3] = var4;
               var2.field_462[var3] = var7;
               if(class_186.method_3875(var5, -2013483794).getClassLoader() == null) {
                  throw new SecurityException();
               }

               var2.field_461[var3] = class_186.method_3875(var5, -2032864483).getDeclaredField(var6);
            }
         } catch (ClassNotFoundException var20) {
            var2.field_457[var3] = -1;
         } catch (SecurityException var21) {
            var2.field_457[var3] = -2;
         } catch (NullPointerException var22) {
            var2.field_457[var3] = -3;
         } catch (Exception var23) {
            var2.field_457[var3] = -4;
         } catch (Throwable var24) {
            var2.field_457[var3] = -5;
         }
      }

      field_1926.method_5697(var2);
   }

   // $FF: renamed from: k (nd, int) void
   public static void method_3236(class_28 var0, int var1) {
      class_58 var10000 = new class_58;
      var10000.method_105();
      class_58 var2 = var10000;
      var2.field_464 = var0.method_130(-888907623) * 1028183917;
      var2.field_459 = var0.method_135((byte)-44) * 534927143;
      var2.field_458 = new int[var2.field_464 * -637285787];
      var2.field_457 = new int[var2.field_464 * -637285787];
      var2.field_461 = new Field[var2.field_464 * -637285787];
      var2.field_462 = new int[-637285787 * var2.field_464];
      var2.field_463 = new Method[var2.field_464 * -637285787];
      var2.field_468 = new byte[-637285787 * var2.field_464][][];

      for(int var3 = 0; var3 < var2.field_464 * -637285787; ++var3) {
         try {
            int var4 = var0.method_130(-2007516322);
            String var5;
            String var6;
            int var7;
            if(0 != var4 && 1 != var4 && 2 != var4) {
               if(var4 == 3 || var4 == 4) {
                  var5 = var0.method_139(-391631059);
                  var6 = var0.method_139(-391631059);
                  var7 = var0.method_130(-1923783071);
                  String[] var8 = new String[var7];

                  for(int var9 = 0; var9 < var7; ++var9) {
                     var8[var9] = var0.method_139(-391631059);
                  }

                  String var25 = var0.method_139(-391631059);
                  byte[][] var10 = new byte[var7][];
                  int var12;
                  if(var4 == 3) {
                     for(int var11 = 0; var11 < var7; ++var11) {
                        var12 = var0.method_135((byte)-22);
                        var10[var11] = new byte[var12];
                        var0.method_267(var10[var11], 0, var12, 1247763942);
                     }
                  }

                  var2.field_458[var3] = var4;
                  Class[] var26 = new Class[var7];

                  for(var12 = 0; var12 < var7; ++var12) {
                     var26[var12] = class_186.method_3875(var8[var12], -1980116562);
                  }

                  Class var27 = class_186.method_3875(var25, -2002438691);
                  if(class_186.method_3875(var5, -2021059372).getClassLoader() == null) {
                     throw new SecurityException();
                  }

                  Method[] var13 = class_186.method_3875(var5, -1976299963).getDeclaredMethods();
                  Method[] var14 = var13;

                  for(int var15 = 0; var15 < var14.length; ++var15) {
                     Method var16 = var14[var15];
                     if(var16.getName().equals(var6)) {
                        Class[] var17 = var16.getParameterTypes();
                        if(var17.length == var26.length) {
                           boolean var18 = true;

                           for(int var19 = 0; var19 < var26.length; ++var19) {
                              if(var17[var19] != var26[var19]) {
                                 var18 = false;
                                 break;
                              }
                           }

                           if(var18 && var27 == var16.getReturnType()) {
                              var2.field_463[var3] = var16;
                           }
                        }
                     }
                  }

                  var2.field_468[var3] = var10;
               }
            } else {
               var5 = var0.method_139(-391631059);
               var6 = var0.method_139(-391631059);
               var7 = 0;
               if(var4 == 1) {
                  var7 = var0.method_135((byte)-114);
               }

               var2.field_458[var3] = var4;
               var2.field_462[var3] = var7;
               if(class_186.method_3875(var5, -2021689482).getClassLoader() == null) {
                  throw new SecurityException();
               }

               var2.field_461[var3] = class_186.method_3875(var5, -1966825211).getDeclaredField(var6);
            }
         } catch (ClassNotFoundException var20) {
            var2.field_457[var3] = -1;
         } catch (SecurityException var21) {
            var2.field_457[var3] = -2;
         } catch (NullPointerException var22) {
            var2.field_457[var3] = -3;
         } catch (Exception var23) {
            var2.field_457[var3] = -4;
         } catch (Throwable var24) {
            var2.field_457[var3] = -5;
         }
      }

      field_1926.method_5697(var2);
   }

   // $FF: renamed from: m (nd, int) void
   public static void method_3237(class_28 var0, int var1) {
      class_58 var10000 = new class_58;
      var10000.method_105();
      class_58 var2 = var10000;
      var2.field_464 = var0.method_130(1739399455) * 1028183917;
      var2.field_459 = var0.method_135((byte)-29) * -1331431769;
      var2.field_458 = new int[var2.field_464 * -637285787];
      var2.field_457 = new int[var2.field_464 * -637285787];
      var2.field_461 = new Field[var2.field_464 * -1126593743];
      var2.field_462 = new int[-764651980 * var2.field_464];
      var2.field_463 = new Method[var2.field_464 * 239945190];
      var2.field_468 = new byte[-636778114 * var2.field_464][][];

      for(int var3 = 0; var3 < var2.field_464 * -637285787; ++var3) {
         try {
            int var4 = var0.method_130(-512798969);
            String var5;
            String var6;
            int var7;
            if(0 != var4 && 1 != var4 && 2 != var4) {
               if(var4 == 3 || var4 == 4) {
                  var5 = var0.method_139(-391631059);
                  var6 = var0.method_139(-391631059);
                  var7 = var0.method_130(940691623);
                  String[] var8 = new String[var7];

                  for(int var9 = 0; var9 < var7; ++var9) {
                     var8[var9] = var0.method_139(-391631059);
                  }

                  String var25 = var0.method_139(-391631059);
                  byte[][] var10 = new byte[var7][];
                  int var12;
                  if(var4 == 3) {
                     for(int var11 = 0; var11 < var7; ++var11) {
                        var12 = var0.method_135((byte)-42);
                        var10[var11] = new byte[var12];
                        var0.method_267(var10[var11], 0, var12, 2057214946);
                     }
                  }

                  var2.field_458[var3] = var4;
                  Class[] var26 = new Class[var7];

                  for(var12 = 0; var12 < var7; ++var12) {
                     var26[var12] = class_186.method_3875(var8[var12], -2127215376);
                  }

                  Class var27 = class_186.method_3875(var25, -2103482981);
                  if(class_186.method_3875(var5, -1970071766).getClassLoader() == null) {
                     throw new SecurityException();
                  }

                  Method[] var13 = class_186.method_3875(var5, -1991348513).getDeclaredMethods();
                  Method[] var14 = var13;

                  for(int var15 = 0; var15 < var14.length; ++var15) {
                     Method var16 = var14[var15];
                     if(var16.getName().equals(var6)) {
                        Class[] var17 = var16.getParameterTypes();
                        if(var17.length == var26.length) {
                           boolean var18 = true;

                           for(int var19 = 0; var19 < var26.length; ++var19) {
                              if(var17[var19] != var26[var19]) {
                                 var18 = false;
                                 break;
                              }
                           }

                           if(var18 && var27 == var16.getReturnType()) {
                              var2.field_463[var3] = var16;
                           }
                        }
                     }
                  }

                  var2.field_468[var3] = var10;
               }
            } else {
               var5 = var0.method_139(-391631059);
               var6 = var0.method_139(-391631059);
               var7 = 0;
               if(var4 == 1) {
                  var7 = var0.method_135((byte)-89);
               }

               var2.field_458[var3] = var4;
               var2.field_462[var3] = var7;
               if(class_186.method_3875(var5, -2009187364).getClassLoader() == null) {
                  throw new SecurityException();
               }

               var2.field_461[var3] = class_186.method_3875(var5, -2124936714).getDeclaredField(var6);
            }
         } catch (ClassNotFoundException var20) {
            var2.field_457[var3] = -1;
         } catch (SecurityException var21) {
            var2.field_457[var3] = -1682639717;
         } catch (NullPointerException var22) {
            var2.field_457[var3] = -181173867;
         } catch (Exception var23) {
            var2.field_457[var3] = 719261317;
         } catch (Throwable var24) {
            var2.field_457[var3] = -16325603;
         }
      }

      field_1926.method_5697(var2);
   }

   // $FF: renamed from: j () void
   public static void method_3238() {
      class_323 var10000 = new class_323;
      var10000.method_5737();
      field_1926 = var10000;
   }

   // $FF: renamed from: z (java.lang.String) java.lang.Class
   static Class method_3239(String var0) throws ClassNotFoundException {
      return var0.equals("B")?Byte.TYPE:(var0.equals("I")?Integer.TYPE:(var0.equals("S")?Short.TYPE:(var0.equals("J")?Long.TYPE:(var0.equals("Z")?Boolean.TYPE:(var0.equals("F")?Float.TYPE:(var0.equals("D")?Double.TYPE:(var0.equals("C")?Character.TYPE:(var0.equals("void")?Void.TYPE:Class.forName(var0)))))))));
   }

   // $FF: renamed from: w (java.lang.String) java.lang.Class
   static Class method_3240(String var0) throws ClassNotFoundException {
      return var0.equals("B")?Byte.TYPE:(var0.equals("I")?Integer.TYPE:(var0.equals("S")?Short.TYPE:(var0.equals("J")?Long.TYPE:(var0.equals("Z")?Boolean.TYPE:(var0.equals("F")?Float.TYPE:(var0.equals("D")?Double.TYPE:(var0.equals("C")?Character.TYPE:(var0.equals("void")?Void.TYPE:Class.forName(var0)))))))));
   }

   // $FF: renamed from: t (java.lang.String) java.lang.Class
   static Class method_3241(String var0) throws ClassNotFoundException {
      return var0.equals("B")?Byte.TYPE:(var0.equals("I")?Integer.TYPE:(var0.equals("S")?Short.TYPE:(var0.equals("J")?Long.TYPE:(var0.equals("Z")?Boolean.TYPE:(var0.equals("F")?Float.TYPE:(var0.equals("D")?Double.TYPE:(var0.equals("C")?Character.TYPE:(var0.equals("void")?Void.TYPE:Class.forName(var0)))))))));
   }

   // $FF: renamed from: <init> () void
   void method_3242() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1, "bn.<init>(" + ')');
      }
   }

   // $FF: renamed from: fd (io, int, int, int) void
   static final void method_3243(class_37 var0, int var1, int var2, int var3) {
      try {
         if(-771809921 * client.field_1655 == 0 || 3 == -771809921 * client.field_1655) {
            if(!client.field_1553) {
               if(var3 <= 1736557337) {
                  throw new IllegalStateException();
               }

               if(1 != class_131.field_1717 * -265253353) {
                  if(var3 <= 1736557337) {
                     throw new IllegalStateException();
                  }

                  if(client.field_1441) {
                     return;
                  }

                  if(var3 <= 1736557337) {
                     throw new IllegalStateException();
                  }

                  if(-265253353 * class_131.field_1717 != 4) {
                     return;
                  }

                  if(var3 <= 1736557337) {
                     throw new IllegalStateException();
                  }
               }

               class_61 var4 = var0.method_409(true, 1203194660);
               if(null == var4) {
                  return;
               }

               int var5 = class_131.field_1701 * 1003938789 - var1;
               int var6 = class_131.field_1711 * 339791065 - var2;
               if(var4.method_639(var5, var6, -1353633749)) {
                  if(var3 <= 1736557337) {
                     throw new IllegalStateException();
                  }

                  var5 -= 1279799405 * var4.field_479 / 2;
                  var6 -= -1973837741 * var4.field_477 / 2;
                  int var7 = client.field_1629 * -574530013 & 2047;
                  int var8 = class_70.field_548[var7];
                  int var9 = class_70.field_559[var7];
                  int var10 = var9 * var5 + var6 * var8 >> 11;
                  int var11 = var6 * var9 - var8 * var5 >> 11;
                  int var12 = var10 + -130212619 * class_164.field_2044.field_1077 >> 7;
                  int var13 = class_164.field_2044.field_1076 * 1248597615 - var11 >> 7;
                  class_40 var14 = class_112.method_2238(class_266.field_3063, client.field_1463.field_2384, (byte)8);
                  var14.field_263.method_210(18, 303066737);
                  byte var10001;
                  if(class_145.field_1840[82]) {
                     if(class_145.field_1840[81]) {
                        if(var3 <= 1736557337) {
                           throw new IllegalStateException();
                        }

                        var10001 = 2;
                     } else {
                        var10001 = 1;
                     }
                  } else {
                     var10001 = 0;
                  }

                  var14.field_263.method_148(var10001, 2145267756);
                  var14.field_263.method_333(class_154.field_1929 * -27903763 + var13, 1312433594);
                  var14.field_263.method_333(var12 + class_243.field_2700 * 697161691, 12917089);
                  var14.field_263.method_210(var5, 303066737);
                  var14.field_263.method_210(var6, 303066737);
                  var14.field_263.method_333(client.field_1629 * -574530013, 1791777808);
                  var14.field_263.method_210(57, 303066737);
                  var14.field_263.method_210(0, 303066737);
                  var14.field_263.method_210(0, 303066737);
                  var14.field_263.method_210(89, 303066737);
                  var14.field_263.method_333(class_164.field_2044.field_1077 * -130212619, -540619392);
                  var14.field_263.method_333(class_164.field_2044.field_1076 * 1248597615, -1475072703);
                  var14.field_263.method_210(63, 303066737);
                  client.field_1463.method_4079(var14, -1896881236);
                  client.field_1520 = 819547401 * var12;
                  client.field_1562 = var13 * 1551872625;
               }
            }

         }
      } catch (RuntimeException var15) {
         throw class_223.method_4281(var15, "bn.fd(" + ')');
      }
   }
}
