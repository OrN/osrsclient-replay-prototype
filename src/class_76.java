
// $FF: renamed from: ev
public class class_76 extends class_59 {

   // $FF: renamed from: v jv
   public static class_306 field_625;
   // $FF: renamed from: q int[]
   public int[] field_626;
   // $FF: renamed from: y hz
   static class_272 field_627;
   // $FF: renamed from: p hz
   static class_272 field_628;
   // $FF: renamed from: j hz
   static class_272 field_629;
   // $FF: renamed from: i int
   int field_630;
   // $FF: renamed from: c int
   public int field_631;
   // $FF: renamed from: l int
   int field_632;
   // $FF: renamed from: f jv
   public static class_306 field_633;
   // $FF: renamed from: n jv
   public static class_306 field_634;
   // $FF: renamed from: e int
   int field_635;
   // $FF: renamed from: g int
   int field_636;
   // $FF: renamed from: a int
   int field_637;
   // $FF: renamed from: k int
   int field_638;
   // $FF: renamed from: m int
   public int field_639;
   // $FF: renamed from: x int
   public int field_640;
   // $FF: renamed from: w java.lang.String
   String field_642;
   // $FF: renamed from: t int
   public int field_643;
   // $FF: renamed from: h int
   public int field_644;
   // $FF: renamed from: o int
   public int field_645;
   // $FF: renamed from: ae int
   int field_647;
   // $FF: renamed from: z int
   public int field_649;
   // $FF: renamed from: bs op[]
   static class_66[] field_650;


   // $FF: renamed from: n (nd, int) void
   void method_1158(Buffer var1, int var2) {
      try {
         while(true) {
            int var3 = var1.readUnsignedByte();
            if(var3 == 0) {
               if(var2 == 1826604152) {
                  return;
               }

               return;
            }

            this.method_1159(var1, var3, 1647125333);
         }
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: f (nd, int, int) void
   void method_1159(Buffer var1, int var2, int var3) {
      try {
         if(var2 == 1) {
            if(var3 != 1647125333) {
               return;
            }

            this.field_632 = var1.method_147(1674951850) * 1829892571;
         } else if(2 == var2) {
            if(var3 != 1647125333) {
               throw new IllegalStateException();
            }

            this.field_645 = var1.method_134() * 535226611;
         } else if(var2 == 3) {
            if(var3 != 1647125333) {
               throw new IllegalStateException();
            }

            this.field_635 = var1.method_147(276507786) * 1262721335;
         } else if(var2 == 4) {
            if(var3 != 1647125333) {
               throw new IllegalStateException();
            }

            this.field_637 = var1.method_147(533427208) * -1289208417;
         } else if(var2 == 5) {
            if(var3 != 1647125333) {
               throw new IllegalStateException();
            }

            this.field_636 = var1.method_147(1341383520) * -1629123051;
         } else if(6 == var2) {
            if(var3 != 1647125333) {
               throw new IllegalStateException();
            }

            this.field_638 = var1.method_147(1378356830) * 2059444655;
         } else if(var2 == 7) {
            if(var3 != 1647125333) {
               throw new IllegalStateException();
            }

            this.field_639 = var1.method_269(-1542485131) * 536947847;
         } else if(var2 == 8) {
            if(var3 != 1647125333) {
               throw new IllegalStateException();
            }

            this.field_642 = var1.method_140((byte)97);
         } else if(var2 == 9) {
            if(var3 != 1647125333) {
               return;
            }

            this.field_631 = var1.readShort() * 857620037;
         } else if(var2 == 10) {
            if(var3 != 1647125333) {
               return;
            }

            this.field_640 = var1.method_269(-1542485131) * 480001211;
         } else if(var2 == 11) {
            if(var3 != 1647125333) {
               return;
            }

            this.field_649 = 0;
         } else if(12 == var2) {
            if(var3 != 1647125333) {
               throw new IllegalStateException();
            }

            this.field_643 = var1.readUnsignedByte() * 367701549;
         } else if(13 == var2) {
            if(var3 != 1647125333) {
               return;
            }

            this.field_644 = var1.method_269(-1542485131) * -850903927;
         } else if(var2 == 14) {
            this.field_649 = var1.readShort() * -1733771819;
         } else {
            if(17 != var2) {
               if(var3 != 1647125333) {
                  throw new IllegalStateException();
               }

               if(var2 != 18) {
                  return;
               }

               if(var3 != 1647125333) {
                  throw new IllegalStateException();
               }
            }

            this.field_630 = var1.readShort() * -1059629955;
            if(this.field_630 * 1819526357 == '\uffff') {
               this.field_630 = 1059629955;
            }

            this.field_647 = var1.readShort() * 1847840427;
            if('\uffff' == this.field_647 * 1097710595) {
               this.field_647 = -1847840427;
            }

            int var4 = -1;
            if(18 == var2) {
               if(var3 != 1647125333) {
                  throw new IllegalStateException();
               }

               var4 = var1.readShort();
               if('\uffff' == var4) {
                  if(var3 != 1647125333) {
                     throw new IllegalStateException();
                  }

                  var4 = -1;
               }
            }

            int var5 = var1.readUnsignedByte();
            this.field_626 = new int[2 + var5];

            for(int var6 = 0; var6 <= var5; ++var6) {
               if(var3 != 1647125333) {
                  return;
               }

               this.field_626[var6] = var1.readShort();
               if(this.field_626[var6] == '\uffff') {
                  if(var3 != 1647125333) {
                     throw new IllegalStateException();
                  }

                  this.field_626[var6] = -1;
               }
            }

            this.field_626[var5 + 1] = var4;
         }

      } catch (RuntimeException var7) {
         throw class_223.method_4281(var7);
      }
   }

   // $FF: renamed from: y (int) ev
   public final class_76 method_1160(int var1) {
      try {
         int var2 = -1;
         if(1819526357 * this.field_630 != -1) {
            if(var1 != -1025207361) {
               throw new IllegalStateException();
            }

            var2 = class_43.method_496(this.field_630 * 1819526357);
         } else if(-1 != this.field_647 * 1097710595) {
            if(var1 != -1025207361) {
               throw new IllegalStateException();
            }

            var2 = class_282.field_3246[1097710595 * this.field_647];
         }

         int var3;
         if(var2 >= 0 && var2 < this.field_626.length - 1) {
            var3 = this.field_626[var2];
         } else {
            var3 = this.field_626[this.field_626.length - 1];
         }

         return var3 != -1?class_95.method_1780(var3, 653409044):null;
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: p (int, int) java.lang.String
   public String method_1161(int var1, int var2) {
      try {
         String var3 = this.field_642;

         while(true) {
            int var4 = var3.indexOf("%1");
            if(var4 < 0) {
               if(var2 != -1622557292) {
                  throw new IllegalStateException();
               } else {
                  return var3;
               }
            }

            var3 = var3.substring(0, var4) + class_179.method_3809(var1, false, (short)7104) + var3.substring(2 + var4);
         }
      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5);
      }
   }

   // $FF: renamed from: j (int) oh
   public class_67 method_1162(int var1) {
      try {
         if(444689543 * this.field_635 < 0) {
            if(var1 == 449991818) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            class_67 var2 = (class_67)field_628.method_5065((long)(this.field_635 * 444689543));
            if(null != var2) {
               if(var1 == 449991818) {
                  throw new IllegalStateException();
               } else {
                  return var2;
               }
            } else {
               var2 = ClientOpcode.method_5032(field_634, 444689543 * this.field_635, 0, (byte)65);
               if(null != var2) {
                  if(var1 == 449991818) {
                     throw new IllegalStateException();
                  }

                  field_628.method_5064(var2, (long)(444689543 * this.field_635));
               }

               return var2;
            }
         }
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: s (int) kt
   public class_69 method_1166(int var1) {
      try {
         if(-418995629 * this.field_632 == -1) {
            if(var1 <= 1957213790) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            class_69 var2 = (class_69)field_629.method_5065((long)(-418995629 * this.field_632));
            if(var2 != null) {
               if(var1 <= 1957213790) {
                  throw new IllegalStateException();
               } else {
                  return var2;
               }
            } else {
               class_306 var4 = field_634;
               class_306 var5 = field_633;
               int var6 = -418995629 * this.field_632;
               byte[] var8 = var4.method_5381(var6, 0);
               boolean var7;
               if(null == var8) {
                  if(var1 <= 1957213790) {
                     throw new IllegalStateException();
                  }

                  var7 = false;
               } else {
                  class_253.method_4899(var8, (byte)1);
                  var7 = true;
               }

               class_69 var3;
               if(!var7) {
                  if(var1 <= 1957213790) {
                     throw new IllegalStateException();
                  }

                  var3 = null;
               } else {
                  byte[] var9 = var5.method_5381(var6, 0);
                  class_69 var12;
                  if(null == var9) {
                     if(var1 <= 1957213790) {
                        throw new IllegalStateException();
                     }

                     var12 = null;
                  } else {
                     class_69 var10000 = new class_69(var9, class_223.field_2529, class_284.field_3260, class_403.field_4278, class_318.field_3787, class_403.field_4279);
                     class_69 var10 = var10000;
                     class_192.method_3958();
                     var12 = var10;
                  }

                  var3 = var12;
               }

               if(null != var3) {
                  field_629.method_5064(var3, (long)(-418995629 * this.field_632));
               }

               return var3;
            }
         }
      } catch (RuntimeException var11) {
         throw class_223.method_4281(var11);
      }
   }

   // $FF: renamed from: r (int) oh
   public class_67 method_1177(int var1) {
      try {
         if(this.field_636 * 311873853 < 0) {
            return null;
         } else {
            class_67 var2 = (class_67)field_628.method_5065((long)(311873853 * this.field_636));
            if(null != var2) {
               if(var1 <= 1674746404) {
                  throw new IllegalStateException();
               } else {
                  return var2;
               }
            } else {
               var2 = ClientOpcode.method_5032(field_634, 311873853 * this.field_636, 0, (byte)77);
               if(null != var2) {
                  field_628.method_5064(var2, (long)(311873853 * this.field_636));
               }

               return var2;
            }
         }
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: <init> () void
   class_76() {
      super();
      try {
         this.field_632 = -1829892571;
         this.field_645 = -753330419;
         this.field_631 = -96139554;
         this.field_635 = -1262721335;
         this.field_636 = 1629123051;
         this.field_637 = 1289208417;
         this.field_638 = -2059444655;
         this.field_639 = 0;
         this.field_640 = 0;
         this.field_649 = 1733771819;
         this.field_642 = "";
         this.field_643 = -367701549;
         this.field_644 = 0;
         this.field_630 = 1059629955;
         this.field_647 = -1847840427;
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1);
      }
   }

   // $FF: renamed from: <clinit> () void
   static {
      class_272 var10000 = new class_272(64);
      field_627 = var10000;
      var10000 = new class_272(64);
      field_628 = var10000;
      var10000 = new class_272(20);
      field_629 = var10000;
   }

   // $FF: renamed from: if (ce, int, int, int, int) void
   static final void method_1183(class_100 var0, int var1, int var2, int var3, int var4) {
      try {
         if(var0 == class_164.field_2044) {
            if(var4 == '\uffff') {
               ;
            }
         } else if(673512273 * client.field_1554 >= 400) {
            if(var4 == '\uffff') {
               ;
            }
         } else {
            String var5;
            int var8;
            if(0 == 1658362291 * var0.field_1165) {
               if(var4 != '\uffff') {
                  throw new IllegalStateException();
               }

               String var6 = var0.field_1146[0] + var0.field_1148 + var0.field_1146[1];
               var8 = -1947441591 * var0.field_1147;
               int var9 = -1947441591 * class_164.field_2044.field_1147;
               int var10 = var9 - var8;
               String var7;
               if(var10 < -9) {
                  if(var4 != '\uffff') {
                     return;
                  }

                  var7 = class_136.method_2958(16711680);
               } else if(var10 < -6) {
                  if(var4 != '\uffff') {
                     return;
                  }

                  var7 = class_136.method_2958(16723968);
               } else if(var10 < -3) {
                  if(var4 != '\uffff') {
                     return;
                  }

                  var7 = class_136.method_2958(16740352);
               } else if(var10 < 0) {
                  if(var4 != '\uffff') {
                     throw new IllegalStateException();
                  }

                  var7 = class_136.method_2958(16756736);
               } else if(var10 > 9) {
                  var7 = class_136.method_2958('\uff00');
               } else if(var10 > 6) {
                  if(var4 != '\uffff') {
                     throw new IllegalStateException();
                  }

                  var7 = class_136.method_2958(4259584);
               } else if(var10 > 3) {
                  if(var4 != '\uffff') {
                     return;
                  }

                  var7 = class_136.method_2958(8453888);
               } else if(var10 > 0) {
                  if(var4 != '\uffff') {
                     return;
                  }

                  var7 = class_136.method_2958(12648192);
               } else {
                  var7 = class_136.method_2958(16776960);
               }

               var5 = var6 + var7 + " " + class_205.field_2395 + class_305.field_3562 + -1947441591 * var0.field_1147 + class_205.field_2396 + var0.field_1146[2];
            } else {
               var5 = var0.field_1146[0] + var0.field_1148 + var0.field_1146[1] + " " + class_205.field_2395 + class_305.field_3563 + var0.field_1165 * 1658362291 + class_205.field_2396 + var0.field_1146[2];
            }

            int var12;
            if(-438265211 * client.field_1570 == 1) {
               if(var4 != '\uffff') {
                  throw new IllegalStateException();
               }

               class_247.method_4712(class_305.field_3556, client.field_1571 + " " + class_205.field_2397 + " " + class_136.method_2958(16777215) + var5, 14, var1, var2, var3);
            } else if(client.field_1572) {
               if(var4 != '\uffff') {
                  throw new IllegalStateException();
               }

               if(8 == (-2110888403 * class_117.field_1305 & 8)) {
                  if(var4 != '\uffff') {
                     throw new IllegalStateException();
                  }

                  class_247.method_4712(client.field_1575, client.field_1545 + " " + class_205.field_2397 + " " + class_136.method_2958(16777215) + var5, 15, var1, var2, var3);
               }
            } else {
               for(var12 = 7; var12 >= 0; --var12) {
                  if(client.field_1541[var12] != null) {
                     short var14 = 0;
                     if(client.field_1541[var12].equalsIgnoreCase(class_305.field_3552)) {
                        label229: {
                           if(var4 != '\uffff') {
                              throw new IllegalStateException();
                           }

                           if(class_196.field_2327 == client.field_1442) {
                              if(var4 != '\uffff') {
                                 return;
                              }
                              continue;
                           }

                           label205: {
                              if(client.field_1442 != class_196.field_2326) {
                                 if(var4 != '\uffff') {
                                    throw new IllegalStateException();
                                 }

                                 if(client.field_1442 != class_196.field_2330) {
                                    break label205;
                                 }

                                 if(var4 != '\uffff') {
                                    throw new IllegalStateException();
                                 }

                                 if(var0.field_1147 * -1947441591 <= -1947441591 * class_164.field_2044.field_1147) {
                                    break label205;
                                 }

                                 if(var4 != '\uffff') {
                                    throw new IllegalStateException();
                                 }
                              }

                              var14 = 2000;
                           }

                           if(1597353853 * class_164.field_2044.field_1161 != 0) {
                              if(var4 != '\uffff') {
                                 throw new IllegalStateException();
                              }

                              if(0 != 1597353853 * var0.field_1161) {
                                 if(var4 != '\uffff') {
                                    return;
                                 }

                                 if(1597353853 * class_164.field_2044.field_1161 == 1597353853 * var0.field_1161) {
                                    if(var4 != '\uffff') {
                                       throw new IllegalStateException();
                                    }

                                    var14 = 2000;
                                 } else {
                                    var14 = 0;
                                 }
                                 break label229;
                              }
                           }

                           if(var0.method_1843(1582712756)) {
                              if(var4 != '\uffff') {
                                 return;
                              }

                              var14 = 2000;
                           }
                        }
                     } else if(client.field_1447[var12]) {
                        var14 = 2000;
                     }

                     boolean var13 = false;
                     var8 = var14 + client.field_1540[var12];
                     class_247.method_4712(client.field_1541[var12], class_136.method_2958(16777215) + var5, var8, var1, var2, var3);
                  }
               }
            }

            for(var12 = 0; var12 < client.field_1554 * 673512273; ++var12) {
               if(var4 != '\uffff') {
                  return;
               }

               if(client.field_1557[var12] == 23) {
                  if(var4 != '\uffff') {
                     throw new IllegalStateException();
                  }

                  client.field_1560[var12] = class_136.method_2958(16777215) + var5;
                  break;
               }
            }

         }
      } catch (RuntimeException var11) {
         throw class_223.method_4281(var11);
      }
   }

   // $FF: renamed from: d (byte) oh
   public class_67 method_1192(byte var1) {
      try {
         if(this.field_638 * -1479453361 < 0) {
            if(var1 != -1) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            class_67 var2 = (class_67)field_628.method_5065((long)(-1479453361 * this.field_638));
            if(var2 != null) {
               return var2;
            } else {
               var2 = ClientOpcode.method_5032(field_634, this.field_638 * -1479453361, 0, (byte)16);
               if(null != var2) {
                  if(var1 != -1) {
                     throw new IllegalStateException();
                  }

                  field_628.method_5064(var2, (long)(this.field_638 * -1479453361));
               }

               return var2;
            }
         }
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: lk (io, int) boolean
   static boolean method_1197(class_37 var0) {
      try {
         return var0.field_121;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: b (int) oh
   public class_67 method_1198(int var1) {
      try {
         if(this.field_637 * 592944735 < 0) {
            if(var1 >= -1847010407) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            class_67 var2 = (class_67)field_628.method_5065((long)(this.field_637 * 592944735));
            if(null != var2) {
               if(var1 >= -1847010407) {
                  throw new IllegalStateException();
               } else {
                  return var2;
               }
            } else {
               var2 = ClientOpcode.method_5032(field_634, this.field_637 * 592944735, 0, (byte)14);
               if(null != var2) {
                  field_628.method_5064(var2, (long)(592944735 * this.field_637));
               }

               return var2;
            }
         }
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }
}
