import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// $FF: renamed from: dx
public class class_183 extends class_181 {

   // $FF: renamed from: u int
   static final int field_2248 = 70;
   // $FF: renamed from: tb je
   public static class_296 field_2249;
   // $FF: renamed from: ap byte
   static final byte field_2250 = 126;
   // $FF: renamed from: fd kt
   static class_69 field_2251;
   // $FF: renamed from: p int
   public static final int field_2252 = 6;
   // $FF: renamed from: v boolean
   final boolean field_2253;


   // $FF: renamed from: p (java.lang.Object, java.lang.Object) int
   public int method_3839(Object var1, Object var2) {
      return this.method_3840((class_339)var1, (class_339)var2, 2053904932);
   }

   // $FF: renamed from: v (lv, lv, int) int
   int method_3840(class_339 var1, class_339 var2, int var3) {
      try {
         if(var2.field_3888 * 1693720149 != 1693720149 * var1.field_3888) {
            if(var3 != 2053904932) {
               throw new IllegalStateException();
            } else {
               int var10000;
               if(this.field_2253) {
                  if(var3 != 2053904932) {
                     throw new IllegalStateException();
                  }

                  var10000 = var1.field_3888 * 1693720149 - 1693720149 * var2.field_3888;
               } else {
                  var10000 = 1693720149 * var2.field_3888 - 1693720149 * var1.field_3888;
               }

               return var10000;
            }
         } else {
            return this.method_3830(var1, var2);
         }
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   public int compare(Object var1, Object var2) {
      try {
         return this.method_3840((class_339)var1, (class_339)var2, 2053904932);
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: y (java.lang.Object, java.lang.Object) int
   public int method_3841(Object var1, Object var2) {
      return this.method_3840((class_339)var1, (class_339)var2, 2053904932);
   }

   // $FF: renamed from: <init> (boolean) void
   public class_183(boolean var1) {
      super();
      try {
         this.field_2253 = var1;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: n (lv, lv) int
   int method_3843(class_339 var1, class_339 var2) {
      return var2.field_3888 * 1693720149 != 70867274 * var1.field_3888?(this.field_2253?var1.field_3888 * -1928892393 - -1882137375 * var2.field_3888:-1899264904 * var2.field_3888 - 1693720149 * var1.field_3888):this.method_3830(var1, var2);
   }

   // $FF: renamed from: f (nb, int) void
   public static void method_3844(class_29 var0, int var1) {
      try {
         class_58 var2 = (class_58)class_153.field_1926.method_5700();
         if(var2 == null) {
            if(var1 > 1148722603) {
               ;
            }
         } else {
            int var3 = var0.field_15 * -442398587;
            var0.method_116(var2.field_459 * -848582505);

            for(int var4 = 0; var4 < var2.field_464 * -637285787; ++var4) {
               if(var1 <= 1148722603) {
                  throw new IllegalStateException();
               }

               if(0 != var2.field_457[var4]) {
                  if(var1 <= 1148722603) {
                     throw new IllegalStateException();
                  }

                  var0.method_210(var2.field_457[var4]);
               } else {
                  try {
                     int var5 = var2.field_458[var4];
                     Field var6;
                     int var7;
                     if(var5 == 0) {
                        if(var1 <= 1148722603) {
                           throw new IllegalStateException();
                        }

                        var6 = var2.field_461[var4];
                        var7 = var6.getInt((Object)null);
                        var0.method_210(0);
                        var0.method_116(var7);
                     } else if(1 == var5) {
                        if(var1 <= 1148722603) {
                           throw new IllegalStateException();
                        }

                        var6 = var2.field_461[var4];
                        var6.setInt((Object)null, var2.field_462[var4]);
                        var0.method_210(0);
                     } else if(2 == var5) {
                        if(var1 <= 1148722603) {
                           throw new IllegalStateException();
                        }

                        var6 = var2.field_461[var4];
                        var7 = var6.getModifiers();
                        var0.method_210(0);
                        var0.method_116(var7);
                     }

                     Method var24;
                     if(var5 == 3) {
                        if(var1 <= 1148722603) {
                           throw new IllegalStateException();
                        }

                        var24 = var2.field_463[var4];
                        byte[][] var25 = var2.field_468[var4];
                        Object[] var8 = new Object[var25.length];

                        for(int var9 = 0; var9 < var25.length; ++var9) {
                           if(var1 <= 1148722603) {
                              throw new IllegalStateException();
                           }

                           ObjectInputStream var10 = new ObjectInputStream(new ByteArrayInputStream(var25[var9]));
                           var8[var9] = var10.readObject();
                        }

                        Object var26 = var24.invoke((Object)null, var8);
                        if(null == var26) {
                           if(var1 <= 1148722603) {
                              throw new IllegalStateException();
                           }

                           var0.method_210(0);
                        } else if(var26 instanceof Number) {
                           if(var1 <= 1148722603) {
                              throw new IllegalStateException();
                           }

                           var0.method_210(1);
                           var0.method_341(((Number)var26).longValue());
                        } else if(var26 instanceof String) {
                           var0.method_210(2);
                           var0.method_120((String)var26);
                        } else {
                           var0.method_210(4);
                        }
                     } else if(4 == var5) {
                        if(var1 <= 1148722603) {
                           throw new IllegalStateException();
                        }

                        var24 = var2.field_463[var4];
                        var7 = var24.getModifiers();
                        var0.method_210(0);
                        var0.method_116(var7);
                     }
                  } catch (ClassNotFoundException var11) {
                     var0.method_210(-10);
                  } catch (InvalidClassException var12) {
                     var0.method_210(-11);
                  } catch (StreamCorruptedException var13) {
                     var0.method_210(-12);
                  } catch (OptionalDataException var14) {
                     var0.method_210(-13);
                  } catch (IllegalAccessException var15) {
                     var0.method_210(-14);
                  } catch (IllegalArgumentException var16) {
                     var0.method_210(-15);
                  } catch (InvocationTargetException var17) {
                     var0.method_210(-16);
                  } catch (SecurityException var18) {
                     var0.method_210(-17);
                  } catch (IOException var19) {
                     var0.method_210(-18);
                  } catch (NullPointerException var20) {
                     var0.method_210(-19);
                  } catch (Exception var21) {
                     var0.method_210(-20);
                  } catch (Throwable var22) {
                     var0.method_210(-21);
                  }
               }
            }

            var0.method_285(var3, -1065581057);
            var2.method_108();
         }
      } catch (RuntimeException var23) {
         throw class_223.method_4281(var23);
      }
   }

   // $FF: renamed from: iv (int, int) java.lang.String
   static final String method_3845(int var0, int var1) {
      try {
         String var2 = Integer.toString(var0);

         for(int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            if(var1 != -1768191443) {
               throw new IllegalStateException();
            }

            var2 = var2.substring(0, var3) + class_205.field_2400 + var2.substring(var3);
         }

         if(var2.length() > 9) {
            return " " + class_136.method_2958('\uff80') + var2.substring(0, var2.length() - 8) + class_305.field_3502 + " " + class_205.field_2395 + var2 + class_205.field_2396 + class_205.field_2399;
         } else if(var2.length() > 6) {
            if(var1 != -1768191443) {
               throw new IllegalStateException();
            } else {
               return " " + class_136.method_2958(16777215) + var2.substring(0, var2.length() - 4) + class_305.field_3569 + " " + class_205.field_2395 + var2 + class_205.field_2396 + class_205.field_2399;
            }
         } else {
            return " " + class_136.method_2958(16776960) + var2 + class_205.field_2399;
         }
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }
}
