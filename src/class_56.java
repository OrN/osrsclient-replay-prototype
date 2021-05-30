
// $FF: renamed from: b
public class class_56 extends class_51 {

   // $FF: renamed from: v java.lang.String
   String field_417;
   // $FF: renamed from: n byte
   byte field_418;
   // $FF: renamed from: f byte
   byte field_419;
   // $FF: synthetic field
   final class_180 this$0;
   // $FF: renamed from: ah int
   static final int field_420 = 52;
   // $FF: renamed from: cv int
   static final int field_421 = 101;
   // $FF: renamed from: m int
   static final int field_422 = 0;


   // $FF: renamed from: id (byte) void
   static void method_588(byte var0) {
      try {
         for(int var1 = 0; var1 < client.field_1554 * 673512273; ++var1) {
            if(var0 >= 8) {
               throw new IllegalStateException();
            }

            boolean var10000;
            label78: {
               int var3 = client.field_1557[var1];
               if(57 != var3 && 58 != var3 && 1007 != var3) {
                  if(var0 >= 8) {
                     throw new IllegalStateException();
                  }

                  if(var3 != 25) {
                     if(var0 >= 8) {
                        throw new IllegalStateException();
                     }

                     if(30 != var3) {
                        var10000 = false;
                        break label78;
                     }

                     if(var0 >= 8) {
                        throw new IllegalStateException();
                     }
                  }
               }

               var10000 = true;
            }

            boolean var2 = var10000;
            if(var2) {
               if(var0 >= 8) {
                  return;
               }

               if(var1 < 673512273 * client.field_1554 - 1) {
                  if(var0 >= 8) {
                     throw new IllegalStateException();
                  }

                  for(int var4 = var1; var4 < 673512273 * client.field_1554 - 1; ++var4) {
                     if(var0 >= 8) {
                        throw new IllegalStateException();
                     }

                     client.field_1631[var4] = client.field_1631[1 + var4];
                     client.field_1560[var4] = client.field_1560[var4 + 1];
                     client.field_1557[var4] = client.field_1557[var4 + 1];
                     client.field_1558[var4] = client.field_1558[1 + var4];
                     client.field_1555[var4] = client.field_1555[1 + var4];
                     client.field_1610[var4] = client.field_1610[var4 + 1];
                     client.field_1492[var4] = client.field_1492[1 + var4];
                  }
               }

               --var1;
               client.field_1554 -= -135189071;
            }
         }

         class_122.method_2274((short)-5074);
      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5, "b.id(" + ')');
      }
   }

   // $FF: renamed from: fq (byte) void
   static final void method_589(byte var0) {
      try {
         client.field_1463.method_4098((byte)-96);
         class_82.field_757.method_5074();
         class_298.method_5343((byte)54);
         class_211.method_4175(660073374);
         class_176.method_3746(-355325275);
         class_88.field_884.method_5074();
         class_88.field_876.method_5074();
         class_241.method_4648(1201682368);
         class_172.method_3706((byte)61);
         class_78.field_671.method_5074();
         class_78.field_672.method_5074();
         class_46.method_535((short)-1591);
         class_74.field_593.method_5074();
         class_151.field_1912.method_4963(-174176415);
         class_255.field_2887.method_4963(-174176415);
         class_186.method_3865(1210061532);
         class_145.method_3104(-1154026076);
         class_85.field_787.method_5074();
         class_210.method_4170(383441651);
         class_75.field_598.method_5074();
         class_175.method_3742(1145228216);
         class_37.field_224.method_5074();
         class_37.field_189.method_5074();
         class_37.field_158.method_5074();
         class_37.field_98.method_5074();
         ((class_245)class_70.field_555).method_4703((short)128);
         class_90.field_901.method_5074();
         class_314.field_3783.method_5450((byte)94);
         class_125.field_1360.method_5450((byte)36);
         class_44.field_326.method_5450((byte)81);
         class_137.field_1762.method_5450((byte)70);
         class_286.field_3275.method_5450((byte)93);
         class_194.field_2307.method_5450((byte)102);
         class_148.field_1871.method_5450((byte)95);
         class_311.field_3749.method_5450((byte)127);
         class_240.field_2680.method_5450((byte)93);
         class_157.field_1956.method_5450((byte)112);
         class_221.field_2516.method_5450((byte)120);
         class_189.field_2275.method_5450((byte)50);
         class_206.field_2401.method_4723();

         for(int var1 = 0; var1 < 4; ++var1) {
            if(var0 == 0) {
               throw new IllegalStateException();
            }

            client.field_1475[var1].method_4609(2064042471);
         }

         System.gc();
         class_215.method_4193(2, 1917234733);
         client.field_1656 = 600017041;
         client.field_1657 = false;
         class_217.method_4202(1365123489);
         class_53.method_579(10, (byte)0);
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "b.fq(" + ')');
      }
   }

   // $FF: renamed from: v (nd, int) void
   void method_571(class_28 var1, int var2) {
      try {
         this.field_417 = var1.method_347(-1742345132);
         if(null != this.field_417) {
            if(var2 >= 778749602) {
               throw new IllegalStateException();
            }

            var1.method_130(1451994);
            this.field_418 = var1.method_131((byte)-119);
            this.field_419 = var1.method_131((byte)-74);
         }

      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3, "b.v(" + ')');
      }
   }

   // $FF: renamed from: f (nd) void
   void method_570(class_28 var1) {
      this.field_417 = var1.method_347(-518173250);
      if(null != this.field_417) {
         var1.method_130(-301974227);
         this.field_418 = var1.method_131((byte)7);
         this.field_419 = var1.method_131((byte)-60);
      }

   }

   // $FF: renamed from: y (y) void
   void method_568(class_44 var1) {
      var1.field_321 = this.field_417;
      if(this.field_417 != null) {
         var1.field_322 = this.field_418;
         var1.field_316 = this.field_419;
      }

   }

   // $FF: renamed from: n (y, int) void
   void method_569(class_44 var1, int var2) {
      try {
         var1.field_321 = this.field_417;
         if(this.field_417 != null) {
            if(var2 == -1890140890) {
               throw new IllegalStateException();
            }

            var1.field_322 = this.field_418;
            var1.field_316 = this.field_419;
         }

      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3, "b.n(" + ')');
      }
   }

   // $FF: renamed from: ag (int, cf, boolean, int) int
   static int method_590(int var0, class_90 var1, boolean var2, int var3) {
      try {
         if(5306 == var0) {
            if(var3 <= -1780215685) {
               throw new IllegalStateException();
            } else {
               class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = class_78.method_1223(702215999);
               return 1;
            }
         } else {
            int var4;
            if(var0 == 5307) {
               if(var3 <= -1780215685) {
                  throw new IllegalStateException();
               } else {
                  var4 = class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885];
                  if(var4 != 1) {
                     if(var3 <= -1780215685) {
                        throw new IllegalStateException();
                     }

                     if(2 != var4) {
                        return 1;
                     }
                  }

                  class_240.method_4645(var4, 1620786784);
                  return 1;
               }
            } else if(var0 == 5308) {
               if(var3 <= -1780215685) {
                  throw new IllegalStateException();
               } else {
                  class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = -660685365 * class_87.field_852.field_2119;
                  return 1;
               }
            } else if(5309 == var0) {
               if(var3 <= -1780215685) {
                  throw new IllegalStateException();
               } else {
                  var4 = class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885];
                  if(1 != var4) {
                     if(var3 <= -1780215685) {
                        throw new IllegalStateException();
                     }

                     if(2 != var4) {
                        return 1;
                     }
                  }

                  class_87.field_852.field_2119 = var4 * 511868899;
                  class_94.method_1771(-411883528);
                  return 1;
               }
            } else if(5310 == var0) {
               class_136.field_1752 -= -1087727229;
               return 1;
            } else if(var0 == 5350) {
               class_165.field_2054 -= -1000716630;
               class_136.field_1752 -= -1087727229;
               return 1;
            } else if(var0 == 5351) {
               if(var3 <= -1780215685) {
                  throw new IllegalStateException();
               } else {
                  class_165.field_2054 -= 1647125333;
                  return 1;
               }
            } else {
               return 2;
            }
         }
      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5, "b.ag(" + ')');
      }
   }

   // $FF: renamed from: <init> (x) void
   void method_591(class_180 var1) {
      try {
         this.this$0 = var1;
         super.method_105();
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "b.<init>(" + ')');
      }
   }

   // $FF: renamed from: fk (cy, int, int) void
   static final void method_592(class_98 var0, int var1, int var2) {
      try {
         if(-611848265 * var0.field_1105 >= -1702273423 * client.field_1425) {
            if(var2 == 758766436) {
               return;
            }

            int var3 = Math.max(1, -611848265 * var0.field_1105 - -1702273423 * client.field_1425);
            int var4 = -662659008 * var0.field_1079 + var0.field_1118 * 2131008128;
            int var5 = var0.field_1120 * -1796230784 + -662659008 * var0.field_1079;
            var0.field_1077 += (var4 - -130212619 * var0.field_1077) / var3 * -1369591971;
            var0.field_1076 += (var5 - var0.field_1076 * 1248597615) / var3 * -1747711857;
            var0.field_1134 = 0;
            var0.field_1106 = var0.field_1124 * 50404555;
         } else if(var0.field_1123 * -61946015 >= -1702273423 * client.field_1425) {
            if(var2 == 758766436) {
               throw new IllegalStateException();
            }

            class_167.method_3607(var0, (byte)0);
         } else {
            class_48.method_551(var0, -1452736307);
         }

         label83: {
            if(var0.field_1077 * -130212619 >= 128 && var0.field_1076 * 1248597615 >= 128 && var0.field_1077 * -130212619 < 13184) {
               if(var2 == 758766436) {
                  throw new IllegalStateException();
               }

               if(1248597615 * var0.field_1076 < 13184) {
                  break label83;
               }
            }

            var0.field_1108 = 1152446837;
            var0.field_1113 = -1634941531;
            var0.field_1105 = 0;
            var0.field_1123 = 0;
            var0.field_1077 = 1267070784 * var0.field_1079 + var0.field_1112[0] * 785886848;
            var0.field_1076 = -368818304 * var0.field_1126[0] + var0.field_1079 * 1775993792;
            var0.method_1792(-1557316570);
         }

         if(var0 == class_164.field_2044) {
            label88: {
               if(var2 == 758766436) {
                  throw new IllegalStateException();
               }

               if(-130212619 * var0.field_1077 >= 1536) {
                  if(var2 == 758766436) {
                     throw new IllegalStateException();
                  }

                  if(var0.field_1076 * 1248597615 >= 1536) {
                     if(var2 == 758766436) {
                        throw new IllegalStateException();
                     }

                     if(-130212619 * var0.field_1077 < 11776) {
                        if(var2 == 758766436) {
                           return;
                        }

                        if(1248597615 * var0.field_1076 < 11776) {
                           break label88;
                        }

                        if(var2 == 758766436) {
                           throw new IllegalStateException();
                        }
                     }
                  }
               }

               var0.field_1108 = 1152446837;
               var0.field_1113 = -1634941531;
               var0.field_1105 = 0;
               var0.field_1123 = 0;
               var0.field_1077 = var0.field_1112[0] * 785886848 + 1267070784 * var0.field_1079;
               var0.field_1076 = 1775993792 * var0.field_1079 + -368818304 * var0.field_1126[0];
               var0.method_1792(-1557316570);
            }
         }

         class_305.method_5375(var0, -1661416870);
         class_136.method_2960(var0, 1230539063);
      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6, "b.fk(" + ')');
      }
   }

   // $FF: renamed from: v (int, int, int, int) oh
   static class_67 method_593(int var0, int var1, int var2, int var3) {
      try {
         class_264 var4 = class_233.field_2604;
         long var5 = (long)(var2 << 16 | var0 << 8 | var1);
         return (class_67)var4.method_5002(var5);
      } catch (RuntimeException var7) {
         throw class_223.method_4281(var7, "b.v(" + ')');
      }
   }
}
