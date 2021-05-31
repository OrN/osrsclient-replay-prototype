
// $FF: renamed from: et
public class class_77 extends class_59 {

   // $FF: renamed from: c int
   int field_652;
   // $FF: renamed from: z int
   static final int field_653 = 23;
   // $FF: renamed from: v jv
   public static class_306 field_654;
   // $FF: renamed from: y hz
   static class_272 field_655;
   // $FF: renamed from: p int
   public int field_656;
   // $FF: renamed from: b int
   public int field_657;
   // $FF: renamed from: d int
   public int field_658;
   // $FF: renamed from: s int
   public int field_659;
   // $FF: renamed from: g int
   public int field_660;
   // $FF: renamed from: n jv
   public static class_306 field_661;
   // $FF: renamed from: o int
   int field_662;
   // $FF: renamed from: eq int[]
   static int[] xteaKeys;
   // $FF: renamed from: e int
   public int field_664;
   // $FF: renamed from: l int
   public int field_665;
   // $FF: renamed from: f hz
   static class_272 field_666;
   // $FF: renamed from: ae int
   static final int field_667 = 32;
   // $FF: renamed from: u int
   public int field_668;


   // $FF: renamed from: f (nd, int, byte) void
   void method_1199(Buffer var1, int var2, byte var3) {
      try {
         if(1 == var2) {
            if(var3 <= 1) {
               throw new IllegalStateException();
            }

            var1.readShort();
         } else if(var2 == 2) {
            if(var3 <= 1) {
               throw new IllegalStateException();
            }

            this.field_657 = var1.readUnsignedByte() * 279169129;
         } else if(3 == var2) {
            if(var3 <= 1) {
               throw new IllegalStateException();
            }

            this.field_658 = var1.readUnsignedByte() * -1566265149;
         } else if(4 == var2) {
            if(var3 <= 1) {
               throw new IllegalStateException();
            }

            this.field_659 = 0;
         } else if(5 == var2) {
            this.field_665 = var1.readShort() * -2051894267;
         } else if(var2 == 6) {
            if(var3 <= 1) {
               throw new IllegalStateException();
            }

            var1.readUnsignedByte();
         } else if(var2 == 7) {
            if(var3 <= 1) {
               throw new IllegalStateException();
            }

            this.field_662 = var1.method_147(1960871264) * -1042135135;
         } else if(var2 == 8) {
            this.field_652 = var1.method_147(546464019) * 101729441;
         } else if(11 == var2) {
            this.field_659 = var1.readShort() * -1630439713;
         } else if(14 == var2) {
            if(var3 <= 1) {
               throw new IllegalStateException();
            }

            this.field_664 = var1.readUnsignedByte() * -92201999;
         } else if(15 == var2) {
            if(var3 <= 1) {
               throw new IllegalStateException();
            }

            this.field_660 = var1.readUnsignedByte() * 605485191;
         }

      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: w () void
   public static void method_1200() {
      field_666.method_5074();
      field_655.method_5074();
   }

   // $FF: renamed from: m () oh
   public class_67 method_1201() {
      if(this.field_652 * -1753833631 < 0) {
         return null;
      } else {
         class_67 var1 = (class_67)field_655.method_5065((long)(this.field_652 * -1271941016));
         if(var1 != null) {
            return var1;
         } else {
            var1 = Opcode.method_5032(field_661, this.field_652 * -1753833631, 0, (byte)50);
            if(null != var1) {
               field_655.method_5064(var1, (long)(this.field_652 * 727023287));
            }

            return var1;
         }
      }
   }

   // $FF: renamed from: y (byte) oh
   public class_67 method_1202(byte var1) {
      try {
         if(-714777503 * this.field_662 < 0) {
            if(var1 == 48) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            class_67 var2 = (class_67)field_655.method_5065((long)(this.field_662 * -714777503));
            if(null != var2) {
               if(var1 == 48) {
                  throw new IllegalStateException();
               } else {
                  return var2;
               }
            } else {
               var2 = Opcode.method_5032(field_661, -714777503 * this.field_662, 0, (byte)72);
               if(var2 != null) {
                  field_655.method_5064(var2, (long)(this.field_662 * -714777503));
               }

               return var2;
            }
         }
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: p (short) oh
   public class_67 method_1203(short var1) {
      try {
         if(this.field_652 * -1753833631 < 0) {
            if(var1 == 6707) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            class_67 var2 = (class_67)field_655.method_5065((long)(this.field_652 * -1753833631));
            if(var2 != null) {
               if(var1 == 6707) {
                  throw new IllegalStateException();
               } else {
                  return var2;
               }
            } else {
               var2 = Opcode.method_5032(field_661, this.field_652 * -1753833631, 0, (byte)97);
               if(null != var2) {
                  if(var1 == 6707) {
                     throw new IllegalStateException();
                  }

                  field_655.method_5064(var2, (long)(this.field_652 * -1753833631));
               }

               return var2;
            }
         }
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: <clinit> () void
   static {
      class_272 var10000 = new class_272(64);
      field_666 = var10000;
      var10000 = new class_272(64);
      field_655 = var10000;
   }

   // $FF: renamed from: r (int) et
   public static class_77 method_1205(int var0) {
      class_77 var1 = (class_77)field_666.method_5065((long)var0);
      if(null != var1) {
         return var1;
      } else {
         byte[] var2 = field_654.method_5381(33, var0);
         class_77 var10000 = new class_77();
         var1 = var10000;
         if(var2 != null) {
            Buffer var10001 = new Buffer(var2);
            var1.method_1208(var10001, -964311798);
         }

         field_666.method_5064(var1, (long)var0);
         return var1;
      }
   }

   // $FF: renamed from: b (int) et
   public static class_77 method_1206(int var0) {
      class_77 var1 = (class_77)field_666.method_5065((long)var0);
      if(null != var1) {
         return var1;
      } else {
         byte[] var2 = field_654.method_5381(33, var0);
         class_77 var10000 = new class_77();
         var1 = var10000;
         if(var2 != null) {
            Buffer var10001 = new Buffer(var2);
            var1.method_1208(var10001, 1956043841);
         }

         field_666.method_5064(var1, (long)var0);
         return var1;
      }
   }

   // $FF: renamed from: d (int) et
   public static class_77 method_1207(int var0) {
      class_77 var1 = (class_77)field_666.method_5065((long)var0);
      if(null != var1) {
         return var1;
      } else {
         byte[] var2 = field_654.method_5381(-785680806, var0);
         class_77 var10000 = new class_77();
         var1 = var10000;
         if(var2 != null) {
            Buffer var10001 = new Buffer(var2);
            var1.method_1208(var10001, -50071458);
         }

         field_666.method_5064(var1, (long)var0);
         return var1;
      }
   }

   // $FF: renamed from: n (nd, int) void
   void method_1208(Buffer var1, int var2) {
      try {
         while(true) {
            int var3 = var1.readUnsignedByte();
            if(0 == var3) {
               if(var2 == -573746436) {
                  throw new IllegalStateException();
               }

               return;
            }

            this.method_1199(var1, var3, (byte)98);
         }
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: u (nd) void
   void method_1209(Buffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if(0 == var2) {
            return;
         }

         this.method_1199(var1, var2, (byte)37);
      }
   }

   // $FF: renamed from: g () oh
   public class_67 method_1210() {
      if(-714777503 * this.field_662 < 0) {
         return null;
      } else {
         class_67 var1 = (class_67)field_655.method_5065((long)(this.field_662 * -714777503));
         if(null != var1) {
            return var1;
         } else {
            var1 = Opcode.method_5032(field_661, -714777503 * this.field_662, 0, (byte)81);
            if(var1 != null) {
               field_655.method_5064(var1, (long)(this.field_662 * -714777503));
            }

            return var1;
         }
      }
   }

   // $FF: renamed from: o (nd, int) void
   void method_1211(Buffer var1, int var2) {
      if(1 == var2) {
         var1.readShort();
      } else if(var2 == 2) {
         this.field_657 = var1.readUnsignedByte() * 759333994;
      } else if(3 == var2) {
         this.field_658 = var1.readUnsignedByte() * -1566265149;
      } else if(4 == var2) {
         this.field_659 = 0;
      } else if(5 == var2) {
         this.field_665 = var1.readShort() * 700882595;
      } else if(var2 == 6) {
         var1.readUnsignedByte();
      } else if(var2 == 7) {
         this.field_662 = var1.method_147(1615472858) * -1042135135;
      } else if(var2 == 8) {
         this.field_652 = var1.method_147(560601321) * 279756852;
      } else if(11 == var2) {
         this.field_659 = var1.readShort() * -1630439713;
      } else if(14 == var2) {
         this.field_664 = var1.readUnsignedByte() * -92201999;
      } else if(15 == var2) {
         this.field_660 = var1.readUnsignedByte() * 208955010;
      }

   }

   // $FF: renamed from: c (nd, int) void
   void method_1212(Buffer var1, int var2) {
      if(1 == var2) {
         var1.readShort();
      } else if(var2 == 2) {
         this.field_657 = var1.readUnsignedByte() * 279169129;
      } else if(3 == var2) {
         this.field_658 = var1.readUnsignedByte() * -1566265149;
      } else if(4 == var2) {
         this.field_659 = 0;
      } else if(5 == var2) {
         this.field_665 = var1.readShort() * -2051894267;
      } else if(var2 == 6) {
         var1.readUnsignedByte();
      } else if(var2 == 7) {
         this.field_662 = var1.method_147(1016547482) * -1042135135;
      } else if(var2 == 8) {
         this.field_652 = var1.method_147(2029218187) * 101729441;
      } else if(11 == var2) {
         this.field_659 = var1.readShort() * -1630439713;
      } else if(14 == var2) {
         this.field_664 = var1.readUnsignedByte() * -92201999;
      } else if(15 == var2) {
         this.field_660 = var1.readUnsignedByte() * 605485191;
      }

   }

   // $FF: renamed from: e (nd, int) void
   void method_1213(Buffer var1, int var2) {
      if(1 == var2) {
         var1.readShort();
      } else if(var2 == 2) {
         this.field_657 = var1.readUnsignedByte() * 1915577576;
      } else if(3 == var2) {
         this.field_658 = var1.readUnsignedByte() * -1566265149;
      } else if(4 == var2) {
         this.field_659 = 0;
      } else if(5 == var2) {
         this.field_665 = var1.readShort() * -1491963180;
      } else if(var2 == 6) {
         var1.readUnsignedByte();
      } else if(var2 == 7) {
         this.field_662 = var1.method_147(160922310) * -1042135135;
      } else if(var2 == 8) {
         this.field_652 = var1.method_147(84739817) * 1669471208;
      } else if(11 == var2) {
         this.field_659 = var1.readShort() * 706326502;
      } else if(14 == var2) {
         this.field_664 = var1.readUnsignedByte() * -92201999;
      } else if(15 == var2) {
         this.field_660 = var1.readUnsignedByte() * 605485191;
      }

   }

   // $FF: renamed from: f (int, int) long
   public static long method_1214(int var0) {
      try {
         return class_255.field_2883[var0];
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: a () oh
   public class_67 method_1215() {
      if(-2123989758 * this.field_662 < 0) {
         return null;
      } else {
         class_67 var1 = (class_67)field_655.method_5065((long)(this.field_662 * 1910174857));
         if(null != var1) {
            return var1;
         } else {
            var1 = Opcode.method_5032(field_661, 121510870 * this.field_662, 0, (byte)125);
            if(var1 != null) {
               field_655.method_5064(var1, (long)(this.field_662 * -500378658));
            }

            return var1;
         }
      }
   }

   // $FF: renamed from: k () oh
   public class_67 method_1216() {
      if(this.field_652 * -1753833631 < 0) {
         return null;
      } else {
         class_67 var1 = (class_67)field_655.method_5065((long)(this.field_652 * -1753833631));
         if(var1 != null) {
            return var1;
         } else {
            var1 = Opcode.method_5032(field_661, this.field_652 * -1753833631, 0, (byte)60);
            if(null != var1) {
               field_655.method_5064(var1, (long)(this.field_652 * -1753833631));
            }

            return var1;
         }
      }
   }

   // $FF: renamed from: <init> () void
   class_77() {
      super();
      try {
         this.field_657 = -1826316137;
         this.field_658 = 34345533;
         this.field_659 = 1630439713;
         this.field_668 = -723522373;
         this.field_665 = -1898677922;
         this.field_662 = 1042135135;
         this.field_652 = -101729441;
         this.field_664 = 1528907326;
         this.field_660 = 0;
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1);
      }
   }

   // $FF: renamed from: x () void
   public static void method_1217() {
      field_666.method_5074();
      field_655.method_5074();
   }

   // $FF: renamed from: z () void
   public static void method_1218() {
      field_666.method_5074();
      field_655.method_5074();
   }

   // $FF: renamed from: s (nd) void
   void method_1219(Buffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if(0 == var2) {
            return;
         }

         this.method_1199(var1, var2, (byte)57);
      }
   }

   // $FF: renamed from: l (nd) void
   void method_1220(Buffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if(0 == var2) {
            return;
         }

         this.method_1199(var1, var2, (byte)23);
      }
   }

   // $FF: renamed from: as (int, cf, boolean, int) int
   static int method_1221(int var0, int var3) {
      try {
         if(var0 == 5630) {
            if(var3 <= -1900414590) {
               throw new IllegalStateException();
            } else {
               client.field_1466 = 348395914;
               return 1;
            }
         } else {
            if(5631 != var0) {
               if(var3 <= -1900414590) {
                  throw new IllegalStateException();
               }

               if(var0 != 5633) {
                  if(var0 == 5632) {
                     if(var3 <= -1900414590) {
                        throw new IllegalStateException();
                     }

                     class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = 26;
                     return 1;
                  }

                  return 2;
               }

               if(var3 <= -1900414590) {
                  throw new IllegalStateException();
               }
            }

            class_165.field_2054 -= -1000716630;
            return 1;
         }
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: c (int, int, byte) int
   static final int method_1222(int var0, int var1, byte var2) {
      try {
         if(var0 == -1) {
            if(var2 <= 4) {
               throw new IllegalStateException();
            } else {
               return 12345678;
            }
         } else {
            var1 = (var0 & 127) * var1 / 128;
            if(var1 < 2) {
               var1 = 2;
            } else if(var1 > 126) {
               if(var2 <= 4) {
                  throw new IllegalStateException();
               }

               var1 = 126;
            }

            return var1 + (var0 & '\uff80');
         }
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }
}
