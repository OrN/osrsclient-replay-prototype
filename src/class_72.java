
// $FF: renamed from: fl
public class class_72 extends class_59 {

   // $FF: renamed from: v jv
   public static class_306 field_563;
   // $FF: renamed from: f jv
   public static class_306 field_564;
   // $FF: renamed from: e int
   public int field_565;
   // $FF: renamed from: p hz
   static class_272 field_566;
   // $FF: renamed from: s int
   public int field_567;
   // $FF: renamed from: j int[]
   public int[] field_568;
   // $FF: renamed from: r int[]
   int[] field_569;
   // $FF: renamed from: b int[]
   public int[] field_570;
   // $FF: renamed from: d int[]
   public int[] field_571;
   // $FF: renamed from: l boolean
   public boolean field_572;
   // $FF: renamed from: a int
   public int field_573;
   // $FF: renamed from: u int[]
   int[] field_574;
   // $FF: renamed from: o int
   public int field_575;
   // $FF: renamed from: c int
   public int field_576;
   // $FF: renamed from: y hz
   static class_272 field_577;
   // $FF: renamed from: g int
   public int field_578;
   // $FF: renamed from: n jv
   public static class_306 field_579;
   // $FF: renamed from: k int
   public int field_580;
   // $FF: renamed from: m int
   public int field_581;


   // $FF: renamed from: m () void
   void method_1048() {
      if(-1 == this.field_573 * -1960140293) {
         if(this.field_574 != null) {
            this.field_573 = 983990886;
         } else {
            this.field_573 = 0;
         }
      }

      if(-1 == this.field_580 * -263393733) {
         if(this.field_574 != null) {
            this.field_580 = 1895003622;
         } else {
            this.field_580 = 0;
         }
      }

   }

   // $FF: renamed from: t (gr, int) gr
   public class_92 method_1049(class_92 var1, int var2) {
      var2 = this.field_568[var2];
      class_71 var3 = class_153.method_3226(var2 >> 16, -1580151336);
      var2 &= 1420859261;
      if(null == var3) {
         return var1.method_1617(true);
      } else {
         class_92 var4 = var1.method_1617(!var3.method_1043(var2));
         var4.method_1625(var3, var2);
         return var4;
      }
   }

   // $FF: renamed from: d (gr, int, int) gr
   public class_92 method_1050(class_92 var1, int var2, int var3) {
      try {
         int var4 = this.field_568[var2];
         class_71 var5 = class_153.method_3226(var4 >> 16, -1938251186);
         var4 &= '\uffff';
         if(var5 == null) {
            if(var3 == -17777512) {
               throw new IllegalStateException();
            } else {
               return var1.method_1617(true);
            }
         } else {
            class_71 var6 = null;
            int var7 = 0;
            if(null != this.field_569) {
               if(var3 == -17777512) {
                  throw new IllegalStateException();
               }

               if(var2 < this.field_569.length) {
                  if(var3 == -17777512) {
                     throw new IllegalStateException();
                  }

                  var7 = this.field_569[var2];
                  var6 = class_153.method_3226(var7 >> 16, -1635507793);
                  var7 &= '\uffff';
               }
            }

            boolean var10001;
            class_92 var8;
            if(null != var6) {
               if('\uffff' != var7) {
                  if(!var5.method_1043(var4)) {
                     if(var3 == -17777512) {
                        throw new IllegalStateException();
                     }

                     var10001 = true;
                  } else {
                     var10001 = false;
                  }

                  boolean var10002;
                  if(!var6.method_1043(var7)) {
                     if(var3 == -17777512) {
                        throw new IllegalStateException();
                     }

                     var10002 = true;
                  } else {
                     var10002 = false;
                  }

                  var8 = var1.method_1617(var10001 & var10002);
                  var8.method_1625(var5, var4);
                  var8.method_1625(var6, var7);
                  return var8;
               }

               if(var3 == -17777512) {
                  throw new IllegalStateException();
               }
            }

            if(!var5.method_1043(var4)) {
               if(var3 == -17777512) {
                  throw new IllegalStateException();
               }

               var10001 = true;
            } else {
               var10001 = false;
            }

            var8 = var1.method_1617(var10001);
            var8.method_1625(var5, var4);
            return var8;
         }
      } catch (RuntimeException var9) {
         throw class_223.method_4281(var9);
      }
   }

   // $FF: renamed from: y (int) void
   void method_1051(int var1) {
      try {
         if(-1 == this.field_573 * -1960140293) {
            if(var1 >= -1087727229) {
               throw new IllegalStateException();
            }

            if(this.field_574 != null) {
               if(var1 >= -1087727229) {
                  throw new IllegalStateException();
               }

               this.field_573 = 983990886;
            } else {
               this.field_573 = 0;
            }
         }

         if(-1 == this.field_580 * -263393733) {
            if(var1 >= -1087727229) {
               return;
            }

            if(this.field_574 != null) {
               if(var1 >= -1087727229) {
                  throw new IllegalStateException();
               }

               this.field_580 = 1895003622;
            } else {
               this.field_580 = 0;
            }
         }

      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: p (gr, int, int) gr
   public class_92 method_1052(class_92 var1, int var2, int var3) {
      try {
         var2 = this.field_568[var2];
         class_71 var4 = class_153.method_3226(var2 >> 16, -1044523590);
         var2 &= '\uffff';
         if(null == var4) {
            if(var3 >= -1087727229) {
               throw new IllegalStateException();
            } else {
               return var1.method_1617(true);
            }
         } else {
            boolean var10001;
            if(!var4.method_1043(var2)) {
               if(var3 >= -1087727229) {
                  throw new IllegalStateException();
               }

               var10001 = true;
            } else {
               var10001 = false;
            }

            class_92 var5 = var1.method_1617(var10001);
            var5.method_1625(var4, var2);
            return var5;
         }
      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6);
      }
   }

   // $FF: renamed from: j (gr, int, int, byte) gr
   class_92 method_1053(class_92 var1, int var2, int var3, byte var4) {
      try {
         var2 = this.field_568[var2];
         class_71 var5 = class_153.method_3226(var2 >> 16, -499189596);
         var2 &= '\uffff';
         if(null == var5) {
            return var1.method_1617(true);
         } else {
            boolean var10001;
            if(!var5.method_1043(var2)) {
               if(var4 >= 9) {
                  throw new IllegalStateException();
               }

               var10001 = true;
            } else {
               var10001 = false;
            }

            class_92 var6 = var1.method_1617(var10001);
            var3 &= 3;
            if(var3 == 1) {
               if(var4 >= 9) {
                  throw new IllegalStateException();
               }

               var6.method_1630();
            } else if(2 == var3) {
               if(var4 >= 9) {
                  throw new IllegalStateException();
               }

               var6.method_1674();
            } else if(var3 == 3) {
               if(var4 >= 9) {
                  throw new IllegalStateException();
               }

               var6.method_1628();
            }

            var6.method_1625(var5, var2);
            if(1 == var3) {
               if(var4 >= 9) {
                  throw new IllegalStateException();
               }

               var6.method_1628();
            } else if(2 == var3) {
               var6.method_1674();
            } else if(3 == var3) {
               if(var4 >= 9) {
                  throw new IllegalStateException();
               }

               var6.method_1630();
            }

            return var6;
         }
      } catch (RuntimeException var7) {
         throw class_223.method_4281(var7);
      }
   }

   // $FF: renamed from: ab (gr, int) gr
   class_92 method_1054(class_92 var1, int var2) {
      var2 = this.field_568[var2];
      class_71 var3 = class_153.method_3226(var2 >> 16, -735601314);
      var2 &= '\uffff';
      if(null == var3) {
         return var1.method_1627(true);
      } else {
         class_92 var4 = var1.method_1627(!var3.method_1043(var2));
         var4.method_1625(var3, var2);
         return var4;
      }
   }

   // $FF: renamed from: a (nd, int) void
   void method_1055(Buffer var1, int var2) {
      int var3;
      int var4;
      if(var2 == 1) {
         var3 = var1.readShort();
         this.field_570 = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.field_570[var4] = var1.readShort();
         }

         this.field_568 = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.field_568[var4] = var1.readShort();
         }

         for(var4 = 0; var4 < var3; ++var4) {
            this.field_568[var4] += var1.readShort() << 16;
         }
      } else if(2 == var2) {
         this.field_567 = var1.readShort() * 419492775;
      } else if(var2 == 3) {
         var3 = var1.readUnsignedByte();
         this.field_574 = new int[var3 + 1];

         for(var4 = 0; var4 < var3; ++var4) {
            this.field_574[var4] = var1.readUnsignedByte();
         }

         this.field_574[var3] = 9999999;
      } else if(var2 == 4) {
         this.field_572 = true;
      } else if(var2 == 5) {
         this.field_575 = var1.readUnsignedByte() * -1361716113;
      } else if(var2 == 6) {
         this.field_576 = var1.readShort() * -1085015751;
      } else if(7 == var2) {
         this.field_565 = var1.readShort() * -1075479395;
      } else if(8 == var2) {
         this.field_578 = var1.readUnsignedByte() * -720645360;
      } else if(9 == var2) {
         this.field_573 = var1.readUnsignedByte() * -1655488205;
      } else if(10 == var2) {
         this.field_580 = var1.readUnsignedByte() * -1199981837;
      } else if(var2 == 11) {
         this.field_581 = var1.readUnsignedByte() * -1309135183;
      } else if(12 == var2) {
         var3 = var1.readUnsignedByte();
         this.field_569 = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.field_569[var4] = var1.readShort();
         }

         for(var4 = 0; var4 < var3; ++var4) {
            this.field_569[var4] += var1.readShort() << 16;
         }
      } else if(var2 == 13) {
         var3 = var1.readUnsignedByte();
         this.field_571 = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.field_571[var4] = var1.method_134();
         }
      }

   }

   // $FF: renamed from: as (gr, int) gr
   public class_92 method_1056(class_92 var1, int var2) {
      int var3 = this.field_568[var2];
      class_71 var4 = class_153.method_3226(var3 >> 16, -1737432819);
      var3 &= 1584768761;
      if(var4 == null) {
         return var1.method_1617(true);
      } else {
         class_71 var5 = null;
         int var6 = 0;
         if(null != this.field_569 && var2 < this.field_569.length) {
            var6 = this.field_569[var2];
            var5 = class_153.method_3226(var6 >> 16, -1592058101);
            var6 &= 1849117755;
         }

         class_92 var7;
         if(null != var5 && 951690921 != var6) {
            var7 = var1.method_1617(!var4.method_1043(var3) & !var5.method_1043(var6));
            var7.method_1625(var4, var3);
            var7.method_1625(var5, var6);
            return var7;
         } else {
            var7 = var1.method_1617(!var4.method_1043(var3));
            var7.method_1625(var4, var3);
            return var7;
         }
      }
   }

   // $FF: renamed from: <clinit> () void
   static {
      class_272 var10000 = new class_272(64);
      field_577 = var10000;
      var10000 = new class_272(100);
      field_566 = var10000;
   }

   // $FF: renamed from: l (int) fl
   public static class_72 method_1058(int var0) {
      class_72 var1 = (class_72)field_577.method_5065((long)var0);
      if(var1 != null) {
         return var1;
      } else {
         byte[] var2 = field_563.method_5381(12, var0);
         class_72 var10000 = new class_72();
         var1 = var10000;
         if(var2 != null) {
            Buffer var10001 = new Buffer(var2);
            var1.method_1076(var10001, (byte)-38);
         }

         var1.method_1051(-2042560449);
         field_577.method_5064(var1, (long)var0);
         return var1;
      }
   }

   // $FF: renamed from: o (int) fl
   public static class_72 method_1059(int var0) {
      class_72 var1 = (class_72)field_577.method_5065((long)var0);
      if(var1 != null) {
         return var1;
      } else {
         byte[] var2 = field_563.method_5381(12, var0);
         class_72 var10000 = new class_72();
         var1 = var10000;
         if(var2 != null) {
            Buffer var10001 = new Buffer(var2);
            var1.method_1076(var10001, (byte)-15);
         }

         var1.method_1051(-1553561086);
         field_577.method_5064(var1, (long)var0);
         return var1;
      }
   }

   // $FF: renamed from: c (nd) void
   void method_1060(Buffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if(0 == var2) {
            return;
         }

         this.method_1082(var1, var2, -1165284602);
      }
   }

   // $FF: renamed from: g (nd, int) void
   void method_1061(Buffer var1, int var2) {
      int var3;
      int var4;
      if(var2 == 1) {
         var3 = var1.readShort();
         this.field_570 = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.field_570[var4] = var1.readShort();
         }

         this.field_568 = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.field_568[var4] = var1.readShort();
         }

         for(var4 = 0; var4 < var3; ++var4) {
            this.field_568[var4] += var1.readShort() << 16;
         }
      } else if(2 == var2) {
         this.field_567 = var1.readShort() * 419492775;
      } else if(var2 == 3) {
         var3 = var1.readUnsignedByte();
         this.field_574 = new int[var3 + 1];

         for(var4 = 0; var4 < var3; ++var4) {
            this.field_574[var4] = var1.readUnsignedByte();
         }

         this.field_574[var3] = 9999999;
      } else if(var2 == 4) {
         this.field_572 = true;
      } else if(var2 == 5) {
         this.field_575 = var1.readUnsignedByte() * -1361716113;
      } else if(var2 == 6) {
         this.field_576 = var1.readShort() * -1088600563;
      } else if(7 == var2) {
         this.field_565 = var1.readShort() * -1398797321;
      } else if(8 == var2) {
         this.field_578 = var1.readUnsignedByte() * -40390651;
      } else if(9 == var2) {
         this.field_573 = var1.readUnsignedByte() * -1655488205;
      } else if(10 == var2) {
         this.field_580 = var1.readUnsignedByte() * -1199981837;
      } else if(var2 == 11) {
         this.field_581 = var1.readUnsignedByte() * -1309135183;
      } else if(12 == var2) {
         var3 = var1.readUnsignedByte();
         this.field_569 = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.field_569[var4] = var1.readShort();
         }

         for(var4 = 0; var4 < var3; ++var4) {
            this.field_569[var4] += var1.readShort() << 16;
         }
      } else if(var2 == 13) {
         var3 = var1.readUnsignedByte();
         this.field_571 = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.field_571[var4] = var1.method_134();
         }
      }

   }

   // $FF: renamed from: ad (gr, int, fl, int) gr
   public class_92 method_1062(class_92 var1, int var2, class_72 var3, int var4) {
      var2 = this.field_568[var2];
      class_71 var5 = class_153.method_3226(var2 >> 16, -1609898847);
      var2 &= '\uffff';
      if(null == var5) {
         return var3.method_1052(var1, var4, -1607668955);
      } else {
         var4 = var3.field_568[var4];
         class_71 var6 = class_153.method_3226(var4 >> 16, -1135147007);
         var4 &= '\uffff';
         class_92 var7;
         if(null == var6) {
            var7 = var1.method_1617(!var5.method_1043(var2));
            var7.method_1625(var5, var2);
            return var7;
         } else {
            var7 = var1.method_1617(!var5.method_1043(var2) & !var6.method_1043(var4));
            var7.method_1663(var5, var2, var6, var4, this.field_574);
            return var7;
         }
      }
   }

   // $FF: renamed from: <init> () void
   class_72() {
      super();
      try {
         this.field_567 = -419492775;
         this.field_572 = false;
         this.field_575 = 1781354027;
         this.field_576 = 1088600563;
         this.field_565 = 1398797321;
         this.field_578 = 296292847;
         this.field_573 = 1655488205;
         this.field_580 = 1199981837;
         this.field_581 = 1676696930;
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1);
      }
   }

   // $FF: renamed from: k () void
   void method_1063() {
      if(-1 == this.field_573 * 756296577) {
         if(this.field_574 != null) {
            this.field_573 = 1211928237;
         } else {
            this.field_573 = 0;
         }
      }

      if(-1 == this.field_580 * 872961157) {
         if(this.field_574 != null) {
            this.field_580 = 1895003622;
         } else {
            this.field_580 = 0;
         }
      }

   }

   // $FF: renamed from: ac (int) gd
   static class_71 method_1064(int var0) {
      class_71 var1 = (class_71)field_566.method_5065((long)var0);
      if(null != var1) {
         return var1;
      } else {
         class_306 var3 = field_579;
         class_306 var4 = field_564;
         boolean var5 = true;
         int[] var6 = var3.method_5392(var0, (byte)8);

         for(int var7 = 0; var7 < var6.length; ++var7) {
            byte[] var8 = var3.method_5418(var0, var6[var7], 791709889);
            if(var8 == null) {
               var5 = false;
            } else {
               int var9 = (var8[0] & 255) << 8 | var8[1] & 255;
               byte[] var10 = var4.method_5418(var9, 0, 791709889);
               if(var10 == null) {
                  var5 = false;
               }
            }
         }

         class_71 var2;
         if(!var5) {
            var2 = null;
         } else {
            try {
               class_71 var10000 = new class_71(var3, var4, var0, false);
               var2 = var10000;
            } catch (Exception var11) {
               var2 = null;
            }
         }

         if(null != var2) {
            field_566.method_5064(var2, (long)var0);
         }

         return var2;
      }
   }

   // $FF: renamed from: x () void
   void method_1065() {
      if(-1 == this.field_573 * -1960140293) {
         if(this.field_574 != null) {
            this.field_573 = 983990886;
         } else {
            this.field_573 = 0;
         }
      }

      if(-1 == this.field_580 * -263393733) {
         if(this.field_574 != null) {
            this.field_580 = 1895003622;
         } else {
            this.field_580 = 0;
         }
      }

   }

   // $FF: renamed from: ah () void
   public static void method_1066() {
      field_577.method_5074();
      field_566.method_5074();
   }

   // $FF: renamed from: w () void
   void method_1067() {
      if(-1 == this.field_573 * -457398340) {
         if(this.field_574 != null) {
            this.field_573 = 1353422165;
         } else {
            this.field_573 = 0;
         }
      }

      if(-1 == this.field_580 * -263393733) {
         if(this.field_574 != null) {
            this.field_580 = 1638707201;
         } else {
            this.field_580 = 0;
         }
      }

   }

   // $FF: renamed from: z () void
   void method_1068() {
      if(-1 == this.field_573 * -1960140293) {
         if(this.field_574 != null) {
            this.field_573 = 983990886;
         } else {
            this.field_573 = 0;
         }
      }

      if(-1 == this.field_580 * -263393733) {
         if(this.field_574 != null) {
            this.field_580 = 1895003622;
         } else {
            this.field_580 = 0;
         }
      }

   }

   // $FF: renamed from: h (gr, int) gr
   public class_92 method_1069(class_92 var1, int var2) {
      var2 = this.field_568[var2];
      class_71 var3 = class_153.method_3226(var2 >> 16, -572427854);
      var2 &= -923062128;
      if(null == var3) {
         return var1.method_1617(true);
      } else {
         class_92 var4 = var1.method_1617(!var3.method_1043(var2));
         var4.method_1625(var3, var2);
         return var4;
      }
   }

   // $FF: renamed from: aj (gr, int) gr
   public class_92 method_1070(class_92 var1, int var2) {
      int var3 = this.field_568[var2];
      class_71 var4 = class_153.method_3226(var3 >> 16, -1363098886);
      var3 &= '\uffff';
      if(var4 == null) {
         return var1.method_1617(true);
      } else {
         class_71 var5 = null;
         int var6 = 0;
         if(null != this.field_569 && var2 < this.field_569.length) {
            var6 = this.field_569[var2];
            var5 = class_153.method_3226(var6 >> 16, -780329766);
            var6 &= 1460020278;
         }

         class_92 var7;
         if(null != var5 && -1114124824 != var6) {
            var7 = var1.method_1617(!var4.method_1043(var3) & !var5.method_1043(var6));
            var7.method_1625(var4, var3);
            var7.method_1625(var5, var6);
            return var7;
         } else {
            var7 = var1.method_1617(!var4.method_1043(var3));
            var7.method_1625(var4, var3);
            return var7;
         }
      }
   }

   // $FF: renamed from: i (gr, int, int) gr
   class_92 method_1071(class_92 var1, int var2, int var3) {
      var2 = this.field_568[var2];
      class_71 var4 = class_153.method_3226(var2 >> 16, -622760401);
      var2 &= '\uffff';
      if(null == var4) {
         return var1.method_1617(true);
      } else {
         class_92 var5 = var1.method_1617(!var4.method_1043(var2));
         var3 &= 3;
         if(var3 == 1) {
            var5.method_1630();
         } else if(2 == var3) {
            var5.method_1674();
         } else if(var3 == 3) {
            var5.method_1628();
         }

         var5.method_1625(var4, var2);
         if(1 == var3) {
            var5.method_1628();
         } else if(2 == var3) {
            var5.method_1674();
         } else if(3 == var3) {
            var5.method_1630();
         }

         return var5;
      }
   }

   // $FF: renamed from: ae (gr, int, int) gr
   class_92 method_1072(class_92 var1, int var2, int var3) {
      var2 = this.field_568[var2];
      class_71 var4 = class_153.method_3226(var2 >> 16, -1676502788);
      var2 &= 1479360328;
      if(null == var4) {
         return var1.method_1617(true);
      } else {
         class_92 var5 = var1.method_1617(!var4.method_1043(var2));
         var3 &= 3;
         if(var3 == 1) {
            var5.method_1630();
         } else if(2 == var3) {
            var5.method_1674();
         } else if(var3 == 3) {
            var5.method_1628();
         }

         var5.method_1625(var4, var2);
         if(1 == var3) {
            var5.method_1628();
         } else if(2 == var3) {
            var5.method_1674();
         } else if(3 == var3) {
            var5.method_1630();
         }

         return var5;
      }
   }

   // $FF: renamed from: ap (gr, int, int) gr
   class_92 method_1073(class_92 var1, int var2, int var3) {
      var2 = this.field_568[var2];
      class_71 var4 = class_153.method_3226(var2 >> 16, -1737933170);
      var2 &= 2135829200;
      if(null == var4) {
         return var1.method_1617(true);
      } else {
         class_92 var5 = var1.method_1617(!var4.method_1043(var2));
         var3 &= 3;
         if(var3 == 1) {
            var5.method_1630();
         } else if(2 == var3) {
            var5.method_1674();
         } else if(var3 == 3) {
            var5.method_1628();
         }

         var5.method_1625(var4, var2);
         if(1 == var3) {
            var5.method_1628();
         } else if(2 == var3) {
            var5.method_1674();
         } else if(3 == var3) {
            var5.method_1630();
         }

         return var5;
      }
   }

   // $FF: renamed from: r (gr, int, int) gr
   class_92 method_1074(class_92 var1, int var2, int var3) {
      try {
         var2 = this.field_568[var2];
         class_71 var4 = class_153.method_3226(var2 >> 16, -1242355850);
         var2 &= '\uffff';
         if(null == var4) {
            if(var3 != 1547720783) {
               throw new IllegalStateException();
            } else {
               return var1.method_1627(true);
            }
         } else {
            boolean var10001;
            if(!var4.method_1043(var2)) {
               if(var3 != 1547720783) {
                  throw new IllegalStateException();
               }

               var10001 = true;
            } else {
               var10001 = false;
            }

            class_92 var5 = var1.method_1627(var10001);
            var5.method_1625(var4, var2);
            return var5;
         }
      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6);
      }
   }

   // $FF: renamed from: al (gr, int) gr
   class_92 method_1075(class_92 var1, int var2) {
      var2 = this.field_568[var2];
      class_71 var3 = class_153.method_3226(var2 >> 16, -1876109003);
      var2 &= '\uffff';
      if(null == var3) {
         return var1.method_1627(true);
      } else {
         class_92 var4 = var1.method_1627(!var3.method_1043(var2));
         var4.method_1625(var3, var2);
         return var4;
      }
   }

   // $FF: renamed from: n (nd, byte) void
   void method_1076(Buffer var1, byte var2) {
      try {
         while(true) {
            int var3 = var1.readUnsignedByte();
            if(0 == var3) {
               if(var2 == 3) {
                  throw new IllegalStateException();
               }

               return;
            }

            this.method_1082(var1, var3, -1165284602);
         }
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: ai (gr, int, fl, int) gr
   public class_92 method_1077(class_92 var1, int var2, class_72 var3, int var4) {
      var2 = this.field_568[var2];
      class_71 var5 = class_153.method_3226(var2 >> 16, -1278253150);
      var2 &= '\uffff';
      if(null == var5) {
         return var3.method_1052(var1, var4, -2015828570);
      } else {
         var4 = var3.field_568[var4];
         class_71 var6 = class_153.method_3226(var4 >> 16, -1677803270);
         var4 &= -1350348570;
         class_92 var7;
         if(null == var6) {
            var7 = var1.method_1617(!var5.method_1043(var2));
            var7.method_1625(var5, var2);
            return var7;
         } else {
            var7 = var1.method_1617(!var5.method_1043(var2) & !var6.method_1043(var4));
            var7.method_1663(var5, var2, var6, var4, this.field_574);
            return var7;
         }
      }
   }

   // $FF: renamed from: ar (gr, int, fl, int) gr
   public class_92 method_1078(class_92 var1, int var2, class_72 var3, int var4) {
      var2 = this.field_568[var2];
      class_71 var5 = class_153.method_3226(var2 >> 16, -1153771615);
      var2 &= '\uffff';
      if(null == var5) {
         return var3.method_1052(var1, var4, -1583671334);
      } else {
         var4 = var3.field_568[var4];
         class_71 var6 = class_153.method_3226(var4 >> 16, -1307023441);
         var4 &= '\uffff';
         class_92 var7;
         if(null == var6) {
            var7 = var1.method_1617(!var5.method_1043(var2));
            var7.method_1625(var5, var2);
            return var7;
         } else {
            var7 = var1.method_1617(!var5.method_1043(var2) & !var6.method_1043(var4));
            var7.method_1663(var5, var2, var6, var4, this.field_574);
            return var7;
         }
      }
   }

   // $FF: renamed from: ag (gr, int, fl, int) gr
   public class_92 method_1079(class_92 var1, int var2, class_72 var3, int var4) {
      var2 = this.field_568[var2];
      class_71 var5 = class_153.method_3226(var2 >> 16, -1441730697);
      var2 &= '\uffff';
      if(null == var5) {
         return var3.method_1052(var1, var4, -1396703801);
      } else {
         var4 = var3.field_568[var4];
         class_71 var6 = class_153.method_3226(var4 >> 16, -2010286905);
         var4 &= '\uffff';
         class_92 var7;
         if(null == var6) {
            var7 = var1.method_1617(!var5.method_1043(var2));
            var7.method_1625(var5, var2);
            return var7;
         } else {
            var7 = var1.method_1617(!var5.method_1043(var2) & !var6.method_1043(var4));
            var7.method_1663(var5, var2, var6, var4, this.field_574);
            return var7;
         }
      }
   }

   // $FF: renamed from: ax (gr, int) gr
   public class_92 method_1080(class_92 var1, int var2) {
      int var3 = this.field_568[var2];
      class_71 var4 = class_153.method_3226(var3 >> 16, -477596218);
      var3 &= 1923973296;
      if(var4 == null) {
         return var1.method_1617(true);
      } else {
         class_71 var5 = null;
         int var6 = 0;
         if(null != this.field_569 && var2 < this.field_569.length) {
            var6 = this.field_569[var2];
            var5 = class_153.method_3226(var6 >> 16, -533366058);
            var6 &= -660404277;
         }

         class_92 var7;
         if(null != var5 && '\uffff' != var6) {
            var7 = var1.method_1617(!var4.method_1043(var3) & !var5.method_1043(var6));
            var7.method_1625(var4, var3);
            var7.method_1625(var5, var6);
            return var7;
         } else {
            var7 = var1.method_1617(!var4.method_1043(var3));
            var7.method_1625(var4, var3);
            return var7;
         }
      }
   }

   // $FF: renamed from: e (nd) void
   void method_1081(Buffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if(0 == var2) {
            return;
         }

         this.method_1082(var1, var2, -1165284602);
      }
   }

   // $FF: renamed from: f (nd, int, int) void
   void method_1082(Buffer var1, int var2, int var3) {
      try {
         int var4;
         int var5;
         if(var2 == 1) {
            if(var3 != -1165284602) {
               throw new IllegalStateException();
            }

            var4 = var1.readShort();
            this.field_570 = new int[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               if(var3 != -1165284602) {
                  return;
               }

               this.field_570[var5] = var1.readShort();
            }

            this.field_568 = new int[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               if(var3 != -1165284602) {
                  throw new IllegalStateException();
               }

               this.field_568[var5] = var1.readShort();
            }

            for(var5 = 0; var5 < var4; ++var5) {
               if(var3 != -1165284602) {
                  return;
               }

               this.field_568[var5] += var1.readShort() << 16;
            }
         } else if(2 == var2) {
            if(var3 != -1165284602) {
               throw new IllegalStateException();
            }

            this.field_567 = var1.readShort() * 419492775;
         } else if(var2 == 3) {
            if(var3 != -1165284602) {
               return;
            }

            var4 = var1.readUnsignedByte();
            this.field_574 = new int[var4 + 1];

            for(var5 = 0; var5 < var4; ++var5) {
               if(var3 != -1165284602) {
                  throw new IllegalStateException();
               }

               this.field_574[var5] = var1.readUnsignedByte();
            }

            this.field_574[var4] = 9999999;
         } else if(var2 == 4) {
            this.field_572 = true;
         } else if(var2 == 5) {
            if(var3 != -1165284602) {
               throw new IllegalStateException();
            }

            this.field_575 = var1.readUnsignedByte() * -1361716113;
         } else if(var2 == 6) {
            if(var3 != -1165284602) {
               throw new IllegalStateException();
            }

            this.field_576 = var1.readShort() * -1088600563;
         } else if(7 == var2) {
            if(var3 != -1165284602) {
               throw new IllegalStateException();
            }

            this.field_565 = var1.readShort() * -1398797321;
         } else if(8 == var2) {
            if(var3 != -1165284602) {
               throw new IllegalStateException();
            }

            this.field_578 = var1.readUnsignedByte() * -40390651;
         } else if(9 == var2) {
            if(var3 != -1165284602) {
               return;
            }

            this.field_573 = var1.readUnsignedByte() * -1655488205;
         } else if(10 == var2) {
            if(var3 != -1165284602) {
               throw new IllegalStateException();
            }

            this.field_580 = var1.readUnsignedByte() * -1199981837;
         } else if(var2 == 11) {
            if(var3 != -1165284602) {
               throw new IllegalStateException();
            }

            this.field_581 = var1.readUnsignedByte() * -1309135183;
         } else if(12 == var2) {
            if(var3 != -1165284602) {
               throw new IllegalStateException();
            }

            var4 = var1.readUnsignedByte();
            this.field_569 = new int[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               if(var3 != -1165284602) {
                  throw new IllegalStateException();
               }

               this.field_569[var5] = var1.readShort();
            }

            for(var5 = 0; var5 < var4; ++var5) {
               if(var3 != -1165284602) {
                  throw new IllegalStateException();
               }

               this.field_569[var5] += var1.readShort() << 16;
            }
         } else if(var2 == 13) {
            if(var3 != -1165284602) {
               throw new IllegalStateException();
            }

            var4 = var1.readUnsignedByte();
            this.field_571 = new int[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               if(var3 != -1165284602) {
                  return;
               }

               this.field_571[var5] = var1.method_134();
            }
         }

      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6);
      }
   }

   // $FF: renamed from: am (gr, int) gr
   public class_92 method_1083(class_92 var1, int var2) {
      int var3 = this.field_568[var2];
      class_71 var4 = class_153.method_3226(var3 >> 16, -1060445186);
      var3 &= '\uffff';
      if(var4 == null) {
         return var1.method_1617(true);
      } else {
         class_71 var5 = null;
         int var6 = 0;
         if(null != this.field_569 && var2 < this.field_569.length) {
            var6 = this.field_569[var2];
            var5 = class_153.method_3226(var6 >> 16, -1551777454);
            var6 &= 1485305918;
         }

         class_92 var7;
         if(null != var5 && '\uffff' != var6) {
            var7 = var1.method_1617(!var4.method_1043(var3) & !var5.method_1043(var6));
            var7.method_1625(var4, var3);
            var7.method_1625(var5, var6);
            return var7;
         } else {
            var7 = var1.method_1617(!var4.method_1043(var3));
            var7.method_1625(var4, var3);
            return var7;
         }
      }
   }

   // $FF: renamed from: az (int) gd
   static class_71 method_1084(int var0) {
      class_71 var1 = (class_71)field_566.method_5065((long)var0);
      if(null != var1) {
         return var1;
      } else {
         class_306 var3 = field_579;
         class_306 var4 = field_564;
         boolean var5 = true;
         int[] var6 = var3.method_5392(var0, (byte)8);

         for(int var7 = 0; var7 < var6.length; ++var7) {
            byte[] var8 = var3.method_5418(var0, var6[var7], 791709889);
            if(var8 == null) {
               var5 = false;
            } else {
               int var9 = (var8[0] & -967934899) << 8 | var8[1] & -2090488675;
               byte[] var10 = var4.method_5418(var9, 0, 791709889);
               if(var10 == null) {
                  var5 = false;
               }
            }
         }

         class_71 var2;
         if(!var5) {
            var2 = null;
         } else {
            try {
               class_71 var10000 = new class_71(var3, var4, var0, false);
               var2 = var10000;
            } catch (Exception var11) {
               var2 = null;
            }
         }

         if(null != var2) {
            field_566.method_5064(var2, (long)var0);
         }

         return var2;
      }
   }

   // $FF: renamed from: aq () void
   public static void method_1085() {
      field_577.method_5074();
      field_566.method_5074();
   }

   // $FF: renamed from: b (gr, int, fl, int, int) gr
   public class_92 method_1086(class_92 var1, int var2, class_72 var3, int var4, int var5) {
      try {
         var2 = this.field_568[var2];
         class_71 var6 = class_153.method_3226(var2 >> 16, -910296846);
         var2 &= '\uffff';
         if(null == var6) {
            if(var5 <= -2001351863) {
               throw new IllegalStateException();
            } else {
               return var3.method_1052(var1, var4, -1322803536);
            }
         } else {
            var4 = var3.field_568[var4];
            class_71 var7 = class_153.method_3226(var4 >> 16, -1558569012);
            var4 &= '\uffff';
            boolean var10001;
            class_92 var8;
            if(null == var7) {
               if(var5 <= -2001351863) {
                  throw new IllegalStateException();
               } else {
                  if(!var6.method_1043(var2)) {
                     if(var5 <= -2001351863) {
                        throw new IllegalStateException();
                     }

                     var10001 = true;
                  } else {
                     var10001 = false;
                  }

                  var8 = var1.method_1617(var10001);
                  var8.method_1625(var6, var2);
                  return var8;
               }
            } else {
               if(!var6.method_1043(var2)) {
                  if(var5 <= -2001351863) {
                     throw new IllegalStateException();
                  }

                  var10001 = true;
               } else {
                  var10001 = false;
               }

               boolean var10002;
               if(!var7.method_1043(var4)) {
                  if(var5 <= -2001351863) {
                     throw new IllegalStateException();
                  }

                  var10002 = true;
               } else {
                  var10002 = false;
               }

               var8 = var1.method_1617(var10001 & var10002);
               var8.method_1663(var6, var2, var7, var4, this.field_574);
               return var8;
            }
         }
      } catch (RuntimeException var9) {
         throw class_223.method_4281(var9);
      }
   }

   // $FF: renamed from: at (int) gd
   static class_71 method_1087(int var0) {
      class_71 var1 = (class_71)field_566.method_5065((long)var0);
      if(null != var1) {
         return var1;
      } else {
         class_306 var3 = field_579;
         class_306 var4 = field_564;
         boolean var5 = true;
         int[] var6 = var3.method_5392(var0, (byte)8);

         for(int var7 = 0; var7 < var6.length; ++var7) {
            byte[] var8 = var3.method_5418(var0, var6[var7], 791709889);
            if(var8 == null) {
               var5 = false;
            } else {
               int var9 = (var8[0] & 255) << 8 | var8[1] & 255;
               byte[] var10 = var4.method_5418(var9, 0, 791709889);
               if(var10 == null) {
                  var5 = false;
               }
            }
         }

         class_71 var2;
         if(!var5) {
            var2 = null;
         } else {
            try {
               class_71 var10000 = new class_71(var3, var4, var0, false);
               var2 = var10000;
            } catch (Exception var11) {
               var2 = null;
            }
         }

         if(null != var2) {
            field_566.method_5064(var2, (long)var0);
         }

         return var2;
      }
   }

   // $FF: renamed from: av (int) gd
   static class_71 method_1088(int var0) {
      class_71 var1 = (class_71)field_566.method_5065((long)var0);
      if(null != var1) {
         return var1;
      } else {
         class_306 var3 = field_579;
         class_306 var4 = field_564;
         boolean var5 = true;
         int[] var6 = var3.method_5392(var0, (byte)8);

         for(int var7 = 0; var7 < var6.length; ++var7) {
            byte[] var8 = var3.method_5418(var0, var6[var7], 791709889);
            if(var8 == null) {
               var5 = false;
            } else {
               int var9 = (var8[0] & 255) << 8 | var8[1] & 255;
               byte[] var10 = var4.method_5418(var9, 0, 791709889);
               if(var10 == null) {
                  var5 = false;
               }
            }
         }

         class_71 var2;
         if(!var5) {
            var2 = null;
         } else {
            try {
               class_71 var10000 = new class_71(var3, var4, var0, false);
               var2 = var10000;
            } catch (Exception var11) {
               var2 = null;
            }
         }

         if(null != var2) {
            field_566.method_5064(var2, (long)var0);
         }

         return var2;
      }
   }

   // $FF: renamed from: ao () void
   public static void method_1089() {
      field_577.method_5074();
      field_566.method_5074();
   }

   // $FF: renamed from: q (gr, int) gr
   public class_92 method_1090(class_92 var1, int var2) {
      var2 = this.field_568[var2];
      class_71 var3 = class_153.method_3226(var2 >> 16, -1219305110);
      var2 &= '\uffff';
      if(null == var3) {
         return var1.method_1617(true);
      } else {
         class_92 var4 = var1.method_1617(!var3.method_1043(var2));
         var4.method_1625(var3, var2);
         return var4;
      }
   }

   // $FF: renamed from: kq (io, int) boolean
   static final boolean method_1091(class_37 var0, int var1) {
      try {
         int var2 = -1245218361 * var0.field_207;
         if(205 == var2) {
            if(var1 == -26460885) {
               throw new IllegalStateException();
            } else {
               client.field_1466 = 348395914;
               return true;
            }
         } else {
            int var3;
            int var4;
            if(var2 >= 300) {
               if(var1 == -26460885) {
                  throw new IllegalStateException();
               }

               if(var2 <= 313) {
                  if(var1 == -26460885) {
                     throw new IllegalStateException();
                  }

                  var3 = (var2 - 300) / 2;
                  var4 = var2 & 1;
                  boolean var10002;
                  if(var4 == 1) {
                     if(var1 == -26460885) {
                        throw new IllegalStateException();
                     }

                     var10002 = true;
                  } else {
                     var10002 = false;
                  }

                  client.field_1613.method_5086(var3, var10002, 365347894);
               }
            }

            if(var2 >= 314) {
               if(var1 == -26460885) {
                  throw new IllegalStateException();
               }

               if(var2 <= 323) {
                  var3 = (var2 - 314) / 2;
                  var4 = var2 & 1;
                  client.field_1613.method_5115(var3, var4 == 1, -410673716);
               }
            }

            if(324 == var2) {
               if(var1 == -26460885) {
                  throw new IllegalStateException();
               }

               client.field_1613.method_5088(false);
            }

            if(325 == var2) {
               if(var1 == -26460885) {
                  throw new IllegalStateException();
               }

               client.field_1613.method_5088(true);
            }

            if(var2 == 326) {
               if(var1 == -26460885) {
                  throw new IllegalStateException();
               } else {
                  class_40 var6 = class_112.newPacket(Opcode.OPCODE_89, client.field_1463.isaac, (byte)8);
                  client.field_1613.method_5089(var6.networkBuffer, 580596518);
                  client.field_1463.method_4079(var6);
                  return true;
               }
            } else {
               return false;
            }
         }
      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5);
      }
   }

   // $FF: renamed from: f (int, int) int
   public static int method_1092(int var0) {
      try {
         var0 = (var0 & 1431655765) + (var0 >>> 1 & 1431655765);
         var0 = (var0 & 858993459) + (var0 >>> 2 & 858993459);
         var0 = (var0 >>> 4) + var0 & 252645135;
         var0 += var0 >>> 8;
         var0 += var0 >>> 16;
         return var0 & 255;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }
}
