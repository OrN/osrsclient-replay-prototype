import java.util.zip.CRC32;

// $FF: renamed from: jp
public class class_307 extends class_306 {

   // $FF: renamed from: l int
   int field_3722;
   // $FF: renamed from: bp int
   static final int field_3723 = 74;
   // $FF: renamed from: f lh
   class_350 field_3724;
   // $FF: renamed from: y lh
   class_350 field_3725;
   // $FF: renamed from: p int
   int field_3726;
   // $FF: renamed from: j boolean
   volatile boolean field_3727;
   // $FF: renamed from: r boolean
   boolean field_3728;
   // $FF: renamed from: b boolean[]
   volatile boolean[] field_3729;
   // $FF: renamed from: d java.util.zip.CRC32
   static CRC32 field_3730;
   // $FF: renamed from: n int
   public static final int field_3731 = 200;
   // $FF: renamed from: u int
   int field_3732;
   // $FF: renamed from: s int
   int field_3733;
   // $FF: renamed from: v int
   public static final int field_3734 = 200;


   // $FF: renamed from: ab (lh, int, byte[], boolean) void
   public void method_5486(class_350 var1, int var2, byte[] var3, boolean var4) {
      int var5;
      if(this.field_3725 == var1) {
         if(this.field_3727) {
            throw new RuntimeException();
         }

         if(var3 == null) {
            class_278.method_5146(this, 255, 1695957245 * this.field_3726, -1472783963 * this.field_3733, (byte)0, true, (byte)-23);
            return;
         }

         field_3730.reset();
         field_3730.update(var3, 0, var3.length);
         var5 = (int)field_3730.getValue();
         if(this.field_3733 * -1472783963 != var5) {
            class_278.method_5146(this, 255, this.field_3726 * 1695957245, this.field_3733 * -1472783963, (byte)0, true, (byte)-78);
            return;
         }

         Buffer var10000 = new Buffer(class_186.method_3876(var3, 1448871300));
         Buffer var6 = var10000;
         int var7 = var6.readUnsignedByte();
         if(5 != var7 && 6 != var7) {
            throw new RuntimeException(var7 + "," + 1695957245 * this.field_3726 + "," + var2);
         }

         int var8 = 0;
         if(var7 >= 6) {
            var8 = var6.method_135();
         }

         if(this.field_3732 * -2140198139 != var8) {
            class_278.method_5146(this, 255, 1695957245 * this.field_3726, this.field_3733 * -1472783963, (byte)0, true, (byte)-50);
            return;
         }

         this.method_5379(var3, -1421731657);
         this.method_5495(-2081526070);
      } else {
         if(!var4 && this.field_3722 * 1353605799 == var2) {
            this.field_3727 = true;
         }

         if(var3 == null || var3.length <= 2) {
            this.field_3729[var2] = false;
            if(this.field_3728 || var4) {
               class_278.method_5146(this, this.field_3726 * 1695957245, var2, this.field_3708[var2], (byte)2, var4, (byte)-47);
            }

            return;
         }

         field_3730.reset();
         field_3730.update(var3, 0, var3.length - 2);
         var5 = (int)field_3730.getValue();
         int var9 = (var3[var3.length - 1] & 255) + ((var3[var3.length - 2] & 255) << 8);
         if(var5 != this.field_3708[var2] || var9 != this.field_3707[var2]) {
            this.field_3729[var2] = false;
            if(this.field_3728 || var4) {
               class_278.method_5146(this, 1695957245 * this.field_3726, var2, this.field_3708[var2], (byte)2, var4, (byte)-7);
            }

            return;
         }

         this.field_3729[var2] = true;
         if(var4) {
            this.field_3709[var2] = class_300.method_5357(var3, false, -1343228100);
         }
      }

   }

   // $FF: renamed from: v (int) boolean
   public boolean method_5487() {
      try {
         return this.field_3727;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: n (byte) int
   public int method_5488(byte var1) {
      try {
         if(this.field_3727) {
            if(var1 <= 21) {
               throw new IllegalStateException();
            } else {
               return 100;
            }
         } else if(this.field_3709 != null) {
            if(var1 <= 21) {
               throw new IllegalStateException();
            } else {
               return 99;
            }
         } else {
            int var2 = class_202.method_4072(255, 1695957245 * this.field_3726, (byte)-60);
            if(var2 >= 100) {
               if(var1 <= 21) {
                  throw new IllegalStateException();
               }

               var2 = 99;
            }

            return var2;
         }
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: f (int, byte) void
   void method_5432(int var1) {
      try {
         class_293.method_5304(this.field_3726 * 1695957245, var1, (short)925);
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: y (int, byte) void
   void method_5391(int var1, byte var2) {
      try {
         if(null != this.field_3724) {
            if(var2 != 0) {
               throw new IllegalStateException();
            }

            if(this.field_3729 != null) {
               if(var2 != 0) {
                  throw new IllegalStateException();
               }

               if(this.field_3729[var1]) {
                  if(var2 != 0) {
                     throw new IllegalStateException();
                  }

                  class_350 var3 = this.field_3724;
                  byte[] var5 = null;
                  class_335 var6 = class_297.field_3361;
                  synchronized(class_297.field_3361) {
                     for(class_35 var7 = (class_35)class_297.field_3361.method_5944(); var7 != null; var7 = (class_35)class_297.field_3361.method_5972()) {
                        if(var2 != 0) {
                           throw new IllegalStateException();
                        }

                        if(var7.field_9 == (long)var1) {
                           if(var2 != 0) {
                              throw new IllegalStateException();
                           }

                           if(var3 == var7.field_61) {
                              if(var2 != 0) {
                                 return;
                              }

                              if(-1287454433 * var7.field_65 == 0) {
                                 if(var2 != 0) {
                                    return;
                                 }

                                 var5 = var7.field_62;
                                 break;
                              }
                           }
                        }
                     }
                  }

                  if(null != var5) {
                     this.method_5508(var3, var1, var5, true, (byte)72);
                  } else {
                     byte[] var11 = var3.method_6199(var1, (byte)1);
                     this.method_5508(var3, var1, var11, true, (byte)-25);
                  }

                  return;
               }
            }
         }

         class_278.method_5146(this, 1695957245 * this.field_3726, var1, this.field_3708[var1], (byte)2, true, (byte)-121);
      } catch (RuntimeException var10) {
         throw class_223.method_4281(var10);
      }
   }

   // $FF: renamed from: p (int, int, int) void
   public void method_5489(int var1, int var2, int var3) {
      try {
         this.field_3733 = var1 * -1562761683;
         this.field_3732 = 1274538445 * var2;
         if(null != this.field_3725) {
            if(var3 != -887756709) {
               throw new IllegalStateException();
            }

            int var4 = 1695957245 * this.field_3726;
            class_350 var5 = this.field_3725;
            byte[] var7 = null;
            class_335 var8 = class_297.field_3361;
            synchronized(class_297.field_3361) {
               for(class_35 var9 = (class_35)class_297.field_3361.method_5944(); var9 != null; var9 = (class_35)class_297.field_3361.method_5972()) {
                  if(var3 != -887756709) {
                     throw new IllegalStateException();
                  }

                  if((long)var4 == var9.field_9) {
                     if(var3 != -887756709) {
                        throw new IllegalStateException();
                     }

                     if(var9.field_61 == var5 && 0 == var9.field_65 * -1287454433) {
                        if(var3 != -887756709) {
                           return;
                        }

                        var7 = var9.field_62;
                        break;
                     }
                  }
               }
            }

            if(null != var7) {
               if(var3 != -887756709) {
                  throw new IllegalStateException();
               }

               this.method_5508(var5, var4, var7, true, (byte)-59);
            } else {
               byte[] var13 = var5.method_6199(var4, (byte)1);
               this.method_5508(var5, var4, var13, true, (byte)-77);
            }
         } else {
            class_278.method_5146(this, 255, 1695957245 * this.field_3726, this.field_3733 * -1472783963, (byte)0, true, (byte)-42);
         }

      } catch (RuntimeException var12) {
         throw class_223.method_4281(var12);
      }
   }

   // $FF: renamed from: j (int, byte[], boolean, boolean, int) void
   public void method_5490(int var1, byte[] var2, boolean var3, boolean var4, int var5) {
      try {
         class_35 var10000;
         class_297 var10002;
         Thread var24;
         if(var3) {
            if(var5 == 371866635) {
               return;
            }

            if(this.field_3727) {
               if(var5 == 371866635) {
                  throw new IllegalStateException();
               }

               throw new RuntimeException();
            }

            if(null != this.field_3725) {
               int var6 = 1695957245 * this.field_3726;
               class_350 var7 = this.field_3725;
               var10000 = new class_35();
               class_35 var8 = var10000;
               var8.field_65 = 0;
               var8.field_9 = (long)var6;
               var8.field_62 = var2;
               var8.field_61 = var7;
               class_335 var9 = class_297.field_3361;
               synchronized(class_297.field_3361) {
                  class_297.field_3361.method_5939(var8);
               }

               Object var23 = class_297.field_3357;
               synchronized(class_297.field_3357) {
                  if(0 == 2106150539 * class_297.field_3358) {
                     if(var5 == 371866635) {
                        throw new IllegalStateException();
                     }

                     var10002 = new class_297();
                     var24 = new Thread(var10002);
                     class_297.field_3360 = var24;
                     class_297.field_3360.setDaemon(true);
                     class_297.field_3360.start();
                     class_297.field_3360.setPriority(5);
                  }

                  class_297.field_3358 = -2121242104;
               }
            }

            this.method_5379(var2, 1270638831);
            this.method_5495(-2072207852);
         } else {
            var2[var2.length - 2] = (byte)(this.field_3707[var1] >> 8);
            var2[var2.length - 1] = (byte)this.field_3707[var1];
            if(this.field_3724 != null) {
               if(var5 == 371866635) {
                  throw new IllegalStateException();
               }

               class_350 var19 = this.field_3724;
               var10000 = new class_35();
               class_35 var20 = var10000;
               var20.field_65 = 0;
               var20.field_9 = (long)var1;
               var20.field_62 = var2;
               var20.field_61 = var19;
               class_335 var21 = class_297.field_3361;
               synchronized(class_297.field_3361) {
                  class_297.field_3361.method_5939(var20);
               }

               Object var22 = class_297.field_3357;
               synchronized(class_297.field_3357) {
                  if(0 == 2106150539 * class_297.field_3358) {
                     if(var5 == 371866635) {
                        throw new IllegalStateException();
                     }

                     var10002 = new class_297();
                     var24 = new Thread(var10002);
                     class_297.field_3360 = var24;
                     class_297.field_3360.setDaemon(true);
                     class_297.field_3360.start();
                     class_297.field_3360.setPriority(5);
                  }

                  class_297.field_3358 = -2121242104;
               }

               this.field_3729[var1] = true;
            }

            if(var4) {
               this.field_3709[var1] = class_300.method_5357(var2, false, 2116276574);
            }
         }

      } catch (RuntimeException var18) {
         throw class_223.method_4281(var18);
      }
   }

   // $FF: renamed from: h (int, int) void
   public void method_5491(int var1, int var2) {
      this.field_3733 = var1 * -1562761683;
      this.field_3732 = 1274538445 * var2;
      if(null != this.field_3725) {
         int var3 = 1695957245 * this.field_3726;
         class_350 var4 = this.field_3725;
         byte[] var6 = null;
         class_335 var7 = class_297.field_3361;
         synchronized(class_297.field_3361) {
            class_35 var8 = (class_35)class_297.field_3361.method_5944();

            while(var8 != null) {
               if((long)var3 != var8.field_9 || var8.field_61 != var4 || 0 != var8.field_65 * -1287454433) {
                  var8 = (class_35)class_297.field_3361.method_5972();
               } else {
                  var6 = var8.field_62;
                  break;
               }
            }
         }

         if(null != var6) {
            this.method_5508(var4, var3, var6, true, (byte)21);
         } else {
            byte[] var11 = var4.method_6199(var3, (byte)1);
            this.method_5508(var4, var3, var11, true, (byte)60);
         }
      } else {
         class_278.method_5146(this, 1530063640, 1695957245 * this.field_3726, this.field_3733 * -2094131299, (byte)0, true, (byte)-127);
      }

   }

   // $FF: renamed from: av (int) boolean
   public boolean method_5492(int var1) {
      return this.method_5392(var1, (byte)8) != null;
   }

   // $FF: renamed from: g () boolean
   public boolean method_5493() {
      return this.field_3727;
   }

   // $FF: renamed from: l (int) int
   public int method_5494(int var1) {
      try {
         int var2 = 0;
         int var3 = 0;

         int var4;
         for(var4 = 0; var4 < this.field_3709.length; ++var4) {
            if(var1 != -1371864603) {
               throw new IllegalStateException();
            }

            if(this.field_3710[var4] > 0) {
               if(var1 != -1371864603) {
                  throw new IllegalStateException();
               }

               var2 += 100;
               var3 += this.method_5387(var4, -1767586109);
            }
         }

         if(0 == var2) {
            if(var1 != -1371864603) {
               throw new IllegalStateException();
            } else {
               return 100;
            }
         } else {
            var4 = var3 * 100 / var2;
            return var4;
         }
      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5);
      }
   }

   // $FF: renamed from: b (int) void
   void method_5495(int var1) {
      try {
         this.field_3729 = new boolean[this.field_3709.length];

         int var2;
         for(var2 = 0; var2 < this.field_3729.length; ++var2) {
            if(var1 >= -1975267852) {
               throw new IllegalStateException();
            }

            this.field_3729[var2] = false;
         }

         if(null == this.field_3724) {
            if(var1 >= -1975267852) {
               throw new IllegalStateException();
            } else {
               this.field_3727 = true;
            }
         } else {
            this.field_3722 = -1421157655;

            for(var2 = 0; var2 < this.field_3729.length; ++var2) {
               if(var1 >= -1975267852) {
                  throw new IllegalStateException();
               }

               if(this.field_3710[var2] > 0) {
                  if(var1 >= -1975267852) {
                     throw new IllegalStateException();
                  }

                  class_350 var3 = this.field_3724;
                  class_35 var10000 = new class_35();
                  class_35 var5 = var10000;
                  var5.field_65 = 1686059743;
                  var5.field_9 = (long)var2;
                  var5.field_61 = var3;
                  var5.field_64 = this;
                  class_335 var6 = class_297.field_3361;
                  synchronized(class_297.field_3361) {
                     class_297.field_3361.method_5939(var5);
                  }

                  Object var12 = class_297.field_3357;
                  synchronized(class_297.field_3357) {
                     if(0 == class_297.field_3358 * 2106150539) {
                        if(var1 >= -1975267852) {
                           return;
                        }

                        class_297 var10002 = new class_297();
                        Thread var13 = new Thread(var10002);
                        class_297.field_3360 = var13;
                        class_297.field_3360.setDaemon(true);
                        class_297.field_3360.start();
                        class_297.field_3360.setPriority(5);
                     }

                     class_297.field_3358 = -2121242104;
                  }

                  this.field_3722 = var2 * 1421157655;
               }
            }

            if(this.field_3722 * 1353605799 == -1) {
               if(var1 >= -1975267852) {
                  throw new IllegalStateException();
               }

               this.field_3727 = true;
            }

         }
      } catch (RuntimeException var11) {
         throw class_223.method_4281(var11);
      }
   }

   // $FF: renamed from: m () int
   public int method_5496() {
      if(this.field_3727) {
         return 100;
      } else if(this.field_3709 != null) {
         return 99;
      } else {
         int var1 = class_202.method_4072(255, 1695957245 * this.field_3726, (byte)-25);
         if(var1 >= 100) {
            var1 = 99;
         }

         return var1;
      }
   }

   // $FF: renamed from: <clinit> () void
   static {
      field_3730 = new CRC32();
   }

   // $FF: renamed from: o () boolean
   public boolean method_5497() {
      return this.field_3727;
   }

   // $FF: renamed from: c () boolean
   public boolean method_5498() {
      return this.field_3727;
   }

   // $FF: renamed from: e () boolean
   public boolean method_5499() {
      return this.field_3727;
   }

   // $FF: renamed from: s (int, int) boolean
   public boolean method_5500(int var1) {
      try {
         return this.field_3729[var1];
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: q (int, byte[], boolean, boolean) void
   public void method_5501(int var1, byte[] var2, boolean var3, boolean var4) {
      class_35 var10000;
      class_297 var10002;
      Thread var22;
      if(var3) {
         if(this.field_3727) {
            throw new RuntimeException();
         }

         if(null != this.field_3725) {
            int var5 = 1695957245 * this.field_3726;
            class_350 var6 = this.field_3725;
            var10000 = new class_35();
            class_35 var7 = var10000;
            var7.field_65 = 0;
            var7.field_9 = (long)var5;
            var7.field_62 = var2;
            var7.field_61 = var6;
            class_335 var8 = class_297.field_3361;
            synchronized(class_297.field_3361) {
               class_297.field_3361.method_5939(var7);
            }

            Object var21 = class_297.field_3357;
            synchronized(class_297.field_3357) {
               if(0 == 2106150539 * class_297.field_3358) {
                  var10002 = new class_297();
                  var22 = new Thread(var10002);
                  class_297.field_3360 = var22;
                  class_297.field_3360.setDaemon(true);
                  class_297.field_3360.start();
                  class_297.field_3360.setPriority(5);
               }

               class_297.field_3358 = -2121242104;
            }
         }

         this.method_5379(var2, -590773715);
         this.method_5495(-2012203392);
      } else {
         var2[var2.length - 2] = (byte)(this.field_3707[var1] >> 8);
         var2[var2.length - 1] = (byte)this.field_3707[var1];
         if(this.field_3724 != null) {
            class_350 var17 = this.field_3724;
            var10000 = new class_35();
            class_35 var18 = var10000;
            var18.field_65 = 0;
            var18.field_9 = (long)var1;
            var18.field_62 = var2;
            var18.field_61 = var17;
            class_335 var19 = class_297.field_3361;
            synchronized(class_297.field_3361) {
               class_297.field_3361.method_5939(var18);
            }

            Object var20 = class_297.field_3357;
            synchronized(class_297.field_3357) {
               if(0 == 2106150539 * class_297.field_3358) {
                  var10002 = new class_297();
                  var22 = new Thread(var10002);
                  class_297.field_3360 = var22;
                  class_297.field_3360.setDaemon(true);
                  class_297.field_3360.start();
                  class_297.field_3360.setPriority(5);
               }

               class_297.field_3358 = 973651184;
            }

            this.field_3729[var1] = true;
         }

         if(var4) {
            this.field_3709[var1] = class_300.method_5357(var2, false, -142202133);
         }
      }

   }

   // $FF: renamed from: k () int
   public int method_5502() {
      if(this.field_3727) {
         return 127306843;
      } else if(this.field_3709 != null) {
         return -883994944;
      } else {
         int var1 = class_202.method_4072(915609168, -631699061 * this.field_3726, (byte)-110);
         if(var1 >= 100) {
            var1 = 99;
         }

         return var1;
      }
   }

   // $FF: renamed from: u (int, int) boolean
   public boolean method_5503(int var1, int var2) {
      try {
         boolean var10000;
         if(this.method_5392(var1, (byte)8) != null) {
            if(var2 != -1677083054) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: a () boolean
   public boolean method_5504() {
      return this.field_3727;
   }

   // $FF: renamed from: z (int) void
   void method_5409(int var1) {
      if(null != this.field_3724 && this.field_3729 != null && this.field_3729[var1]) {
         class_350 var2 = this.field_3724;
         byte[] var4 = null;
         class_335 var5 = class_297.field_3361;
         synchronized(class_297.field_3361) {
            class_35 var6 = (class_35)class_297.field_3361.method_5944();

            while(var6 != null) {
               if(var6.field_9 != (long)var1 || var2 != var6.field_61 || -1287454433 * var6.field_65 != 0) {
                  var6 = (class_35)class_297.field_3361.method_5972();
               } else {
                  var4 = var6.field_62;
                  break;
               }
            }
         }

         if(null != var4) {
            this.method_5508(var2, var1, var4, true, (byte)58);
         } else {
            byte[] var9 = var2.method_6199(var1, (byte)1);
            this.method_5508(var2, var1, var9, true, (byte)-52);
         }
      } else {
         class_278.method_5146(this, 1695957245 * this.field_3726, var1, this.field_3708[var1], (byte)2, true, (byte)-39);
      }

   }

   // $FF: renamed from: ax (int) boolean
   public boolean method_5505(int var1) {
      return this.field_3729[var1];
   }

   // $FF: renamed from: t (int, int) void
   public void method_5506(int var1, int var2) {
      this.field_3733 = var1 * -1562761683;
      this.field_3732 = 1274538445 * var2;
      if(null != this.field_3725) {
         int var3 = 1695957245 * this.field_3726;
         class_350 var4 = this.field_3725;
         byte[] var6 = null;
         class_335 var7 = class_297.field_3361;
         synchronized(class_297.field_3361) {
            class_35 var8 = (class_35)class_297.field_3361.method_5944();

            while(var8 != null) {
               if((long)var3 != var8.field_9 || var8.field_61 != var4 || 0 != var8.field_65 * -1287454433) {
                  var8 = (class_35)class_297.field_3361.method_5972();
               } else {
                  var6 = var8.field_62;
                  break;
               }
            }
         }

         if(null != var6) {
            this.method_5508(var4, var3, var6, true, (byte)15);
         } else {
            byte[] var11 = var4.method_6199(var3, (byte)1);
            this.method_5508(var4, var3, var11, true, (byte)-110);
         }
      } else {
         class_278.method_5146(this, 255, 1695957245 * this.field_3726, this.field_3733 * -1472783963, (byte)0, true, (byte)-105);
      }

   }

   // $FF: renamed from: x (int) void
   void method_5408(int var1) {
      class_293.method_5304(this.field_3726 * 1695957245, var1, (short)29924);
   }

   // $FF: renamed from: <init> (lh, lh, int, boolean, boolean, boolean) void
   public class_307(class_350 var1, class_350 var2, int var3, boolean var4, boolean var5, boolean var6) {
      super(var4, var5);
      try {
         this.field_3727 = false;
         this.field_3728 = false;
         this.field_3722 = -1421157655;
         this.field_3724 = var1;
         this.field_3725 = var2;
         this.field_3726 = var3 * 264232021;
         this.field_3728 = var6;
         class_229.method_4359(this, this.field_3726 * 1695957245, -2058248289);
      } catch (RuntimeException var7) {
         throw class_223.method_4281(var7);
      }
   }

   // $FF: renamed from: r (lh, int, byte[], boolean, byte) void
   public void method_5508(class_350 var1, int var2, byte[] var3, boolean var4, byte var5) {
      try {
         int var6;
         if(this.field_3725 == var1) {
            if(var5 == 14) {
               throw new IllegalStateException();
            } else if(this.field_3727) {
               if(var5 == 14) {
                  throw new IllegalStateException();
               } else {
                  throw new RuntimeException();
               }
            } else if(var3 == null) {
               if(var5 == 14) {
                  throw new IllegalStateException();
               } else {
                  class_278.method_5146(this, 255, 1695957245 * this.field_3726, -1472783963 * this.field_3733, (byte)0, true, (byte)-95);
               }
            } else {
               field_3730.reset();
               field_3730.update(var3, 0, var3.length);
               var6 = (int)field_3730.getValue();
               if(this.field_3733 * -1472783963 != var6) {
                  class_278.method_5146(this, 255, this.field_3726 * 1695957245, this.field_3733 * -1472783963, (byte)0, true, (byte)-82);
               } else {
                  Buffer var10000 = new Buffer(class_186.method_3876(var3, 1275679316));
                  Buffer var7 = var10000;
                  int var8 = var7.readUnsignedByte();
                  if(5 != var8) {
                     if(var5 == 14) {
                        throw new IllegalStateException();
                     }

                     if(6 != var8) {
                        if(var5 == 14) {
                           return;
                        }

                        throw new RuntimeException(var8 + "," + 1695957245 * this.field_3726 + "," + var2);
                     }
                  }

                  int var9 = 0;
                  if(var8 >= 6) {
                     if(var5 == 14) {
                        throw new IllegalStateException();
                     }

                     var9 = var7.method_135();
                  }

                  if(this.field_3732 * -2140198139 != var9) {
                     class_278.method_5146(this, 255, 1695957245 * this.field_3726, this.field_3733 * -1472783963, (byte)0, true, (byte)-44);
                  } else {
                     this.method_5379(var3, 994270424);
                     this.method_5495(-2113858228);
                  }
               }
            }
         } else {
            if(!var4) {
               if(var5 == 14) {
                  throw new IllegalStateException();
               }

               if(this.field_3722 * 1353605799 == var2) {
                  if(var5 == 14) {
                     throw new IllegalStateException();
                  }

                  this.field_3727 = true;
               }
            }

            if(var3 != null) {
               if(var5 == 14) {
                  return;
               }

               if(var3.length > 2) {
                  field_3730.reset();
                  field_3730.update(var3, 0, var3.length - 2);
                  var6 = (int)field_3730.getValue();
                  int var11 = (var3[var3.length - 1] & 255) + ((var3[var3.length - 2] & 255) << 8);
                  if(var6 == this.field_3708[var2]) {
                     if(var5 == 14) {
                        throw new IllegalStateException();
                     }

                     if(var11 == this.field_3707[var2]) {
                        this.field_3729[var2] = true;
                        if(var4) {
                           if(var5 == 14) {
                              throw new IllegalStateException();
                           }

                           this.field_3709[var2] = class_300.method_5357(var3, false, -1900092184);
                        }

                        return;
                     }

                     if(var5 == 14) {
                        return;
                     }
                  }

                  this.field_3729[var2] = false;
                  if(!this.field_3728) {
                     if(var5 == 14) {
                        throw new IllegalStateException();
                     }

                     if(!var4) {
                        return;
                     }

                     if(var5 == 14) {
                        throw new IllegalStateException();
                     }
                  }

                  class_278.method_5146(this, 1695957245 * this.field_3726, var2, this.field_3708[var2], (byte)2, var4, (byte)-93);
                  return;
               }

               if(var5 == 14) {
                  throw new IllegalStateException();
               }
            }

            this.field_3729[var2] = false;
            if(!this.field_3728) {
               if(var5 == 14) {
                  return;
               }

               if(!var4) {
                  return;
               }

               if(var5 == 14) {
                  return;
               }
            }

            class_278.method_5146(this, this.field_3726 * 1695957245, var2, this.field_3708[var2], (byte)2, var4, (byte)-113);
         }
      } catch (RuntimeException var10) {
         throw class_223.method_4281(var10);
      }
   }

   // $FF: renamed from: ae (int, byte[], boolean, boolean) void
   public void method_5509(int var1, byte[] var2, boolean var3, boolean var4) {
      class_35 var10000;
      class_297 var10002;
      Thread var22;
      if(var3) {
         if(this.field_3727) {
            throw new RuntimeException();
         }

         if(null != this.field_3725) {
            int var5 = 1695957245 * this.field_3726;
            class_350 var6 = this.field_3725;
            var10000 = new class_35();
            class_35 var7 = var10000;
            var7.field_65 = 0;
            var7.field_9 = (long)var5;
            var7.field_62 = var2;
            var7.field_61 = var6;
            class_335 var8 = class_297.field_3361;
            synchronized(class_297.field_3361) {
               class_297.field_3361.method_5939(var7);
            }

            Object var21 = class_297.field_3357;
            synchronized(class_297.field_3357) {
               if(0 == 1661672415 * class_297.field_3358) {
                  var10002 = new class_297();
                  var22 = new Thread(var10002);
                  class_297.field_3360 = var22;
                  class_297.field_3360.setDaemon(true);
                  class_297.field_3360.start();
                  class_297.field_3360.setPriority(5);
               }

               class_297.field_3358 = 170950056;
            }
         }

         this.method_5379(var2, -1497726860);
         this.method_5495(-2056879154);
      } else {
         var2[var2.length - 2] = (byte)(this.field_3707[var1] >> 8);
         var2[var2.length - 1] = (byte)this.field_3707[var1];
         if(this.field_3724 != null) {
            class_350 var17 = this.field_3724;
            var10000 = new class_35();
            class_35 var18 = var10000;
            var18.field_65 = 0;
            var18.field_9 = (long)var1;
            var18.field_62 = var2;
            var18.field_61 = var17;
            class_335 var19 = class_297.field_3361;
            synchronized(class_297.field_3361) {
               class_297.field_3361.method_5939(var18);
            }

            Object var20 = class_297.field_3357;
            synchronized(class_297.field_3357) {
               if(0 == 735776947 * class_297.field_3358) {
                  var10002 = new class_297();
                  var22 = new Thread(var10002);
                  class_297.field_3360 = var22;
                  class_297.field_3360.setDaemon(true);
                  class_297.field_3360.start();
                  class_297.field_3360.setPriority(5);
               }

               class_297.field_3358 = -2121242104;
            }

            this.field_3729[var1] = true;
         }

         if(var4) {
            this.field_3709[var1] = class_300.method_5357(var2, false, -1091077450);
         }
      }

   }

   // $FF: renamed from: ap (int, byte[], boolean, boolean) void
   public void method_5510(int var1, byte[] var2, boolean var3, boolean var4) {
      class_35 var10000;
      class_297 var10002;
      Thread var22;
      if(var3) {
         if(this.field_3727) {
            throw new RuntimeException();
         }

         if(null != this.field_3725) {
            int var5 = 1695957245 * this.field_3726;
            class_350 var6 = this.field_3725;
            var10000 = new class_35();
            class_35 var7 = var10000;
            var7.field_65 = 0;
            var7.field_9 = (long)var5;
            var7.field_62 = var2;
            var7.field_61 = var6;
            class_335 var8 = class_297.field_3361;
            synchronized(class_297.field_3361) {
               class_297.field_3361.method_5939(var7);
            }

            Object var21 = class_297.field_3357;
            synchronized(class_297.field_3357) {
               if(0 == 2106150539 * class_297.field_3358) {
                  var10002 = new class_297();
                  var22 = new Thread(var10002);
                  class_297.field_3360 = var22;
                  class_297.field_3360.setDaemon(true);
                  class_297.field_3360.start();
                  class_297.field_3360.setPriority(5);
               }

               class_297.field_3358 = -2121242104;
            }
         }

         this.method_5379(var2, 1616809082);
         this.method_5495(-2131401198);
      } else {
         var2[var2.length - 2] = (byte)(this.field_3707[var1] >> 8);
         var2[var2.length - 1] = (byte)this.field_3707[var1];
         if(this.field_3724 != null) {
            class_350 var17 = this.field_3724;
            var10000 = new class_35();
            class_35 var18 = var10000;
            var18.field_65 = 0;
            var18.field_9 = (long)var1;
            var18.field_62 = var2;
            var18.field_61 = var17;
            class_335 var19 = class_297.field_3361;
            synchronized(class_297.field_3361) {
               class_297.field_3361.method_5939(var18);
            }

            Object var20 = class_297.field_3357;
            synchronized(class_297.field_3357) {
               if(0 == 2106150539 * class_297.field_3358) {
                  var10002 = new class_297();
                  var22 = new Thread(var10002);
                  class_297.field_3360 = var22;
                  class_297.field_3360.setDaemon(true);
                  class_297.field_3360.start();
                  class_297.field_3360.setPriority(5);
               }

               class_297.field_3358 = -2121242104;
            }

            this.field_3729[var1] = true;
         }

         if(var4) {
            this.field_3709[var1] = class_300.method_5357(var2, false, 2041538441);
         }
      }

   }

   // $FF: renamed from: ar (int) int
   int method_5480(int var1) {
      return this.field_3709[var1] != null?100:(this.field_3729[var1]?100:class_202.method_4072(this.field_3726 * 1695957245, var1, (byte)-75));
   }

   // $FF: renamed from: al (lh, int, byte[], boolean) void
   public void method_5511(class_350 var1, int var2, byte[] var3, boolean var4) {
      int var5;
      if(this.field_3725 == var1) {
         if(this.field_3727) {
            throw new RuntimeException();
         }

         if(var3 == null) {
            class_278.method_5146(this, -1792820391, 1196046339 * this.field_3726, -1155358263 * this.field_3733, (byte)0, true, (byte)-16);
            return;
         }

         field_3730.reset();
         field_3730.update(var3, 0, var3.length);
         var5 = (int)field_3730.getValue();
         if(this.field_3733 * -1472783963 != var5) {
            class_278.method_5146(this, 255, this.field_3726 * 1695957245, this.field_3733 * -1472783963, (byte)0, true, (byte)-63);
            return;
         }

         Buffer var10000 = new Buffer(class_186.method_3876(var3, 1864120560));
         Buffer var6 = var10000;
         int var7 = var6.readUnsignedByte();
         if(5 != var7 && 6 != var7) {
            throw new RuntimeException(var7 + "," + 1695957245 * this.field_3726 + "," + var2);
         }

         int var8 = 0;
         if(var7 >= 6) {
            var8 = var6.method_135();
         }

         if(this.field_3732 * -2140198139 != var8) {
            class_278.method_5146(this, 255, 1695957245 * this.field_3726, this.field_3733 * -1472783963, (byte)0, true, (byte)-120);
            return;
         }

         this.method_5379(var3, -1173772963);
         this.method_5495(-2103756195);
      } else {
         if(!var4 && this.field_3722 * -2013441598 == var2) {
            this.field_3727 = true;
         }

         if(var3 == null || var3.length <= 2) {
            this.field_3729[var2] = false;
            if(this.field_3728 || var4) {
               class_278.method_5146(this, this.field_3726 * 1695957245, var2, this.field_3708[var2], (byte)2, var4, (byte)-97);
            }

            return;
         }

         field_3730.reset();
         field_3730.update(var3, 0, var3.length - 2);
         var5 = (int)field_3730.getValue();
         int var9 = (var3[var3.length - 1] & 255) + ((var3[var3.length - 2] & 255) << 8);
         if(var5 != this.field_3708[var2] || var9 != this.field_3707[var2]) {
            this.field_3729[var2] = false;
            if(this.field_3728 || var4) {
               class_278.method_5146(this, 122421325 * this.field_3726, var2, this.field_3708[var2], (byte)2, var4, (byte)-97);
            }

            return;
         }

         this.field_3729[var2] = true;
         if(var4) {
            this.field_3709[var2] = class_300.method_5357(var3, false, -869607798);
         }
      }

   }

   // $FF: renamed from: d (int, int) int
   int method_5387(int var1, int var2) {
      try {
         if(this.field_3709[var1] != null) {
            if(var2 != -1767586109) {
               throw new IllegalStateException();
            } else {
               return 100;
            }
         } else {
            return this.field_3729[var1]?100:class_202.method_4072(this.field_3726 * 1695957245, var1, (byte)-96);
         }
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: ai () void
   void method_5512() {
      this.field_3729 = new boolean[this.field_3709.length];

      int var1;
      for(var1 = 0; var1 < this.field_3729.length; ++var1) {
         this.field_3729[var1] = false;
      }

      if(null == this.field_3724) {
         this.field_3727 = true;
      } else {
         this.field_3722 = 1425461459;

         for(var1 = 0; var1 < this.field_3729.length; ++var1) {
            if(this.field_3710[var1] > 0) {
               class_350 var2 = this.field_3724;
               class_35 var10000 = new class_35();
               class_35 var4 = var10000;
               var4.field_65 = 1686059743;
               var4.field_9 = (long)var1;
               var4.field_61 = var2;
               var4.field_64 = this;
               class_335 var5 = class_297.field_3361;
               synchronized(class_297.field_3361) {
                  class_297.field_3361.method_5939(var4);
               }

               Object var10 = class_297.field_3357;
               synchronized(class_297.field_3357) {
                  if(0 == class_297.field_3358 * 2106150539) {
                     class_297 var10002 = new class_297();
                     Thread var11 = new Thread(var10002);
                     class_297.field_3360 = var11;
                     class_297.field_3360.setDaemon(true);
                     class_297.field_3360.start();
                     class_297.field_3360.setPriority(5);
                  }

                  class_297.field_3358 = 1915443843;
               }

               this.field_3722 = var1 * 1421157655;
            }
         }

         if(this.field_3722 * -22079507 == -1) {
            this.field_3727 = true;
         }

      }
   }

   // $FF: renamed from: i (int, byte[], boolean, boolean) void
   public void method_5513(int var1, byte[] var2, boolean var3, boolean var4) {
      class_35 var10000;
      class_297 var10002;
      Thread var22;
      if(var3) {
         if(this.field_3727) {
            throw new RuntimeException();
         }

         if(null != this.field_3725) {
            int var5 = 1695957245 * this.field_3726;
            class_350 var6 = this.field_3725;
            var10000 = new class_35();
            class_35 var7 = var10000;
            var7.field_65 = 0;
            var7.field_9 = (long)var5;
            var7.field_62 = var2;
            var7.field_61 = var6;
            class_335 var8 = class_297.field_3361;
            synchronized(class_297.field_3361) {
               class_297.field_3361.method_5939(var7);
            }

            Object var21 = class_297.field_3357;
            synchronized(class_297.field_3357) {
               if(0 == 2106150539 * class_297.field_3358) {
                  var10002 = new class_297();
                  var22 = new Thread(var10002);
                  class_297.field_3360 = var22;
                  class_297.field_3360.setDaemon(true);
                  class_297.field_3360.start();
                  class_297.field_3360.setPriority(5);
               }

               class_297.field_3358 = -2121242104;
            }
         }

         this.method_5379(var2, 353393820);
         this.method_5495(-2003725869);
      } else {
         var2[var2.length - 2] = (byte)(this.field_3707[var1] >> 8);
         var2[var2.length - 1] = (byte)this.field_3707[var1];
         if(this.field_3724 != null) {
            class_350 var17 = this.field_3724;
            var10000 = new class_35();
            class_35 var18 = var10000;
            var18.field_65 = 0;
            var18.field_9 = (long)var1;
            var18.field_62 = var2;
            var18.field_61 = var17;
            class_335 var19 = class_297.field_3361;
            synchronized(class_297.field_3361) {
               class_297.field_3361.method_5939(var18);
            }

            Object var20 = class_297.field_3357;
            synchronized(class_297.field_3357) {
               if(0 == 2106150539 * class_297.field_3358) {
                  var10002 = new class_297();
                  var22 = new Thread(var10002);
                  class_297.field_3360 = var22;
                  class_297.field_3360.setDaemon(true);
                  class_297.field_3360.start();
                  class_297.field_3360.setPriority(5);
               }

               class_297.field_3358 = -2121242104;
            }

            this.field_3729[var1] = true;
         }

         if(var4) {
            this.field_3709[var1] = class_300.method_5357(var2, false, -1220901725);
         }
      }

   }

   // $FF: renamed from: ag (int) int
   int method_5415(int var1) {
      return this.field_3709[var1] != null?-1701945238:(this.field_3729[var1]?100:class_202.method_4072(this.field_3726 * 1695957245, var1, (byte)-55));
   }

   // $FF: renamed from: ad () void
   void method_5514() {
      this.field_3729 = new boolean[this.field_3709.length];

      int var1;
      for(var1 = 0; var1 < this.field_3729.length; ++var1) {
         this.field_3729[var1] = false;
      }

      if(null == this.field_3724) {
         this.field_3727 = true;
      } else {
         this.field_3722 = -1421157655;

         for(var1 = 0; var1 < this.field_3729.length; ++var1) {
            if(this.field_3710[var1] > 0) {
               class_350 var2 = this.field_3724;
               class_35 var10000 = new class_35();
               class_35 var4 = var10000;
               var4.field_65 = 1686059743;
               var4.field_9 = (long)var1;
               var4.field_61 = var2;
               var4.field_64 = this;
               class_335 var5 = class_297.field_3361;
               synchronized(class_297.field_3361) {
                  class_297.field_3361.method_5939(var4);
               }

               Object var10 = class_297.field_3357;
               synchronized(class_297.field_3357) {
                  if(0 == class_297.field_3358 * 2106150539) {
                     class_297 var10002 = new class_297();
                     Thread var11 = new Thread(var10002);
                     class_297.field_3360 = var11;
                     class_297.field_3360.setDaemon(true);
                     class_297.field_3360.start();
                     class_297.field_3360.setPriority(5);
                  }

                  class_297.field_3358 = -2121242104;
               }

               this.field_3722 = var1 * 1421157655;
            }
         }

         if(this.field_3722 * 1353605799 == -1) {
            this.field_3727 = true;
         }

      }
   }

   // $FF: renamed from: as (int) boolean
   public boolean method_5515(int var1) {
      return this.field_3729[var1];
   }

   // $FF: renamed from: aj (int) boolean
   public boolean method_5516(int var1) {
      return this.field_3729[var1];
   }

   // $FF: renamed from: am (int) boolean
   public boolean method_5517(int var1) {
      return this.field_3729[var1];
   }

   // $FF: renamed from: az (int) boolean
   public boolean method_5518(int var1) {
      return this.method_5392(var1, (byte)8) != null;
   }

   // $FF: renamed from: w (int) void
   void method_5447(int var1) {
      if(null != this.field_3724 && this.field_3729 != null && this.field_3729[var1]) {
         class_350 var2 = this.field_3724;
         byte[] var4 = null;
         class_335 var5 = class_297.field_3361;
         synchronized(class_297.field_3361) {
            class_35 var6 = (class_35)class_297.field_3361.method_5944();

            while(var6 != null) {
               if(var6.field_9 != (long)var1 || var2 != var6.field_61 || 43026946 * var6.field_65 != 0) {
                  var6 = (class_35)class_297.field_3361.method_5972();
               } else {
                  var4 = var6.field_62;
                  break;
               }
            }
         }

         if(null != var4) {
            this.method_5508(var2, var1, var4, true, (byte)2);
         } else {
            byte[] var9 = var2.method_6199(var1, (byte)1);
            this.method_5508(var2, var1, var9, true, (byte)-4);
         }
      } else {
         class_278.method_5146(this, -1146419427 * this.field_3726, var1, this.field_3708[var1], (byte)2, true, (byte)-125);
      }

   }

   // $FF: renamed from: ac (int) boolean
   public boolean method_5519(int var1) {
      return this.method_5392(var1, (byte)8) != null;
   }

   // $FF: renamed from: at (int) boolean
   public boolean method_5520(int var1) {
      return this.method_5392(var1, (byte)8) != null;
   }

   // $FF: renamed from: ah () int
   public int method_5521() {
      int var1 = 0;
      int var2 = 0;

      int var3;
      for(var3 = 0; var3 < this.field_3709.length; ++var3) {
         if(this.field_3710[var3] > 0) {
            var1 += 100;
            var2 += this.method_5387(var3, -1767586109);
         }
      }

      if(0 == var1) {
         return 100;
      } else {
         var3 = var2 * 100 / var1;
         return var3;
      }
   }

   // $FF: renamed from: ao () int
   public int method_5522() {
      int var1 = 0;
      int var2 = 0;

      int var3;
      for(var3 = 0; var3 < this.field_3709.length; ++var3) {
         if(this.field_3710[var3] > 0) {
            var1 += 100;
            var2 += this.method_5387(var3, -1767586109);
         }
      }

      if(0 == var1) {
         return 100;
      } else {
         var3 = var2 * 100 / var1;
         return var3;
      }
   }
}
