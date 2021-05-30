import java.io.EOFException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

// $FF: renamed from: dc
public class class_190 {

   // $FF: renamed from: r long
   long field_2279;
   // $FF: renamed from: n java.lang.String
   static final String field_2280 = "2";
   // $FF: renamed from: f boolean[]
   boolean[] field_2281;
   // $FF: renamed from: y java.util.Map
   Map field_2282;
   // $FF: renamed from: p java.lang.String[]
   String[] field_2283;
   // $FF: renamed from: v int
   static final int field_2284 = 2;
   // $FF: renamed from: j boolean
   boolean field_2285;
   // $FF: renamed from: i int
   static final int field_2286 = 26;
   // $FF: renamed from: ad int
   public static final int field_2287 = 0;
   // $FF: renamed from: b int
   public static final int field_2288 = 1536;


   // $FF: renamed from: ag () void
   void method_3902() {
      class_383 var1 = this.method_3936(true, -391529478);
      boolean var17 = false;

      label129: {
         label128: {
            try {
               var17 = true;
               int var2 = 3;
               int var3 = 0;
               Iterator var4 = this.field_2282.entrySet().iterator();

               while(var4.hasNext()) {
                  Entry var5 = (Entry)var4.next();
                  int var6 = ((Integer)var5.getKey()).intValue();
                  if(this.field_2281[var6]) {
                     Object var7 = var5.getValue();
                     var2 += 3;
                     if(var7 instanceof Integer) {
                        var2 += 4;
                     } else if(var7 instanceof String) {
                        var2 += class_166.method_3598((String)var7, 269441688);
                     }

                     ++var3;
                  }
               }

               class_28 var10000 = new class_28;
               var10000.method_160(var2);
               class_28 var23 = var10000;
               var23.method_210(2, 303066737);
               var23.method_333(var3, 843693192);
               Iterator var24 = this.field_2282.entrySet().iterator();

               while(var24.hasNext()) {
                  Entry var25 = (Entry)var24.next();
                  int var26 = ((Integer)var25.getKey()).intValue();
                  if(this.field_2281[var26]) {
                     var23.method_333(var26, -867774433);
                     Object var8 = var25.getValue();
                     class_385 var9 = class_385.method_6713(var8.getClass(), (byte)-121);
                     var23.method_210(618578037 * var9.field_4222, 303066737);
                     class_385.method_6708(var8, var23, -813625441);
                  }
               }

               var1.method_6686(var23.field_12, 0, -442398587 * var23.field_15, (byte)33);
               var17 = false;
               break label128;
            } catch (Exception var21) {
               var17 = false;
            } finally {
               if(var17) {
                  try {
                     var1.method_6701(-1214769482);
                  } catch (Exception var18) {
                     ;
                  }

               }
            }

            try {
               var1.method_6701(-2034937087);
            } catch (Exception var19) {
               ;
            }
            break label129;
         }

         try {
            var1.method_6701(-1474774944);
         } catch (Exception var20) {
            ;
         }
      }

      this.field_2285 = false;
      this.field_2279 = class_87.method_1516((byte)1) * 5021683597454598663L;
   }

   // $FF: renamed from: v (int, int, byte) void
   void method_3903(int var1, int var2, byte var3) {
      try {
         this.field_2282.put(Integer.valueOf(var1), Integer.valueOf(var2));
         if(this.field_2281[var1]) {
            this.field_2285 = true;
         }

      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4, "dc.v(" + ')');
      }
   }

   // $FF: renamed from: n (int, int) int
   int method_3904(int var1, int var2) {
      try {
         Object var3 = this.field_2282.get(Integer.valueOf(var1));
         return var3 instanceof Integer?((Integer)var3).intValue():-1;
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4, "dc.n(" + ')');
      }
   }

   // $FF: renamed from: f (int, java.lang.String, int) void
   void method_3905(int var1, String var2, int var3) {
      try {
         this.field_2282.put(Integer.valueOf(var1), var2);
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4, "dc.f(" + ')');
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
         throw class_223.method_4281(var4, "dc.y(" + ')');
      }
   }

   // $FF: renamed from: p (int, java.lang.String, short) void
   void method_3907(int var1, String var2, short var3) {
      try {
         this.field_2283[var1] = var2;
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4, "dc.p(" + ')');
      }
   }

   // $FF: renamed from: h (int, java.lang.String) void
   void method_3908(int var1, String var2) {
      this.field_2283[var1] = var2;
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
         throw class_223.method_4281(var3, "dc.r(" + ')');
      }
   }

   // $FF: renamed from: <init> () void
   void method_3910() {
      try {
         super();
         this.field_2285 = false;
         int var1 = class_123.field_1348.method_5393(19, 1724087023);
         this.field_2282 = new HashMap();
         this.field_2281 = new boolean[var1];

         int var2;
         for(var2 = 0; var2 < var1; ++var2) {
            class_84 var3 = class_238.method_4598(var2, (byte)-24);
            this.field_2281[var2] = var3.field_785;
         }

         var2 = 0;
         if(class_123.field_1348.method_5503(15, -1677083054)) {
            var2 = class_123.field_1348.method_5393(15, 1526382691);
         }

         this.field_2283 = new String[var2];
         this.method_3912((byte)54);
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4, "dc.<init>(" + ')');
      }
   }

   // $FF: renamed from: d (byte) void
   void method_3911(byte var1) {
      try {
         class_383 var2 = this.method_3936(true, -1288257534);
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

                           var3 += class_166.method_3598((String)var8, -175787881);
                        }

                        ++var4;
                     }
                  }

                  class_28 var10000 = new class_28;
                  var10000.method_160(var3);
                  class_28 var26 = var10000;
                  var26.method_210(2, 303066737);
                  var26.method_333(var4, -1254430750);
                  Iterator var27 = this.field_2282.entrySet().iterator();

                  while(var27.hasNext()) {
                     Entry var28 = (Entry)var27.next();
                     int var29 = ((Integer)var28.getKey()).intValue();
                     if(this.field_2281[var29]) {
                        if(var1 >= 0) {
                           throw new IllegalStateException();
                        }

                        var26.method_333(var29, 1888387335);
                        Object var9 = var28.getValue();
                        class_385 var10 = class_385.method_6713(var9.getClass(), (byte)-16);
                        var26.method_210(618578037 * var10.field_4222, 303066737);
                        class_385.method_6708(var9, var26, -926534106);
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
                        var2.method_6701(-1776191666);
                     } catch (Exception var20) {
                        ;
                     }

                  }
               }

               try {
                  var2.method_6701(-1742890692);
               } catch (Exception var21) {
                  ;
               }
               break label174;
            }

            try {
               var2.method_6701(-692843477);
            } catch (Exception var22) {
               ;
            }
         }

         this.field_2285 = false;
         this.field_2279 = class_87.method_1516((byte)1) * 5021683597454598663L;
      } catch (RuntimeException var25) {
         throw class_223.method_4281(var25, "dc.d(" + ')');
      }
   }

   // $FF: renamed from: s (byte) void
   void method_3912(byte var1) {
      try {
         class_383 var2 = this.method_3936(false, -148377861);
         boolean var23 = false;

         label317: {
            label311: {
               label310: {
                  label309: {
                     try {
                        var23 = true;
                        byte[] var3 = new byte[(int)var2.method_6688(1574511583)];

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

                        class_28 var10000 = new class_28;
                        var10000.method_178(var3);
                        class_28 var32 = var10000;
                        if(var32.field_12.length - -442398587 * var32.field_15 < 1) {
                           if(var1 <= 13) {
                              throw new IllegalStateException();
                           }

                           var23 = false;
                           break label317;
                        }

                        int var6 = var32.method_130(-432743031);
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

                           var7 = var32.method_132((byte)-87);

                           for(var8 = 0; var8 < var7; ++var8) {
                              if(var1 <= 13) {
                                 return;
                              }

                              var9 = var32.method_132((byte)-32);
                              var10 = var32.method_130(-28244123);
                              class_385 var11 = (class_385)class_197.method_4016(class_385.method_6710(1535249254), var10, -611336247);
                              Object var12 = var11.method_6714(var32, -2104172776);
                              if(this.field_2281[var9]) {
                                 if(var1 <= 13) {
                                    throw new IllegalStateException();
                                 }

                                 this.field_2282.put(Integer.valueOf(var9), var12);
                              }
                           }

                           var23 = false;
                        } else {
                           var7 = var32.method_132((byte)-41);

                           for(var8 = 0; var8 < var7; ++var8) {
                              if(var1 <= 13) {
                                 throw new IllegalStateException();
                              }

                              var9 = var32.method_132((byte)-116);
                              var10 = var32.method_135((byte)-41);
                              if(this.field_2281[var9]) {
                                 if(var1 <= 13) {
                                    throw new IllegalStateException();
                                 }

                                 this.field_2282.put(Integer.valueOf(var9), Integer.valueOf(var10));
                              }
                           }

                           var8 = var32.method_132((byte)-117);

                           for(var9 = 0; var9 < var8; ++var9) {
                              if(var1 <= 13) {
                                 throw new IllegalStateException();
                              }

                              var32.method_132((byte)-126);
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
                              var2.method_6701(-1561656631);
                           } catch (Exception var24) {
                              ;
                           }

                        }
                     }

                     try {
                        var2.method_6701(-646614964);
                     } catch (Exception var26) {
                        ;
                     }
                     break label310;
                  }

                  try {
                     var2.method_6701(-668503468);
                  } catch (Exception var27) {
                     ;
                  }
               }

               this.field_2285 = false;
               return;
            }

            try {
               var2.method_6701(-812199463);
            } catch (Exception var28) {
               ;
            }

            return;
         }

         try {
            var2.method_6701(-880270191);
         } catch (Exception var25) {
            ;
         }

      } catch (RuntimeException var31) {
         throw class_223.method_4281(var31, "dc.s(" + ')');
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
         throw class_223.method_4281(var2, "dc.u(" + ')');
      }
   }

   // $FF: renamed from: l (int) boolean
   boolean method_3914(int var1) {
      try {
         return this.field_2285;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "dc.l(" + ')');
      }
   }

   // $FF: renamed from: o (int, int) void
   void method_3915(int var1, int var2) {
      this.field_2282.put(Integer.valueOf(var1), Integer.valueOf(var2));
      if(this.field_2281[var1]) {
         this.field_2285 = true;
      }

   }

   // $FF: renamed from: c (int, int) void
   void method_3916(int var1, int var2) {
      this.field_2282.put(Integer.valueOf(var1), Integer.valueOf(var2));
      if(this.field_2281[var1]) {
         this.field_2285 = true;
      }

   }

   // $FF: renamed from: ax () void
   void method_3917() {
      class_383 var1 = this.method_3936(false, -1009923826);
      boolean var21 = false;

      label238: {
         label233: {
            label232: {
               label231: {
                  try {
                     var21 = true;
                     byte[] var2 = new byte[(int)var1.method_6688(1488445334)];

                     int var4;
                     for(int var3 = 0; var3 < var2.length; var3 += var4) {
                        var4 = var1.method_6689(var2, var3, var2.length - var3, (byte)-16);
                        if(var4 == -1) {
                           throw new EOFException();
                        }
                     }

                     class_28 var10000 = new class_28;
                     var10000.method_178(var2);
                     class_28 var29 = var10000;
                     if(var29.field_12.length - 12123245 * var29.field_15 < 1) {
                        var21 = false;
                        break label238;
                     }

                     int var5 = var29.method_130(1226565449);
                     if(var5 < 0) {
                        var21 = false;
                        break label233;
                     }

                     if(var5 > 2) {
                        var21 = false;
                        break label233;
                     }

                     int var6;
                     int var7;
                     int var8;
                     int var9;
                     if(var5 >= 2) {
                        var6 = var29.method_132((byte)-17);

                        for(var7 = 0; var7 < var6; ++var7) {
                           var8 = var29.method_132((byte)-102);
                           var9 = var29.method_130(-418381222);
                           class_385 var10 = (class_385)class_197.method_4016(class_385.method_6710(-174391225), var9, -611336247);
                           Object var11 = var10.method_6714(var29, -2079839839);
                           if(this.field_2281[var8]) {
                              this.field_2282.put(Integer.valueOf(var8), var11);
                           }
                        }

                        var21 = false;
                     } else {
                        var6 = var29.method_132((byte)-56);

                        for(var7 = 0; var7 < var6; ++var7) {
                           var8 = var29.method_132((byte)-60);
                           var9 = var29.method_135((byte)-69);
                           if(this.field_2281[var8]) {
                              this.field_2282.put(Integer.valueOf(var8), Integer.valueOf(var9));
                           }
                        }

                        var7 = var29.method_132((byte)-61);

                        for(var8 = 0; var8 < var7; ++var8) {
                           var29.method_132((byte)-44);
                           var29.method_139(-391631059);
                        }

                        var21 = false;
                     }
                     break label231;
                  } catch (Exception var27) {
                     var21 = false;
                  } finally {
                     if(var21) {
                        try {
                           var1.method_6701(-1736701450);
                        } catch (Exception var22) {
                           ;
                        }

                     }
                  }

                  try {
                     var1.method_6701(-1662235267);
                  } catch (Exception var24) {
                     ;
                  }
                  break label232;
               }

               try {
                  var1.method_6701(-1086707408);
               } catch (Exception var25) {
                  ;
               }
            }

            this.field_2285 = false;
            return;
         }

         try {
            var1.method_6701(-1093498369);
         } catch (Exception var26) {
            ;
         }

         return;
      }

      try {
         var1.method_6701(-1803973528);
      } catch (Exception var23) {
         ;
      }

   }

   // $FF: renamed from: a (int) int
   int method_3918(int var1) {
      Object var2 = this.field_2282.get(Integer.valueOf(var1));
      return var2 instanceof Integer?((Integer)var2).intValue():-1;
   }

   // $FF: renamed from: ae (int) java.lang.String
   String method_3919(int var1) {
      return this.field_2283[var1];
   }

   // $FF: renamed from: k (int) int
   int method_3920(int var1) {
      Object var2 = this.field_2282.get(Integer.valueOf(var1));
      return var2 instanceof Integer?((Integer)var2).intValue():-1;
   }

   // $FF: renamed from: m (int, java.lang.String) void
   void method_3921(int var1, String var2) {
      this.field_2282.put(Integer.valueOf(var1), var2);
   }

   // $FF: renamed from: x (int, java.lang.String) void
   void method_3922(int var1, String var2) {
      this.field_2282.put(Integer.valueOf(var1), var2);
   }

   // $FF: renamed from: z (int, java.lang.String) void
   void method_3923(int var1, String var2) {
      this.field_2282.put(Integer.valueOf(var1), var2);
   }

   // $FF: renamed from: e (int, int) void
   void method_3924(int var1, int var2) {
      this.field_2282.put(Integer.valueOf(var1), Integer.valueOf(var2));
      if(this.field_2281[var1]) {
         this.field_2285 = true;
      }

   }

   // $FF: renamed from: t (int, java.lang.String) void
   void method_3925(int var1, String var2) {
      this.field_2283[var1] = var2;
   }

   // $FF: renamed from: i (int, java.lang.String) void
   void method_3926(int var1, String var2) {
      this.field_2283[var1] = var2;
   }

   // $FF: renamed from: q (int, java.lang.String) void
   void method_3927(int var1, String var2) {
      this.field_2283[var1] = var2;
   }

   // $FF: renamed from: w (int, java.lang.String) void
   void method_3928(int var1, String var2) {
      this.field_2282.put(Integer.valueOf(var1), var2);
   }

   // $FF: renamed from: ah () boolean
   boolean method_3929() {
      return this.field_2285;
   }

   // $FF: renamed from: ap (int) java.lang.String
   String method_3930(int var1) {
      return this.field_2283[var1];
   }

   // $FF: renamed from: ab () void
   void method_3931() {
      int var1;
      for(var1 = 0; var1 < this.field_2281.length; ++var1) {
         if(!this.field_2281[var1]) {
            this.field_2282.remove(Integer.valueOf(var1));
         }
      }

      for(var1 = 0; var1 < this.field_2283.length; ++var1) {
         this.field_2283[var1] = null;
      }

   }

   // $FF: renamed from: al () void
   void method_3932() {
      int var1;
      for(var1 = 0; var1 < this.field_2281.length; ++var1) {
         if(!this.field_2281[var1]) {
            this.field_2282.remove(Integer.valueOf(var1));
         }
      }

      for(var1 = 0; var1 < this.field_2283.length; ++var1) {
         this.field_2283[var1] = null;
      }

   }

   // $FF: renamed from: ad (boolean) nm
   class_383 method_3933(boolean var1) {
      return class_168.method_3613("2", class_154.field_1933.field_3347, var1, 1800896978);
   }

   // $FF: renamed from: ai (boolean) nm
   class_383 method_3934(boolean var1) {
      return class_168.method_3613("2", class_154.field_1933.field_3347, var1, 1933408742);
   }

   // $FF: renamed from: ar (boolean) nm
   class_383 method_3935(boolean var1) {
      return class_168.method_3613("2", class_154.field_1933.field_3347, var1, 2105533929);
   }

   // $FF: renamed from: b (boolean, int) nm
   class_383 method_3936(boolean var1, int var2) {
      try {
         return class_168.method_3613("2", class_154.field_1933.field_3347, var1, 1926052121);
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3, "dc.b(" + ')');
      }
   }

   // $FF: renamed from: j (int, short) java.lang.String
   String method_3937(int var1, short var2) {
      try {
         return this.field_2283[var1];
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3, "dc.j(" + ')');
      }
   }

   // $FF: renamed from: as () void
   void method_3938() {
      class_383 var1 = this.method_3936(false, -305985258);
      boolean var21 = false;

      label238: {
         label233: {
            label232: {
               label231: {
                  try {
                     var21 = true;
                     byte[] var2 = new byte[(int)var1.method_6688(1569216165)];

                     int var4;
                     for(int var3 = 0; var3 < var2.length; var3 += var4) {
                        var4 = var1.method_6689(var2, var3, var2.length - var3, (byte)-54);
                        if(var4 == -1) {
                           throw new EOFException();
                        }
                     }

                     class_28 var10000 = new class_28;
                     var10000.method_178(var2);
                     class_28 var29 = var10000;
                     if(var29.field_12.length - -442398587 * var29.field_15 < 1) {
                        var21 = false;
                        break label238;
                     }

                     int var5 = var29.method_130(-158853817);
                     if(var5 < 0) {
                        var21 = false;
                        break label233;
                     }

                     if(var5 > 2) {
                        var21 = false;
                        break label233;
                     }

                     int var6;
                     int var7;
                     int var8;
                     int var9;
                     if(var5 >= 2) {
                        var6 = var29.method_132((byte)-12);

                        for(var7 = 0; var7 < var6; ++var7) {
                           var8 = var29.method_132((byte)-49);
                           var9 = var29.method_130(-1438700840);
                           class_385 var10 = (class_385)class_197.method_4016(class_385.method_6710(-1707362839), var9, -611336247);
                           Object var11 = var10.method_6714(var29, -2140232153);
                           if(this.field_2281[var8]) {
                              this.field_2282.put(Integer.valueOf(var8), var11);
                           }
                        }

                        var21 = false;
                     } else {
                        var6 = var29.method_132((byte)-88);

                        for(var7 = 0; var7 < var6; ++var7) {
                           var8 = var29.method_132((byte)-16);
                           var9 = var29.method_135((byte)-53);
                           if(this.field_2281[var8]) {
                              this.field_2282.put(Integer.valueOf(var8), Integer.valueOf(var9));
                           }
                        }

                        var7 = var29.method_132((byte)-62);

                        for(var8 = 0; var8 < var7; ++var8) {
                           var29.method_132((byte)-36);
                           var29.method_139(-391631059);
                        }

                        var21 = false;
                     }
                     break label231;
                  } catch (Exception var27) {
                     var21 = false;
                  } finally {
                     if(var21) {
                        try {
                           var1.method_6701(-1582425577);
                        } catch (Exception var22) {
                           ;
                        }

                     }
                  }

                  try {
                     var1.method_6701(-1578545331);
                  } catch (Exception var24) {
                     ;
                  }
                  break label232;
               }

               try {
                  var1.method_6701(-985737076);
               } catch (Exception var25) {
                  ;
               }
            }

            this.field_2285 = false;
            return;
         }

         try {
            var1.method_6701(-1163081175);
         } catch (Exception var26) {
            ;
         }

         return;
      }

      try {
         var1.method_6701(-1193702040);
      } catch (Exception var23) {
         ;
      }

   }

   // $FF: renamed from: aj () void
   void method_3939() {
      if(this.field_2285 && this.field_2279 * 8820744470819498935L < class_87.method_1516((byte)1) - 60000L) {
         this.method_3911((byte)-65);
      }

   }

   // $FF: renamed from: am () void
   void method_3940() {
      if(this.field_2285 && this.field_2279 * 8820744470819498935L < class_87.method_1516((byte)1) - 60000L) {
         this.method_3911((byte)-120);
      }

   }

   // $FF: renamed from: az () void
   void method_3941() {
      if(this.field_2285 && this.field_2279 * 8820744470819498935L < class_87.method_1516((byte)1) - 60000L) {
         this.method_3911((byte)-58);
      }

   }

   // $FF: renamed from: av () void
   void method_3942() {
      if(this.field_2285 && this.field_2279 * 8820744470819498935L < class_87.method_1516((byte)1) - 60000L) {
         this.method_3911((byte)-56);
      }

   }

   // $FF: renamed from: ac () void
   void method_3943() {
      if(this.field_2285 && this.field_2279 * 8820744470819498935L < class_87.method_1516((byte)1) - 60000L) {
         this.method_3911((byte)-12);
      }

   }

   // $FF: renamed from: at () boolean
   boolean method_3944() {
      return this.field_2285;
   }

   // $FF: renamed from: aq () boolean
   boolean method_3945() {
      return this.field_2285;
   }

   // $FF: renamed from: ao () boolean
   boolean method_3946() {
      return this.field_2285;
   }

   // $FF: renamed from: g (int, int) void
   void method_3947(int var1, int var2) {
      this.field_2282.put(Integer.valueOf(var1), Integer.valueOf(var2));
      if(this.field_2281[var1]) {
         this.field_2285 = true;
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
            byte[] var3 = class_86.field_796.method_5381(11, var0, -26460885);
            class_86 var10000 = new class_86;
            var10000.method_105();
            var2 = var10000;
            if(var3 != null) {
               if(var1 == -1740533248) {
                  throw new IllegalStateException();
               }

               class_28 var10001 = new class_28;
               var10001.method_178(var3);
               var2.method_1462(var10001, (short)-22209);
            }

            var2.method_1460(-2035039136);
            class_86.field_792.method_5064(var2, (long)var0);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4, "dc.v(" + ')');
      }
   }
}
