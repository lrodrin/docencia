import matplotlib.pyplot as plt
import networkx as nx

# TODO Compute the shortest-path betweenness centrality for nodes.

G = nx.complete_graph(11)
nx.draw(G)

plt.axis("off")
plt.show()
