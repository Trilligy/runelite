import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fb")
@Implements("Node")
public class Node {
	@ObfuscatedName("cy")
	@Export("key")
	public long key;
	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		signature = "Lfb;"
	)
	@Export("previous")
	public Node previous;
	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		signature = "Lfb;"
	)
	@Export("next")
	public Node next;

	@ObfuscatedName("fm")
	@Export("remove")
	public void remove() {
		if (this.next != null) {
			this.next.previous = this.previous;
			this.previous.next = this.next;
			this.previous = null;
			this.next = null;
		}
	}

	@ObfuscatedName("fx")
	@Export("hasNext")
	public boolean hasNext() {
		return this.next != null;
	}
}
