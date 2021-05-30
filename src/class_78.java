
// $FF: renamed from: es
public class class_78 extends class_59 {

   // $FF: renamed from: v jv
   static class_306 field_669;
   // $FF: renamed from: s short[]
   short[] field_670;
   // $FF: renamed from: f hz
   public static class_272 field_671;
   // $FF: renamed from: y hz
   public static class_272 field_672;
   // $FF: renamed from: ap int
   static final int field_673 = 1;
   // $FF: renamed from: j int
   int field_674;
   // $FF: renamed from: p int
   int field_675;
   // $FF: renamed from: n jv
   static class_306 field_676;
   // $FF: renamed from: d short[]
   short[] field_677;
   // $FF: renamed from: e int
   int field_678;
   // $FF: renamed from: u short[]
   short[] field_679;
   // $FF: renamed from: l int
   int field_680;
   // $FF: renamed from: o int
   int field_681;
   // $FF: renamed from: c int
   int field_682;
   // $FF: renamed from: r int
   public int field_683;
   // $FF: renamed from: g int
   int field_684;
   // $FF: renamed from: b short[]
   short[] field_685;
   // $FF: renamed from: hq int
   static int field_686;


   // $FF: renamed from: gb (int) int
   static int method_1223(int var0) {
      try {
         byte var10000;
         if(client.field_1675) {
            if(var0 != 702215999) {
               throw new IllegalStateException();
            }

            var10000 = 2;
         } else {
            var10000 = 1;
         }

         return var10000;
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1);
      }
   }

   // $FF: renamed from: f (nd, int) void
   void method_1224(Buffer var1, int var2) {
      try {
         while(true) {
            int var3 = var1.readUnsignedByte();
            if(var3 == 0) {
               if(var2 >= -678423826) {
                  throw new IllegalStateException();
               }

               return;
            }

            this.method_1225(var1, var3, (byte)-81);
         }
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: y (nd, int, byte) void
   void method_1225(Buffer var1, int var2, byte var3) {
      try {
         if(var2 == 1) {
            if(var3 >= 12) {
               throw new IllegalStateException();
            }

            this.field_674 = var1.readShort() * 602430813;
         } else if(var2 == 2) {
            if(var3 >= 12) {
               return;
            }

            this.field_683 = var1.readShort() * -386545419;
         } else if(var2 == 4) {
            if(var3 >= 12) {
               return;
            }

            this.field_680 = var1.readShort() * 559647789;
         } else if(var2 == 5) {
            if(var3 >= 12) {
               throw new IllegalStateException();
            }

            this.field_681 = var1.readShort() * 1261960403;
         } else if(var2 == 6) {
            this.field_682 = var1.readShort() * -1518803469;
         } else if(7 == var2) {
            if(var3 >= 12) {
               throw new IllegalStateException();
            }

            this.field_678 = var1.readUnsignedByte() * -1928013821;
         } else if(8 == var2) {
            if(var3 >= 12) {
               throw new IllegalStateException();
            }

            this.field_684 = var1.readUnsignedByte() * 1940599187;
         } else {
            int var4;
            int var5;
            if(40 == var2) {
               if(var3 >= 12) {
                  throw new IllegalStateException();
               }

               var4 = var1.readUnsignedByte();
               this.field_685 = new short[var4];
               this.field_677 = new short[var4];

               for(var5 = 0; var5 < var4; ++var5) {
                  this.field_685[var5] = (short)var1.readShort();
                  this.field_677[var5] = (short)var1.readShort();
               }
            } else if(41 == var2) {
               if(var3 >= 12) {
                  return;
               }

               var4 = var1.readUnsignedByte();
               this.field_670 = new short[var4];
               this.field_679 = new short[var4];

               for(var5 = 0; var5 < var4; ++var5) {
                  this.field_670[var5] = (short)var1.readShort();
                  this.field_679[var5] = (short)var1.readShort();
               }
            }
         }

      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6);
      }
   }

   // $FF: renamed from: p (int, byte) gr
   public final class_92 method_1226(int var1, byte var2) {
      try {
         class_92 var3 = (class_92)field_672.method_5065((long)(this.field_675 * -1517431137));
         if(var3 == null) {
            if(var2 <= 3) {
               throw new IllegalStateException();
            }

            class_93 var4 = class_93.method_1708(field_676, -439820555 * this.field_674, 0);
            if(var4 == null) {
               if(var2 <= 3) {
                  throw new IllegalStateException();
               }

               return null;
            }

            int var5;
            if(this.field_685 != null) {
               if(var2 <= 3) {
                  throw new IllegalStateException();
               }

               for(var5 = 0; var5 < this.field_685.length; ++var5) {
                  if(var2 <= 3) {
                     throw new IllegalStateException();
                  }

                  var4.method_1703(this.field_685[var5], this.field_677[var5]);
               }
            }

            if(null != this.field_670) {
               if(var2 <= 3) {
                  throw new IllegalStateException();
               }

               for(var5 = 0; var5 < this.field_670.length; ++var5) {
                  if(var2 <= 3) {
                     throw new IllegalStateException();
                  }

                  var4.method_1701(this.field_670[var5], this.field_679[var5]);
               }
            }

            var3 = var4.method_1711(64 + 1878430379 * this.field_678, -191851365 * this.field_684 + 850, -30, -50, -30);
            field_672.method_5064(var3, (long)(-1517431137 * this.field_675));
         }

         class_92 var7;
         if(-814046371 * this.field_683 != -1 && -1 != var1) {
            if(var2 <= 3) {
               throw new IllegalStateException();
            }

            var7 = class_162.method_3412(-814046371 * this.field_683, 669727000).method_1074(var3, var1, 1547720783);
         } else {
            var7 = var3.method_1627(true);
         }

         label95: {
            if(128 == this.field_680 * -1653169243) {
               if(var2 <= 3) {
                  throw new IllegalStateException();
               }

               if(1577696091 * this.field_681 == 128) {
                  break label95;
               }
            }

            var7.method_1633(-1653169243 * this.field_680, this.field_681 * 1577696091, this.field_680 * -1653169243);
         }

         if(0 != 1414282043 * this.field_682) {
            if(var2 <= 3) {
               throw new IllegalStateException();
            }

            if(this.field_682 * 1414282043 == 90) {
               var7.method_1628();
            }

            if(180 == this.field_682 * 1414282043) {
               if(var2 <= 3) {
                  throw new IllegalStateException();
               }

               var7.method_1628();
               var7.method_1628();
            }

            if(270 == 1414282043 * this.field_682) {
               if(var2 <= 3) {
                  throw new IllegalStateException();
               }

               var7.method_1628();
               var7.method_1628();
               var7.method_1628();
            }
         }

         return var7;
      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6);
      }
   }

   // $FF: renamed from: <clinit> () void
   static {
      class_272 var10000 = new class_272(64);
      field_671 = var10000;
      var10000 = new class_272(30);
      field_672 = var10000;
   }

   // $FF: renamed from: j (jv, jv) void
   public static void method_1228(class_306 var0, class_306 var1) {
      field_669 = var0;
      field_676 = var1;
   }

   // $FF: renamed from: d (int) es
   public static class_78 method_1229(int var0) {
      class_78 var1 = (class_78)field_671.method_5065((long)var0);
      if(var1 != null) {
         return var1;
      } else {
         byte[] var2 = field_669.method_5381(13, var0);
         class_78 var10000 = new class_78();
         var1 = var10000;
         var1.field_675 = 850117983 * var0;
         if(var2 != null) {
            Buffer var10001 = new Buffer(var2);
            var1.method_1224(var10001, -861709764);
         }

         field_671.method_5064(var1, (long)var0);
         return var1;
      }
   }

   // $FF: renamed from: c (nd, int) void
   void method_1230(Buffer var1, int var2) {
      if(var2 == 1) {
         this.field_674 = var1.readShort() * 602430813;
      } else if(var2 == 2) {
         this.field_683 = var1.readShort() * -386545419;
      } else if(var2 == 4) {
         this.field_680 = var1.readShort() * 559647789;
      } else if(var2 == 5) {
         this.field_681 = var1.readShort() * 1261960403;
      } else if(var2 == 6) {
         this.field_682 = var1.readShort() * -1518803469;
      } else if(7 == var2) {
         this.field_678 = var1.readUnsignedByte() * -1928013821;
      } else if(8 == var2) {
         this.field_684 = var1.readUnsignedByte() * 1940599187;
      } else {
         int var3;
         int var4;
         if(40 == var2) {
            var3 = var1.readUnsignedByte();
            this.field_685 = new short[var3];
            this.field_677 = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.field_685[var4] = (short)var1.readShort();
               this.field_677[var4] = (short)var1.readShort();
            }
         } else if(41 == var2) {
            var3 = var1.readUnsignedByte();
            this.field_670 = new short[var3];
            this.field_679 = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.field_670[var4] = (short)var1.readShort();
               this.field_679[var4] = (short)var1.readShort();
            }
         }
      }

   }

   // $FF: renamed from: r (jv, jv) void
   public static void method_1231(class_306 var0, class_306 var1) {
      field_669 = var0;
      field_676 = var1;
   }

   // $FF: renamed from: s (int) es
   public static class_78 method_1232(int var0) {
      class_78 var1 = (class_78)field_671.method_5065((long)var0);
      if(var1 != null) {
         return var1;
      } else {
         byte[] var2 = field_669.method_5381(13, var0);
         class_78 var10000 = new class_78();
         var1 = var10000;
         var1.field_675 = 850117983 * var0;
         if(var2 != null) {
            Buffer var10001 = new Buffer(var2);
            var1.method_1224(var10001, -1646459782);
         }

         field_671.method_5064(var1, (long)var0);
         return var1;
      }
   }

   // $FF: renamed from: u (nd) void
   void method_1233(Buffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if(var2 == 0) {
            return;
         }

         this.method_1225(var1, var2, (byte)-31);
      }
   }

   // $FF: renamed from: l (nd) void
   void method_1234(Buffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if(var2 == 0) {
            return;
         }

         this.method_1225(var1, var2, (byte)-11);
      }
   }

   // $FF: renamed from: o (nd, int) void
   void method_1235(Buffer var1, int var2) {
      if(var2 == 1) {
         this.field_674 = var1.readShort() * 1735816432;
      } else if(var2 == 2) {
         this.field_683 = var1.readShort() * -386545419;
      } else if(var2 == 4) {
         this.field_680 = var1.readShort() * -1085541029;
      } else if(var2 == 5) {
         this.field_681 = var1.readShort() * -2068585239;
      } else if(var2 == 6) {
         this.field_682 = var1.readShort() * 265242640;
      } else if(7 == var2) {
         this.field_678 = var1.readUnsignedByte() * -1928013821;
      } else if(8 == var2) {
         this.field_684 = var1.readUnsignedByte() * 496866324;
      } else {
         int var3;
         int var4;
         if(-1776616594 == var2) {
            var3 = var1.readUnsignedByte();
            this.field_685 = new short[var3];
            this.field_677 = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.field_685[var4] = (short)var1.readShort();
               this.field_677[var4] = (short)var1.readShort();
            }
         } else if(1442053903 == var2) {
            var3 = var1.readUnsignedByte();
            this.field_670 = new short[var3];
            this.field_679 = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.field_670[var4] = (short)var1.readShort();
               this.field_679[var4] = (short)var1.readShort();
            }
         }
      }

   }

   // $FF: renamed from: e (int) gr
   public final class_92 method_1236(int var1) {
      class_92 var2 = (class_92)field_672.method_5065((long)(this.field_675 * -310122313));
      if(var2 == null) {
         class_93 var3 = class_93.method_1708(field_676, -880732340 * this.field_674, 0);
         if(var3 == null) {
            return null;
         }

         int var4;
         if(this.field_685 != null) {
            for(var4 = 0; var4 < this.field_685.length; ++var4) {
               var3.method_1703(this.field_685[var4], this.field_677[var4]);
            }
         }

         if(null != this.field_670) {
            for(var4 = 0; var4 < this.field_670.length; ++var4) {
               var3.method_1701(this.field_670[var4], this.field_679[var4]);
            }
         }

         var2 = var3.method_1711(64 + 1878430379 * this.field_678, 964721239 * this.field_684 + 850, -1386581641, -50, -30);
         field_672.method_5064(var2, (long)(-99246047 * this.field_675));
      }

      class_92 var5;
      if(654791280 * this.field_683 != -1 && -1 != var1) {
         var5 = class_162.method_3412(-814046371 * this.field_683, -1104790522).method_1074(var2, var1, 1547720783);
      } else {
         var5 = var2.method_1627(true);
      }

      if(128 != this.field_680 * -1989334880 || 635177694 * this.field_681 != -1872755324) {
         var5.method_1633(-1653169243 * this.field_680, this.field_681 * 1662457988, this.field_680 * 707330211);
      }

      if(0 != -430207298 * this.field_682) {
         if(this.field_682 * 205547821 == 90) {
            var5.method_1628();
         }

         if(-1542257370 == this.field_682 * 1414282043) {
            var5.method_1628();
            var5.method_1628();
         }

         if(270 == -799830776 * this.field_682) {
            var5.method_1628();
            var5.method_1628();
            var5.method_1628();
         }
      }

      return var5;
   }

   // $FF: renamed from: r (int) bg
   static class_149 method_1237() {
      try {
         class_149.field_1887 = 0;
         return class_97.method_1788(789077923);
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1);
      }
   }

   // $FF: renamed from: g (int) gr
   public final class_92 method_1238(int var1) {
      class_92 var2 = (class_92)field_672.method_5065((long)(this.field_675 * -1517431137));
      if(var2 == null) {
         class_93 var3 = class_93.method_1708(field_676, -439820555 * this.field_674, 0);
         if(var3 == null) {
            return null;
         }

         int var4;
         if(this.field_685 != null) {
            for(var4 = 0; var4 < this.field_685.length; ++var4) {
               var3.method_1703(this.field_685[var4], this.field_677[var4]);
            }
         }

         if(null != this.field_670) {
            for(var4 = 0; var4 < this.field_670.length; ++var4) {
               var3.method_1701(this.field_670[var4], this.field_679[var4]);
            }
         }

         var2 = var3.method_1711(64 + 1878430379 * this.field_678, -191851365 * this.field_684 + 850, -30, -50, -30);
         field_672.method_5064(var2, (long)(-1517431137 * this.field_675));
      }

      class_92 var5;
      if(-814046371 * this.field_683 != -1 && -1 != var1) {
         var5 = class_162.method_3412(-814046371 * this.field_683, -493384430).method_1074(var2, var1, 1547720783);
      } else {
         var5 = var2.method_1627(true);
      }

      if(128 != this.field_680 * -1653169243 || 1577696091 * this.field_681 != 128) {
         var5.method_1633(-1653169243 * this.field_680, this.field_681 * 1577696091, this.field_680 * -1653169243);
      }

      if(0 != 1414282043 * this.field_682) {
         if(this.field_682 * 1414282043 == 90) {
            var5.method_1628();
         }

         if(180 == this.field_682 * 1414282043) {
            var5.method_1628();
            var5.method_1628();
         }

         if(270 == 1414282043 * this.field_682) {
            var5.method_1628();
            var5.method_1628();
            var5.method_1628();
         }
      }

      return var5;
   }

   // $FF: renamed from: <init> () void
   class_78() {
      super();
      try {
         this.field_683 = 386545419;
         this.field_680 = -1379527040;
         this.field_681 = -1677825664;
         this.field_682 = 0;
         this.field_678 = 0;
         this.field_684 = 0;
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1);
      }
   }

   // $FF: renamed from: b (jv, jv) void
   public static void method_1239(class_306 var0, class_306 var1) {
      field_669 = var0;
      field_676 = var1;
   }
}
