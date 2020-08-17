package utils

import chisel3._
import freechips.rocketchip.tilelink.{TLBundle, TLBundleA, TLBundleB, TLBundleC, TLBundleD, TLBundleE, TLChannel}

trait HasTLDump {

  implicit class dumpA(a: TLBundleA) {
    def dump =
      printf(
        s"${a.channelName} opcode: %x param: %x size: %x source: %d address: %x mask: %x data: %x corrupt: %b\n",
        a.opcode, a.param, a.size, a.source, a.address, a.mask, a.data, a.corrupt
      )
  }

  implicit class dumpB(b: TLBundleB) {
    def dump =
      printf(
        s"${b.channelName} opcode: %x param: %x size: %x source: %d address: %x mask: %x data: %x corrupt: %b\n",
        b.opcode, b.param, b.size, b.source, b.address, b.mask, b.data, b.corrupt
      )
  }

  implicit class dumpC(c: TLBundleC) {
    def dump =
      printf(
        s"${c.channelName} opcode: %x param: %x size: %x source: %d address: %x data: %x corrupt: %b\n",
        c.opcode, c.param, c.size, c.source, c.address, c.data, c.corrupt
      )
  }

  implicit class dumpD(d: TLBundleD) {
    def dump =
      printf(
        s"${d.channelName} opcode: %x param: %x size: %x source: %d sink: %d denied: %b data: %x corrupt: %b\n",
        d.opcode, d.param, d.size, d.source, d.sink, d.denied, d.data, d.corrupt
      )
  }

  implicit class dumpE(e: TLBundleE) {
    def dump =
      printf(s"${e.channelName} sink: %d\n", e.sink)
  }
}
