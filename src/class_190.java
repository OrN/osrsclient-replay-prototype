import java.io.EOFException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

// $FF: renamed from: dc
public class class_190 {

   // $FF: renamed from: r long
   long field_2279;
   // $FF: renamed from: f boolean[]
   boolean[] field_2281;
   // $FF: renamed from: y java.util.Map
   Map field_2282;
   // $FF: renamed from: p java.lang.String[]
   String[] field_2283;
   // $FF: renamed from: j boolean
   boolean field_2285;
   // $FF: renamed from: ad int
   public static final int field_2287 = 0;
   // $FF: renamed from: b int
   public static final int field_2288 = 1536;

   // $FF: renamed from: v (int, int, byte) void
   void method_3903(int var1, int var2) {
      try {
         this.field_2282.put(Integer.valueOf(var1), Integer.valueOf(var2));
         if(this.field_2281[var1]) {
            this.field_2285 = true;
         }

      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: n (int, int) int
   int method_3904(int var1) {
      try {
         Object var3 = this.field_2282.get(Integer.valueOf(var1));
         return var3 instanceof Integer?((Integer)var3).intValue():-1;
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: f (int, java.lang.String, int) void
   void method_3905(int var1, String var2) {
      try {
         this.field_2282.put(Integer.valueOf(var1), var2);
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: y (int, int) java.lang.String
   String method_3906(int var1, int var2) {
      try {
         Object var3 = this.field_2282.get(Integer.valueOf(var1));
         if(var3 instanceof String) {
            if(var2 >= -1498552087) {
               throw new IllegalStateException();
            } else {
               return (String)var3;
            }
         } else {
            return "";
         }
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: p (int, java.lang.String, short) void
   void method_3907(int var1, String var2) {
      try {
         this.field_2283[var1] = var2;
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: r (int) void
   void method_3909(int var1) {
      try {
         int var2;
         for(var2 = 0; var2 < this.field_2281.length; ++var2) {
            if(var1 >= 243639924) {
               throw new IllegalStateException();
            }

            if(!this.field_2281[var2]) {
               if(var1 >= 243639924) {
                  throw new IllegalStateException();
               }

               this.field_2282.remove(Integer.valueOf(var2));
            }
         }

         for(var2 = 0; var2 < this.field_2283.length; ++var2) {
            this.field_2283[var2] = null;
         }

      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: <init> () void
   class_190() {
      super();
      try {
         this.field_2285 = false;
         int var1 = class_123.field_1348.method_5393(19);
         this.field_2282 = new HashMap();
         this.field_2281 = new boolean[var1];

         int var2;
         for(var2 = 0; var2 < var1; ++var2) {
            class_84 var3 = class_238.method_4598(var2, (byte)-24);
            this.field_2281[var2] = var3.field_785;
         }

         var2 = 0;
         if(class_123.field_1348.method_5503(15, -1677083054)) {
            var2 = class_123.field_1348.method_5393(15);
         }

         this.field_2283 = new String[var2];
         this.method_3912((byte)54);
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: d (byte) void
   void method_3911(byte var1) {
      try {
         class_383 var2 = this.method_3936(true);
         boolean var19 = false;

         label174: {
            label173: {
               try {
                  var19 = true;
                  int var3 = 3;
                  int var4 = 0;
                  Iterator var5 = this.field_2282.entrySet().iterator();

                  while(var5.hasNext()) {
                     if(var1 >= 0) {
                        throw new IllegalStateException();
                     }

                     Entry var6 = (Entry)var5.next();
                     int var7 = ((Integer)var6.getKey()).intValue();
                     if(this.field_2281[var7]) {
                        if(var1 >= 0) {
                           throw new IllegalStateException();
                        }

                        Object var8 = var6.getValue();
                        var3 += 3;
                        if(var8 instanceof Integer) {
                           if(var1 >= 0) {
                              throw new IllegalStateException();
                           }

                           var3 += 4;
                        } else if(var8 instanceof String) {
                           if(var1 >= 0) {
                              return;
                           }

                           var3 += class_166.method_3598((String)var8);
                        }

                        ++var4;
                     }
                  }

                  class_28 var10000 = new class_28(var3);
                  class_28 var26 = var10000;
                  var26.method_210(2);
                  var26.method_333(var4);
                  Iterator var27 = this.field_2282.entrySet().iterator();

                  while(var27.hasNext()) {
                     Entry var28 = (Entry)var27.next();
                     int var29 = ((Integer)var28.getKey()).intValue();
                     if(this.field_2281[var29]) {
                        if(var1 >= 0) {
                           throw new IllegalStateException();
                        }

                        var26.method_333(var29);
                        Object var9 = var28.getValue();
                        class_385 var10 = class_385.method_6713(var9.getClass(), (byte)-16);
                        var26.method_210(618578037 * var10.field_4222);
                        class_385.method_6708(var9, var26);
                     }
                  }

                  var2.method_6686(var26.field_12, 0, -442398587 * var26.field_15, (byte)-94);
                  var19 = false;
                  break label173;
               } catch (Exception var23) {
                  var19 = false;
               } finally {
                  if(var19) {
                     try {
                        var2.method_6701();
                     } catch (Exception var20) {
                        ;
                     }

                  }
               }

               try {
                  var2.method_6701();
               } catch (Exception var21) {
                  ;
               }
               break label174;
            }

            try {
               var2.method_6701();
            } catch (Exception var22) {
               ;
            }
         }

         this.field_2285 = false;
         this.field_2279 = class_87.method_1516((byte)1) * 5021683597454598663L;
      } catch (RuntimeException var25) {
         throw class_223.method_4281(var25);
      }
   }

   // $FF: renamed from: s (byte) void
   void method_3912(byte var1) {
      try {
         class_383 var2 = this.method_3936(false);
         boolean var23 = false;

         label317: {
            label311: {
               label310: {
                  label309: {
                     try {
                        var23 = true;
                        byte[] var3 = new byte[(int)var2.method_6688()];

                        int var5;
                        for(int var4 = 0; var4 < var3.length; var4 += var5) {
                           var5 = var2.method_6689(var3, var4, var3.length - var4, (byte)-73);
                           if(var5 == -1) {
                              if(var1 <= 13) {
                                 return;
                              }

                              throw new EOFException();
                           }
                        }

                        class_28 var10000 = new class_28(var3);
                        class_28 var32 = var10000;
                        if(var32.field_12.length - -442398587 * var32.field_15 < 1) {
                           if(var1 <= 13) {
                              throw new IllegalStateException();
                           }

                           var23 = false;
                           break label317;
                        }

                        int var6 = var32.method_130();
                        if(var6 < 0) {
                           var23 = false;
                           break label311;
                        }

                        if(var6 > 2) {
                           if(var1 <= 13) {
                              throw new IllegalStateException();
                           }

                           var23 = false;
                           break label311;
                        }

                        int var7;
                        int var8;
                        int var9;
                        int var10;
                        if(var6 >= 2) {
                           if(var1 <= 13) {
                              return;
                           }

                           var7 = var32.method_132();

                           for(var8 = 0; var8 < var7; ++var8) {
                              if(var1 <= 13) {
                                 return;
                              }

                              var9 = var32.method_132();
                              var10 = var32.method_130();
                              class_385 var11 = (class_385)class_197.method_4016(class_385.method_6710(), var10, -611336247);
                              Object var12 = var11.method_6714(var32);
                              if(this.field_2281[var9]) {
                                 if(var1 <= 13) {
                                    throw new IllegalStateException();
                                 }

                                 this.field_2282.put(Integer.valueOf(var9), var12);
                              }
                           }

                           var23 = false;
                        } else {
                           var7 = var32.method_132();

                           for(var8 = 0; var8 < var7; ++var8) {
                              if(var1 <= 13) {
                                 throw new IllegalStateException();
                              }

                              var9 = var32.method_132();
                              var10 = var32.method_135();
                              if(this.field_2281[var9]) {
                                 if(var1 <= 13) {
                                    throw new IllegalStateException();
                                 }

                                 this.field_2282.put(Integer.valueOf(var9), Integer.valueOf(var10));
                              }
                           }

                           var8 = var32.method_132();

                           for(var9 = 0; var9 < var8; ++var9) {
                              if(var1 <= 13) {
                                 throw new IllegalStateException();
                              }

                              var32.method_132();
                              var32.method_139(-391631059);
                           }

                           var23 = false;
                        }
                        break label309;
                     } catch (Exception var29) {
                        var23 = false;
                     } finally {
                        if(var23) {
                           try {
                              var2.method_6701();
                           } catch (Exception var24) {
                              ;
                           }

                        }
                     }

                     try {
                        var2.method_6701();
                     } catch (Exception var26) {
                        ;
                     }
                     break label310;
                  }

                  try {
                     var2.method_6701();
                  } catch (Exception var27) {
                     ;
                  }
               }

               this.field_2285 = false;
               return;
            }

            try {
               var2.method_6701();
            } catch (Exception var28) {
               ;
            }

            return;
         }

         try {
            var2.method_6701();
         } catch (Exception var25) {
            ;
         }

      } catch (RuntimeException var31) {
         throw class_223.method_4281(var31);
      }
   }

   // $FF: renamed from: u (int) void
   void method_3913(int var1) {
      try {
         if(this.field_2285) {
            if(var1 != -1350770877) {
               throw new IllegalStateException();
            }

            if(this.field_2279 * 8820744470819498935L < class_87.method_1516((byte)1) - 60000L) {
               this.method_3911((byte)-63);
            }
         }

      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: l (int) boolean
   boolean method_3914() {
      try {
         return this.field_2285;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: b (boolean, int) nm
   class_383 method_3936(boolean var1) {
      try {
         return class_168.method_3613("2", class_154.field_1933.field_3347, var1, 1926052121);
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: j (int, short) java.lang.String
   String method_3937(int var1) {
      try {
         return this.field_2283[var1];
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: v (int, int) eh
   public static class_86 method_3948(int var0, int var1) {
      try {
         class_86 var2 = (class_86)class_86.field_792.method_5065((long)var0);
         if(var2 != null) {
            if(var1 == -1740533248) {
               throw new IllegalStateException();
            } else {
               return var2;
            }
         } else {
            byte[] var3 = class_86.field_796.method_5381(11, var0);
            class_86 var10000 = new class_86();
            var2 = var10000;
            if(var3 != null) {
               if(var1 == -1740533248) {
                  throw new IllegalStateException();
               }

               class_28 var10001 = new class_28(var3);
               var2.method_1462(var10001, (short)-22209);
            }

            var2.method_1460();
            class_86.field_792.method_5064(var2, (long)var0);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }
}
